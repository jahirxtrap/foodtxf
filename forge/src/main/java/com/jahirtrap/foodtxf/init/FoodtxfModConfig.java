package com.jahirtrap.foodtxf.init;

import net.minecraftforge.common.ForgeConfigSpec;

public class FoodtxfModConfig {
    public static final ForgeConfigSpec.BooleanValue ENABLE_CANNIBALISM;
    public static final ForgeConfigSpec.BooleanValue PlAYER_DROP_FLESH;
    public static final ForgeConfigSpec.BooleanValue KNIFE_DROP_FLESH;
    public static ForgeConfigSpec COMMON_CONFIG;

    static {
        ForgeConfigSpec.Builder COMMON_BUILDER = new ForgeConfigSpec.Builder();
        ENABLE_CANNIBALISM = COMMON_BUILDER.comment("Should cannibalism be enabled?").define("enableCannibalism", true);
        PlAYER_DROP_FLESH = COMMON_BUILDER.comment("Should player drop flesh on death?").define("playerDropFlesh", true);
        KNIFE_DROP_FLESH = COMMON_BUILDER.comment("Should player drop flesh when shifting and right clicking with a knife?").define("knifeDropFlesh", true);

        COMMON_CONFIG = COMMON_BUILDER.build();
    }
}
