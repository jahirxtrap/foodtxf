package com.jahirtrap.foodtxf;

import com.jahirtrap.foodtxf.init.ModContent;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

@EventBusSubscriber(modid = FoodtxfMod.MODID, value = Dist.CLIENT)
public class FoodtxfClient {
    @SubscribeEvent
    public static void onEvent(FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(ModContent.RICE_CROP.get(), ChunkSectionLayer.CUTOUT);
    }
}
