package com.jahirtrap.foodtxf.item;

import com.jahirtrap.foodtxf.FoodtxfModElements;
import com.jahirtrap.foodtxf.itemgroup.FoodTXFItemGroup;
import com.jahirtrap.foodtxf.procedures.FillFluidProcedure;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Rarity;
import net.minecraft.item.UseAction;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import net.minecraftforge.registries.ObjectHolder;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

@FoodtxfModElements.ModElement.Tag
public class ThermosItem extends FoodtxfModElements.ModElement {
    @ObjectHolder("foodtxf:thermos")
    public static final Item block = null;

    public ThermosItem(FoodtxfModElements instance) {
        super(instance, 34);
    }

    @Override
    public void initElements() {
        elements.items.add(() -> new ItemCustom());
    }

    public static class ItemCustom extends Item {
        public ItemCustom() {
            super(new Item.Properties().tab(FoodTXFItemGroup.tab).stacksTo(64).rarity(Rarity.COMMON));
            setRegistryName("thermos");
        }

        @Override
        public UseAction getUseAnimation(ItemStack itemstack) {
            return UseAction.EAT;
        }

        @Override
        public int getEnchantmentValue() {
            return 0;
        }

        @Override
        public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
            return 1F;
        }

        @Override
        public ActionResult<ItemStack> use(World world, PlayerEntity entity, Hand hand) {
            ActionResult<ItemStack> ar = super.use(world, entity, hand);
            double x = entity.getX();
            double y = entity.getY();
            double z = entity.getZ();

            FillFluidProcedure.executeProcedure(Stream
                    .of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x), new AbstractMap.SimpleEntry<>("y", y),
                            new AbstractMap.SimpleEntry<>("z", z), new AbstractMap.SimpleEntry<>("entity", entity))
                    .collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
            return ar;
        }
    }
}
