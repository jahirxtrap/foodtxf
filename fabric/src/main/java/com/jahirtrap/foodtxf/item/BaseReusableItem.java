package com.jahirtrap.foodtxf.item;

import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class BaseReusableItem extends Item implements FabricItem {
    public BaseReusableItem(Properties properties) {
        super(properties.stacksTo(1));
    }

    @Override
    public boolean hasCraftingRemainingItem() {
        return true;
    }

    @Override
    public ItemStack getRecipeRemainder(ItemStack stack) {
        return stack.copy();
    }
}
