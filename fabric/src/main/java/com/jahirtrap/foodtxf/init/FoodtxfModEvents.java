package com.jahirtrap.foodtxf.init;

import com.jahirtrap.foodtxf.event.FillMilkEvent;
import com.jahirtrap.foodtxf.event.PlayerDropsFleshEvent;

public class FoodtxfModEvents {
    public static void init() {
        new PlayerDropsFleshEvent();
        new FillMilkEvent();
    }
}
