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
            .icon(() -> new ItemStack(ModItems.NETHERITE_SKILLET))
            .displayItems((features, event) -> {
                event.accept(ModItems.PLAYER_FLESH);
                event.accept(ModItems.COOKED_PLAYER_FLESH);
                event.accept(ModItems.CLEAN_PUFFERFISH);
                event.accept(ModItems.COOKED_PUFFERFISH);
                event.accept(ModItems.COOKED_TROPICAL_FISH);
                event.accept(ModItems.DOUGH_BALL);
                event.accept(ModItems.TOASTED_BREAD);
                event.accept(ModItems.BREAD_SLICE);
                event.accept(ModItems.TOASTED_BREAD_SLICE);
                event.accept(ModItems.BAGUETTE);
                event.accept(ModItems.COOKED_CARROT);
                event.accept(ModItems.COOKED_BEETROOT);
                event.accept(ModItems.PUMPKIN_SLICE);
                event.accept(ModItems.GOLDEN_PLAYER_FLESH);
                event.accept(ModItems.GOLDEN_BEEF);
                event.accept(ModItems.GOLDEN_PORKCHOP);
                event.accept(ModItems.GOLDEN_MUTTON);
                event.accept(ModItems.GOLDEN_CHICKEN);
                event.accept(ModItems.GOLDEN_RABBIT);
                event.accept(ModItems.GOLDEN_FISH);
                event.accept(ModItems.GOLDEN_BREAD);
                event.accept(ModItems.GOLDEN_BREAD_SLICE);
                event.accept(ModItems.GOLDEN_POTATO);
                event.accept(ModItems.GOLDEN_BEETROOT);
                event.accept(ModItems.GOLDEN_SWEET_BERRIES);
                event.accept(ModItems.GOLDEN_GLOW_BERRIES);
                event.accept(ModItems.GLISTERING_PUMPKIN_SLICE);
                event.accept(ModItems.CHEESE);
                event.accept(ModItems.CHEESE_SLICE);
                event.accept(ModItems.RAW_CHEESE_EMPANADA);
                event.accept(ModItems.RAW_MEAT_EMPANADA);
                event.accept(ModItems.CHEESE_EMPANADA);
                event.accept(ModItems.MEAT_EMPANADA);
                event.accept(ModItems.CHEESE_SANDWICH);
                event.accept(ModItems.THERMOS);
                event.accept(ModItems.GLASS);
                event.accept(ModItems.BOX);
                event.accept(ModItems.FRUIT_SALAD);
                event.accept(ModItems.VEGETABLE_SALAD);
                event.accept(ModItems.MIXED_SALAD);
                event.accept(ModItems.FISH_ON_STICK);
                event.accept(ModItems.COOKED_FISH_ON_STICK);
                event.accept(ModItems.WATER_THERMOS);
                event.accept(ModItems.LAVA_THERMOS);
                event.accept(ModItems.MILK_THERMOS);
                event.accept(ModItems.CHOCOMILK_THERMOS);
                event.accept(ModItems.GLASS_OF_FRUIT_JUICE);
                event.accept(ModItems.GLASS_OF_VEGETABLE_JUICE);
                event.accept(ModItems.GLASS_OF_MIXED_JUICE);
                event.accept(ModItems.GLASS_OF_WATER);
                event.accept(ModItems.GLASS_OF_WATER_AND_BREAD);
                event.accept(ModItems.GLASS_OF_LAVA);
                event.accept(ModItems.GLASS_OF_MILK);
                event.accept(ModItems.GLASS_OF_MILK_AND_COOKIES);
                event.accept(ModItems.GLASS_OF_MILK_AND_TOASTED_BREAD);
                event.accept(ModItems.GLASS_OF_CHOCOMILK);
                event.accept(ModItems.GLASS_OF_CHOCOMILK_AND_COOKIES);
                event.accept(ModItems.GLASS_OF_CHOCOMILK_AND_TOASTED_BREAD);
                event.accept(ModItems.BOX_OF_CEREAL);
                event.accept(ModItems.BOX_OF_COOKIES);
                event.accept(ModItems.WOODEN_KNIFE);
                event.accept(ModItems.STONE_KNIFE);
                event.accept(ModItems.IRON_KNIFE);
                event.accept(ModItems.GOLDEN_KNIFE);
                event.accept(ModItems.DIAMOND_KNIFE);
                event.accept(ModItems.NETHERITE_KNIFE);
                event.accept(ModItems.ENDERITE_KNIFE);
                event.accept(ModItems.STEEL_KNIFE);
                event.accept(ModItems.BRONZE_KNIFE);
                event.accept(ModItems.SKILLET);
                event.accept(ModItems.GOLDEN_SKILLET);
                event.accept(ModItems.DIAMOND_SKILLET);
                event.accept(ModItems.NETHERITE_SKILLET);
                event.accept(ModItems.ENDERITE_SKILLET);
                event.accept(ModItems.STEEL_SKILLET);
                event.accept(ModItems.BRONZE_SKILLET);
                event.accept(ModItems.CUTTING_BOARD);
                event.accept(ModItems.MIXING_BOWL);
                event.accept(ModItems.ROLLING_PIN);
                event.accept(ModItems.JUICER);
                event.accept(ModItems.BLENDER);
                event.accept(ModItems.BLACK_KITCHEN_BLOCK);
                event.accept(ModItems.WHITE_KITCHEN_BLOCK);
                event.accept(ModItems.RECIPE_BOOK);
            })
            .title(Component.translatable("itemGroup.foodtxf.tab_foodtxf"))
            .build();

    public static void init() {
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, new ResourceLocation(MODID, "tab_foodtxf"), TAB_FOOD_TXF);
    }
}
