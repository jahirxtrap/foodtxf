package com.jahirtrap.foodtxf.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;

public class EntityDrinksMilkProcedure {
    public static void execute(Entity entity) {
        if (!(entity instanceof LivingEntity livEnt)) return;
        livEnt.removeAllEffects();
    }
}
