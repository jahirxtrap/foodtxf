package com.jahirtrap.foodtxf.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.component.Consumables;

public class BaseFoodItem extends Item {
    public BaseFoodItem(int nutrition, float saturation, int useDuration, Properties properties) {
        super(properties.stacksTo(64)
                .food(new FoodProperties.Builder().nutrition(nutrition).saturationModifier(saturation).build(), Consumables.defaultFood().consumeSeconds(useDuration / 20f).build()));
    }

    public BaseFoodItem(int nutrition, float saturation, Properties properties) {
        this(nutrition, saturation, 32, properties);
    }
}
