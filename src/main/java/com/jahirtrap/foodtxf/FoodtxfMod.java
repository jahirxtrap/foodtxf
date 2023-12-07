package com.jahirtrap.foodtxf;

import com.jahirtrap.configlib.TXFConfig;
import com.jahirtrap.foodtxf.init.FoodtxfModBlocks;
import com.jahirtrap.foodtxf.init.FoodtxfModConfig;
import com.jahirtrap.foodtxf.init.FoodtxfModItems;
import net.minecraftforge.client.ConfigGuiHandler;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(FoodtxfMod.MODID)
public class FoodtxfMod {

    public static final String MODID = "foodtxf";

    public FoodtxfMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        TXFConfig.init(MODID, FoodtxfModConfig.class);
        ModLoadingContext.get().registerExtensionPoint(ConfigGuiHandler.ConfigGuiFactory.class, () ->
                new ConfigGuiHandler.ConfigGuiFactory((client, parent) -> TXFConfig.getScreen(parent, MODID)));

        FoodtxfModBlocks.REGISTRY.register(bus);
        FoodtxfModItems.REGISTRY.register(bus);
        FoodtxfModTab.init();
    }
}
