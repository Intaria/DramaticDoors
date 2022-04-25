package com.fizzware.dramaticdoors;

import com.fizzware.dramaticdoors.blocks.DramaticDoorsBlocks;
import com.google.common.collect.ImmutableList;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.RegistryEvent.MissingMappings.Mapping;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;

public class DramaticDoorsUpdateHandler
{

	// Update Better Azalea to Ecologics.
	@SubscribeEvent
	public void updateMissingMappingsForBlocks(RegistryEvent.MissingMappings<Block> event) {
		ImmutableList<Mapping<Block>> map = event.getMappings(DramaticDoors.MOD_ID);
		for (RegistryEvent.MissingMappings.Mapping<Block> entry : map) {
			if (ModList.get().isLoaded("ecologics")) {
				if (entry.key.getPath().equalsIgnoreCase("tall_ba_azalea_door")) {
					entry.remap(DramaticDoorsBlocks.TALL_ECO_AZALEA_DOOR);
				}
				if (entry.key.getPath().equalsIgnoreCase("tall_ba_flowering_azalea_door")) {
					entry.remap(DramaticDoorsBlocks.TALL_ECO_FLOWERING_AZALEA_DOOR);
				}
				if (entry.key.getPath().equalsIgnoreCase("tall_coconut_door")) {
					entry.remap(DramaticDoorsBlocks.TALL_ECO_COCONUT_DOOR);
				}
			}
			if (ModList.get().isLoaded("twlightforest")) {
				if (entry.key.getPath().equalsIgnoreCase("tall_mangrove_door")) {
					entry.remap(DramaticDoorsBlocks.TALL_TWILIGHT_MANGROVE_DOOR);
				}
			}
		}
	}
	
	@SubscribeEvent
	public void updateMissingMappingsForItems(RegistryEvent.MissingMappings<Item> event) {
		ImmutableList<Mapping<Item>> map = event.getMappings(DramaticDoors.MOD_ID);
		for (RegistryEvent.MissingMappings.Mapping<Item> entry : map) {
			if (ModList.get().isLoaded("ecologics")) {
				if (entry.key.getPath().equalsIgnoreCase("tall_ba_azalea_door")) {
					entry.remap(DramaticDoorsBlocks.TALL_ECO_AZALEA_DOOR.asItem());
				}
				if (entry.key.getPath().equalsIgnoreCase("tall_ba_flowering_azalea_door")) {
					entry.remap(DramaticDoorsBlocks.TALL_ECO_FLOWERING_AZALEA_DOOR.asItem());
				}
				if (entry.key.getPath().equalsIgnoreCase("tall_coconut_door")) {
					entry.remap(DramaticDoorsBlocks.TALL_ECO_COCONUT_DOOR.asItem());
				}
			}
			if (ModList.get().isLoaded("twlightforest")) {
				if (entry.key.getPath().equalsIgnoreCase("tall_mangrove_door")) {
					entry.remap(DramaticDoorsBlocks.TALL_TWILIGHT_MANGROVE_DOOR.asItem());
				}
			}
		}
	}
}
