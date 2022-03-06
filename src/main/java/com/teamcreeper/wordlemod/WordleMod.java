package com.teamcreeper.wordlemod;

import com.teamcreeper.wordlemod.block.ModBlocks;
import com.teamcreeper.wordlemod.entity.BlockEntities;
import com.teamcreeper.wordlemod.item.ModItems;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod(WordleMod.MODID)
public class WordleMod {
	public static final String MODID = "wordlemod";

	private static final Logger LOGGER = LogManager.getLogger();

	public WordleMod() {
		IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

		ModItems.register(eventBus);
		ModBlocks.register(eventBus);
		eventBus.addListener(this::setup);
		BlockEntities.BLOCK_ENTITIES.register(eventBus);

		MinecraftForge.EVENT_BUS.register(this);
	}

	private void setup(final FMLCommonSetupEvent event) {
		LOGGER.info("Hello from preinit");
		LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
	}
}