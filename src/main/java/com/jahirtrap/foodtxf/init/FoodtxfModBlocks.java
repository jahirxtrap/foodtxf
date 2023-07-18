package com.jahirtrap.foodtxf.init;

import com.jahirtrap.foodtxf.FoodtxfMod;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import com.jahirtrap.foodtxf.block.WhiteKitchenBlockBlock;
import com.jahirtrap.foodtxf.block.BlackKitchenBlockBlock;

public class FoodtxfModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, FoodtxfMod.MODID);
	public static final RegistryObject<Block> BLACK_KITCHEN_BLOCK = REGISTRY.register("black_kitchen_block", BlackKitchenBlockBlock::new);
	public static final RegistryObject<Block> WHITE_KITCHEN_BLOCK = REGISTRY.register("white_kitchen_block", WhiteKitchenBlockBlock::new);
}
