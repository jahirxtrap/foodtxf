package com.jahirtrap.foodtxf.procedures;

import com.jahirtrap.foodtxf.FoodtxfMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;

import java.util.Map;

public class EntityDrinksLavaProcedure {

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            if (!dependencies.containsKey("entity"))
                FoodtxfMod.LOGGER.warn("Failed to load dependency entity for procedure EntityDrinksLava!");
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        if (!(entity instanceof PlayerEntity && ((PlayerEntity) entity).abilities.instabuild)) {
            entity.setSecondsOnFire(6);
        }
    }
}
