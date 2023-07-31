package com.jahirtrap.foodtxf.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;

import java.util.Objects;

public class EntityDrinksWaterProcedure {
    public static void execute(LevelAccessor world, int x, int y, int z, Entity entity) {
        if (entity == null) return;
        if (entity.isOnFire()) {
            entity.clearFire();
            if (!(world instanceof Level level)) return;
            if (!level.isClientSide()) {
                level.playSound(null, new BlockPos(x, y, z),
                        Objects.requireNonNull(BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("entity.generic.extinguish_fire"))), SoundSource.PLAYERS,
                        (float) 0.6, 1);
            } else {
                level.playLocalSound(x, y, z, Objects.requireNonNull(BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("entity.generic.extinguish_fire"))),
                        SoundSource.PLAYERS, (float) 0.6, 1, false);
            }
        }
    }
}
