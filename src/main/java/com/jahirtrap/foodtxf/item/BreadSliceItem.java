package com.jahirtrap.foodtxf.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;


public class BreadSliceItem extends Item {
    public BreadSliceItem() {
        super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)
                .food((new FoodProperties.Builder()).nutrition(4).saturationMod(0.5f)

                        .build()));
    }
}
