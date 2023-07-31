package com.jahirtrap.foodtxf.init;

import com.jahirtrap.foodtxf.procedures.FillMilkProcedure;
import com.jahirtrap.foodtxf.procedures.PlayerDropsFleshProcedure;

@SuppressWarnings("InstantiationOfUtilityClass")
public class FoodtxfModProcedures {
    public static void init() {
        new PlayerDropsFleshProcedure();
        new FillMilkProcedure();
    }
}
