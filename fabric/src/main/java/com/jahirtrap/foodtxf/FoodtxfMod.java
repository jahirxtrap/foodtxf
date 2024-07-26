package com.jahirtrap.foodtxf;

import com.jahirtrap.configlib.TXFConfig;
import com.jahirtrap.foodtxf.event.PlayerDropsFleshEvent;
import com.jahirtrap.foodtxf.init.ModConfig;
import com.jahirtrap.foodtxf.init.ModItems;
import com.jahirtrap.foodtxf.init.ModTab;
import net.fabricmc.api.ModInitializer;

public class FoodtxfMod implements ModInitializer {

    public static final String MODID = "foodtxf";

    @Override
    public void onInitialize() {
        TXFConfig.init(MODID, ModConfig.class);
        ModItems.init();
        ModTab.init();
        initEvents();
    }

    public void initEvents() {
        new PlayerDropsFleshEvent();
    }
}
