package com.telepathicgrunt.repurposedstructures.world.features;

import com.mojang.serialization.Codec;
import com.telepathicgrunt.repurposedstructures.RepurposedStructures;
import com.telepathicgrunt.repurposedstructures.mixin.structures.TemplateAccessor;
import com.telepathicgrunt.repurposedstructures.utils.GeneralUtils;
import com.telepathicgrunt.repurposedstructures.world.features.configs.NbtDungeonConfig;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.ChestBlock;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SpawnerBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.LootableContainerBlockEntity;
import net.minecraft.block.entity.MobSpawnerBlockEntity;
import net.minecraft.block.enums.ChestType;
import net.minecraft.block.enums.SlabType;
import net.minecraft.entity.EntityType;
import net.minecraft.state.property.Properties;
import net.minecraft.structure.Structure;
import net.minecraft.structure.StructureManager;
import net.minecraft.structure.StructurePlacementData;
import net.minecraft.structure.processor.StructureProcessorList;
import net.minecraft.structure.processor.StructureProcessorLists;
import net.minecraft.tag.BlockTags;
import net.minecraft.tag.FluidTags;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.StructureWorldAccess;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.util.FeatureContext;

import java.util.List;
import java.util.Optional;
import java.util.Random;

public class NbtDungeon extends Feature<NbtDungeonConfig>{

    public NbtDungeon(Codec<NbtDungeonConfig> configFactory) {
        super(configFactory);
    }

    @Override
    public boolean generate(FeatureContext<NbtDungeonConfig> context) {
        if(GeneralUtils.isBlacklistedForWorld(context.getWorld(), context.getConfig().cfID)) return false;

        BlockPos position = context.getOrigin().up(-1);
        Identifier nbtRL = GeneralUtils.getRandomEntry(context.getConfig().nbtResourcelocationsAndWeights, context.getRandom());

        StructureManager structureManager = context.getWorld().toServerWorld().getStructureManager();
        Structure template = structureManager.getStructureOrBlank(nbtRL);
        if(template == null){
            RepurposedStructures.LOGGER.error("Identifier to the specified nbt file was not found! : {}", nbtRL);
            return false;
        }
        BlockRotation rotation = BlockRotation.random(context.getRandom());
        BlockPos size = new BlockPos(template.getSize());

        // For proper offsetting the dungeon so it rotate properly around position parameter.
        BlockPos halfLengths = new BlockPos(
                size.getX() / 2,
                size.getY() / 2,
                size.getZ() / 2);

        // Rotated blockpos for the nbt's sizes to be used later.
        BlockPos fullLengths = new BlockPos(
                Math.abs(size.rotate(rotation).getX()),
                Math.abs(size.rotate(rotation).getY()),
                Math.abs(size.rotate(rotation).getZ()));

        // For post processing spawners and chests for rotated dungeon.
        BlockPos halfLengthsRotated = new BlockPos(
                fullLengths.getX() / 2,
                fullLengths.getY() / 2,
                fullLengths.getZ() / 2);

        BlockPos.Mutable mutable = new BlockPos.Mutable().set(position);
        Chunk cachedChunk = context.getWorld().getChunk(mutable);

        int xMin = -halfLengthsRotated.getX();
        int xMax = halfLengthsRotated.getX();
        int zMin = -halfLengthsRotated.getZ();
        int zMax = halfLengthsRotated.getZ();
        int wallOpenings = 0;
        int ceilingOpenings = 0;
        int ceiling = size.getY();

        for (int x = xMin; x <= xMax; x++) {
            for (int z = zMin; z <= zMax; z++) {
                for (int y = 0; y <= ceiling; y++) {
                    mutable.set(position).move(x, y, z);
                    if(mutable.getX() >> 4 != cachedChunk.getPos().x || mutable.getZ() >> 4 != cachedChunk.getPos().z)
                        cachedChunk = context.getWorld().getChunk(mutable);

                    BlockState state = cachedChunk.getBlockState(mutable);

                    // Dungeons cannot touch fluids if set to air mode and reverse if opposite
                    if(context.getConfig().airRequirementIsNowWater ?
                            state.isAir() || state.getFluidState().isIn(FluidTags.LAVA) :
                            !state.getFluidState().isEmpty()){
                        return false;
                    }
                    // Floor must be complete
                    else if(!GeneralUtils.isFullCube(context.getWorld(), mutable, state)){
                        if (y == 0 && !state.getMaterial().isSolid()) {
                            return false;
                        }
                        else if(state.isIn(BlockTags.LEAVES)){
                            continue; // ignore leaves
                        }
                        else if (y == ceiling) {
                            ceilingOpenings++;
                        }
                    }

                    // Check only along wall bottoms for openings
                    if ((x == xMin || x == xMax || z == zMin || z == zMax) && y == 1 && isValidNonSolidBlock(context.getConfig(), state))
                    {
                        BlockState aboveState = cachedChunk.getBlockState(mutable);
                        if(context.getConfig().airRequirementIsNowWater ?
                            !aboveState.getFluidState().isEmpty() :
                            aboveState.isAir())
                        {
                            wallOpenings++;
                        }
                    }

                    // Too much open space. Quit
                    if(wallOpenings > context.getConfig().maxAirSpace || ceilingOpenings > context.getConfig().maxAirSpace){
                        return false;
                    }
                }
            }
        }

        // Check if we meet minimum for open space.
        if (wallOpenings >= context.getConfig().minAirSpace) {

            // offset the dungeon such as ocean dungeons down 1
            position = position.up(context.getConfig().structureYOffset);

            //RepurposedStructures.LOGGER.log(Level.INFO, nbtRL + " at X: "+position.getX() +", "+position.getY()+", "+position.getZ());
            StructurePlacementData placementsettings = (new StructurePlacementData()).setRotation(rotation).setPosition(halfLengths).setIgnoreEntities(false);
            Optional<StructureProcessorList> processor = context.getWorld().toServerWorld().getServer().getRegistryManager().get(Registry.STRUCTURE_PROCESSOR_LIST_KEY).getOrEmpty(context.getConfig().processor);
            processor.orElse(StructureProcessorLists.EMPTY).getList().forEach(placementsettings::addProcessor); // add all processors
            BlockPos finalPos = mutable.set(position).move(-halfLengths.getX(), 0, -halfLengths.getZ());
            template.place(context.getWorld(), finalPos, finalPos, placementsettings, context.getRandom(), Block.NO_REDRAW);

            // Post-processors
            // For all processors that are sensitive to neighboring blocks such as vines.
            // Post processors will place the blocks themselves so we will not do anything with the return of Structure.process
            placementsettings.clearProcessors();
            Optional<StructureProcessorList> postProcessor = context.getWorld().toServerWorld().getServer().getRegistryManager().get(Registry.STRUCTURE_PROCESSOR_LIST_KEY).getOrEmpty(context.getConfig().postProcessor);
            postProcessor.orElse(StructureProcessorLists.EMPTY).getList().forEach(placementsettings::addProcessor); // add all post processors
            List<Structure.StructureBlockInfo> list = placementsettings.getRandomBlockInfos(((TemplateAccessor)template).repurposedstructures_getBlocks(), mutable).getAll();
            Structure.process(context.getWorld(), mutable, mutable, placementsettings, list);

            spawnLootBlocks(context.getWorld(), context.getRandom(), position, context.getConfig(), fullLengths, halfLengthsRotated, mutable);
            return true;
        }

        return false;
    }

    /**
     * For determining what kind of check to do based on if this dungeon is air or water based.
     */
    private boolean isValidNonSolidBlock(NbtDungeonConfig config, BlockState state){
        if(config.airRequirementIsNowWater){
            return !state.getFluidState().isEmpty();
        }
        return state.isAir();
    }

    /**
     * Makes the given block entity now have the correct spawner mob
     */
    private void SetMobSpawnerEntity(Random random, NbtDungeonConfig config, MobSpawnerBlockEntity blockEntity) {
        EntityType<?> entity = RepurposedStructures.mobSpawnerManager.getSpawnerMob(config.rsSpawnerResourcelocation, random);
        if(entity != null){
            blockEntity.getLogic().setEntityId(entity);
        }
        else{
            RepurposedStructures.LOGGER.warn("EntityType in a dungeon does not exist in registry! : {}", config.rsSpawnerResourcelocation);
        }
    }

    /**
     * Makes the targeted slab block now a full block.
     */
    private void SolidifyBlock(StructureWorldAccess world, BlockPos pos) {
        BlockState blockBelow = world.getBlockState(pos);
        if (blockBelow.contains(SlabBlock.TYPE)) {
            world.setBlockState(pos, blockBelow.with(SlabBlock.TYPE, SlabType.DOUBLE), 3);
        }
    }

    /**
     * Places and connects chests on walls of dungeon space
     */
    private void spawnLootBlocks(StructureWorldAccess world, Random random, BlockPos position, NbtDungeonConfig config, BlockPos fullLengths, BlockPos halfLengths, BlockPos.Mutable mutable) {
        boolean isPlacingChestLikeBlock = config.lootBlock.getBlock() instanceof ChestBlock;

        // Add chests that are wall based
        for(int currentChestAttempt = 0; currentChestAttempt < config.maxNumOfChests;) {
            boolean addedChestThisAttempt = false;
            for (int currentChestPosAttempt = 0; currentChestPosAttempt < fullLengths.getX() + fullLengths.getZ() + halfLengths.getY(); ++currentChestPosAttempt) {

                mutable.set(position).move(
                        random.nextInt(Math.max(fullLengths.getX() - 2, 1)) - halfLengths.getX() + 1,
                        random.nextInt(Math.max(fullLengths.getY() - 1, 1)),
                        random.nextInt(Math.max(fullLengths.getZ() - 2, 1)) - halfLengths.getZ() + 1);

                BlockState currentBlock = world.getBlockState(mutable);
                if (isValidNonSolidBlock(config, currentBlock)) {
                    if(world.getBlockState(mutable.move(Direction.DOWN)).isSideSolidFullSquare(world, mutable, Direction.UP)){
                        mutable.move(Direction.UP);
                        boolean isOnWall = false;

                        for(Direction neighborDirection : Direction.Type.HORIZONTAL){
                            mutable.move(neighborDirection);
                            BlockState neighboringState = world.getBlockState(mutable);
                            mutable.move(neighborDirection.getOpposite());

                            if(isPlacingChestLikeBlock && neighboringState.getBlock() instanceof ChestBlock){
                                // Only connect to single chests
                                if(neighboringState.get(ChestBlock.CHEST_TYPE) == ChestType.SINGLE){

                                    BlockState currentStateForChest = GeneralUtils.orientateChest(world, mutable, config.lootBlock);
                                    Direction currentDirection = currentStateForChest.get(HorizontalFacingBlock.FACING);

                                    // If oriented is on same axis as neighboring chest, find a new direction on sides.
                                    if(neighborDirection.getAxis() == currentDirection.getAxis()){
                                        currentDirection = currentDirection.rotateYClockwise();
                                        BlockPos wallCheckPos = mutable.offset(currentDirection);
                                        BlockPos wallCheckPos2 = wallCheckPos.offset(neighborDirection);
                                        BlockState blockState = world.getBlockState(wallCheckPos);
                                        BlockState blockState2 = world.getBlockState(wallCheckPos2);

                                        // If first side is solid wall we are facing or neighbor is facing, switch to other side
                                        if((blockState.getMaterial().isSolid() && !(blockState.getBlock() instanceof SpawnerBlock)) ||
                                                (blockState2.getMaterial().isSolid() && !(blockState2.getBlock() instanceof SpawnerBlock))
                                        ){

                                            currentDirection = currentDirection.getOpposite();
                                        }
                                    }

                                    boolean chestTyping = neighborDirection.getDirection() == currentDirection.getDirection();
                                    if(neighborDirection.getAxis() == Direction.Axis.Z){
                                        chestTyping = !chestTyping;
                                    }

                                    // Place chest
                                    world.setBlockState(mutable,
                                            config.lootBlock
                                                    .with(ChestBlock.WATERLOGGED, currentBlock.getFluidState().isIn(FluidTags.WATER))
                                                    .with(ChestBlock.FACING, currentDirection)
                                                    .with(ChestBlock.CHEST_TYPE, chestTyping ? ChestType.RIGHT : ChestType.LEFT),
                                            2);

                                    // Set neighboring chest to face same way too
                                    world.setBlockState(mutable.move(neighborDirection),
                                            neighboringState
                                                    .with(ChestBlock.FACING, currentDirection)
                                                    .with(ChestBlock.CHEST_TYPE, chestTyping ? ChestType.LEFT : ChestType.RIGHT),
                                            2);

                                    LootableContainerBlockEntity.setLootTable(world, random, mutable, config.chestResourcelocation);
                                    SolidifyBlock(world, mutable.down());

                                    isOnWall = false; // Skip wall code as we already placed chest
                                    currentChestAttempt++;
                                    addedChestThisAttempt = true;
                                    if(currentChestAttempt == config.maxNumOfChests){
                                        return;
                                    }
                                    break;
                                }
                            }
                            else if(GeneralUtils.isFullCube(world, mutable, neighboringState) && !(neighboringState.getBlock() instanceof SpawnerBlock)){
                                isOnWall = true;
                            }
                        }

                        // Is not next to another chest.
                        if(isOnWall){
                            BlockState lootBlock = config.lootBlock;
                            if(lootBlock.contains(Properties.WATERLOGGED)){
                                lootBlock.with(Properties.WATERLOGGED, currentBlock.getFluidState().isIn(FluidTags.WATER));
                            }
                            if(lootBlock.contains(Properties.HORIZONTAL_FACING)){
                                lootBlock = GeneralUtils.orientateChest(world, mutable, lootBlock);
                            }

                            // Set chest to face away from wall.
                            world.setBlockState(mutable, lootBlock, 2);
                            currentChestAttempt++;
                            addedChestThisAttempt = true;

                            LootableContainerBlockEntity.setLootTable(world, random, mutable, config.chestResourcelocation);
                            mutable.move(Direction.DOWN);
                            if(lootBlock.getBlock() == Blocks.SHULKER_BOX){
                                world.setBlockState(mutable, Blocks.SPAWNER.getDefaultState(), 2);
                                BlockEntity blockEntity = world.getBlockEntity(mutable);
                                if (blockEntity instanceof MobSpawnerBlockEntity) {
                                    SetMobSpawnerEntity(random, config, (MobSpawnerBlockEntity) blockEntity);
                                }
                            }
                            else{
                                SolidifyBlock(world, mutable);
                            }

                            break;
                        }
                    }
                }
            }
            if(!addedChestThisAttempt) currentChestAttempt++;
        }
    }
}
