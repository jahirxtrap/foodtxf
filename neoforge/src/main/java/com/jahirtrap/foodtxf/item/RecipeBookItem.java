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
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.level.Level;
import net.neoforged.fml.ModList;
import vazkii.patchouli.api.PatchouliAPI;

import java.util.function.Consumer;

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
    public void appendHoverText(ItemStack stack, TooltipContext context, TooltipDisplay display, Consumer<Component> tooltip, TooltipFlag flag) {
        if (!ModList.get().isLoaded("patchouli")) {
            tooltip.accept(Component.translatable("tooltip.foodtxf.patchouli").withStyle(ChatFormatting.GRAY));
        } else {
            tooltip.accept(Component.translatable("patchouli.gui.lexicon.edition_str", "1st").withStyle(ChatFormatting.GRAY));
        }
    }
}
