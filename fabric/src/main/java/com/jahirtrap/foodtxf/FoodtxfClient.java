package com.jahirtrap.foodtxf;

import com.jahirtrap.foodtxf.init.ModContent;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;

@Environment(EnvType.CLIENT)
public class FoodtxfClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.putBlock(ModContent.RICE_CROP, ChunkSectionLayer.CUTOUT);
    }
}
