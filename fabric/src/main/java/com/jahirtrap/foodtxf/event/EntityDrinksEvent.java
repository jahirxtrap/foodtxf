package com.jahirtrap.foodtxf.event;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;

import java.util.Objects;

public class EntityDrinksEvent {
    public static void water(LevelAccessor world, int x, int y, int z, Entity entity) {
        if (entity == null) return;
        if (entity.isOnFire()) {
            entity.clearFire();
            if (!(world instanceof Level level)) return;
            if (!level.isClientSide()) {
                level.playSound(null, new BlockPos(x, y, z),
                        Objects.requireNonNull(Registry.SOUND_EVENT.get(new ResourceLocation("entity.generic.extinguish_fire"))), SoundSource.PLAYERS,
                        (float) 0.6, 1);
            } else {
                level.playLocalSound(x, y, z, Objects.requireNonNull(Registry.SOUND_EVENT.get(new ResourceLocation("entity.generic.extinguish_fire"))),
                        SoundSource.PLAYERS, (float) 0.6, 1, false);
            }
        }
    }

    public static void lava(Entity entity) {
        if (!(entity instanceof LivingEntity livEnt)) return;
        livEnt.setSecondsOnFire(6);
    }

    public static void milk(Entity entity) {
        if (!(entity instanceof LivingEntity livEnt)) return;
        livEnt.removeAllEffects();
    }
}
