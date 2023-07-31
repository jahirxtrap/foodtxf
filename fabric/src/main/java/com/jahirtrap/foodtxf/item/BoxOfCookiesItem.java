package com.jahirtrap.foodtxf.item;

import com.jahirtrap.foodtxf.init.FoodtxfModItems;
import net.minecraft.world.food.FoodProperties;

public class BoxOfCookiesItem extends BaseReturnItem {
    public BoxOfCookiesItem() {
        super(FoodtxfModItems.BOX, "none", 64, (new FoodProperties.Builder()).nutrition(12).saturationMod(0.325f)
                .build());
    }
}
