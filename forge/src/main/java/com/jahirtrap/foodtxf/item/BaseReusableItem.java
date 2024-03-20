package com.jahirtrap.foodtxf.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;

import static com.jahirtrap.foodtxf.FoodtxfModTab.TAB_FOOD_TXF;

public class BaseReusableItem extends Item {
    public BaseReusableItem() {
        super(new Item.Properties().tab(TAB_FOOD_TXF).stacksTo(1).rarity(Rarity.COMMON));
    }

    @Override
    public boolean hasCraftingRemainingItem() {
        return true;
    }

    @Override
    public ItemStack getCraftingRemainingItem(ItemStack stack) {
        return new ItemStack(this);
    }
}
