package com.jahirtrap.foodtxf.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;

import static com.jahirtrap.foodtxf.FoodtxfMod.TAB_FOOD_TXF;

public class WoodenKnifeItem extends BaseKnifeItem {
    public WoodenKnifeItem() {
        super(59, 2f, -2f, 0, 15, Ingredient.of(new ItemStack(Blocks.OAK_PLANKS)), new Item.Properties().tab(TAB_FOOD_TXF));
    }
}
