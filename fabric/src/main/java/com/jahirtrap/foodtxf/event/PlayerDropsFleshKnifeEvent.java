package com.jahirtrap.foodtxf.event;

import com.jahirtrap.foodtxf.item.BaseKnifeItem;
import net.minecraft.core.registries.Registries;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;

import static com.jahirtrap.foodtxf.init.FoodtxfDamageSources.SUICIDE;
import static com.jahirtrap.foodtxf.util.CommonUtils.checkCreativeMode;
import static com.jahirtrap.foodtxf.util.CommonUtils.dropFlesh;

public class PlayerDropsFleshKnifeEvent {
    public static boolean execute(Level level, Player player, InteractionHand hand) {
        if (!player.isCrouching()) return false;
        ItemStack mainHandIst = player.getMainHandItem(), offHandIst = player.getOffhandItem(), stack = ItemStack.EMPTY;

        if (isKnife(mainHandIst)) stack = mainHandIst;
        else if (isKnife(offHandIst)) stack = offHandIst;

        int faLevel = stack.getEnchantments().getLevel(Enchantments.FIRE_ASPECT);
        if (faLevel != 0) player.setRemainingFireTicks(20 * 4 * faLevel);

        if (player.hurt(new DamageSource(level.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(SUICIDE)), 6)) {
            stack.hurtAndBreak(1, player, hand == InteractionHand.MAIN_HAND ? EquipmentSlot.MAINHAND : EquipmentSlot.OFFHAND);
            level.addFreshEntity(dropFlesh(player, level, 1));
            return true;
        } else if (checkCreativeMode(player)) {
            player.playSound(SoundEvents.PLAYER_HURT, 1, 1);
            level.addFreshEntity(dropFlesh(player, level, 1));
            return true;
        }

        return false;
    }

    private static boolean isKnife(ItemStack stack) {
        return stack.getItem() instanceof BaseKnifeItem;
    }
}
