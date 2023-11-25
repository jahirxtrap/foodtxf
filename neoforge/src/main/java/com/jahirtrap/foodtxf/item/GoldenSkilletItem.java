package com.jahirtrap.foodtxf.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

public class GoldenSkilletItem extends BaseSkilletItem {
    public GoldenSkilletItem() {
        super(32, 12f, 1f, 0, 22, Ingredient.of(new ItemStack(Items.GOLD_INGOT)), new Item.Properties());
    }
}

