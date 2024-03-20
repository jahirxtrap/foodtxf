package com.jahirtrap.foodtxf.util;

import net.minecraft.world.item.ItemStack;

public interface ContainerItem {
    default ItemStack getContainerItem(ItemStack stack) {
        return stack;
    }
}
