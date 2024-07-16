package com.jahirtrap.foodtxf.item;

import com.jahirtrap.foodtxf.event.PlayerDropsFleshKnifeEvent;
import com.jahirtrap.foodtxf.init.FoodtxfModConfig;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;

import static com.jahirtrap.foodtxf.FoodtxfModTab.TAB_FOOD_TXF;
import static com.jahirtrap.foodtxf.util.CommonUtils.hurt;

public class BaseKnifeItem extends SwordItem {
    public BaseKnifeItem(Tier tier, Properties properties) {
        super(tier, 1, -2f, properties.tab(TAB_FOOD_TXF));
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
    public boolean hasCraftingRemainingItem(ItemStack stack) {
        return true;
    }

    @Override
    public ItemStack getCraftingRemainingItem(ItemStack stack) {
        return hurt(1, stack);
    }

    @Override
    public boolean isRepairable(ItemStack stack) {
        return false;
    }
}
