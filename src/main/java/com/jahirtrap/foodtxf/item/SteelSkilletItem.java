package com.jahirtrap.foodtxf.item;

import com.jahirtrap.foodtxf.FoodtxfModElements;
import com.jahirtrap.foodtxf.itemgroup.FoodTXFItemGroup;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.registries.ObjectHolder;

@FoodtxfModElements.ModElement.Tag
public class SteelSkilletItem extends FoodtxfModElements.ModElement {
    @ObjectHolder("foodtxf:steel_skillet")
    public static final Item block = null;

    public SteelSkilletItem(FoodtxfModElements instance) {
        super(instance, 63);
    }

    @Override
    public void initElements() {
        elements.items.add(() -> new SwordItem(new IItemTier() {
            public int getUses() {
                return 501;
            }

            public float getSpeed() {
                return 6.5f;
            }

            public float getAttackDamageBonus() {
                return 3f;
            }

            public int getLevel() {
                return 2;
            }

            public int getEnchantmentValue() {
                return 14;
            }

            public Ingredient getRepairIngredient() {
                return Ingredient.EMPTY;
            }
        }, 3, -2.6f, new Item.Properties().tab(FoodTXFItemGroup.tab)) {
            @Override
            public boolean hasCraftingRemainingItem() {
                return true;
            }

            @Override
            public ItemStack getContainerItem(ItemStack itemstack) {
                ItemStack retval = new ItemStack(this);
                retval.setDamageValue(itemstack.getDamageValue() + 1);
                if (retval.getDamageValue() >= retval.getMaxDamage()) {
                    return ItemStack.EMPTY;
                }
                return retval;
            }

            @Override
            public boolean isRepairable(ItemStack itemstack) {
                return false;
            }
        }.setRegistryName("steel_skillet"));
    }
}
