package com.jahirtrap.foodtxf.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

public class DiamondSkilletItem extends BaseSkilletItem {
    public DiamondSkilletItem() {
        super(1561, 8f, 4f, 3, 10, Ingredient.of(new ItemStack(Items.DIAMOND)), new Item.Properties());
    }
}
