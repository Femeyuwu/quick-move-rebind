package com.example;

import com.mojang.blaze3d.platform.InputConstants;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.client.keymapping.v1.KeyMappingHelper;
import net.minecraft.client.KeyMapping;
import net.minecraft.resources.Identifier;

public class Quickmove implements ModInitializer {
	public static final String MOD_ID = "quick_move";

	public static KeyMapping customKey;

	@Override
	public void onInitialize() {
		customKey = KeyMappingHelper.registerKeyMapping(new KeyMapping(
				"Quick Move Keybind",
				InputConstants.Type.KEYBOARD,
				InputConstants.KEY_LSHIFT,
				new KeyMapping.Category(id("quick_move"))
		));
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
