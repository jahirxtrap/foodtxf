package com.jahirtrap.foodtxf.item;

import com.jahirtrap.foodtxf.init.FoodtxfModTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;

public class CuttingBoardItem extends Item {
    public CuttingBoardItem() {
        super(new Item.Properties().tab(FoodtxfModTabs.TAB_FOOD_TXF).stacksTo(1).rarity(Rarity.COMMON));
        setRegistryName("cutting_board");
    }

    @Override
    public boolean hasCraftingRemainingItem() {
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemstack) {
        return new ItemStack(this);
    }

    @Override
    public int getUseDuration(ItemStack itemstack) {
        return 0;
    }
}
