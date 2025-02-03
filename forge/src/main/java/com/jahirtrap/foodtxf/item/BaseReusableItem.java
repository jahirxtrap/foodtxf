package com.jahirtrap.foodtxf.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class BaseReusableItem extends Item {
    public BaseReusableItem(Properties properties) {
        super(properties.stacksTo(1));
    }

    @Override
    public ItemStack getCraftingRemainder(ItemStack stack) {
        return stack.copy();
    }
}
