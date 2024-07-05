package com.jahirtrap.foodtxf.init;

import com.jahirtrap.foodtxf.block.BaseKitchenBlock;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.jahirtrap.foodtxf.FoodtxfMod.MODID;

public class FoodtxfModBlocks {
    public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(MODID);
    public static final DeferredBlock<Block> BLACK_KITCHEN_BLOCK = REGISTRY.register("black_kitchen_block", BaseKitchenBlock::new);
    public static final DeferredBlock<Block> WHITE_KITCHEN_BLOCK = REGISTRY.register("white_kitchen_block", BaseKitchenBlock::new);
}
