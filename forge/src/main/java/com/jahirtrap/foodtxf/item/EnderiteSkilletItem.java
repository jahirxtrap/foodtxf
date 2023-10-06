package com.jahirtrap.foodtxf.item;

import net.minecraft.world.item.crafting.Ingredient;

public class EnderiteSkilletItem extends BaseSkilletItem {
    public EnderiteSkilletItem() {
        super(4096, 16f, 6f, 4, 17, Ingredient.EMPTY, new Properties().fireResistant());
    }
}
