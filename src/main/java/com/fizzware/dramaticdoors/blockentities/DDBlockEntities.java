package com.fizzware.dramaticdoors.blockentities;

import com.fizzware.dramaticdoors.DramaticDoors;
import com.fizzware.dramaticdoors.blocks.DDBlocks;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class DDBlockEntities
{
	public static DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, DramaticDoors.MOD_ID);
	
	public static final RegistryObject<BlockEntityType<TallNetheriteDoorBlockEntity>> TALL_NETHERITE_DOOR = BLOCK_ENTITIES.register("tall_netherite_door", () -> BlockEntityType.Builder.of(TallNetheriteDoorBlockEntity::new, DDBlocks.TALL_NETHERITE_DOOR.get()).build(null));
}
