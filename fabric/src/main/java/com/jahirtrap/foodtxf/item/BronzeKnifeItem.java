package com.jahirtrap.foodtxf.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;

import static com.jahirtrap.foodtxf.FoodtxfMod.TAB_FOOD_TXF;

public class BronzeKnifeItem extends BaseKnifeItem {
    public BronzeKnifeItem() {
        super(350, 7f, 0f, 2, 16, Ingredient.EMPTY, new Item.Properties().tab(TAB_FOOD_TXF));
    }
}
