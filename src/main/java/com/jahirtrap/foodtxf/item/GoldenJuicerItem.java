package com.jahirtrap.foodtxf.item;

import com.jahirtrap.foodtxf.init.FoodtxfModTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;

public class GoldenJuicerItem extends Item {
    public GoldenJuicerItem() {
        super(new Item.Properties().tab(FoodtxfModTabs.TAB_FOOD_TXF).durability(160).rarity(Rarity.COMMON));
        setRegistryName("golden_juicer");
    }

    @Override
    public boolean hasCraftingRemainingItem() {
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemstack) {
        ItemStack retval = new ItemStack(this);
        retval.setDamageValue(itemstack.getDamageValue() + 1);
        if (retval.getDamageValue() >= retval.getMaxDamage()) {
            return ItemStack.EMPTY;
        }
        return retval;
    }

    @Override
    public boolean isRepairable(ItemStack itemstack) {
        return false;
    }

    @Override
    public int getEnchantmentValue() {
        return 22;
    }

    @Override
    public int getUseDuration(ItemStack itemstack) {
        return 0;
    }
}
