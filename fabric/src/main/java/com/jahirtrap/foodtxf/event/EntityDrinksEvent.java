package com.jahirtrap.foodtxf.event;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.LivingEntity;

public class EntityDrinksEvent {
    public static void execute(LivingEntity entity, int fluidType) {
        if (fluidType == 1) EntityDrinksEvent.water(entity);
        else if (fluidType == 2) EntityDrinksEvent.lava(entity);
        else if (fluidType == 3) EntityDrinksEvent.milk(entity);
    }

    private static void water(LivingEntity entity) {
        if (entity.isOnFire()) {
            entity.clearFire();
            entity.playSound(SoundEvents.GENERIC_EXTINGUISH_FIRE, 1, 1);
        }
    }

    private static void lava(LivingEntity entity) {
        entity.setSecondsOnFire(6);
    }

    private static void milk(LivingEntity entity) {
        entity.removeAllEffects();
    }
}
