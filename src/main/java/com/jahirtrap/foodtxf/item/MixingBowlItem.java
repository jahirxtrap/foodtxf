package com.jahirtrap.foodtxf.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.UseAnim;

import static com.jahirtrap.foodtxf.FoodtxfModTab.TAB_FOOD_TXF;


public class MixingBowlItem extends Item {
    public MixingBowlItem() {
        super(new Item.Properties().tab(TAB_FOOD_TXF).stacksTo(1).rarity(Rarity.COMMON));
    }

    @Override
    public UseAnim getUseAnimation(ItemStack itemstack) {
        return UseAnim.EAT;
    }

    @Override
    public boolean hasCraftingRemainingItem() {
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemstack) {
        return new ItemStack(this);
    }
}
