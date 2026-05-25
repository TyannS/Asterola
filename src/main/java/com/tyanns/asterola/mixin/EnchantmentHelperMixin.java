package com.tyanns.asterola.mixin;

import com.tyanns.asterola.tag.ModItemTags;
import net.minecraft.core.Holder;
import net.minecraft.world.item.ItemInstance;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(EnchantmentHelper.class)
public class EnchantmentHelperMixin {
    @Inject(
            method = "getItemEnchantmentLevel",
            at = @At("RETURN"),
            cancellable = true
    )
    private static void asterola$EmeraldToolBonus(
            Holder<Enchantment> enchantment,
            ItemInstance piece,
            CallbackInfoReturnable<Integer> cir
    ) {
        if (piece == null) return;
        if (piece.is(ModItemTags.EMERALD_TOOL)) {
            enchantment.unwrapKey().ifPresent(key -> {
                        if (key == Enchantments.FORTUNE || key == Enchantments.LOOTING) {
                            cir.setReturnValue(cir.getReturnValueI() + 1);
                        }
                    }
            );
        }
    }
}
