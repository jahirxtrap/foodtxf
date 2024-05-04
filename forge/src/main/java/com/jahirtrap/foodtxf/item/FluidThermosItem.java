package com.jahirtrap.foodtxf.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;

import static com.jahirtrap.foodtxf.util.CommonUtils.container;
import static com.jahirtrap.foodtxf.util.CommonUtils.fluid;

public class FluidThermosItem extends BaseReturnItem {
    public FluidThermosItem(int fluidType) {
        super(container.get(4), fluid.get(fluidType), 16, (new FoodProperties.Builder()).alwaysEdible()
                .build());
    }

    public FluidThermosItem() {
        this(0);
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
        return new ItemStack(container.get(4));
    }
}
