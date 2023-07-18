package com.jahirtrap.foodtxf.item;

import com.jahirtrap.foodtxf.init.FoodtxfModTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

public class IronKnifeItem extends BaseKnifeItem {
    public IronKnifeItem() {
        super(250, 6f, 0f, 2, 14, Ingredient.of(new ItemStack(Items.IRON_INGOT)), new Item.Properties().tab(FoodtxfModTabs.TAB_FOOD_TXF));
    }
}
