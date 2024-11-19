package com.jahirtrap.foodtxf.init;

import com.jahirtrap.foodtxf.block.BaseKitchenBlock;
import com.jahirtrap.foodtxf.item.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import static com.jahirtrap.foodtxf.FoodtxfMod.MODID;

public class ModContent {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);
    public static final List<DeferredItem<Item>> EXCLUDE_ITEMS = new ArrayList<>();

    public static final DeferredItem<Item> PLAYER_FLESH = registerItem("player_flesh", (p) -> new BaseFoodItem(4, 0.375f, p), new Item.Properties());
    public static final DeferredItem<Item> COOKED_PLAYER_FLESH = registerItem("cooked_player_flesh", (p) -> new BaseFoodItem(8, 0.8f, p), new Item.Properties());
    public static final DeferredItem<Item> CLEAN_PUFFERFISH = registerItem("clean_pufferfish", (p) -> new BaseFoodItem(2, 0.1f, p), new Item.Properties());
    public static final DeferredItem<Item> COOKED_PUFFERFISH = registerItem("cooked_pufferfish", (p) -> new BaseFoodItem(6, 0.85f, p), new Item.Properties());
    public static final DeferredItem<Item> COOKED_TROPICAL_FISH = registerItem("cooked_tropical_fish", (p) -> new BaseFoodItem(6, 0.85f, p), new Item.Properties());
    public static final DeferredItem<Item> DOUGH_BALL = registerItem("dough_ball", (p) -> new BaseFoodItem(2, 0.2f, p), new Item.Properties());
    public static final DeferredItem<Item> TOASTED_BREAD = registerItem("toasted_bread", (p) -> new BaseFoodItem(8, 0.75f, p), new Item.Properties());
    public static final DeferredItem<Item> BREAD_SLICE = registerItem("bread_slice", (p) -> new BaseFoodItem(4, 0.5f, p), new Item.Properties());
    public static final DeferredItem<Item> TOASTED_BREAD_SLICE = registerItem("toasted_bread_slice", (p) -> new BaseFoodItem(6, 0.65f, p), new Item.Properties());
    public static final DeferredItem<Item> BAGUETTE = registerItem("baguette", (p) -> new BaseFoodItem(15, 0.6f, 64, p), new Item.Properties());
    public static final DeferredItem<Item> BAGUETTE_SWORD = registerItem("baguette_sword", (p) -> new BaguetteItem(p), new Item.Properties());
    public static final DeferredItem<Item> COOKED_CARROT = registerItem("cooked_carrot", (p) -> new BaseFoodItem(5, 0.7f, p), new Item.Properties());
    public static final DeferredItem<Item> COOKED_BEETROOT = registerItem("cooked_beetroot", (p) -> new BaseFoodItem(5, 0.6f, p), new Item.Properties());
    public static final DeferredItem<Item> PUMPKIN_SLICE = registerItem("pumpkin_slice", (p) -> new BaseFoodItem(4, 0.35f, p), new Item.Properties());
    public static final DeferredItem<Item> GOLDEN_PLAYER_FLESH = registerItem("golden_player_flesh", (p) -> new BaseFoodItem(10, 0.8f, p), new Item.Properties());
    public static final DeferredItem<Item> GOLDEN_BEEF = registerItem("golden_beef", (p) -> new BaseFoodItem(10, 0.8f, p), new Item.Properties());
    public static final DeferredItem<Item> GOLDEN_PORKCHOP = registerItem("golden_porkchop", (p) -> new BaseFoodItem(10, 0.8f, p), new Item.Properties());
    public static final DeferredItem<Item> GOLDEN_MUTTON = registerItem("golden_mutton", (p) -> new BaseFoodItem(8, 0.875f, p), new Item.Properties());
    public static final DeferredItem<Item> GOLDEN_CHICKEN = registerItem("golden_chicken", (p) -> new BaseFoodItem(8, 0.75f, p), new Item.Properties());
    public static final DeferredItem<Item> GOLDEN_RABBIT = registerItem("golden_rabbit", (p) -> new BaseFoodItem(7, 0.7f, p), new Item.Properties());
    public static final DeferredItem<Item> GOLDEN_FISH = registerItem("golden_fish", (p) -> new BaseFoodItem(8, 0.8f, p), new Item.Properties());
    public static final DeferredItem<Item> GOLDEN_BREAD = registerItem("golden_bread", (p) -> new BaseFoodItem(10, 0.76f, p), new Item.Properties());
    public static final DeferredItem<Item> GOLDEN_BREAD_SLICE = registerItem("golden_bread_slice", (p) -> new BaseFoodItem(8, 0.625f, p), new Item.Properties());
    public static final DeferredItem<Item> GOLDEN_POTATO = registerItem("golden_potato", (p) -> new BaseFoodItem(7, 0.7f, p), new Item.Properties());
    public static final DeferredItem<Item> GOLDEN_BEETROOT = registerItem("golden_beetroot", (p) -> new BaseFoodItem(7, 0.7f, p), new Item.Properties());
    public static final DeferredItem<Item> GOLDEN_SWEET_BERRIES = registerItem("golden_sweet_berries", (p) -> new BaseFoodItem(5, 0.5f, p), new Item.Properties());
    public static final DeferredItem<Item> GOLDEN_GLOW_BERRIES = registerItem("golden_glow_berries", (p) -> new BaseFoodItem(5, 0.5f, p), new Item.Properties());
    public static final DeferredItem<Item> GLISTERING_PUMPKIN_SLICE = registerItem("glistering_pumpkin_slice", (p) -> new BaseFoodItem(7, 0.6f, p), new Item.Properties());
    public static final DeferredItem<Item> CHEESE = registerItem("cheese", (p) -> new BaseFoodItem(4, 0.75f, p), new Item.Properties());
    public static final DeferredItem<Item> CHEESE_SLICE = registerItem("cheese_slice", (p) -> new BaseFoodItem(2, 0.75f, p), new Item.Properties());
    public static final DeferredItem<Item> RAW_CHEESE_EMPANADA = registerItem("raw_cheese_empanada", (p) -> new BaseFoodItem(5, 0.6f, p), new Item.Properties());
    public static final DeferredItem<Item> RAW_MEAT_EMPANADA = registerItem("raw_meat_empanada", (p) -> new BaseFoodItem(5, 0.6f, p), new Item.Properties());
    public static final DeferredItem<Item> CHEESE_EMPANADA = registerItem("cheese_empanada", (p) -> new BaseFoodItem(9, 0.6f, p), new Item.Properties());
    public static final DeferredItem<Item> MEAT_EMPANADA = registerItem("meat_empanada", (p) -> new BaseFoodItem(9, 0.6f, p), new Item.Properties());
    public static final DeferredItem<Item> CHEESE_SANDWICH = registerItem("cheese_sandwich", (p) -> new BaseFoodItem(10, 0.7f, p), new Item.Properties());
    public static final DeferredItem<Item> THERMOS = registerItem("thermos", (p) -> new FluidContainerItem(0, p), new Item.Properties());
    public static final DeferredItem<Item> GLASS = registerItem("glass", (p) -> new FluidContainerItem(1, p), new Item.Properties());
    public static final DeferredItem<Item> BOX = registerItem("box", Item::new, new Item.Properties());
    public static final DeferredItem<Item> FRUIT_SALAD = registerItem("fruit_salad", (p) -> new ContainerFoodItem(1, 6, 0.65f, p), new Item.Properties());
    public static final DeferredItem<Item> VEGETABLE_SALAD = registerItem("vegetable_salad", (p) -> new ContainerFoodItem(1, 6, 0.65f, p), new Item.Properties());
    public static final DeferredItem<Item> MIXED_SALAD = registerItem("mixed_salad", (p) -> new ContainerFoodItem(1, 6, 0.65f, p), new Item.Properties());
    public static final DeferredItem<Item> FISH_ON_STICK = registerItem("fish_on_stick", (p) -> new ContainerFoodItem(3, 4, 0.25f, p), new Item.Properties());
    public static final DeferredItem<Item> COOKED_FISH_ON_STICK = registerItem("cooked_fish_on_stick", (p) -> new ContainerFoodItem(3, 10, 0.7f, p), new Item.Properties());
    public static final DeferredItem<Item> WATER_THERMOS = registerItem("water_thermos", (p) -> new ContainerFoodItem(1, p), new Item.Properties());
    public static final DeferredItem<Item> LAVA_THERMOS = registerItem("lava_thermos", (p) -> new ContainerFoodItem(2, p), new Item.Properties());
    public static final DeferredItem<Item> MILK_THERMOS = registerItem("milk_thermos", (p) -> new ContainerFoodItem(3, p), new Item.Properties());
    public static final DeferredItem<Item> CHOCOMILK_THERMOS = registerItem("chocomilk_thermos", (p) -> new ContainerFoodItem(0, p), new Item.Properties());
    public static final DeferredItem<Item> GLASS_OF_FRUIT_JUICE = registerItem("glass_of_fruit_juice", (p) -> new ContainerFoodItem(2, 4, 0.75f, true, p), new Item.Properties());
    public static final DeferredItem<Item> GLASS_OF_VEGETABLE_JUICE = registerItem("glass_of_vegetable_juice", (p) -> new ContainerFoodItem(2, 4, 0.75f, true, p), new Item.Properties());
    public static final DeferredItem<Item> GLASS_OF_MIXED_JUICE = registerItem("glass_of_mixed_juice", (p) -> new ContainerFoodItem(2, 4, 0.75f, true, p), new Item.Properties());
    public static final DeferredItem<Item> GLASS_OF_WATER = registerItem("glass_of_water", (p) -> new ContainerFoodItem(2, 1, 1, true, p), new Item.Properties());
    public static final DeferredItem<Item> GLASS_OF_WATER_AND_BREAD = registerItem("glass_of_water_and_bread", (p) -> new ContainerFoodItem(2, 6, 0.5f, p), new Item.Properties());
    public static final DeferredItem<Item> GLASS_OF_LAVA = registerItem("glass_of_lava", (p) -> new ContainerFoodItem(2, 1, 2, true, p), new Item.Properties());
    public static final DeferredItem<Item> GLASS_OF_MILK = registerItem("glass_of_milk", (p) -> new ContainerFoodItem(2, 1, 0.5f, 3, true, p), new Item.Properties());
    public static final DeferredItem<Item> GLASS_OF_MILK_AND_COOKIES = registerItem("glass_of_milk_and_cookies", (p) -> new ContainerFoodItem(2, 5, 0.2f, p), new Item.Properties());
    public static final DeferredItem<Item> GLASS_OF_MILK_AND_TOASTED_BREAD = registerItem("glass_of_milk_and_toasted_bread", (p) -> new ContainerFoodItem(2, 10, 0.65f, p), new Item.Properties());
    public static final DeferredItem<Item> GLASS_OF_CHOCOMILK = registerItem("glass_of_chocomilk", (p) -> new ContainerFoodItem(2, 1, 1f, true, p), new Item.Properties());
    public static final DeferredItem<Item> GLASS_OF_CHOCOMILK_AND_COOKIES = registerItem("glass_of_chocomilk_and_cookies", (p) -> new ContainerFoodItem(2, 5, 0.3f, p), new Item.Properties());
    public static final DeferredItem<Item> GLASS_OF_CHOCOMILK_AND_TOASTED_BREAD = registerItem("glass_of_chocomilk_and_toasted_bread", (p) -> new ContainerFoodItem(2, 10, 0.7f, p), new Item.Properties());
    public static final DeferredItem<Item> BOX_OF_CEREAL = registerItem("box_of_cereal", (p) -> new ContainerFoodItem(0, 4, 0.5f, p), new Item.Properties());
    public static final DeferredItem<Item> BOX_OF_COOKIES = registerItem("box_of_cookies", (p) -> new ContainerFoodItem(0, 12, 0.325f, p), new Item.Properties());
    public static final DeferredItem<Item> WOODEN_KNIFE = registerItem("wooden_knife", (p) -> new BaseKnifeItem(ToolMaterial.WOOD, p), new Item.Properties());
    public static final DeferredItem<Item> STONE_KNIFE = registerItem("stone_knife", (p) -> new BaseKnifeItem(ToolMaterial.STONE, p), new Item.Properties());
    public static final DeferredItem<Item> IRON_KNIFE = registerItem("iron_knife", (p) -> new BaseKnifeItem(ToolMaterial.IRON, p), new Item.Properties());
    public static final DeferredItem<Item> GOLDEN_KNIFE = registerItem("golden_knife", (p) -> new BaseKnifeItem(ToolMaterial.GOLD, p), new Item.Properties());
    public static final DeferredItem<Item> DIAMOND_KNIFE = registerItem("diamond_knife", (p) -> new BaseKnifeItem(ToolMaterial.DIAMOND, p), new Item.Properties());
    public static final DeferredItem<Item> NETHERITE_KNIFE = registerItem("netherite_knife", (p) -> new BaseKnifeItem(ToolMaterial.NETHERITE, p), new Item.Properties().fireResistant());
    public static final DeferredItem<Item> ENDERITE_KNIFE = registerItem("enderite_knife", (p) -> new BaseKnifeItem(ModMaterials.Tool.ENDERITE, p), new Item.Properties().fireResistant());
    public static final DeferredItem<Item> STEEL_KNIFE = registerItem("steel_knife", (p) -> new BaseKnifeItem(ModMaterials.Tool.STEEL, p), new Item.Properties());
    public static final DeferredItem<Item> BRONZE_KNIFE = registerItem("bronze_knife", (p) -> new BaseKnifeItem(ModMaterials.Tool.BRONZE, p), new Item.Properties());
    public static final DeferredItem<Item> SKILLET = registerItem("skillet", (p) -> new BaseSkilletItem(ToolMaterial.IRON, p), new Item.Properties());
    public static final DeferredItem<Item> GOLDEN_SKILLET = registerItem("golden_skillet", (p) -> new BaseSkilletItem(ToolMaterial.GOLD, p), new Item.Properties());
    public static final DeferredItem<Item> DIAMOND_SKILLET = registerItem("diamond_skillet", (p) -> new BaseSkilletItem(ToolMaterial.DIAMOND, p), new Item.Properties());
    public static final DeferredItem<Item> NETHERITE_SKILLET = registerItem("netherite_skillet", (p) -> new BaseSkilletItem(ToolMaterial.NETHERITE, p), new Item.Properties().fireResistant());
    public static final DeferredItem<Item> ENDERITE_SKILLET = registerItem("enderite_skillet", (p) -> new BaseSkilletItem(ModMaterials.Tool.ENDERITE, p), new Item.Properties().fireResistant());
    public static final DeferredItem<Item> STEEL_SKILLET = registerItem("steel_skillet", (p) -> new BaseSkilletItem(ModMaterials.Tool.STEEL, p), new Item.Properties());
    public static final DeferredItem<Item> BRONZE_SKILLET = registerItem("bronze_skillet", (p) -> new BaseSkilletItem(ModMaterials.Tool.BRONZE, p), new Item.Properties());
    public static final DeferredItem<Item> CUTTING_BOARD = registerItem("cutting_board", BaseReusableItem::new, new Item.Properties());
    public static final DeferredItem<Item> MIXING_BOWL = registerItem("mixing_bowl", BaseReusableItem::new, new Item.Properties());
    public static final DeferredItem<Item> ROLLING_PIN = registerItem("rolling_pin", RollingPinItem::new, new Item.Properties());
    public static final DeferredItem<Item> JUICER = registerItem("juicer", JuicerItem::new, new Item.Properties());
    public static final DeferredItem<Item> BLENDER = registerItem("blender", BaseReusableItem::new, new Item.Properties());
    public static final DeferredBlock<Block> BLACK_KITCHEN_BLOCK = registerBlock("black_kitchen_block", BaseKitchenBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).strength(0.8f, 3f).requiresCorrectToolForDrops(), new Item.Properties());
    public static final DeferredBlock<Block> WHITE_KITCHEN_BLOCK = registerBlock("white_kitchen_block", BaseKitchenBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.SNOW).strength(0.8f, 3f).requiresCorrectToolForDrops(), new Item.Properties());
    public static final DeferredItem<Item> RECIPE_BOOK = registerItem("recipe_book", RecipeBookItem::new, new Item.Properties());

    public static DeferredBlock<Block> registerBlock(String name, Function<BlockBehaviour.Properties, Block> function, BlockBehaviour.Properties blockProp, Item.Properties itemProp) {
        var blockReg = registerBlock(name, function, blockProp);
        registerItem(name, (p) -> new BlockItem(blockReg.get(), p), itemProp.useBlockDescriptionPrefix());
        return blockReg;
    }

    public static DeferredBlock<Block> registerBlock(String name, Function<BlockBehaviour.Properties, Block> function, BlockBehaviour.Properties blockProp) {
        return BLOCKS.register(name, () -> function.apply(blockProp.setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MODID, name)))));
    }

    public static DeferredItem<Item> registerItem(String name, Function<Item.Properties, Item> function, Item.Properties itemProp) {
        return ITEMS.register(name, () -> function.apply(itemProp.setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MODID, name)))));
    }

    public static void init(IEventBus bus) {
        EXCLUDE_ITEMS.add(BAGUETTE_SWORD);
        BLOCKS.register(bus);
        ITEMS.register(bus);
    }
}
