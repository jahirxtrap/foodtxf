package com.jahirtrap.foodtxf.item;

import com.jahirtrap.foodtxf.event.EntityDrinksEvent;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import java.util.Objects;

import static com.jahirtrap.foodtxf.util.CommonUtils.fluid;

public class BaseReturnItem extends Item {
    private final Item itemRet;
    private final String fluidType;

    public BaseReturnItem(Item item, String type, int stack, FoodProperties foodProperties) {
        super(new Item.Properties().stacksTo(stack)
                .food(foodProperties));
        this.itemRet = item;
        this.fluidType = type;
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity entity) {
        ItemStack retVal = new ItemStack(itemRet);
        super.finishUsingItem(stack, level, entity);
        if (Objects.equals(this.fluidType, fluid.get(1))) {
            int x = entity.getBlockX();
            int y = entity.getBlockY();
            int z = entity.getBlockZ();

            EntityDrinksEvent.water(level, x, y, z, entity);
        } else if (Objects.equals(this.fluidType, fluid.get(2))) EntityDrinksEvent.lava(entity);
        else if (Objects.equals(this.fluidType, fluid.get(3))) EntityDrinksEvent.milk(entity);

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
