package org.lesinclair.tutorialmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.minecraft.core.HolderLookup;
import org.lesinclair.tutorialmod.block.ModBlocks;
import org.lesinclair.tutorialmod.item.Moditems;

import java.util.concurrent.CompletableFuture;

public class ModBlocksLootTableProvider extends FabricBlockLootSubProvider {

    public ModBlocksLootTableProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(packOutput, registriesFuture);
    }

    @Override
    public void generate() {
        dropSelf(ModBlocks.DORITO_BLOCK);
        dropSelf(ModBlocks.RUBY_BLOCK);
        add(ModBlocks.DIAMOND_SLAB, this::createSlabItemTable);
        add(ModBlocks.RUBY_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.RUBY_BUTTON);
        dropSelf(ModBlocks.RUBY_STAIRS);
        dropSelf(ModBlocks.DIAMOND_STAIRS);
        dropSelf(ModBlocks.RUBY_WALL);
    }
}
