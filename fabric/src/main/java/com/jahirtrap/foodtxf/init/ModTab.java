package com.jahirtrap.foodtxf.init;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import static com.jahirtrap.foodtxf.FoodtxfMod.MODID;

public class ModTab {
    private static final CreativeModeTab TAB_FOOD_TXF = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModContent.NETHERITE_SKILLET))
            .displayItems((features, event) -> {
                event.accept(ModContent.PLAYER_FLESH);
                event.accept(ModContent.COOKED_PLAYER_FLESH);
                event.accept(ModContent.CLEAN_PUFFERFISH);
                event.accept(ModContent.COOKED_PUFFERFISH);
                event.accept(ModContent.COOKED_TROPICAL_FISH);
                event.accept(ModContent.DOUGH_BALL);
                event.accept(ModContent.TOASTED_BREAD);
                event.accept(ModContent.BREAD_SLICE);
                event.accept(ModContent.TOASTED_BREAD_SLICE);
                event.accept(ModContent.BAGUETTE);
                event.accept(ModContent.COOKED_CARROT);
                event.accept(ModContent.COOKED_BEETROOT);
                event.accept(ModContent.PUMPKIN_SLICE);
                event.accept(ModContent.GOLDEN_PLAYER_FLESH);
                event.accept(ModContent.GOLDEN_BEEF);
                event.accept(ModContent.GOLDEN_PORKCHOP);
                event.accept(ModContent.GOLDEN_MUTTON);
                event.accept(ModContent.GOLDEN_CHICKEN);
                event.accept(ModContent.GOLDEN_RABBIT);
                event.accept(ModContent.GOLDEN_FISH);
                event.accept(ModContent.GOLDEN_BREAD);
                event.accept(ModContent.GOLDEN_BREAD_SLICE);
                event.accept(ModContent.GOLDEN_POTATO);
                event.accept(ModContent.GOLDEN_BEETROOT);
                event.accept(ModContent.GOLDEN_SWEET_BERRIES);
                event.accept(ModContent.GOLDEN_GLOW_BERRIES);
                event.accept(ModContent.GLISTERING_PUMPKIN_SLICE);
                event.accept(ModContent.CHEESE);
                event.accept(ModContent.CHEESE_SLICE);
                event.accept(ModContent.RAW_CHEESE_EMPANADA);
                event.accept(ModContent.RAW_MEAT_EMPANADA);
                event.accept(ModContent.CHEESE_EMPANADA);
                event.accept(ModContent.MEAT_EMPANADA);
                event.accept(ModContent.CHEESE_SANDWICH);
                event.accept(ModContent.THERMOS);
                event.accept(ModContent.GLASS);
                event.accept(ModContent.BOX);
                event.accept(ModContent.FRUIT_SALAD);
                event.accept(ModContent.VEGETABLE_SALAD);
                event.accept(ModContent.MIXED_SALAD);
                event.accept(ModContent.FISH_ON_STICK);
                event.accept(ModContent.COOKED_FISH_ON_STICK);
                event.accept(ModContent.WATER_THERMOS);
                event.accept(ModContent.LAVA_THERMOS);
                event.accept(ModContent.MILK_THERMOS);
                event.accept(ModContent.CHOCOMILK_THERMOS);
                event.accept(ModContent.GLASS_OF_FRUIT_JUICE);
                event.accept(ModContent.GLASS_OF_VEGETABLE_JUICE);
                event.accept(ModContent.GLASS_OF_MIXED_JUICE);
                event.accept(ModContent.GLASS_OF_WATER);
                event.accept(ModContent.GLASS_OF_WATER_AND_BREAD);
                event.accept(ModContent.GLASS_OF_LAVA);
                event.accept(ModContent.GLASS_OF_MILK);
                event.accept(ModContent.GLASS_OF_MILK_AND_COOKIES);
                event.accept(ModContent.GLASS_OF_MILK_AND_TOASTED_BREAD);
                event.accept(ModContent.GLASS_OF_CHOCOMILK);
                event.accept(ModContent.GLASS_OF_CHOCOMILK_AND_COOKIES);
                event.accept(ModContent.GLASS_OF_CHOCOMILK_AND_TOASTED_BREAD);
                event.accept(ModContent.BOX_OF_CEREAL);
                event.accept(ModContent.BOX_OF_COOKIES);
                event.accept(ModContent.WOODEN_KNIFE);
                event.accept(ModContent.STONE_KNIFE);
                event.accept(ModContent.IRON_KNIFE);
                event.accept(ModContent.GOLDEN_KNIFE);
                event.accept(ModContent.DIAMOND_KNIFE);
                event.accept(ModContent.NETHERITE_KNIFE);
                event.accept(ModContent.ENDERITE_KNIFE);
                event.accept(ModContent.STEEL_KNIFE);
                event.accept(ModContent.BRONZE_KNIFE);
                event.accept(ModContent.SKILLET);
                event.accept(ModContent.GOLDEN_SKILLET);
                event.accept(ModContent.DIAMOND_SKILLET);
                event.accept(ModContent.NETHERITE_SKILLET);
                event.accept(ModContent.ENDERITE_SKILLET);
                event.accept(ModContent.STEEL_SKILLET);
                event.accept(ModContent.BRONZE_SKILLET);
                event.accept(ModContent.CUTTING_BOARD);
                event.accept(ModContent.MIXING_BOWL);
                event.accept(ModContent.ROLLING_PIN);
                event.accept(ModContent.JUICER);
                event.accept(ModContent.BLENDER);
                event.accept(ModContent.BLACK_KITCHEN_BLOCK);
                event.accept(ModContent.WHITE_KITCHEN_BLOCK);
                event.accept(ModContent.RECIPE_BOOK);
            })
            .title(Component.translatable("itemGroup.foodtxf.tab_foodtxf"))
            .build();

    public static void init() {
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, ResourceLocation.fromNamespaceAndPath(MODID, "tab_foodtxf"), TAB_FOOD_TXF);
    }
}
