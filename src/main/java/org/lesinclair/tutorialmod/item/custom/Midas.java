package org.lesinclair.tutorialmod.item.custom;

import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;


public class Midas extends Item {
    public Midas(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {

        Level level = context.getLevel();
        Block clickedBlock = level.getBlockState(context.getClickedPos()).getBlock();

        if (!level.isClientSide()) {
            level.setBlockAndUpdate(context.getClickedPos(), Blocks.GOLD_BLOCK.defaultBlockState());
            assert context.getPlayer() != null;
        }

        return InteractionResult.SUCCESS;

    }
}
