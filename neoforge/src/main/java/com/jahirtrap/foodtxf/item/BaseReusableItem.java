package com.jahirtrap.foodtxf.item;

import com.jahirtrap.foodtxf.util.CraftingRemainderItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemStackTemplate;

public class BaseReusableItem extends Item implements CraftingRemainderItem {
    public BaseReusableItem(Properties properties) {
        super(properties.stacksTo(1));
    }

    public ItemStackTemplate getCraftingRemainder(ItemStack stack) {
        return ItemStackTemplate.fromNonEmptyStack(stack.copy());
    }

    @Override
    public boolean isCombineRepairable(ItemStack stack) {
        return false;
    }
}
