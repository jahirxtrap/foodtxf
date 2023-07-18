package com.jahirtrap.foodtxf.item;

import com.jahirtrap.foodtxf.init.FoodtxfModItems;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;

public class GlassOfLavaItem extends BaseReturnItem {
    public GlassOfLavaItem() {
        super(FoodtxfModItems.GLASS.get(), "lava", 64, (new FoodProperties.Builder()).nutrition(1).alwaysEat()
                .build());
    }

    @Override
    public UseAnim getUseAnimation(ItemStack itemstack) {
        return UseAnim.DRINK;
    }
}
