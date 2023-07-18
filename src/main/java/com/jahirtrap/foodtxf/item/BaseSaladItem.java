package com.jahirtrap.foodtxf.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Items;

public class BaseSaladItem extends BaseReturnItem {
    public BaseSaladItem() {
        super(Items.BOWL, "none", 64, (new FoodProperties.Builder()).nutrition(6).saturationMod(0.65f)
                .build());
    }
}
