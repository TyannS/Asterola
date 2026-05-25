package com.tyanns.asterola.item.tool;

import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;

import java.util.function.Consumer;

public class EmeraldSpearItem extends Item {
    public EmeraldSpearItem(Properties properties) {
        super(properties.spear(ModToolMaterials.EMERALD,
                1.0F,
                1.075F,
                0.5F,
                3.0F,
                10.0F,
                6.5F,
                5.1F,
                10.0F,
                4.6F)
        );
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
