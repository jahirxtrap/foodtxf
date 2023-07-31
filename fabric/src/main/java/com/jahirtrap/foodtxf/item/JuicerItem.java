package com.jahirtrap.foodtxf.item;

import com.jahirtrap.foodtxf.util.RepairableItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;

import static com.jahirtrap.foodtxf.FoodtxfMod.TAB_FOOD_TXF;


public class JuicerItem extends Item implements RepairableItem {
    public JuicerItem() {
        super(new Item.Properties().tab(TAB_FOOD_TXF).durability(200).rarity(Rarity.COMMON));
    }

    @Override
    public boolean hasCraftingRemainingItem() {
        return true;
    }

    @Override
    public ItemStack getRecipeRemainder(ItemStack itemstack) {
        ItemStack retval = new ItemStack(this);
        retval.setDamageValue(itemstack.getDamageValue() + 1);
        if (retval.getDamageValue() >= retval.getMaxDamage()) {
            return ItemStack.EMPTY;
        }
        return retval;
    }

    @Override
    public boolean isRepairable() {
        return false;
    }

    @Override
    public int getEnchantmentValue() {
        return 5;
    }
}
