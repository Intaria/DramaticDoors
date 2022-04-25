package com.fizzware.dramaticdoors.blockentities;

import com.fizzware.dramaticdoors.DramaticDoors;
import com.fizzware.dramaticdoors.blocks.DramaticDoorsBlocks;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistryEntry;
import net.minecraftforge.registries.RegistryObject;

public class DramaticDoorsBlockEntities
{
	public static DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, DramaticDoors.MOD_ID);
	
	public static final RegistryObject<BlockEntityType<TallNetheriteDoorBlockEntity>> TALL_NETHERITE_DOOR = BLOCK_ENTITIES.register("tall_netherite_door", () -> BlockEntityType.Builder.of(TallNetheriteDoorBlockEntity::new, DramaticDoorsBlocks.TALL_NETHERITE_DOOR).build(null));
	
	@EventBusSubscriber(modid = DramaticDoors.MOD_ID)
	public static class RegistrationHandler 
	{
		public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final String name) {
			return setup(entry, new ResourceLocation(DramaticDoors.MOD_ID, name));
		}

		public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final ResourceLocation registryName) {
			entry.setRegistryName(registryName);
			return entry;
		}
		
	    @SubscribeEvent
	    public static void registerBlocks(final RegistryEvent.Register<BlockEntityType<?>> event) { 
	    	event.getRegistry().registerAll();
	    }
	}
}
