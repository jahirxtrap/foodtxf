package com.jahirtrap.foodtxf.procedures;

import com.jahirtrap.foodtxf.FoodtxfMod;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Map;
import java.util.Objects;

public class EntityDrinksWaterProcedure {

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("world") == null) {
            if (!dependencies.containsKey("world"))
                FoodtxfMod.LOGGER.warn("Failed to load dependency world for procedure EntityDrinksWater!");
            return;
        }
        if (dependencies.get("x") == null) {
            if (!dependencies.containsKey("x"))
                FoodtxfMod.LOGGER.warn("Failed to load dependency x for procedure EntityDrinksWater!");
            return;
        }
        if (dependencies.get("y") == null) {
            if (!dependencies.containsKey("y"))
                FoodtxfMod.LOGGER.warn("Failed to load dependency y for procedure EntityDrinksWater!");
            return;
        }
        if (dependencies.get("z") == null) {
            if (!dependencies.containsKey("z"))
                FoodtxfMod.LOGGER.warn("Failed to load dependency z for procedure EntityDrinksWater!");
            return;
        }
        if (dependencies.get("entity") == null) {
            if (!dependencies.containsKey("entity"))
                FoodtxfMod.LOGGER.warn("Failed to load dependency entity for procedure EntityDrinksWater!");
            return;
        }
        IWorld world = (IWorld) dependencies.get("world");
        double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
        double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
        double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
        Entity entity = (Entity) dependencies.get("entity");
        if (entity.isOnFire()) {
            entity.clearFire();
            if (world instanceof World && !world.isClientSide()) {
                world.playSound(null, new BlockPos(x, y, z),
                        Objects.requireNonNull(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.extinguish_fire"))),
                        SoundCategory.PLAYERS, (float) 0.6, (float) 1);
            } else {
                if (world instanceof World) {
                    ((World) world).playLocalSound(x, y, z,
                            Objects.requireNonNull(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.extinguish_fire"))),
                            SoundCategory.PLAYERS, (float) 0.6, (float) 1, false);
                }
            }
        }
    }
}
