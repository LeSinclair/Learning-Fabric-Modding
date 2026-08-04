package org.lesinclair.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.Identifier;

import org.lesinclair.tutorialmod.block.ModBlocks;
import org.lesinclair.tutorialmod.creativemodetab.ModCreativeModTabs;
import org.lesinclair.tutorialmod.item.Moditems;
import org.lesinclair.tutorialmod.registries.ModFuels;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		ModCreativeModTabs.registerModCreativeModeTabs();
		Moditems.registerModItems();
		ModBlocks.registerModBlocks();
		ModFuels.registerFuels();
	}
	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
