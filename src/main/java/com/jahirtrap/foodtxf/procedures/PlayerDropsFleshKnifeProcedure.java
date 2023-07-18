package com.jahirtrap.foodtxf.procedures;

import com.jahirtrap.foodtxf.FoodtxfMod;
import com.jahirtrap.foodtxf.item.CookedPlayerFleshItem;
import com.jahirtrap.foodtxf.item.PlayerFleshItem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.network.play.NetworkPlayerInfo;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Hand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.GameType;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Map;
import java.util.Random;

public class PlayerDropsFleshKnifeProcedure {
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("world") == null) {
            if (!dependencies.containsKey("world"))
                FoodtxfMod.LOGGER.warn("Failed to load dependency world for procedure PlayerDropsFleshKnife!");
            return;
        }
        if (dependencies.get("x") == null) {
            if (!dependencies.containsKey("x"))
                FoodtxfMod.LOGGER.warn("Failed to load dependency x for procedure PlayerDropsFleshKnife!");
            return;
        }
        if (dependencies.get("y") == null) {
            if (!dependencies.containsKey("y"))
                FoodtxfMod.LOGGER.warn("Failed to load dependency y for procedure PlayerDropsFleshKnife!");
            return;
        }
        if (dependencies.get("z") == null) {
            if (!dependencies.containsKey("z"))
                FoodtxfMod.LOGGER.warn("Failed to load dependency z for procedure PlayerDropsFleshKnife!");
            return;
        }
        if (dependencies.get("entity") == null) {
            if (!dependencies.containsKey("entity"))
                FoodtxfMod.LOGGER.warn("Failed to load dependency entity for procedure PlayerDropsFleshKnife!");
            return;
        }
        if (dependencies.get("itemstack") == null) {
            if (!dependencies.containsKey("itemstack"))
                FoodtxfMod.LOGGER.warn("Failed to load dependency itemstack for procedure PlayerDropsFleshKnife!");
            return;
        }
        IWorld world = (IWorld) dependencies.get("world");
        double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
        double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
        double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
        Entity entity = (Entity) dependencies.get("entity");
        ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
        if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getItem() == itemstack.getItem()
                && ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getOffhandItem() : ItemStack.EMPTY).getItem() == (ItemStack.EMPTY)
                .getItem()
                && ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getOffhandItem() : ItemStack.EMPTY)
                .getItem() != ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY)
                .getItem()) {
            if (entity.isShiftKeyDown()) {
                if (entity instanceof PlayerEntity) {
                    if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getItem() == itemstack
                            .getItem()) {
                        int fa_level = EnchantmentHelper.getItemEnchantmentLevel(Enchantments.FIRE_ASPECT,
                                (entity instanceof LivingEntity) ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY);
                        if (fa_level != 0) {
                            entity.setSecondsOnFire(4 * fa_level);
                        }
                    } else {
                        int fa_level = EnchantmentHelper.getItemEnchantmentLevel(Enchantments.FIRE_ASPECT, itemstack);
                        if (fa_level != 0) {
                            entity.setSecondsOnFire(4 * fa_level);
                        }
                    }

                    if (entity.isOnFire()) {
                        if (entity.hurt(new DamageSource("suicide").bypassArmor().bypassMagic(), (float) 6)) {
                            {
                                ItemStack _ist = itemstack;
                                if (_ist.hurt(1, new Random(), null)) {
                                    _ist.shrink(1);
                                    _ist.setDamageValue(0);
                                }
                            }
                            {
                                ItemStack _ist = ((entity instanceof LivingEntity)
                                        ? ((LivingEntity) entity).getItemBySlot(EquipmentSlotType.HEAD)
                                        : ItemStack.EMPTY);
                                if (_ist.hurt(1, new Random(), null)) {
                                    _ist.shrink(1);
                                    _ist.setDamageValue(0);
                                }
                            }
                            {
                                ItemStack _ist = ((entity instanceof LivingEntity)
                                        ? ((LivingEntity) entity).getItemBySlot(EquipmentSlotType.CHEST)
                                        : ItemStack.EMPTY);
                                if (_ist.hurt(1, new Random(), null)) {
                                    _ist.shrink(1);
                                    _ist.setDamageValue(0);
                                }
                            }
                            {
                                ItemStack _ist = ((entity instanceof LivingEntity)
                                        ? ((LivingEntity) entity).getItemBySlot(EquipmentSlotType.LEGS)
                                        : ItemStack.EMPTY);
                                if (_ist.hurt(1, new Random(), null)) {
                                    _ist.shrink(1);
                                    _ist.setDamageValue(0);
                                }
                            }
                            {
                                ItemStack _ist = ((entity instanceof LivingEntity)
                                        ? ((LivingEntity) entity).getItemBySlot(EquipmentSlotType.FEET)
                                        : ItemStack.EMPTY);
                                if (_ist.hurt(1, new Random(), null)) {
                                    _ist.shrink(1);
                                    _ist.setDamageValue(0);
                                }
                            }
                            if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY)
                                    .getItem() == itemstack.getItem()) {
                                ((LivingEntity) entity).swing(Hand.MAIN_HAND, true);
                            } else {
                                ((LivingEntity) entity).swing(Hand.OFF_HAND, true);
                            }
                            if (world instanceof World && !world.isClientSide()) {
                                ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(CookedPlayerFleshItem.block));
                                entityToSpawn.setPickUpDelay(10);
                                world.addFreshEntity(entityToSpawn);
                            }
                        }
                    } else {
                        if (entity.hurt(new DamageSource("suicide").bypassArmor().bypassMagic(), (float) 6)) {
                            {
                                ItemStack _ist = itemstack;
                                if (_ist.hurt(1, new Random(), null)) {
                                    _ist.shrink(1);
                                    _ist.setDamageValue(0);
                                }
                            }
                            {
                                ItemStack _ist = ((entity instanceof LivingEntity)
                                        ? ((LivingEntity) entity).getItemBySlot(EquipmentSlotType.HEAD)
                                        : ItemStack.EMPTY);
                                if (_ist.hurt(1, new Random(), null)) {
                                    _ist.shrink(1);
                                    _ist.setDamageValue(0);
                                }
                            }
                            {
                                ItemStack _ist = ((entity instanceof LivingEntity)
                                        ? ((LivingEntity) entity).getItemBySlot(EquipmentSlotType.CHEST)
                                        : ItemStack.EMPTY);
                                if (_ist.hurt(1, new Random(), null)) {
                                    _ist.shrink(1);
                                    _ist.setDamageValue(0);
                                }
                            }
                            {
                                ItemStack _ist = ((entity instanceof LivingEntity)
                                        ? ((LivingEntity) entity).getItemBySlot(EquipmentSlotType.LEGS)
                                        : ItemStack.EMPTY);
                                if (_ist.hurt(1, new Random(), null)) {
                                    _ist.shrink(1);
                                    _ist.setDamageValue(0);
                                }
                            }
                            {
                                ItemStack _ist = ((entity instanceof LivingEntity)
                                        ? ((LivingEntity) entity).getItemBySlot(EquipmentSlotType.FEET)
                                        : ItemStack.EMPTY);
                                if (_ist.hurt(1, new Random(), null)) {
                                    _ist.shrink(1);
                                    _ist.setDamageValue(0);
                                }
                            }
                            if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY)
                                    .getItem() == itemstack.getItem()) {
                                ((LivingEntity) entity).swing(Hand.MAIN_HAND, true);
                            } else {
                                ((LivingEntity) entity).swing(Hand.OFF_HAND, true);
                            }
                            if (world instanceof World && !world.isClientSide()) {
                                ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(PlayerFleshItem.block));
                                entityToSpawn.setPickUpDelay(10);
                                world.addFreshEntity(entityToSpawn);
                            }
                        }
                    }
                    if (new Object() {
                        public boolean checkGamemode(Entity _ent) {
                            if (_ent instanceof ServerPlayerEntity) {
                                return ((ServerPlayerEntity) _ent).gameMode.getGameModeForPlayer() == GameType.CREATIVE;
                            } else if (_ent instanceof PlayerEntity && _ent.level.isClientSide()) {
                                NetworkPlayerInfo _npi = Minecraft.getInstance().getConnection()
                                        .getPlayerInfo(((AbstractClientPlayerEntity) _ent).getGameProfile().getId());
                                return _npi != null && _npi.getGameMode() == GameType.CREATIVE;
                            }
                            return false;
                        }
                    }.checkGamemode(entity)) {
                        if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY)
                                .getItem() == itemstack.getItem()) {
                            if (entity instanceof LivingEntity) {
                                ((LivingEntity) entity).swing(Hand.MAIN_HAND, true);
                            }
                        } else {
                            if (entity instanceof LivingEntity) {
                                ((LivingEntity) entity).swing(Hand.OFF_HAND, true);
                            }
                        }
                        if (world instanceof World && !world.isClientSide()) {
                            world.playSound(null, new BlockPos((int) x, (int) y, (int) z),
                                    ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.hurt")),
                                    SoundCategory.PLAYERS, (float) 0.8, (float) 1);
                        } else {
                            ((World) world).playLocalSound(x, y, z,
                                    ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.hurt")),
                                    SoundCategory.PLAYERS, (float) 0.8, (float) 1, false);
                        }
                        if (entity.isOnFire()) {
                            if (world instanceof World && !world.isClientSide()) {
                                ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(CookedPlayerFleshItem.block));
                                entityToSpawn.setPickUpDelay(10);
                                world.addFreshEntity(entityToSpawn);
                            }
                        } else {
                            if (world instanceof World && !world.isClientSide()) {
                                ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(PlayerFleshItem.block));
                                entityToSpawn.setPickUpDelay(10);
                                world.addFreshEntity(entityToSpawn);
                            }
                        }
                    }
                }
            }
        } else if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getOffhandItem() : ItemStack.EMPTY).getItem() == itemstack
                .getItem()) {
            if (entity.isShiftKeyDown()) {
                if (entity instanceof PlayerEntity) {
                    if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getOffhandItem() : ItemStack.EMPTY).getItem() == itemstack
                            .getItem()) {
                        int fa_level = EnchantmentHelper.getItemEnchantmentLevel(Enchantments.FIRE_ASPECT,
                                (entity instanceof LivingEntity) ? ((LivingEntity) entity).getOffhandItem() : ItemStack.EMPTY);
                        if (fa_level != 0) {
                            entity.setSecondsOnFire(4 * fa_level);
                        }
                    } else {
                        int fa_level = EnchantmentHelper.getItemEnchantmentLevel(Enchantments.FIRE_ASPECT,
                                (entity instanceof LivingEntity) ? ((LivingEntity) entity).getOffhandItem() : ItemStack.EMPTY);
                        if (fa_level != 0) {
                            entity.setSecondsOnFire(4 * fa_level);
                        }
                    }

                    if (entity.isOnFire()) {
                        if (entity.hurt(new DamageSource("suicide").bypassArmor().bypassMagic(), (float) 6)) {
                            {
                                ItemStack _ist = (entity instanceof LivingEntity) ? ((LivingEntity) entity).getOffhandItem() : ItemStack.EMPTY;
                                if (_ist.hurt(1, new Random(), null)) {
                                    _ist.shrink(1);
                                    _ist.setDamageValue(0);
                                }
                            }
                            {
                                ItemStack _ist = ((entity instanceof LivingEntity)
                                        ? ((LivingEntity) entity).getItemBySlot(EquipmentSlotType.HEAD)
                                        : ItemStack.EMPTY);
                                if (_ist.hurt(1, new Random(), null)) {
                                    _ist.shrink(1);
                                    _ist.setDamageValue(0);
                                }
                            }
                            {
                                ItemStack _ist = ((entity instanceof LivingEntity)
                                        ? ((LivingEntity) entity).getItemBySlot(EquipmentSlotType.CHEST)
                                        : ItemStack.EMPTY);
                                if (_ist.hurt(1, new Random(), null)) {
                                    _ist.shrink(1);
                                    _ist.setDamageValue(0);
                                }
                            }
                            {
                                ItemStack _ist = ((entity instanceof LivingEntity)
                                        ? ((LivingEntity) entity).getItemBySlot(EquipmentSlotType.LEGS)
                                        : ItemStack.EMPTY);
                                if (_ist.hurt(1, new Random(), null)) {
                                    _ist.shrink(1);
                                    _ist.setDamageValue(0);
                                }
                            }
                            {
                                ItemStack _ist = ((entity instanceof LivingEntity)
                                        ? ((LivingEntity) entity).getItemBySlot(EquipmentSlotType.FEET)
                                        : ItemStack.EMPTY);
                                if (_ist.hurt(1, new Random(), null)) {
                                    _ist.shrink(1);
                                    _ist.setDamageValue(0);
                                }
                            }
                            if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getOffhandItem() : ItemStack.EMPTY)
                                    .getItem() == itemstack.getItem()) {
                                ((LivingEntity) entity).swing(Hand.OFF_HAND, true);
                            } else {
                                ((LivingEntity) entity).swing(Hand.MAIN_HAND, true);
                            }
                            if (world instanceof World && !world.isClientSide()) {
                                ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(CookedPlayerFleshItem.block));
                                entityToSpawn.setPickUpDelay(10);
                                world.addFreshEntity(entityToSpawn);
                            }
                        }
                    } else {
                        if (entity.hurt(new DamageSource("suicide").bypassArmor().bypassMagic(), (float) 6)) {
                            {
                                ItemStack _ist = (entity instanceof LivingEntity) ? ((LivingEntity) entity).getOffhandItem() : ItemStack.EMPTY;
                                if (_ist.hurt(1, new Random(), null)) {
                                    _ist.shrink(1);
                                    _ist.setDamageValue(0);
                                }
                            }
                            {
                                ItemStack _ist = ((entity instanceof LivingEntity)
                                        ? ((LivingEntity) entity).getItemBySlot(EquipmentSlotType.HEAD)
                                        : ItemStack.EMPTY);
                                if (_ist.hurt(1, new Random(), null)) {
                                    _ist.shrink(1);
                                    _ist.setDamageValue(0);
                                }
                            }
                            {
                                ItemStack _ist = ((entity instanceof LivingEntity)
                                        ? ((LivingEntity) entity).getItemBySlot(EquipmentSlotType.CHEST)
                                        : ItemStack.EMPTY);
                                if (_ist.hurt(1, new Random(), null)) {
                                    _ist.shrink(1);
                                    _ist.setDamageValue(0);
                                }
                            }
                            {
                                ItemStack _ist = ((entity instanceof LivingEntity)
                                        ? ((LivingEntity) entity).getItemBySlot(EquipmentSlotType.LEGS)
                                        : ItemStack.EMPTY);
                                if (_ist.hurt(1, new Random(), null)) {
                                    _ist.shrink(1);
                                    _ist.setDamageValue(0);
                                }
                            }
                            {
                                ItemStack _ist = ((entity instanceof LivingEntity)
                                        ? ((LivingEntity) entity).getItemBySlot(EquipmentSlotType.FEET)
                                        : ItemStack.EMPTY);
                                if (_ist.hurt(1, new Random(), null)) {
                                    _ist.shrink(1);
                                    _ist.setDamageValue(0);
                                }
                            }
                            if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getOffhandItem() : ItemStack.EMPTY)
                                    .getItem() == itemstack.getItem()) {
                                ((LivingEntity) entity).swing(Hand.OFF_HAND, true);
                            } else {
                                ((LivingEntity) entity).swing(Hand.MAIN_HAND, true);
                            }
                            if (world instanceof World && !world.isClientSide()) {
                                ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(PlayerFleshItem.block));
                                entityToSpawn.setPickUpDelay(10);
                                world.addFreshEntity(entityToSpawn);
                            }
                        }
                    }
                    if (new Object() {
                        public boolean checkGamemode(Entity _ent) {
                            if (_ent instanceof ServerPlayerEntity) {
                                return ((ServerPlayerEntity) _ent).gameMode.getGameModeForPlayer() == GameType.CREATIVE;
                            } else if (_ent instanceof PlayerEntity && _ent.level.isClientSide()) {
                                NetworkPlayerInfo _npi = Minecraft.getInstance().getConnection()
                                        .getPlayerInfo(((AbstractClientPlayerEntity) _ent).getGameProfile().getId());
                                return _npi != null && _npi.getGameMode() == GameType.CREATIVE;
                            }
                            return false;
                        }
                    }.checkGamemode(entity)) {
                        if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getOffhandItem() : ItemStack.EMPTY).getItem() == itemstack
                                .getItem()) {
                            if (entity instanceof LivingEntity) {
                                ((LivingEntity) entity).swing(Hand.OFF_HAND, true);
                            }
                        } else {
                            if (entity instanceof LivingEntity) {
                                ((LivingEntity) entity).swing(Hand.MAIN_HAND, true);
                            }
                        }
                        if (world instanceof World && !world.isClientSide()) {
                            world.playSound(null, new BlockPos((int) x, (int) y, (int) z),
                                    ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.hurt")),
                                    SoundCategory.PLAYERS, (float) 0.8, (float) 1);
                        } else {
                            ((World) world).playLocalSound(x, y, z,
                                    ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.hurt")),
                                    SoundCategory.PLAYERS, (float) 0.8, (float) 1, false);
                        }
                        if (entity.isOnFire()) {
                            if (world instanceof World && !world.isClientSide()) {
                                ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(CookedPlayerFleshItem.block));
                                entityToSpawn.setPickUpDelay(10);
                                world.addFreshEntity(entityToSpawn);
                            }
                        } else {
                            if (world instanceof World && !world.isClientSide()) {
                                ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(PlayerFleshItem.block));
                                entityToSpawn.setPickUpDelay(10);
                                world.addFreshEntity(entityToSpawn);
                            }
                        }
                    }
                }
            }
        }
    }
}
