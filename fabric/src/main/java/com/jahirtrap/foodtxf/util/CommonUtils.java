package com.jahirtrap.foodtxf.util;

import com.jahirtrap.foodtxf.init.ModItems;
import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.component.ItemLore;
import net.minecraft.world.level.GameType;
import net.minecraft.world.level.Level;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CommonUtils {
    public static final List<Item> container = new ArrayList<>(Arrays.asList(ModItems.BOX, Items.BOWL, ModItems.GLASS, Items.STICK, ModItems.THERMOS));

    public static ItemEntity dropFlesh(Player player, Level level, int num) {
        ItemStack stack;
        if (player.isOnFire()) stack = new ItemStack(ModItems.COOKED_PLAYER_FLESH, num);
        else stack = new ItemStack(ModItems.PLAYER_FLESH, num);
        stack.set(DataComponents.LORE, new ItemLore(Collections.singletonList(Component.literal(player.getName().getString()).withStyle(Style.EMPTY.withColor(ChatFormatting.RED).withItalic(false)))));

        ItemEntity entityToSpawn = new ItemEntity(level, player.getX(), player.getY(), player.getZ(), stack);
        entityToSpawn.setPickUpDelay(10);

        return entityToSpawn;
    }

    public static boolean checkCreativeMode(Player player) {
        if (player instanceof ServerPlayer serverPlayer)
            return serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
        else if (player.level().isClientSide())
            return Minecraft.getInstance().getConnection().getPlayerInfo(player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;

        return false;
    }

    public static Component coloredTextComponent(String i18n, ChatFormatting color) {
        var textComponent = Component.translatable(i18n);
        textComponent.withStyle(color);

        return textComponent;
    }

    public static ItemStack hurt(int amount, ItemStack stack) {
        stack = stack.copy();
        if (!stack.isDamageableItem()) return stack;
        stack.setDamageValue(stack.getDamageValue() + amount);
        if (stack.getDamageValue() >= stack.getMaxDamage()) stack.shrink(1);

        return stack;
    }

    public static TagKey<Item> itemTag(String string) {
        return TagKey.create(Registries.ITEM, ResourceLocation.parse(string));
    }
}
