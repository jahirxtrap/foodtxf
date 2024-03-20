package com.jahirtrap.foodtxf.init;

import com.jahirtrap.foodtxf.item.*;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import static com.jahirtrap.foodtxf.FoodtxfMod.MODID;
import static com.jahirtrap.foodtxf.FoodtxfModTab.TAB_FOOD_TXF;

public class FoodtxfModItems {
    public static final Item PLAYER_FLESH = RegistryObject("player_flesh", new PlayerFleshItem());
    public static final Item COOKED_PLAYER_FLESH = RegistryObject("cooked_player_flesh", new CookedPlayerFleshItem());
    public static final Item CLEAN_PUFFERFISH = RegistryObject("clean_pufferfish", new CleanPufferfishItem());
    public static final Item COOKED_PUFFERFISH = RegistryObject("cooked_pufferfish", new CookedFishItem());
    public static final Item COOKED_TROPICAL_FISH = RegistryObject("cooked_tropical_fish", new CookedFishItem());
    public static final Item DOUGH_BALL = RegistryObject("dough_ball", new DoughBallItem());
    public static final Item TOASTED_BREAD = RegistryObject("toasted_bread", new ToastedBreadItem());
    public static final Item BREAD_SLICE = RegistryObject("bread_slice", new BreadSliceItem());
    public static final Item TOASTED_BREAD_SLICE = RegistryObject("toasted_bread_slice", new ToastedBreadSliceItem());
    public static final Item BAGUETTE = RegistryObject("baguette", new BaguetteItem());
    public static final Item COOKED_CARROT = RegistryObject("cooked_carrot", new CookedCarrotItem());
    public static final Item COOKED_BEETROOT = RegistryObject("cooked_beetroot", new CookedTuberItem());
    public static final Item PUMPKIN_SLICE = RegistryObject("pumpkin_slice", new PumpkinSliceItem());
    public static final Item GOLDEN_BEEF = RegistryObject("golden_beef", new GoldenMeatItem());
    public static final Item GOLDEN_PORKCHOP = RegistryObject("golden_porkchop", new GoldenMeatItem());
    public static final Item GOLDEN_PLAYER_FLESH = RegistryObject("golden_player_flesh", new GoldenMeatItem());
    public static final Item GOLDEN_FISH = RegistryObject("golden_fish", new GoldenFishItem());
    public static final Item GOLDEN_BREAD = RegistryObject("golden_bread", new GoldenBreadItem());
    public static final Item GOLDEN_BREAD_SLICE = RegistryObject("golden_bread_slice", new GoldenBreadSliceItem());
    public static final Item GOLDEN_POTATO = RegistryObject("golden_potato", new GoldenTuberItem());
    public static final Item GOLDEN_BEETROOT = RegistryObject("golden_beetroot", new GoldenTuberItem());
    public static final Item GOLDEN_SWEET_BERRIES = RegistryObject("golden_sweet_berries", new GoldenBerriesItem());
    public static final Item GOLDEN_GLOW_BERRIES = RegistryObject("golden_glow_berries", new GoldenBerriesItem());
    public static final Item GLISTERING_PUMPKIN_SLICE = RegistryObject("glistering_pumpkin_slice", new GlisteringPumpkinSliceItem());
    public static final Item CHEESE = RegistryObject("cheese", new CheeseItem());
    public static final Item CHEESE_SLICE = RegistryObject("cheese_slice", new CheeseSliceItem());
    public static final Item RAW_CHEESE_EMPANADA = RegistryObject("raw_cheese_empanada", new RawEmpanadaItem());
    public static final Item RAW_MEAT_EMPANADA = RegistryObject("raw_meat_empanada", new RawEmpanadaItem());
    public static final Item CHEESE_EMPANADA = RegistryObject("cheese_empanada", new EmpanadaItem());
    public static final Item MEAT_EMPANADA = RegistryObject("meat_empanada", new EmpanadaItem());
    public static final Item CHEESE_SANDWICH = RegistryObject("cheese_sandwich", new CheeseSandwichItem());
    public static final Item FRUIT_SALAD = RegistryObject("fruit_salad", new BaseSaladItem());
    public static final Item VEGETABLE_SALAD = RegistryObject("vegetable_salad", new BaseSaladItem());
    public static final Item MIXED_SALAD = RegistryObject("mixed_salad", new BaseSaladItem());
    public static final Item FISH_ON_STICK = RegistryObject("fish_on_stick", new FishOnStickItem());
    public static final Item COOKED_FISH_ON_STICK = RegistryObject("cooked_fish_on_stick", new CookedFishOnStickItem());
    public static final Item THERMOS = RegistryObject("thermos", new ThermosItem());
    public static final Item WATER_THERMOS = RegistryObject("water_thermos", new WaterThermosItem());
    public static final Item LAVA_THERMOS = RegistryObject("lava_thermos", new LavaThermosItem());
    public static final Item MILK_THERMOS = RegistryObject("milk_thermos", new MilkThermosItem());
    public static final Item CHOCOMILK_THERMOS = RegistryObject("chocomilk_thermos", new ChocomilkThermosItem());
    public static final Item GLASS = RegistryObject("glass", new BaseItem());
    public static final Item GLASS_OF_FRUIT_JUICE = RegistryObject("glass_of_fruit_juice", new BaseJuiceItem());
    public static final Item GLASS_OF_VEGETABLE_JUICE = RegistryObject("glass_of_vegetable_juice", new BaseJuiceItem());
    public static final Item GLASS_OF_MIXED_JUICE = RegistryObject("glass_of_mixed_juice", new BaseJuiceItem());
    public static final Item GLASS_OF_WATER = RegistryObject("glass_of_water", new GlassOfWaterItem());
    public static final Item GLASS_OF_WATER_AND_BREAD = RegistryObject("glass_of_water_and_bread", new GlassOfWaterAndBreadItem());
    public static final Item GLASS_OF_LAVA = RegistryObject("glass_of_lava", new GlassOfLavaItem());
    public static final Item GLASS_OF_MILK = RegistryObject("glass_of_milk", new GlassOfMilkItem());
    public static final Item GLASS_OF_MILK_AND_COOKIES = RegistryObject("glass_of_milk_and_cookies", new GlassOfMilkAndCookiesItem());
    public static final Item GLASS_OF_MILK_AND_TOASTED_BREAD = RegistryObject("glass_of_milk_and_toasted_bread", new GlassOfMilkAndToastedBreadItem());
    public static final Item GLASS_OF_CHOCOMILK = RegistryObject("glass_of_chocomilk", new GlassOfChocomilkItem());
    public static final Item GLASS_OF_CHOCOMILK_AND_COOKIES = RegistryObject("glass_of_chocomilk_and_cookies", new GlassOfChocomilkAndCookiesItem());
    public static final Item GLASS_OF_CHOCOMILK_AND_TOASTED_BREAD = RegistryObject("glass_of_chocomilk_and_toasted_bread", new GlassOfChocomilkAndToastedBreadItem());
    public static final Item BOX = RegistryObject("box", new BaseItem());
    public static final Item BOX_OF_COOKIES = RegistryObject("box_of_cookies", new BoxOfCookiesItem());
    public static final Item WOODEN_KNIFE = RegistryObject("wooden_knife", new WoodenKnifeItem());
    public static final Item STONE_KNIFE = RegistryObject("stone_knife", new StoneKnifeItem());
    public static final Item IRON_KNIFE = RegistryObject("iron_knife", new IronKnifeItem());
    public static final Item GOLDEN_KNIFE = RegistryObject("golden_knife", new GoldenKnifeItem());
    public static final Item DIAMOND_KNIFE = RegistryObject("diamond_knife", new DiamondKnifeItem());
    public static final Item NETHERITE_KNIFE = RegistryObject("netherite_knife", new NetheriteKnifeItem());
    public static final Item ENDERITE_KNIFE = RegistryObject("enderite_knife", new EnderiteKnifeItem());
    public static final Item STEEL_KNIFE = RegistryObject("steel_knife", new SteelKnifeItem());
    public static final Item BRONZE_KNIFE = RegistryObject("bronze_knife", new BronzeKnifeItem());
    public static final Item SKILLET = RegistryObject("skillet", new SkilletItem());
    public static final Item GOLDEN_SKILLET = RegistryObject("golden_skillet", new GoldenSkilletItem());
    public static final Item DIAMOND_SKILLET = RegistryObject("diamond_skillet", new DiamondSkilletItem());
    public static final Item NETHERITE_SKILLET = RegistryObject("netherite_skillet", new NetheriteSkilletItem());
    public static final Item ENDERITE_SKILLET = RegistryObject("enderite_skillet", new EnderiteSkilletItem());
    public static final Item STEEL_SKILLET = RegistryObject("steel_skillet", new SteelSkilletItem());
    public static final Item BRONZE_SKILLET = RegistryObject("bronze_skillet", new BronzeSkilletItem());
    public static final Item CUTTING_BOARD = RegistryObject("cutting_board", new BaseReusableItem());
    public static final Item MIXING_BOWL = RegistryObject("mixing_bowl", new MixingBowlItem());
    public static final Item ROLLING_PIN = RegistryObject("rolling_pin", new RollingPinItem());
    public static final Item JUICER = RegistryObject("juicer", new JuicerItem());
    public static final Item BLENDER = RegistryObject("blender", new BaseReusableItem());
    public static final Item BLACK_KITCHEN_BLOCK = block("black_kitchen_block", FoodtxfModBlocks.BLACK_KITCHEN_BLOCK);
    public static final Item WHITE_KITCHEN_BLOCK = block("white_kitchen_block", FoodtxfModBlocks.WHITE_KITCHEN_BLOCK);
    public static final Item LAMP = Registry.register(Registry.ITEM, new ResourceLocation(MODID, "lamp"), new BaseWearableItem(FoodtxfModBlocks.LAMP, new Item.Properties()));
    public static final Item NETHERITE_LAMP = Registry.register(Registry.ITEM, new ResourceLocation(MODID, "netherite_lamp"), new NetheriteLampItem(FoodtxfModBlocks.NETHERITE_LAMP, new Item.Properties()));
    public static final Item RECIPE_BOOK = RegistryObject("recipe_book", new RecipeBookItem());

    public static void init() {
    }

    public static Item RegistryObject(String name, Item item) {
        return Registry.register(Registry.ITEM, new ResourceLocation(MODID, name), item);
    }

    public static Item block(String name, Block block) {
        return Registry.register(Registry.ITEM, new ResourceLocation(MODID, name), new BlockItem(block, new Item.Properties().tab(TAB_FOOD_TXF)));
    }
}
