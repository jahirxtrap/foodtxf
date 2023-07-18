package com.jahirtrap.foodtxf.item;

import com.jahirtrap.foodtxf.init.FoodtxfModTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;

public class BronzeKnifeItem extends BaseKnifeItem {
    public BronzeKnifeItem() {
        super(350, 7f, 0f, 2, 16, Ingredient.EMPTY, new Item.Properties().tab(FoodtxfModTabs.TAB_FOOD_TXF));
    }
}
