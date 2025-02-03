package com.jahirtrap.foodtxf.init;

import com.jahirtrap.foodtxf.block.BaseKitchenBlock;
import com.jahirtrap.foodtxf.block.RiceCropBlock;
import com.jahirtrap.foodtxf.item.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Supplier;

import static com.jahirtrap.foodtxf.FoodtxfMod.MODID;
import static net.minecraft.world.level.block.ComposterBlock.COMPOSTABLES;

public class ModContent {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(Registries.BLOCK, MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Registries.ITEM, MODID);
    public static final List<RegistryObject<Item>> EXCLUDED_ITEMS = new ArrayList<>();
    public static final HashMap<RegistryObject<? extends ItemLike>, Float> COMPOSTABLE_ITEMS = new HashMap<>();
    public static final HashMap<RegistryObject<? extends ItemLike>, Integer> FUEL_ITEMS = new HashMap<>();

    public static final RegistryObject<Item> PLAYER_FLESH = registerItem("player_flesh", () -> new BaseFoodItem(4, 0.375f));
    public static final RegistryObject<Item> COOKED_PLAYER_FLESH = registerItem("cooked_player_flesh", () -> new BaseFoodItem(8, 0.8f));
    public static final RegistryObject<Item> CLEAN_PUFFERFISH = registerItem("clean_pufferfish", () -> new BaseFoodItem(2, 0.1f));
    public static final RegistryObject<Item> COOKED_PUFFERFISH = registerItem("cooked_pufferfish", () -> new BaseFoodItem(6, 0.85f));
    public static final RegistryObject<Item> COOKED_TROPICAL_FISH = registerItem("cooked_tropical_fish", () -> new BaseFoodItem(6, 0.85f));
    public static final RegistryObject<Block> RICE_CROP = registerBlock("rice", () -> new RiceCropBlock(BlockBehaviour.Properties.ofLegacyCopy(Blocks.WHEAT)), new Item.Properties());
    public static final RegistryObject<Item> RICE_BALL = registerItem("rice_ball", () -> new BaseFoodItem(6, 0.5f));
    public static final RegistryObject<Item> DOUGH_BALL = registerItem("dough_ball", () -> new BaseFoodItem(2, 0.2f));
    public static final RegistryObject<Item> TOASTED_BREAD = registerItem("toasted_bread", () -> new BaseFoodItem(8, 0.75f));
    public static final RegistryObject<Item> BREAD_SLICE = registerItem("bread_slice", () -> new BaseFoodItem(4, 0.5f));
    public static final RegistryObject<Item> TOASTED_BREAD_SLICE = registerItem("toasted_bread_slice", () -> new BaseFoodItem(6, 0.65f));
    public static final RegistryObject<Item> BAGUETTE = registerItem("baguette", () -> new BaseFoodItem(15, 0.6f, 64));
    public static final RegistryObject<Item> BAGUETTE_SWORD = registerItem("baguette_sword", BaguetteItem::new);
    public static final RegistryObject<Item> COOKED_CARROT = registerItem("cooked_carrot", () -> new BaseFoodItem(5, 0.7f));
    public static final RegistryObject<Item> COOKED_BEETROOT = registerItem("cooked_beetroot", () -> new BaseFoodItem(5, 0.6f));
    public static final RegistryObject<Item> PUMPKIN_SLICE = registerItem("pumpkin_slice", () -> new BaseFoodItem(4, 0.35f));
    public static final RegistryObject<Item> GOLDEN_PLAYER_FLESH = registerItem("golden_player_flesh", () -> new BaseFoodItem(10, 0.8f));
    public static final RegistryObject<Item> GOLDEN_BEEF = registerItem("golden_beef", () -> new BaseFoodItem(10, 0.8f));
    public static final RegistryObject<Item> GOLDEN_PORKCHOP = registerItem("golden_porkchop", () -> new BaseFoodItem(10, 0.8f));
    public static final RegistryObject<Item> GOLDEN_MUTTON = registerItem("golden_mutton", () -> new BaseFoodItem(8, 0.875f));
    public static final RegistryObject<Item> GOLDEN_CHICKEN = registerItem("golden_chicken", () -> new BaseFoodItem(8, 0.75f));
    public static final RegistryObject<Item> GOLDEN_RABBIT = registerItem("golden_rabbit", () -> new BaseFoodItem(7, 0.7f));
    public static final RegistryObject<Item> GOLDEN_FISH = registerItem("golden_fish", () -> new BaseFoodItem(8, 0.8f));
    public static final RegistryObject<Item> GOLDEN_BREAD = registerItem("golden_bread", () -> new BaseFoodItem(10, 0.76f));
    public static final RegistryObject<Item> GOLDEN_BREAD_SLICE = registerItem("golden_bread_slice", () -> new BaseFoodItem(8, 0.625f));
    public static final RegistryObject<Item> GOLDEN_POTATO = registerItem("golden_potato", () -> new BaseFoodItem(7, 0.7f));
    public static final RegistryObject<Item> GOLDEN_BEETROOT = registerItem("golden_beetroot", () -> new BaseFoodItem(7, 0.7f));
    public static final RegistryObject<Item> GOLDEN_SWEET_BERRIES = registerItem("golden_sweet_berries", () -> new BaseFoodItem(5, 0.5f));
    public static final RegistryObject<Item> GOLDEN_GLOW_BERRIES = registerItem("golden_glow_berries", () -> new BaseFoodItem(5, 0.5f));
    public static final RegistryObject<Item> GLISTERING_PUMPKIN_SLICE = registerItem("glistering_pumpkin_slice", () -> new BaseFoodItem(7, 0.6f));
    public static final RegistryObject<Item> CHEESE = registerItem("cheese", () -> new BaseFoodItem(4, 0.75f));
    public static final RegistryObject<Item> CHEESE_SLICE = registerItem("cheese_slice", () -> new BaseFoodItem(2, 0.75f));
    public static final RegistryObject<Item> RAW_CHEESE_EMPANADA = registerItem("raw_cheese_empanada", () -> new BaseFoodItem(5, 0.6f));
    public static final RegistryObject<Item> RAW_MEAT_EMPANADA = registerItem("raw_meat_empanada", () -> new BaseFoodItem(5, 0.6f));
    public static final RegistryObject<Item> CHEESE_EMPANADA = registerItem("cheese_empanada", () -> new BaseFoodItem(9, 0.6f));
    public static final RegistryObject<Item> MEAT_EMPANADA = registerItem("meat_empanada", () -> new BaseFoodItem(9, 0.6f));
    public static final RegistryObject<Item> CHEESE_SANDWICH = registerItem("cheese_sandwich", () -> new BaseFoodItem(10, 0.7f));
    public static final RegistryObject<Item> THERMOS = registerItem("thermos", () -> new FluidContainerItem(0));
    public static final RegistryObject<Item> GLASS = registerItem("glass", () -> new FluidContainerItem(1));
    public static final RegistryObject<Item> BOX = registerItem("box", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FRUIT_SALAD = registerItem("fruit_salad", () -> new ContainerFoodItem(1, 6, 0.65f));
    public static final RegistryObject<Item> VEGETABLE_SALAD = registerItem("vegetable_salad", () -> new ContainerFoodItem(1, 6, 0.65f));
    public static final RegistryObject<Item> MIXED_SALAD = registerItem("mixed_salad", () -> new ContainerFoodItem(1, 6, 0.65f));
    public static final RegistryObject<Item> RICE_BOWL = registerItem("rice_bowl", () -> new ContainerFoodItem(1, 6, 0.5f));
    public static final RegistryObject<Item> FISH_ON_STICK = registerItem("fish_on_stick", () -> new ContainerFoodItem(3, 4, 0.25f));
    public static final RegistryObject<Item> COOKED_FISH_ON_STICK = registerItem("cooked_fish_on_stick", () -> new ContainerFoodItem(3, 10, 0.7f));
    public static final RegistryObject<Item> WATER_THERMOS = registerItem("water_thermos", () -> new ContainerFoodItem(1));
    public static final RegistryObject<Item> LAVA_THERMOS = registerItem("lava_thermos", () -> new ContainerFoodItem(2));
    public static final RegistryObject<Item> MILK_THERMOS = registerItem("milk_thermos", () -> new ContainerFoodItem(3));
    public static final RegistryObject<Item> CHOCOMILK_THERMOS = registerItem("chocomilk_thermos", () -> new ContainerFoodItem(0));
    public static final RegistryObject<Item> GLASS_OF_FRUIT_JUICE = registerItem("glass_of_fruit_juice", () -> new ContainerFoodItem(2, 4, 0.75f, true));
    public static final RegistryObject<Item> GLASS_OF_VEGETABLE_JUICE = registerItem("glass_of_vegetable_juice", () -> new ContainerFoodItem(2, 4, 0.75f, true));
    public static final RegistryObject<Item> GLASS_OF_MIXED_JUICE = registerItem("glass_of_mixed_juice", () -> new ContainerFoodItem(2, 4, 0.75f, true));
    public static final RegistryObject<Item> GLASS_OF_WATER = registerItem("glass_of_water", () -> new ContainerFoodItem(2, 1));
    public static final RegistryObject<Item> GLASS_OF_WATER_AND_BREAD = registerItem("glass_of_water_and_bread", () -> new ContainerFoodItem(2, 6, 0.5f));
    public static final RegistryObject<Item> GLASS_OF_LAVA = registerItem("glass_of_lava", () -> new ContainerFoodItem(2, 2));
    public static final RegistryObject<Item> GLASS_OF_MILK = registerItem("glass_of_milk", () -> new ContainerFoodItem(2, 1, 0.5f, 3, true));
    public static final RegistryObject<Item> GLASS_OF_MILK_AND_COOKIES = registerItem("glass_of_milk_and_cookies", () -> new ContainerFoodItem(2, 5, 0.2f));
    public static final RegistryObject<Item> GLASS_OF_MILK_AND_TOASTED_BREAD = registerItem("glass_of_milk_and_toasted_bread", () -> new ContainerFoodItem(2, 10, 0.65f));
    public static final RegistryObject<Item> GLASS_OF_CHOCOMILK = registerItem("glass_of_chocomilk", () -> new ContainerFoodItem(2, 1, 1f, true));
    public static final RegistryObject<Item> GLASS_OF_CHOCOMILK_AND_COOKIES = registerItem("glass_of_chocomilk_and_cookies", () -> new ContainerFoodItem(2, 5, 0.3f));
    public static final RegistryObject<Item> GLASS_OF_CHOCOMILK_AND_TOASTED_BREAD = registerItem("glass_of_chocomilk_and_toasted_bread", () -> new ContainerFoodItem(2, 10, 0.7f));
    public static final RegistryObject<Item> BOX_OF_CEREAL = registerItem("box_of_cereal", () -> new ContainerFoodItem(0, 4, 0.5f));
    public static final RegistryObject<Item> BOX_OF_COOKIES = registerItem("box_of_cookies", () -> new ContainerFoodItem(0, 12, 0.325f));
    public static final RegistryObject<Item> WOODEN_KNIFE = registerItem("wooden_knife", () -> new BaseKnifeItem(Tiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> STONE_KNIFE = registerItem("stone_knife", () -> new BaseKnifeItem(Tiers.STONE, new Item.Properties()));
    public static final RegistryObject<Item> IRON_KNIFE = registerItem("iron_knife", () -> new BaseKnifeItem(Tiers.IRON, new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_KNIFE = registerItem("golden_knife", () -> new BaseKnifeItem(Tiers.GOLD, new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_KNIFE = registerItem("diamond_knife", () -> new BaseKnifeItem(Tiers.DIAMOND, new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_KNIFE = registerItem("netherite_knife", () -> new BaseKnifeItem(Tiers.NETHERITE, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> ENDERITE_KNIFE = registerItem("enderite_knife", () -> new BaseKnifeItem(ModTiers.ENDERITE, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> STEEL_KNIFE = registerItem("steel_knife", () -> new BaseKnifeItem(ModTiers.STEEL, new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_KNIFE = registerItem("bronze_knife", () -> new BaseKnifeItem(ModTiers.BRONZE, new Item.Properties()));
    public static final RegistryObject<Item> ZURITE_KNIFE = registerItem("zurite_knife", () -> new BaseKnifeItem(ModTiers.ZURITE, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> IRON_SKILLET = registerItem("iron_skillet", () -> new BaseSkilletItem(Tiers.IRON, new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_SKILLET = registerItem("golden_skillet", () -> new BaseSkilletItem(Tiers.GOLD, new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_SKILLET = registerItem("diamond_skillet", () -> new BaseSkilletItem(Tiers.DIAMOND, new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_SKILLET = registerItem("netherite_skillet", () -> new BaseSkilletItem(Tiers.NETHERITE, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> ENDERITE_SKILLET = registerItem("enderite_skillet", () -> new BaseSkilletItem(ModTiers.ENDERITE, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> STEEL_SKILLET = registerItem("steel_skillet", () -> new BaseSkilletItem(ModTiers.STEEL, new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_SKILLET = registerItem("bronze_skillet", () -> new BaseSkilletItem(ModTiers.BRONZE, new Item.Properties()));
    public static final RegistryObject<Item> ZURITE_SKILLET = registerItem("zurite_skillet", () -> new BaseSkilletItem(ModTiers.ZURITE, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> CUTTING_BOARD = registerItem("cutting_board", () -> new BaseReusableItem(new Item.Properties()));
    public static final RegistryObject<Item> MIXING_BOWL = registerItem("mixing_bowl", () -> new BaseReusableItem(new Item.Properties()));
    public static final RegistryObject<Item> ROLLING_PIN = registerItem("rolling_pin", RollingPinItem::new);
    public static final RegistryObject<Item> JUICER = registerItem("juicer", JuicerItem::new);
    public static final RegistryObject<Item> BLENDER = registerItem("blender", () -> new BaseReusableItem(new Item.Properties()));
    public static final RegistryObject<Block> BLACK_KITCHEN_BLOCK = registerBlock("black_kitchen_block", () -> new BaseKitchenBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).strength(0.8f, 3f).requiresCorrectToolForDrops()), new Item.Properties());
    public static final RegistryObject<Block> WHITE_KITCHEN_BLOCK = registerBlock("white_kitchen_block", () -> new BaseKitchenBlock(BlockBehaviour.Properties.of().mapColor(MapColor.SNOW).strength(0.8f, 3f).requiresCorrectToolForDrops()), new Item.Properties());
    public static final RegistryObject<Item> RECIPE_BOOK = registerItem("recipe_book", RecipeBookItem::new);

    private static RegistryObject<Block> registerBlock(String name, Supplier<Block> supplier, Item.Properties itemProp) {
        var blockReg = registerBlock(name, supplier);
        registerItem(name, () -> new BlockItem(blockReg.get(), itemProp));
        return blockReg;
    }

    private static RegistryObject<Block> registerBlock(String name, Supplier<Block> supplier) {
        return BLOCKS.register(name, supplier);
    }

    private static RegistryObject<Item> registerItem(String name, Supplier<Item> supplier) {
        return ITEMS.register(name, supplier);
    }

    public static void init(IEventBus bus) {
        EXCLUDED_ITEMS.add(BAGUETTE_SWORD);
        BLOCKS.register(bus);
        ITEMS.register(bus);

        COMPOSTABLE_ITEMS.put(RICE_CROP, 0.3f);
        COMPOSTABLE_ITEMS.put(RICE_BALL, 0.85f);
        COMPOSTABLE_ITEMS.put(DOUGH_BALL, 0.65f);
        COMPOSTABLE_ITEMS.put(TOASTED_BREAD, 1f);
        COMPOSTABLE_ITEMS.put(BREAD_SLICE, 0.4f);
        COMPOSTABLE_ITEMS.put(TOASTED_BREAD_SLICE, 0.75f);
        COMPOSTABLE_ITEMS.put(BAGUETTE, 1f);
        COMPOSTABLE_ITEMS.put(BAGUETTE_SWORD, 1f);
        COMPOSTABLE_ITEMS.put(COOKED_CARROT, 0.85f);
        COMPOSTABLE_ITEMS.put(COOKED_BEETROOT, 0.85f);
        COMPOSTABLE_ITEMS.put(PUMPKIN_SLICE, 0.5f);
        COMPOSTABLE_ITEMS.put(CHEESE, 0.65f);
        COMPOSTABLE_ITEMS.put(CHEESE_SLICE, 0.3f);

        FUEL_ITEMS.put(BOX, 200);
        FUEL_ITEMS.put(WOODEN_KNIFE, 200);
        FUEL_ITEMS.put(CUTTING_BOARD, 200);
        FUEL_ITEMS.put(ROLLING_PIN, 300);

        bus.addListener((FMLCommonSetupEvent event) -> COMPOSTABLE_ITEMS.forEach((item, chance) -> COMPOSTABLES.put(item.get().asItem(), chance)));
        MinecraftForge.EVENT_BUS.addListener((FurnaceFuelBurnTimeEvent event) -> FUEL_ITEMS.forEach((item, burnTime) -> {
            if (item.get() == event.getItemStack().getItem()) event.setBurnTime(burnTime);
        }));
    }
}
