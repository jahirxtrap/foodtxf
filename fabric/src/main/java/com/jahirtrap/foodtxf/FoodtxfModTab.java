package com.jahirtrap.foodtxf;

import com.jahirtrap.foodtxf.init.FoodtxfModItems;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class FoodtxfModTab {
    public static CreativeModeTab TAB_FOOD_TXF = FabricItemGroupBuilder.build(
            new ResourceLocation(FoodtxfMod.MODID, "tab_foodtxf"), () -> new ItemStack(FoodtxfModItems.NETHERITE_KNIFE));

    public static void init() {
    }
}
