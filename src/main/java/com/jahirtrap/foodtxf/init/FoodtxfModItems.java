package com.jahirtrap.foodtxf.init;

import com.jahirtrap.foodtxf.item.*;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FoodtxfModItems {
    private static final List<Item> REGISTRY = new ArrayList<>();
    public static final Item PLAYER_FLESH = register(new PlayerFleshItem());
    public static final Item COOKED_PLAYER_FLESH = register(new CookedPlayerFleshItem());
    public static final Item CLEAN_PUFFERFISH = register(new CleanPufferfishItem());
    public static final Item COOKED_PUFFERFISH = register(new CookedPufferfishItem());
    public static final Item COOKED_TROPICAL_FISH = register(new CookedTropicalFishItem());
    public static final Item DOUGH_BALL = register(new DoughBallItem());
    public static final Item TOASTED_BREAD = register(new ToastedBreadItem());
    public static final Item BREAD_SLICE = register(new BreadSliceItem());
    public static final Item TOASTED_BREAD_SLICE = register(new ToastedBreadSliceItem());
    public static final Item COOKED_CARROT = register(new CookedCarrotItem());
    public static final Item COOKED_BEETROOT = register(new CookedBeetrootItem());
    public static final Item PUMPKIN_SLICE = register(new PumpkinSliceItem());
    public static final Item GOLDEN_BEEF = register(new GoldenBeefItem());
    public static final Item GOLDEN_PORKCHOP = register(new GoldenPorkchopItem());
    public static final Item GOLDEN_PLAYER_FLESH = register(new GoldenPlayerFleshItem());
    public static final Item GOLDEN_FISH = register(new GoldenFishItem());
    public static final Item GOLDEN_BREAD = register(new GoldenBreadItem());
    public static final Item GOLDEN_POTATO = register(new GoldenPotatoItem());
    public static final Item GOLDEN_BEETROOT = register(new GoldenBeetrootItem());
    public static final Item GLISTERING_PUMPKIN_SLICE = register(new GlisteringPumpkinSliceItem());
    public static final Item GLASS = register(new GlassItem());
    public static final Item GLASS_OF_FRUIT_JUICE = register(new GlassOfFruitJuiceItem());
    public static final Item GLASS_OF_VEGETABLE_JUICE = register(new GlassOfVegetableJuiceItem());
    public static final Item GLASS_OF_MIXED_JUICE = register(new GlassOfMixedJuiceItem());
    public static final Item GLASS_OF_WATER = register(new GlassOfWaterItem());
    public static final Item GLASS_OF_WATER_AND_BREAD = register(new GlassOfWaterAndBreadItem());
    public static final Item GLASS_OF_LAVA = register(new GlassOfLavaItem());
    public static final Item GLASS_OF_MILK = register(new GlassOfMilkItem());
    public static final Item GLASS_OF_MILK_AND_COOKIES = register(new GlassOfMilkAndCookiesItem());
    public static final Item GLASS_OF_MILK_AND_TOASTED_BREAD = register(new GlassOfMilkAndToastedBreadItem());
    public static final Item GLASS_OF_CHOCOMILK = register(new GlassOfChocomilkItem());
    public static final Item GLASS_OF_CHOCOMILK_AND_COOKIES = register(new GlassOfChocomilkAndCookiesItem());
    public static final Item GLASS_OF_CHOCOMILK_AND_TOASTED_BREAD = register(new GlassOfChocomilkAndToastedBreadItem());
    public static final Item WOODEN_KNIFE = register(new WoodenKnifeItem());
    public static final Item STONE_KNIFE = register(new StoneKnifeItem());
    public static final Item IRON_KNIFE = register(new IronKnifeItem());
    public static final Item GOLDEN_KNIFE = register(new GoldenKnifeItem());
    public static final Item DIAMOND_KNIFE = register(new DiamondKnifeItem());
    public static final Item NETHERITE_KNIFE = register(new NetheriteKnifeItem());
    public static final Item STEEL_KNIFE = register(new SteelKnifeItem());
    public static final Item BRONZE_KNIFE = register(new BronzeKnifeItem());
    public static final Item JUICER = register(new JuicerItem());
    public static final Item IRON_JUICER = register(new IronJuicerItem());
    public static final Item GOLDEN_JUICER = register(new GoldenJuicerItem());
    public static final Item DIAMOND_JUICER = register(new DiamondJuicerItem());
    public static final Item NETHERITE_JUICER = register(new NetheriteJuicerItem());
    public static final Item STEEL_JUICER = register(new SteelJuicerItem());
    public static final Item BRONZE_JUICER = register(new BronzeJuicerItem());
    public static final Item CUTTING_BOARD = register(new CuttingBoardItem());
    public static final Item MIXING_BOWL = register(new MixingBowlItem());
    public static final Item BLENDER = register(new BlenderItem());
    public static final Item BLACK_KITCHEN_BLOCK = register(FoodtxfModBlocks.BLACK_KITCHEN_BLOCK, FoodtxfModTabs.TAB_FOOD_TXF);
    public static final Item WHITE_KITCHEN_BLOCK = register(FoodtxfModBlocks.WHITE_KITCHEN_BLOCK, FoodtxfModTabs.TAB_FOOD_TXF);

    private static Item register(Item item) {
        REGISTRY.add(item);
        return item;
    }

    private static Item register(Block block, CreativeModeTab tab) {
        return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
    }
}
