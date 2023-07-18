package com.jahirtrap.foodtxf.procedures;

import com.jahirtrap.foodtxf.init.FoodtxfModConfig;
import net.minecraft.nbt.ListTag;
import net.minecraft.nbt.StringTag;
import net.minecraft.world.item.Items;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;

import com.jahirtrap.foodtxf.init.FoodtxfModItems;

import javax.annotation.Nullable;

import java.util.Random;

@Mod.EventBusSubscriber
public class PlayerDropsFleshProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (FoodtxfModConfig.ENABLE_CANNIBALISM.get()) {
			if (event != null && event.getEntity() != null) {
				execute(event, event.getEntity().level, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
			}
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player) {
			Random random = new Random();
			if (world instanceof Level _level && !_level.isClientSide()) {
				if (entity.isOnFire()) {
					ItemStack itemStack = new ItemStack(FoodtxfModItems.COOKED_PLAYER_FLESH.get(), random.ints(1, 3 + 1).findFirst().getAsInt());
					CompoundTag compoundTag = itemStack.getOrCreateTag();
					ListTag loreTag = new ListTag();

					loreTag.add(StringTag.valueOf("{\"text\":\"" + entity.getName().getString() + "\",\"color\":\"red\",\"italic\":false}"));

					compoundTag.put("display", new CompoundTag());
					compoundTag.getCompound("display").put("Lore", loreTag);

					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemStack);
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				} else {
					ItemStack itemStack = new ItemStack(FoodtxfModItems.PLAYER_FLESH.get(), random.ints(1, 3 + 1).findFirst().getAsInt());
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
