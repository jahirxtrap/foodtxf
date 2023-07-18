package com.jahirtrap.foodtxf.item;

import com.jahirtrap.foodtxf.FoodtxfModElements;
import com.jahirtrap.foodtxf.itemgroup.FoodTXFItemGroup;
import net.minecraft.block.BlockState;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Rarity;
import net.minecraftforge.registries.ObjectHolder;

@FoodtxfModElements.ModElement.Tag
public class CheeseEmpanadaItem extends FoodtxfModElements.ModElement {
    @ObjectHolder("foodtxf:cheese_empanada")
    public static final Item block = null;

    public CheeseEmpanadaItem(FoodtxfModElements instance) {
        super(instance, 26);
    }

    @Override
    public void initElements() {
        elements.items.add(() -> new ItemCustom());
    }

    public static class ItemCustom extends Item {
        public ItemCustom() {
            super(new Item.Properties().tab(FoodTXFItemGroup.tab).stacksTo(64).rarity(Rarity.COMMON)
                    .food((new Food.Builder()).nutrition(9).saturationMod(0.6f)

                            .build()));
            setRegistryName("cheese_empanada");
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
