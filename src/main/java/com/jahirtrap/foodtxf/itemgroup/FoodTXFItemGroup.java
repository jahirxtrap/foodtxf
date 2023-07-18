package com.jahirtrap.foodtxf.itemgroup;

import com.jahirtrap.foodtxf.FoodtxfModElements;
import com.jahirtrap.foodtxf.item.GoldenBeefItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@FoodtxfModElements.ModElement.Tag
public class FoodTXFItemGroup extends FoodtxfModElements.ModElement {
    public static ItemGroup tab;

    public FoodTXFItemGroup(FoodtxfModElements instance) {
        super(instance, 89);
    }

    @Override
    public void initElements() {
        tab = new ItemGroup("tabfood_txf") {
            @OnlyIn(Dist.CLIENT)
            @Override
            public ItemStack makeIcon() {
                return new ItemStack(GoldenBeefItem.block);
            }

            @OnlyIn(Dist.CLIENT)
            public boolean hasSearchBar() {
                return false;
            }
        };
    }
}
