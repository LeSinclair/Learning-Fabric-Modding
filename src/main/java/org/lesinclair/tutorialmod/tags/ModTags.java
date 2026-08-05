package org.lesinclair.tutorialmod.tags;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import org.lesinclair.tutorialmod.TutorialMod;

public class ModTags {
    //public static final TagKey<Block> NEEDS_RUBY_TOOL = ;
    public static class Items {
        public static final TagKey<Item> RUBY_REPAIR = createTag("ruby_repair");
        private static TagKey<Item> createTag(String name) {

            return TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID, name));
        }
    }
    public static class Blocks {

        public static final TagKey<Block> NEEDS_RUBY_TOOL = createTag("needs_ruby_tool");
        public static final TagKey<Block> INCORRECT_FOR_RUBY_TOOL = createTag("incorrect_for_ruby_tool");



        private static TagKey<Block> createTag(String name) {
            return TagKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID, name));
        }
    }
}
