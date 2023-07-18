package com.jahirtrap.foodtxf.util;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

public class TextUtils {
    public static ITextComponent coloredTextComponent(String i18n, TextFormatting color) {
        TranslationTextComponent textComponent = new TranslationTextComponent(i18n);
        textComponent.getStyle().withColor(color);
        return textComponent;
    }
}
