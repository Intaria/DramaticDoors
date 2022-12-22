package com.fizzware.dramaticdoors.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.mehvahdjukaar.supplementaries.common.block.blocks.IronGateBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;

@Mixin(IronGateBlock.class)
public class IronGateBlockMixin
{
	@Inject(at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/block/FenceGateBlock;createBlockStateDefinition(Lnet/minecraft/world/level/block/state/StateDefinition$Builder;)V", shift = Shift.AFTER), method = "createBlockStateDefinition(Lnet/minecraft/world/level/block/state/StateDefinition$Builder;)V", cancellable = true)
	protected void injectBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder, CallbackInfo callback) {
		if (callback.isCancellable()) {
			callback.cancel();
		}
	}
}
