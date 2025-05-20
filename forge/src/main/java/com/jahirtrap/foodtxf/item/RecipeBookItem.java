package com.jahirtrap.foodtxf.item;

import com.klikli_dev.modonomicon.client.gui.BookGuiManager;
import com.klikli_dev.modonomicon.client.gui.book.BookAddress;
import net.minecraft.ChatFormatting;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.fml.ModList;

import java.util.List;

public class RecipeBookItem extends Item {
    public RecipeBookItem() {
        super(new Item.Properties().stacksTo(1));
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if (ModList.get().isLoaded("modonomicon")) {
            BookGuiManager.get().openBook(BookAddress.defaultFor(BuiltInRegistries.ITEM.getKey(this)));
            return new InteractionResultHolder<>(InteractionResult.SUCCESS, player.getItemInHand(hand));
        } else return super.use(level, player, hand);
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltip, TooltipFlag tooltipFlag) {
        if (!ModList.get().isLoaded("modonomicon")) {
            tooltip.add(Component.translatable("tooltip.foodtxf.modonomicon").withStyle(ChatFormatting.GRAY));
        }
    }
}
