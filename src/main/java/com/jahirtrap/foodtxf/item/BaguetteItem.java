package com.jahirtrap.foodtxf.item;

import net.minecraft.world.item.ItemStack;

public class BaguetteItem extends BaseFoodItem {
    public BaguetteItem() {
        super(15, 0.6f);
    }

    @Override
    public int getUseDuration(ItemStack itemstack) {
        return 64;
    }
}
