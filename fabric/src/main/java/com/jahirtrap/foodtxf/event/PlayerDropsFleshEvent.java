package com.jahirtrap.foodtxf.event;

import com.jahirtrap.foodtxf.init.ModConfig;
import net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

import java.util.Random;

import static com.jahirtrap.foodtxf.util.CommonUtils.dropFlesh;

public class PlayerDropsFleshEvent {
    public PlayerDropsFleshEvent() {
        ServerPlayerEvents.ALLOW_DEATH.register((player, damageSource, amount) -> {
            if (ModConfig.enableCannibalism && ModConfig.playerDropFlesh)
                if (player != null) execute(player.level(), player);
            return true;
        });
    }

    private static void execute(Level level, Player player) {
        Random random = new Random();
        int rand = random.ints(1, 3 + 1).findFirst().getAsInt();
        level.addFreshEntity(dropFlesh(player, level, rand));
    }
}
