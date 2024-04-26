package com.jahirtrap.foodtxf.item;

import com.jahirtrap.foodtxf.event.PlayerDropsFleshKnifeEvent;
import com.jahirtrap.foodtxf.init.FoodtxfModConfig;
import com.jahirtrap.foodtxf.util.RepairableItem;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;

public class BaseKnifeItem extends SwordItem implements RepairableItem, FabricItem {
    public BaseKnifeItem(Tier tier, Properties properties) {
        super(tier, properties.attributes(createAttributes(tier, 1, -2f)));
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        InteractionResultHolder<ItemStack> holder = super.use(level, player, hand);
        if (FoodtxfModConfig.enableCannibalism && FoodtxfModConfig.knifeDropFlesh) {
            PlayerDropsFleshKnifeEvent.execute(level, player.getX(), player.getY(), player.getZ(), player, holder.getObject());
        }
        return holder;
    }

    @Override
    public boolean hasCraftingRemainingItem() {
        return true;
    }

    @Override
    public ItemStack getRecipeRemainder(ItemStack stack) {
        ItemStack retVal = stack.copy();
        if (retVal.getComponents().has(DataComponents.UNBREAKABLE)) return retVal;
        retVal.setDamageValue(stack.getDamageValue() + 1);
        if (retVal.getDamageValue() >= retVal.getMaxDamage()) {
            return ItemStack.EMPTY;
        }
        return retVal;
    }

    @Override
    public boolean isRepairable() {
        return false;
    }
}
