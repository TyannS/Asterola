package com.tyanns.asterola.item.armor;

import com.google.common.collect.Maps;
import com.tyanns.asterola.sound.ModSoundEvents;
import com.tyanns.asterola.tag.ModItemTags;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;

import java.util.Map;

public interface ModArmorMaterials {
    ArmorMaterial ROSE_GOLD = new ArmorMaterial(
            13,
            makeDefense(2, 5, 6, 2, 5),
            30, ModSoundEvents.ARMOR_EQUIP_ROSE_GOLD,
            0.0F,
            0.0F,
            ModItemTags.REPAIRS_ROSE_GOLD_ARMOR,
            ModEquipmentAssets.ROSE_GOLD
    );

    ArmorMaterial EMERALD = new ArmorMaterial(
            30,
            makeDefense(3, 6, 8, 3, 10),
            20, ModSoundEvents.ARMOR_EQUIP_EMERALD,
            2.0F,
            0.0F,
            ModItemTags.REPAIRS_EMERALD_ARMOR,
            ModEquipmentAssets.EMERALD
    );

    static Map<ArmorType, Integer> makeDefense(final int boots, final int legs, final int chest, final int helm, final int body) {
        return Maps.newEnumMap(Map.of(ArmorType.BOOTS, boots, ArmorType.LEGGINGS, legs, ArmorType.CHESTPLATE, chest, ArmorType.HELMET, helm, ArmorType.BODY, body));
    }
}
