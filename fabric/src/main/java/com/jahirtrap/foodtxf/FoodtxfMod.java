package com.jahirtrap.foodtxf;

import com.jahirtrap.foodtxf.init.FoodtxfModBlocks;
import com.jahirtrap.foodtxf.init.FoodtxfModConfig;
import com.jahirtrap.foodtxf.init.FoodtxfModEvents;
import com.jahirtrap.foodtxf.init.FoodtxfModItems;
import eu.midnightdust.lib.config.MidnightConfig;
import net.fabricmc.api.ModInitializer;

public class FoodtxfMod implements ModInitializer {
    public static final String MODID = "foodtxf";

    @Override
    public void onInitialize() {
        MidnightConfig.init(MODID, FoodtxfModConfig.class);
        FoodtxfModBlocks.init();
        FoodtxfModItems.init();
        FoodtxfModTab.init();
        FoodtxfModEvents.init();
    }
}
