package com.jahirtrap.foodtxf.init;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.ToolMaterial;
import net.minecraftforge.common.Tags;

public class ModMaterials {
    public interface Tool {
        ToolMaterial BREAD = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 80, 2f, 1f, 15, Tags.Items.FOODS_BREAD);
        ToolMaterial STEEL = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 501, 6.5f, 2f, 14, ModTags.Items.STEEL_INGOTS);
        ToolMaterial BRONZE = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 350, 7f, 2f, 16, ModTags.Items.BRONZE_INGOTS);
        ToolMaterial ENDERITE = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 4096, 15f, 5f, 17, ModTags.Items.ENDERITE_INGOTS);
    }
}
