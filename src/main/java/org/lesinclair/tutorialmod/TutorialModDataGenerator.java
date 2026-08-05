package org.lesinclair.tutorialmod;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import org.lesinclair.tutorialmod.datagen.*;


public class TutorialModDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		var pack = fabricDataGenerator.createPack();
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModBlocksTagsProvider::new);
		pack.addProvider(ModItemTagProvider::new);
		pack.addProvider(ModBlocksLootTableProvider::new);
		pack.addProvider(ModRecipeProvider::new);
		pack.addProvider(MobEquipmentAssetProvider::new);


	}
}
