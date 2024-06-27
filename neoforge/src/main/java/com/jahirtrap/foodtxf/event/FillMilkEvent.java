package com.jahirtrap.foodtxf.event;

import com.jahirtrap.foodtxf.init.FoodtxfModItems;
import net.minecraft.world.InteractionHand;
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
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent.EntityInteract;
import net.neoforged.neoforge.items.ItemHandlerHelper;

import static com.jahirtrap.foodtxf.util.CommonUtils.*;

@Mod.EventBusSubscriber
public class FillMilkEvent {
    @SubscribeEvent
    public static void onPlayerInteractEntity(EntityInteract event) {
        if (event.getHand() != event.getEntity().getUsedItemHand()) return;
        execute(event.getLevel(), event.getTarget(), event.getEntity());
    }

    private static void execute(LevelAccessor accesor, Entity target, Entity entity) {
        if (!(target instanceof LivingEntity livTar)) return;
        if (!(entity instanceof Player player)) return;
        boolean mainHand;

        Item mainHandItem = player.getMainHandItem().getItem(), offHandItem = player.getOffhandItem().getItem();
        Item thermosItem = FoodtxfModItems.THERMOS.get();

        if (mainHandItem == thermosItem) mainHand = true;
        else if (offHandItem == thermosItem) mainHand = false;
        else return;

        Block block = getViewedBlock(accesor, entity);

        if (!(block == Blocks.WATER) && !(block == Blocks.LAVA)) {
            if ((target instanceof Cow || target instanceof Goat) && !(livTar.isBaby())) {
                ItemStack thermosIst = new ItemStack(FoodtxfModItems.THERMOS.get());
                consumeItem(player, thermosIst, mainHand);

                if (mainHand) player.swing(InteractionHand.MAIN_HAND, true);
                else player.swing(InteractionHand.OFF_HAND, true);
                ItemStack milkThermosIst = new ItemStack(FoodtxfModItems.MILK_THERMOS.get());
                milkThermosIst.setCount(1);
                ItemHandlerHelper.giveItemToPlayer(player, milkThermosIst);

                String sound;
                if (target instanceof Cow) sound = "entity.cow.milk";
                else sound = "entity.goat.milk";
                playSound(accesor, entity, sound);
            }
        }
    }
}
