package com.jahirtrap.foodtxf.block;

import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.ChatFormatting;
import net.minecraft.client.resources.language.I18n;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item.TooltipContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.block.Block;

import java.util.List;

import static com.jahirtrap.foodtxf.util.CommonUtils.coloredTextComponent;

public class BaseKitchenBlock extends Block {
    public BaseKitchenBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltip, TooltipFlag flag) {
        if (FabricLoader.getInstance().isModLoaded("cookingforblockheads")) {
            tooltip.add(coloredTextComponent("tooltip.cookingforblockheads.multiblock_kitchen", ChatFormatting.YELLOW));
            for (String s : I18n.get("tooltip.cookingforblockheads.kitchen_floor.description").split("\\\\n")) {
                tooltip.add(coloredTextComponent(s, ChatFormatting.GRAY));
            }
        }
    }
}
