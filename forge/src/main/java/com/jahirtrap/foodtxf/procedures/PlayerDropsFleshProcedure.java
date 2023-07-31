package com.jahirtrap.foodtxf.procedures;

import com.jahirtrap.foodtxf.init.FoodtxfModConfig;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Random;

import static com.jahirtrap.foodtxf.util.CommonUtils.dropFlesh;

@Mod.EventBusSubscriber
public class PlayerDropsFleshProcedure {
    @SubscribeEvent
    public static void onEntityDeath(LivingDeathEvent event) {
        if (FoodtxfModConfig.ENABLE_CANNIBALISM.get()) {
            if (event != null && event.getEntity() != null) {
                execute(event.getEntity().level, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
            }
        }
    }

    private static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (!(entity instanceof Player))
            return;
        Random random = new Random();
        int rand = random.ints(1, 3 + 1).findFirst().getAsInt();
        if (world instanceof Level level && !level.isClientSide()) {
            level.addFreshEntity(dropFlesh(entity, level, x, y, z, rand));
        }
    }
}
