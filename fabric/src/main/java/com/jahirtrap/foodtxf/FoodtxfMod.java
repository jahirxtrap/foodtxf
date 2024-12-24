package com.jahirtrap.foodtxf;

import com.jahirtrap.configlib.TXFConfig;
import com.jahirtrap.foodtxf.event.PlayerDropsFleshEvent;
import com.jahirtrap.foodtxf.init.ModConfig;
import com.jahirtrap.foodtxf.init.ModContent;
import com.jahirtrap.foodtxf.init.ModVillagerTrades;
import net.fabricmc.api.ModInitializer;

public class FoodtxfMod implements ModInitializer {

    public static final String MODID = "foodtxf";

    @Override
    public void onInitialize() {
        TXFConfig.init(MODID, ModConfig.class);
        ModContent.init();
        ModVillagerTrades.init();
        initEvents();
    }

    public void initEvents() {
        new PlayerDropsFleshEvent();
    }
}
