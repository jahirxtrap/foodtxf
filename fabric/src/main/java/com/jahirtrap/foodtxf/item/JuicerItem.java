package com.jahirtrap.foodtxf.item;

import com.jahirtrap.foodtxf.util.RepairableItem;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class JuicerItem extends Item implements RepairableItem, FabricItem {
    public JuicerItem() {
        super(new Item.Properties().durability(200));
    }

    @Override
    public boolean hasCraftingRemainingItem() {
        return true;
    }

    @Override
    public ItemStack getRecipeRemainder(ItemStack stack) {
        ItemStack retVal = stack.copy();
        if (retVal.getComponents().has(DataComponents.UNBREAKABLE)) return retVal;
        retVal.setDamageValue(stack.getDamageValue() + 1);
        if (retVal.getDamageValue() >= retVal.getMaxDamage()) {
            return ItemStack.EMPTY;
        }
        return retVal;
    }

    @Override
    public boolean isRepairable() {
        return false;
    }

    @Override
    public int getEnchantmentValue() {
        return 5;
    }
}
