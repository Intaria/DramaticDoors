package com.fizzware.dramaticdoors.compat;

import com.fizzware.dramaticdoors.DDConfig;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraftforge.registries.ForgeRegistries;
import virtuoel.statement.api.StateRefresher;

public class StatementCompat
{
	public static void implementWaterlogging(boolean modded) {
		if (DDConfig.waterloggableDoors.get()) {
			injectWaterloggedProperty(DoorBlock.class, modded);
		}
		if (DDConfig.waterloggableFenceGates.get()) {
			injectWaterloggedProperty(FenceGateBlock.class, modded);
		}
	}
	
	private static void injectWaterloggedProperty(Class<? extends Block> blockClass, boolean modded) {
        for (Block block : ForgeRegistries.BLOCKS) {
        	if (ForgeRegistries.BLOCKS.getKey(block).getNamespace() != "minecraft" && modded) { // Skip over vanilla blocks if not modded.
	            if (blockClass.isAssignableFrom(block.getClass())) {
	                addWaterloggedProperty(block);
	            }
        	}
        	else {
	            if (blockClass.isAssignableFrom(block.getClass())) {
	                addWaterloggedProperty(block);
	            }
        	}
        }
	}
	
	private static void addWaterloggedProperty(Block block) {
		StateRefresher.INSTANCE.addBlockProperty(block, BlockStateProperties.WATERLOGGED, false);
	}
	
}
