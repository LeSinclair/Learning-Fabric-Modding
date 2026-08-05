package org.lesinclair.tutorialmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.ItemTags;
import org.lesinclair.tutorialmod.item.Moditems;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagsProvider.ItemTagsProvider {

    public ModItemTagProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        valueLookupBuilder(ItemTags.SWORDS).add(Moditems.RUBY_SWORD);
        valueLookupBuilder(ItemTags.SPEARS).add(Moditems.RUBY_SPEAR);
        valueLookupBuilder(ItemTags.PICKAXES).add(Moditems.RUBY_PICKAXE);
        valueLookupBuilder(ItemTags.AXES).add(Moditems.RUBY_AXE);
        valueLookupBuilder(ItemTags.SHOVELS).add(Moditems.RUBY_SHOVEL);
        valueLookupBuilder(ItemTags.HOES).add(Moditems.RUBY_HOE);

        valueLookupBuilder(ItemTags.HEAD_ARMOR).add(Moditems.RUBY_HELMET);
        valueLookupBuilder(ItemTags.CHEST_ARMOR).add(Moditems.RUBY_CHESTPLATE);
        valueLookupBuilder(ItemTags.LEG_ARMOR).add(Moditems.RUBY_LEGGINGS);
        valueLookupBuilder(ItemTags.FOOT_ARMOR).add(Moditems.RUBY_BOOTS);
    }
}
