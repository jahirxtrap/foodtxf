package com.jahirtrap.foodtxf.init;

import com.jahirtrap.foodtxf.util.configlib.TXFConfig;

public class ModConfig extends TXFConfig {
    @Entry(name = "Enable Cannibalism")
    public static boolean enableCannibalism = true;
    @Entry(name = "Player Drop Flesh")
    public static boolean playerDropFlesh = true;
    @Entry(name = "Knife Drop Flesh")
    public static boolean knifeDropFlesh = true;
}
