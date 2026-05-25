package com.tyanns.asterola.item.tool;

import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;

import java.util.function.Consumer;

public class EmeraldShovelItem extends ShovelItem {
    public EmeraldShovelItem(Properties properties) {
        super(ModToolMaterials.EMERALD, 1.5F, -3.0F, properties);
    }

    @Override
    public void appendHoverText(final ItemStack itemStack, final Item.TooltipContext context, final TooltipDisplay display, final Consumer<Component> builder, final TooltipFlag tooltipFlag) {
        if (Minecraft.getInstance().hasShiftDown()) {
            builder.accept(Component.translatable("tooltip.asterola.emerald_tooltip.shift_1"));
            builder.accept(Component.translatable("tooltip.asterola.emerald_tooltip.shift_2"));
        } else {
            builder.accept(Component.translatable("tooltip.asterola.emerald_tooltip"));
        }
    }
}
