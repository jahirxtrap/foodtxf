package com.jahirtrap.foodtxf.event;

import com.jahirtrap.foodtxf.item.BaseKnifeItem;
import net.minecraft.core.registries.Registries;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;

import static com.jahirtrap.foodtxf.init.ModDamageSources.SUICIDE;
import static com.jahirtrap.foodtxf.util.CommonUtils.checkCreativeMode;
import static com.jahirtrap.foodtxf.util.CommonUtils.dropFlesh;

public class PlayerDropsFleshKnifeEvent {
    public static boolean execute(Level level, Player player, InteractionHand hand) {
        if (!player.isShiftKeyDown()) return false;
        ItemStack mainHandIst = player.getMainHandItem(), offHandIst = player.getOffhandItem(), stack = ItemStack.EMPTY;

        if (isKnife(mainHandIst)) stack = mainHandIst;
        else if (isKnife(offHandIst)) stack = offHandIst;

        int faLevel = EnchantmentHelper.getItemEnchantmentLevel(Enchantments.FIRE_ASPECT, stack);
        if (faLevel != 0) player.setSecondsOnFire(4 * faLevel);

        if (player.hurt(new DamageSource(level.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(SUICIDE)), 6)) {
            stack.hurtAndBreak(1, player, a -> a.broadcastBreakEvent(hand));
            level.addFreshEntity(dropFlesh(player, level, 1));
            return true;
        } else if (checkCreativeMode(player)) {
            level.playSound(null, player.blockPosition(), SoundEvents.PLAYER_HURT, SoundSource.PLAYERS);
            level.addFreshEntity(dropFlesh(player, level, 1));
            return true;
        }

        return false;
    }

    private static boolean isKnife(ItemStack stack) {
        return stack.getItem() instanceof BaseKnifeItem;
    }
}
