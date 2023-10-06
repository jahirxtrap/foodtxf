package com.jahirtrap.foodtxf.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

public class DiamondKnifeItem extends BaseKnifeItem {
    public DiamondKnifeItem() {
        super(1561, 8f, 1f, 3, 10, Ingredient.of(new ItemStack(Items.DIAMOND)), new Item.Properties());
    }
}
