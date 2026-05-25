package com.tyanns.asterola.item.armor;

import com.tyanns.asterola.tag.ModItemTags;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.equipment.ArmorType;
import org.jspecify.annotations.Nullable;

import java.util.function.Consumer;

public class EmeraldHelmetItem extends Item {
    public boolean hasFullArmor(Player player) {
        return player.getItemBySlot(EquipmentSlot.HEAD).is(ModItemTags.EMERALD_ARMOR)
                && player.getItemBySlot(EquipmentSlot.CHEST).is(ModItemTags.EMERALD_ARMOR)
                && player.getItemBySlot(EquipmentSlot.LEGS).is(ModItemTags.EMERALD_ARMOR)
                && player.getItemBySlot(EquipmentSlot.FEET).is(ModItemTags.EMERALD_ARMOR);
    }

    public EmeraldHelmetItem(Properties properties) {
        super(properties.humanoidArmor(ModArmorMaterials.EMERALD, ArmorType.HELMET));
    }

    @Override
    public void inventoryTick(final ItemStack itemStack, final ServerLevel level, final Entity owner, @Nullable final EquipmentSlot slot) {
        if (!(owner instanceof Player player)) return;
        if (hasFullArmor(player))
            player.addEffect(new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 1, 4));
    }

    @Override
    public void appendHoverText(final ItemStack itemStack, final Item.TooltipContext context, final TooltipDisplay display, final Consumer<Component> builder, final TooltipFlag tooltipFlag) {
        if (Minecraft.getInstance().hasShiftDown()) {
            builder.accept(Component.translatable("armortip.asterola.emerald_armortip.shift"));
        } else {
            builder.accept(Component.translatable("armortip.asterola.emerald_armortip"));
        }
    }
}
