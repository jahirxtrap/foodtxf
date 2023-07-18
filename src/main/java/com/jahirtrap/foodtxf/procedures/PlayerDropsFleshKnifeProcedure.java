package com.jahirtrap.foodtxf.procedures;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.nbt.StringTag;
import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import com.jahirtrap.foodtxf.init.FoodtxfModItems;

import java.util.Random;

public class PlayerDropsFleshKnifeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == itemstack.getItem()
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == (ItemStack.EMPTY).getItem()
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)
						.getItem() != (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
			if (entity.isShiftKeyDown()) {
				if (entity instanceof Player _entity) {
					if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == itemstack.getItem()) {
						int fa_level = EnchantmentHelper.getItemEnchantmentLevel(Enchantments.FIRE_ASPECT,
								(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY));
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
						if (_entity.hurt(new DamageSource("suicide").bypassArmor().bypassMagic(), 6)) {
							{
								ItemStack _ist = itemstack;
								if (_ist.hurt(1, new Random(), null)) {
									_ist.shrink(1);
									_ist.setDamageValue(0);
								}
							}
							{
								ItemStack _ist = (entity instanceof LivingEntity _entGetArmor
										? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD)
										: ItemStack.EMPTY);
								if (_ist.hurt(1, new Random(), null)) {
									_ist.shrink(1);
									_ist.setDamageValue(0);
								}
							}
							{
								ItemStack _ist = (entity instanceof LivingEntity _entGetArmor
										? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST)
										: ItemStack.EMPTY);
								if (_ist.hurt(1, new Random(), null)) {
									_ist.shrink(1);
									_ist.setDamageValue(0);
								}
							}
							{
								ItemStack _ist = (entity instanceof LivingEntity _entGetArmor
										? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS)
										: ItemStack.EMPTY);
								if (_ist.hurt(1, new Random(), null)) {
									_ist.shrink(1);
									_ist.setDamageValue(0);
								}
							}
							{
								ItemStack _ist = (entity instanceof LivingEntity _entGetArmor
										? _entGetArmor.getItemBySlot(EquipmentSlot.FEET)
										: ItemStack.EMPTY);
								if (_ist.hurt(1, new Random(), null)) {
									_ist.shrink(1);
									_ist.setDamageValue(0);
								}
							}
							if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == itemstack
									.getItem()) {
								_entity.swing(InteractionHand.MAIN_HAND, true);
							} else {
								_entity.swing(InteractionHand.OFF_HAND, true);
							}
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemStack itemStack = new ItemStack(FoodtxfModItems.COOKED_PLAYER_FLESH.get());
								CompoundTag compoundTag = itemStack.getOrCreateTag();
								ListTag loreTag = new ListTag();

								loreTag.add(StringTag.valueOf("{\"text\":\"" + entity.getName().getString() + "\",\"color\":\"red\",\"italic\":false}"));

								compoundTag.put("display", new CompoundTag());
								compoundTag.getCompound("display").put("Lore", loreTag);

								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemStack);
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else {
						if (_entity.hurt(new DamageSource("suicide").bypassArmor().bypassMagic(), 6)) {
							{
								ItemStack _ist = itemstack;
								if (_ist.hurt(1, new Random(), null)) {
									_ist.shrink(1);
									_ist.setDamageValue(0);
								}
							}
							{
								ItemStack _ist = (entity instanceof LivingEntity _entGetArmor
										? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD)
										: ItemStack.EMPTY);
								if (_ist.hurt(1, new Random(), null)) {
									_ist.shrink(1);
									_ist.setDamageValue(0);
								}
							}
							{
								ItemStack _ist = (entity instanceof LivingEntity _entGetArmor
										? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST)
										: ItemStack.EMPTY);
								if (_ist.hurt(1, new Random(), null)) {
									_ist.shrink(1);
									_ist.setDamageValue(0);
								}
							}
							{
								ItemStack _ist = (entity instanceof LivingEntity _entGetArmor
										? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS)
										: ItemStack.EMPTY);
								if (_ist.hurt(1, new Random(), null)) {
									_ist.shrink(1);
									_ist.setDamageValue(0);
								}
							}
							{
								ItemStack _ist = (entity instanceof LivingEntity _entGetArmor
										? _entGetArmor.getItemBySlot(EquipmentSlot.FEET)
										: ItemStack.EMPTY);
								if (_ist.hurt(1, new Random(), null)) {
									_ist.shrink(1);
									_ist.setDamageValue(0);
								}
							}
							if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == itemstack
									.getItem()) {
								_entity.swing(InteractionHand.MAIN_HAND, true);
							} else {
								_entity.swing(InteractionHand.OFF_HAND, true);
							}
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemStack itemStack = new ItemStack(FoodtxfModItems.PLAYER_FLESH.get());
								CompoundTag compoundTag = itemStack.getOrCreateTag();
								ListTag loreTag = new ListTag();

								loreTag.add(StringTag.valueOf("{\"text\":\"" + entity.getName().getString() + "\",\"color\":\"red\",\"italic\":false}"));

								compoundTag.put("display", new CompoundTag());
								compoundTag.getCompound("display").put("Lore", loreTag);

								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemStack);
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
					if (new Object() {
						public boolean checkGamemode(Entity _ent) {
							if (_ent instanceof ServerPlayer _serverPlayer) {
								return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
							} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
								return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
										&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId())
												.getGameMode() == GameType.CREATIVE;
							}
							return false;
						}
					}.checkGamemode(entity)) {
						if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == itemstack.getItem()) {
							_entity.swing(InteractionHand.MAIN_HAND, true);
						} else {
							_entity.swing(InteractionHand.OFF_HAND, true);
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, new BlockPos((int) x, (int) y, (int) z),
										ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.hurt")), SoundSource.PLAYERS,
										(float) 0.8, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.hurt")),
										SoundSource.PLAYERS, (float) 0.8, 1, false);
							}
						}
						if (entity.isOnFire()) {
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemStack itemStack = new ItemStack(FoodtxfModItems.COOKED_PLAYER_FLESH.get());
								CompoundTag compoundTag = itemStack.getOrCreateTag();
								ListTag loreTag = new ListTag();

								loreTag.add(StringTag.valueOf("{\"text\":\"" + entity.getName().getString() + "\",\"color\":\"red\",\"italic\":false}"));

								compoundTag.put("display", new CompoundTag());
								compoundTag.getCompound("display").put("Lore", loreTag);

								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemStack);
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						} else {
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemStack itemStack = new ItemStack(FoodtxfModItems.PLAYER_FLESH.get());
								CompoundTag compoundTag = itemStack.getOrCreateTag();
								ListTag loreTag = new ListTag();

								loreTag.add(StringTag.valueOf("{\"text\":\"" + entity.getName().getString() + "\",\"color\":\"red\",\"italic\":false}"));

								compoundTag.put("display", new CompoundTag());
								compoundTag.getCompound("display").put("Lore", loreTag);

								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemStack);
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				}
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == itemstack.getItem()) {
			if (entity.isShiftKeyDown()) {
				if (entity instanceof Player _entity) {
					if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == itemstack.getItem()) {
						int fa_level = EnchantmentHelper.getItemEnchantmentLevel(Enchantments.FIRE_ASPECT,
								(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
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
						if (_entity.hurt(new DamageSource("suicide").bypassArmor().bypassMagic(), 6)) {
							{
								ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
								if (_ist.hurt(1, new Random(), null)) {
									_ist.shrink(1);
									_ist.setDamageValue(0);
								}
							}
							{
								ItemStack _ist = (entity instanceof LivingEntity _entGetArmor
										? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD)
										: ItemStack.EMPTY);
								if (_ist.hurt(1, new Random(), null)) {
									_ist.shrink(1);
									_ist.setDamageValue(0);
								}
							}
							{
								ItemStack _ist = (entity instanceof LivingEntity _entGetArmor
										? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST)
										: ItemStack.EMPTY);
								if (_ist.hurt(1, new Random(), null)) {
									_ist.shrink(1);
									_ist.setDamageValue(0);
								}
							}
							{
								ItemStack _ist = (entity instanceof LivingEntity _entGetArmor
										? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS)
										: ItemStack.EMPTY);
								if (_ist.hurt(1, new Random(), null)) {
									_ist.shrink(1);
									_ist.setDamageValue(0);
								}
							}
							{
								ItemStack _ist = (entity instanceof LivingEntity _entGetArmor
										? _entGetArmor.getItemBySlot(EquipmentSlot.FEET)
										: ItemStack.EMPTY);
								if (_ist.hurt(1, new Random(), null)) {
									_ist.shrink(1);
									_ist.setDamageValue(0);
								}
							}
							if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == itemstack
									.getItem()) {
								_entity.swing(InteractionHand.OFF_HAND, true);
							} else {
								_entity.swing(InteractionHand.MAIN_HAND, true);
							}
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemStack itemStack = new ItemStack(FoodtxfModItems.COOKED_PLAYER_FLESH.get());
								CompoundTag compoundTag = itemStack.getOrCreateTag();
								ListTag loreTag = new ListTag();

								loreTag.add(StringTag.valueOf("{\"text\":\"" + entity.getName().getString() + "\",\"color\":\"red\",\"italic\":false}"));

								compoundTag.put("display", new CompoundTag());
								compoundTag.getCompound("display").put("Lore", loreTag);

								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemStack);
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else {
						if (_entity.hurt(new DamageSource("suicide").bypassArmor().bypassMagic(), 6)) {
							{
								ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
								if (_ist.hurt(1, new Random(), null)) {
									_ist.shrink(1);
									_ist.setDamageValue(0);
								}
							}
							{
								ItemStack _ist = (entity instanceof LivingEntity _entGetArmor
										? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD)
										: ItemStack.EMPTY);
								if (_ist.hurt(1, new Random(), null)) {
									_ist.shrink(1);
									_ist.setDamageValue(0);
								}
							}
							{
								ItemStack _ist = (entity instanceof LivingEntity _entGetArmor
										? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST)
										: ItemStack.EMPTY);
								if (_ist.hurt(1, new Random(), null)) {
									_ist.shrink(1);
									_ist.setDamageValue(0);
								}
							}
							{
								ItemStack _ist = (entity instanceof LivingEntity _entGetArmor
										? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS)
										: ItemStack.EMPTY);
								if (_ist.hurt(1, new Random(), null)) {
									_ist.shrink(1);
									_ist.setDamageValue(0);
								}
							}
							{
								ItemStack _ist = (entity instanceof LivingEntity _entGetArmor
										? _entGetArmor.getItemBySlot(EquipmentSlot.FEET)
										: ItemStack.EMPTY);
								if (_ist.hurt(1, new Random(), null)) {
									_ist.shrink(1);
									_ist.setDamageValue(0);
								}
							}
							if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == itemstack
									.getItem()) {
								_entity.swing(InteractionHand.OFF_HAND, true);
							} else {
								_entity.swing(InteractionHand.MAIN_HAND, true);
							}
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemStack itemStack = new ItemStack(FoodtxfModItems.PLAYER_FLESH.get());
								CompoundTag compoundTag = itemStack.getOrCreateTag();
								ListTag loreTag = new ListTag();

								loreTag.add(StringTag.valueOf("{\"text\":\"" + entity.getName().getString() + "\",\"color\":\"red\",\"italic\":false}"));

								compoundTag.put("display", new CompoundTag());
								compoundTag.getCompound("display").put("Lore", loreTag);

								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemStack);
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
					if (new Object() {
						public boolean checkGamemode(Entity _ent) {
							if (_ent instanceof ServerPlayer _serverPlayer) {
								return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
							} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
								return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
										&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId())
												.getGameMode() == GameType.CREATIVE;
							}
							return false;
						}
					}.checkGamemode(entity)) {
						if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == itemstack.getItem()) {
							_entity.swing(InteractionHand.OFF_HAND, true);
						} else {
							_entity.swing(InteractionHand.MAIN_HAND, true);
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, new BlockPos((int) x, (int) y, (int) z),
										ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.hurt")), SoundSource.PLAYERS,
										(float) 0.8, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.hurt")),
										SoundSource.PLAYERS, (float) 0.8, 1, false);
							}
						}
						if (entity.isOnFire()) {
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemStack itemStack = new ItemStack(FoodtxfModItems.COOKED_PLAYER_FLESH.get());
								CompoundTag compoundTag = itemStack.getOrCreateTag();
								ListTag loreTag = new ListTag();

								loreTag.add(StringTag.valueOf("{\"text\":\"" + entity.getName().getString() + "\",\"color\":\"red\",\"italic\":false}"));

								compoundTag.put("display", new CompoundTag());
								compoundTag.getCompound("display").put("Lore", loreTag);

								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemStack);
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						} else {
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemStack itemStack = new ItemStack(FoodtxfModItems.PLAYER_FLESH.get());
								CompoundTag compoundTag = itemStack.getOrCreateTag();
								ListTag loreTag = new ListTag();

								loreTag.add(StringTag.valueOf("{\"text\":\"" + entity.getName().getString() + "\",\"color\":\"red\",\"italic\":false}"));

								compoundTag.put("display", new CompoundTag());
								compoundTag.getCompound("display").put("Lore", loreTag);

								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemStack);
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				}
			}
		}
	}
}
