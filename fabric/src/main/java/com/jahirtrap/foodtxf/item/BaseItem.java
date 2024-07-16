package com.jahirtrap.foodtxf.item;

import net.minecraft.world.item.Item;

import static com.jahirtrap.foodtxf.FoodtxfModTab.TAB_FOOD_TXF;

public class BaseItem extends Item {
    public BaseItem(Properties properties) {
        super(properties.tab(TAB_FOOD_TXF));
    }
}
