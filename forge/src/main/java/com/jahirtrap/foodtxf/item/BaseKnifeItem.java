package com.jahirtrap.foodtxf.item;

import com.jahirtrap.foodtxf.event.PlayerDropsFleshKnifeEvent;
import com.jahirtrap.foodtxf.init.FoodtxfModConfig;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;

public class BaseKnifeItem extends SwordItem {
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
        }, 3, -2f, properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
        InteractionResultHolder<ItemStack> holder = super.use(world, entity, hand);
        if (FoodtxfModConfig.ENABLE_CANNIBALISM.get() && FoodtxfModConfig.KNIFE_DROP_FLESH.get()) {
            PlayerDropsFleshKnifeEvent.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity, holder.getObject());
        }
        return holder;
    }

    @Override
    public boolean hasCraftingRemainingItem(ItemStack itemstack) {
        return true;
    }

    @Override
    public ItemStack getCraftingRemainingItem(ItemStack itemstack) {
        ItemStack retVal = new ItemStack(this);
        retVal.setDamageValue(itemstack.getDamageValue() + 1);
        if (retVal.getDamageValue() >= retVal.getMaxDamage()) {
            return ItemStack.EMPTY;
        }
        return retVal;
    }

    @Override
    public boolean isRepairable(ItemStack itemstack) {
        return false;
    }
}