package com.jahirtrap.foodtxf.item;

import com.jahirtrap.foodtxf.init.FoodtxfModTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;

public class SteelKnifeItem extends BaseKnifeItem {
	public SteelKnifeItem() {
		super(501, 6.5f, 0f, 2, 14, Ingredient.EMPTY, new Item.Properties().tab(FoodtxfModTabs.TAB_FOOD_TXF));
	}
}
