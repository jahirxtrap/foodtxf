package com.jahirtrap.foodtxf.item;

import com.jahirtrap.foodtxf.init.FoodtxfModTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;

public class WoodenKnifeItem extends BaseKnifeItem {
	public WoodenKnifeItem() {
		super(59, 2f, -2f, 0, 15, Ingredient.of(new ItemStack(Blocks.OAK_PLANKS)), new Item.Properties().tab(FoodtxfModTabs.TAB_FOOD_TXF));
	}
}
