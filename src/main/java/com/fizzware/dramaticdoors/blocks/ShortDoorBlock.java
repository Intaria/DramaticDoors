package com.fizzware.dramaticdoors.blocks;

import javax.annotation.Nullable;

import com.fizzware.dramaticdoors.DDTags;
import com.fizzware.dramaticdoors.compat.Compats;
import com.fizzware.dramaticdoors.compat.QuarkCompat;
import com.fizzware.dramaticdoors.init.DDBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.DoorHingeSide;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@SuppressWarnings("deprecation")
public class ShortDoorBlock extends Block implements SimpleWaterloggedBlock {
	
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    public static final BooleanProperty OPEN = BlockStateProperties.OPEN;
    public static final EnumProperty<DoorHingeSide> HINGE = BlockStateProperties.DOOR_HINGE;
    public static final BooleanProperty POWERED = BlockStateProperties.POWERED;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    protected static final VoxelShape SOUTH_AABB = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 3.0D);
    protected static final VoxelShape NORTH_AABB = Block.box(0.0D, 0.0D, 13.0D, 16.0D, 16.0D, 16.0D);
    protected static final VoxelShape WEST_AABB = Block.box(13.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D);
    protected static final VoxelShape EAST_AABB = Block.box(0.0D, 0.0D, 0.0D, 3.0D, 16.0D, 16.0D);
	
	public ShortDoorBlock(Block from) {
		super(Properties.copy(from));
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(OPEN, Boolean.FALSE).setValue(HINGE, DoorHingeSide.LEFT).setValue(POWERED, Boolean.FALSE).setValue(WATERLOGGED, Boolean.FALSE));
	}

    @Override
    public BlockState updateShape(BlockState stateIn, Direction facing, BlockState facingState, LevelAccessor level, BlockPos currentPos, BlockPos facingPos) {
        return !canSurvive(stateIn, level, currentPos) ? Blocks.AIR.defaultBlockState() : super.updateShape(stateIn, facing, facingState, level, currentPos, facingPos);
    }

    @Override
    public void playerWillDestroy(Level level, BlockPos pos, BlockState state, Player player) {
        super.playerWillDestroy(level, pos, state, player);
    }

    protected int getCloseSound() {
        return this.material == Material.METAL ? 1011 : 1012;
    }

    protected int getOpenSound() {
        return this.material == Material.METAL ? 1005 : 1006;
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        BlockPos blockpos = context.getClickedPos();
        if (blockpos.getY() < context.getLevel().getMaxBuildHeight() && context.getLevel().getBlockState(blockpos).canBeReplaced(context)) {
            Level level = context.getLevel();
            boolean flag = level.hasNeighborSignal(blockpos) || level.hasNeighborSignal(blockpos.above());
            boolean waterfilled = level.getFluidState(blockpos).getType() == Fluids.WATER; 
            return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection()).setValue(HINGE, this.getHinge(context)).setValue(POWERED, flag).setValue(OPEN, flag).setValue(WATERLOGGED, waterfilled);
        } else {
            return null;
        }
    }

    @Override
    public void setPlacedBy(Level level, BlockPos pos, BlockState state, LivingEntity placer, ItemStack stack) {}

    protected DoorHingeSide getHinge(BlockPlaceContext context) {
        BlockGetter BlockGetter = context.getLevel();
        BlockPos placePos = context.getClickedPos();
        Direction behindDir = context.getHorizontalDirection(); // Behind
        Direction leftDir = behindDir.getCounterClockWise(); // Left
        BlockPos leftPos = placePos.relative(leftDir); // Left Pos
        BlockState leftBlockstate = BlockGetter.getBlockState(leftPos); // Left BlockState
        Direction rightDir = behindDir.getClockWise(); // Right
        BlockPos rightPos = placePos.relative(rightDir); // Right Pos
        BlockState rightBlockstate = BlockGetter.getBlockState(rightPos); // Right Blockstate
        int i = (leftBlockstate.isCollisionShapeFullBlock(BlockGetter, leftPos) ? -1 : 0) + (rightBlockstate.isCollisionShapeFullBlock(BlockGetter, rightPos) ? 1 : 0);
        boolean leftIsLowerOfSameType = leftBlockstate.getBlock() == this;
        boolean rightIsLowerOfSameType = rightBlockstate.getBlock() == this;
        if ((!leftIsLowerOfSameType || rightIsLowerOfSameType) && i <= 0) {
            if ((!rightIsLowerOfSameType || leftIsLowerOfSameType) && i >= 0) {
                int j = behindDir.getStepX();
                int k = behindDir.getStepZ();
                Vec3 vec3d = context.getClickLocation();
                double d0 = vec3d.x - (double)placePos.getX();
                double d1 = vec3d.z - (double)placePos.getZ();
                return (j >= 0 || !(d1 < 0.5D)) && (j <= 0 || !(d1 > 0.5D)) && (k >= 0 || !(d0 > 0.5D)) && (k <= 0 || !(d0 < 0.5D)) ? DoorHingeSide.LEFT : DoorHingeSide.RIGHT;
            } else {
                return DoorHingeSide.LEFT;
            }
        } else {
            return DoorHingeSide.RIGHT;
        }
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand handIn, BlockHitResult hit) {
    	if (this.material == Material.METAL && !state.is(DDTags.HAND_OPENABLE_SHORT_METAL_DOORS)) {
            return InteractionResult.PASS;
        } 
    	else {
        	if (this == DDBlocks.SHORT_GOLD_DOOR.get() && state.getValue(POWERED)) {
        		return InteractionResult.PASS;
        	}
        	if (this == DDBlocks.SHORT_SILVER_DOOR.get() && !state.getValue(POWERED)) {
        		return InteractionResult.PASS;
        	}
        	tryOpenDoubleDoor(level, state, pos);
            state = state.cycle(OPEN);
            level.setBlock(pos, state, 10);
            level.levelEvent(player, state.getValue(OPEN) ? this.getOpenSound() : this.getCloseSound(), pos, 0);
            level.gameEvent(player, state.getValue(OPEN) ? GameEvent.BLOCK_OPEN : GameEvent.BLOCK_CLOSE, pos);
			if (state.getValue(WATERLOGGED)) {
				level.scheduleTick(pos, Fluids.WATER, Fluids.WATER.getTickDelay(level));
			}
            if (DDBlocks.SHORT_TOOTH_DOOR != null && this == DDBlocks.SHORT_TOOTH_DOOR.get()) {
            	level.scheduleTick(pos, this, 20);
            }
            return InteractionResult.sidedSuccess(level.isClientSide);
        }
    }
    
	@Override
	public void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
		if (this != DDBlocks.SHORT_TOOTH_DOOR.get()) {
			return; // Should stop the 'dancing' doors.
		}
		if (!level.isClientSide) {
			state = state.cycle(OPEN);
			level.setBlock(pos, state, 10);
			level.levelEvent(null, state.getValue(OPEN) ? this.getOpenSound() : this.getCloseSound(), pos, 0);
		}
	}

    public void toggleDoor(Level level, BlockPos pos, boolean open) {
        BlockState blockstate = level.getBlockState(pos);
        if (blockstate.getBlock() == this && blockstate.getValue(OPEN) != open) {
            level.setBlock(pos, blockstate.setValue(OPEN, open), 10);
            this.playSound(level, pos, open);
        }
    }

	public boolean isOpen(BlockState state) {
		return state.getValue(OPEN);
	}

	public void setOpen(@Nullable Entity entity, Level level, BlockState state, BlockPos pos, boolean open) {
		if (state.is(this) && state.getValue(OPEN) != open) {
			level.setBlock(pos, state.setValue(OPEN, Boolean.valueOf(open)), 10);
			this.playSound(level, pos, open);
			level.gameEvent(entity, open ? GameEvent.BLOCK_OPEN : GameEvent.BLOCK_CLOSE, pos);
			tryOpenDoubleDoor(level, state, pos);
		}
 	}
    
    @Override
    public void neighborChanged(BlockState state, Level level, BlockPos pos, Block blockIn, BlockPos fromPos, boolean isMoving) {
        boolean flag = level.hasNeighborSignal(pos);
        if (blockIn != this && flag != state.getValue(POWERED)) {
        	if (this == DDBlocks.SHORT_GOLD_DOOR.get() || this == DDBlocks.SHORT_SILVER_DOOR.get() || this == DDBlocks.SHORT_LEAD_DOOR.get()) {
        		level.setBlock(pos, state.setValue(POWERED, flag), 2);
        	}
        	else {
	            if (flag != state.getValue(OPEN)) {
	                this.playSound(level, pos, flag);
	            }
	            tryOpenDoubleDoor(level, state, pos);
	            level.setBlock(pos, state.setValue(POWERED, flag).setValue(OPEN, flag), Block.UPDATE_CLIENTS);
        	}
        }
    }

    @Override
    public boolean canSurvive(BlockState state, LevelReader level, BlockPos pos) {
    	return true;
        /*boolean result;
        BlockPos below = pos.below();
        BlockState belowState = level.getBlockState(below);
        BlockPos wallPos = pos.relative(state.getValue(FACING).getOpposite(), 1);
        BlockState wallState = level.getBlockState(wallPos);
        result = belowState.isFaceSturdy(level, below, Direction.UP) || belowState.is(DDTags.SHORT_DOORS) || wallState.isFaceSturdy(level, wallPos, state.getValue(FACING).getOpposite());
        return result;*/
    }

    protected void playSound(Level level, BlockPos pos, boolean isOpen) {
        level.levelEvent(null, isOpen ? this.getOpenSound() : this.getCloseSound(), pos, 0);
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public long getSeed(BlockState state, BlockPos pos) {
        return Mth.getSeed(pos.getX(), pos.getY(), pos.getZ());
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, OPEN, HINGE, POWERED, WATERLOGGED);
    }

    @Override
	public FluidState getFluidState(BlockState state) {
		return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : Fluids.EMPTY.defaultFluidState();
	}
    
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        Direction direction = state.getValue(FACING);
        boolean flag = !state.getValue(OPEN);
        boolean flag1 = state.getValue(HINGE) == DoorHingeSide.RIGHT;
        switch(direction) {
            case EAST:
            default:
                return flag ? EAST_AABB : (flag1 ? NORTH_AABB : SOUTH_AABB);
            case SOUTH:
                return flag ? SOUTH_AABB : (flag1 ? EAST_AABB : WEST_AABB);
            case WEST:
                return flag ? WEST_AABB : (flag1 ? SOUTH_AABB : NORTH_AABB);
            case NORTH:
                return flag ? NORTH_AABB : (flag1 ? WEST_AABB : EAST_AABB);
        }
    }

    public boolean allowsMovement(BlockState state, BlockGetter level, BlockPos pos, BlockPathTypes type) {
        switch(type) {
            case WALKABLE:
                return state.getValue(OPEN);
            case WATER:
                return false;
            case OPEN:
                return state.getValue(OPEN);
            default:
                return false;
        }
    }

    public PushReaction getPushReaction(BlockState state) {
        return PushReaction.DESTROY;
    }

    public BlockState rotate(BlockState state, Rotation rot) {
        return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
    }

    public BlockState mirror(BlockState state, Mirror mirrorIn) {
        return mirrorIn == Mirror.NONE ? state : state.rotate(mirrorIn.getRotation(state.getValue(FACING))).cycle(HINGE);
    }

    // TODO: Figure out if Zombie breaking Tall Doors is feasible...
    public static boolean isWoodenDoor(Level level, BlockPos pos) {
    	return isWoodenDoor(level.getBlockState(pos));
    }

	public static boolean isWoodenDoor(BlockState state) {
		return state.getBlock() instanceof ShortDoorBlock && (state.is(DDTags.SHORT_WOODEN_DOORS));
	}
    
    //Double Doors Compatibility
	public static void tryOpenDoubleDoor(Level world, BlockState state, BlockPos pos) {
        if (Compats.DOUBLE_DOORS_INSTALLED || Compats.MANYIDEAS_DOORS_INSTALLED || QuarkCompat.hasQuarkDoubleDoorsModule()) {
            Direction direction = state.getValue(ShortDoorBlock.FACING);
            boolean isOpen = state.getValue(ShortDoorBlock.OPEN);
            DoorHingeSide isMirrored = state.getValue(ShortDoorBlock.HINGE);
            BlockPos mirrorPos = pos.relative(isMirrored == DoorHingeSide.RIGHT ? direction.getCounterClockWise() : direction.getClockWise());
            BlockPos doorPos = mirrorPos;
            BlockState other = world.getBlockState(doorPos);
            if (other.getBlock() == state.getBlock() && other.getValue(ShortDoorBlock.FACING) == direction && !other.getValue(ShortDoorBlock.POWERED) &&  other.getValue(ShortDoorBlock.OPEN) == isOpen && other.getValue(ShortDoorBlock.HINGE) != isMirrored) {
                BlockState newState = other.cycle(ShortDoorBlock.OPEN);
                world.setBlock(doorPos, newState, 10);
            }
        }
    }
}
