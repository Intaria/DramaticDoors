package com.fizzware.dramaticdoors;

import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;

public class DDNoticeEvent
{
	@SubscribeEvent
	public static void playerJoinsWorld(EntityJoinLevelEvent event) {
		if (event.getEntity() instanceof Player && event.getLevel().isClientSide()) {
			if (ModList.get().isLoaded("statement") && (DDConfig.waterloggableDoors.get() || DDConfig.waterloggableFenceGates.get())) {
				((Player)event.getEntity()).displayClientMessage(Component.translatable("message.dramaticdoors.statement_notice"), false);
			}
		}
	}
}
