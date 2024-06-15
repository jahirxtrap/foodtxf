package com.jahirtrap.foodtxf.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.level.block.Block;

public class NetheriteLampItem extends BaseWearableItem {

    public NetheriteLampItem(Block block, Properties properties) {
        super(block, properties.fireResistant().rarity(Rarity.RARE).attributes(createAttributes()));
    }

    public static ItemAttributeModifiers createAttributes() {
        return ItemAttributeModifiers.builder()
                .add(Attributes.ARMOR,
                        new AttributeModifier(ResourceLocation.withDefaultNamespace("base_armor"), 2.0F, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.HEAD)
                .add(Attributes.ARMOR_TOUGHNESS,
                        new AttributeModifier(ResourceLocation.withDefaultNamespace("base_armor_toughness"), 2.0F, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.HEAD)
                .add(Attributes.KNOCKBACK_RESISTANCE,
                        new AttributeModifier(ResourceLocation.withDefaultNamespace("base_knockback_resistance"), 0.1F, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.HEAD)
                .build();
    }
}
