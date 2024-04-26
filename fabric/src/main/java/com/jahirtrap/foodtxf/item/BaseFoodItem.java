package com.jahirtrap.foodtxf.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import static com.jahirtrap.foodtxf.FoodtxfModTab.TAB_FOOD_TXF;

public class BaseFoodItem extends Item {
    private int useDuration = 32;

    public BaseFoodItem(int nutrition, float saturation) {
        super(new Item.Properties().tab(TAB_FOOD_TXF).stacksTo(64)
                .food((new FoodProperties.Builder()).nutrition(nutrition).saturationMod(saturation)
                        .build()));
    }

    public BaseFoodItem(int nutrition, float saturation, int useDuration) {
        this(nutrition, saturation);
        this.useDuration = useDuration;
    }

    @Override
    public int getUseDuration(ItemStack stack) {
        return this.useDuration;
    }
}
