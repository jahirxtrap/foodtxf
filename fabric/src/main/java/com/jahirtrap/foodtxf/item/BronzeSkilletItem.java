package com.jahirtrap.foodtxf.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;

import static com.jahirtrap.foodtxf.FoodtxfMod.TAB_FOOD_TXF;

public class BronzeSkilletItem extends BaseSkilletItem {
    public BronzeSkilletItem() {
        super(350, 7f, 3f, 2, 16, Ingredient.EMPTY, new Item.Properties().tab(TAB_FOOD_TXF));
    }
}
