package com.jahirtrap.foodtxf.init;

import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

public enum FoodtxfTiers implements Tier {
    STEEL(BlockTags.INCORRECT_FOR_IRON_TOOL, 501, 6.5f, 2f, 14, () -> Ingredient.EMPTY),
    BRONZE(BlockTags.INCORRECT_FOR_IRON_TOOL, 350, 7f, 2f, 16, () -> Ingredient.EMPTY),
    ENDERITE(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 4096, 15f, 5f, 17, () -> Ingredient.EMPTY);

    private final TagKey<Block> incorrect;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final Supplier<Ingredient> ingredient;

    FoodtxfTiers(TagKey<Block> incorrect, int uses, float speed, float damage, int enchantmentValue, Supplier<Ingredient> ingredient) {
        this.incorrect = incorrect;
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

    public TagKey<Block> getIncorrectBlocksForDrops() {
        return this.incorrect;
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public Ingredient getRepairIngredient() {
        return this.ingredient.get();
    }
}
