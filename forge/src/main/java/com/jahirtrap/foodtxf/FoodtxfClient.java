package com.jahirtrap.foodtxf;

import com.jahirtrap.foodtxf.init.ModContent;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = FoodtxfMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class FoodtxfClient {
    @SubscribeEvent
    public static void onEvent(FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(ModContent.RICE_CROP.get(), ChunkSectionLayer.CUTOUT);
    }
}
