package com.jahirtrap.foodtxf;

import com.jahirtrap.foodtxf.init.ModContent;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = FoodtxfMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class FoodtxfClient {
    @SubscribeEvent
    public static void onEvent(FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(ModContent.RICE_CROP.get(), RenderType.cutout());
    }
}
