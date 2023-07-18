package com.jahirtrap.foodtxf.item;

import com.jahirtrap.foodtxf.FoodtxfModElements;
import com.jahirtrap.foodtxf.itemgroup.FoodTXFItemGroup;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.registries.ObjectHolder;

@FoodtxfModElements.ModElement.Tag
public class GoldenSkilletItem extends FoodtxfModElements.ModElement {
    @ObjectHolder("foodtxf:golden_skillet")
    public static final Item block = null;

    public GoldenSkilletItem(FoodtxfModElements instance) {
        super(instance, 60);
    }

    @Override
    public void initElements() {
        elements.items.add(() -> new SwordItem(new IItemTier() {
            public int getUses() {
                return 32;
            }

            public float getSpeed() {
                return 12f;
            }

            public float getAttackDamageBonus() {
                return 1f;
            }

            public int getLevel() {
                return 0;
            }

            public int getEnchantmentValue() {
                return 22;
            }

            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(Items.GOLD_INGOT));
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
        }.setRegistryName("golden_skillet"));
    }
}
