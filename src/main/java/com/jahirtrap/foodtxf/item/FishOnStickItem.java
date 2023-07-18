package com.jahirtrap.foodtxf.item;

import com.jahirtrap.foodtxf.FoodtxfModElements;
import com.jahirtrap.foodtxf.itemgroup.FoodTXFItemGroup;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.world.World;
import net.minecraftforge.registries.ObjectHolder;

@FoodtxfModElements.ModElement.Tag
public class FishOnStickItem extends FoodtxfModElements.ModElement {
    @ObjectHolder("foodtxf:fish_on_stick")
    public static final Item block = null;

    public FishOnStickItem(FoodtxfModElements instance) {
        super(instance, 32);
    }

    @Override
    public void initElements() {
        elements.items.add(() -> new ItemCustom());
    }

    public static class ItemCustom extends Item {
        public ItemCustom() {
            super(new Item.Properties().tab(FoodTXFItemGroup.tab).stacksTo(64).rarity(Rarity.COMMON)
                    .food((new Food.Builder()).nutrition(4).saturationMod(0.25f)

                            .build()));
            setRegistryName("fish_on_stick");
        }

        @Override
        public int getEnchantmentValue() {
            return 0;
        }

        @Override
        public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
            return 1F;
        }

        @Override
        public ItemStack finishUsingItem(ItemStack itemstack, World world, LivingEntity entity) {
            ItemStack retval = new ItemStack(Items.STICK);
            super.finishUsingItem(itemstack, world, entity);
            if (itemstack.isEmpty()) {
                return retval;
            } else {
                if (entity instanceof PlayerEntity) {
                    PlayerEntity player = (PlayerEntity) entity;
                    if (!player.isCreative() && !player.inventory.add(retval))
                        player.drop(retval, false);
                }
                return itemstack;
            }
        }
    }
}
