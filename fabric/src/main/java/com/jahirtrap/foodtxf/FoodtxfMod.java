package com.jahirtrap.foodtxf;

import com.jahirtrap.foodtxf.init.FoodtxfModBlocks;
import com.jahirtrap.foodtxf.init.FoodtxfModConfig;
import com.jahirtrap.foodtxf.init.FoodtxfModItems;
import com.jahirtrap.foodtxf.init.FoodtxfModProcedures;
import fuzs.forgeconfigapiport.api.config.v2.ForgeConfigRegistry;
import net.fabricmc.api.ModInitializer;
import net.minecraftforge.fml.config.ModConfig;

public class FoodtxfMod implements ModInitializer {
    public static final String MODID = "foodtxf";

    @Override
    public void onInitialize() {
        ForgeConfigRegistry.INSTANCE.register(MODID, ModConfig.Type.COMMON, FoodtxfModConfig.COMMON_CONFIG);
        FoodtxfModBlocks.init();
        FoodtxfModItems.init();
        FoodtxfModTab.init();
        FoodtxfModProcedures.init();
    }
}
