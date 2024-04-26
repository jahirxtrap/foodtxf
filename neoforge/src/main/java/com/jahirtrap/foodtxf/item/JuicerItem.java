package com.jahirtrap.foodtxf.item;

import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class JuicerItem extends Item {
    public JuicerItem() {
        super(new Item.Properties().durability(200));
    }

    @Override
    public boolean hasCraftingRemainingItem() {
        return true;
    }

    @Override
    public ItemStack getCraftingRemainingItem(ItemStack stack) {
        ItemStack retVal = stack.copy();
        if (retVal.getComponents().has(DataComponents.UNBREAKABLE)) return retVal;
        retVal.setDamageValue(stack.getDamageValue() + 1);
        if (retVal.getDamageValue() >= retVal.getMaxDamage()) {
            return ItemStack.EMPTY;
        }
        return retVal;
    }

    @Override
    public boolean isRepairable(ItemStack stack) {
        return false;
    }

    @Override
    public int getEnchantmentValue() {
        return 5;
    }
}
