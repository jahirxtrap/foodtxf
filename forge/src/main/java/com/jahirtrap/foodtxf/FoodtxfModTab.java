package com.jahirtrap.foodtxf;

import com.jahirtrap.foodtxf.init.FoodtxfModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class FoodtxfModTab {
    public static CreativeModeTab TAB_FOOD_TXF;

    public static void init() {
        TAB_FOOD_TXF = new CreativeModeTab("tabfood_txf") {
            @Override
            public ItemStack makeIcon() {
                return new ItemStack(FoodtxfModItems.NETHERITE_KNIFE.get());
            }

            @Override
            public boolean hasSearchBar() {
                return false;
            }
        };
    }
}
