package com.tyanns.asterola.datagen;

import com.tyanns.asterola.block.ModBlocks;
import com.tyanns.asterola.item.ModItems;
import com.tyanns.asterola.sound.ModSoundEvents;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class ModZhCnLangProvider extends FabricLanguageProvider {
    public ModZhCnLangProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(packOutput, "zh_cn", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider provider, TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItems.ROSE_GOLD_INGOT, "玫瑰金锭");
        translationBuilder.add(ModItems.ROSE_GOLDEN_SWORD,"玫瑰金剑");
        translationBuilder.add(ModItems.ROSE_GOLDEN_SHOVEL,"玫瑰金锹");
        translationBuilder.add(ModItems.ROSE_GOLDEN_PICKAXE,"玫瑰金镐");
        translationBuilder.add(ModItems.ROSE_GOLDEN_AXE,"玫瑰金斧");
        translationBuilder.add(ModItems.ROSE_GOLDEN_HOE,"玫瑰金锄");
        translationBuilder.add(ModItems.ROSE_GOLDEN_SPEAR,"玫瑰金矛");
        translationBuilder.add(ModItems.ROSE_GOLDEN_HELMET,"玫瑰金头盔");
        translationBuilder.add(ModItems.ROSE_GOLDEN_CHESTPLATE,"玫瑰金胸甲");
        translationBuilder.add(ModItems.ROSE_GOLDEN_LEGGINGS,"玫瑰金护腿");
        translationBuilder.add(ModItems.ROSE_GOLDEN_BOOTS,"玫瑰金靴子");
        translationBuilder.add(ModItems.ROSE_GOLDEN_APPLE, "玫瑰金苹果");
        translationBuilder.add(ModItems.EMERALD_SWORD,"绿宝石剑");
        translationBuilder.add(ModItems.EMERALD_SHOVEL,"绿宝石锹");
        translationBuilder.add(ModItems.EMERALD_PICKAXE,"绿宝石镐");
        translationBuilder.add(ModItems.EMERALD_AXE,"绿宝石斧");
        translationBuilder.add(ModItems.EMERALD_HOE,"绿宝石锄");
        translationBuilder.add(ModItems.EMERALD_SPEAR,"绿宝石矛");
        translationBuilder.add(ModItems.EMERALD_HELMET,"绿宝石头盔");
        translationBuilder.add(ModItems.EMERALD_CHESTPLATE,"绿宝石胸甲");
        translationBuilder.add(ModItems.EMERALD_LEGGINGS,"绿宝石护腿");
        translationBuilder.add(ModItems.EMERALD_BOOTS,"绿宝石靴子");
        translationBuilder.add(ModItems.MUSIC_DISC_YOU_ARE_BEAUTIFUL_VOMIT_VERSION, "音乐唱片");

        translationBuilder.add(ModBlocks.ROSE_GOLD_BLOCK, "玫瑰金块");

        translationBuilder.add("itemgroup.asterola", "星界");

        translationBuilder.add("trim_material.asterola.rose_gold", "玫瑰金质");

        translationBuilder.add("item.asterola.music_disc_you_are_beautiful_vomit_version.description", "Tiktok@justinjmooremusic - You Are Beautiful（呕吐版）");

        translationBuilder.add("armortip.asterola.rose_gold_armortip","§6§n[SHIFT]§r§r");
        translationBuilder.add("armortip.asterola.rose_gold_armortip.shift","§d当装备全套玫瑰金盔甲时，将会获得§r§d§n迅捷II§r§r§d的效果§r");
        translationBuilder.add("armortip.asterola.emerald_armortip","§6§n[SHIFT]§r§r");
        translationBuilder.add("armortip.asterola.emerald_armortip.shift","§2当装备全套绿宝石盔甲时，将会获得§r§2§n村庄英雄V§r§r§2的效果§r");
        translationBuilder.add("tooltip.asterola.emerald_tooltip","§6§n[SHIFT]§r§r");
        translationBuilder.add("tooltip.asterola.emerald_tooltip.shift_1","§2闪烁的财富之光让万物倍增§r");
        translationBuilder.add("tooltip.asterola.emerald_tooltip.shift_2","§2使当前的§r§2§n时运§r§r§2与§r§2§n抢夺§r§r§2等级提升1级§r");

        translationBuilder.add("jukebox_song.asterola.you_are_beautiful_vomit_version", "Tiktok@justinjmooremusic - You Are Beautiful（呕吐版）");

        translationBuilder.add("subtitles.item.armor.equip_rose_gold","玫瑰金盔甲：叮当");
        translationBuilder.add("subtitles.item.armor.equip_emerald","绿宝石盔甲：铿锵");
    }
}
