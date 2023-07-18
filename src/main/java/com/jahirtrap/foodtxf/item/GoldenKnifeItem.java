package com.jahirtrap.foodtxf.item;

import com.jahirtrap.foodtxf.init.FoodtxfModTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

public class GoldenKnifeItem extends BaseKnifeItem {
	public GoldenKnifeItem() {
		super(32, 12f, -2f, 0, 22, Ingredient.of(new ItemStack(Items.GOLD_INGOT)), new Item.Properties().tab(FoodtxfModTabs.TAB_FOOD_TXF));
	}
}
