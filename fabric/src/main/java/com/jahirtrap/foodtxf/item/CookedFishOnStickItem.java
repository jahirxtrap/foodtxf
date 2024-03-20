package com.jahirtrap.foodtxf.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Items;

public class CookedFishOnStickItem extends BaseReturnItem {
    public CookedFishOnStickItem() {
        super(Items.STICK, "none", 64, (new FoodProperties.Builder()).nutrition(10).saturationMod(0.7f)
                .build());
    }
}
