package com.jahirtrap.foodtxf.item;

import com.jahirtrap.foodtxf.util.RepairableItem;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.minecraft.core.Holder;
import net.minecraft.core.component.DataComponents;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.DamageTypeTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemStackTemplate;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.component.BlocksAttacks;

import java.util.List;
import java.util.Optional;

import static com.jahirtrap.foodtxf.util.CommonUtils.hurt;

public class BaseSkilletItem extends Item implements RepairableItem, FabricItem {
    public BaseSkilletItem(ToolMaterial material, Item.Properties properties) {
        super(properties.sword(material, 4f, -2.6f).delayedComponent(DataComponents.BLOCKS_ATTACKS, context -> new BlocksAttacks(0.25F, 1.0F, List.of(new BlocksAttacks.DamageReduction(90.0F, Optional.empty(), 0.0F, 1.0F)), new BlocksAttacks.ItemDamageFunction(3.0F, 1.0F, 1.0F), Optional.of(context.getOrThrow(DamageTypeTags.BYPASSES_SHIELD)), Optional.of(Holder.direct(SoundEvents.ANVIL_PLACE)), Optional.of(Holder.direct(SoundEvents.ANVIL_BREAK)))));
    }

    @Override
    public ItemStackTemplate getCraftingRemainder(ItemStack stack) {
        return ItemStackTemplate.fromNonEmptyStack(hurt(1, stack));
    }

    @Override
    public boolean isRepairable() {
        return false;
    }
}
