package com.jahirtrap.foodtxf.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.ItemStack;

import static com.jahirtrap.foodtxf.util.CommonUtils.container;

public class ContainerFoodItem extends BaseReturnItem {
    private final int itemRet;

    public ContainerFoodItem(int itemRet, int nutrition, float saturation, int fluidType, int stack, boolean drink, Properties properties) {
        super(container.get(itemRet), fluidType, stack, createProperties(nutrition, saturation, drink), drink, properties);
        this.itemRet = itemRet;
    }

    public ContainerFoodItem(int itemRet, int nutrition, float saturation, int fluidType, boolean drink, Properties properties) {
        this(itemRet, nutrition, saturation, fluidType, 64, drink, properties);
    }

    public ContainerFoodItem(int itemRet, int nutrition, float saturation, boolean drink, Properties properties) {
        this(itemRet, nutrition, saturation, 0, 64, drink, properties);
    }

    public ContainerFoodItem(int itemRet, int nutrition, float saturation, Properties properties) {
        this(itemRet, nutrition, saturation, 0, 64, false, properties);
    }

    public ContainerFoodItem(int itemRet, int nutrition, int fluidType, boolean drink, Properties properties) {
        this(itemRet, nutrition, 0, fluidType, 64, drink, properties);
    }

    public ContainerFoodItem(int fluidType, Properties properties) {
        this(4, 0, 0, fluidType, 16, true, properties);
    }

    private static FoodProperties createProperties(int nutrition, float saturation, boolean drink) {
        FoodProperties.Builder builder = new FoodProperties.Builder();
        if (nutrition != 0) builder.nutrition(nutrition);
        if (saturation != 0) builder.saturationModifier(saturation);
        if (drink) builder.alwaysEdible();
        return builder.build();
    }

    @Override
    public ItemStack getCraftingRemainder(ItemStack stack) {
        if (itemRet == 0 || itemRet == 4) return new ItemStack(container.get(itemRet));
        return ItemStack.EMPTY;
    }
}
