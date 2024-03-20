package com.jahirtrap.foodtxf.event;

import com.jahirtrap.foodtxf.init.FoodtxfModConfig;
import net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;

import java.util.Random;

import static com.jahirtrap.foodtxf.util.CommonUtils.dropFlesh;

public class PlayerDropsFleshEvent {
    public PlayerDropsFleshEvent() {
        ServerLivingEntityEvents.ALLOW_DEATH.register((entity, damageSource, amount) -> {
            if (FoodtxfModConfig.enableCannibalism && FoodtxfModConfig.playerDropFlesh) {
                if (entity != null) {
                    execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
                }
            }
            return true;
        });
    }

    private static void execute(LevelAccessor accesor, double x, double y, double z, Entity entity) {
        if (!(entity instanceof Player))
            return;
        Random random = new Random();
        int rand = random.ints(1, 3 + 1).findFirst().getAsInt();
        if (accesor instanceof Level level && !level.isClientSide()) {
            level.addFreshEntity(dropFlesh(entity, level, x, y, z, rand));
        }
    }
}
