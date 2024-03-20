package com.jahirtrap.foodtxf.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

import static com.jahirtrap.foodtxf.FoodtxfModTab.TAB_FOOD_TXF;

public class BaseFoodItem extends Item {
    public BaseFoodItem(int nutrition, float saturation) {
        super(new Item.Properties().tab(TAB_FOOD_TXF).stacksTo(64).rarity(Rarity.COMMON)
                .food((new FoodProperties.Builder()).nutrition(nutrition).saturationMod(saturation)
                        .build()));
    }
}
