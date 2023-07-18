package com.jahirtrap.foodtxf.item;

import com.jahirtrap.foodtxf.init.FoodtxfModItems;
import com.jahirtrap.foodtxf.procedures.EntityDrinksWaterProcedure;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;

public class WaterThermosItem extends Item {
    public WaterThermosItem() {
        super(new Item.Properties().stacksTo(16).rarity(Rarity.COMMON)
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
        int x = entity.getBlockX();
        int y = entity.getBlockY();
        int z = entity.getBlockZ();

        EntityDrinksWaterProcedure.execute(world, x, y, z, entity);
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
