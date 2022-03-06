package com.teamcreeper.wordlemod.common.BlockEntity;

import com.teamcreeper.wordlemod.entity.BlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class WordleBlockEntity<T extends Entity> extends BlockEntity{

    public WordleBlockEntity(BlockPos pos, BlockState state){
        super(BlockEntities.WORDLE_BLOCK_ENTITY.get(), pos, state);
    }

    @Override
    protected void saveAdditional(CompoundTag tag) {
        super.saveAdditional(tag);
    }

    @Override
    public void load(CompoundTag tag) {
        super.load(tag);
    }

}