package com.jahirtrap.foodtxf.init;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class FoodtxfModTabs {
    public static CreativeModeTab TAB_FOOD_TXF;

    public static void load() {
        TAB_FOOD_TXF = new CreativeModeTab("tabfood_txf") {
            @Override
            public ItemStack makeIcon() {
                return new ItemStack(FoodtxfModItems.GOLDEN_BEEF);
            }

            @OnlyIn(Dist.CLIENT)
            public boolean hasSearchBar() {
                return false;
            }
        };
    }
}
