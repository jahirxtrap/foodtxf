package com.jahirtrap.foodtxf;

import com.jahirtrap.foodtxf.init.FoodtxfModBlocks;
import com.jahirtrap.foodtxf.init.FoodtxfModConfig;
import com.jahirtrap.foodtxf.init.FoodtxfModItems;
import com.jahirtrap.foodtxf.init.FoodtxfModProcedures;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;

public class FoodtxfMod implements ModInitializer {
    public static final String MODID = "foodtxf";

    public static final CreativeModeTab TAB_FOOD_TXF = FabricItemGroupBuilder.build(new ResourceLocation(FoodtxfMod.MODID, "tabfood_txf"), () -> new ItemStack(FoodtxfModItems.NETHERITE_KNIFE));

    @Override
    public void onInitialize() {
        ModLoadingContext.registerConfig(MODID, ModConfig.Type.COMMON, FoodtxfModConfig.COMMON_CONFIG);
        FoodtxfModBlocks.init();
        FoodtxfModItems.init();
        FoodtxfModProcedures.init();
    }
}
