package com.jahirtrap.foodtxf.item;

import com.jahirtrap.foodtxf.event.FillFluidEvent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;

public class FluidContainerItem extends BaseItem {
    private final int type;

    public FluidContainerItem(Properties properties, int type) {
        super(properties);
        this.type = type;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        InteractionResultHolder<ItemStack> holder = super.use(level, player, hand);
        ItemStack stack = player.getItemInHand(hand);
        BlockHitResult hitResult = FluidContainerItem.getPlayerPOVHitResult(level, player, ClipContext.Fluid.SOURCE_ONLY);

        if (FillFluidEvent.execute(level, player, stack, null, hitResult, hand, type))
            return new InteractionResultHolder<>(InteractionResult.SUCCESS, stack);

        return holder;
    }

    @Override
    public InteractionResult interactLivingEntity(ItemStack stack, Player player, LivingEntity target, InteractionHand hand) {
        InteractionResult holder = super.interactLivingEntity(stack, player, target, hand);

        if (FillFluidEvent.execute(player.level, player, stack, target, null, hand, type))
            return InteractionResult.SUCCESS;

        return holder;
    }
}
