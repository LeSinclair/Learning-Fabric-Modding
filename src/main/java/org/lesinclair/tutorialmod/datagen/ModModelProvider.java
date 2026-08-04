package org.lesinclair.tutorialmod.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplate;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.world.level.block.Blocks;
import org.lesinclair.tutorialmod.block.ModBlocks;
import org.lesinclair.tutorialmod.item.Moditems;

public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {
        blockModelGenerators.createTrivialCube(ModBlocks.DORITO_BLOCK);
        blockModelGenerators.family(Blocks.DIAMOND_BLOCK).slab(ModBlocks.DIAMOND_SLAB).stairs(ModBlocks.DIAMOND_STAIRS);
        blockModelGenerators.family(ModBlocks.RUBY_BLOCK).slab(ModBlocks.RUBY_SLAB).stairs(ModBlocks.RUBY_STAIRS).button(ModBlocks.RUBY_BUTTON).wall(ModBlocks.RUBY_WALL);



    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(Moditems.RUBY, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(Moditems.DORITOS, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(Moditems.REFINER, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(Moditems.MIDAS, ModelTemplates.FLAT_ITEM);

    }
}
