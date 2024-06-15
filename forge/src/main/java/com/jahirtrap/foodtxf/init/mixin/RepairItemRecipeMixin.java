package com.jahirtrap.foodtxf.init.mixin;

import com.jahirtrap.foodtxf.util.RepairableItem;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.CraftingInput;
import net.minecraft.world.item.crafting.RepairItemRecipe;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(RepairItemRecipe.class)
public abstract class RepairItemRecipeMixin {

    @Inject(method = "assemble*", at = @At("HEAD"), cancellable = true)
    private void assemble(CraftingInput craftingInput, Provider provider, CallbackInfoReturnable<ItemStack> cir) {
        for (int i = 0; i < craftingInput.size(); ++i) {
            if (craftingInput.getItem(i).getItem() instanceof RepairableItem repairableItem && !repairableItem.isRepairable())
                cir.setReturnValue(ItemStack.EMPTY);
        }
    }
}
