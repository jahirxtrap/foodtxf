package com.jahirtrap.foodtxf.item;

import com.jahirtrap.foodtxf.event.PlayerDropsFleshKnifeEvent;
import com.jahirtrap.foodtxf.init.FoodtxfModConfig;
import com.jahirtrap.foodtxf.util.RepairableItem;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;

import static com.jahirtrap.foodtxf.FoodtxfMod.TAB_FOOD_TXF;

public class BaseKnifeItem extends SwordItem implements RepairableItem {
    public BaseKnifeItem(int uses, float speed, float damage, int level, int enchantment, Ingredient repair, Properties properties) {
        super(new Tier() {
            public int getUses() {
                return uses;
            }

            public float getSpeed() {
                return speed;
            }

            public float getAttackDamageBonus() {
                return damage;
            }

            public int getLevel() {
                return level;
            }

            public int getEnchantmentValue() {
                return enchantment;
            }

            public Ingredient getRepairIngredient() {
                return repair;
            }
        }, 3, -2f, properties.tab(TAB_FOOD_TXF));
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
        InteractionResultHolder<ItemStack> holder = super.use(world, entity, hand);
        if (FoodtxfModConfig.enableCannibalism && FoodtxfModConfig.knifeDropFlesh) {
            PlayerDropsFleshKnifeEvent.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity, holder.getObject());
        }
        return holder;
    }

    @Override
    public boolean hasCraftingRemainingItem() {
        return true;
    }

    @Override
    public ItemStack getRecipeRemainder(ItemStack itemstack) {
        ItemStack retVal = new ItemStack(this);
        retVal.setDamageValue(itemstack.getDamageValue() + 1);
        if (retVal.getDamageValue() >= retVal.getMaxDamage()) {
            return ItemStack.EMPTY;
        }
        return retVal;
    }

    @Override
    public boolean isRepairable() {
        return false;
    }
}
