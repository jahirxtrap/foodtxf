package com.jahirtrap.foodtxf.event;

import com.jahirtrap.foodtxf.init.ModConfig;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Random;

import static com.jahirtrap.foodtxf.util.CommonUtils.dropFlesh;

@Mod.EventBusSubscriber
public class PlayerDropsFleshEvent {
    @SubscribeEvent
    public static void onLivingDeath(LivingDeathEvent event) {
        if (ModConfig.enableCannibalism && ModConfig.playerDropFlesh)
            if (event.getEntity() instanceof Player player) execute(player.level(), player);
    }

    private static void execute(Level level, Player player) {
        Random random = new Random();
        int rand = random.ints(1, 3 + 1).findFirst().getAsInt();
        level.addFreshEntity(dropFlesh(player, level, rand));
    }
}
