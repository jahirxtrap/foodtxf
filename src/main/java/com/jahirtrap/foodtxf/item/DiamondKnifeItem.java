package com.jahirtrap.foodtxf.item;

import com.jahirtrap.foodtxf.FoodtxfModElements;
import com.jahirtrap.foodtxf.itemgroup.FoodTXFItemGroup;
import com.jahirtrap.foodtxf.procedures.PlayerDropsFleshKnifeProcedure;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import net.minecraftforge.registries.ObjectHolder;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

@FoodtxfModElements.ModElement.Tag
public class DiamondKnifeItem extends FoodtxfModElements.ModElement {
    @ObjectHolder("foodtxf:diamond_knife")
    public static final Item block = null;

    public DiamondKnifeItem(FoodtxfModElements instance) {
        super(instance, 55);
    }

    @Override
    public void initElements() {
        elements.items.add(() -> new SwordItem(new IItemTier() {
            public int getUses() {
                return 1561;
            }

            public float getSpeed() {
                return 8f;
            }

            public float getAttackDamageBonus() {
                return 1f;
            }

            public int getLevel() {
                return 3;
            }

            public int getEnchantmentValue() {
                return 10;
            }

            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(Items.DIAMOND));
            }
        }, 3, -2f, new Item.Properties().tab(FoodTXFItemGroup.tab)) {
            @Override
            public boolean hasCraftingRemainingItem() {
                return true;
            }

            @Override
            public ItemStack getContainerItem(ItemStack itemstack) {
                ItemStack retval = new ItemStack(this);
                retval.setDamageValue(itemstack.getDamageValue() + 1);
                if (retval.getDamageValue() >= retval.getMaxDamage()) {
                    return ItemStack.EMPTY;
                }
                return retval;
            }

            @Override
            public boolean isRepairable(ItemStack itemstack) {
                return false;
            }

            @Override
            public ActionResult<ItemStack> use(World world, PlayerEntity entity, Hand hand) {
                ActionResult<ItemStack> retval = super.use(world, entity, hand);
                ItemStack itemstack = entity.getItemInHand(hand);
                double x = entity.getX();
                double y = entity.getY();
                double z = entity.getZ();

                PlayerDropsFleshKnifeProcedure.executeProcedure(Stream
                        .of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
                                new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z),
                                new AbstractMap.SimpleEntry<>("entity", entity), new AbstractMap.SimpleEntry<>("itemstack", itemstack))
                        .collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
                return retval;
            }
        }.setRegistryName("diamond_knife"));
    }
}
