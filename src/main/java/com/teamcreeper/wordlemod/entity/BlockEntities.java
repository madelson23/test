package com.teamcreeper.wordlemod.entity;

import com.teamcreeper.wordlemod.WordleMod;
import com.teamcreeper.wordlemod.common.BlockEntity.WordleBlockEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.teamcreeper.wordlemod.block.ModBlocks.WORDLE_BLOCK;

public class BlockEntities{

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister
            .create(ForgeRegistries.BLOCK_ENTITIES, WordleMod.MODID);

    public static final RegistryObject<BlockEntityType<WordleBlockEntity<Entity>>> WORDLE_BLOCK_ENTITY = BLOCK_ENTITIES.
            register("wordle_block", ()->BlockEntityType.Builder.of(WordleBlockEntity::new, WORDLE_BLOCK.get()).
                    build(null));

    private BlockEntities() {
    }
}