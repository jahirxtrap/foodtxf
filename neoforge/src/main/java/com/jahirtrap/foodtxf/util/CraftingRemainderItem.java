package com.jahirtrap.foodtxf.util;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemStackTemplate;
import org.jetbrains.annotations.Nullable;

public interface CraftingRemainderItem {
    @Nullable ItemStackTemplate getCraftingRemainder(ItemStack stack);
}
