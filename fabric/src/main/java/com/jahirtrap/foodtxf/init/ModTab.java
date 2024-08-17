package com.jahirtrap.foodtxf.init;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import static com.jahirtrap.foodtxf.FoodtxfMod.MODID;

public class ModTab {
    public static void init() {
        CreativeModeTab TAB_FOOD_TXF = FabricItemGroup.builder(new ResourceLocation(MODID, "tabfood_txf"))
                .icon(() -> new ItemStack(ModContent.NETHERITE_SKILLET))
                .displayItems((features, event) -> {
                    for (Item item : ModContent.ITEMS)
                        event.accept(item);
                })
                .title(Component.translatable("itemGroup.foodtxf.tab_foodtxf"))
                .build();
    }
}
