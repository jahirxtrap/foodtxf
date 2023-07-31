package com.jahirtrap.foodtxf.item;

import com.jahirtrap.foodtxf.init.FoodtxfModItems;
import net.minecraft.world.food.FoodProperties;

public class GlassOfMilkAndCookiesItem extends BaseReturnItem {
    public GlassOfMilkAndCookiesItem() {
        super(FoodtxfModItems.GLASS, "none", 64, (new FoodProperties.Builder()).nutrition(5).saturationMod(0.2f)
                .build());
    }
}
