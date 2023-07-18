package com.jahirtrap.foodtxf.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class GoldenGlowBerriesItem extends Item {
    public GoldenGlowBerriesItem() {
        super(new Properties().stacksTo(64).rarity(Rarity.COMMON)
                .food((new FoodProperties.Builder()).nutrition(6).saturationMod(0.6f)

                        .build()));
    }
}
