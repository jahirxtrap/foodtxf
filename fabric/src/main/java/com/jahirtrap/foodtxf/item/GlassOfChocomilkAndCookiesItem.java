package com.jahirtrap.foodtxf.item;

import com.jahirtrap.foodtxf.init.FoodtxfModItems;
import net.minecraft.world.food.FoodProperties;

public class GlassOfChocomilkAndCookiesItem extends BaseReturnItem {
    public GlassOfChocomilkAndCookiesItem() {
        super(FoodtxfModItems.GLASS, "none", 64, (new FoodProperties.Builder()).nutrition(5).saturationMod(0.3f)
                .build());
    }
}
