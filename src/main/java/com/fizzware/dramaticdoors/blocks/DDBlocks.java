package com.fizzware.dramaticdoors.blocks;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DramaticDoors;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DDBlocks {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, DramaticDoors.MOD_ID);
	
	// Vanilla
    public static final RegistryObject<Block> SHORT_IRON_DOOR = BLOCKS.register(DDNames.SHORT_IRON, () -> new ShortDoorBlock(Blocks.IRON_DOOR));
    public static final RegistryObject<Block> SHORT_OAK_DOOR = BLOCKS.register(DDNames.SHORT_OAK, () -> new ShortDoorBlock(Blocks.OAK_DOOR));
    public static final RegistryObject<Block> SHORT_SPRUCE_DOOR = BLOCKS.register(DDNames.SHORT_SPRUCE, () -> new ShortDoorBlock(Blocks.SPRUCE_DOOR));
    public static final RegistryObject<Block> SHORT_BIRCH_DOOR = BLOCKS.register(DDNames.SHORT_BIRCH, () -> new ShortDoorBlock(Blocks.BIRCH_DOOR));
    public static final RegistryObject<Block> SHORT_JUNGLE_DOOR = BLOCKS.register(DDNames.SHORT_JUNGLE, () -> new ShortDoorBlock(Blocks.JUNGLE_DOOR));
    public static final RegistryObject<Block> SHORT_ACACIA_DOOR = BLOCKS.register(DDNames.SHORT_ACACIA, () -> new ShortDoorBlock(Blocks.ACACIA_DOOR));
    public static final RegistryObject<Block> SHORT_DARK_OAK_DOOR = BLOCKS.register(DDNames.SHORT_DARK_OAK, () -> new ShortDoorBlock(Blocks.DARK_OAK_DOOR));
    public static final RegistryObject<Block> SHORT_MANGROVE_DOOR = BLOCKS.register(DDNames.SHORT_MANGROVE, () -> new ShortDoorBlock(Blocks.MANGROVE_DOOR));
    public static final RegistryObject<Block> SHORT_BAMBOO_DOOR = BLOCKS.register(DDNames.SHORT_BAMBOO, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("quark", "bamboo_door")))); //With Quark.
    public static final RegistryObject<Block> SHORT_CRIMSON_DOOR = BLOCKS.register(DDNames.SHORT_CRIMSON, () -> new ShortDoorBlock(Blocks.CRIMSON_DOOR));
    public static final RegistryObject<Block> SHORT_WARPED_DOOR = BLOCKS.register(DDNames.SHORT_WARPED, () -> new ShortDoorBlock(Blocks.WARPED_DOOR));
	
    public static final RegistryObject<Block> TALL_IRON_DOOR = BLOCKS.register(DDNames.TALL_IRON, () -> new TallDoorBlock(Blocks.IRON_DOOR));
    public static final RegistryObject<Block> TALL_OAK_DOOR = BLOCKS.register(DDNames.TALL_OAK, () -> new TallDoorBlock(Blocks.OAK_DOOR));
    public static final RegistryObject<Block> TALL_SPRUCE_DOOR = BLOCKS.register(DDNames.TALL_SPRUCE, () -> new TallDoorBlock(Blocks.SPRUCE_DOOR));
    public static final RegistryObject<Block> TALL_BIRCH_DOOR = BLOCKS.register(DDNames.TALL_BIRCH, () -> new TallDoorBlock(Blocks.BIRCH_DOOR));
    public static final RegistryObject<Block> TALL_JUNGLE_DOOR = BLOCKS.register(DDNames.TALL_JUNGLE, () -> new TallDoorBlock(Blocks.JUNGLE_DOOR));
    public static final RegistryObject<Block> TALL_ACACIA_DOOR = BLOCKS.register(DDNames.TALL_ACACIA, () -> new TallDoorBlock(Blocks.ACACIA_DOOR));
    public static final RegistryObject<Block> TALL_DARK_OAK_DOOR = BLOCKS.register(DDNames.TALL_DARK_OAK, () -> new TallDoorBlock(Blocks.DARK_OAK_DOOR));
    public static final RegistryObject<Block> TALL_MANGROVE_DOOR = BLOCKS.register(DDNames.TALL_MANGROVE, () -> new TallDoorBlock(Blocks.MANGROVE_DOOR));
    public static final RegistryObject<Block> TALL_BAMBOO_DOOR = BLOCKS.register(DDNames.TALL_BAMBOO, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("quark", "bamboo_door")))); //With Quark.
    public static final RegistryObject<Block> TALL_CRIMSON_DOOR = BLOCKS.register(DDNames.TALL_CRIMSON, () -> new TallDoorBlock(Blocks.CRIMSON_DOOR));
    public static final RegistryObject<Block> TALL_WARPED_DOOR = BLOCKS.register(DDNames.TALL_WARPED, () -> new TallDoorBlock(Blocks.WARPED_DOOR));

    public static Block getBlockByKey(ResourceLocation loc) {
    	return getBlockByKey(loc, Blocks.OAK_DOOR);
    }
	
    public static Block getBlockByKey(ResourceLocation loc, Block fallback) {
    	if (ForgeRegistries.BLOCKS.containsKey(loc)) {
    		return ForgeRegistries.BLOCKS.getValue(loc);
    	}
    	else {
    		return fallback; // Fallback
    	}
    }
}
