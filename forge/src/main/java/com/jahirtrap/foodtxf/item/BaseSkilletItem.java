package com.jahirtrap.foodtxf.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

import static com.jahirtrap.foodtxf.FoodtxfModTab.TAB_FOOD_TXF;
import static com.jahirtrap.foodtxf.util.CommonUtils.hurt;

public class BaseSkilletItem extends SwordItem {
    public BaseSkilletItem(Tier tier, Properties properties) {
        super(tier, 4, -2.6f, properties.tab(TAB_FOOD_TXF));
    }

    @Override
    public boolean hasCraftingRemainingItem(ItemStack stack) {
        return true;
    }

    @Override
    public ItemStack getCraftingRemainingItem(ItemStack stack) {
        return hurt(1, stack);
    }

    @Override
    public boolean isRepairable(ItemStack stack) {
        return false;
    }
}
