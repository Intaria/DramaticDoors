package com.fizzware.dramaticdoors;

import com.fizzware.dramaticdoors.entity.ai.goal.OpenTallDoorGoal;

import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.goal.OpenDoorGoal;
import net.minecraft.world.entity.ai.navigation.GroundPathNavigation;
import net.minecraft.world.entity.monster.Witch;
import net.minecraft.world.entity.monster.piglin.AbstractPiglin;
import net.minecraft.world.entity.npc.AbstractVillager;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class DDEvents
{

	@SubscribeEvent
	public void entityAdded(EntityJoinWorldEvent event) {
		if (event.getEntity() instanceof AbstractVillager || event.getEntity() instanceof AbstractPiglin || event.getEntity() instanceof Witch) {
			Mob mob = (Mob) event.getEntity();
			if (mob.getNavigation() instanceof GroundPathNavigation) {
				mob.goalSelector.addGoal(1, new OpenTallDoorGoal(mob, true));
			}
			if (mob instanceof Witch) { // Because witches should be able to open regular doors too.
				GroundPathNavigation navigator = (GroundPathNavigation) mob.getNavigation();
				navigator.setCanOpenDoors(true);
				mob.goalSelector.addGoal(1, new OpenDoorGoal(mob, true));
			}
		}
	}
}
