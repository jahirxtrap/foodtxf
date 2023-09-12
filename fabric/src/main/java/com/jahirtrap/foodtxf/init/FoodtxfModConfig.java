package com.jahirtrap.foodtxf.init;

import eu.midnightdust.lib.config.MidnightConfig;

public class FoodtxfModConfig extends MidnightConfig {
    @Entry(name = "Enable Cannibalism")
    public static boolean enableCannibalism = true;
    @Entry(name = "Player Drop Flesh")
    public static boolean playerDropFlesh = true;
    @Entry(name = "Knife Drop Flesh")
    public static boolean knifeDropFlesh = true;
}
