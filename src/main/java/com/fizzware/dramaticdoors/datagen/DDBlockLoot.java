package com.fizzware.dramaticdoors.datagen;

import java.util.List;

import com.fizzware.dramaticdoors.blocks.DDBlocks;
import com.fizzware.dramaticdoors.blocks.TallDoorBlock;
import com.fizzware.dramaticdoors.state.properties.TripleBlockPart;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraftforge.registries.RegistryObject;

public class DDBlockLoot extends BlockLoot
{
	@Override
	protected Iterable<Block> getKnownBlocks() {
		List<Block> blocks = DDBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get).toList();
		//LOGGER.info(logMarker, "generating loot tables for {} blocks...", blocks.size());
		return blocks;
	}
	
	@Override
	protected void addTables() {
		for (Block block : getKnownBlocks()) {
			add(block, createTallDoorTable(block));
		}
	}
	
	public static LootTable.Builder createTallDoorTable(Block block) {
		return createSinglePropConditionTable(block, TallDoorBlock.THIRD, TripleBlockPart.LOWER);
	}
}
