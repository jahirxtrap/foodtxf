package com.jahirtrap.foodtxf.item;

import com.jahirtrap.foodtxf.event.FillFluidEvent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class ThermosItem extends BaseContainerItem {
    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
        InteractionResultHolder<ItemStack> holder = super.use(world, entity, hand);
        FillFluidEvent.execute(world, entity);
        return holder;
    }
}
