package com.jahirtrap.foodtxf.item;

import com.jahirtrap.foodtxf.util.RepairableItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import static com.jahirtrap.foodtxf.util.CommonUtils.hurt;

public class JuicerItem extends Item implements RepairableItem {
    public JuicerItem() {
        super(new Item.Properties().durability(200));
    }

    @Override
    public boolean hasCraftingRemainingItem() {
        return true;
    }

    @Override
    public ItemStack getCraftingRemainingItem(ItemStack stack) {
        return hurt(1, stack);
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
