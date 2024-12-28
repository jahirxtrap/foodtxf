package com.jahirtrap.foodtxf.init;

import com.jahirtrap.configlib.TXFConfig;

public class ModConfig extends TXFConfig {
    @Entry(name = "Enable Cannibalism", itemDisplay = "foodtxf:player_flesh")
    public static boolean enableCannibalism = true;
    @Entry(name = "Player Drop Flesh", itemDisplay = "foodtxf:player_flesh")
    public static boolean playerDropFlesh = true;
    @Entry(name = "Knife Drop Flesh", itemDisplay = "foodtxf:iron_knife")
    public static boolean knifeDropFlesh = true;
    @Entry(name = "Add Villager Trades", itemDisplay = "minecraft:emerald")
    public static boolean addVillagerTrades = true;
}
