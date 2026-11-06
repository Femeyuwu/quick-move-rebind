package com.example.mixin;

import com.example.Quickmove;
import com.example.mixin.accessor.KeyMappingAccessor;
import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.input.InputWithModifiers;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(InputWithModifiers.class)
public interface InputWithModifiersMixin {

	@Inject(at = @At("HEAD"), method = "hasShiftDown()Z", cancellable = true)
	default void hasShiftDown(CallbackInfoReturnable<Boolean> cir) {
		InputConstants.Key boundKey = ((KeyMappingAccessor) Quickmove.customKey).getKey();
		boolean ret = InputConstants.isKeyDown(boundKey.getValue());

		cir.setReturnValue(ret);
	}
}