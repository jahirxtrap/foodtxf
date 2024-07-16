package com.jahirtrap.foodtxf.item;

import com.jahirtrap.foodtxf.event.PlayerDropsFleshKnifeEvent;
import com.jahirtrap.foodtxf.init.FoodtxfModConfig;
import com.jahirtrap.foodtxf.util.RepairableItem;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;

import static com.jahirtrap.foodtxf.util.CommonUtils.hurt;

public class BaseKnifeItem extends SwordItem implements RepairableItem, FabricItem {
    public BaseKnifeItem(Tier tier, Properties properties) {
        super(tier, 1, -2f, properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        InteractionResultHolder<ItemStack> holder = super.use(level, player, hand);
        ItemStack stack = player.getItemInHand(hand);

        if (FoodtxfModConfig.enableCannibalism && FoodtxfModConfig.knifeDropFlesh)
            if (PlayerDropsFleshKnifeEvent.execute(level, player, hand))
                return new InteractionResultHolder<>(InteractionResult.SUCCESS, stack);

        return holder;
    }

    @Override
    public boolean hasCraftingRemainingItem() {
        return true;
    }

    @Override
    public ItemStack getRecipeRemainder(ItemStack stack) {
        return hurt(1, stack);
    }

    @Override
    public boolean isRepairable() {
        return false;
    }
}
