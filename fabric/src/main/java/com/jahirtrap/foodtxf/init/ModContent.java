package com.jahirtrap.foodtxf.init;

import com.jahirtrap.foodtxf.block.BaseKitchenBlock;
import com.jahirtrap.foodtxf.item.*;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.level.block.Block;

import static com.jahirtrap.foodtxf.FoodtxfMod.MODID;

public class ModContent {
    public static final Item PLAYER_FLESH = registerItem("player_flesh", new BaseFoodItem(4, 0.375f));
    public static final Item COOKED_PLAYER_FLESH = registerItem("cooked_player_flesh", new BaseFoodItem(8, 0.8f));
    public static final Item CLEAN_PUFFERFISH = registerItem("clean_pufferfish", new BaseFoodItem(2, 0.1f));
    public static final Item COOKED_PUFFERFISH = registerItem("cooked_pufferfish", new BaseFoodItem(6, 0.85f));
    public static final Item COOKED_TROPICAL_FISH = registerItem("cooked_tropical_fish", new BaseFoodItem(6, 0.85f));
    public static final Item DOUGH_BALL = registerItem("dough_ball", new BaseFoodItem(2, 0.2f));
    public static final Item TOASTED_BREAD = registerItem("toasted_bread", new BaseFoodItem(8, 0.75f));
    public static final Item BREAD_SLICE = registerItem("bread_slice", new BaseFoodItem(4, 0.5f));
    public static final Item TOASTED_BREAD_SLICE = registerItem("toasted_bread_slice", new BaseFoodItem(6, 0.65f));
    public static final Item BAGUETTE = registerItem("baguette", new BaseFoodItem(15, 0.6f, 64));
    public static final Item BAGUETTE_SWORD = registerItem("baguette_sword", new BaguetteItem());
    public static final Item COOKED_CARROT = registerItem("cooked_carrot", new BaseFoodItem(5, 0.7f));
    public static final Item COOKED_BEETROOT = registerItem("cooked_beetroot", new BaseFoodItem(5, 0.6f));
    public static final Item PUMPKIN_SLICE = registerItem("pumpkin_slice", new BaseFoodItem(4, 0.35f));
    public static final Item GOLDEN_PLAYER_FLESH = registerItem("golden_player_flesh", new BaseFoodItem(10, 0.8f));
    public static final Item GOLDEN_BEEF = registerItem("golden_beef", new BaseFoodItem(10, 0.8f));
    public static final Item GOLDEN_PORKCHOP = registerItem("golden_porkchop", new BaseFoodItem(10, 0.8f));
    public static final Item GOLDEN_MUTTON = registerItem("golden_mutton", new BaseFoodItem(8, 0.875f));
    public static final Item GOLDEN_CHICKEN = registerItem("golden_chicken", new BaseFoodItem(8, 0.75f));
    public static final Item GOLDEN_RABBIT = registerItem("golden_rabbit", new BaseFoodItem(7, 0.7f));
    public static final Item GOLDEN_FISH = registerItem("golden_fish", new BaseFoodItem(8, 0.8f));
    public static final Item GOLDEN_BREAD = registerItem("golden_bread", new BaseFoodItem(10, 0.76f));
    public static final Item GOLDEN_BREAD_SLICE = registerItem("golden_bread_slice", new BaseFoodItem(8, 0.625f));
    public static final Item GOLDEN_POTATO = registerItem("golden_potato", new BaseFoodItem(7, 0.7f));
    public static final Item GOLDEN_BEETROOT = registerItem("golden_beetroot", new BaseFoodItem(7, 0.7f));
    public static final Item GOLDEN_SWEET_BERRIES = registerItem("golden_sweet_berries", new BaseFoodItem(5, 0.5f));
    public static final Item GOLDEN_GLOW_BERRIES = registerItem("golden_glow_berries", new BaseFoodItem(5, 0.5f));
    public static final Item GLISTERING_PUMPKIN_SLICE = registerItem("glistering_pumpkin_slice", new BaseFoodItem(7, 0.6f));
    public static final Item CHEESE = registerItem("cheese", new BaseFoodItem(4, 0.75f));
    public static final Item CHEESE_SLICE = registerItem("cheese_slice", new BaseFoodItem(2, 0.75f));
    public static final Item RAW_CHEESE_EMPANADA = registerItem("raw_cheese_empanada", new BaseFoodItem(5, 0.6f));
    public static final Item RAW_MEAT_EMPANADA = registerItem("raw_meat_empanada", new BaseFoodItem(5, 0.6f));
    public static final Item CHEESE_EMPANADA = registerItem("cheese_empanada", new BaseFoodItem(9, 0.6f));
    public static final Item MEAT_EMPANADA = registerItem("meat_empanada", new BaseFoodItem(9, 0.6f));
    public static final Item CHEESE_SANDWICH = registerItem("cheese_sandwich", new BaseFoodItem(10, 0.7f));
    public static final Item THERMOS = registerItem("thermos", new FluidContainerItem(new Item.Properties(), 0));
    public static final Item GLASS = registerItem("glass", new FluidContainerItem(new Item.Properties(), 1));
    public static final Item BOX = registerItem("box", new Item(new Item.Properties()));
    public static final Item FRUIT_SALAD = registerItem("fruit_salad", new ContainerFoodItem(1, 6, 0.65f));
    public static final Item VEGETABLE_SALAD = registerItem("vegetable_salad", new ContainerFoodItem(1, 6, 0.65f));
    public static final Item MIXED_SALAD = registerItem("mixed_salad", new ContainerFoodItem(1, 6, 0.65f));
    public static final Item FISH_ON_STICK = registerItem("fish_on_stick", new ContainerFoodItem(3, 4, 0.25f));
    public static final Item COOKED_FISH_ON_STICK = registerItem("cooked_fish_on_stick", new ContainerFoodItem(3, 10, 0.7f));
    public static final Item WATER_THERMOS = registerItem("water_thermos", new ContainerFoodItem(1));
    public static final Item LAVA_THERMOS = registerItem("lava_thermos", new ContainerFoodItem(2));
    public static final Item MILK_THERMOS = registerItem("milk_thermos", new ContainerFoodItem(3));
    public static final Item CHOCOMILK_THERMOS = registerItem("chocomilk_thermos", new ContainerFoodItem(0));
    public static final Item GLASS_OF_FRUIT_JUICE = registerItem("glass_of_fruit_juice", new ContainerFoodItem(2, 4, 0.75f, true));
    public static final Item GLASS_OF_VEGETABLE_JUICE = registerItem("glass_of_vegetable_juice", new ContainerFoodItem(2, 4, 0.75f, true));
    public static final Item GLASS_OF_MIXED_JUICE = registerItem("glass_of_mixed_juice", new ContainerFoodItem(2, 4, 0.75f, true));
    public static final Item GLASS_OF_WATER = registerItem("glass_of_water", new ContainerFoodItem(2, 1, 1, true));
    public static final Item GLASS_OF_WATER_AND_BREAD = registerItem("glass_of_water_and_bread", new ContainerFoodItem(2, 6, 0.5f));
    public static final Item GLASS_OF_LAVA = registerItem("glass_of_lava", new ContainerFoodItem(2, 1, 2, true));
    public static final Item GLASS_OF_MILK = registerItem("glass_of_milk", new ContainerFoodItem(2, 1, 0.5f, 3, true));
    public static final Item GLASS_OF_MILK_AND_COOKIES = registerItem("glass_of_milk_and_cookies", new ContainerFoodItem(2, 5, 0.2f));
    public static final Item GLASS_OF_MILK_AND_TOASTED_BREAD = registerItem("glass_of_milk_and_toasted_bread", new ContainerFoodItem(2, 10, 0.65f));
    public static final Item GLASS_OF_CHOCOMILK = registerItem("glass_of_chocomilk", new ContainerFoodItem(2, 1, 1f, true));
    public static final Item GLASS_OF_CHOCOMILK_AND_COOKIES = registerItem("glass_of_chocomilk_and_cookies", new ContainerFoodItem(2, 5, 0.3f));
    public static final Item GLASS_OF_CHOCOMILK_AND_TOASTED_BREAD = registerItem("glass_of_chocomilk_and_toasted_bread", new ContainerFoodItem(2, 10, 0.7f));
    public static final Item BOX_OF_CEREAL = registerItem("box_of_cereal", new ContainerFoodItem(0, 4, 0.5f));
    public static final Item BOX_OF_COOKIES = registerItem("box_of_cookies", new ContainerFoodItem(0, 12, 0.325f));
    public static final Item WOODEN_KNIFE = registerItem("wooden_knife", new BaseKnifeItem(Tiers.WOOD, new Item.Properties()));
    public static final Item STONE_KNIFE = registerItem("stone_knife", new BaseKnifeItem(Tiers.STONE, new Item.Properties()));
    public static final Item IRON_KNIFE = registerItem("iron_knife", new BaseKnifeItem(Tiers.IRON, new Item.Properties()));
    public static final Item GOLDEN_KNIFE = registerItem("golden_knife", new BaseKnifeItem(Tiers.GOLD, new Item.Properties()));
    public static final Item DIAMOND_KNIFE = registerItem("diamond_knife", new BaseKnifeItem(Tiers.DIAMOND, new Item.Properties()));
    public static final Item NETHERITE_KNIFE = registerItem("netherite_knife", new BaseKnifeItem(Tiers.NETHERITE, new Item.Properties().fireResistant()));
    public static final Item ENDERITE_KNIFE = registerItem("enderite_knife", new BaseKnifeItem(ModTiers.ENDERITE, new Item.Properties().fireResistant()));
    public static final Item STEEL_KNIFE = registerItem("steel_knife", new BaseKnifeItem(ModTiers.STEEL, new Item.Properties()));
    public static final Item BRONZE_KNIFE = registerItem("bronze_knife", new BaseKnifeItem(ModTiers.BRONZE, new Item.Properties()));
    public static final Item SKILLET = registerItem("skillet", new BaseSkilletItem(Tiers.IRON, new Item.Properties()));
    public static final Item GOLDEN_SKILLET = registerItem("golden_skillet", new BaseSkilletItem(Tiers.GOLD, new Item.Properties()));
    public static final Item DIAMOND_SKILLET = registerItem("diamond_skillet", new BaseSkilletItem(Tiers.DIAMOND, new Item.Properties()));
    public static final Item NETHERITE_SKILLET = registerItem("netherite_skillet", new BaseSkilletItem(Tiers.NETHERITE, new Item.Properties().fireResistant()));
    public static final Item ENDERITE_SKILLET = registerItem("enderite_skillet", new BaseSkilletItem(ModTiers.ENDERITE, new Item.Properties().fireResistant()));
    public static final Item STEEL_SKILLET = registerItem("steel_skillet", new BaseSkilletItem(ModTiers.STEEL, new Item.Properties()));
    public static final Item BRONZE_SKILLET = registerItem("bronze_skillet", new BaseSkilletItem(ModTiers.BRONZE, new Item.Properties()));
    public static final Item CUTTING_BOARD = registerItem("cutting_board", new BaseReusableItem());
    public static final Item MIXING_BOWL = registerItem("mixing_bowl", new MixingBowlItem());
    public static final Item ROLLING_PIN = registerItem("rolling_pin", new RollingPinItem());
    public static final Item JUICER = registerItem("juicer", new JuicerItem());
    public static final Item BLENDER = registerItem("blender", new BaseReusableItem());
    public static final Block BLACK_KITCHEN_BLOCK = registerBlock("black_kitchen_block", new BaseKitchenBlock(), new Item.Properties());
    public static final Block WHITE_KITCHEN_BLOCK = registerBlock("white_kitchen_block", new BaseKitchenBlock(), new Item.Properties());
    public static final Item RECIPE_BOOK = registerItem("recipe_book", new RecipeBookItem());

    public static Block registerBlock(String name, Block block, Item.Properties properties) {
        registerItem(name, new BlockItem(block, properties));
        return registerBlock(name, block);
    }

    public static Block registerBlock(String name, Block block) {
        return Registry.register(BuiltInRegistries.BLOCK, ResourceLocation.fromNamespaceAndPath(MODID, name), block);
    }

    public static Item registerItem(String name, Item item) {
        return Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(MODID, name), item);
    }

    public static void init() {
    }
}
