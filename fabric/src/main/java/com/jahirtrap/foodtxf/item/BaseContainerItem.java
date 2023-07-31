package com.jahirtrap.foodtxf.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class BaseContainerItem extends Item {
    public BaseContainerItem() {
        super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
    }
}
