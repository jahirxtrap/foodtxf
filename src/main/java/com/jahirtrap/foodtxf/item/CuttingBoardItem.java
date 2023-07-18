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
public class CuttingBoardItem extends FoodtxfModElements.ModElement {
    @ObjectHolder("foodtxf:cutting_board")
    public static final Item block = null;

    public CuttingBoardItem(FoodtxfModElements instance) {
        super(instance, 65);
    }

    @Override
    public void initElements() {
        elements.items.add(() -> new ItemCustom());
    }

    public static class ItemCustom extends Item {
        public ItemCustom() {
            super(new Item.Properties().tab(FoodTXFItemGroup.tab).stacksTo(1).rarity(Rarity.COMMON));
            setRegistryName("cutting_board");
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
            return new ItemStack(this);
        }

        @Override
        public int getEnchantmentValue() {
            return 0;
        }

        @Override
        public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
            return 1F;
        }
    }
}
