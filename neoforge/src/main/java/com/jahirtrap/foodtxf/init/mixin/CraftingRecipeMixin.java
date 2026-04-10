package com.jahirtrap.foodtxf.init.mixin;

import com.jahirtrap.foodtxf.util.CraftingRemainderItem;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemStackTemplate;
import net.minecraft.world.item.crafting.CraftingInput;
import net.minecraft.world.item.crafting.CraftingRecipe;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(CraftingRecipe.class)
public interface CraftingRecipeMixin {

    @Inject(method = "getRemainingItems", at = @At("HEAD"), cancellable = true)
    private void remainder(CraftingInput input, CallbackInfoReturnable<NonNullList<ItemStack>> cir) {
        NonNullList<ItemStack> remaining = NonNullList.withSize(input.size(), ItemStack.EMPTY);

        for (int i = 0; i < remaining.size(); i++) {
            ItemStack stack = input.getItem(i);
            if (stack.getItem() instanceof CraftingRemainderItem remainderItem) {
                ItemStackTemplate remainder = remainderItem.getCraftingRemainder(stack);
                remaining.set(i, remainder != null ? remainder.create() : ItemStack.EMPTY);
                cir.setReturnValue(remaining);
            }
        }
    }
}
