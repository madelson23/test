package com.teamcreeper.wordlemod.item;

import com.teamcreeper.wordlemod.WordleMod;
import com.teamcreeper.wordlemod.block.ModBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, WordleMod.MODID);


    public static final RegistryObject<Item> WORDLE_BLOCK_ITEM = ITEMS.register("wordle_block_item",
            ()-> new BlockItem(ModBlocks.WORDLE_BLOCK.get(), new Item.Properties().tab(CreativeModeTab.TAB_MISC)));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
