package com.jahirtrap.foodtxf.item;

import com.jahirtrap.foodtxf.init.ModTiers;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;

public class BaguetteItem extends SwordItem {
    public BaguetteItem() {
        super(ModTiers.BREAD, 3, -2.4F, new Item.Properties()
                .food(new FoodProperties.Builder().nutrition(15).saturationMod(0.6f).build()));
    }

    @Override
    public int getUseDuration(ItemStack stack) {
        return 64;
    }
}
