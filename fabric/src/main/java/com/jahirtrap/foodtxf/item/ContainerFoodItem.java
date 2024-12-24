package com.jahirtrap.foodtxf.item;

import com.jahirtrap.foodtxf.event.EntityDrinksEvent;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;

import static com.jahirtrap.foodtxf.util.CommonUtils.container;

public class ContainerFoodItem extends BaseItem {
    private final boolean drink;
    private final int fluidType;
    private final int itemRet;

    public ContainerFoodItem(int itemRet, int nutrition, float saturation, int fluidType, int stack, boolean drink) {
        super(new Item.Properties().stacksTo(stack)
                .food(createProperties(nutrition, saturation, drink))
                .craftRemainder(((itemRet == 0 || itemRet == 4) ? container.get(itemRet) : ItemStack.EMPTY.getItem())));
        this.drink = drink;
        this.fluidType = fluidType;
        this.itemRet = itemRet;
    }

    public ContainerFoodItem(int itemRet, int nutrition, float saturation, int fluidType, boolean drink) {
        this(itemRet, nutrition, saturation, fluidType, 64, drink);
    }

    public ContainerFoodItem(int itemRet, int nutrition, float saturation, boolean drink) {
        this(itemRet, nutrition, saturation, 0, 64, drink);
    }

    public ContainerFoodItem(int itemRet, int nutrition, float saturation) {
        this(itemRet, nutrition, saturation, 0, 64, false);
    }

    public ContainerFoodItem(int itemRet, int fluidType) {
        this(itemRet, 0, 0, fluidType, 64, true);
    }

    public ContainerFoodItem(int fluidType) {
        this(4, 0, 0, fluidType, 16, true);
    }

    private static FoodProperties createProperties(int nutrition, float saturation, boolean drink) {
        FoodProperties.Builder builder = new FoodProperties.Builder();
        if (nutrition != 0) builder.nutrition(nutrition);
        if (saturation != 0) builder.saturationMod(saturation);
        if (drink) builder.alwaysEat();
        return builder.build();
    }

    @Override
    public UseAnim getUseAnimation(ItemStack stack) {
        return drink ? UseAnim.DRINK : UseAnim.EAT;
    }

    @Override
    public SoundEvent getEatingSound() {
        return drink ? getDrinkingSound() : super.getEatingSound();
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity entity) {
        ItemStack retVal = new ItemStack(container.get(itemRet));
        EntityDrinksEvent.execute(entity, fluidType);
        super.finishUsingItem(stack, level, entity);

        if (stack.isEmpty()) {
            return retVal;
        } else {
            if (entity instanceof Player player && !player.getAbilities().instabuild)
                if (!player.getInventory().add(retVal)) player.drop(retVal, false);
            return stack;
        }
    }
}
