package com.jahirtrap.foodtxf.item;

import com.jahirtrap.foodtxf.util.ContainerItem;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class MixingBowlItem extends BaseItem implements ContainerItem, FabricItem {
    public MixingBowlItem() {
        super(new Item.Properties().stacksTo(1));
    }

    @Override
    public boolean hasCraftingRemainingItem() {
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack stack) {
        return stack;
    }
}
