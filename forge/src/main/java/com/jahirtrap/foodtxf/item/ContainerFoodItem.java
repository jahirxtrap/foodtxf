package com.jahirtrap.foodtxf.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;

import static com.jahirtrap.foodtxf.util.CommonUtils.container;
import static com.jahirtrap.foodtxf.util.CommonUtils.fluid;

public class ContainerFoodItem extends BaseReturnItem {
    private final boolean drinkAnim;

    public ContainerFoodItem(int itemRet, int nutrition, float saturation, int fluidType, boolean drinkAnim) {
        super(container.get(itemRet), fluid.get(fluidType), 64, createProperties(nutrition, saturation, drinkAnim));
        this.drinkAnim = drinkAnim;
    }

    public ContainerFoodItem(int itemRet, int nutrition, float saturation, boolean drinkAnim) {
        this(itemRet, nutrition, saturation, 0, drinkAnim);
    }

    public ContainerFoodItem(int itemRet, int nutrition, float saturation) {
        this(itemRet, nutrition, saturation, 0, false);
    }

    public ContainerFoodItem(int itemRet, int nutrition, int fluidType, boolean drinkAnim) {
        this(itemRet, nutrition, 0.0f, fluidType, drinkAnim);
    }

    private static FoodProperties createProperties(int nutrition, float saturation, boolean drinkAnim) {
        FoodProperties.Builder builder = new FoodProperties.Builder();
        if (nutrition != 0) builder.nutrition(nutrition);
        if (saturation != 0.0f) builder.saturationMod(saturation);
        if (drinkAnim) builder.alwaysEat();
        return builder.build();
    }

    @Override
    public UseAnim getUseAnimation(ItemStack stack) {
        return this.drinkAnim ? UseAnim.DRINK : UseAnim.EAT;
    }
}
