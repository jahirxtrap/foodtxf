package com.jahirtrap.foodtxf.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;

import com.jahirtrap.foodtxf.init.FoodtxfModTabs;
import com.jahirtrap.foodtxf.init.FoodtxfModItems;

public class GlassOfChocomilkAndToastedBreadItem extends Item {
	public GlassOfChocomilkAndToastedBreadItem() {
		super(new Item.Properties().tab(FoodtxfModTabs.TAB_FOOD_TXF).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(12).saturationMod(0.75f)

						.build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = new ItemStack(FoodtxfModItems.GLASS.get());
		super.finishUsingItem(itemstack, world, entity);
		if (itemstack.isEmpty()) {
			return retval;
		} else {
			if (entity instanceof Player player && !player.getAbilities().instabuild) {
				if (!player.getInventory().add(retval))
					player.drop(retval, false);
			}
			return itemstack;
		}
	}
}
