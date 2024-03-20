package com.jahirtrap.foodtxf.item;

import com.jahirtrap.foodtxf.event.FillFluidEvent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class ThermosItem extends BaseItem {
    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        InteractionResultHolder<ItemStack> holder = super.use(level, player, hand);
        FillFluidEvent.execute(level, player);
        return holder;
    }
}
