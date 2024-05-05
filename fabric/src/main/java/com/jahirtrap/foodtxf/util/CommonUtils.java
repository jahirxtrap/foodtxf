package com.jahirtrap.foodtxf.util;

import com.jahirtrap.foodtxf.init.FoodtxfModItems;
import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.component.ItemLore;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.GameType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;

import java.util.*;

public class CommonUtils {
    public static final List<String> fluid = new ArrayList<>(Arrays.asList("none", "water", "lava", "milk"));
    public static final List<Item> container = new ArrayList<>(Arrays.asList(FoodtxfModItems.BOX, Items.BOWL, FoodtxfModItems.GLASS, Items.STICK, FoodtxfModItems.THERMOS));

    public static ItemEntity dropFlesh(Entity entity, Level level, double x, double y, double z, int num) {
        ItemStack stack;
        if (entity.isOnFire()) stack = new ItemStack(FoodtxfModItems.COOKED_PLAYER_FLESH, num);
        else stack = new ItemStack(FoodtxfModItems.PLAYER_FLESH, num);
        stack.set(DataComponents.LORE, new ItemLore(Collections.singletonList(Component.literal(entity.getName().getString()).withStyle(Style.EMPTY.withColor(ChatFormatting.RED).withItalic(false)))));

        ItemEntity entityToSpawn = new ItemEntity(level, x, y, z, stack);
        entityToSpawn.setPickUpDelay(10);
        return entityToSpawn;
    }

    public static boolean checkCreativeMode(Entity entity) {
        if (entity instanceof ServerPlayer serverPlayer) {
            return serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
        } else if (entity.level().isClientSide() && entity instanceof Player player) {
            return Objects.requireNonNull(Minecraft.getInstance().getConnection()).getPlayerInfo(player.getGameProfile().getId()) != null
                    && Objects.requireNonNull(Minecraft.getInstance().getConnection().getPlayerInfo(player.getGameProfile().getId()))
                    .getGameMode() == GameType.CREATIVE;
        }
        return false;
    }

    public static Block getViewedBlock(LevelAccessor accesor, Entity entity) {
        ClipContext clipContext = new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity);
        return (accesor.getFluidState(new BlockPos(
                        entity.level().clip(clipContext).getBlockPos().getX(),
                        entity.level().clip(clipContext).getBlockPos().getY(),
                        entity.level().clip(clipContext).getBlockPos().getZ()))
                .createLegacyBlock()).getBlock();
    }

    public static void consumeItem(Player player, ItemStack Ist, boolean mainHand) {
        if (!(player.getAbilities().instabuild)) {
            ItemStack mainHandIst = player.getMainHandItem();
            ItemStack offHandIst = player.getOffhandItem();
            if (mainHand) {
                player.setItemInHand(InteractionHand.MAIN_HAND, Ist);
                Ist.setCount((mainHandIst.getCount() - 1));
            } else {
                player.setItemInHand(InteractionHand.OFF_HAND, Ist);
                Ist.setCount((offHandIst.getCount() - 1));
            }
            player.getInventory().setChanged();
        }
    }

    public static void playSound(LevelAccessor accesor, Entity entity, String sound) {
        if (accesor instanceof Level level) {
            int x = entity.getBlockX(), y = entity.getBlockY(), z = entity.getBlockZ();
            if (!level.isClientSide()) {
                level.playSound(null, new BlockPos(x, y, z),
                        Objects.requireNonNull(BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation(sound))), SoundSource.PLAYERS,
                        (float) 0.6, 1);
            } else {
                level.playLocalSound(x, y, z, Objects.requireNonNull(BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation(sound))),
                        SoundSource.PLAYERS, (float) 0.6, 1, false);
            }
        }
    }
}
