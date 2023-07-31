package com.jahirtrap.foodtxf.item;

import com.jahirtrap.foodtxf.init.FoodtxfModItems;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;

public class GlassOfChocomilkItem extends BaseReturnItem {
    public GlassOfChocomilkItem() {
        super(FoodtxfModItems.GLASS, "none", 64, (new FoodProperties.Builder()).nutrition(1).saturationMod(1f).alwaysEat()
                .build());
    }

    @Override
    public UseAnim getUseAnimation(ItemStack itemstack) {
        return UseAnim.DRINK;
    }
}
