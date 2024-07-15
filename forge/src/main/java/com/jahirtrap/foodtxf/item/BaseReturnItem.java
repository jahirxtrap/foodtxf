package com.jahirtrap.foodtxf.item;

import com.jahirtrap.foodtxf.event.EntityDrinksEvent;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class BaseReturnItem extends BaseItem {
    private final Item itemRet;
    private final int fluidType;

    public BaseReturnItem(Item item, int type, int stack, FoodProperties foodProperties) {
        super(new Item.Properties().stacksTo(stack)
                .food(foodProperties));
        this.itemRet = item;
        this.fluidType = type;
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity entity) {
        ItemStack retVal = new ItemStack(itemRet);
        super.finishUsingItem(stack, level, entity);
        EntityDrinksEvent.execute(entity, fluidType);

        if (stack.isEmpty()) {
            return retVal;
        } else {
            if (entity instanceof Player player && !player.getAbilities().instabuild) {
                if (!player.getInventory().add(retVal)) player.drop(retVal, false);
            }
            return stack;
        }
    }
}
