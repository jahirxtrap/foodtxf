package com.jahirtrap.foodtxf.init;

import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.ToolMaterial;

public class ModMaterials {
    public interface Tool {
        ToolMaterial BREAD = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 80, 2f, 1f, 15, ItemTags.WOODEN_TOOL_MATERIALS);
        ToolMaterial STEEL = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 501, 6.5f, 2f, 14, ItemTags.IRON_TOOL_MATERIALS);
        ToolMaterial BRONZE = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 350, 7f, 2f, 16, ItemTags.GOLD_TOOL_MATERIALS);
        ToolMaterial ENDERITE = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 4096, 15f, 5f, 17, ItemTags.NETHERITE_TOOL_MATERIALS);
    }
}
