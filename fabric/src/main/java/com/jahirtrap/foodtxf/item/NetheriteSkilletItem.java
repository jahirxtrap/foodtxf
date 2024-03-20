package com.jahirtrap.foodtxf.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

public class NetheriteSkilletItem extends BaseSkilletItem {
    public NetheriteSkilletItem() {
        super(2031, 9f, 5f, 4, 15, Ingredient.of(new ItemStack(Items.NETHERITE_INGOT)), new Item.Properties().fireResistant());
    }
}
