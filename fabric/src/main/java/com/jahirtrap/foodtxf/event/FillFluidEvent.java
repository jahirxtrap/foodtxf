package com.jahirtrap.foodtxf.event;

import com.jahirtrap.foodtxf.init.ModContent;
import com.jahirtrap.foodtxf.item.FluidContainerItem;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.animal.Cow;
import net.minecraft.world.entity.animal.goat.Goat;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;

import java.util.HashMap;
import java.util.Map;

public class FillFluidEvent {
    public static boolean execute(Level level, Player player, ItemStack stack, LivingEntity target, BlockHitResult hitResult, InteractionHand hand, int type) {
        if (!(stack.getItem() instanceof FluidContainerItem)) return false;
        ItemStack mainHandIst = player.getMainHandItem(), offHandIst = player.getOffhandItem();
        Map<ItemStack, Integer> addition = new HashMap<>();
        ItemStack result = ItemStack.EMPTY;
        SoundEvent sound = null;

        if (target != null && !target.isBaby()) {
            if (target instanceof Cow || target instanceof Goat) {
                if (mainHandIst.is(Items.COCOA_BEANS) || offHandIst.is(Items.COCOA_BEANS)) {
                    if (type == 0) result = new ItemStack(ModContent.CHOCOMILK_THERMOS);
                    else if (type == 1) result = new ItemStack(ModContent.GLASS_OF_CHOCOMILK);
                    addition.put(mainHandIst.is(Items.COCOA_BEANS) ? mainHandIst : offHandIst, type == 0 ? 2 : type == 1 ? 1 : 0);
                } else {
                    if (type == 0) result = new ItemStack(ModContent.MILK_THERMOS);
                    else if (type == 1) result = new ItemStack(ModContent.GLASS_OF_MILK);
                }
            } else return false;
            if (target instanceof Cow) sound = SoundEvents.COW_MILK;
            else if (target instanceof Goat) sound = SoundEvents.GOAT_MILK;
        } else if (hitResult != null && hitResult.getType() == HitResult.Type.BLOCK) {
            Block block = level.getBlockState(hitResult.getBlockPos()).getBlock();
            if (block == Blocks.WATER) {
                if (type == 0) result = new ItemStack(ModContent.WATER_THERMOS);
                else if (type == 1) result = new ItemStack(ModContent.GLASS_OF_WATER);
                sound = SoundEvents.BUCKET_FILL;
            } else if (block == Blocks.LAVA) {
                if (type == 0) result = new ItemStack(ModContent.LAVA_THERMOS);
                else if (type == 1) result = new ItemStack(ModContent.GLASS_OF_LAVA);
                sound = SoundEvents.BUCKET_FILL_LAVA;
            } else return false;
        } else return false;

        return fillItem(player, result, stack, hand, addition, sound);
    }

    private static boolean fillItem(Player player, ItemStack result, ItemStack stack, InteractionHand hand, Map<ItemStack, Integer> addition, SoundEvent sound) {
        if (!player.hasInfiniteMaterials()) {
            if (!addition.isEmpty()) {
                ItemStack key = addition.keySet().iterator().next();
                if (key.getCount() < addition.get(key)) return false;
                key.consume(addition.get(key), player);
            }
            if (stack.getCount() == 1) {
                player.setItemInHand(hand, result);
            } else {
                stack.consume(1, player);
                if (!player.getInventory().add(result)) player.drop(result, false);
            }
        } else if (!player.getInventory().add(result)) player.drop(result, false);

        player.playSound(sound);
        return true;
    }
}
