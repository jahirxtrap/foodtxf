package com.jahirtrap.foodtxf.util;

import com.jahirtrap.foodtxf.init.FoodtxfModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.nbt.StringTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.GameType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class CommonUtils {
    public static ItemEntity dropFlesh(Entity entity, Level level, double x, double y, double z, int num) {
        ItemStack itemStack;
        if (entity.isOnFire()) itemStack = new ItemStack(FoodtxfModItems.COOKED_PLAYER_FLESH, num);
        else itemStack = new ItemStack(FoodtxfModItems.PLAYER_FLESH, num);
        CompoundTag compoundTag = itemStack.getOrCreateTag();
        ListTag loreTag = new ListTag();

        loreTag.add(StringTag.valueOf("{\"text\":\"" + entity.getName().getString() + "\",\"color\":\"red\",\"italic\":false}"));

        compoundTag.put("display", new CompoundTag());
        compoundTag.getCompound("display").put("Lore", loreTag);

        ItemEntity entityToSpawn = new ItemEntity(level, x, y, z, itemStack);
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

    public static Block getViewedBlock(LevelAccessor world, Entity entity) {
        ClipContext clipContext = new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity);
        return (world.getFluidState(new BlockPos(
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

    public static void playSound(LevelAccessor world, Entity entity, String sound) {
        if (world instanceof Level level) {
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

    public static boolean isCorrectToolForDrops(@NotNull BlockState state, @NotNull Player player) {
        if (!state.requiresCorrectToolForDrops())
            return true;

        return player.hasCorrectToolForDrops(state);
    }
}
