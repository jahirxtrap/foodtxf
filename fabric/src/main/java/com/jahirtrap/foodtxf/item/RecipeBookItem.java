package com.jahirtrap.foodtxf.item;

import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.ChatFormatting;
import net.minecraft.core.Registry;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import vazkii.patchouli.api.PatchouliAPI;

import java.util.List;

import static com.jahirtrap.foodtxf.FoodtxfModTab.TAB_FOOD_TXF;

public class RecipeBookItem extends Item {
    public RecipeBookItem() {
        super(new Item.Properties().tab(TAB_FOOD_TXF).stacksTo(1));
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        InteractionResultHolder<ItemStack> holder = super.use(level, player, hand);
        ItemStack stack = player.getItemInHand(hand);

        if (player instanceof ServerPlayer serverPlayer && FabricLoader.getInstance().isModLoaded("patchouli")) {
            PatchouliAPI.get().openBookGUI(serverPlayer, Registry.ITEM.getKey(this));
        } else {
            return holder;
        }

        return new InteractionResultHolder<>(InteractionResult.SUCCESS, stack);
    }

    @Override
    public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag tooltipFlag) {
        if (!FabricLoader.getInstance().isModLoaded("patchouli")) {
            tooltip.add(Component.translatable("tooltip.foodtxf.patchouli").withStyle(ChatFormatting.GRAY));
        } else {
            tooltip.add(Component.translatable("patchouli.gui.lexicon.edition_str", "1st").withStyle(ChatFormatting.GRAY));
        }
    }
}
