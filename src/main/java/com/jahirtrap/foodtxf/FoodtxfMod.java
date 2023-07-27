package com.jahirtrap.foodtxf;

import com.jahirtrap.foodtxf.init.FoodtxfModTabs;
import net.minecraftforge.fml.common.Mod;

@Mod(FoodtxfMod.MODID)
public class FoodtxfMod {
    public static final String MODID = "foodtxf";

    public FoodtxfMod() {
        FoodtxfModTabs.load();
    }
}
