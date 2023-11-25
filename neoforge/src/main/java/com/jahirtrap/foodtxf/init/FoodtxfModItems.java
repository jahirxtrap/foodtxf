package com.jahirtrap.foodtxf.init;

import com.jahirtrap.foodtxf.FoodtxfMod;
import com.jahirtrap.foodtxf.item.*;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class FoodtxfModItems {
    public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(FoodtxfMod.MODID);
    public static final DeferredItem<Item> PLAYER_FLESH = REGISTRY.register("player_flesh", PlayerFleshItem::new);
    public static final DeferredItem<Item> COOKED_PLAYER_FLESH = REGISTRY.register("cooked_player_flesh", CookedPlayerFleshItem::new);
    public static final DeferredItem<Item> CLEAN_PUFFERFISH = REGISTRY.register("clean_pufferfish", CleanPufferfishItem::new);
    public static final DeferredItem<Item> COOKED_PUFFERFISH = REGISTRY.register("cooked_pufferfish", CookedFishItem::new);
    public static final DeferredItem<Item> COOKED_TROPICAL_FISH = REGISTRY.register("cooked_tropical_fish", CookedFishItem::new);
    public static final DeferredItem<Item> DOUGH_BALL = REGISTRY.register("dough_ball", DoughBallItem::new);
    public static final DeferredItem<Item> TOASTED_BREAD = REGISTRY.register("toasted_bread", ToastedBreadItem::new);
    public static final DeferredItem<Item> BREAD_SLICE = REGISTRY.register("bread_slice", BreadSliceItem::new);
    public static final DeferredItem<Item> TOASTED_BREAD_SLICE = REGISTRY.register("toasted_bread_slice", ToastedBreadSliceItem::new);
    public static final DeferredItem<Item> BAGUETTE = REGISTRY.register("baguette", BaguetteItem::new);
    public static final DeferredItem<Item> COOKED_CARROT = REGISTRY.register("cooked_carrot", CookedCarrotItem::new);
    public static final DeferredItem<Item> COOKED_BEETROOT = REGISTRY.register("cooked_beetroot", CookedTuberItem::new);
    public static final DeferredItem<Item> PUMPKIN_SLICE = REGISTRY.register("pumpkin_slice", PumpkinSliceItem::new);
    public static final DeferredItem<Item> GOLDEN_BEEF = REGISTRY.register("golden_beef", GoldenMeatItem::new);
    public static final DeferredItem<Item> GOLDEN_PORKCHOP = REGISTRY.register("golden_porkchop", GoldenMeatItem::new);
    public static final DeferredItem<Item> GOLDEN_PLAYER_FLESH = REGISTRY.register("golden_player_flesh", GoldenMeatItem::new);
    public static final DeferredItem<Item> GOLDEN_FISH = REGISTRY.register("golden_fish", GoldenFishItem::new);
    public static final DeferredItem<Item> GOLDEN_BREAD = REGISTRY.register("golden_bread", GoldenBreadItem::new);
    public static final DeferredItem<Item> GOLDEN_BREAD_SLICE = REGISTRY.register("golden_bread_slice", GoldenBreadSliceItem::new);
    public static final DeferredItem<Item> GOLDEN_POTATO = REGISTRY.register("golden_potato", GoldenTuberItem::new);
    public static final DeferredItem<Item> GOLDEN_BEETROOT = REGISTRY.register("golden_beetroot", GoldenTuberItem::new);
    public static final DeferredItem<Item> GOLDEN_SWEET_BERRIES = REGISTRY.register("golden_sweet_berries", GoldenBerriesItem::new);
    public static final DeferredItem<Item> GOLDEN_GLOW_BERRIES = REGISTRY.register("golden_glow_berries", GoldenBerriesItem::new);
    public static final DeferredItem<Item> GLISTERING_PUMPKIN_SLICE = REGISTRY.register("glistering_pumpkin_slice", GlisteringPumpkinSliceItem::new);
    public static final DeferredItem<Item> CHEESE = REGISTRY.register("cheese", CheeseItem::new);
    public static final DeferredItem<Item> CHEESE_SLICE = REGISTRY.register("cheese_slice", CheeseSliceItem::new);
    public static final DeferredItem<Item> RAW_CHEESE_EMPANADA = REGISTRY.register("raw_cheese_empanada", RawEmpanadaItem::new);
    public static final DeferredItem<Item> RAW_MEAT_EMPANADA = REGISTRY.register("raw_meat_empanada", RawEmpanadaItem::new);
    public static final DeferredItem<Item> CHEESE_EMPANADA = REGISTRY.register("cheese_empanada", EmpanadaItem::new);
    public static final DeferredItem<Item> MEAT_EMPANADA = REGISTRY.register("meat_empanada", EmpanadaItem::new);
    public static final DeferredItem<Item> CHEESE_SANDWICH = REGISTRY.register("cheese_sandwich", CheeseSandwichItem::new);
    public static final DeferredItem<Item> FRUIT_SALAD = REGISTRY.register("fruit_salad", BaseSaladItem::new);
    public static final DeferredItem<Item> VEGETABLE_SALAD = REGISTRY.register("vegetable_salad", BaseSaladItem::new);
    public static final DeferredItem<Item> MIXED_SALAD = REGISTRY.register("mixed_salad", BaseSaladItem::new);
    public static final DeferredItem<Item> FISH_ON_STICK = REGISTRY.register("fish_on_stick", FishOnStickItem::new);
    public static final DeferredItem<Item> COOKED_FISH_ON_STICK = REGISTRY.register("cooked_fish_on_stick", CookedFishOnStickItem::new);
    public static final DeferredItem<Item> THERMOS = REGISTRY.register("thermos", ThermosItem::new);
    public static final DeferredItem<Item> WATER_THERMOS = REGISTRY.register("water_thermos", WaterThermosItem::new);
    public static final DeferredItem<Item> LAVA_THERMOS = REGISTRY.register("lava_thermos", LavaThermosItem::new);
    public static final DeferredItem<Item> MILK_THERMOS = REGISTRY.register("milk_thermos", MilkThermosItem::new);
    public static final DeferredItem<Item> CHOCOMILK_THERMOS = REGISTRY.register("chocomilk_thermos", ChocomilkThermosItem::new);
    public static final DeferredItem<Item> GLASS = REGISTRY.register("glass", BaseContainerItem::new);
    public static final DeferredItem<Item> GLASS_OF_FRUIT_JUICE = REGISTRY.register("glass_of_fruit_juice", BaseJuiceItem::new);
    public static final DeferredItem<Item> GLASS_OF_VEGETABLE_JUICE = REGISTRY.register("glass_of_vegetable_juice", BaseJuiceItem::new);
    public static final DeferredItem<Item> GLASS_OF_MIXED_JUICE = REGISTRY.register("glass_of_mixed_juice", BaseJuiceItem::new);
    public static final DeferredItem<Item> GLASS_OF_WATER = REGISTRY.register("glass_of_water", GlassOfWaterItem::new);
    public static final DeferredItem<Item> GLASS_OF_WATER_AND_BREAD = REGISTRY.register("glass_of_water_and_bread", GlassOfWaterAndBreadItem::new);
    public static final DeferredItem<Item> GLASS_OF_LAVA = REGISTRY.register("glass_of_lava", GlassOfLavaItem::new);
    public static final DeferredItem<Item> GLASS_OF_MILK = REGISTRY.register("glass_of_milk", GlassOfMilkItem::new);
    public static final DeferredItem<Item> GLASS_OF_MILK_AND_COOKIES = REGISTRY.register("glass_of_milk_and_cookies", GlassOfMilkAndCookiesItem::new);
    public static final DeferredItem<Item> GLASS_OF_MILK_AND_TOASTED_BREAD = REGISTRY.register("glass_of_milk_and_toasted_bread", GlassOfMilkAndToastedBreadItem::new);
    public static final DeferredItem<Item> GLASS_OF_CHOCOMILK = REGISTRY.register("glass_of_chocomilk", GlassOfChocomilkItem::new);
    public static final DeferredItem<Item> GLASS_OF_CHOCOMILK_AND_COOKIES = REGISTRY.register("glass_of_chocomilk_and_cookies", GlassOfChocomilkAndCookiesItem::new);
    public static final DeferredItem<Item> GLASS_OF_CHOCOMILK_AND_TOASTED_BREAD = REGISTRY.register("glass_of_chocomilk_and_toasted_bread", GlassOfChocomilkAndToastedBreadItem::new);
    public static final DeferredItem<Item> BOX = REGISTRY.register("box", BaseContainerItem::new);
    public static final DeferredItem<Item> BOX_OF_COOKIES = REGISTRY.register("box_of_cookies", BoxOfCookiesItem::new);
    public static final DeferredItem<Item> WOODEN_KNIFE = REGISTRY.register("wooden_knife", WoodenKnifeItem::new);
    public static final DeferredItem<Item> STONE_KNIFE = REGISTRY.register("stone_knife", StoneKnifeItem::new);
    public static final DeferredItem<Item> IRON_KNIFE = REGISTRY.register("iron_knife", IronKnifeItem::new);
    public static final DeferredItem<Item> GOLDEN_KNIFE = REGISTRY.register("golden_knife", GoldenKnifeItem::new);
    public static final DeferredItem<Item> DIAMOND_KNIFE = REGISTRY.register("diamond_knife", DiamondKnifeItem::new);
    public static final DeferredItem<Item> NETHERITE_KNIFE = REGISTRY.register("netherite_knife", NetheriteKnifeItem::new);
    public static final DeferredItem<Item> ENDERITE_KNIFE = REGISTRY.register("enderite_knife", EnderiteKnifeItem::new);
    public static final DeferredItem<Item> STEEL_KNIFE = REGISTRY.register("steel_knife", SteelKnifeItem::new);
    public static final DeferredItem<Item> BRONZE_KNIFE = REGISTRY.register("bronze_knife", BronzeKnifeItem::new);
    public static final DeferredItem<Item> SKILLET = REGISTRY.register("skillet", SkilletItem::new);
    public static final DeferredItem<Item> GOLDEN_SKILLET = REGISTRY.register("golden_skillet", GoldenSkilletItem::new);
    public static final DeferredItem<Item> DIAMOND_SKILLET = REGISTRY.register("diamond_skillet", DiamondSkilletItem::new);
    public static final DeferredItem<Item> NETHERITE_SKILLET = REGISTRY.register("netherite_skillet", NetheriteSkilletItem::new);
    public static final DeferredItem<Item> ENDERITE_SKILLET = REGISTRY.register("enderite_skillet", EnderiteSkilletItem::new);
    public static final DeferredItem<Item> STEEL_SKILLET = REGISTRY.register("steel_skillet", SteelSkilletItem::new);
    public static final DeferredItem<Item> BRONZE_SKILLET = REGISTRY.register("bronze_skillet", BronzeSkilletItem::new);
    public static final DeferredItem<Item> CUTTING_BOARD = REGISTRY.register("cutting_board", BaseReusableItem::new);
    public static final DeferredItem<Item> MIXING_BOWL = REGISTRY.register("mixing_bowl", MixingBowlItem::new);
    public static final DeferredItem<Item> ROLLING_PIN = REGISTRY.register("rolling_pin", RollingPinItem::new);
    public static final DeferredItem<Item> JUICER = REGISTRY.register("juicer", JuicerItem::new);
    public static final DeferredItem<Item> BLENDER = REGISTRY.register("blender", BaseReusableItem::new);
    public static final DeferredItem<Item> BLACK_KITCHEN_BLOCK = block(FoodtxfModBlocks.BLACK_KITCHEN_BLOCK);
    public static final DeferredItem<Item> WHITE_KITCHEN_BLOCK = block(FoodtxfModBlocks.WHITE_KITCHEN_BLOCK);
    public static final DeferredItem<Item> LAMP = blockWearable(FoodtxfModBlocks.LAMP);
    public static final DeferredItem<Item> RECIPE_BOOK = REGISTRY.register("recipe_book", RecipeBookItem::new);

    private static DeferredItem<Item> block(DeferredBlock<Block> block) {
        return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
    }

    private static DeferredItem<Item> blockWearable(DeferredBlock<Block> block) {
        return REGISTRY.register(block.getId().getPath(), () -> new BaseWearableItem(block.get(), new Item.Properties()));
    }
}
