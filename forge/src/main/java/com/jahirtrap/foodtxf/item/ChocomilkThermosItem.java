package com.jahirtrap.foodtxf.item;

import com.jahirtrap.foodtxf.init.FoodtxfModItems;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;

public class ChocomilkThermosItem extends BaseReturnItem {
    public ChocomilkThermosItem() {
        super(FoodtxfModItems.THERMOS.get(), "none", 16, (new FoodProperties.Builder()).alwaysEat()
                .build());
    }

    @Override
    public UseAnim getUseAnimation(ItemStack stack) {
        return UseAnim.DRINK;
    }

    @Override
    public boolean hasCraftingRemainingItem() {
        return true;
    }

    @Override
    public ItemStack getCraftingRemainingItem(ItemStack stack) {
        return new ItemStack(FoodtxfModItems.THERMOS.get());
    }
}
