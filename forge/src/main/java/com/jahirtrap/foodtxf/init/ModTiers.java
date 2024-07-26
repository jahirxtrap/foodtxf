package com.jahirtrap.foodtxf.init;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

import static com.jahirtrap.foodtxf.util.CommonUtils.itemTag;

public enum ModTiers implements Tier {
    BREAD(0, 80, 2f, 1f, 15, () -> Ingredient.of(Items.BREAD)),
    STEEL(2, 501, 6.5f, 2f, 14, () -> Ingredient.of(itemTag("forge:ingots/steel"))),
    BRONZE(2, 350, 7f, 2f, 16, () -> Ingredient.of(itemTag("forge:ingots/bronze"))),
    ENDERITE(4, 4096, 15f, 5f, 17, () -> Ingredient.of(itemTag("forge:ingots/enderite")));

    private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final Supplier<Ingredient> ingredient;

    ModTiers(int level, int uses, float speed, float damage, int enchantmentValue, Supplier<Ingredient> ingredient) {
        this.level = level;
        this.uses = uses;
        this.speed = speed;
        this.damage = damage;
        this.enchantmentValue = enchantmentValue;
        this.ingredient = ingredient;
    }

    public int getUses() {
        return this.uses;
    }

    public float getSpeed() {
        return this.speed;
    }

    public float getAttackDamageBonus() {
        return this.damage;
    }

    public int getLevel() {
        return this.level;
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public Ingredient getRepairIngredient() {
        return this.ingredient.get();
    }
}
