package com.jahirtrap.foodtxf.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;

import static com.jahirtrap.foodtxf.FoodtxfMod.TAB_FOOD_TXF;

public class SteelSkilletItem extends BaseSkilletItem {
    public SteelSkilletItem() {
        super(501, 6.5f, 3f, 2, 14, Ingredient.EMPTY, new Item.Properties().tab(TAB_FOOD_TXF));
    }
}
