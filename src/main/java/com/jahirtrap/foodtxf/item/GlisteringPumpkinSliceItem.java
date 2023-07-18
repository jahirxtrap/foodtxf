package com.jahirtrap.foodtxf.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;


public class GlisteringPumpkinSliceItem extends Item {
    public GlisteringPumpkinSliceItem() {
        super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)
                .food((new FoodProperties.Builder()).nutrition(7).saturationMod(1f)

                        .build()));
    }
}
