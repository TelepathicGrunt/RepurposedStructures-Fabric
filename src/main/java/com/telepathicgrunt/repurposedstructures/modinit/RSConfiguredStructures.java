package com.telepathicgrunt.repurposedstructures.modinit;

import com.telepathicgrunt.repurposedstructures.RepurposedStructures;
import com.telepathicgrunt.repurposedstructures.world.structures.configs.NetherShipwreckConfig;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.MutableRegistry;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.feature.ConfiguredStructureFeature;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.StructureFeature;


public class RSConfiguredStructures {

    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> BIRCH_MINESHAFT = RSStructures.MINESHAFT_BIRCH.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> DARK_FOREST_MINESHAFT = RSStructures.MINESHAFT_DARK_FOREST.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> DESERT_MINESHAFT = RSStructures.MINESHAFT_DESERT.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> END_MINESHAFT = RSStructures.MINESHAFT_END.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> NETHER_MINESHAFT = RSStructures.MINESHAFT_NETHER.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> CRIMSON_MINESHAFT = RSStructures.MINESHAFT_CRIMSON.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> WARPED_MINESHAFT = RSStructures.MINESHAFT_WARPED.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> ICY_MINESHAFT = RSStructures.MINESHAFT_ICY.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> JUNGLE_MINESHAFT = RSStructures.MINESHAFT_JUNGLE.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> OCEAN_MINESHAFT = RSStructures.MINESHAFT_OCEAN.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> SAVANNA_MINESHAFT = RSStructures.MINESHAFT_SAVANNA.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> STONE_MINESHAFT = RSStructures.MINESHAFT_STONE.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> SWAMP_MINESHAFT = RSStructures.MINESHAFT_SWAMP.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> TAIGA_MINESHAFT = RSStructures.MINESHAFT_TAIGA.configure(FeatureConfig.DEFAULT);

    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> NETHER_STRONGHOLD = RSStructures.STRONGHOLD_NETHER.configure(FeatureConfig.DEFAULT);

    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> JUNGLE_FORTRESS = RSStructures.FORTRESS_JUNGLE.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> GRASSY_IGLOO = RSStructures.IGLOO_GRASSY.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> STONE_IGLOO = RSStructures.IGLOO_STONE.configure(FeatureConfig.DEFAULT);

    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> NETHER_WASTELAND_TEMPLE = RSStructures.TEMPLE_NETHER_WASTELAND.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> NETHER_BASALT_TEMPLE = RSStructures.TEMPLE_NETHER_BASALT.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> NETHER_WARPED_TEMPLE = RSStructures.TEMPLE_NETHER_WARPED.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> NETHER_CRIMSON_TEMPLE = RSStructures.TEMPLE_NETHER_CRIMSON.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> NETHER_SOUL_TEMPLE = RSStructures.TEMPLE_NETHER_SOUL.configure(FeatureConfig.DEFAULT);

    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> NETHER_BRICK_OUTPOST = RSStructures.OUTPOST_NETHER_BRICK.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> WARPED_OUTPOST = RSStructures.OUTPOST_WARPED.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> CRIMSON_OUTPOST = RSStructures.OUTPOST_CRIMSON.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> OUTPOST_BIRCH = RSStructures.OUTPOST_BIRCH.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> OUTPOST_JUNGLE = RSStructures.OUTPOST_JUNGLE.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> OUTPOST_GIANT_TREE_TAIGA = RSStructures.OUTPOST_GIANT_TREE_TAIGA.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> OUTPOST_DESERT = RSStructures.OUTPOST_DESERT.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> OUTPOST_BADLANDS = RSStructures.OUTPOST_BADLANDS.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> OUTPOST_SNOWY = RSStructures.OUTPOST_SNOWY.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> OUTPOST_ICY = RSStructures.OUTPOST_ICY.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> OUTPOST_TAIGA = RSStructures.OUTPOST_TAIGA.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> OUTPOST_OAK = RSStructures.OUTPOST_OAK.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> OUTPOST_END = RSStructures.OUTPOST_END.configure(FeatureConfig.DEFAULT);

    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> NETHER_PYRAMID = RSStructures.PYRAMID_NETHER.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> BADLANDS_PYRAMID = RSStructures.PYRAMID_BADLANDS.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> PYRAMID_END = RSStructures.PYRAMID_END.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> PYRAMID_ICY = RSStructures.PYRAMID_ICY.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> PYRAMID_SNOWY = RSStructures.PYRAMID_SNOWY.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> PYRAMID_JUNGLE = RSStructures.PYRAMID_JUNGLE.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> PYRAMID_MUSHROOM = RSStructures.PYRAMID_MUSHROOM.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> PYRAMID_OCEAN = RSStructures.PYRAMID_OCEAN.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> PYRAMID_GIANT_TREE_TAIGA = RSStructures.PYRAMID_GIANT_TREE_TAIGA.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> PYRAMID_FLOWER_FOREST = RSStructures.PYRAMID_FLOWER_FOREST.configure(FeatureConfig.DEFAULT);

    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> END_SHIPWRECK = RSStructures.SHIPWRECK_END.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<NetherShipwreckConfig, ? extends StructureFeature<NetherShipwreckConfig>> NETHER_BRICKS_SHIPWRECK_FLYING = RSStructures.SHIPWRECK_NETHER_BRICKS.configure(new NetherShipwreckConfig(true));
    public static ConfiguredStructureFeature<NetherShipwreckConfig, ? extends StructureFeature<NetherShipwreckConfig>> NETHER_BRICKS_SHIPWRECK = RSStructures.SHIPWRECK_NETHER_BRICKS.configure(new NetherShipwreckConfig(false));
    public static ConfiguredStructureFeature<NetherShipwreckConfig, ? extends StructureFeature<NetherShipwreckConfig>> CRIMSON_SHIPWRECK = RSStructures.SHIPWRECK_CRIMSON.configure(new NetherShipwreckConfig(false));
    public static ConfiguredStructureFeature<NetherShipwreckConfig, ? extends StructureFeature<NetherShipwreckConfig>> WARPED_SHIPWRECK = RSStructures.SHIPWRECK_WARPED.configure(new NetherShipwreckConfig(false));

    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> BADLANDS_VILLAGE = RSStructures.VILLAGE_BADLANDS.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> BIRCH_VILLAGE = RSStructures.VILLAGE_BIRCH.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> DARK_FOREST_VILLAGE = RSStructures.VILLAGE_DARK_FOREST.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> JUNGLE_VILLAGE = RSStructures.VILLAGE_JUNGLE.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> SWAMP_VILLAGE = RSStructures.VILLAGE_SWAMP.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> MOUNTAINS_VILLAGE = RSStructures.VILLAGE_MOUNTAINS.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> GIANT_TAIGA_VILLAGE = RSStructures.VILLAGE_GIANT_TAIGA.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> CRIMSON_VILLAGE = RSStructures.VILLAGE_CRIMSON.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> WARPED_VILLAGE = RSStructures.VILLAGE_WARPED.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> VILLAGE_OAK = RSStructures.VILLAGE_OAK.configure(FeatureConfig.DEFAULT);

    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> RUINED_PORTAL_END = RSStructures.RUINED_PORTAL_END.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> RUINS_NETHER = RSStructures.RUINS_NETHER.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> RUINS_LAND_WARM = RSStructures.RUINS_LAND_WARM.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> RUINS_LAND_HOT = RSStructures.RUINS_LAND_HOT.configure(FeatureConfig.DEFAULT);
    // regexpos1

    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> CITY_NETHER = RSStructures.CITY_NETHER.configure(FeatureConfig.DEFAULT);

    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> MANSION_BIRCH = RSStructures.MANSION_BIRCH.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> MANSION_JUNGLE = RSStructures.MANSION_JUNGLE.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> MANSION_OAK = RSStructures.MANSION_OAK.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> MANSION_SAVANNA = RSStructures.MANSION_SAVANNA.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> MANSION_TAIGA = RSStructures.MANSION_TAIGA.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> MANSION_DESERT = RSStructures.MANSION_DESERT.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> MANSION_SNOWY = RSStructures.MANSION_SNOWY.configure(FeatureConfig.DEFAULT);

    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> WITCH_HUTS_OAK = RSStructures.WITCH_HUTS_OAK.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> WITCH_HUTS_TAIGA = RSStructures.WITCH_HUTS_TAIGA.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> WITCH_HUTS_BIRCH = RSStructures.WITCH_HUTS_BIRCH.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> WITCH_HUTS_DARK_FOREST = RSStructures.WITCH_HUTS_DARK_FOREST.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> WITCH_HUTS_GIANT_TREE_TAIGA = RSStructures.WITCH_HUTS_GIANT_TREE_TAIGA.configure(FeatureConfig.DEFAULT);

    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> BASTION_UNDERGROUND = RSStructures.BASTION_UNDERGROUND.configure(FeatureConfig.DEFAULT);

    public static void registerConfiguredStructures() {
        MutableRegistry<ConfiguredStructureFeature<?, ?>> registry = (MutableRegistry<ConfiguredStructureFeature<?, ?>>) BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE;

        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "birch_mineshaft"), BIRCH_MINESHAFT);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "dark_forest_mineshaft"), DARK_FOREST_MINESHAFT);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "desert_mineshaft"), DESERT_MINESHAFT);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "end_mineshaft"), END_MINESHAFT);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "nether_mineshaft"), NETHER_MINESHAFT);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "crimson_mineshaft"), CRIMSON_MINESHAFT);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "warped_mineshaft"), WARPED_MINESHAFT);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "icy_mineshaft"), ICY_MINESHAFT);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "jungle_mineshaft"), JUNGLE_MINESHAFT);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "ocean_mineshaft"), OCEAN_MINESHAFT);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "savanna_mineshaft"), SAVANNA_MINESHAFT);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "stone_mineshaft"), STONE_MINESHAFT);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "swamp_mineshaft"), SWAMP_MINESHAFT);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "taiga_mineshaft"), TAIGA_MINESHAFT);

        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "nether_stronghold"), NETHER_STRONGHOLD);

        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "jungle_fortress"), JUNGLE_FORTRESS);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "grassy_igloo"), GRASSY_IGLOO);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "stone_igloo"), STONE_IGLOO);

        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "nether_wasteland_temple"), NETHER_WASTELAND_TEMPLE);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "nether_basalt_temple"), NETHER_BASALT_TEMPLE);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "nether_warped_temple"), NETHER_WARPED_TEMPLE);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "nether_crimson_temple"), NETHER_CRIMSON_TEMPLE);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "nether_soul_temple"), NETHER_SOUL_TEMPLE);

        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "nether_brick_outpost"), NETHER_BRICK_OUTPOST);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "warped_outpost"), WARPED_OUTPOST);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "crimson_outpost"), CRIMSON_OUTPOST);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "outpost_birch"), OUTPOST_BIRCH);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "outpost_jungle"), OUTPOST_JUNGLE);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "outpost_giant_tree_taiga"), OUTPOST_GIANT_TREE_TAIGA);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "outpost_desert"), OUTPOST_DESERT);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "outpost_badlands"), OUTPOST_BADLANDS);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "outpost_snowy"), OUTPOST_SNOWY);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "outpost_icy"), OUTPOST_ICY);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "outpost_taiga"), OUTPOST_TAIGA);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "outpost_oak"), OUTPOST_OAK);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "outpost_end"), OUTPOST_END);

        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "nether_pyramid"), NETHER_PYRAMID);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "badlands_temple"), BADLANDS_PYRAMID);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "pyramid_snowy"), PYRAMID_SNOWY);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "pyramid_end"), PYRAMID_END);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "pyramid_icy"), PYRAMID_ICY);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "pyramid_jungle"), PYRAMID_JUNGLE);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "pyramid_mushroom"), PYRAMID_MUSHROOM);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "pyramid_ocean"), PYRAMID_OCEAN);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "pyramid_giant_tree_taiga"), PYRAMID_GIANT_TREE_TAIGA);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "pyramid_flower_forest"), PYRAMID_FLOWER_FOREST);

        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "end_shipwreck"), END_SHIPWRECK);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "nether_bricks_shipwreck_flying"), NETHER_BRICKS_SHIPWRECK_FLYING);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "nether_bricks_shipwreck"), NETHER_BRICKS_SHIPWRECK);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "crimson_shipwreck"), CRIMSON_SHIPWRECK);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "warped_shipwreck"), WARPED_SHIPWRECK);

        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "badlands_village"), BADLANDS_VILLAGE);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "birch_village"), BIRCH_VILLAGE);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "dark_forest_village"), DARK_FOREST_VILLAGE);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "jungle_village"), JUNGLE_VILLAGE);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "swamp_village"), SWAMP_VILLAGE);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "mountains_village"), MOUNTAINS_VILLAGE);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "giant_taiga_village"), GIANT_TAIGA_VILLAGE);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "crimson_village"), CRIMSON_VILLAGE);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "warped_village"), WARPED_VILLAGE);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "village_oak"), VILLAGE_OAK);

        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "ruined_portal_end"), RUINED_PORTAL_END);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "ruins_nether"), RUINS_NETHER);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "ruins_land_warm"), RUINS_LAND_WARM);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "ruins_land_hot"), RUINS_LAND_HOT);
        // regexpos2

        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "city_nether"), CITY_NETHER);

        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "mansion_birch"), MANSION_BIRCH);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "mansion_jungle"), MANSION_JUNGLE);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "mansion_oak"), MANSION_OAK);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "mansion_savanna"), MANSION_SAVANNA);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "mansion_taiga"), MANSION_TAIGA);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "mansion_desert"), MANSION_DESERT);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "mansion_snowy"), MANSION_SNOWY);

        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "witch_huts_oak"), WITCH_HUTS_OAK);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "witch_huts_taiga"), WITCH_HUTS_TAIGA);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "witch_huts_birch"), WITCH_HUTS_BIRCH);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "witch_huts_dark_forest"), WITCH_HUTS_DARK_FOREST);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "witch_huts_giant_tree_taiga"), WITCH_HUTS_GIANT_TREE_TAIGA);

        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "bastion_underground"), BASTION_UNDERGROUND);
    }
}
