package com.jahirtrap.foodtxf.item;

import net.minecraft.world.item.crafting.Ingredient;

public class EnderiteKnifeItem extends BaseKnifeItem {
    public EnderiteKnifeItem() {
        super(4096, 16f, 3f, 4, 17, Ingredient.EMPTY, new Properties().fireResistant());
    }
}
