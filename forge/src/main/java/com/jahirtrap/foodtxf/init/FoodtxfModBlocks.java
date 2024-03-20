package com.jahirtrap.foodtxf.init;

import com.jahirtrap.foodtxf.FoodtxfMod;
import com.jahirtrap.foodtxf.block.BaseKitchenBlock;
import com.jahirtrap.foodtxf.block.BaseLampBlock;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class FoodtxfModBlocks {
    public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, FoodtxfMod.MODID);
    public static final RegistryObject<Block> BLACK_KITCHEN_BLOCK = REGISTRY.register("black_kitchen_block", BaseKitchenBlock::new);
    public static final RegistryObject<Block> WHITE_KITCHEN_BLOCK = REGISTRY.register("white_kitchen_block", BaseKitchenBlock::new);
    public static final RegistryObject<Block> LAMP = REGISTRY.register("lamp", BaseLampBlock::new);
    public static final RegistryObject<Block> NETHERITE_LAMP = REGISTRY.register("netherite_lamp", BaseLampBlock::new);
}
