package com.jahirtrap.foodtxf.item;

import com.jahirtrap.foodtxf.init.FoodtxfModItems;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;

public class GlassOfMilkItem extends BaseReturnItem {
    public GlassOfMilkItem() {
        super(FoodtxfModItems.GLASS.get(), "milk", 64, (new FoodProperties.Builder()).nutrition(1).saturationMod(0.5f).alwaysEat()
                .build());
    }

    @Override
    public UseAnim getUseAnimation(ItemStack stack) {
        return UseAnim.DRINK;
    }
}
