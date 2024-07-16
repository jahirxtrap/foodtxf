package com.jahirtrap.foodtxf.init;

import com.jahirtrap.foodtxf.item.*;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;

import static com.jahirtrap.foodtxf.FoodtxfMod.MODID;

public class FoodtxfModItems {
    public static final Item PLAYER_FLESH = RegistryObject("player_flesh", new BaseFoodItem(4, 0.375f));
    public static final Item COOKED_PLAYER_FLESH = RegistryObject("cooked_player_flesh", new BaseFoodItem(8, 0.8f));
    public static final Item CLEAN_PUFFERFISH = RegistryObject("clean_pufferfish", new BaseFoodItem(2, 0.1f));
    public static final Item COOKED_PUFFERFISH = RegistryObject("cooked_pufferfish", new BaseFoodItem(6, 0.85f));
    public static final Item COOKED_TROPICAL_FISH = RegistryObject("cooked_tropical_fish", new BaseFoodItem(6, 0.85f));
    public static final Item DOUGH_BALL = RegistryObject("dough_ball", new BaseFoodItem(2, 0.2f));
    public static final Item TOASTED_BREAD = RegistryObject("toasted_bread", new BaseFoodItem(8, 0.75f));
    public static final Item BREAD_SLICE = RegistryObject("bread_slice", new BaseFoodItem(4, 0.5f));
    public static final Item TOASTED_BREAD_SLICE = RegistryObject("toasted_bread_slice", new BaseFoodItem(6, 0.65f));
    public static final Item BAGUETTE = RegistryObject("baguette", new BaseFoodItem(15, 0.6f, 64));
    public static final Item COOKED_CARROT = RegistryObject("cooked_carrot", new BaseFoodItem(5, 0.7f));
    public static final Item COOKED_BEETROOT = RegistryObject("cooked_beetroot", new BaseFoodItem(5, 0.6f));
    public static final Item PUMPKIN_SLICE = RegistryObject("pumpkin_slice", new BaseFoodItem(4, 0.35f));
    public static final Item GOLDEN_BEEF = RegistryObject("golden_beef", new BaseFoodItem(10, 0.8f));
    public static final Item GOLDEN_PORKCHOP = RegistryObject("golden_porkchop", new BaseFoodItem(10, 0.8f));
    public static final Item GOLDEN_PLAYER_FLESH = RegistryObject("golden_player_flesh", new BaseFoodItem(10, 0.8f));
    public static final Item GOLDEN_FISH = RegistryObject("golden_fish", new BaseFoodItem(8, 0.85f));
    public static final Item GOLDEN_BREAD = RegistryObject("golden_bread", new BaseFoodItem(10, 0.76f));
    public static final Item GOLDEN_BREAD_SLICE = RegistryObject("golden_bread_slice", new BaseFoodItem(8, 0.625f));
    public static final Item GOLDEN_POTATO = RegistryObject("golden_potato", new BaseFoodItem(8, 0.875f));
    public static final Item GOLDEN_BEETROOT = RegistryObject("golden_beetroot", new BaseFoodItem(8, 0.875f));
    public static final Item GOLDEN_SWEET_BERRIES = RegistryObject("golden_sweet_berries", new BaseFoodItem(6, 0.6f));
    public static final Item GOLDEN_GLOW_BERRIES = RegistryObject("golden_glow_berries", new BaseFoodItem(6, 0.6f));
    public static final Item GLISTERING_PUMPKIN_SLICE = RegistryObject("glistering_pumpkin_slice", new BaseFoodItem(7, 1f));
    public static final Item CHEESE = RegistryObject("cheese", new BaseFoodItem(4, 0.75f));
    public static final Item CHEESE_SLICE = RegistryObject("cheese_slice", new BaseFoodItem(2, 0.75f));
    public static final Item RAW_CHEESE_EMPANADA = RegistryObject("raw_cheese_empanada", new BaseFoodItem(5, 0.6f));
    public static final Item RAW_MEAT_EMPANADA = RegistryObject("raw_meat_empanada", new BaseFoodItem(5, 0.6f));
    public static final Item CHEESE_EMPANADA = RegistryObject("cheese_empanada", new BaseFoodItem(9, 0.6f));
    public static final Item MEAT_EMPANADA = RegistryObject("meat_empanada", new BaseFoodItem(9, 0.6f));
    public static final Item CHEESE_SANDWICH = RegistryObject("cheese_sandwich", new BaseFoodItem(10, 0.7f));
    public static final Item THERMOS = RegistryObject("thermos", new FluidContainerItem(new Item.Properties(), 0));
    public static final Item GLASS = RegistryObject("glass", new FluidContainerItem(new Item.Properties(), 1));
    public static final Item BOX = RegistryObject("box", new Item(new Item.Properties()));
    public static final Item FRUIT_SALAD = RegistryObject("fruit_salad", new ContainerFoodItem(1, 6, 0.65f));
    public static final Item VEGETABLE_SALAD = RegistryObject("vegetable_salad", new ContainerFoodItem(1, 6, 0.65f));
    public static final Item MIXED_SALAD = RegistryObject("mixed_salad", new ContainerFoodItem(1, 6, 0.65f));
    public static final Item FISH_ON_STICK = RegistryObject("fish_on_stick", new ContainerFoodItem(3, 4, 0.25f));
    public static final Item COOKED_FISH_ON_STICK = RegistryObject("cooked_fish_on_stick", new ContainerFoodItem(3, 10, 0.7f));
    public static final Item WATER_THERMOS = RegistryObject("water_thermos", new ContainerFoodItem(1));
    public static final Item LAVA_THERMOS = RegistryObject("lava_thermos", new ContainerFoodItem(2));
    public static final Item MILK_THERMOS = RegistryObject("milk_thermos", new ContainerFoodItem(3));
    public static final Item CHOCOMILK_THERMOS = RegistryObject("chocomilk_thermos", new ContainerFoodItem(0));
    public static final Item GLASS_OF_FRUIT_JUICE = RegistryObject("glass_of_fruit_juice", new ContainerFoodItem(2, 4, 0.75f, true));
    public static final Item GLASS_OF_VEGETABLE_JUICE = RegistryObject("glass_of_vegetable_juice", new ContainerFoodItem(2, 4, 0.75f, true));
    public static final Item GLASS_OF_MIXED_JUICE = RegistryObject("glass_of_mixed_juice", new ContainerFoodItem(2, 4, 0.75f, true));
    public static final Item GLASS_OF_WATER = RegistryObject("glass_of_water", new ContainerFoodItem(2, 1, 1, true));
    public static final Item GLASS_OF_WATER_AND_BREAD = RegistryObject("glass_of_water_and_bread", new ContainerFoodItem(2, 6, 0.5f));
    public static final Item GLASS_OF_LAVA = RegistryObject("glass_of_lava", new ContainerFoodItem(2, 1, 2, true));
    public static final Item GLASS_OF_MILK = RegistryObject("glass_of_milk", new ContainerFoodItem(2, 1, 0.5f, 3, true));
    public static final Item GLASS_OF_MILK_AND_COOKIES = RegistryObject("glass_of_milk_and_cookies", new ContainerFoodItem(2, 5, 0.2f));
    public static final Item GLASS_OF_MILK_AND_TOASTED_BREAD = RegistryObject("glass_of_milk_and_toasted_bread", new ContainerFoodItem(2, 10, 0.65f));
    public static final Item GLASS_OF_CHOCOMILK = RegistryObject("glass_of_chocomilk", new ContainerFoodItem(2, 1, 1f, true));
    public static final Item GLASS_OF_CHOCOMILK_AND_COOKIES = RegistryObject("glass_of_chocomilk_and_cookies", new ContainerFoodItem(2, 5, 0.3f));
    public static final Item GLASS_OF_CHOCOMILK_AND_TOASTED_BREAD = RegistryObject("glass_of_chocomilk_and_toasted_bread", new ContainerFoodItem(2, 10, 0.7f));
    public static final Item BOX_OF_CEREAL = RegistryObject("box_of_cereal", new ContainerFoodItem(0, 4, 0.5f));
    public static final Item BOX_OF_COOKIES = RegistryObject("box_of_cookies", new ContainerFoodItem(0, 12, 0.325f));
    public static final Item WOODEN_KNIFE = RegistryObject("wooden_knife", new BaseKnifeItem(Tiers.WOOD, new Item.Properties()));
    public static final Item STONE_KNIFE = RegistryObject("stone_knife", new BaseKnifeItem(Tiers.STONE, new Item.Properties()));
    public static final Item IRON_KNIFE = RegistryObject("iron_knife", new BaseKnifeItem(Tiers.IRON, new Item.Properties()));
    public static final Item GOLDEN_KNIFE = RegistryObject("golden_knife", new BaseKnifeItem(Tiers.GOLD, new Item.Properties()));
    public static final Item DIAMOND_KNIFE = RegistryObject("diamond_knife", new BaseKnifeItem(Tiers.DIAMOND, new Item.Properties()));
    public static final Item NETHERITE_KNIFE = RegistryObject("netherite_knife", new BaseKnifeItem(Tiers.NETHERITE, new Item.Properties().fireResistant()));
    public static final Item ENDERITE_KNIFE = RegistryObject("enderite_knife", new BaseKnifeItem(FoodtxfTiers.ENDERITE, new Item.Properties().fireResistant()));
    public static final Item STEEL_KNIFE = RegistryObject("steel_knife", new BaseKnifeItem(FoodtxfTiers.STEEL, new Item.Properties()));
    public static final Item BRONZE_KNIFE = RegistryObject("bronze_knife", new BaseKnifeItem(FoodtxfTiers.BRONZE, new Item.Properties()));
    public static final Item SKILLET = RegistryObject("skillet", new BaseSkilletItem(Tiers.IRON, new Item.Properties()));
    public static final Item GOLDEN_SKILLET = RegistryObject("golden_skillet", new BaseSkilletItem(Tiers.GOLD, new Item.Properties()));
    public static final Item DIAMOND_SKILLET = RegistryObject("diamond_skillet", new BaseSkilletItem(Tiers.DIAMOND, new Item.Properties()));
    public static final Item NETHERITE_SKILLET = RegistryObject("netherite_skillet", new BaseSkilletItem(Tiers.NETHERITE, new Item.Properties().fireResistant()));
    public static final Item ENDERITE_SKILLET = RegistryObject("enderite_skillet", new BaseSkilletItem(FoodtxfTiers.ENDERITE, new Item.Properties().fireResistant()));
    public static final Item STEEL_SKILLET = RegistryObject("steel_skillet", new BaseSkilletItem(FoodtxfTiers.STEEL, new Item.Properties()));
    public static final Item BRONZE_SKILLET = RegistryObject("bronze_skillet", new BaseSkilletItem(FoodtxfTiers.BRONZE, new Item.Properties()));
    public static final Item CUTTING_BOARD = RegistryObject("cutting_board", new BaseReusableItem());
    public static final Item MIXING_BOWL = RegistryObject("mixing_bowl", new MixingBowlItem());
    public static final Item ROLLING_PIN = RegistryObject("rolling_pin", new RollingPinItem());
    public static final Item JUICER = RegistryObject("juicer", new JuicerItem());
    public static final Item BLENDER = RegistryObject("blender", new BaseReusableItem());
    public static final Item RECIPE_BOOK = RegistryObject("recipe_book", new RecipeBookItem());

    public static void init() {
    }

    public static Item RegistryObject(String name, Item item) {
        return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MODID, name), item);
    }
}
