package com.tyanns.asterola.item.armor;

import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.equipment.ArmorType;

import java.util.function.Consumer;

public class EmeraldBootsItem extends Item {
    public EmeraldBootsItem(Properties properties) {
        super(properties.humanoidArmor(ModArmorMaterials.EMERALD, ArmorType.BOOTS));
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
