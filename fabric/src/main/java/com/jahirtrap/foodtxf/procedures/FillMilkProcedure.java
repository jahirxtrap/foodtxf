package com.jahirtrap.foodtxf.procedures;

import com.jahirtrap.foodtxf.init.FoodtxfModItems;
import net.fabricmc.fabric.api.event.player.UseEntityCallback;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.animal.Cow;
import net.minecraft.world.entity.animal.goat.Goat;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import static com.jahirtrap.foodtxf.util.CommonUtils.*;

public class FillMilkProcedure {
    public FillMilkProcedure() {
        UseEntityCallback.EVENT.register((entity, world, hand, target, hitResult) -> {
            if (hand == entity.getUsedItemHand())
                execute(world, target, entity);
            return InteractionResult.PASS;
        });
    }

    private static void execute(LevelAccessor world, Entity target, Entity entity) {
        if (!(target instanceof LivingEntity livTar)) return;
        if (!(entity instanceof Player player)) return;
        boolean mainHand;

        Item mainHandItem = player.getMainHandItem().getItem(), offHandItem = player.getOffhandItem().getItem();
        Item thermosItem = FoodtxfModItems.THERMOS;

        if (mainHandItem == thermosItem) mainHand = true;
        else if (offHandItem == thermosItem) mainHand = false;
        else return;

        Block block = getViewedBlock(world, entity);

        if (!(block == Blocks.WATER) && !(block == Blocks.LAVA)) {
            if ((target instanceof Cow || target instanceof Goat) && !(livTar.isBaby())) {
                ItemStack thermosIst = new ItemStack(FoodtxfModItems.THERMOS);
                consumeItem(player, thermosIst, mainHand);

                if (mainHand) player.swing(InteractionHand.MAIN_HAND, true);
                else player.swing(InteractionHand.OFF_HAND, true);
                ItemStack milkThermosIst = new ItemStack(FoodtxfModItems.MILK_THERMOS);
                milkThermosIst.setCount(1);
                player.getInventory().add(milkThermosIst);

                String sound;
                if (target instanceof Cow) sound = "entity.cow.milk";
                else sound = "entity.goat.milk";
                playSound(world, entity, sound);
            }
        }
    }
}
