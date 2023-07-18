package com.jahirtrap.foodtxf.item;

import com.jahirtrap.foodtxf.init.FoodtxfModTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

public class NetheriteKnifeItem extends BaseKnifeItem {
	public NetheriteKnifeItem() {
		super(2031, 9f, 2f, 4, 15, Ingredient.of(new ItemStack(Items.NETHERITE_INGOT)), new Item.Properties().tab(FoodtxfModTabs.TAB_FOOD_TXF).fireResistant());
	}
}
