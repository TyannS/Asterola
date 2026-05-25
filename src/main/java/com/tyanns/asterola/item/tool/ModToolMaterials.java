package com.tyanns.asterola.item.tool;

import com.tyanns.asterola.tag.ModItemTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.ToolMaterial;

public class ModToolMaterials {
    public static final ToolMaterial ROSE_GOLD = new ToolMaterial(
            BlockTags.INCORRECT_FOR_IRON_TOOL,
            175,
            15.0F,
            2.0F,
            28,
            ModItemTags.ROSE_GOLD_TOOL_MATERIALS
    );

    public static final ToolMaterial EMERALD = new ToolMaterial(
            BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
            1200,
            8.0F,
            3.0F,
            15,
            ModItemTags.EMERALD_TOOL_MATERIALS
    );
}
