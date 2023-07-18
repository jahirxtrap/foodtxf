package com.jahirtrap.foodtxf.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

import static com.jahirtrap.foodtxf.FoodtxfModTab.TAB_FOOD_TXF;

public class BaseContainerItem extends Item {
    public BaseContainerItem() {
        super(new Item.Properties().tab(TAB_FOOD_TXF).stacksTo(64).rarity(Rarity.COMMON));
    }
}
