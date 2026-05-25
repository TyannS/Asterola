package com.tyanns.asterola.item.trim;

import com.tyanns.asterola.item.armor.ModEquipmentAssets;
import net.minecraft.world.item.equipment.trim.MaterialAssetGroup;

import java.util.Map;

public class ModMaterialAssetGroup {
    public static final MaterialAssetGroup ROSE_GOLD = MaterialAssetGroup.create("rose_gold", Map.of(ModEquipmentAssets.ROSE_GOLD, "rose_gold_darker"));
    public static final MaterialAssetGroup EMERALD = MaterialAssetGroup.create("emerald", Map.of(ModEquipmentAssets.EMERALD, "emerald_darker"));
}
