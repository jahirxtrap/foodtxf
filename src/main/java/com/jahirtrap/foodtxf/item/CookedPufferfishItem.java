package com.jahirtrap.foodtxf.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import com.jahirtrap.foodtxf.init.FoodtxfModTabs;

public class CookedPufferfishItem extends Item {
	public CookedPufferfishItem() {
		super(new Item.Properties().tab(FoodtxfModTabs.TAB_FOOD_TXF).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(6).saturationMod(0.85f)

						.build()));
	}
}
