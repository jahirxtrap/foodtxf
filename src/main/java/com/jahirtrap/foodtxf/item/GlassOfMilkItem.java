package com.jahirtrap.foodtxf.item;

import com.jahirtrap.foodtxf.FoodtxfModElements;
import com.jahirtrap.foodtxf.itemgroup.FoodTXFItemGroup;
import com.jahirtrap.foodtxf.procedures.EntityDrinksMilkProcedure;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;
import net.minecraftforge.registries.ObjectHolder;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

@FoodtxfModElements.ModElement.Tag
public class GlassOfMilkItem extends FoodtxfModElements.ModElement {
    @ObjectHolder("foodtxf:glass_of_milk")
    public static final Item block = null;

    public GlassOfMilkItem(FoodtxfModElements instance) {
        super(instance, 45);
    }

    @Override
    public void initElements() {
        elements.items.add(() -> new ItemCustom());
    }

    public static class ItemCustom extends Item {
        public ItemCustom() {
            super(new Item.Properties().tab(FoodTXFItemGroup.tab).stacksTo(64).rarity(Rarity.COMMON)
                    .food((new Food.Builder()).nutrition(4).saturationMod(0.5f).alwaysEat().build()));
            setRegistryName("glass_of_milk");
        }

        @Override
        public UseAction getUseAnimation(ItemStack itemstack) {
            return UseAction.DRINK;
        }

        @Override
        public net.minecraft.util.SoundEvent getEatingSound() {
            return SoundEvents.GENERIC_DRINK;
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
            ItemStack retval = new ItemStack(GlassItem.block);
            super.finishUsingItem(itemstack, world, entity);
            double x = entity.getX();
            double y = entity.getY();
            double z = entity.getZ();

            EntityDrinksMilkProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
                    (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
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
