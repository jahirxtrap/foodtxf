package com.jahirtrap.foodtxf.util;

public interface RepairableItem {
    default boolean isRepairable() {
        return true;
    }
}
