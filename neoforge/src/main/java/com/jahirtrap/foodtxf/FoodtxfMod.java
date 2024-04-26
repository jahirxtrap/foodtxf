package com.jahirtrap.foodtxf;

import com.jahirtrap.foodtxf.init.FoodtxfModBlocks;
import com.jahirtrap.foodtxf.init.FoodtxfModConfig;
import com.jahirtrap.foodtxf.init.FoodtxfModItems;
import com.jahirtrap.foodtxf.util.configlib.TXFConfig;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModLoadingContext;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;

@Mod(FoodtxfMod.MODID)
public class FoodtxfMod {

    public static final String MODID = "foodtxf";

    public FoodtxfMod(IEventBus bus) {
        TXFConfig.init(MODID, FoodtxfModConfig.class);
        ModLoadingContext.get().registerExtensionPoint(IConfigScreenFactory.class, () ->
                (client, parent) -> TXFConfig.getScreen(parent, MODID));

        FoodtxfModBlocks.REGISTRY.register(bus);
        FoodtxfModItems.REGISTRY.register(bus);
        FoodtxfModTab.init(bus);
    }
}
