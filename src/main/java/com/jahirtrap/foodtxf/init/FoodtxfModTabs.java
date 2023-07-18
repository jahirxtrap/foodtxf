package com.jahirtrap.foodtxf.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class FoodtxfModTabs {
	public static CreativeModeTab TAB_FOOD_TXF;

	public static void load() {
		TAB_FOOD_TXF = new CreativeModeTab("tabfood_txf") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(FoodtxfModItems.DIAMOND_KNIFE.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
