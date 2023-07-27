package com.jahirtrap.foodtxf.init;

import com.jahirtrap.foodtxf.block.BlackKitchenBlockBlock;
import com.jahirtrap.foodtxf.block.WhiteKitchenBlockBlock;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FoodtxfModBlocks {
    private static final List<Block> REGISTRY = new ArrayList<>();
    public static final Block BLACK_KITCHEN_BLOCK = register(new BlackKitchenBlockBlock());
    public static final Block WHITE_KITCHEN_BLOCK = register(new WhiteKitchenBlockBlock());

    private static Block register(Block block) {
        REGISTRY.add(block);
        return block;
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
    }
}
