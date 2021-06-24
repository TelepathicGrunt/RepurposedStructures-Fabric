package com.telepathicgrunt.repurposedstructures.biomeinjection;

import com.telepathicgrunt.repurposedstructures.RepurposedStructures;
import com.telepathicgrunt.repurposedstructures.modinit.RSConfiguredStructures;
import com.telepathicgrunt.repurposedstructures.modinit.RSStructureTagMap;
import com.telepathicgrunt.repurposedstructures.modinit.RSStructures;
import com.telepathicgrunt.repurposedstructures.utils.BiomeSelection;
import com.telepathicgrunt.repurposedstructures.utils.GeneralUtils;
import net.minecraft.world.biome.Biome.Category;
import net.minecraft.world.biome.BiomeKeys;

public class Shipwrecks {

    public static void addShipwrecks() {

        GeneralUtils.addToBiome("end_shipwreck",
                (context) ->
                        BiomeSelection.isBiomeAllowed(context, RSStructures.END_SHIPWRECK,
                                () -> BiomeSelection.haveCategories(context, Category.THEEND)
                                && !BiomeSelection.isBiome(context, BiomeKeys.THE_END, BiomeKeys.SMALL_END_ISLANDS, BiomeKeys.END_BARRENS))
                        && RepurposedStructures.RSAllConfig.RSShipwrecksConfig.endShipwreckMaxChunkDistance != 10001,
                context -> context.getGenerationSettings().addBuiltInStructure(RSConfiguredStructures.END_SHIPWRECK));


        //Nether based Shipwrecks
        GeneralUtils.addToBiome("crimson_shipwreck",
                (context) ->
                        BiomeSelection.isBiomeAllowed(context, RSStructures.CRIMSON_SHIPWRECK,
                                () -> BiomeSelection.haveCategories(context, Category.NETHER)
                                && BiomeSelection.hasName(context, "crimson", "red_")
                                && BiomeSelection.doesNotHaveStructureType(context, RSStructureTagMap.STRUCTURE_TAGS.NETHER_SHIPWRECK))
                        && RepurposedStructures.RSAllConfig.RSShipwrecksConfig.crimsonShipwreckMaxChunkDistance != 10001,
                context -> context.getGenerationSettings().addBuiltInStructure(RSConfiguredStructures.CRIMSON_SHIPWRECK));

        GeneralUtils.addToBiome("warped_shipwreck",
                (context) ->
                        BiomeSelection.isBiomeAllowed(context, RSStructures.WARPED_SHIPWRECK,
                                () -> BiomeSelection.haveCategories(context, Category.NETHER)
                                && BiomeSelection.hasName(context, "warped", "blue")
                                && BiomeSelection.doesNotHaveStructureType(context, RSStructureTagMap.STRUCTURE_TAGS.NETHER_SHIPWRECK))
                        && RepurposedStructures.RSAllConfig.RSShipwrecksConfig.warpedShipwreckMaxChunkDistance != 10001,
                context -> context.getGenerationSettings().addBuiltInStructure(RSConfiguredStructures.WARPED_SHIPWRECK));

        GeneralUtils.addToBiome("nether_bricks_shipwreck",
                (context) ->
                        BiomeSelection.isBiomeAllowed(context, RSStructures.NETHER_BRICKS_SHIPWRECK,
                                () -> BiomeSelection.haveCategories(context, Category.NETHER)
                                && BiomeSelection.hasName(context, "soul")
                                && !BiomeSelection.hasName(context, "crimson", "red_", "warped", "blue")
                                && BiomeSelection.doesNotHaveStructureType(context, RSStructureTagMap.STRUCTURE_TAGS.NETHER_SHIPWRECK))
                        && RepurposedStructures.RSAllConfig.RSShipwrecksConfig.netherBricksShipwreckMaxChunkDistance != 10001,
                context -> context.getGenerationSettings().addBuiltInStructure(RSConfiguredStructures.NETHER_BRICKS_SHIPWRECK_FLYING));

        GeneralUtils.addToBiome("nether_bricks_shipwreck_flying",
                (context) ->
                        BiomeSelection.isBiomeAllowed(context, RSStructures.NETHER_BRICKS_SHIPWRECK,
                                () -> BiomeSelection.haveCategories(context, Category.NETHER)
                                && !BiomeSelection.hasName(context, "crimson", "red_", "warped", "blue", "soul")
                                && BiomeSelection.doesNotHaveStructureType(context, RSStructureTagMap.STRUCTURE_TAGS.NETHER_SHIPWRECK))
                && RepurposedStructures.RSAllConfig.RSShipwrecksConfig.netherBricksShipwreckMaxChunkDistance != 10001,
                context -> context.getGenerationSettings().addBuiltInStructure(RSConfiguredStructures.NETHER_BRICKS_SHIPWRECK));

    }
}
