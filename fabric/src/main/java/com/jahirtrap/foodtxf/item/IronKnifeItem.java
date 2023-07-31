package com.jahirtrap.foodtxf.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

public class IronKnifeItem extends BaseKnifeItem {
    public IronKnifeItem() {
        super(250, 6f, 0f, 2, 14, Ingredient.of(new ItemStack(Items.IRON_INGOT)), new Item.Properties());
    }
}
