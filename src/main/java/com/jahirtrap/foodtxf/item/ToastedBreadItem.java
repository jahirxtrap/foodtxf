package com.jahirtrap.foodtxf.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;


public class ToastedBreadItem extends Item {
    public ToastedBreadItem() {
        super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)
                .food((new FoodProperties.Builder()).nutrition(8).saturationMod(0.75f)

                        .build()));
    }
}
