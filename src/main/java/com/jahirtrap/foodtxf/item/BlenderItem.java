package com.jahirtrap.foodtxf.item;

import com.jahirtrap.foodtxf.init.FoodtxfModTabs;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class BlenderItem extends Item {
	public BlenderItem() {
		super(new Item.Properties().tab(FoodtxfModTabs.TAB_FOOD_TXF).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public boolean hasCraftingRemainingItem() {
		return true;
	}

	@Override
	public ItemStack getCraftingRemainingItem(ItemStack itemstack) {
		return new ItemStack(this);
	}
}
