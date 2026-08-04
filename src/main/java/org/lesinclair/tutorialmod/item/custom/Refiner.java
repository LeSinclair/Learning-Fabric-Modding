package org.lesinclair.tutorialmod.item.custom;

import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import org.lesinclair.tutorialmod.TutorialMod;
import org.lesinclair.tutorialmod.block.ModBlocks;

import java.util.Map;

public class Refiner extends Item {
    private static final Map<Block, Block> REFINER_MAP = Map.of(
            ModBlocks.DORITO_BLOCK, ModBlocks.RUBY_BLOCK
    );

    public Refiner(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {

        Level level = context.getLevel();
        Block clickedBlock = level.getBlockState(context.getClickedPos()).getBlock();

        if (REFINER_MAP.containsKey(clickedBlock) && !level.isClientSide()) {
            level.setBlockAndUpdate(context.getClickedPos(), REFINER_MAP.get(clickedBlock).defaultBlockState());
            assert context.getPlayer() != null;
            context.getItemInHand().hurtAndBreak(1, context.getPlayer(), context.getHand());
        }

        return InteractionResult.SUCCESS;

    }
}
