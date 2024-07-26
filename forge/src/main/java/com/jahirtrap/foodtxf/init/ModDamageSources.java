package com.jahirtrap.foodtxf.init;

import net.minecraft.world.damagesource.DamageSource;

public class ModDamageSources extends DamageSource {
    public static final DamageSource SUICIDE = new ModDamageSources("suicide").bypassArmor().bypassMagic();

    protected ModDamageSources(String string) {
        super(string);
    }
}
