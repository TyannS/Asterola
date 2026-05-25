package com.tyanns.asterola.datagen;

import com.tyanns.asterola.block.ModBlocks;
import com.tyanns.asterola.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class ModEnUsLangProvider extends FabricLanguageProvider {
    public ModEnUsLangProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(packOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider provider, TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItems.ROSE_GOLD_INGOT, "Rose Gold Ingot");
        translationBuilder.add(ModItems.ROSE_GOLDEN_SWORD,"Rose Golden Sword");
        translationBuilder.add(ModItems.ROSE_GOLDEN_SHOVEL,"Rose Golden Shovel");
        translationBuilder.add(ModItems.ROSE_GOLDEN_PICKAXE,"Rose Golden Pickaxe");
        translationBuilder.add(ModItems.ROSE_GOLDEN_AXE,"Rose Golden Axe");
        translationBuilder.add(ModItems.ROSE_GOLDEN_HOE,"Rose Golden Hoe");
        translationBuilder.add(ModItems.ROSE_GOLDEN_SPEAR,"Rose Golden Spear");
        translationBuilder.add(ModItems.ROSE_GOLDEN_HELMET,"Rose Golden Helmet");
        translationBuilder.add(ModItems.ROSE_GOLDEN_CHESTPLATE,"Rose Golden Chestplate");
        translationBuilder.add(ModItems.ROSE_GOLDEN_LEGGINGS,"Rose Golden Leggings");
        translationBuilder.add(ModItems.ROSE_GOLDEN_BOOTS,"Rose Golden Boots");
        translationBuilder.add(ModItems.ROSE_GOLDEN_APPLE, "Rose Golden Apple");
        translationBuilder.add(ModItems.EMERALD_SWORD,"Emerald Sword");
        translationBuilder.add(ModItems.EMERALD_SHOVEL,"Emerald Shovel");
        translationBuilder.add(ModItems.EMERALD_PICKAXE,"Emerald Pickaxe");
        translationBuilder.add(ModItems.EMERALD_AXE,"Emerald Axe");
        translationBuilder.add(ModItems.EMERALD_HOE,"Emerald Hoe");
        translationBuilder.add(ModItems.EMERALD_SPEAR,"Emerald Spear");
        translationBuilder.add(ModItems.EMERALD_HELMET,"Emerald Helmet");
        translationBuilder.add(ModItems.EMERALD_CHESTPLATE,"Emerald Chestplate");
        translationBuilder.add(ModItems.EMERALD_LEGGINGS,"Emerald Leggings");
        translationBuilder.add(ModItems.EMERALD_BOOTS,"Emerald Boots");

        translationBuilder.add(ModBlocks.ROSE_GOLD_BLOCK, "Rose Gold Block");

        translationBuilder.add("itemgroup.asterola", "Asterola");

        translationBuilder.add("trim_material.asterola.rose_gold", "Rose Gold Material");

        translationBuilder.add("item.asterola.music_disc_you_are_beautiful_vomit_version", "Music Disc");
        translationBuilder.add("item.asterola.music_disc_you_are_beautiful_vomit_version.decs", "Tiktok@justinjmooremusic - You Are Beautiful (Vomit Version)");

        translationBuilder.add("armortip.asterola.rose_gold_armortip","§6§n[SHIFT]§r§r");
        translationBuilder.add("armortip.asterola.rose_gold_armortip.shift","§dGrants §r§d§nSpeed II§r§r§d when wearing a full set of Rose Gold Armor§r");
        translationBuilder.add("armortip.asterola.emerald_armortip","§6§n[SHIFT]§r§r");
        translationBuilder.add("armortip.asterola.emerald_armortip.shift","§2Grants §r§2§nHero of the Village V§r§r§2 when wearing a full set of Emerald Armor§r");
        translationBuilder.add("tooltip.asterola.emerald_tooltip_1","§2The glittering light of wealth multiplies all things§r");
        translationBuilder.add("tooltip.asterola.emerald_tooltip_2","§2Increases current §r§2§nFortune§r§r§2 and §r§2§nLooting§r§r§2 by 1 level§r");

        translationBuilder.add("jukebox_song.asterola.you_are_beautiful_vomit_version", "Tiktok@justinjmooremusic - You Are Beautiful (Vomit Version)");

        translationBuilder.add("subtitles.item.armor.equip_rose_gold","Rose gold armor clinks");
        translationBuilder.add("subtitles.item.armor.equip_emerald","Emerald armor clanks");
    }
}
