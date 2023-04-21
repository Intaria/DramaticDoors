package com.fizzware.dramaticdoors;

import java.util.List;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.MissingMappingsEvent;
import net.minecraftforge.registries.MissingMappingsEvent.Mapping;

public class DDEvents
{
	// Ensure players are only notified once.
	private static boolean notifiedPlayer = false;
	
	@SubscribeEvent
	public static void playerJoinsWorld(EntityJoinLevelEvent event) {
		if (event.getEntity() instanceof Player && event.getLevel().isClientSide()) {
			if (ModList.get().isLoaded("statement") && (DDConfig.waterloggableDoors.get() || DDConfig.waterloggableFenceGates.get())) {
				if (!notifiedPlayer) {
					notifiedPlayer = true;
					((Player)event.getEntity()).displayClientMessage(Component.translatable("message.dramaticdoors.statement_notice"), false);
				}
			}
		}
	}
	
	// Migrate to newer versions.
	@SubscribeEvent
	public static void updateMissingMappingsForBlocks(MissingMappingsEvent event) {
		List<Mapping<Block>> mapBlocks = event.getMappings(ForgeRegistries.BLOCKS.getRegistryKey(), DramaticDoors.MOD_ID);
		for (Mapping<Block> entry : mapBlocks) {
			// Update to new names.
			if (entry.getKey().getPath().equalsIgnoreCase("tall_arcane_gold_door")) {
				entry.remap(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_DEORUM)));
			}
			if (entry.getKey().getPath().equalsIgnoreCase("tall_mysterywood_door")) {
				entry.remap(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_AURUM)));
			}
			if (entry.getKey().getPath().equalsIgnoreCase("tall_akashic_door")) {
				entry.remap(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_EDIFIED)));
			}
			// Replace legacy blocks.
			if (entry.getKey().getPath().equalsIgnoreCase("tall_golden_door")) {
				entry.remap(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_GOLD)));
			}
			if (entry.getKey().getPath().equalsIgnoreCase("tall_cerulean_door")) {
				entry.remap(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CONGEALED)));
			}
			if (entry.getKey().getPath().equalsIgnoreCase("tall_cosmic_door")) {
				entry.remap(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CONGEALED)));
			}
			if (entry.getKey().getPath().equalsIgnoreCase("tall_stalk_door")) {
				entry.remap(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CONGEALED)));
			}
			if (entry.getKey().getPath().equalsIgnoreCase("tall_seldge_door")) {
				entry.remap(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CONGEALED)));
			}
			if (entry.getKey().getPath().equalsIgnoreCase("tall_verdant_door")) {
				entry.remap(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_EE_EBONY)));
			}
		}
		List<Mapping<Item>> mapItems = event.getMappings(ForgeRegistries.ITEMS.getRegistryKey(), DramaticDoors.MOD_ID);
		for (Mapping<Item> entry : mapItems) {
			// Update to new names.
			if (entry.getKey().getPath().equalsIgnoreCase("tall_arcane_gold_door")) {
				entry.remap(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_DEORUM)));
			}
			if (entry.getKey().getPath().equalsIgnoreCase("tall_mysterywood_door")) {
				entry.remap(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_AURUM)));
			}
			if (entry.getKey().getPath().equalsIgnoreCase("tall_akashic_door")) {
				entry.remap(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_EDIFIED)));
			}
			// Replace legacy ITEMS.
			if (entry.getKey().getPath().equalsIgnoreCase("tall_golden_door")) {
				entry.remap(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_GOLD)));
			}
			if (entry.getKey().getPath().equalsIgnoreCase("tall_cerulean_door")) {
				entry.remap(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CONGEALED)));
			}
			if (entry.getKey().getPath().equalsIgnoreCase("tall_cosmic_door")) {
				entry.remap(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CONGEALED)));
			}
			if (entry.getKey().getPath().equalsIgnoreCase("tall_stalk_door")) {
				entry.remap(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CONGEALED)));
			}
			if (entry.getKey().getPath().equalsIgnoreCase("tall_seldge_door")) {
				entry.remap(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CONGEALED)));
			}
			if (entry.getKey().getPath().equalsIgnoreCase("tall_verdant_door")) {
				entry.remap(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_EE_EBONY)));
			}
		}
	}
}
