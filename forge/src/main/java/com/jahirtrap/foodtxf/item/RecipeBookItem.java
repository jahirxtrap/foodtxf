package com.jahirtrap.foodtxf.item;

import net.minecraft.ChatFormatting;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.fml.ModList;
import vazkii.patchouli.api.PatchouliAPI;

import java.util.List;

public class RecipeBookItem extends Item {
    public RecipeBookItem(Properties properties) {
        super(properties.stacksTo(1));
    }

    @Override
    public InteractionResult use(Level level, Player player, InteractionHand hand) {
        if (player instanceof ServerPlayer serverPlayer && ModList.get().isLoaded("patchouli"))
            PatchouliAPI.get().openBookGUI(serverPlayer, BuiltInRegistries.ITEM.getKey(this));
        else return super.use(level, player, hand);

        return InteractionResult.SUCCESS;
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltip, TooltipFlag tooltipFlag) {
        if (!ModList.get().isLoaded("patchouli")) {
            tooltip.add(Component.translatable("tooltip.foodtxf.patchouli").withStyle(ChatFormatting.GRAY));
        } else {
            tooltip.add(Component.translatable("patchouli.gui.lexicon.edition_str", "1st").withStyle(ChatFormatting.GRAY));
        }
    }
}
