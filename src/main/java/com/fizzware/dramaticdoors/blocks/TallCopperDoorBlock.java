package com.fizzware.dramaticdoors.blocks;

import java.util.Optional;
import java.util.function.Supplier;

import com.fizzware.dramaticdoors.init.DDBlocks;
import com.fizzware.dramaticdoors.state.properties.TripleBlockPart;
import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ChangeOverTimeBlock;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.BlockHitResult;

public class TallCopperDoorBlock extends TallDoorBlock implements WeatheringCopper
{
	private static Supplier<BiMap<Block, Block>> NEXT_BY_BLOCK = Suppliers.memoize(() -> {
		return ImmutableBiMap.<Block, Block>builder().put(DDBlocks.TALL_EC_COPPER_DOOR.get(), DDBlocks.TALL_EC_EXPOSED_COPPER_DOOR.get()).put(DDBlocks.TALL_EC_EXPOSED_COPPER_DOOR.get(), DDBlocks.TALL_EC_WEATHERED_COPPER_DOOR.get()).put(DDBlocks.TALL_EC_WEATHERED_COPPER_DOOR.get(), DDBlocks.TALL_EC_OXIDIZED_COPPER_DOOR.get()).build();
	});
	private static Supplier<BiMap<Block, Block>> PREVIOUS_BY_BLOCK = Suppliers.memoize(() -> { return NEXT_BY_BLOCK.get().inverse(); });

	private final WeatheringCopper.WeatherState weatherState;

	public TallCopperDoorBlock(Block from, WeatherState state) {
		super(from);
		this.weatherState = state;
	}

	@Override
	public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand handIn, BlockHitResult hit) {
		ItemStack itemstack = player.getItemInHand(handIn);
		Block block = state.getBlock();
		int offset = state.getValue(THIRD) == TripleBlockPart.UPPER ? 2 : state.getValue(THIRD) == TripleBlockPart.MIDDLE ? 1 : 0; // Functionality should be delegated to lower.
		// Wax on
		if (itemstack != null && itemstack.getItem() == Items.HONEYCOMB) {
			if (block == DDBlocks.TALL_EC_WAXED_COPPER_DOOR.get() || block == DDBlocks.TALL_EC_WAXED_EXPOSED_COPPER_DOOR.get() || block == DDBlocks.TALL_EC_WAXED_WEATHERED_COPPER_DOOR.get() || block == DDBlocks.TALL_EC_WAXED_OXIDIZED_COPPER_DOOR.get()) {
				return InteractionResult.PASS;
			}
			if (player instanceof ServerPlayer) {
				CriteriaTriggers.ITEM_USED_ON_BLOCK.trigger((ServerPlayer) player, pos, itemstack);
			}
			if (player != null && !player.isCreative()) {
				itemstack.shrink(1);
			}
			applyWaxOnCopperDoor(state, level, pos.below(offset));
			level.levelEvent(player, 3003, pos, 0);
			return InteractionResult.sidedSuccess(level.isClientSide);
		}
		// Wax off
		if (itemstack != null && itemstack.getItem() instanceof AxeItem) {
			if (block == DDBlocks.TALL_EC_WAXED_COPPER_DOOR.get() || block == DDBlocks.TALL_EC_WAXED_EXPOSED_COPPER_DOOR.get() || block == DDBlocks.TALL_EC_WAXED_WEATHERED_COPPER_DOOR.get() || block == DDBlocks.TALL_EC_WAXED_OXIDIZED_COPPER_DOOR.get()) {
				level.playSound(player, pos, SoundEvents.AXE_WAX_OFF, SoundSource.BLOCKS, 1.0F, 1.0F);
				level.levelEvent(player, 3004, pos, 0);
				removeWaxFromCopperDoor(state, level, pos.below(offset));
			}
			else if (block == DDBlocks.TALL_EC_EXPOSED_COPPER_DOOR.get() || block == DDBlocks.TALL_EC_WEATHERED_COPPER_DOOR.get() || block == DDBlocks.TALL_EC_OXIDIZED_COPPER_DOOR.get()) {
				level.playSound(player, pos, SoundEvents.AXE_SCRAPE, SoundSource.BLOCKS, 1.0F, 1.0F);
				level.levelEvent(player, 3005, pos, 0);
				deoxidizeCopperDoor(state, level, pos.below(offset));
			}
			else if (block == DDBlocks.TALL_EC_COPPER_DOOR.get()) {
				return InteractionResult.PASS;
			}
			if (player != null && !player.isCreative()) {
				itemstack.hurtAndBreak(1, player, (entity) -> { entity.broadcastBreakEvent(handIn); });
			}
			return InteractionResult.sidedSuccess(level.isClientSide);
		}
		return InteractionResult.PASS;
	}

	private void applyWaxOnCopperDoor(BlockState state, Level level, BlockPos pos) {
		BlockState newState = state;
		boolean waterfilled0 = level.getFluidState(pos).getType() == Fluids.WATER;
		boolean waterfilled1 = level.getFluidState(pos.above(1)).getType() == Fluids.WATER;
		boolean waterfilled2 = level.getFluidState(pos.above(2)).getType() == Fluids.WATER;
		if (state.getBlock() == DDBlocks.TALL_EC_COPPER_DOOR.get()) {
			newState = copyProperties(DDBlocks.TALL_EC_WAXED_COPPER_DOOR.get(), state);
		} else if (state.getBlock() == DDBlocks.TALL_EC_EXPOSED_COPPER_DOOR.get()) {
			newState = copyProperties(DDBlocks.TALL_EC_WAXED_EXPOSED_COPPER_DOOR.get(), state);
		} else if (state.getBlock() == DDBlocks.TALL_EC_WEATHERED_COPPER_DOOR.get()) {
			newState = copyProperties(DDBlocks.TALL_EC_WAXED_WEATHERED_COPPER_DOOR.get(), state);
		} else if (state.getBlock() == DDBlocks.TALL_EC_OXIDIZED_COPPER_DOOR.get()) {
			newState = copyProperties(DDBlocks.TALL_EC_WAXED_OXIDIZED_COPPER_DOOR.get(), state);
		}
		level.removeBlock(pos, false);
		level.removeBlock(pos.above(1), false);
		level.removeBlock(pos.above(2), false);
		level.setBlock(pos, newState.setValue(THIRD, TripleBlockPart.LOWER).setValue(WATERLOGGED, waterfilled0), 35);
		level.setBlock(pos.above(1), newState.setValue(THIRD, TripleBlockPart.MIDDLE).setValue(WATERLOGGED, waterfilled1), 35);
		level.setBlock(pos.above(2), newState.setValue(THIRD, TripleBlockPart.UPPER).setValue(WATERLOGGED, waterfilled2), 35);
	}

	private void removeWaxFromCopperDoor(BlockState state, Level level, BlockPos pos) {
		BlockState newState = state;
		boolean waterfilled0 = level.getFluidState(pos).getType() == Fluids.WATER;
		boolean waterfilled1 = level.getFluidState(pos.above(1)).getType() == Fluids.WATER;
		boolean waterfilled2 = level.getFluidState(pos.above(2)).getType() == Fluids.WATER;
		if (state.getBlock() == DDBlocks.TALL_EC_WAXED_COPPER_DOOR.get()) {
			newState = copyProperties(DDBlocks.TALL_EC_COPPER_DOOR.get(), state);
		} else if (state.getBlock() == DDBlocks.TALL_EC_WAXED_EXPOSED_COPPER_DOOR.get()) {
			newState = copyProperties(DDBlocks.TALL_EC_EXPOSED_COPPER_DOOR.get(), state);
		} else if (state.getBlock() == DDBlocks.TALL_EC_WAXED_WEATHERED_COPPER_DOOR.get()) {
			newState = copyProperties(DDBlocks.TALL_EC_WEATHERED_COPPER_DOOR.get(), state);
		} else if (state.getBlock() == DDBlocks.TALL_EC_WAXED_OXIDIZED_COPPER_DOOR.get()) {
			newState = copyProperties(DDBlocks.TALL_EC_OXIDIZED_COPPER_DOOR.get(), state);
		}
		level.removeBlock(pos, false);
		level.removeBlock(pos.above(1), false);
		level.removeBlock(pos.above(2), false);
		level.setBlock(pos, newState.setValue(THIRD, TripleBlockPart.LOWER).setValue(WATERLOGGED, waterfilled0), 35);
		level.setBlock(pos.above(1), newState.setValue(THIRD, TripleBlockPart.MIDDLE).setValue(WATERLOGGED, waterfilled1), 35);
		level.setBlock(pos.above(2), newState.setValue(THIRD, TripleBlockPart.UPPER).setValue(WATERLOGGED, waterfilled2), 35);
	}
	
	private void deoxidizeCopperDoor(BlockState state, Level level, BlockPos pos) {
		boolean waterfilled0 = level.getFluidState(pos).getType() == Fluids.WATER;
		boolean waterfilled1 = level.getFluidState(pos.above(1)).getType() == Fluids.WATER;
		boolean waterfilled2 = level.getFluidState(pos.above(2)).getType() == Fluids.WATER;
		getPrevious(state).ifPresent((newState) ->  {
            level.setBlock(pos, Blocks.AIR.defaultBlockState(), Block.UPDATE_ALL);
            level.setBlock(pos, newState.setValue(THIRD, TripleBlockPart.LOWER).setValue(WATERLOGGED, waterfilled0), Block.UPDATE_CLIENTS);
            level.setBlock(pos.above(1), newState.setValue(THIRD, TripleBlockPart.MIDDLE).setValue(WATERLOGGED, waterfilled1), Block.UPDATE_ALL_IMMEDIATE);
            level.setBlock(pos.above(2), newState.setValue(THIRD, TripleBlockPart.UPPER).setValue(WATERLOGGED, waterfilled2), Block.UPDATE_ALL_IMMEDIATE);
		});
	}

	private BlockState copyProperties(Block newBlock, BlockState state) {
		BlockState newBlockState = newBlock.defaultBlockState().setValue(THIRD, state.getValue(THIRD)).setValue(FACING, state.getValue(FACING)).setValue(HINGE, state.getValue(HINGE)).setValue(POWERED, state.getValue(POWERED))
				.setValue(OPEN, state.getValue(OPEN)).setValue(WATERLOGGED, state.getValue(WATERLOGGED));
		return newBlockState;
	}

	static Optional<Block> getPrevious(Block p_154891_) {
		return Optional.ofNullable(PREVIOUS_BY_BLOCK.get().get(p_154891_));
	}

	public static Optional<BlockState> getPrevious(BlockState p_154900_) {
		return getPrevious(p_154900_.getBlock()).map((p_154903_) -> { return p_154903_.withPropertiesOf(p_154900_); });
	}

	public static BlockState getFirst(BlockState p_154907_) {
		return getFirst(p_154907_.getBlock()).withPropertiesOf(p_154907_);
	}

	static Block getFirst(Block p_154898_) {
		Block block = p_154898_;

		for (Block block1 = PREVIOUS_BY_BLOCK.get().get(p_154898_); block1 != null; block1 = PREVIOUS_BY_BLOCK.get().get(block1)) {
			block = block1;
		}

		return block;
	}

	@Override
	public Optional<BlockState> getNext(BlockState state) {
		return getNext(state.getBlock()).map((block) -> {
			return block.withPropertiesOf(state);
		});
	}
	
	public static Optional<Block> getNext(Block state) {
		return Optional.ofNullable(NEXT_BY_BLOCK.get().get(state));
	}

	@Override
	public void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
		this.onRandomTick(state, level, pos, random);
		float f = 0.05688889F;
		if (random.nextFloat() < f) {
			this.applyChangeOverTime(state, level, pos, random);
		}
	}

	@Override
	public boolean isRandomlyTicking(BlockState state) {
		return getNext(state.getBlock()).isPresent();
	}

	@Override
	public WeatherState getAge() {
		return this.weatherState;
	}

	@Override
	public void applyChangeOverTime(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
		int i = this.getAge().ordinal();
		int j = 0;
		int k = 0;

		for (BlockPos blockpos : BlockPos.withinManhattan(pos, 4, 4, 4)) {
			int l = blockpos.distManhattan(pos);
			if (l > 4) {
				break;
			}

			if (!blockpos.equals(pos)) {
				BlockState blockstate = level.getBlockState(blockpos);
				Block block = blockstate.getBlock();
				if (block instanceof ChangeOverTimeBlock) {
					Enum<?> oenum = ((ChangeOverTimeBlock<?>) block).getAge();
					if (this.getAge().getClass() == oenum.getClass()) {
						int i1 = oenum.ordinal();
						if (i1 < i) {
							return;
						}

						if (i1 > i) {
							++k;
						} else {
							++j;
						}
					}
				}
			}
		}

		float f = (float) (k + 1) / (float) (k + j + 1);
		float f1 = f * f * this.getChanceModifier();
		if (random.nextFloat() < f1) {
            this.getNext(state).ifPresent((newState) -> {
                BlockPos replacedPosition = pos;
                if (state.getValue(THIRD).equals(TripleBlockPart.UPPER)) {
                    replacedPosition = replacedPosition.below(2);
                }
                else if (state.getValue(THIRD).equals(TripleBlockPart.MIDDLE)) {
                    replacedPosition = replacedPosition.below(1);
                }
				boolean waterfilled0 = level.getFluidState(replacedPosition).getType() == Fluids.WATER;
				boolean waterfilled1 = level.getFluidState(replacedPosition.above(1)).getType() == Fluids.WATER;
				boolean waterfilled2 = level.getFluidState(replacedPosition.above(2)).getType() == Fluids.WATER;

                level.setBlock(replacedPosition, Blocks.AIR.defaultBlockState(), Block.UPDATE_ALL);
                level.setBlock(replacedPosition, newState.setValue(THIRD, TripleBlockPart.LOWER).setValue(WATERLOGGED, waterfilled0), Block.UPDATE_CLIENTS);
                level.setBlock(replacedPosition.above(1), newState.setValue(THIRD, TripleBlockPart.MIDDLE).setValue(WATERLOGGED, waterfilled1), Block.UPDATE_ALL_IMMEDIATE);
                level.setBlock(replacedPosition.above(2), newState.setValue(THIRD, TripleBlockPart.UPPER).setValue(WATERLOGGED, waterfilled2), Block.UPDATE_ALL_IMMEDIATE);
            });		
        }
	}

}
