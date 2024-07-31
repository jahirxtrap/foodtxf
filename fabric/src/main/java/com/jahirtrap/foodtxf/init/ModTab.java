package com.jahirtrap.foodtxf.init;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import static com.jahirtrap.foodtxf.FoodtxfMod.MODID;

public class ModTab {
    public static CreativeModeTab TAB_FOOD_TXF = FabricItemGroupBuilder.build(
            new ResourceLocation(MODID, "tab_foodtxf"), () -> new ItemStack(ModContent.NETHERITE_SKILLET));

    public static void init() {
    }
}
