package com.jahirtrap.foodtxf.block;

import net.minecraft.ChatFormatting;
import net.minecraft.client.resources.language.I18n;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fml.ModList;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import static com.jahirtrap.foodtxf.util.CommonUtils.coloredTextComponent;

public class BaseKitchenBlock extends Block {
    public BaseKitchenBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable BlockGetter level, List<Component> tooltip, TooltipFlag flag) {
        if (ModList.get().isLoaded("cookingforblockheads")) {
            tooltip.add(coloredTextComponent("tooltip.cookingforblockheads:multiblock_kitchen", ChatFormatting.YELLOW));
            for (String s : I18n.get("tooltip.cookingforblockheads:kitchen_floor.description").split("\\\\n")) {
                tooltip.add(coloredTextComponent(s, ChatFormatting.GRAY));
            }
        }
    }
}
