package com.jahirtrap.foodtxf.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModTags {
    public interface Items {
        TagKey<Item> STEEL_INGOTS = create(new ResourceLocation("c:ingots/steel"));
        TagKey<Item> BRONZE_INGOTS = create(new ResourceLocation("c:ingots/bronze"));
        TagKey<Item> ZURITE_INGOTS = create(new ResourceLocation("c:ingots/zurite"));
        TagKey<Item> ENDERITE_INGOTS = create(new ResourceLocation("c:ingots/enderite"));

        private static TagKey<Item> create(ResourceLocation name) {
            return TagKey.create(Registries.ITEM, name);
        }
    }
}
