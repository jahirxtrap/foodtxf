package com.jahirtrap.foodtxf;

import com.jahirtrap.foodtxf.init.FoodtxfModBlocks;
import com.jahirtrap.foodtxf.init.FoodtxfModItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class FoodtxfModTab {

    public static void init() {
        CreativeModeTab TAB_FOOD_TXF = FabricItemGroup.builder(new ResourceLocation(FoodtxfMod.MODID, "tabfood_txf"))
                .icon(() -> new ItemStack(FoodtxfModItems.NETHERITE_KNIFE))
                .displayItems((features, event) -> {
                    event.accept(FoodtxfModItems.PLAYER_FLESH);
                    event.accept(FoodtxfModItems.COOKED_PLAYER_FLESH);
                    event.accept(FoodtxfModItems.CLEAN_PUFFERFISH);
                    event.accept(FoodtxfModItems.COOKED_PUFFERFISH);
                    event.accept(FoodtxfModItems.COOKED_TROPICAL_FISH);
                    event.accept(FoodtxfModItems.DOUGH_BALL);
                    event.accept(FoodtxfModItems.TOASTED_BREAD);
                    event.accept(FoodtxfModItems.BREAD_SLICE);
                    event.accept(FoodtxfModItems.TOASTED_BREAD_SLICE);
                    event.accept(FoodtxfModItems.BAGUETTE);
                    event.accept(FoodtxfModItems.COOKED_CARROT);
                    event.accept(FoodtxfModItems.COOKED_BEETROOT);
                    event.accept(FoodtxfModItems.PUMPKIN_SLICE);
                    event.accept(FoodtxfModItems.GOLDEN_BEEF);
                    event.accept(FoodtxfModItems.GOLDEN_PORKCHOP);
                    event.accept(FoodtxfModItems.GOLDEN_PLAYER_FLESH);
                    event.accept(FoodtxfModItems.GOLDEN_FISH);
                    event.accept(FoodtxfModItems.GOLDEN_BREAD);
                    event.accept(FoodtxfModItems.GOLDEN_BREAD_SLICE);
                    event.accept(FoodtxfModItems.GOLDEN_POTATO);
                    event.accept(FoodtxfModItems.GOLDEN_BEETROOT);
                    event.accept(FoodtxfModItems.GOLDEN_SWEET_BERRIES);
                    event.accept(FoodtxfModItems.GOLDEN_GLOW_BERRIES);
                    event.accept(FoodtxfModItems.GLISTERING_PUMPKIN_SLICE);
                    event.accept(FoodtxfModItems.CHEESE);
                    event.accept(FoodtxfModItems.CHEESE_SLICE);
                    event.accept(FoodtxfModItems.RAW_CHEESE_EMPANADA);
                    event.accept(FoodtxfModItems.RAW_MEAT_EMPANADA);
                    event.accept(FoodtxfModItems.CHEESE_EMPANADA);
                    event.accept(FoodtxfModItems.MEAT_EMPANADA);
                    event.accept(FoodtxfModItems.CHEESE_SANDWICH);
                    event.accept(FoodtxfModItems.THERMOS);
                    event.accept(FoodtxfModItems.GLASS);
                    event.accept(FoodtxfModItems.BOX);
                    event.accept(FoodtxfModItems.FRUIT_SALAD);
                    event.accept(FoodtxfModItems.VEGETABLE_SALAD);
                    event.accept(FoodtxfModItems.MIXED_SALAD);
                    event.accept(FoodtxfModItems.FISH_ON_STICK);
                    event.accept(FoodtxfModItems.COOKED_FISH_ON_STICK);
                    event.accept(FoodtxfModItems.WATER_THERMOS);
                    event.accept(FoodtxfModItems.LAVA_THERMOS);
                    event.accept(FoodtxfModItems.MILK_THERMOS);
                    event.accept(FoodtxfModItems.CHOCOMILK_THERMOS);
                    event.accept(FoodtxfModItems.GLASS_OF_FRUIT_JUICE);
                    event.accept(FoodtxfModItems.GLASS_OF_VEGETABLE_JUICE);
                    event.accept(FoodtxfModItems.GLASS_OF_MIXED_JUICE);
                    event.accept(FoodtxfModItems.GLASS_OF_WATER);
                    event.accept(FoodtxfModItems.GLASS_OF_WATER_AND_BREAD);
                    event.accept(FoodtxfModItems.GLASS_OF_LAVA);
                    event.accept(FoodtxfModItems.GLASS_OF_MILK);
                    event.accept(FoodtxfModItems.GLASS_OF_MILK_AND_COOKIES);
                    event.accept(FoodtxfModItems.GLASS_OF_MILK_AND_TOASTED_BREAD);
                    event.accept(FoodtxfModItems.GLASS_OF_CHOCOMILK);
                    event.accept(FoodtxfModItems.GLASS_OF_CHOCOMILK_AND_COOKIES);
                    event.accept(FoodtxfModItems.GLASS_OF_CHOCOMILK_AND_TOASTED_BREAD);
                    event.accept(FoodtxfModItems.BOX_OF_COOKIES);
                    event.accept(FoodtxfModItems.WOODEN_KNIFE);
                    event.accept(FoodtxfModItems.STONE_KNIFE);
                    event.accept(FoodtxfModItems.IRON_KNIFE);
                    event.accept(FoodtxfModItems.GOLDEN_KNIFE);
                    event.accept(FoodtxfModItems.DIAMOND_KNIFE);
                    event.accept(FoodtxfModItems.NETHERITE_KNIFE);
                    event.accept(FoodtxfModItems.ENDERITE_KNIFE);
                    event.accept(FoodtxfModItems.STEEL_KNIFE);
                    event.accept(FoodtxfModItems.BRONZE_KNIFE);
                    event.accept(FoodtxfModItems.SKILLET);
                    event.accept(FoodtxfModItems.GOLDEN_SKILLET);
                    event.accept(FoodtxfModItems.DIAMOND_SKILLET);
                    event.accept(FoodtxfModItems.NETHERITE_SKILLET);
                    event.accept(FoodtxfModItems.ENDERITE_SKILLET);
                    event.accept(FoodtxfModItems.STEEL_SKILLET);
                    event.accept(FoodtxfModItems.BRONZE_SKILLET);
                    event.accept(FoodtxfModItems.CUTTING_BOARD);
                    event.accept(FoodtxfModItems.MIXING_BOWL);
                    event.accept(FoodtxfModItems.ROLLING_PIN);
                    event.accept(FoodtxfModItems.JUICER);
                    event.accept(FoodtxfModItems.BLENDER);
                    event.accept(FoodtxfModBlocks.BLACK_KITCHEN_BLOCK);
                    event.accept(FoodtxfModBlocks.WHITE_KITCHEN_BLOCK);
                    event.accept(FoodtxfModItems.RECIPE_BOOK);
                })
                .title(Component.translatable("itemGroup.foodtxf.tab_foodtxf"))
                .build();
    }

}
