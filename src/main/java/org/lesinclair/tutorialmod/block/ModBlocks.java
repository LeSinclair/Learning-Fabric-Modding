package org.lesinclair.tutorialmod.block;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import org.lesinclair.tutorialmod.TutorialMod;
import org.lesinclair.tutorialmod.item.custom.Dorito_Block;

import java.util.function.Function;

public class ModBlocks {

    public static final Block DORITO_BLOCK = registerBlock("dorito_block", properties -> new Dorito_Block(properties.strength(1f).sound(SoundType.AMETHYST)));
    public static final Block RUBY_BLOCK = registerBlock("ruby_block", properties -> new Block(properties.strength(3f).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final Block RUBY_SLAB = registerBlock("ruby_slab", properties -> new SlabBlock(properties.strength(3f).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final Block DIAMOND_SLAB = registerBlock("diamond_slab", properties -> new SlabBlock(properties.strength(3f).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final Block RUBY_BUTTON = registerBlock("ruby_button", properties -> new ButtonBlock(BlockSetType.IRON, 5, properties.strength(3f).sound(SoundType.METAL).noCollision()));
    public static final Block RUBY_STAIRS = registerBlock("ruby_stairs", properties -> new StairBlock(ModBlocks.RUBY_BLOCK.defaultBlockState(), properties.strength(3f).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final Block DIAMOND_STAIRS = registerBlock("diamond_stairs", properties -> new StairBlock(ModBlocks.RUBY_BLOCK.defaultBlockState(), properties.strength(3f).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final Block RUBY_WALL = registerBlock("ruby_wall", properties -> new WallBlock(properties.strength(3f).sound(SoundType.METAL).requiresCorrectToolForDrops()));

    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function) {
        Block toRegister = function.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID, name), toRegister);
    }



    private static void registerBlockItem(String name, Block block) {
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID, name),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID, name)))));
    }


    public static void registerModBlocks() {
        TutorialMod.LOGGER.info("Registering Mod Blocks for " + TutorialMod.MOD_ID);

    }
}
