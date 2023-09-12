package com.jahirtrap.foodtxf.init;

import com.jahirtrap.foodtxf.block.BaseKitchenBlock;
import com.jahirtrap.foodtxf.block.LampBlock;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;

import static com.jahirtrap.foodtxf.FoodtxfMod.MODID;

public class FoodtxfModBlocks {
    public static final Block BLACK_KITCHEN_BLOCK = RegistryObject("black_kitchen_block", new BaseKitchenBlock());
    public static final Block WHITE_KITCHEN_BLOCK = RegistryObject("white_kitchen_block", new BaseKitchenBlock());
    public static final Block LAMP = RegistryObject("lamp", new LampBlock());

    public static void init() {
    }

    public static Block RegistryObject(String name, Block block) {
        return Registry.register(Registry.BLOCK, new ResourceLocation(MODID, name), block);
    }
}
