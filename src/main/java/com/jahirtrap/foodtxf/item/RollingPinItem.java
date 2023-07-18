package com.jahirtrap.foodtxf.item;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.jahirtrap.foodtxf.FoodtxfModElements;
import com.jahirtrap.foodtxf.itemgroup.FoodTXFItemGroup;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.registries.ObjectHolder;

@FoodtxfModElements.ModElement.Tag
public class RollingPinItem extends FoodtxfModElements.ModElement {
    @ObjectHolder("foodtxf:rolling_pin")
    public static final Item block = null;

    public RollingPinItem(FoodtxfModElements instance) {
        super(instance, 67);
    }

    @Override
    public void initElements() {
        elements.items.add(() -> new ItemToolCustom() {
            @Override
            public boolean hasCraftingRemainingItem() {
                return true;
            }

            @Override
            public ItemStack getContainerItem(ItemStack itemstack) {
                return new ItemStack(this);
            }
        }.setRegistryName("rolling_pin"));
    }

    private static class ItemToolCustom extends Item {
        protected ItemToolCustom() {
            super(new Item.Properties().tab(FoodTXFItemGroup.tab).durability(0));
        }

        @Override
        public float getDestroySpeed(ItemStack itemstack, BlockState blockstate) {
            return 1;
        }

        @Override
        public boolean mineBlock(ItemStack stack, World worldIn, BlockState state, BlockPos pos, LivingEntity entityLiving) {
            stack.hurtAndBreak(1, entityLiving, i -> i.broadcastBreakEvent(EquipmentSlotType.MAINHAND));
            return true;
        }

        @Override
        public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
            stack.hurtAndBreak(2, attacker, i -> i.broadcastBreakEvent(EquipmentSlotType.MAINHAND));
            return true;
        }

        @Override
        public int getEnchantmentValue() {
            return 0;
        }

        @Override
        public Multimap<Attribute, AttributeModifier> getDefaultAttributeModifiers(EquipmentSlotType equipmentSlot) {
            if (equipmentSlot == EquipmentSlotType.MAINHAND) {
                ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
                builder.putAll(super.getDefaultAttributeModifiers(equipmentSlot));
                builder.put(Attributes.ATTACK_DAMAGE,
                        new AttributeModifier(BASE_ATTACK_DAMAGE_UUID, "Tool modifier", 1.5f, AttributeModifier.Operation.ADDITION));
                builder.put(Attributes.ATTACK_SPEED,
                        new AttributeModifier(BASE_ATTACK_DAMAGE_UUID, "Tool modifier", -2.8, AttributeModifier.Operation.ADDITION));
                return builder.build();
            }
            return super.getDefaultAttributeModifiers(equipmentSlot);
        }
    }
}
