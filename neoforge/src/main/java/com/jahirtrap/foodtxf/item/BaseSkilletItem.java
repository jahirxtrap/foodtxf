package com.jahirtrap.foodtxf.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ToolMaterial;

import static com.jahirtrap.foodtxf.util.CommonUtils.hurt;

public class BaseSkilletItem extends SwordItem {
    public BaseSkilletItem(ToolMaterial material, Properties properties) {
        super(material, 4f, -2.6f, properties.setNoCombineRepair());
    }

    @Override
    public ItemStack getCraftingRemainder(ItemStack stack) {
        return hurt(1, stack);
    }
}
