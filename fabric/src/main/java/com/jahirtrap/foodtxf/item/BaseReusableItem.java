package com.jahirtrap.foodtxf.item;

import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemStackTemplate;

public class BaseReusableItem extends Item implements FabricItem {
    public BaseReusableItem(Item.Properties properties) {
        super(properties.stacksTo(1));
    }

    @Override
    public ItemStackTemplate getCraftingRemainder(ItemStack stack) {
        return ItemStackTemplate.fromNonEmptyStack(stack.copy());
    }
}
