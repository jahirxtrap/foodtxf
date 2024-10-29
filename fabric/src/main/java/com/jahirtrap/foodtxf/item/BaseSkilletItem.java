package com.jahirtrap.foodtxf.item;

import com.jahirtrap.foodtxf.util.RepairableItem;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ToolMaterial;

import static com.jahirtrap.foodtxf.util.CommonUtils.hurt;

public class BaseSkilletItem extends SwordItem implements RepairableItem, FabricItem {
    public BaseSkilletItem(ToolMaterial material, Properties properties) {
        super(material, 4f, -2.6f, properties);
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
