package com.example.mixin.accessor;

import com.mojang.blaze3d.platform.InputConstants;
import org.spongepowered.asm.mixin.gen.Accessor;

@org.spongepowered.asm.mixin.Mixin(net.minecraft.client.KeyMapping.class)
public interface KeyMappingAccessor {
    @Accessor
    InputConstants.Key getKey();
}
