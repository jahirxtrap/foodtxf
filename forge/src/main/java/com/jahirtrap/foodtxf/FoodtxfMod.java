package com.jahirtrap.foodtxf;

import com.jahirtrap.configlib.TXFConfig;
import com.jahirtrap.foodtxf.init.ModConfig;
import com.jahirtrap.foodtxf.init.ModContent;
import com.jahirtrap.foodtxf.init.ModTab;
import com.jahirtrap.foodtxf.init.ModVillagerTrades;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(FoodtxfMod.MODID)
public class FoodtxfMod {

    public static final String MODID = "foodtxf";

    public FoodtxfMod(FMLJavaModLoadingContext context) {
        BusGroup bus = context.getModBusGroup();

        TXFConfig.init(MODID, ModConfig.class);
        ModContent.init(bus);
        ModTab.init(bus);
        ModVillagerTrades.init(bus);
    }
}
