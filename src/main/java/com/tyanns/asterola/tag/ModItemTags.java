package com.tyanns.asterola.tag;

import com.tyanns.asterola.Asterola;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModItemTags {
    public static final TagKey<Item> ROSE_GOLD_TOOL_MATERIALS = bind("rose_gold_tool_materials");
    public static final TagKey<Item> REPAIRS_ROSE_GOLD_ARMOR = bind("repairs_rose_gold_armor");
    public static final TagKey<Item> ROSE_GOLD_ARMOR = bind("rose_gold_armor");
    public static final TagKey<Item> ROSE_GOLD_TOOL = bind("rose_gold_tool");
    public static final TagKey<Item> EMERALD_TOOL_MATERIALS = bind("emerald_tool_materials");
    public static final TagKey<Item> REPAIRS_EMERALD_ARMOR = bind("repairs_emerald_armor");
    public static final TagKey<Item> EMERALD_ARMOR = bind("emerald_armor");
    public static final TagKey<Item> EMERALD_TOOL = bind("emerald_tool");

    private static TagKey<Item> bind(final String name) {
        return TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Asterola.MOD_ID, name));
    }
}
