package com.jahirtrap.foodtxf.event;

import com.jahirtrap.foodtxf.init.FoodtxfModConfig;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.living.LivingDeathEvent;

import java.util.Random;

import static com.jahirtrap.foodtxf.util.CommonUtils.dropFlesh;

@EventBusSubscriber
public class PlayerDropsFleshEvent {
    @SubscribeEvent
    public static void onLivingDeath(LivingDeathEvent event) {
        if (FoodtxfModConfig.enableCannibalism && FoodtxfModConfig.playerDropFlesh) {
            if (event != null) {
                execute(event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
            }
        }
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
