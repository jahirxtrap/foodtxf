package com.jahirtrap.foodtxf.util;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;

public class TextUtils {
    public static Component coloredTextComponent(String i18n, ChatFormatting color) {
        var textComponent = new TranslatableComponent(i18n);
        textComponent.withStyle(color);
        return textComponent;
    }
}
