package com.jahirtrap.foodtxf.item;

import com.jahirtrap.foodtxf.util.RepairableItem;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class BaseSkilletItem extends SwordItem implements RepairableItem, FabricItem {
    public BaseSkilletItem(Tier tier, Properties properties) {
        super(tier, properties.attributes(createAttributes(tier, 4, -2.6f)));
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
}
