package com.fizzware.dramaticdoors.blocks;

import com.fizzware.dramaticdoors.blockentities.TallNetheriteDoorBlockEntity;
import com.fizzware.dramaticdoors.state.properties.TripleBlockPart;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.BlockHitResult;

public class TallNetheriteDoorBlock extends TallDoorBlock implements EntityBlock
{
	public TallNetheriteDoorBlock(Block from) {
		super(from);
	}

	@Override
	public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
		if (state.getValue(THIRD) == TripleBlockPart.LOWER) {
			return new TallNetheriteDoorBlockEntity(pos, state);
		}
		return null;
	}
	
	@Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
		BlockPos delegatedPos = state.getValue(THIRD) == TripleBlockPart.LOWER ? pos : (state.getValue(THIRD) == TripleBlockPart.UPPER ? pos.below(2) : pos.below(1));
		BlockEntity be = level.getBlockEntity(delegatedPos);
		//Execute action.
		if (be != null && be instanceof TallNetheriteDoorBlockEntity) {
			TallNetheriteDoorBlockEntity door = (TallNetheriteDoorBlockEntity) be;
			if (door.handleAction(player, hand, "door")) {
				tryOpenDoubleDoor(level, state, pos);
				BlockState newState = state.cycle(OPEN);
				level.setBlock(pos, newState, 10);
	            level.levelEvent(player, state.getValue(OPEN) ? this.getOpenSound() : this.getCloseSound(), pos, 0);
	            level.gameEvent(player, state.getValue(OPEN) ? GameEvent.BLOCK_OPEN : GameEvent.BLOCK_CLOSE, pos);
			}
		}
	    return InteractionResult.sidedSuccess(level.isClientSide);
	}
	
}
