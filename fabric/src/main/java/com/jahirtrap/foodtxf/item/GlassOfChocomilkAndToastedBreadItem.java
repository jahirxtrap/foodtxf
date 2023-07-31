package com.jahirtrap.foodtxf.item;

import com.jahirtrap.foodtxf.init.FoodtxfModItems;
import net.minecraft.world.food.FoodProperties;

public class GlassOfChocomilkAndToastedBreadItem extends BaseReturnItem {
    public GlassOfChocomilkAndToastedBreadItem() {
        super(FoodtxfModItems.GLASS, "none", 64, (new FoodProperties.Builder()).nutrition(10).saturationMod(0.7f)
                .build());
    }
}
