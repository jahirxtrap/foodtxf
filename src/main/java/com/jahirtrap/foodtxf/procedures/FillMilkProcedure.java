package com.jahirtrap.foodtxf.procedures;

import com.jahirtrap.foodtxf.init.FoodtxfModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.animal.Cow;
import net.minecraft.world.entity.animal.goat.Goat;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class FillMilkProcedure {
    @SubscribeEvent
    public static void onRightClickEntity(PlayerInteractEvent.EntityInteract event) {
        if (event.getHand() != event.getEntity().getUsedItemHand())
            return;
        execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getTarget(), event.getEntity());
    }

    public static void execute(LevelAccessor world, int x, int y, int z, Entity entity, Entity sourceentity) {
        execute(null, world, x, y, z, entity, sourceentity);
    }

    private static void execute(@Nullable Event event, LevelAccessor world, int x, int y, int z, Entity entity, Entity sourceentity) {
        if (entity == null || sourceentity == null)
            return;
        if (!((world
                .getFluidState(
                        new BlockPos(
                                sourceentity.level.clip(new ClipContext(sourceentity.getEyePosition(1f),
                                        sourceentity.getEyePosition(1f).add(sourceentity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
                                        ClipContext.Fluid.SOURCE_ONLY, sourceentity)).getBlockPos().getX(),
                                sourceentity.level.clip(
                                                new ClipContext(sourceentity.getEyePosition(1f),
                                                        sourceentity.getEyePosition(1f).add(sourceentity.getViewVector(1f).scale(5)),
                                                        ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, sourceentity))
                                        .getBlockPos().getY(),
                                sourceentity.level
                                        .clip(new ClipContext(sourceentity.getEyePosition(1f),
                                                sourceentity.getEyePosition(1f).add(sourceentity.getViewVector(1f).scale(5)),
                                                ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, sourceentity))
                                        .getBlockPos().getZ()))
                .createLegacyBlock()).getBlock() == Blocks.WATER)
                && !((world
                .getFluidState(
                        new BlockPos(
                                sourceentity.level.clip(new ClipContext(sourceentity.getEyePosition(1f),
                                        sourceentity.getEyePosition(1f).add(sourceentity.getViewVector(1f).scale(5)),
                                        ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, sourceentity)).getBlockPos().getX(),
                                sourceentity.level.clip(new ClipContext(sourceentity.getEyePosition(1f),
                                        sourceentity.getEyePosition(1f).add(sourceentity.getViewVector(1f).scale(5)),
                                        ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, sourceentity)).getBlockPos().getY(),
                                sourceentity.level
                                        .clip(new ClipContext(sourceentity.getEyePosition(1f),
                                                sourceentity.getEyePosition(1f).add(sourceentity.getViewVector(1f).scale(5)),
                                                ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, sourceentity))
                                        .getBlockPos().getZ()))
                .createLegacyBlock()).getBlock() == Blocks.LAVA)) {
            if ((entity instanceof Cow || entity instanceof Goat) && !(entity instanceof LivingEntity _livEnt && _livEnt.isBaby())) {
                if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == FoodtxfModItems.THERMOS
                        .get()) {
                    if (!(sourceentity instanceof Player _plr && _plr.getAbilities().instabuild)) {
                        if (sourceentity instanceof LivingEntity _entity) {
                            ItemStack _setstack = new ItemStack(FoodtxfModItems.THERMOS.get());
                            _setstack.setCount(
                                    ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).getCount()
                                            - 1);
                            _entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                            if (_entity instanceof Player _player)
                                _player.getInventory().setChanged();
                        }
                    }
                    if (sourceentity instanceof LivingEntity _entity)
                        _entity.swing(InteractionHand.MAIN_HAND, true);
                    if (sourceentity instanceof Player _player) {
                        ItemStack _setstack = new ItemStack(FoodtxfModItems.MILK_THERMOS.get());
                        _setstack.setCount(1);
                        ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                    }
                    if (entity instanceof Cow) {
                        if (world instanceof Level _level) {
                            if (!_level.isClientSide()) {
                                _level.playSound(null, new BlockPos(x, y, z),
                                        ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cow.milk")), SoundSource.PLAYERS,
                                        (float) 0.6, 1);
                            } else {
                                _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cow.milk")),
                                        SoundSource.PLAYERS, (float) 0.6, 1, false);
                            }
                        }
                    } else if (entity instanceof Goat) {
                        if (world instanceof Level _level) {
                            if (!_level.isClientSide()) {
                                _level.playSound(null, new BlockPos(x, y, z),
                                        ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.goat.milk")), SoundSource.PLAYERS,
                                        (float) 0.6, 1);
                            } else {
                                _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.goat.milk")),
                                        SoundSource.PLAYERS, (float) 0.6, 1, false);
                            }
                        }
                    }
                } else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)
                        .getItem() == FoodtxfModItems.THERMOS.get()) {
                    if (!(sourceentity instanceof Player _plr && _plr.getAbilities().instabuild)) {
                        if (sourceentity instanceof LivingEntity _entity) {
                            ItemStack _setstack = new ItemStack(FoodtxfModItems.THERMOS.get());
                            _setstack.setCount(
                                    ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).getCount()
                                            - 1);
                            _entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
                            if (_entity instanceof Player _player)
                                _player.getInventory().setChanged();
                        }
                    }
                    if (sourceentity instanceof LivingEntity _entity)
                        _entity.swing(InteractionHand.OFF_HAND, true);
                    if (sourceentity instanceof Player _player) {
                        ItemStack _setstack = new ItemStack(FoodtxfModItems.MILK_THERMOS.get());
                        _setstack.setCount(1);
                        ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                    }
                    if (entity instanceof Cow) {
                        if (world instanceof Level _level) {
                            if (!_level.isClientSide()) {
                                _level.playSound(null, new BlockPos(x, y, z),
                                        ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cow.milk")), SoundSource.PLAYERS,
                                        (float) 0.6, 1);
                            } else {
                                _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cow.milk")),
                                        SoundSource.PLAYERS, (float) 0.6, 1, false);
                            }
                        }
                    } else if (entity instanceof Goat) {
                        if (world instanceof Level _level) {
                            if (!_level.isClientSide()) {
                                _level.playSound(null, new BlockPos(x, y, z),
                                        ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.goat.milk")), SoundSource.PLAYERS,
                                        (float) 0.6, 1);
                            } else {
                                _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.goat.milk")),
                                        SoundSource.PLAYERS, (float) 0.6, 1, false);
                            }
                        }
                    }
                }
            }
        }
    }
}
