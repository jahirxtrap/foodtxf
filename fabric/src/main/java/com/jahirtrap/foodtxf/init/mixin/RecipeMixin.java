package com.jahirtrap.foodtxf.init.mixin;

import com.jahirtrap.foodtxf.util.ContainerItem;
import net.minecraft.core.NonNullList;
import net.minecraft.world.Container;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Recipe;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Recipe.class)
public interface RecipeMixin<C extends Container> {

    @Inject(method = "getRemainingItems", at = @At("HEAD"), cancellable = true)
    private void remainder(C container, CallbackInfoReturnable<NonNullList<ItemStack>> cir) {
        NonNullList<ItemStack> nonNullList = NonNullList.withSize(container.getContainerSize(), ItemStack.EMPTY);

        for (int i = 0; i < nonNullList.size(); ++i) {
            Item item = container.getItem(i).getItem();
            if (item instanceof ContainerItem containerItem) {
                nonNullList.set(i, containerItem.getContainerItem(container.getItem(i).copy()));
                cir.setReturnValue(nonNullList);
            }
        }
    }
}
