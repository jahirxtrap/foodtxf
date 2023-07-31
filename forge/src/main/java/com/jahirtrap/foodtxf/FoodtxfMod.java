package com.jahirtrap.foodtxf;

import com.jahirtrap.foodtxf.init.FoodtxfModBlocks;
import com.jahirtrap.foodtxf.init.FoodtxfModConfig;
import com.jahirtrap.foodtxf.init.FoodtxfModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig.Type;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(FoodtxfMod.MODID)
public class FoodtxfMod {
    public static final String MODID = "foodtxf";
    public static CreativeModeTab MODTAB;

    public FoodtxfMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ModLoadingContext.get().registerConfig(Type.COMMON, FoodtxfModConfig.COMMON_CONFIG);

        bus.addListener(this::registerCreativeTab);
        bus.addListener(FoodtxfModTab::buildContents);
        FoodtxfModBlocks.REGISTRY.register(bus);
        FoodtxfModItems.REGISTRY.register(bus);
    }

    void registerCreativeTab(CreativeModeTabEvent.Register event) {
        MODTAB = event.registerCreativeModeTab(new ResourceLocation(MODID, "tabfood_txf"), builder -> builder.icon(() -> new ItemStack(FoodtxfModItems.NETHERITE_KNIFE.get()))
                .title(Component.translatable("itemGroup.tabfood_txf")).build());
    }
}
