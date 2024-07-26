package com.jahirtrap.foodtxf.init;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;

import static com.jahirtrap.foodtxf.FoodtxfMod.MODID;

public class ModTab {
    public static void register(CreativeModeTabEvent.Register register) {
        CreativeModeTab TAB_FOOD_TXF = register.registerCreativeModeTab(new ResourceLocation(MODID, "tab_foodtxf"), builder -> builder.icon(() -> new ItemStack(ModItems.NETHERITE_SKILLET.get()))
                .displayItems((features, event) -> {
                    event.accept(ModItems.PLAYER_FLESH.get());
                    event.accept(ModItems.COOKED_PLAYER_FLESH.get());
                    event.accept(ModItems.CLEAN_PUFFERFISH.get());
                    event.accept(ModItems.COOKED_PUFFERFISH.get());
                    event.accept(ModItems.COOKED_TROPICAL_FISH.get());
                    event.accept(ModItems.DOUGH_BALL.get());
                    event.accept(ModItems.TOASTED_BREAD.get());
                    event.accept(ModItems.BREAD_SLICE.get());
                    event.accept(ModItems.TOASTED_BREAD_SLICE.get());
                    event.accept(ModItems.BAGUETTE.get());
                    event.accept(ModItems.COOKED_CARROT.get());
                    event.accept(ModItems.COOKED_BEETROOT.get());
                    event.accept(ModItems.PUMPKIN_SLICE.get());
                    event.accept(ModItems.GOLDEN_PLAYER_FLESH.get());
                    event.accept(ModItems.GOLDEN_BEEF.get());
                    event.accept(ModItems.GOLDEN_PORKCHOP.get());
                    event.accept(ModItems.GOLDEN_MUTTON.get());
                    event.accept(ModItems.GOLDEN_CHICKEN.get());
                    event.accept(ModItems.GOLDEN_RABBIT.get());
                    event.accept(ModItems.GOLDEN_FISH.get());
                    event.accept(ModItems.GOLDEN_BREAD.get());
                    event.accept(ModItems.GOLDEN_BREAD_SLICE.get());
                    event.accept(ModItems.GOLDEN_POTATO.get());
                    event.accept(ModItems.GOLDEN_BEETROOT.get());
                    event.accept(ModItems.GOLDEN_SWEET_BERRIES.get());
                    event.accept(ModItems.GOLDEN_GLOW_BERRIES.get());
                    event.accept(ModItems.GLISTERING_PUMPKIN_SLICE.get());
                    event.accept(ModItems.CHEESE.get());
                    event.accept(ModItems.CHEESE_SLICE.get());
                    event.accept(ModItems.RAW_CHEESE_EMPANADA.get());
                    event.accept(ModItems.RAW_MEAT_EMPANADA.get());
                    event.accept(ModItems.CHEESE_EMPANADA.get());
                    event.accept(ModItems.MEAT_EMPANADA.get());
                    event.accept(ModItems.CHEESE_SANDWICH.get());
                    event.accept(ModItems.THERMOS.get());
                    event.accept(ModItems.GLASS.get());
                    event.accept(ModItems.BOX.get());
                    event.accept(ModItems.FRUIT_SALAD.get());
                    event.accept(ModItems.VEGETABLE_SALAD.get());
                    event.accept(ModItems.MIXED_SALAD.get());
                    event.accept(ModItems.FISH_ON_STICK.get());
                    event.accept(ModItems.COOKED_FISH_ON_STICK.get());
                    event.accept(ModItems.WATER_THERMOS.get());
                    event.accept(ModItems.LAVA_THERMOS.get());
                    event.accept(ModItems.MILK_THERMOS.get());
                    event.accept(ModItems.CHOCOMILK_THERMOS.get());
                    event.accept(ModItems.GLASS_OF_FRUIT_JUICE.get());
                    event.accept(ModItems.GLASS_OF_VEGETABLE_JUICE.get());
                    event.accept(ModItems.GLASS_OF_MIXED_JUICE.get());
                    event.accept(ModItems.GLASS_OF_WATER.get());
                    event.accept(ModItems.GLASS_OF_WATER_AND_BREAD.get());
                    event.accept(ModItems.GLASS_OF_LAVA.get());
                    event.accept(ModItems.GLASS_OF_MILK.get());
                    event.accept(ModItems.GLASS_OF_MILK_AND_COOKIES.get());
                    event.accept(ModItems.GLASS_OF_MILK_AND_TOASTED_BREAD.get());
                    event.accept(ModItems.GLASS_OF_CHOCOMILK.get());
                    event.accept(ModItems.GLASS_OF_CHOCOMILK_AND_COOKIES.get());
                    event.accept(ModItems.GLASS_OF_CHOCOMILK_AND_TOASTED_BREAD.get());
                    event.accept(ModItems.BOX_OF_CEREAL.get());
                    event.accept(ModItems.BOX_OF_COOKIES.get());
                    event.accept(ModItems.WOODEN_KNIFE.get());
                    event.accept(ModItems.STONE_KNIFE.get());
                    event.accept(ModItems.IRON_KNIFE.get());
                    event.accept(ModItems.GOLDEN_KNIFE.get());
                    event.accept(ModItems.DIAMOND_KNIFE.get());
                    event.accept(ModItems.NETHERITE_KNIFE.get());
                    event.accept(ModItems.ENDERITE_KNIFE.get());
                    event.accept(ModItems.STEEL_KNIFE.get());
                    event.accept(ModItems.BRONZE_KNIFE.get());
                    event.accept(ModItems.SKILLET.get());
                    event.accept(ModItems.GOLDEN_SKILLET.get());
                    event.accept(ModItems.DIAMOND_SKILLET.get());
                    event.accept(ModItems.NETHERITE_SKILLET.get());
                    event.accept(ModItems.ENDERITE_SKILLET.get());
                    event.accept(ModItems.STEEL_SKILLET.get());
                    event.accept(ModItems.BRONZE_SKILLET.get());
                    event.accept(ModItems.CUTTING_BOARD.get());
                    event.accept(ModItems.MIXING_BOWL.get());
                    event.accept(ModItems.ROLLING_PIN.get());
                    event.accept(ModItems.JUICER.get());
                    event.accept(ModItems.BLENDER.get());
                    event.accept(ModItems.BLACK_KITCHEN_BLOCK.get());
                    event.accept(ModItems.WHITE_KITCHEN_BLOCK.get());
                    event.accept(ModItems.RECIPE_BOOK.get());
                })
                .title(Component.translatable("itemGroup.foodtxf.tab_foodtxf"))
                .build());
    }

    public static void init(IEventBus bus) {
        bus.addListener(ModTab::register);
    }
}
