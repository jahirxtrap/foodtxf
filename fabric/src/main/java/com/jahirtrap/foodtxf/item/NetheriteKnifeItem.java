package com.jahirtrap.foodtxf.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

public class NetheriteKnifeItem extends BaseKnifeItem {
    public NetheriteKnifeItem() {
        super(2031, 9f, 2f, 4, 15, Ingredient.of(new ItemStack(Items.NETHERITE_INGOT)), new Item.Properties().fireResistant());
    }
}
