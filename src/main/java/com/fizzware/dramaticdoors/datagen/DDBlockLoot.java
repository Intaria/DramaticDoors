package com.fizzware.dramaticdoors.datagen;

import java.util.List;
import java.util.Map;

import com.fizzware.dramaticdoors.blocks.ShortDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallDoorBlock;
import com.fizzware.dramaticdoors.state.properties.TripleBlockPart;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraftforge.registries.ForgeRegistries;

public class DDBlockLoot extends BlockLoot
{
	@Override
	protected Iterable<Block> getKnownBlocks() {
		List<Block> blocks = ForgeRegistries.BLOCKS.getEntries().stream().filter(entry -> entry.getValue() instanceof ShortDoorBlock || entry.getValue() instanceof TallDoorBlock).map(Map.Entry::getValue).toList();
		return blocks;
	}
	
	@Override
	protected void addTables() {
		for (Block block : getKnownBlocks()) {
			if (block instanceof TallDoorBlock) {
				add(block, createTallDoorTable(block));
			}
			else if (block instanceof ShortDoorBlock) {
				dropSelf(block);
			}
		}
	}
	
	public static LootTable.Builder createTallDoorTable(Block block) {
		return createSinglePropConditionTable(block, TallDoorBlock.THIRD, TripleBlockPart.LOWER);
	}
}
