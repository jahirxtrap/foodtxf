package com.jahirtrap.foodtxf.event;

import com.jahirtrap.foodtxf.init.FoodtxfDamageSources;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;

import java.util.Objects;

import static com.jahirtrap.foodtxf.util.CommonUtils.checkCreativeMode;
import static com.jahirtrap.foodtxf.util.CommonUtils.dropFlesh;

public class PlayerDropsFleshKnifeEvent {
    public static void execute(LevelAccessor accesor, double x, double y, double z, Entity entity, ItemStack stack) {
        if (!(entity instanceof Player player)) return;
        if (!player.isShiftKeyDown()) return;
        ItemStack mainHandIst = player.getMainHandItem(), offHandIst = player.getOffhandItem();
        ItemStack empty = ItemStack.EMPTY, ist;
        boolean creativeMode = checkCreativeMode(entity), mainHand;

        if (offHandIst == mainHandIst) mainHandIst = empty;
        if (mainHandIst == stack && offHandIst == empty) {
            ist = mainHandIst;
            mainHand = true;
        } else if (offHandIst == stack) {
            ist = offHandIst;
            mainHand = false;
        } else return;

        Holder<Enchantment> faHolder = accesor.registryAccess().registryOrThrow(Registries.ENCHANTMENT).getHolderOrThrow(Enchantments.FIRE_ASPECT);
        int faLevel = EnchantmentHelper.getTagEnchantmentLevel(faHolder, ist);

        if (faLevel != 0) entity.setRemainingFireTicks((20 * 4) * faLevel);

        if (player.hurt(new DamageSource(accesor.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(FoodtxfDamageSources.SUICIDE)), 6)) {
            if (accesor instanceof ServerLevel serverLevel) {
                Runnable damageItem = () -> ist.hurtAndBreak(1, serverLevel, null, (a) -> {
                    ist.shrink(1);
                    ist.setDamageValue(0);
                });
                damageItem.run();
            }

            if (mainHand) player.swing(InteractionHand.MAIN_HAND, true);
            else player.swing(InteractionHand.OFF_HAND, true);

            if (accesor instanceof Level level && !level.isClientSide())
                level.addFreshEntity(dropFlesh(entity, level, x, y, z, 1));
        } else if (creativeMode) {
            if (mainHand) player.swing(InteractionHand.MAIN_HAND, true);
            else player.swing(InteractionHand.OFF_HAND, true);

            if (!(accesor instanceof Level level)) return;
            if (!level.isClientSide()) {
                level.playSound(null, new BlockPos((int) x, (int) y, (int) z),
                        Objects.requireNonNull(BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.player.hurt"))), SoundSource.PLAYERS,
                        (float) 0.8, 1);
            } else {
                level.playLocalSound(x, y, z, Objects.requireNonNull(BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.player.hurt"))),
                        SoundSource.PLAYERS, (float) 0.8, 1, false);
            }

            if (!level.isClientSide()) {
                level.addFreshEntity(dropFlesh(entity, level, x, y, z, 1));
            }
        }
    }
}
