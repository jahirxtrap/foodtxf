package com.jahirtrap.foodtxf.item;

import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class BaseSkilletItem extends SwordItem {
    public BaseSkilletItem(Tier tier, Properties properties) {
        super(tier, properties.attributes(createAttributes(tier, 4, -2.6f)));
    }

    @Override
    public boolean hasCraftingRemainingItem(ItemStack stack) {
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
}
