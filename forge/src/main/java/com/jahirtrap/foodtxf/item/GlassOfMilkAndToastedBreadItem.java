package com.jahirtrap.foodtxf.item;

import com.jahirtrap.foodtxf.init.FoodtxfModItems;
import net.minecraft.world.food.FoodProperties;

public class GlassOfMilkAndToastedBreadItem extends BaseReturnItem {
    public GlassOfMilkAndToastedBreadItem() {
        super(FoodtxfModItems.GLASS.get(), "none", 64, (new FoodProperties.Builder()).nutrition(10).saturationMod(0.65f)
                .build());
    }
}
