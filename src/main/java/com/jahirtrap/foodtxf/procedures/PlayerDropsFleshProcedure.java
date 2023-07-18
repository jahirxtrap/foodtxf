package com.jahirtrap.foodtxf.procedures;

import com.jahirtrap.foodtxf.FoodtxfMod;
import com.jahirtrap.foodtxf.item.CookedPlayerFleshItem;
import com.jahirtrap.foodtxf.item.PlayerFleshItem;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class PlayerDropsFleshProcedure {
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("world") == null) {
            if (!dependencies.containsKey("world"))
                FoodtxfMod.LOGGER.warn("Failed to load dependency world for procedure PlayerDropsFlesh!");
            return;
        }
        if (dependencies.get("x") == null) {
            if (!dependencies.containsKey("x"))
                FoodtxfMod.LOGGER.warn("Failed to load dependency x for procedure PlayerDropsFlesh!");
            return;
        }
        if (dependencies.get("y") == null) {
            if (!dependencies.containsKey("y"))
                FoodtxfMod.LOGGER.warn("Failed to load dependency y for procedure PlayerDropsFlesh!");
            return;
        }
        if (dependencies.get("z") == null) {
            if (!dependencies.containsKey("z"))
                FoodtxfMod.LOGGER.warn("Failed to load dependency z for procedure PlayerDropsFlesh!");
            return;
        }
        if (dependencies.get("entity") == null) {
            if (!dependencies.containsKey("entity"))
                FoodtxfMod.LOGGER.warn("Failed to load dependency entity for procedure PlayerDropsFlesh!");
            return;
        }
        IWorld world = (IWorld) dependencies.get("world");
        double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
        double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
        double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
        Entity entity = (Entity) dependencies.get("entity");
        if (entity instanceof PlayerEntity) {
            Random random = new Random();
            if (entity.isOnFire()) {
                if (world instanceof World && !((World) world).isClientSide) {
                    ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z,
                            new ItemStack(CookedPlayerFleshItem.block, random.ints(1, 3 + 1).findFirst().getAsInt()));
                    entityToSpawn.setPickUpDelay(10);
                    world.addFreshEntity(entityToSpawn);
                }
            } else {
                if (world instanceof World && !((World) world).isClientSide) {
                    ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z,
                            new ItemStack(PlayerFleshItem.block, random.ints(1, 3 + 1).findFirst().getAsInt()));
                    entityToSpawn.setPickUpDelay(10);
                    world.addFreshEntity(entityToSpawn);
                }
            }
        }
    }

    @Mod.EventBusSubscriber
    private static class GlobalTrigger {
        @SubscribeEvent
        public static void onEntityDeath(LivingDeathEvent event) {
            if (event != null && event.getEntity() != null) {
                Entity entity = event.getEntity();
                Entity sourceentity = event.getSource().getEntity();
                double i = entity.getX();
                double j = entity.getY();
                double k = entity.getZ();
                World world = entity.level;
                Map<String, Object> dependencies = new HashMap<>();
                dependencies.put("x", i);
                dependencies.put("y", j);
                dependencies.put("z", k);
                dependencies.put("world", world);
                dependencies.put("entity", entity);
                dependencies.put("sourceentity", sourceentity);
                dependencies.put("event", event);
                executeProcedure(dependencies);
            }
        }
    }
}
