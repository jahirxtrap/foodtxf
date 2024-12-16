package com.jahirtrap.foodtxf.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import static com.jahirtrap.foodtxf.util.CommonUtils.hurt;

public class JuicerItem extends Item {
    public JuicerItem(Properties properties) {
        super(properties.durability(200).enchantable(5));
    }

    @Override
    public ItemStack getCraftingRemainder(ItemStack stack) {
        return hurt(1, stack);
    }

    @Override
    public boolean isCombineRepairable(ItemStack stack) {
        return false;
    }
}
