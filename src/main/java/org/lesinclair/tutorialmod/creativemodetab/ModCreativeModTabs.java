package org.lesinclair.tutorialmod.creativemodetab;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import org.lesinclair.tutorialmod.TutorialMod;
import org.lesinclair.tutorialmod.block.ModBlocks;
import org.lesinclair.tutorialmod.item.Moditems;
import org.lesinclair.tutorialmod.item.custom.Refiner;


public class  ModCreativeModTabs {

    public static final CreativeModeTab TUTORIAL_ITEM_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID, "tutorialitems"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(Items.DIAMOND))
                    .title(Component.translatable("creativemodetab.tutorialmod.tutorialitems"))
                    .displayItems((parameters, output) -> {
                        output.accept(Moditems.RUBY);
                        output.accept(ModBlocks.DORITO_BLOCK);
                        output.accept(Moditems.DORITOS);
                        output.accept(ModBlocks.RUBY_BLOCK);
                        output.accept(Moditems.REFINER);
                        output.accept(Moditems.MIDAS);
                        output.accept(ModBlocks.DIAMOND_SLAB);
                        output.accept(ModBlocks.RUBY_SLAB);
                        output.accept(ModBlocks.DIAMOND_STAIRS);
                        output.accept(ModBlocks.RUBY_STAIRS);
                        output.accept(ModBlocks.RUBY_BUTTON);
                        output.accept(ModBlocks.RUBY_WALL);
                    }).build());



    public static void registerModCreativeModeTabs() {
        TutorialMod.LOGGER.info("Registering creative tab for " + TutorialMod.MOD_ID);

    }

}
