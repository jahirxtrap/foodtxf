package com.jahirtrap.foodtxf.init;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import static com.jahirtrap.foodtxf.FoodtxfMod.MODID;

public class ModTab {
    public static final CreativeModeTab TAB_FOOD_TXF = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModContent.NETHERITE_SKILLET))
            .displayItems((features, event) -> {
                for (Item item : ModContent.ITEMS)
                    if (!ModContent.EXCLUDED_ITEMS.contains(item)) event.accept(item);
            })
            .title(Component.translatable("itemGroup.foodtxf.tab_foodtxf"))
            .build();

    public static void init() {
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, ResourceLocation.fromNamespaceAndPath(MODID, "tab_foodtxf"), TAB_FOOD_TXF);
    }
}
