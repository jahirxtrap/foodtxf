package com.jahirtrap.foodtxf.init;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

import java.util.ArrayList;
import java.util.List;

public class ModVillagerTrades {
    private static void addTrades(FMLCommonSetupEvent event) {
        if (!ModConfig.addVillagerTrades) return;
        create(VillagerProfession.FARMER, 1, new VillagerTrades.ItemsForEmeralds(ModContent.RICE_CROP.get(), 1, 9, 16, 1));
    }

    private static void create(ResourceKey<VillagerProfession> profession, int level, VillagerTrades.ItemListing itemListing) {
        var levels = VillagerTrades.TRADES.get(profession);
        var trades = new ArrayList<>(List.of(levels.get(level)));
        trades.add(itemListing);
        levels.replace(level, trades.toArray(new VillagerTrades.ItemListing[0]));
        VillagerTrades.TRADES.put(profession, levels);
    }

    public static void init(BusGroup bus) {
        FMLCommonSetupEvent.getBus(bus).addListener(ModVillagerTrades::addTrades);
    }
}
