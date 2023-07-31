package com.jahirtrap.foodtxf.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;

import static com.jahirtrap.foodtxf.FoodtxfMod.TAB_FOOD_TXF;

public class StoneKnifeItem extends BaseKnifeItem {
    public StoneKnifeItem() {
        super(131, 4f, -1f, 1, 5, Ingredient.of(new ItemStack(Blocks.COBBLESTONE)), new Item.Properties().tab(TAB_FOOD_TXF));
    }
}
