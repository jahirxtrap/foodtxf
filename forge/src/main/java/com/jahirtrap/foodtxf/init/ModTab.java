package com.jahirtrap.foodtxf.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import static com.jahirtrap.foodtxf.FoodtxfMod.MODID;

public class ModTab {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    public static final RegistryObject<CreativeModeTab> TAB_FOOD_TXF = TABS.register("tab_foodtxf", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(ModContent.NETHERITE_SKILLET.get()))
            .displayItems((features, event) -> {
                for (RegistryObject<Item> item : ModContent.ITEMS.getEntries())
                    if (!ModContent.EXCLUDE_ITEMS.contains(item)) event.accept(item.get());
            })
            .title(Component.translatable("itemGroup.foodtxf.tab_foodtxf"))
            .build());

    public static void init(IEventBus bus) {
        TABS.register(bus);
    }
}
