package com.jahirtrap.foodtxf.procedures;

import com.jahirtrap.foodtxf.FoodtxfMod;
import com.jahirtrap.foodtxf.item.MilkThermosItem;
import com.jahirtrap.foodtxf.item.ThermosItem;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.entity.passive.CowEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.HashMap;
import java.util.Map;

public class FillMilkProcedure {
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("world") == null) {
            if (!dependencies.containsKey("world"))
                FoodtxfMod.LOGGER.warn("Failed to load dependency world for procedure FillMilk!");
            return;
        }
        if (dependencies.get("x") == null) {
            if (!dependencies.containsKey("x"))
                FoodtxfMod.LOGGER.warn("Failed to load dependency x for procedure FillMilk!");
            return;
        }
        if (dependencies.get("y") == null) {
            if (!dependencies.containsKey("y"))
                FoodtxfMod.LOGGER.warn("Failed to load dependency y for procedure FillMilk!");
            return;
        }
        if (dependencies.get("z") == null) {
            if (!dependencies.containsKey("z"))
                FoodtxfMod.LOGGER.warn("Failed to load dependency z for procedure FillMilk!");
            return;
        }
        if (dependencies.get("entity") == null) {
            if (!dependencies.containsKey("entity"))
                FoodtxfMod.LOGGER.warn("Failed to load dependency entity for procedure FillMilk!");
            return;
        }
        if (dependencies.get("sourceentity") == null) {
            if (!dependencies.containsKey("sourceentity"))
                FoodtxfMod.LOGGER.warn("Failed to load dependency sourceentity for procedure FillMilk!");
            return;
        }
        IWorld world = (IWorld) dependencies.get("world");
        double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
        double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
        double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
        Entity entity = (Entity) dependencies.get("entity");
        Entity sourceentity = (Entity) dependencies.get("sourceentity");
        if (!((world.getFluidState(new BlockPos(
                        sourceentity.level.clip(new RayTraceContext(sourceentity.getEyePosition(1f),
                                sourceentity.getEyePosition(1f).add(sourceentity.getViewVector(1f).x * 5, sourceentity.getViewVector(1f).y * 5,
                                        sourceentity.getViewVector(1f).z * 5),
                                RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.SOURCE_ONLY, sourceentity)).getBlockPos().getX(),
                        sourceentity.level.clip(new RayTraceContext(sourceentity.getEyePosition(1f),
                                sourceentity.getEyePosition(1f).add(sourceentity.getViewVector(1f).x * 5, sourceentity.getViewVector(1f).y * 5,
                                        sourceentity.getViewVector(1f).z * 5),
                                RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.SOURCE_ONLY, sourceentity)).getBlockPos().getY(),
                        sourceentity.level.clip(new RayTraceContext(sourceentity.getEyePosition(1f),
                                sourceentity.getEyePosition(1f).add(sourceentity.getViewVector(1f).x * 5, sourceentity.getViewVector(1f).y * 5,
                                        sourceentity.getViewVector(1f).z * 5),
                                RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.SOURCE_ONLY, sourceentity)).getBlockPos().getZ()))
                .createLegacyBlock()).getBlock() == Blocks.WATER)
                && !((world
                .getFluidState(
                        new BlockPos(
                                sourceentity.level
                                        .clip(new RayTraceContext(sourceentity.getEyePosition(1f),
                                                sourceentity.getEyePosition(1f).add(sourceentity.getViewVector(1f).x * 5,
                                                        sourceentity.getViewVector(1f).y * 5, sourceentity.getViewVector(1f).z * 5),
                                                RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.SOURCE_ONLY, sourceentity))
                                        .getBlockPos().getX(),
                                sourceentity.level
                                        .clip(new RayTraceContext(sourceentity.getEyePosition(1f),
                                                sourceentity.getEyePosition(1f).add(sourceentity.getViewVector(1f).x * 5,
                                                        sourceentity.getViewVector(1f).y * 5, sourceentity.getViewVector(1f).z * 5),
                                                RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.SOURCE_ONLY, sourceentity))
                                        .getBlockPos().getY(),
                                sourceentity.level
                                        .clip(new RayTraceContext(sourceentity.getEyePosition(1f),
                                                sourceentity.getEyePosition(1f).add(sourceentity.getViewVector(1f).x * 5,
                                                        sourceentity.getViewVector(1f).y * 5, sourceentity.getViewVector(1f).z * 5),
                                                RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.SOURCE_ONLY, sourceentity))
                                        .getBlockPos().getZ()))
                .createLegacyBlock()).getBlock() == Blocks.LAVA)) {
            if ((entity instanceof CowEntity || entity instanceof ZombieEntity)
                    && !(entity instanceof LivingEntity && ((LivingEntity) entity).isBaby())) {
                if (((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getMainHandItem() : ItemStack.EMPTY)
                        .getItem() == ThermosItem.block) {
                    if (!(sourceentity instanceof PlayerEntity && ((PlayerEntity) sourceentity).abilities.instabuild)) {
                        if (sourceentity instanceof LivingEntity) {
                            ItemStack _setstack = new ItemStack(ThermosItem.block);
                            _setstack.setCount((((sourceentity instanceof LivingEntity)
                                    ? ((LivingEntity) sourceentity).getMainHandItem()
                                    : ItemStack.EMPTY)).getCount() - 1);
                            ((LivingEntity) sourceentity).setItemInHand(Hand.MAIN_HAND, _setstack);
                            if (sourceentity instanceof ServerPlayerEntity)
                                ((ServerPlayerEntity) sourceentity).inventory.setChanged();
                        }
                    }
                    if (sourceentity instanceof LivingEntity) {
                        ((LivingEntity) sourceentity).swing(Hand.MAIN_HAND, true);
                    }
                    if (sourceentity instanceof PlayerEntity) {
                        ItemStack _setstack = new ItemStack(MilkThermosItem.block);
                        _setstack.setCount(1);
                        ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) sourceentity), _setstack);
                    }
                    if (entity instanceof CowEntity) {
                        if (world instanceof World && !world.isClientSide()) {
                            world.playSound(null, new BlockPos(x, y, z),
                                    ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cow.milk")),
                                    SoundCategory.PLAYERS, (float) 0.6, (float) 1);
                        } else {
                            ((World) world).playLocalSound(x, y, z,
                                    ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cow.milk")),
                                    SoundCategory.PLAYERS, (float) 0.6, (float) 1, false);
                        }
                    } else if (entity instanceof ZombieEntity) {
                        if (world instanceof World && !world.isClientSide()) {
                            world.playSound(null, new BlockPos(x, y, z),
                                    ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("")),
                                    SoundCategory.PLAYERS, (float) 0.6, (float) 1);
                        } else {
                            ((World) world).playLocalSound(x, y, z,
                                    ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("")),
                                    SoundCategory.PLAYERS, (float) 0.6, (float) 1, false);
                        }
                    }
                } else if (((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getOffhandItem() : ItemStack.EMPTY)
                        .getItem() == ThermosItem.block) {
                    if (!(sourceentity instanceof PlayerEntity && ((PlayerEntity) sourceentity).abilities.instabuild)) {
                        if (sourceentity instanceof LivingEntity) {
                            ItemStack _setstack = new ItemStack(ThermosItem.block);
                            _setstack.setCount((((sourceentity instanceof LivingEntity)
                                    ? ((LivingEntity) sourceentity).getOffhandItem()
                                    : ItemStack.EMPTY)).getCount() - 1);
                            ((LivingEntity) sourceentity).setItemInHand(Hand.OFF_HAND, _setstack);
                            if (sourceentity instanceof ServerPlayerEntity)
                                ((ServerPlayerEntity) sourceentity).inventory.setChanged();
                        }
                    }
                    if (sourceentity instanceof LivingEntity) {
                        ((LivingEntity) sourceentity).swing(Hand.OFF_HAND, true);
                    }
                    if (sourceentity instanceof PlayerEntity) {
                        ItemStack _setstack = new ItemStack(MilkThermosItem.block);
                        _setstack.setCount(1);
                        ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) sourceentity), _setstack);
                    }
                    if (entity instanceof CowEntity) {
                        if (world instanceof World && !world.isClientSide()) {
                            world.playSound(null, new BlockPos(x, y, z),
                                    ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cow.milk")),
                                    SoundCategory.PLAYERS, (float) 0.6, (float) 1);
                        } else {
                            ((World) world).playLocalSound(x, y, z,
                                    ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cow.milk")),
                                    SoundCategory.PLAYERS, (float) 0.6, (float) 1, false);
                        }
                    } else if (entity instanceof ZombieEntity) {
                        if (world instanceof World && !world.isClientSide()) {
                            world.playSound(null, new BlockPos(x, y, z),
                                    ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("")),
                                    SoundCategory.PLAYERS, (float) 0.6, (float) 1);
                        } else {
                            ((World) world).playLocalSound(x, y, z,
                                    ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("")),
                                    SoundCategory.PLAYERS, (float) 0.6, (float) 1, false);
                        }
                    }
                }
            }
        }
    }

    @Mod.EventBusSubscriber
    private static class GlobalTrigger {
        @SubscribeEvent
        public static void onRightClickEntity(PlayerInteractEvent.EntityInteract event) {
            Entity entity = event.getTarget();
            PlayerEntity sourceentity = event.getPlayer();
            if (event.getHand() != sourceentity.getUsedItemHand()) {
                return;
            }
            double i = event.getPos().getX();
            double j = event.getPos().getY();
            double k = event.getPos().getZ();
            IWorld world = event.getWorld();
            Map<String, Object> dependencies = new HashMap<>();
            dependencies.put("x", i);
            dependencies.put("y", j);
            dependencies.put("z", k);
            dependencies.put("world", world);
            dependencies.put("entity", entity);
            dependencies.put("sourceentity", sourceentity);
            dependencies.put("event", event);
            executeProcedure(dependencies);
        }
    }
}
