package com.jahirtrap.foodtxf.init;

import com.jahirtrap.foodtxf.block.BaseKitchenBlock;
import com.jahirtrap.foodtxf.block.LampBlock;
import com.jahirtrap.foodtxf.item.BaseWearableItem;
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
    public static final Block LAMP = RegistryObjectWearable("lamp", new LampBlock());

    public static void init() {
    }

    public static Block RegistryObject(String name, Block block) {
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MODID, name), new BlockItem(block, new Item.Properties()));
        return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MODID, name), block);
    }

    public static Block RegistryObjectWearable(String name, Block block) {
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MODID, name), new BaseWearableItem(block, new Item.Properties()));
        return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MODID, name), block);
    }
}
