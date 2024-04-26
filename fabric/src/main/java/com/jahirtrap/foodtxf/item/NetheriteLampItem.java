package com.jahirtrap.foodtxf.item;

import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.level.block.Block;

import java.util.UUID;

public class NetheriteLampItem extends BaseWearableItem {

    public NetheriteLampItem(Block block, Properties properties) {
        super(block, properties.fireResistant().rarity(Rarity.RARE).attributes(createAttributes()));
    }

    public static ItemAttributeModifiers createAttributes() {
        return ItemAttributeModifiers.builder()
                .add(Attributes.ARMOR,
                        new AttributeModifier(UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150"), "Item modifier", 2.0F, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.HEAD)
                .add(Attributes.ARMOR_TOUGHNESS,
                        new AttributeModifier(UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150"), "Item modifier", 2.0F, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.HEAD)
                .add(Attributes.KNOCKBACK_RESISTANCE,
                        new AttributeModifier(UUID.fromString("0-1-438d-0-28d34"), "Item modifier", 0.1F, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.HEAD)
                .build();
    }
}
