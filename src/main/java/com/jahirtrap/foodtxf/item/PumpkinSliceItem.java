package com.jahirtrap.foodtxf.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import com.jahirtrap.foodtxf.init.FoodtxfModTabs;

public class PumpkinSliceItem extends Item {
	public PumpkinSliceItem() {
		super(new Item.Properties().tab(FoodtxfModTabs.TAB_FOOD_TXF).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(4).saturationMod(0.35f)

						.build()));
	}
}
