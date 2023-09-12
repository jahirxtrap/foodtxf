package com.jahirtrap.foodtxf;

import com.jahirtrap.foodtxf.init.FoodtxfModBlocks;
import com.jahirtrap.foodtxf.init.FoodtxfModConfig;
import com.jahirtrap.foodtxf.init.FoodtxfModEvents;
import com.jahirtrap.foodtxf.init.FoodtxfModItems;
import eu.midnightdust.lib.config.MidnightConfig;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class FoodtxfMod implements ModInitializer {
    public static final String MODID = "foodtxf";

    public static final CreativeModeTab TAB_FOOD_TXF = FabricItemGroupBuilder.build(new ResourceLocation(FoodtxfMod.MODID, "tabfood_txf"), () -> new ItemStack(FoodtxfModItems.NETHERITE_KNIFE));

    @Override
    public void onInitialize() {
        MidnightConfig.init(MODID, FoodtxfModConfig.class);
        FoodtxfModBlocks.init();
        FoodtxfModItems.init();
        FoodtxfModEvents.init();
    }
}
