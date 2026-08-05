package org.lesinclair.tutorialmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;

import org.lesinclair.tutorialmod.block.ModBlocks;
import org.lesinclair.tutorialmod.tags.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModBlocksTagsProvider extends FabricTagsProvider.BlockTagsProvider {


     public ModBlocksTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        valueLookupBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.RUBY_BLOCK)
                .add(ModBlocks.DIAMOND_SLAB)
                .add(ModBlocks.RUBY_SLAB)
                .add(ModBlocks.RUBY_STAIRS)
                .add(ModBlocks.DIAMOND_STAIRS)
                .add(ModBlocks.RUBY_WALL);
        valueLookupBuilder(BlockTags.WALLS)
                .add(ModBlocks.RUBY_WALL);

        valueLookupBuilder(ModTags.Blocks.NEEDS_RUBY_TOOL)
                .add(ModBlocks.RUBY_BLOCK)
                .addTag(BlockTags.NEEDS_IRON_TOOL);

        valueLookupBuilder(ModTags.Blocks.INCORRECT_FOR_RUBY_TOOL)
                // Pass the TagKey directly into addOptionalTag
                .addOptionalTag(BlockTags.NEEDS_DIAMOND_TOOL);


    }
}
