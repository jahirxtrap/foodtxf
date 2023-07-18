package com.jahirtrap.foodtxf.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.registries.ForgeRegistries;

public class EntityDrinksWaterProcedure {
    public static void execute(LevelAccessor world, int x, int y, int z, Entity entity) {
        if (entity == null)
            return;
        if (entity.isOnFire()) {
            entity.clearFire();
            if (world instanceof Level _level) {
                if (!_level.isClientSide()) {
                    _level.playSound(null, new BlockPos(x, y, z),
                            ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.extinguish_fire")), SoundSource.PLAYERS,
                            (float) 0.6, 1);
                } else {
                    _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.extinguish_fire")),
                            SoundSource.PLAYERS, (float) 0.6, 1, false);
                }
            }
        }
    }
}
