package com.jahirtrap.foodtxf.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;


public class GoldenPlayerFleshItem extends Item {
    public GoldenPlayerFleshItem() {
        super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)
                .food((new FoodProperties.Builder()).nutrition(10).saturationMod(0.8f)

                        .meat().build()));
    }
}
