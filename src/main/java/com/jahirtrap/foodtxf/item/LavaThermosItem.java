package com.jahirtrap.foodtxf.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;

import com.jahirtrap.foodtxf.procedures.EntityDrinksLavaProcedure;
import com.jahirtrap.foodtxf.init.FoodtxfModTabs;
import com.jahirtrap.foodtxf.init.FoodtxfModItems;

public class LavaThermosItem extends Item {
	public LavaThermosItem() {
		super(new Item.Properties().tab(FoodtxfModTabs.TAB_FOOD_TXF).stacksTo(16).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(0).saturationMod(0f).alwaysEat()

						.build()));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.DRINK;
	}

	@Override
	public boolean hasCraftingRemainingItem() {
		return true;
	}

	@Override
	public ItemStack getCraftingRemainingItem(ItemStack itemstack) {
		return new ItemStack(FoodtxfModItems.THERMOS.get());
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = new ItemStack(FoodtxfModItems.THERMOS.get());
		super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		EntityDrinksLavaProcedure.execute(entity);
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
