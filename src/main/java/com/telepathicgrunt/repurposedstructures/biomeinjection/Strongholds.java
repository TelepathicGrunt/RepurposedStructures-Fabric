package com.telepathicgrunt.repurposedstructures.biomeinjection;

import com.telepathicgrunt.repurposedstructures.RepurposedStructures;
import com.telepathicgrunt.repurposedstructures.modinit.RSConfiguredStructures;
import com.telepathicgrunt.repurposedstructures.modinit.RSStructureTagMap;
import com.telepathicgrunt.repurposedstructures.modinit.RSStructures;
import com.telepathicgrunt.repurposedstructures.utils.BiomeSelection;
import com.telepathicgrunt.repurposedstructures.utils.GeneralUtils;
import net.minecraft.world.biome.Biome.Category;

public class Strongholds {

    public static void addStrongholds() {
        GeneralUtils.addToBiome("nether_stronghold",
                (context) ->
                        BiomeSelection.isBiomeAllowed(context, RSStructures.STRONGHOLD_NETHER,
                                () -> BiomeSelection.haveCategories(context, Category.NETHER)
                                && BiomeSelection.doesNotHaveStructureType(context, RSStructureTagMap.STRUCTURE_TAGS.STRONGHOLD))
                        && RepurposedStructures.RSAllConfig.RSStrongholdsConfig.nether.netherStrongholdAverageChunkDistance != 1001,
                context -> context.getGenerationSettings().addBuiltInStructure(RSConfiguredStructures.NETHER_STRONGHOLD));
    }
}
