package com.jahirtrap.foodtxf.item;

import com.jahirtrap.foodtxf.util.RepairableItem;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import static com.jahirtrap.foodtxf.util.CommonUtils.hurt;

public class JuicerItem extends Item implements RepairableItem, FabricItem {
    public JuicerItem(Properties properties) {
        super(properties.durability(200).enchantable(5));
    }

    @Override
    public ItemStack getRecipeRemainder(ItemStack stack) {
        return hurt(1, stack);
    }

    @Override
    public boolean isRepairable() {
        return false;
    }
}
