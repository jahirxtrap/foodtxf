package com.jahirtrap.foodtxf.item;

import com.jahirtrap.foodtxf.util.CraftingRemainderItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemStackTemplate;

import static com.jahirtrap.foodtxf.util.CommonUtils.hurt;

public class JuicerItem extends Item implements CraftingRemainderItem {
    public JuicerItem(Properties properties) {
        super(properties.durability(200).enchantable(5));
    }

    public ItemStackTemplate getCraftingRemainder(ItemStack stack) {
        return ItemStackTemplate.fromNonEmptyStack(hurt(1, stack));
    }

    @Override
    public boolean isCombineRepairable(ItemStack stack) {
        return false;
    }
}
