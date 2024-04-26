package com.jahirtrap.foodtxf.init;

import com.jahirtrap.foodtxf.block.BaseKitchenBlock;
import com.jahirtrap.foodtxf.block.BaseLampBlock;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import static com.jahirtrap.foodtxf.FoodtxfMod.MODID;

public class FoodtxfModBlocks {
    public static final Block BLACK_KITCHEN_BLOCK = RegistryObject("black_kitchen_block", new BaseKitchenBlock());
    public static final Block WHITE_KITCHEN_BLOCK = RegistryObject("white_kitchen_block", new BaseKitchenBlock());
    public static final Block LAMP = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MODID, "lamp"), new BaseLampBlock());
    public static final Block NETHERITE_LAMP = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MODID, "netherite_lamp"), new BaseLampBlock());

    public static void init() {
    }

    public static Block RegistryObject(String name, Block block) {
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MODID, name), new BlockItem(block, new Item.Properties()));
        return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MODID, name), block);
    }
}
