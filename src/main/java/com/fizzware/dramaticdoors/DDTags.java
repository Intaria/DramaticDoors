package com.fizzware.dramaticdoors;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class DDTags
{
	public static final TagKey<Block> TALL_DOORS = TagKey.create(Registry.BLOCK_REGISTRY, new ResourceLocation(DramaticDoors.MOD_ID, "tall_doors"));
	public static final TagKey<Block> TALL_WOODEN_DOORS = TagKey.create(Registry.BLOCK_REGISTRY, new ResourceLocation(DramaticDoors.MOD_ID, "tall_wooden_doors"));
	public static final TagKey<Block> HAND_OPENABLE_TALL_METAL_DOORS = TagKey.create(Registry.BLOCK_REGISTRY, new ResourceLocation(DramaticDoors.MOD_ID, "hand_openable_tall_metal_doors"));
	
	public static final TagKey<Item> KEY = TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("supplementaries", "key"));
}
