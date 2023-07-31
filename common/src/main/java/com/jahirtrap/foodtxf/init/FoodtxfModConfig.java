package com.jahirtrap.foodtxf.init;

import net.minecraftforge.common.ForgeConfigSpec;

public class FoodtxfModConfig {
    public static final ForgeConfigSpec.BooleanValue ENABLE_CANNIBALISM;
    public static ForgeConfigSpec COMMON_CONFIG;

    static {
        ForgeConfigSpec.Builder COMMON_BUILDER = new ForgeConfigSpec.Builder();
        ENABLE_CANNIBALISM = COMMON_BUILDER.comment("Should cannibalism be enabled?")
                .define("enableCannibalism", true);

        COMMON_CONFIG = COMMON_BUILDER.build();
    }
}
