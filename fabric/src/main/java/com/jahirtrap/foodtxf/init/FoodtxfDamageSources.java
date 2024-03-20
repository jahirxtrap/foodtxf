package com.jahirtrap.foodtxf.init;

import net.minecraft.world.damagesource.DamageSource;

public class FoodtxfDamageSources extends DamageSource {
    public static final FoodtxfDamageSources SUICIDE = new FoodtxfDamageSources("suicide");

    protected FoodtxfDamageSources(String string) {
        super(string);
        bypassArmor();
        bypassMagic();
    }
}
