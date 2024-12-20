package com.jahirtrap.foodtxf.item;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class BaseFoodItem extends Item {
    private int useDuration = 32;

    public BaseFoodItem(int nutrition, float saturation, Properties properties) {
        super(properties.stacksTo(64)
                .food((new FoodProperties.Builder()).nutrition(nutrition).saturationModifier(saturation)
                        .build()));
    }

    public BaseFoodItem(int nutrition, float saturation, int useDuration, Properties properties) {
        this(nutrition, saturation, properties);
        this.useDuration = useDuration;
    }

    @Override
    public int getUseDuration(ItemStack stack, LivingEntity entity) {
        return useDuration;
    }
}
