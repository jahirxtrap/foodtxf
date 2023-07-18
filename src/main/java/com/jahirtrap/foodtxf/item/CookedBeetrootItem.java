package com.jahirtrap.foodtxf.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;


public class CookedBeetrootItem extends Item {
    public CookedBeetrootItem() {
        super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)
                .food((new FoodProperties.Builder()).nutrition(5).saturationMod(0.6f)

                        .build()));
    }
}
