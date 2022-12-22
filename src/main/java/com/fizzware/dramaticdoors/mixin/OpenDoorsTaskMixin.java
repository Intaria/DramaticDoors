package com.fizzware.dramaticdoors.mixin;

import java.util.Iterator;
import javax.annotation.Nullable;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

import com.fizzware.dramaticdoors.DDTags;
import com.fizzware.dramaticdoors.blocks.TallDoorBlock;

import net.minecraft.core.BlockPos;
import net.minecraft.core.GlobalPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.Brain;
import net.minecraft.world.entity.ai.memory.MemoryModuleType;
import net.minecraft.world.entity.ai.behavior.InteractWithDoor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.pathfinder.Node;
import net.minecraft.world.level.pathfinder.Path;

// Ported from Fabric version of Dramatic Doors.
@Mixin(InteractWithDoor.class)
public class OpenDoorsTaskMixin
{
	@Inject(method = "start(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;J)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/ai/behavior/InteractWithDoor;closeDoorsThatIHaveOpenedOrPassedThrough(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/level/pathfinder/Node;Lnet/minecraft/world/level/pathfinder/Node;)V"))
	private void injectStart(ServerLevel world, LivingEntity entity, long time, CallbackInfo ci) {
		TallDoorBlock tallDoorBlock;
		Path path2 = entity.getBrain().getMemory(MemoryModuleType.PATH).get();
		Node node2 = path2.getNextNode();
		BlockState blockStateDD;
		BlockPos blockPosDD;
		if ((blockStateDD = world.getBlockState(blockPosDD = node2.asBlockPos())).is(DDTags.TALL_WOODEN_DOORS, state -> state.getBlock() instanceof TallDoorBlock) && !(tallDoorBlock = (TallDoorBlock)blockStateDD.getBlock()).isOpen(blockStateDD)) {
            tallDoorBlock.setOpen(entity, world, blockStateDD, blockPosDD, true);
            ((InteractWithDoor)(Object)this).rememberDoorToClose(world, entity, blockPosDD);
        }
	}

	@Inject(method = "closeDoorsThatIHaveOpenedOrPassedThrough(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/entity/LivingEntity;Lnet/minecraft/world/level/pathfinder/PathNode;Lnet/minecraft/world/level/pathfinder/PathNode;)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/server/level/ServerLevel;getBlockState(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;"), locals = LocalCapture.CAPTURE_FAILSOFT)
	private static void injectPathToDoor(ServerLevel world, LivingEntity entity, @Nullable Node lastNode, @Nullable Node currentNode, CallbackInfo ci, Brain<?> brain, Iterator<GlobalPos> iterator, GlobalPos globalPos, BlockPos blockPos) {
		BlockState blockStateDD = world.getBlockState(blockPos);
        if (blockStateDD.is(DDTags.TALL_WOODEN_DOORS, state -> state.getBlock() instanceof TallDoorBlock)) {
        	TallDoorBlock tallDoorBlock = (TallDoorBlock)blockStateDD.getBlock();
        	tallDoorBlock.setOpen(entity, world, blockStateDD, blockPos, false);
        }
	}
}
