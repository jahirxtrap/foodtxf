package com.jahirtrap.foodtxf.init;

import com.jahirtrap.foodtxf.FoodtxfMod;
import com.jahirtrap.foodtxf.block.BaseKitchenBlock;
import com.jahirtrap.foodtxf.block.BaseLampBlock;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class FoodtxfModBlocks {
    public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(FoodtxfMod.MODID);
    public static final DeferredBlock<Block> BLACK_KITCHEN_BLOCK = REGISTRY.register("black_kitchen_block", BaseKitchenBlock::new);
    public static final DeferredBlock<Block> WHITE_KITCHEN_BLOCK = REGISTRY.register("white_kitchen_block", BaseKitchenBlock::new);
    public static final DeferredBlock<Block> LAMP = REGISTRY.register("lamp", BaseLampBlock::new);
    public static final DeferredBlock<Block> NETHERITE_LAMP = REGISTRY.register("netherite_lamp", BaseLampBlock::new);
}
