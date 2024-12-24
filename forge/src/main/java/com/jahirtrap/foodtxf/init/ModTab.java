package com.jahirtrap.foodtxf.init;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;

import static com.jahirtrap.foodtxf.FoodtxfMod.MODID;

public class ModTab {
    private static void register(CreativeModeTabEvent.Register register) {
        CreativeModeTab TAB_FOOD_TXF = register.registerCreativeModeTab(new ResourceLocation(MODID, "tab_foodtxf"), builder -> builder.icon(() -> new ItemStack(ModContent.NETHERITE_SKILLET.get()))
                .displayItems((features, event) -> {
                    for (RegistryObject<Item> item : ModContent.ITEMS.getEntries())
                        if (!ModContent.EXCLUDED_ITEMS.contains(item)) event.accept(item.get());
                })
                .title(Component.translatable("itemGroup.foodtxf.tab_foodtxf"))
                .build());
    }

    public static void init(IEventBus bus) {
        bus.addListener(ModTab::register);
    }
}
