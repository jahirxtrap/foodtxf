package com.jahirtrap.foodtxf.item;

import com.jahirtrap.foodtxf.init.FoodtxfModItems;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;

public class BaseJuiceItem extends BaseReturnItem {
    public BaseJuiceItem() {
        super(FoodtxfModItems.GLASS.get(), "none", 64, (new FoodProperties.Builder()).nutrition(4).saturationMod(0.75f).alwaysEat()
                .build());
    }

    @Override
    public UseAnim getUseAnimation(ItemStack itemstack) {
        return UseAnim.DRINK;
    }
}
