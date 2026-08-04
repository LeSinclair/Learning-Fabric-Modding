package org.lesinclair.tutorialmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import org.lesinclair.tutorialmod.block.ModBlocks;
import org.lesinclair.tutorialmod.item.Moditems;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import static net.minecraft.data.recipes.ShapedRecipeBuilder.shaped;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        return new RecipeProvider(registries, output) {
            @Override
            public void buildRecipes() {
                List<ItemLike> DORITORUBY = List.of(Moditems.DORITOS);
                List<ItemLike> DORITO_BLOCK = List.of(ModBlocks.DORITO_BLOCK);
                List<ItemLike> TEST = List.of(ModBlocks.RUBY_BLOCK);
                smeltingResultFromBase(Items.COAL, Items.COAL);
                oreSmelting(TEST, RecipeCategory.MISC, CookingBookCategory.MISC, Moditems.MIDAS, 0.26f, 200, "testing");
                oreSmelting(DORITORUBY, RecipeCategory.MISC, CookingBookCategory.BLOCKS, Moditems.RUBY, 0.25f, 10, "ruby");
                oreSmelting(DORITO_BLOCK, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModBlocks.RUBY_BLOCK, 2.50f, 800, "ruby");
                shapeless(RecipeCategory.MISC, Moditems.DORITOS)
                        .requires(Items.WHEAT, 3)
                        .requires(Items.MILK_BUCKET)
                        .unlockedBy(getHasName(Items.WHEAT), has(Items.WHEAT))
                        .group("1sfdsdfsdfa")
                        .save(output, "craft_doritos_by_wheat_and_milk");
                nineBlockStorageRecipes(RecipeCategory.MISC, Moditems.DORITOS, RecipeCategory.MISC, ModBlocks.DORITO_BLOCK);
                nineBlockStorageRecipes(RecipeCategory.MISC, Moditems.RUBY, RecipeCategory.MISC, ModBlocks.RUBY_BLOCK);
                shapeless(RecipeCategory.MISC, Moditems.DORITOS, 9)
                        .requires(ModBlocks.DORITO_BLOCK)
                        .unlockedBy(getHasName(Items.WHEAT), has(Items.WHEAT))
                        .unlockedBy(getHasName(Moditems.DORITOS), has(Moditems.DORITOS))
                        .group("get_doritos_by_wheat")
                        .save(output, "craft_doritos_by_wheat");
                shapeless(RecipeCategory.MISC, Moditems.RUBY, 9)
                        .requires(ModBlocks.RUBY_BLOCK)
                        .unlockedBy(getHasName(ModBlocks.RUBY_BLOCK), has(ModBlocks.RUBY_BLOCK))
                        .unlockedBy(getHasName(Moditems.RUBY), has(Moditems.RUBY))
                        .group("craft_ruby_block")
                        .save(output, "craft_ruby_block");
                netheriteSmithing(Moditems.DORITOS, RecipeCategory.MISC, Moditems.RUBY);
                shaped(RecipeCategory.TOOLS, Moditems.REFINER)
                        .pattern(" C ")
                        .pattern("PPP")
                        .pattern(" P ")
                        .define('C', Items.RED_CARPET)
                        .define('P', ItemTags.PLANKS)
                        .unlockedBy(getHasName(Items.OAK_PLANKS), has(Items.OAK_PLANKS))
                        .group("refiner")
                        .save(output);
                //shaped(RecipeCategory.MISC, ModBlocks.RUBY_WALL)
                //        .pattern("&&&")
                //        .pattern("&&&")
                //        .define('&', ModBlocks.RUBY_BLOCK);
                //shaped(RecipeCategory.MISC, ModBlocks.RUBY_SLAB)
                //        .pattern("&&&")
                //        .define('&', ModBlocks.RUBY_BLOCK);
                //shapeless(RecipeCategory.MISC, ModBlocks.RUBY_BUTTON, 1)
                //        .requires(Moditems.RUBY);
                //shaped(RecipeCategory.MISC, ModBlocks.RUBY_STAIRS, 4)
                //        .pattern("&  ")
                //        .pattern("&& ")
                //        .pattern("&&&")
                //        .define('&', ModBlocks.RUBY_BLOCK);
                slabBuilder(RecipeCategory.DECORATIONS, ModBlocks.DIAMOND_SLAB, Ingredient.of(Blocks.DIAMOND_BLOCK)).group("testinggroup").unlockedBy(getHasName(Blocks.DIAMOND_BLOCK), has(Blocks.DIAMOND_BLOCK)).save(output);
                slabBuilder(RecipeCategory.DECORATIONS, ModBlocks.RUBY_SLAB, Ingredient.of(ModBlocks.RUBY_BLOCK)).unlockedBy(getHasName(ModBlocks.RUBY_BLOCK), has(ModBlocks.RUBY_BLOCK)).save(output);
                stairBuilder(ModBlocks.DIAMOND_STAIRS, Ingredient.of(Blocks.DIAMOND_BLOCK)).unlockedBy(getHasName(Blocks.DIAMOND_BLOCK), has(Blocks.DIAMOND_BLOCK)).save(output);
                stairBuilder(ModBlocks.RUBY_STAIRS, Ingredient.of(ModBlocks.RUBY_BLOCK)).unlockedBy(getHasName(ModBlocks.RUBY_BLOCK), has(ModBlocks.RUBY_BLOCK)).save(output);
                buttonBuilder(ModBlocks.RUBY_BUTTON, Ingredient.of(ModBlocks.RUBY_BLOCK)).unlockedBy(getHasName(ModBlocks.RUBY_BLOCK), has(ModBlocks.RUBY_BLOCK)).save(output);
                wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RUBY_WALL, Ingredient.of(ModBlocks.RUBY_BLOCK))
                        .unlockedBy(getHasName(ModBlocks.RUBY_BLOCK), has(ModBlocks.RUBY_BLOCK)).save(output);
            }
        };
    }



    @Override
    public String getName() {
        return "TutorialMod Recipes";
    }
}
