package com.jahirtrap.foodtxf.init;

import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;

import java.util.ArrayList;
import java.util.List;

public class ModVillagerTrades {
    private static void addTrades() {
        create(VillagerProfession.FARMER, 1, new VillagerTrades.ItemsForEmeralds(ModContent.RICE_CROP, 1, 9, 16, 1));
    }

    private static void create(VillagerProfession profession, int level, VillagerTrades.ItemListing itemListing) {
        var levels = VillagerTrades.TRADES.get(profession);
        var trades = new ArrayList<>(List.of(levels.get(level)));
        trades.add(itemListing);
        levels.replace(level, trades.toArray(new VillagerTrades.ItemListing[0]));
        VillagerTrades.TRADES.put(profession, levels);
    }

    public static void init() {
        addTrades();
    }
}