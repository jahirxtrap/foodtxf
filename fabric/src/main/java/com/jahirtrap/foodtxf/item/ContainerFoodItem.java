package com.jahirtrap.foodtxf.item;

import com.jahirtrap.foodtxf.util.ContainerItem;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;

import static com.jahirtrap.foodtxf.util.CommonUtils.container;

public class ContainerFoodItem extends BaseReturnItem implements ContainerItem, FabricItem {
    private final boolean drinkAnim;
    private final int itemRet;

    public ContainerFoodItem(int itemRet, int nutrition, float saturation, int fluidType, int stack, boolean drinkAnim) {
        super(container.get(itemRet), fluidType, stack, createProperties(nutrition, saturation, drinkAnim));
        this.drinkAnim = drinkAnim;
        this.itemRet = itemRet;
    }

    public ContainerFoodItem(int itemRet, int nutrition, float saturation, int fluidType, boolean drinkAnim) {
        this(itemRet, nutrition, saturation, fluidType, 64, drinkAnim);
    }

    public ContainerFoodItem(int itemRet, int nutrition, float saturation, boolean drinkAnim) {
        this(itemRet, nutrition, saturation, 0, 64, drinkAnim);
    }

    public ContainerFoodItem(int itemRet, int nutrition, float saturation) {
        this(itemRet, nutrition, saturation, 0, 64, false);
    }

    public ContainerFoodItem(int itemRet, int nutrition, int fluidType, boolean drinkAnim) {
        this(itemRet, nutrition, 0, fluidType, 64, drinkAnim);
    }

    public ContainerFoodItem(int fluidType) {
        this(4, 0, 0, fluidType, 16, true);
    }

    private static FoodProperties createProperties(int nutrition, float saturation, boolean drinkAnim) {
        FoodProperties.Builder builder = new FoodProperties.Builder();
        if (nutrition != 0) builder.nutrition(nutrition);
        if (saturation != 0) builder.saturationMod(saturation);
        if (drinkAnim) builder.alwaysEat();
        return builder.build();
    }

    @Override
    public UseAnim getUseAnimation(ItemStack stack) {
        return drinkAnim ? UseAnim.DRINK : UseAnim.EAT;
    }

    @Override
    public boolean hasCraftingRemainingItem() {
        return itemRet == 0 || itemRet == 4;
    }

    @Override
    public ItemStack getContainerItem(ItemStack stack) {
        if (itemRet == 0 || itemRet == 4) return new ItemStack(container.get(itemRet));
        return ItemStack.EMPTY;
    }
}
