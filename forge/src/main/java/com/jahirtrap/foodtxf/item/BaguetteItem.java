package com.jahirtrap.foodtxf.item;

import com.jahirtrap.foodtxf.init.ModTiers;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;

public class BaguetteItem extends SwordItem {
    public BaguetteItem() {
        super(ModTiers.BREAD, new Properties().attributes(createAttributes(ModTiers.BREAD, 3, -2.4F))
                .food((new FoodProperties.Builder()).nutrition(15).saturationModifier(0.6f)
                        .build()));
    }

    @Override
    public int getUseDuration(ItemStack stack, LivingEntity entity) {
        return 64;
    }
}
