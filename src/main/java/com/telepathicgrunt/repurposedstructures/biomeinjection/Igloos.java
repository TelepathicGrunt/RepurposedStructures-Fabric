package com.telepathicgrunt.repurposedstructures.biomeinjection;

import com.telepathicgrunt.repurposedstructures.RepurposedStructures;
import com.telepathicgrunt.repurposedstructures.modinit.RSConfiguredStructures;
import com.telepathicgrunt.repurposedstructures.modinit.RSStructures;
import com.telepathicgrunt.repurposedstructures.utils.BiomeSelection;
import com.telepathicgrunt.repurposedstructures.utils.GeneralUtils;
import net.minecraft.world.biome.Biome.Category;

public class Igloos {

    public static void addIgloos() {

        GeneralUtils.addToBiome("grassy_igloo",
                (context) ->
                        BiomeSelection.isBiomeAllowed(context, RSStructures.IGLOO_GRASSY,
                                () -> BiomeSelection.haveCategories(context, Category.FOREST, Category.PLAINS))
                        && RepurposedStructures.RSAllConfig.RSIgloosConfig.grassyIglooAverageChunkDistance != 1001,
                context -> context.getGenerationSettings().addBuiltInStructure(RSConfiguredStructures.GRASSY_IGLOO));

        GeneralUtils.addToBiome("stone_igloo",
                (context) ->
                        BiomeSelection.isBiomeAllowed(context, RSStructures.IGLOO_STONE,
                                () -> BiomeSelection.haveCategories(context, Category.TAIGA)
                                && BiomeSelection.hasName(context, "giant", "redwood"))
                        && RepurposedStructures.RSAllConfig.RSIgloosConfig.stoneIglooAverageChunkDistance != 1001,
                context -> context.getGenerationSettings().addBuiltInStructure(RSConfiguredStructures.STONE_IGLOO));
    }
}
