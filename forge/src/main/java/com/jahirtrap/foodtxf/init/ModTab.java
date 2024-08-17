package com.jahirtrap.foodtxf.init;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModTab {
    public static final CreativeModeTab TAB_FOOD_TXF = new CreativeModeTab("foodtxf.tab_foodtxf") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModContent.NETHERITE_SKILLET.get());
        }
    };
}
