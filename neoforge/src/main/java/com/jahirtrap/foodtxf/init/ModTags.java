package com.jahirtrap.foodtxf.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModTags {
    public interface Items {
        TagKey<Item> STEEL_INGOTS = create(Identifier.parse("c:ingots/steel"));
        TagKey<Item> BRONZE_INGOTS = create(Identifier.parse("c:ingots/bronze"));
        TagKey<Item> ZURITE_INGOTS = create(Identifier.parse("c:ingots/zurite"));
        TagKey<Item> ENDERITE_INGOTS = create(Identifier.parse("c:ingots/enderite"));

        private static TagKey<Item> create(Identifier name) {
            return TagKey.create(Registries.ITEM, name);
        }
    }
}
