package com.jahirtrap.foodtxf.procedures;

import com.jahirtrap.foodtxf.init.FoodtxfModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.HitResult;
import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.registries.ForgeRegistries;

public class FillFluidProcedure {
    public static void execute(LevelAccessor world, int x, int y, int z, Entity entity) {
        if (entity == null)
            return;
        if (entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
                ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity)).getType() == HitResult.Type.BLOCK) {
            if ((world
                    .getFluidState(new BlockPos(
                            entity.level
                                    .clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
                                            ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity))
                                    .getBlockPos().getX(),
                            entity.level
                                    .clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
                                            ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity))
                                    .getBlockPos().getY(),
                            entity.level
                                    .clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
                                            ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity))
                                    .getBlockPos().getZ()))
                    .createLegacyBlock()).getBlock() == Blocks.WATER) {
                if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == FoodtxfModItems.THERMOS.get()
                        && (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == (ItemStack.EMPTY)
                        .getItem()) {
                    if (!(entity instanceof Player _plr && _plr.getAbilities().instabuild)) {
                        if (entity instanceof LivingEntity _entity) {
                            ItemStack _setstack = new ItemStack(FoodtxfModItems.THERMOS.get());
                            _setstack.setCount(
                                    ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).getCount() - 1);
                            _entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                            if (_entity instanceof Player _player)
                                _player.getInventory().setChanged();
                        }
                    }
                    if (entity instanceof LivingEntity _entity)
                        _entity.swing(InteractionHand.MAIN_HAND, true);
                    if (entity instanceof Player _player) {
                        ItemStack _setstack = new ItemStack(FoodtxfModItems.WATER_THERMOS.get());
                        _setstack.setCount(1);
                        ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                    }
                    if (world instanceof Level _level) {
                        if (!_level.isClientSide()) {
                            _level.playSound(null, new BlockPos(x, y, z),
                                    ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.fill")), SoundSource.PLAYERS, (float) 0.6,
                                    1);
                        } else {
                            _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.fill")),
                                    SoundSource.PLAYERS, (float) 0.6, 1, false);
                        }
                    }
                } else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == FoodtxfModItems.THERMOS
                        .get()
                        && !((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                        .getItem() == FoodtxfModItems.THERMOS.get())) {
                    if (!(entity instanceof Player _plr && _plr.getAbilities().instabuild)) {
                        if (entity instanceof LivingEntity _entity) {
                            ItemStack _setstack = new ItemStack(FoodtxfModItems.THERMOS.get());
                            _setstack.setCount(
                                    ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).getCount() - 1);
                            _entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
                            if (_entity instanceof Player _player)
                                _player.getInventory().setChanged();
                        }
                    }
                    if (entity instanceof LivingEntity _entity)
                        _entity.swing(InteractionHand.OFF_HAND, true);
                    if (entity instanceof Player _player) {
                        ItemStack _setstack = new ItemStack(FoodtxfModItems.WATER_THERMOS.get());
                        _setstack.setCount(1);
                        ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                    }
                    if (world instanceof Level _level) {
                        if (!_level.isClientSide()) {
                            _level.playSound(null, new BlockPos(x, y, z),
                                    ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.fill")), SoundSource.PLAYERS, (float) 0.6,
                                    1);
                        } else {
                            _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.fill")),
                                    SoundSource.PLAYERS, (float) 0.6, 1, false);
                        }
                    }
                }
            } else if ((world
                    .getFluidState(new BlockPos(
                            entity.level
                                    .clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
                                            ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity))
                                    .getBlockPos().getX(),
                            entity.level
                                    .clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
                                            ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity))
                                    .getBlockPos().getY(),
                            entity.level
                                    .clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
                                            ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity))
                                    .getBlockPos().getZ()))
                    .createLegacyBlock()).getBlock() == Blocks.LAVA) {
                if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == FoodtxfModItems.THERMOS.get()
                        && (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == (ItemStack.EMPTY)
                        .getItem()) {
                    if (!(entity instanceof Player _plr && _plr.getAbilities().instabuild)) {
                        if (entity instanceof LivingEntity _entity) {
                            ItemStack _setstack = new ItemStack(FoodtxfModItems.THERMOS.get());
                            _setstack.setCount(
                                    ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).getCount() - 1);
                            _entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                            if (_entity instanceof Player _player)
                                _player.getInventory().setChanged();
                        }
                    }
                    if (entity instanceof LivingEntity _entity)
                        _entity.swing(InteractionHand.MAIN_HAND, true);
                    if (entity instanceof Player _player) {
                        ItemStack _setstack = new ItemStack(FoodtxfModItems.LAVA_THERMOS.get());
                        _setstack.setCount(1);
                        ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                    }
                    if (world instanceof Level _level) {
                        if (!_level.isClientSide()) {
                            _level.playSound(null, new BlockPos(x, y, z),
                                    ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.fill_lava")), SoundSource.PLAYERS,
                                    (float) 0.6, 1);
                        } else {
                            _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.fill_lava")),
                                    SoundSource.PLAYERS, (float) 0.6, 1, false);
                        }
                    }
                } else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == FoodtxfModItems.THERMOS
                        .get()
                        && !((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                        .getItem() == FoodtxfModItems.THERMOS.get())) {
                    if (!(entity instanceof Player _plr && _plr.getAbilities().instabuild)) {
                        if (entity instanceof LivingEntity _entity) {
                            ItemStack _setstack = new ItemStack(FoodtxfModItems.THERMOS.get());
                            _setstack.setCount(
                                    ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).getCount() - 1);
                            _entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
                            if (_entity instanceof Player _player)
                                _player.getInventory().setChanged();
                        }
                    }
                    if (entity instanceof LivingEntity _entity)
                        _entity.swing(InteractionHand.OFF_HAND, true);
                    if (entity instanceof Player _player) {
                        ItemStack _setstack = new ItemStack(FoodtxfModItems.LAVA_THERMOS.get());
                        _setstack.setCount(1);
                        ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                    }
                    if (world instanceof Level _level) {
                        if (!_level.isClientSide()) {
                            _level.playSound(null, new BlockPos(x, y, z),
                                    ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.fill_lava")), SoundSource.PLAYERS,
                                    (float) 0.6, 1);
                        } else {
                            _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.fill_lava")),
                                    SoundSource.PLAYERS, (float) 0.6, 1, false);
                        }
                    }
                }
            }
        }
    }
}
