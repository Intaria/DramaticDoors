package com.fizzware.dramaticdoors.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import mod.pianomanu.blockcarpentry.block.FenceGateFrameBlock;
import mod.pianomanu.blockcarpentry.block.IFrameBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;

@Mixin(FenceGateFrameBlock.class)
public class FenceGateFrameBlockMixin extends Block implements IFrameBlock
{
	public FenceGateFrameBlockMixin(Properties properties) {
		super(properties); // Doesn't do anything here.
	}

	@Inject(method = "createBlockStateDefinition(Lnet/minecraft/world/level/block/state/StateDefinition$Builder;)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/block/FenceGateBlock;createBlockStateDefinition(Lnet/minecraft/world/level/block/state/StateDefinition$Builder;)V", shift = Shift.AFTER), cancellable = true)
	protected void injectBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder, CallbackInfo callback) {
		builder.add(CONTAINS_BLOCK, LIGHT_LEVEL);
		if (callback.isCancellable()) {
			callback.cancel();
		}
	}
}
