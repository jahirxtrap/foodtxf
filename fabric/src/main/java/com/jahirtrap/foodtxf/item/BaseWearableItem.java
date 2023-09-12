package com.jahirtrap.foodtxf.item;

import com.jahirtrap.foodtxf.util.WearableItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;

public class BaseWearableItem extends BlockItem implements WearableItem {
    public BaseWearableItem(Block block, Item.Properties properties) {
        super(block, properties);
    }

    @Override
    public EquipmentSlot getEquipmentSlot(ItemStack itemstack) {
        return EquipmentSlot.HEAD;
    }
}
