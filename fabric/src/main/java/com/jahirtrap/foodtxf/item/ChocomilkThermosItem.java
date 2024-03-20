package com.jahirtrap.foodtxf.item;

import com.jahirtrap.foodtxf.init.FoodtxfModItems;
import com.jahirtrap.foodtxf.util.ContainerItem;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;

public class ChocomilkThermosItem extends BaseReturnItem implements ContainerItem {
    public ChocomilkThermosItem() {
        super(FoodtxfModItems.THERMOS, "none", 16, (new FoodProperties.Builder()).alwaysEat()
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
    public ItemStack getContainerItem(ItemStack stack) {
        return new ItemStack(FoodtxfModItems.THERMOS);
    }
}
