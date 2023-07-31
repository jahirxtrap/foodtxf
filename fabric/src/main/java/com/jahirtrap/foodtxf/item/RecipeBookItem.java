package com.jahirtrap.foodtxf.item;

import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.ChatFormatting;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import vazkii.patchouli.api.PatchouliAPI;

import java.util.List;

public class RecipeBookItem extends Item {
    public RecipeBookItem() {
        super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
        InteractionResultHolder<ItemStack> holder = super.use(world, entity, hand);
        ItemStack stack = entity.getItemInHand(hand);

        if (entity instanceof ServerPlayer player && FabricLoader.getInstance().isModLoaded("patchouli")) {
            PatchouliAPI.get().openBookGUI(player, BuiltInRegistries.ITEM.getKey(this));
        } else {
            return holder;
        }

        return new InteractionResultHolder<>(InteractionResult.SUCCESS, stack);
    }

    @Override
    public void appendHoverText(ItemStack itemStack, Level level, List<Component> tooltip, TooltipFlag tooltipFlag) {
        if (!FabricLoader.getInstance().isModLoaded("patchouli")) {
            tooltip.add(Component.translatable("tooltip.foodtxf.patchouli").withStyle(ChatFormatting.GRAY));
        } else {
            tooltip.add(Component.translatable("patchouli.gui.lexicon.edition_str", "1st").withStyle(ChatFormatting.GRAY));
        }
    }
}
