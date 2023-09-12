package com.jahirtrap.foodtxf.init.mixin;

import com.jahirtrap.foodtxf.util.WearableItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LivingEntity.class)
public class LivingEntityMixin {

    @Inject(method = "getEquipmentSlotForItem", at = @At("HEAD"), cancellable = true)
    private static void getEquipmentSlotForItem(ItemStack itemstack, CallbackInfoReturnable<EquipmentSlot> cir) {
        if (itemstack.getItem() instanceof WearableItem equipment) {
            cir.setReturnValue(equipment.getEquipmentSlot(itemstack));
        }
    }
}
