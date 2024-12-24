package com.jahirtrap.foodtxf.item;

import com.jahirtrap.foodtxf.event.EntityDrinksEvent;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.level.Level;

import static com.jahirtrap.foodtxf.util.CommonUtils.container;

public class ContainerFoodItem extends Item {
    private final int fluidType;

    public ContainerFoodItem(int itemRet, int nutrition, float saturation, int fluidType, int stack, boolean drink, Properties properties) {
        super(properties.stacksTo(stack)
                .food(createProperties(nutrition, saturation, drink), drink ? Consumables.DEFAULT_DRINK : Consumables.DEFAULT_FOOD)
                .usingConvertsTo(container.get(itemRet)).craftRemainder(((itemRet == 0 || itemRet == 4) ? container.get(itemRet) : ItemStack.EMPTY.getItem())));
        this.fluidType = fluidType;
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

    public ContainerFoodItem(int itemRet, int fluidType, Properties properties) {
        this(itemRet, 0, 0, fluidType, 64, true, properties);
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
    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity entity) {
        EntityDrinksEvent.execute(entity, fluidType);
        return super.finishUsingItem(stack, level, entity);
    }
}
