package com.jahirtrap.foodtxf.item;

import com.jahirtrap.foodtxf.FoodtxfModElements;
import com.jahirtrap.foodtxf.itemgroup.FoodTXFItemGroup;
import net.minecraft.block.BlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Rarity;
import net.minecraft.item.UseAction;
import net.minecraftforge.registries.ObjectHolder;

@FoodtxfModElements.ModElement.Tag
public class JuicerItem extends FoodtxfModElements.ModElement {
    @ObjectHolder("foodtxf:juicer")
    public static final Item block = null;

    public JuicerItem(FoodtxfModElements instance) {
        super(instance, 68);
    }

    @Override
    public void initElements() {
        elements.items.add(() -> new ItemCustom());
    }

    public static class ItemCustom extends Item {
        public ItemCustom() {
            super(new Item.Properties().tab(FoodTXFItemGroup.tab).durability(200).rarity(Rarity.COMMON));
            setRegistryName("juicer");
        }

        @Override
        public UseAction getUseAnimation(ItemStack itemstack) {
            return UseAction.EAT;
        }

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

        @Override
        public int getEnchantmentValue() {
            return 4;
        }

        @Override
        public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
            return 1F;
        }
    }
}
