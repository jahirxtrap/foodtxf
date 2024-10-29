package com.jahirtrap.foodtxf.item;

import com.jahirtrap.foodtxf.event.FillFluidEvent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;

public class FluidContainerItem extends Item {
    private final int type;

    public FluidContainerItem(int type) {
        super(new Item.Properties());
        this.type = type;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);
        BlockHitResult hitResult = FluidContainerItem.getPlayerPOVHitResult(level, player, ClipContext.Fluid.SOURCE_ONLY);

        if (FillFluidEvent.execute(level, player, stack, null, hitResult, hand, type))
            return new InteractionResultHolder<>(InteractionResult.SUCCESS, stack);

        return super.use(level, player, hand);
    }

    @Override
    public InteractionResult interactLivingEntity(ItemStack stack, Player player, LivingEntity target, InteractionHand hand) {
        if (FillFluidEvent.execute(player.level(), player, stack, target, null, hand, type))
            return InteractionResult.SUCCESS;

        return super.interactLivingEntity(stack, player, target, hand);
    }
}
