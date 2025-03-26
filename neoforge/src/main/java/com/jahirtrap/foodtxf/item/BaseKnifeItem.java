package com.jahirtrap.foodtxf.item;

import com.jahirtrap.foodtxf.event.PlayerDropsFleshKnifeEvent;
import com.jahirtrap.foodtxf.init.ModConfig;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.level.Level;

import static com.jahirtrap.foodtxf.util.CommonUtils.hurt;

public class BaseKnifeItem extends Item {
    public BaseKnifeItem(ToolMaterial material, Properties properties) {
        super(properties.sword(material, 1f, -2f).setNoCombineRepair());
    }

    @Override
    public InteractionResult use(Level level, Player player, InteractionHand hand) {
        if (!level.isClientSide() && ModConfig.enableCannibalism && ModConfig.knifeDropFlesh)
            if (PlayerDropsFleshKnifeEvent.execute(level, player, hand))
                return InteractionResult.SUCCESS_SERVER;

        return super.use(level, player, hand);
    }

    @Override
    public ItemStack getCraftingRemainder(ItemStack stack) {
        return hurt(1, stack);
    }
}
