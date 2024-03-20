package com.jahirtrap.foodtxf.event;

import com.jahirtrap.foodtxf.init.FoodtxfModItems;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.items.ItemHandlerHelper;

import static com.jahirtrap.foodtxf.util.CommonUtils.*;

public class FillFluidEvent {
    public static void execute(LevelAccessor accesor, Entity entity) {
        if (!(entity instanceof Player player)) return;
        Item mainHandItem = player.getMainHandItem().getItem(), offHandItem = player.getOffhandItem().getItem();
        Item thermosItem = FoodtxfModItems.THERMOS.get();
        boolean mainHand;
        String sound;

        Block block = getViewedBlock(accesor, entity);
        if (mainHandItem == offHandItem) return;
        if (mainHandItem == thermosItem) mainHand = true;
        else if (offHandItem == thermosItem) mainHand = false;
        else return;

        ItemStack Ist;
        if (block == Blocks.WATER) {
            Ist = new ItemStack(FoodtxfModItems.WATER_THERMOS.get());
            sound = "item.bucket.fill";
        } else if (block == Blocks.LAVA) {
            Ist = new ItemStack(FoodtxfModItems.LAVA_THERMOS.get());
            sound = "item.bucket.fill_lava";
        } else return;

        ItemStack thermosIst = new ItemStack(FoodtxfModItems.THERMOS.get());
        consumeItem(player, thermosIst, mainHand);

        if (mainHand) player.swing(InteractionHand.MAIN_HAND, true);
        else player.swing(InteractionHand.OFF_HAND, true);
        Ist.setCount(1);
        ItemHandlerHelper.giveItemToPlayer(player, Ist);
        playSound(accesor, entity, sound);
    }
}
