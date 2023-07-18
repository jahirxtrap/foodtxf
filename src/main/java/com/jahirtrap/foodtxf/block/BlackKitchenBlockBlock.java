package com.jahirtrap.foodtxf.block;

import com.jahirtrap.foodtxf.FoodtxfModElements;
import com.jahirtrap.foodtxf.itemgroup.FoodTXFItemGroup;
import com.jahirtrap.foodtxf.util.TextUtils;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.LootContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.registries.ObjectHolder;

import javax.annotation.Nullable;
import java.util.Collections;
import java.util.List;

@FoodtxfModElements.ModElement.Tag
public class BlackKitchenBlockBlock extends FoodtxfModElements.ModElement {
    @ObjectHolder("foodtxf:black_kitchen_block")
    public static final Block block = null;

    public BlackKitchenBlockBlock(FoodtxfModElements instance) {
        super(instance, 74);
    }

    @Override
    public void initElements() {
        elements.blocks.add(() -> new CustomBlock());
        elements.items.add(() -> new BlockItem(block, new Item.Properties().tab(FoodTXFItemGroup.tab)).setRegistryName(block.getRegistryName()));
    }

    public static class CustomBlock extends Block {
        public CustomBlock() {
            super(Block.Properties.of(Material.STONE).sound(SoundType.STONE).strength(0.8f, 3f).lightLevel(s -> 0)
                    .harvestLevel(0).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops());
            setRegistryName("black_kitchen_block");
        }

        @Override
        public int getLightBlock(BlockState state, IBlockReader worldIn, BlockPos pos) {
            return 15;
        }

        @Override
        public void appendHoverText(ItemStack stack, @Nullable IBlockReader world, List<ITextComponent> tooltip, ITooltipFlag flag) {
            if (net.minecraftforge.fml.ModList.get().isLoaded("cookingforblockheads")) {
                tooltip.add(TextUtils.coloredTextComponent("tooltip.cookingforblockheads:multiblock_kitchen", TextFormatting.YELLOW));
                for (String s : I18n.get("tooltip.cookingforblockheads:kitchen_floor.description").split("\\\\n")) {
                    tooltip.add(TextUtils.coloredTextComponent(s, TextFormatting.GRAY));
                }
            }
        }

        @Override
        public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
            List<ItemStack> dropsOriginal = super.getDrops(state, builder);
            if (!dropsOriginal.isEmpty())
                return dropsOriginal;
            return Collections.singletonList(new ItemStack(this, 1));
        }
    }
}
