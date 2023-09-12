package com.jahirtrap.foodtxf.init;

import com.jahirtrap.foodtxf.FoodtxfMod;
import com.jahirtrap.foodtxf.item.*;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class FoodtxfModItems {
    public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, FoodtxfMod.MODID);
    public static final RegistryObject<Item> PLAYER_FLESH = REGISTRY.register("player_flesh", PlayerFleshItem::new);
    public static final RegistryObject<Item> COOKED_PLAYER_FLESH = REGISTRY.register("cooked_player_flesh", CookedPlayerFleshItem::new);
    public static final RegistryObject<Item> CLEAN_PUFFERFISH = REGISTRY.register("clean_pufferfish", CleanPufferfishItem::new);
    public static final RegistryObject<Item> COOKED_PUFFERFISH = REGISTRY.register("cooked_pufferfish", CookedFishItem::new);
    public static final RegistryObject<Item> COOKED_TROPICAL_FISH = REGISTRY.register("cooked_tropical_fish", CookedFishItem::new);
    public static final RegistryObject<Item> DOUGH_BALL = REGISTRY.register("dough_ball", DoughBallItem::new);
    public static final RegistryObject<Item> TOASTED_BREAD = REGISTRY.register("toasted_bread", ToastedBreadItem::new);
    public static final RegistryObject<Item> BREAD_SLICE = REGISTRY.register("bread_slice", BreadSliceItem::new);
    public static final RegistryObject<Item> TOASTED_BREAD_SLICE = REGISTRY.register("toasted_bread_slice", ToastedBreadSliceItem::new);
    public static final RegistryObject<Item> BAGUETTE = REGISTRY.register("baguette", BaguetteItem::new);
    public static final RegistryObject<Item> COOKED_CARROT = REGISTRY.register("cooked_carrot", CookedCarrotItem::new);
    public static final RegistryObject<Item> COOKED_BEETROOT = REGISTRY.register("cooked_beetroot", CookedTuberItem::new);
    public static final RegistryObject<Item> PUMPKIN_SLICE = REGISTRY.register("pumpkin_slice", PumpkinSliceItem::new);
    public static final RegistryObject<Item> GOLDEN_BEEF = REGISTRY.register("golden_beef", GoldenMeatItem::new);
    public static final RegistryObject<Item> GOLDEN_PORKCHOP = REGISTRY.register("golden_porkchop", GoldenMeatItem::new);
    public static final RegistryObject<Item> GOLDEN_PLAYER_FLESH = REGISTRY.register("golden_player_flesh", GoldenMeatItem::new);
    public static final RegistryObject<Item> GOLDEN_FISH = REGISTRY.register("golden_fish", GoldenFishItem::new);
    public static final RegistryObject<Item> GOLDEN_BREAD = REGISTRY.register("golden_bread", GoldenBreadItem::new);
    public static final RegistryObject<Item> GOLDEN_BREAD_SLICE = REGISTRY.register("golden_bread_slice", GoldenBreadSliceItem::new);
    public static final RegistryObject<Item> GOLDEN_POTATO = REGISTRY.register("golden_potato", GoldenTuberItem::new);
    public static final RegistryObject<Item> GOLDEN_BEETROOT = REGISTRY.register("golden_beetroot", GoldenTuberItem::new);
    public static final RegistryObject<Item> GOLDEN_SWEET_BERRIES = REGISTRY.register("golden_sweet_berries", GoldenBerriesItem::new);
    public static final RegistryObject<Item> GOLDEN_GLOW_BERRIES = REGISTRY.register("golden_glow_berries", GoldenBerriesItem::new);
    public static final RegistryObject<Item> GLISTERING_PUMPKIN_SLICE = REGISTRY.register("glistering_pumpkin_slice", GlisteringPumpkinSliceItem::new);
    public static final RegistryObject<Item> CHEESE = REGISTRY.register("cheese", CheeseItem::new);
    public static final RegistryObject<Item> CHEESE_SLICE = REGISTRY.register("cheese_slice", CheeseSliceItem::new);
    public static final RegistryObject<Item> RAW_CHEESE_EMPANADA = REGISTRY.register("raw_cheese_empanada", RawEmpanadaItem::new);
    public static final RegistryObject<Item> RAW_MEAT_EMPANADA = REGISTRY.register("raw_meat_empanada", RawEmpanadaItem::new);
    public static final RegistryObject<Item> CHEESE_EMPANADA = REGISTRY.register("cheese_empanada", EmpanadaItem::new);
    public static final RegistryObject<Item> MEAT_EMPANADA = REGISTRY.register("meat_empanada", EmpanadaItem::new);
    public static final RegistryObject<Item> CHEESE_SANDWICH = REGISTRY.register("cheese_sandwich", CheeseSandwichItem::new);
    public static final RegistryObject<Item> FRUIT_SALAD = REGISTRY.register("fruit_salad", BaseSaladItem::new);
    public static final RegistryObject<Item> VEGETABLE_SALAD = REGISTRY.register("vegetable_salad", BaseSaladItem::new);
    public static final RegistryObject<Item> MIXED_SALAD = REGISTRY.register("mixed_salad", BaseSaladItem::new);
    public static final RegistryObject<Item> FISH_ON_STICK = REGISTRY.register("fish_on_stick", FishOnStickItem::new);
    public static final RegistryObject<Item> COOKED_FISH_ON_STICK = REGISTRY.register("cooked_fish_on_stick", CookedFishOnStickItem::new);
    public static final RegistryObject<Item> THERMOS = REGISTRY.register("thermos", ThermosItem::new);
    public static final RegistryObject<Item> WATER_THERMOS = REGISTRY.register("water_thermos", WaterThermosItem::new);
    public static final RegistryObject<Item> LAVA_THERMOS = REGISTRY.register("lava_thermos", LavaThermosItem::new);
    public static final RegistryObject<Item> MILK_THERMOS = REGISTRY.register("milk_thermos", MilkThermosItem::new);
    public static final RegistryObject<Item> CHOCOMILK_THERMOS = REGISTRY.register("chocomilk_thermos", ChocomilkThermosItem::new);
    public static final RegistryObject<Item> GLASS = REGISTRY.register("glass", BaseContainerItem::new);
    public static final RegistryObject<Item> GLASS_OF_FRUIT_JUICE = REGISTRY.register("glass_of_fruit_juice", BaseJuiceItem::new);
    public static final RegistryObject<Item> GLASS_OF_VEGETABLE_JUICE = REGISTRY.register("glass_of_vegetable_juice", BaseJuiceItem::new);
    public static final RegistryObject<Item> GLASS_OF_MIXED_JUICE = REGISTRY.register("glass_of_mixed_juice", BaseJuiceItem::new);
    public static final RegistryObject<Item> GLASS_OF_WATER = REGISTRY.register("glass_of_water", GlassOfWaterItem::new);
    public static final RegistryObject<Item> GLASS_OF_WATER_AND_BREAD = REGISTRY.register("glass_of_water_and_bread", GlassOfWaterAndBreadItem::new);
    public static final RegistryObject<Item> GLASS_OF_LAVA = REGISTRY.register("glass_of_lava", GlassOfLavaItem::new);
    public static final RegistryObject<Item> GLASS_OF_MILK = REGISTRY.register("glass_of_milk", GlassOfMilkItem::new);
    public static final RegistryObject<Item> GLASS_OF_MILK_AND_COOKIES = REGISTRY.register("glass_of_milk_and_cookies", GlassOfMilkAndCookiesItem::new);
    public static final RegistryObject<Item> GLASS_OF_MILK_AND_TOASTED_BREAD = REGISTRY.register("glass_of_milk_and_toasted_bread", GlassOfMilkAndToastedBreadItem::new);
    public static final RegistryObject<Item> GLASS_OF_CHOCOMILK = REGISTRY.register("glass_of_chocomilk", GlassOfChocomilkItem::new);
    public static final RegistryObject<Item> GLASS_OF_CHOCOMILK_AND_COOKIES = REGISTRY.register("glass_of_chocomilk_and_cookies", GlassOfChocomilkAndCookiesItem::new);
    public static final RegistryObject<Item> GLASS_OF_CHOCOMILK_AND_TOASTED_BREAD = REGISTRY.register("glass_of_chocomilk_and_toasted_bread", GlassOfChocomilkAndToastedBreadItem::new);
    public static final RegistryObject<Item> BOX = REGISTRY.register("box", BaseContainerItem::new);
    public static final RegistryObject<Item> BOX_OF_COOKIES = REGISTRY.register("box_of_cookies", BoxOfCookiesItem::new);
    public static final RegistryObject<Item> WOODEN_KNIFE = REGISTRY.register("wooden_knife", WoodenKnifeItem::new);
    public static final RegistryObject<Item> STONE_KNIFE = REGISTRY.register("stone_knife", StoneKnifeItem::new);
    public static final RegistryObject<Item> IRON_KNIFE = REGISTRY.register("iron_knife", IronKnifeItem::new);
    public static final RegistryObject<Item> GOLDEN_KNIFE = REGISTRY.register("golden_knife", GoldenKnifeItem::new);
    public static final RegistryObject<Item> DIAMOND_KNIFE = REGISTRY.register("diamond_knife", DiamondKnifeItem::new);
    public static final RegistryObject<Item> NETHERITE_KNIFE = REGISTRY.register("netherite_knife", NetheriteKnifeItem::new);
    public static final RegistryObject<Item> STEEL_KNIFE = REGISTRY.register("steel_knife", SteelKnifeItem::new);
    public static final RegistryObject<Item> BRONZE_KNIFE = REGISTRY.register("bronze_knife", BronzeKnifeItem::new);
    public static final RegistryObject<Item> SKILLET = REGISTRY.register("skillet", SkilletItem::new);
    public static final RegistryObject<Item> GOLDEN_SKILLET = REGISTRY.register("golden_skillet", GoldenSkilletItem::new);
    public static final RegistryObject<Item> DIAMOND_SKILLET = REGISTRY.register("diamond_skillet", DiamondSkilletItem::new);
    public static final RegistryObject<Item> NETHERITE_SKILLET = REGISTRY.register("netherite_skillet", NetheriteSkilletItem::new);
    public static final RegistryObject<Item> STEEL_SKILLET = REGISTRY.register("steel_skillet", SteelSkilletItem::new);
    public static final RegistryObject<Item> BRONZE_SKILLET = REGISTRY.register("bronze_skillet", BronzeSkilletItem::new);
    public static final RegistryObject<Item> CUTTING_BOARD = REGISTRY.register("cutting_board", BaseReusableItem::new);
    public static final RegistryObject<Item> MIXING_BOWL = REGISTRY.register("mixing_bowl", MixingBowlItem::new);
    public static final RegistryObject<Item> ROLLING_PIN = REGISTRY.register("rolling_pin", RollingPinItem::new);
    public static final RegistryObject<Item> JUICER = REGISTRY.register("juicer", JuicerItem::new);
    public static final RegistryObject<Item> BLENDER = REGISTRY.register("blender", BaseReusableItem::new);
    public static final RegistryObject<Item> BLACK_KITCHEN_BLOCK = block(FoodtxfModBlocks.BLACK_KITCHEN_BLOCK);
    public static final RegistryObject<Item> WHITE_KITCHEN_BLOCK = block(FoodtxfModBlocks.WHITE_KITCHEN_BLOCK);
    public static final RegistryObject<Item> LAMP = blockWearable(FoodtxfModBlocks.LAMP);
    public static final RegistryObject<Item> RECIPE_BOOK = REGISTRY.register("recipe_book", RecipeBookItem::new);

    private static RegistryObject<Item> block(RegistryObject<Block> block) {
        return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
    }

    private static RegistryObject<Item> blockWearable(RegistryObject<Block> block) {
        return REGISTRY.register(block.getId().getPath(), () -> new BaseWearableItem(block.get(), new Item.Properties()));
    }
}
