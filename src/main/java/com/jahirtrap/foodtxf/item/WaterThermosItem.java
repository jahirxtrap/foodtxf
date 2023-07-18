package com.jahirtrap.foodtxf.item;

import com.jahirtrap.foodtxf.init.FoodtxfModItems;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;

public class WaterThermosItem extends BaseReturnItem {
    public WaterThermosItem() {
        super(FoodtxfModItems.THERMOS.get(), "water", 16, (new FoodProperties.Builder()).alwaysEat()
                .build());
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
    public ItemStack getContainerItem(ItemStack itemstack) {
        return new ItemStack(FoodtxfModItems.THERMOS.get());
    }
}
