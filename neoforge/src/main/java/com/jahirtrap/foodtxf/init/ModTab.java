package com.jahirtrap.foodtxf.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.jahirtrap.foodtxf.FoodtxfMod.MODID;

public class ModTab {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    public static final Supplier<CreativeModeTab> TAB_FOOD_TXF = TABS.register("tab_foodtxf", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(ModContent.NETHERITE_SKILLET.get()))
            .displayItems((features, event) -> {
                for (DeferredHolder<Item, ? extends Item> item : ModContent.ITEMS.getEntries())
                    if (!ModContent.EXCLUDE_ITEMS.contains(item)) event.accept(item.get());
            })
            .title(Component.translatable("itemGroup.foodtxf.tab_foodtxf"))
            .build());

    public static void init(IEventBus bus) {
        TABS.register(bus);
    }
}
