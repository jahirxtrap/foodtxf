package com.jahirtrap.foodtxf.procedures;

import com.jahirtrap.foodtxf.FoodtxfMod;
import com.jahirtrap.foodtxf.item.LavaThermosItem;
import com.jahirtrap.foodtxf.item.ThermosItem;
import com.jahirtrap.foodtxf.item.WaterThermosItem;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Map;

public class FillFluidProcedure {

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("world") == null) {
            if (!dependencies.containsKey("world"))
                FoodtxfMod.LOGGER.warn("Failed to load dependency world for procedure FillFluid!");
            return;
        }
        if (dependencies.get("x") == null) {
            if (!dependencies.containsKey("x"))
                FoodtxfMod.LOGGER.warn("Failed to load dependency x for procedure FillFluid!");
            return;
        }
        if (dependencies.get("y") == null) {
            if (!dependencies.containsKey("y"))
                FoodtxfMod.LOGGER.warn("Failed to load dependency y for procedure FillFluid!");
            return;
        }
        if (dependencies.get("z") == null) {
            if (!dependencies.containsKey("z"))
                FoodtxfMod.LOGGER.warn("Failed to load dependency z for procedure FillFluid!");
            return;
        }
        if (dependencies.get("entity") == null) {
            if (!dependencies.containsKey("entity"))
                FoodtxfMod.LOGGER.warn("Failed to load dependency entity for procedure FillFluid!");
            return;
        }
        IWorld world = (IWorld) dependencies.get("world");
        double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
        double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
        double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
        Entity entity = (Entity) dependencies.get("entity");
        if (entity.level.clip(new RayTraceContext(entity.getEyePosition(1f),
                entity.getEyePosition(1f).add(entity.getViewVector(1f).x * 5, entity.getViewVector(1f).y * 5, entity.getViewVector(1f).z * 5),
                RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.SOURCE_ONLY, entity)).getType() == RayTraceResult.Type.BLOCK) {
            if ((world
                    .getFluidState(
                            new BlockPos(
                                    entity.level.clip(
                                                    new RayTraceContext(entity.getEyePosition(1f),
                                                            entity.getEyePosition(1f).add(entity.getViewVector(1f).x * 5, entity.getViewVector(1f).y * 5,
                                                                    entity.getViewVector(1f).z * 5),
                                                            RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.SOURCE_ONLY, entity))
                                            .getBlockPos().getX(),
                                    entity.level.clip(new RayTraceContext(entity.getEyePosition(1f),
                                            entity.getEyePosition(1f).add(entity.getViewVector(1f).x * 5, entity.getViewVector(1f).y * 5,
                                                    entity.getViewVector(1f).z * 5),
                                            RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.SOURCE_ONLY, entity)).getBlockPos().getY(),
                                    entity.level.clip(new RayTraceContext(entity.getEyePosition(1f),
                                            entity.getEyePosition(1f).add(entity.getViewVector(1f).x * 5, entity.getViewVector(1f).y * 5,
                                                    entity.getViewVector(1f).z * 5),
                                            RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.SOURCE_ONLY, entity)).getBlockPos().getZ()))
                    .createLegacyBlock()).getBlock() == Blocks.WATER) {
                if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY)
                        .getItem() == ThermosItem.block
                        && ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getOffhandItem() : ItemStack.EMPTY)
                        .getItem() == (ItemStack.EMPTY).getItem()) {
                    if (!(entity instanceof PlayerEntity && ((PlayerEntity) entity).abilities.instabuild)) {
                        if (entity instanceof LivingEntity) {
                            ItemStack _setstack = new ItemStack(ThermosItem.block);
                            _setstack.setCount(
                                    (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY))
                                            .getCount() - 1);
                            ((LivingEntity) entity).setItemInHand(Hand.MAIN_HAND, _setstack);
                            if (entity instanceof ServerPlayerEntity)
                                ((ServerPlayerEntity) entity).inventory.setChanged();
                        }
                    }
                    if (entity instanceof LivingEntity) {
                        ((LivingEntity) entity).swing(Hand.MAIN_HAND, true);
                    }
                    if (entity instanceof PlayerEntity) {
                        ItemStack _setstack = new ItemStack(WaterThermosItem.block);
                        _setstack.setCount(1);
                        ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
                    }
                    if (world instanceof World && !world.isClientSide()) {
                        world.playSound(null, new BlockPos(x, y, z),
                                ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.fill")),
                                SoundCategory.PLAYERS, (float) 0.6, (float) 1);
                    } else {
                        ((World) world).playLocalSound(x, y, z,
                                ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.fill")),
                                SoundCategory.PLAYERS, (float) 0.6, (float) 1, false);
                    }
                } else if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getOffhandItem() : ItemStack.EMPTY)
                        .getItem() == ThermosItem.block
                        && !(((entity instanceof LivingEntity) ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY)
                        .getItem() == ThermosItem.block)) {
                    if (!(entity instanceof PlayerEntity && ((PlayerEntity) entity).abilities.instabuild)) {
                        if (entity instanceof LivingEntity) {
                            ItemStack _setstack = new ItemStack(ThermosItem.block);
                            _setstack.setCount(
                                    (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getOffhandItem() : ItemStack.EMPTY))
                                            .getCount() - 1);
                            ((LivingEntity) entity).setItemInHand(Hand.OFF_HAND, _setstack);
                            if (entity instanceof ServerPlayerEntity)
                                ((ServerPlayerEntity) entity).inventory.setChanged();
                        }
                    }
                    if (entity instanceof LivingEntity) {
                        ((LivingEntity) entity).swing(Hand.OFF_HAND, true);
                    }
                    if (entity instanceof PlayerEntity) {
                        ItemStack _setstack = new ItemStack(WaterThermosItem.block);
                        _setstack.setCount(1);
                        ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
                    }
                    if (world instanceof World && !world.isClientSide()) {
                        world.playSound(null, new BlockPos(x, y, z),
                                ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.fill")),
                                SoundCategory.PLAYERS, (float) 0.6, (float) 1);
                    } else {
                        ((World) world).playLocalSound(x, y, z,
                                ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.fill")),
                                SoundCategory.PLAYERS, (float) 0.6, (float) 1, false);
                    }
                }
            } else if ((world
                    .getFluidState(
                            new BlockPos(
                                    entity.level.clip(
                                                    new RayTraceContext(entity.getEyePosition(1f),
                                                            entity.getEyePosition(1f).add(entity.getViewVector(1f).x * 5, entity.getViewVector(1f).y * 5,
                                                                    entity.getViewVector(1f).z * 5),
                                                            RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.SOURCE_ONLY, entity))
                                            .getBlockPos().getX(),
                                    entity.level.clip(new RayTraceContext(entity.getEyePosition(1f),
                                            entity.getEyePosition(1f).add(entity.getViewVector(1f).x * 5, entity.getViewVector(1f).y * 5,
                                                    entity.getViewVector(1f).z * 5),
                                            RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.SOURCE_ONLY, entity)).getBlockPos().getY(),
                                    entity.level.clip(new RayTraceContext(entity.getEyePosition(1f),
                                            entity.getEyePosition(1f).add(entity.getViewVector(1f).x * 5, entity.getViewVector(1f).y * 5,
                                                    entity.getViewVector(1f).z * 5),
                                            RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.SOURCE_ONLY, entity)).getBlockPos().getZ()))
                    .createLegacyBlock()).getBlock() == Blocks.LAVA) {
                if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY)
                        .getItem() == ThermosItem.block
                        && ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getOffhandItem() : ItemStack.EMPTY)
                        .getItem() == (ItemStack.EMPTY).getItem()) {
                    if (!(entity instanceof PlayerEntity && ((PlayerEntity) entity).abilities.instabuild)) {
                        if (entity instanceof LivingEntity) {
                            ItemStack _setstack = new ItemStack(ThermosItem.block);
                            _setstack.setCount(
                                    (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY))
                                            .getCount() - 1);
                            ((LivingEntity) entity).setItemInHand(Hand.MAIN_HAND, _setstack);
                            if (entity instanceof ServerPlayerEntity)
                                ((ServerPlayerEntity) entity).inventory.setChanged();
                        }
                    }
                    if (entity instanceof LivingEntity) {
                        ((LivingEntity) entity).swing(Hand.MAIN_HAND, true);
                    }
                    if (entity instanceof PlayerEntity) {
                        ItemStack _setstack = new ItemStack(LavaThermosItem.block);
                        _setstack.setCount(1);
                        ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
                    }
                    if (world instanceof World && !world.isClientSide()) {
                        world.playSound(null, new BlockPos(x, y, z),
                                ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.fill_lava")),
                                SoundCategory.PLAYERS, (float) 0.6, (float) 1);
                    } else {
                        ((World) world).playLocalSound(x, y, z,
                                ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.fill_lava")),
                                SoundCategory.PLAYERS, (float) 0.6, (float) 1, false);
                    }
                } else if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getOffhandItem() : ItemStack.EMPTY)
                        .getItem() == ThermosItem.block
                        && !(((entity instanceof LivingEntity) ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY)
                        .getItem() == ThermosItem.block)) {
                    if (!(entity instanceof PlayerEntity && ((PlayerEntity) entity).abilities.instabuild)) {
                        if (entity instanceof LivingEntity) {
                            ItemStack _setstack = new ItemStack(ThermosItem.block);
                            _setstack.setCount(
                                    (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getOffhandItem() : ItemStack.EMPTY))
                                            .getCount() - 1);
                            ((LivingEntity) entity).setItemInHand(Hand.OFF_HAND, _setstack);
                            if (entity instanceof ServerPlayerEntity)
                                ((ServerPlayerEntity) entity).inventory.setChanged();
                        }
                    }
                    if (entity instanceof LivingEntity) {
                        ((LivingEntity) entity).swing(Hand.OFF_HAND, true);
                    }
                    if (entity instanceof PlayerEntity) {
                        ItemStack _setstack = new ItemStack(LavaThermosItem.block);
                        _setstack.setCount(1);
                        ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
                    }
                    if (world instanceof World && !world.isClientSide()) {
                        world.playSound(null, new BlockPos(x, y, z),
                                ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.fill_lava")),
                                SoundCategory.PLAYERS, (float) 0.6, (float) 1);
                    } else {
                        ((World) world).playLocalSound(x, y, z,
                                ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.fill_lava")),
                                SoundCategory.PLAYERS, (float) 0.6, (float) 1, false);
                    }
                }
            }
        }
    }
}
