package com.telepathicgrunt.repurposedstructures.world.features;

import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.WitherSkeletonEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.util.FeatureContext;


public class WitherSkeletonWithBow extends Feature<DefaultFeatureConfig> {

    public WitherSkeletonWithBow() {
        super(DefaultFeatureConfig.CODEC);
    }


    @Override
    public boolean generate(FeatureContext<DefaultFeatureConfig> context) {

        // move down to spawn at the jigsaw block calling this
        BlockPos position = context.getOrigin().down();

        WitherSkeletonEntity witherEntity = EntityType.WITHER_SKELETON.create(context.getWorld().toServerWorld());
        witherEntity.setPersistent();
        witherEntity.refreshPositionAndAngles(
                (double)position.getX() + 0.5D,
                position.getY(),
                (double)position.getZ() + 0.5D,
                0.0F,
                0.0F);

        witherEntity.getAttributeInstance(EntityAttributes.GENERIC_FOLLOW_RANGE)
                .addPersistentModifier(new EntityAttributeModifier(
                        "Random spawn bonus",
                        (context.getRandom().nextGaussian() * 0.3D) + 0.5D,
                        EntityAttributeModifier.Operation.MULTIPLY_BASE));

        ItemStack bow = new ItemStack(Items.BOW);
        bow.addEnchantment(Enchantments.FLAME, 1);
        bow.addEnchantment(Enchantments.PUNCH, 2);
        bow.addEnchantment(Enchantments.POWER, 2);
        bow.addEnchantment(Enchantments.VANISHING_CURSE, 1);
        bow.addEnchantment(Enchantments.BINDING_CURSE, 1);
        witherEntity.setStackInHand(Hand.MAIN_HAND, bow);
        witherEntity.setEquipmentDropChance(EquipmentSlot.MAINHAND, 0.5f);
        witherEntity.setLeftHanded(context.getRandom().nextFloat() < 0.05F);

        context.getWorld().spawnEntityAndPassengers(witherEntity);
        return true;
    }
}