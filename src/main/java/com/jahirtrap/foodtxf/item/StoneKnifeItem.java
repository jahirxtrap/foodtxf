package com.jahirtrap.foodtxf.item;

import com.jahirtrap.foodtxf.init.FoodtxfModTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;

public class StoneKnifeItem extends BaseKnifeItem {
	public StoneKnifeItem() {
		super(131, 4f, -1f, 1, 5, Ingredient.of(new ItemStack(Blocks.COBBLESTONE)), new Item.Properties().tab(FoodtxfModTabs.TAB_FOOD_TXF));
	}
}
