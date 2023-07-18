package com.jahirtrap.foodtxf;

import com.jahirtrap.foodtxf.init.FoodtxfModBlocks;
import com.jahirtrap.foodtxf.init.FoodtxfModConfig;
import com.jahirtrap.foodtxf.init.FoodtxfModItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("foodtxf")
public class FoodtxfMod {
    public static final String MODID = "foodtxf";
    public static final Logger LOGGER = LogManager.getLogger(FoodtxfMod.class);

    public FoodtxfMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, FoodtxfModConfig.COMMON_CONFIG);

        FoodtxfModTab.init();
        FoodtxfModBlocks.REGISTRY.register(bus);
        FoodtxfModItems.REGISTRY.register(bus);
    }
}
