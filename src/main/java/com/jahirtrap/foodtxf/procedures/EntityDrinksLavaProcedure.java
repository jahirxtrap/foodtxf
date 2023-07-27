package com.jahirtrap.foodtxf.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;

public class EntityDrinksLavaProcedure {
    public static void execute(Entity entity) {
        if (entity == null)
            return;
        if (!(entity instanceof Player _plr && _plr.getAbilities().instabuild)) {
            entity.setSecondsOnFire(6);
        }
    }
}
