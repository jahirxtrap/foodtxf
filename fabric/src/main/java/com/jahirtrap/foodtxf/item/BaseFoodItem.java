package com.jahirtrap.foodtxf.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

import java.util.List;

public class BaseFoodItem extends Item {
    public BaseFoodItem(int nutrition, float saturation, int useDuration) {
        super(new Item.Properties().stacksTo(64)
                .food(new FoodProperties(nutrition, saturation, false, useDuration / 20f, List.of())));
    }

    public BaseFoodItem(int nutrition, float saturation) {
        this(nutrition, saturation, 32);
    }
}
