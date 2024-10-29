package com.jahirtrap.foodtxf.item;

import com.jahirtrap.foodtxf.event.PlayerDropsFleshKnifeEvent;
import com.jahirtrap.foodtxf.init.ModConfig;
import com.jahirtrap.foodtxf.util.RepairableItem;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.level.Level;

import static com.jahirtrap.foodtxf.util.CommonUtils.hurt;

public class BaseKnifeItem extends SwordItem implements RepairableItem, FabricItem {
    public BaseKnifeItem(ToolMaterial material, Properties properties) {
        super(material, 1f, -2f, properties);
    }

    @Override
    public InteractionResult use(Level level, Player player, InteractionHand hand) {
        if (!level.isClientSide() && ModConfig.enableCannibalism && ModConfig.knifeDropFlesh)
            if (PlayerDropsFleshKnifeEvent.execute(level, player, hand))
                return InteractionResult.SUCCESS_SERVER;

        return super.use(level, player, hand);
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
