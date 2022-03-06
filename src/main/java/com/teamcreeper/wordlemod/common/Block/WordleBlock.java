package com.teamcreeper.wordlemod.common.Block;

import com.teamcreeper.wordlemod.entity.BlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class WordleBlock extends BaseEntityBlock implements EntityBlock {

    protected WordleBlock(Properties properties){
        super(properties);
    }

    public BlockEntity newBlockEntity (BlockPos pos, BlockState state){
        return BlockEntities.WORDLE_BLOCK_ENTITY.get().create(pos, state);
    }


    @Override
    public RenderShape getRenderShape(BlockState state) {
        return RenderShape.MODEL;
    }
}