package com.jahirtrap.foodtxf.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Items;

public class FishOnStickItem extends BaseReturnItem {
    public FishOnStickItem() {
        super(Items.STICK, "none", 64, (new FoodProperties.Builder()).nutrition(4).saturationMod(0.25f)
                .build());
    }
}
