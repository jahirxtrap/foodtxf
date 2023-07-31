package com.jahirtrap.foodtxf.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import static com.jahirtrap.foodtxf.FoodtxfMod.TAB_FOOD_TXF;

public class SkilletItem extends BaseSkilletItem {
    public SkilletItem() {
        super(250, 6f, 3f, 2, 14, Ingredient.of(new ItemStack(Items.IRON_INGOT)), new Item.Properties().tab(TAB_FOOD_TXF));
    }
}
