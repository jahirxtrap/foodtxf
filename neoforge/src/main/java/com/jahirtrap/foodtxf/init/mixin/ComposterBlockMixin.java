package com.jahirtrap.foodtxf.init.mixin;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.ComposterBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import static com.jahirtrap.foodtxf.init.ModContent.COMPOSTABLE_ITEMS;

@Mixin(ComposterBlock.class)
public class ComposterBlockMixin {

    @Inject(method = "getValue", at = @At("HEAD"), cancellable = true)
    private static void getValue(ItemStack stack, CallbackInfoReturnable<Float> cir) {
        COMPOSTABLE_ITEMS.forEach((item, chance) -> {
            if (stack.getItem() == item.get().asItem()) cir.setReturnValue(chance);
        });
    }
}
