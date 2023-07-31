package com.jahirtrap.foodtxf.item;

import com.jahirtrap.foodtxf.init.FoodtxfModItems;
import net.minecraft.world.food.FoodProperties;

public class GlassOfWaterAndBreadItem extends BaseReturnItem {
    public GlassOfWaterAndBreadItem() {
        super(FoodtxfModItems.GLASS, "none", 64, (new FoodProperties.Builder()).nutrition(6).saturationMod(0.5f)
                .build());
    }
}
