package com.jahirtrap.foodtxf.item;

import net.minecraft.ChatFormatting;
import net.minecraft.client.resources.language.I18n;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.level.block.Block;
import net.neoforged.fml.ModList;

import java.util.function.Consumer;

import static com.jahirtrap.foodtxf.util.CommonUtils.coloredTextComponent;

public class BaseKitchenBlock extends BlockItem {
    public BaseKitchenBlock(Block block, Properties properties) {
        super(block, properties.useBlockDescriptionPrefix());
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, TooltipDisplay display, Consumer<Component> tooltip, TooltipFlag flag) {
        if (ModList.get().isLoaded("cookingforblockheads")) {
            tooltip.accept(coloredTextComponent("tooltip.cookingforblockheads.multiblock_kitchen", ChatFormatting.YELLOW));
            for (String s : I18n.get("tooltip.cookingforblockheads.kitchen_floor.description").split("\\\\n")) {
                tooltip.accept(coloredTextComponent(s, ChatFormatting.GRAY));
            }
        }
    }
}
