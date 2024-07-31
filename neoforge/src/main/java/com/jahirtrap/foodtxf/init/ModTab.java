package com.jahirtrap.foodtxf.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.jahirtrap.foodtxf.FoodtxfMod.MODID;

public class ModTab {
    private static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    public static final Supplier<CreativeModeTab> TAB_FOOD_TXF = TABS.register("tab_foodtxf", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(ModContent.NETHERITE_SKILLET.get()))
            .displayItems((features, event) -> {
                event.accept(ModContent.PLAYER_FLESH.get());
                event.accept(ModContent.COOKED_PLAYER_FLESH.get());
                event.accept(ModContent.CLEAN_PUFFERFISH.get());
                event.accept(ModContent.COOKED_PUFFERFISH.get());
                event.accept(ModContent.COOKED_TROPICAL_FISH.get());
                event.accept(ModContent.DOUGH_BALL.get());
                event.accept(ModContent.TOASTED_BREAD.get());
                event.accept(ModContent.BREAD_SLICE.get());
                event.accept(ModContent.TOASTED_BREAD_SLICE.get());
                event.accept(ModContent.BAGUETTE.get());
                event.accept(ModContent.COOKED_CARROT.get());
                event.accept(ModContent.COOKED_BEETROOT.get());
                event.accept(ModContent.PUMPKIN_SLICE.get());
                event.accept(ModContent.GOLDEN_PLAYER_FLESH.get());
                event.accept(ModContent.GOLDEN_BEEF.get());
                event.accept(ModContent.GOLDEN_PORKCHOP.get());
                event.accept(ModContent.GOLDEN_MUTTON.get());
                event.accept(ModContent.GOLDEN_CHICKEN.get());
                event.accept(ModContent.GOLDEN_RABBIT.get());
                event.accept(ModContent.GOLDEN_FISH.get());
                event.accept(ModContent.GOLDEN_BREAD.get());
                event.accept(ModContent.GOLDEN_BREAD_SLICE.get());
                event.accept(ModContent.GOLDEN_POTATO.get());
                event.accept(ModContent.GOLDEN_BEETROOT.get());
                event.accept(ModContent.GOLDEN_SWEET_BERRIES.get());
                event.accept(ModContent.GOLDEN_GLOW_BERRIES.get());
                event.accept(ModContent.GLISTERING_PUMPKIN_SLICE.get());
                event.accept(ModContent.CHEESE.get());
                event.accept(ModContent.CHEESE_SLICE.get());
                event.accept(ModContent.RAW_CHEESE_EMPANADA.get());
                event.accept(ModContent.RAW_MEAT_EMPANADA.get());
                event.accept(ModContent.CHEESE_EMPANADA.get());
                event.accept(ModContent.MEAT_EMPANADA.get());
                event.accept(ModContent.CHEESE_SANDWICH.get());
                event.accept(ModContent.THERMOS.get());
                event.accept(ModContent.GLASS.get());
                event.accept(ModContent.BOX.get());
                event.accept(ModContent.FRUIT_SALAD.get());
                event.accept(ModContent.VEGETABLE_SALAD.get());
                event.accept(ModContent.MIXED_SALAD.get());
                event.accept(ModContent.FISH_ON_STICK.get());
                event.accept(ModContent.COOKED_FISH_ON_STICK.get());
                event.accept(ModContent.WATER_THERMOS.get());
                event.accept(ModContent.LAVA_THERMOS.get());
                event.accept(ModContent.MILK_THERMOS.get());
                event.accept(ModContent.CHOCOMILK_THERMOS.get());
                event.accept(ModContent.GLASS_OF_FRUIT_JUICE.get());
                event.accept(ModContent.GLASS_OF_VEGETABLE_JUICE.get());
                event.accept(ModContent.GLASS_OF_MIXED_JUICE.get());
                event.accept(ModContent.GLASS_OF_WATER.get());
                event.accept(ModContent.GLASS_OF_WATER_AND_BREAD.get());
                event.accept(ModContent.GLASS_OF_LAVA.get());
                event.accept(ModContent.GLASS_OF_MILK.get());
                event.accept(ModContent.GLASS_OF_MILK_AND_COOKIES.get());
                event.accept(ModContent.GLASS_OF_MILK_AND_TOASTED_BREAD.get());
                event.accept(ModContent.GLASS_OF_CHOCOMILK.get());
                event.accept(ModContent.GLASS_OF_CHOCOMILK_AND_COOKIES.get());
                event.accept(ModContent.GLASS_OF_CHOCOMILK_AND_TOASTED_BREAD.get());
                event.accept(ModContent.BOX_OF_CEREAL.get());
                event.accept(ModContent.BOX_OF_COOKIES.get());
                event.accept(ModContent.WOODEN_KNIFE.get());
                event.accept(ModContent.STONE_KNIFE.get());
                event.accept(ModContent.IRON_KNIFE.get());
                event.accept(ModContent.GOLDEN_KNIFE.get());
                event.accept(ModContent.DIAMOND_KNIFE.get());
                event.accept(ModContent.NETHERITE_KNIFE.get());
                event.accept(ModContent.ENDERITE_KNIFE.get());
                event.accept(ModContent.STEEL_KNIFE.get());
                event.accept(ModContent.BRONZE_KNIFE.get());
                event.accept(ModContent.SKILLET.get());
                event.accept(ModContent.GOLDEN_SKILLET.get());
                event.accept(ModContent.DIAMOND_SKILLET.get());
                event.accept(ModContent.NETHERITE_SKILLET.get());
                event.accept(ModContent.ENDERITE_SKILLET.get());
                event.accept(ModContent.STEEL_SKILLET.get());
                event.accept(ModContent.BRONZE_SKILLET.get());
                event.accept(ModContent.CUTTING_BOARD.get());
                event.accept(ModContent.MIXING_BOWL.get());
                event.accept(ModContent.ROLLING_PIN.get());
                event.accept(ModContent.JUICER.get());
                event.accept(ModContent.BLENDER.get());
                event.accept(ModContent.BLACK_KITCHEN_BLOCK.get());
                event.accept(ModContent.WHITE_KITCHEN_BLOCK.get());
                event.accept(ModContent.RECIPE_BOOK.get());
            })
            .title(Component.translatable("itemGroup.foodtxf.tab_foodtxf"))
            .build());

    public static void init(IEventBus bus) {
        TABS.register(bus);
    }
}
