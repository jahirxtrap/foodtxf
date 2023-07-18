package com.jahirtrap.foodtxf;

import com.jahirtrap.foodtxf.init.FoodtxfModItems;
import net.minecraftforge.event.CreativeModeTabEvent;

public class FoodtxfModTab {

    public static void buildContents(CreativeModeTabEvent.BuildContents event) {
        if (event.getTab() != FoodtxfMod.MODTAB) return;

        event.accept(FoodtxfModItems.PLAYER_FLESH.get());
        event.accept(FoodtxfModItems.COOKED_PLAYER_FLESH.get());
        event.accept(FoodtxfModItems.CLEAN_PUFFERFISH.get());
        event.accept(FoodtxfModItems.COOKED_PUFFERFISH.get());
        event.accept(FoodtxfModItems.COOKED_TROPICAL_FISH.get());
        event.accept(FoodtxfModItems.DOUGH_BALL.get());
        event.accept(FoodtxfModItems.TOASTED_BREAD.get());
        event.accept(FoodtxfModItems.BREAD_SLICE.get());
        event.accept(FoodtxfModItems.TOASTED_BREAD_SLICE.get());
        event.accept(FoodtxfModItems.COOKED_CARROT.get());
        event.accept(FoodtxfModItems.COOKED_BEETROOT.get());
        event.accept(FoodtxfModItems.PUMPKIN_SLICE.get());
        event.accept(FoodtxfModItems.GOLDEN_BEEF.get());
        event.accept(FoodtxfModItems.GOLDEN_PORKCHOP.get());
        event.accept(FoodtxfModItems.GOLDEN_PLAYER_FLESH.get());
        event.accept(FoodtxfModItems.GOLDEN_FISH.get());
        event.accept(FoodtxfModItems.GOLDEN_BREAD.get());
        event.accept(FoodtxfModItems.GOLDEN_BREAD_SLICE.get());
        event.accept(FoodtxfModItems.GOLDEN_POTATO.get());
        event.accept(FoodtxfModItems.GOLDEN_BEETROOT.get());
        event.accept(FoodtxfModItems.GOLDEN_SWEET_BERRIES.get());
        event.accept(FoodtxfModItems.GOLDEN_GLOW_BERRIES.get());
        event.accept(FoodtxfModItems.GLISTERING_PUMPKIN_SLICE.get());
        event.accept(FoodtxfModItems.CHEESE.get());
        event.accept(FoodtxfModItems.CHEESE_SLICE.get());
        event.accept(FoodtxfModItems.RAW_CHEESE_EMPANADA.get());
        event.accept(FoodtxfModItems.RAW_MEAT_EMPANADA.get());
        event.accept(FoodtxfModItems.CHEESE_EMPANADA.get());
        event.accept(FoodtxfModItems.MEAT_EMPANADA.get());
        event.accept(FoodtxfModItems.CHEESE_SANDWICH.get());
        event.accept(FoodtxfModItems.FRUIT_SALAD.get());
        event.accept(FoodtxfModItems.VEGETABLE_SALAD.get());
        event.accept(FoodtxfModItems.MIXED_SALAD.get());
        event.accept(FoodtxfModItems.FISH_ON_STICK.get());
        event.accept(FoodtxfModItems.COOKED_FISH_ON_STICK.get());
        event.accept(FoodtxfModItems.THERMOS.get());
        event.accept(FoodtxfModItems.WATER_THERMOS.get());
        event.accept(FoodtxfModItems.LAVA_THERMOS.get());
        event.accept(FoodtxfModItems.MILK_THERMOS.get());
        event.accept(FoodtxfModItems.CHOCOMILK_THERMOS.get());
        event.accept(FoodtxfModItems.GLASS.get());
        event.accept(FoodtxfModItems.GLASS_OF_FRUIT_JUICE.get());
        event.accept(FoodtxfModItems.GLASS_OF_VEGETABLE_JUICE.get());
        event.accept(FoodtxfModItems.GLASS_OF_MIXED_JUICE.get());
        event.accept(FoodtxfModItems.GLASS_OF_WATER.get());
        event.accept(FoodtxfModItems.GLASS_OF_WATER_AND_BREAD.get());
        event.accept(FoodtxfModItems.GLASS_OF_LAVA.get());
        event.accept(FoodtxfModItems.GLASS_OF_MILK.get());
        event.accept(FoodtxfModItems.GLASS_OF_MILK_AND_COOKIES.get());
        event.accept(FoodtxfModItems.GLASS_OF_MILK_AND_TOASTED_BREAD.get());
        event.accept(FoodtxfModItems.GLASS_OF_CHOCOMILK.get());
        event.accept(FoodtxfModItems.GLASS_OF_CHOCOMILK_AND_COOKIES.get());
        event.accept(FoodtxfModItems.GLASS_OF_CHOCOMILK_AND_TOASTED_BREAD.get());
        event.accept(FoodtxfModItems.BOX.get());
        event.accept(FoodtxfModItems.BOX_OF_COOKIES.get());
        event.accept(FoodtxfModItems.WOODEN_KNIFE.get());
        event.accept(FoodtxfModItems.STONE_KNIFE.get());
        event.accept(FoodtxfModItems.IRON_KNIFE.get());
        event.accept(FoodtxfModItems.GOLDEN_KNIFE.get());
        event.accept(FoodtxfModItems.DIAMOND_KNIFE.get());
        event.accept(FoodtxfModItems.NETHERITE_KNIFE.get());
        event.accept(FoodtxfModItems.STEEL_KNIFE.get());
        event.accept(FoodtxfModItems.BRONZE_KNIFE.get());
        event.accept(FoodtxfModItems.SKILLET.get());
        event.accept(FoodtxfModItems.GOLDEN_SKILLET.get());
        event.accept(FoodtxfModItems.DIAMOND_SKILLET.get());
        event.accept(FoodtxfModItems.NETHERITE_SKILLET.get());
        event.accept(FoodtxfModItems.STEEL_SKILLET.get());
        event.accept(FoodtxfModItems.BRONZE_SKILLET.get());
        event.accept(FoodtxfModItems.CUTTING_BOARD.get());
        event.accept(FoodtxfModItems.MIXING_BOWL.get());
        event.accept(FoodtxfModItems.ROLLING_PIN.get());
        event.accept(FoodtxfModItems.JUICER.get());
        event.accept(FoodtxfModItems.BLENDER.get());
        event.accept(FoodtxfModItems.BLACK_KITCHEN_BLOCK.get());
        event.accept(FoodtxfModItems.WHITE_KITCHEN_BLOCK.get());
    }
}
