package org.lesinclair.tutorialmod.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.world.level.block.Blocks;
import org.lesinclair.tutorialmod.block.ModBlocks;
import org.lesinclair.tutorialmod.item.ModArmorMaterials;
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
        itemModelGenerators.generateFlatItem(Moditems.RUBY_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(Moditems.RUBY_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(Moditems.RUBY_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(Moditems.RUBY_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(Moditems.RUBY_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateSpear(Moditems.RUBY_SPEAR);

        itemModelGenerators.generateTrimmableItem(Moditems.RUBY_HELMET, ModArmorMaterials.RUBY_KEY, ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModelGenerators.generateTrimmableItem(Moditems.RUBY_CHESTPLATE, ModArmorMaterials.RUBY_KEY, ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
        itemModelGenerators.generateTrimmableItem(Moditems.RUBY_LEGGINGS, ModArmorMaterials.RUBY_KEY, ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
        itemModelGenerators.generateTrimmableItem(Moditems.RUBY_BOOTS, ModArmorMaterials.RUBY_KEY, ItemModelGenerators.TRIM_PREFIX_BOOTS, false);

    }
}
