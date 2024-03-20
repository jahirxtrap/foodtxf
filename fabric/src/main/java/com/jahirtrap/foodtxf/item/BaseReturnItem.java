package com.jahirtrap.foodtxf.item;

import com.jahirtrap.foodtxf.event.EntityDrinksEvent;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.Level;

import static com.jahirtrap.foodtxf.FoodtxfModTab.TAB_FOOD_TXF;

public class BaseReturnItem extends Item {
    Item itemRet;
    String fluidType;

    public BaseReturnItem(Item item, String type, int stack, FoodProperties foodProperties) {
        super(new Item.Properties().tab(TAB_FOOD_TXF).stacksTo(stack).rarity(Rarity.COMMON)
                .food(foodProperties));
        itemRet = item;
        fluidType = type;
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity entity) {
        ItemStack retVal = new ItemStack(itemRet);
        super.finishUsingItem(stack, level, entity);
        if (fluidType == "water") {
            int x = entity.getBlockX();
            int y = entity.getBlockY();
            int z = entity.getBlockZ();

            EntityDrinksEvent.water(level, x, y, z, entity);
        } else if (fluidType == "lava") EntityDrinksEvent.lava(entity);
        else if (fluidType == "milk") EntityDrinksEvent.milk(entity);

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
