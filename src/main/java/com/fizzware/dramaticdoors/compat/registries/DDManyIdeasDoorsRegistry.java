package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DramaticDoors;
import com.fizzware.dramaticdoors.blocks.DDBlocks;
import com.fizzware.dramaticdoors.blocks.TallDoorBlock;
import com.fizzware.dramaticdoors.items.DDItems;
import com.fizzware.dramaticdoors.items.TallDoorItem;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;

public class DDManyIdeasDoorsRegistry
{
	@SubscribeEvent
	public static void register(RegisterEvent event) {
		event.register(ForgeRegistries.Keys.BLOCKS, helper -> {
			helper.register(DDNames.TALL_MANYIDEAS_COPPER_BAR, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_copper_bar"), Blocks.IRON_DOOR)));
			helper.register(DDNames.TALL_MANYIDEAS_COPPER_BARREL, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_copper_barrel"), Blocks.IRON_DOOR)));
			helper.register(DDNames.TALL_MANYIDEAS_COPPER_BRICK, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_copper_brick"), Blocks.IRON_DOOR)));
			helper.register(DDNames.TALL_MANYIDEAS_COPPER_CORRUGATED, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_copper_corrugated"), Blocks.IRON_DOOR)));
			helper.register(DDNames.TALL_MANYIDEAS_COPPER_FACTORY, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_copper_factory"), Blocks.IRON_DOOR)));
			helper.register(DDNames.TALL_MANYIDEAS_COPPER_GLASS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_copper_glass"), Blocks.IRON_DOOR)));
			helper.register(DDNames.TALL_MANYIDEAS_COPPER_MODERN, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_copper_modern"), Blocks.IRON_DOOR)));
			helper.register(DDNames.TALL_MANYIDEAS_COPPER_SHIP, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_copper_ship"), Blocks.IRON_DOOR)));
			helper.register(DDNames.TALL_MANYIDEAS_COPPER_SMOOTH_SANDSTONE, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_copper_smooth_sandstone"), Blocks.IRON_DOOR)));
			helper.register(DDNames.TALL_MANYIDEAS_COPPER_STEAMPUNK, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_copper_steampunk"), Blocks.IRON_DOOR)));

			helper.register(DDNames.TALL_MANYIDEAS_IRON_BOOKSHELF, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_iron_bookshelf"), Blocks.IRON_DOOR)));
			helper.register(DDNames.TALL_MANYIDEAS_IRON_DWARF, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_iron_dwarf"), Blocks.IRON_DOOR)));
			helper.register(DDNames.TALL_MANYIDEAS_IRON_FANTASY, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_iron_fantasy"), Blocks.IRON_DOOR)));
			helper.register(DDNames.TALL_MANYIDEAS_IRON_GLASS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_iron_glass"), Blocks.IRON_DOOR)));
			helper.register(DDNames.TALL_MANYIDEAS_IRON_LABORATORY, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_iron_laboratory"), Blocks.IRON_DOOR)));
			helper.register(DDNames.TALL_MANYIDEAS_IRON_RUSTED, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_iron_rusted"), Blocks.IRON_DOOR)));
			helper.register(DDNames.TALL_MANYIDEAS_IRON_SAFE, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_iron_safe"), Blocks.IRON_DOOR)));
			helper.register(DDNames.TALL_MANYIDEAS_IRON_SHIP, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_iron_ship"), Blocks.IRON_DOOR)));
			helper.register(DDNames.TALL_MANYIDEAS_IRON_SPACE, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_iron_space"), Blocks.IRON_DOOR)));
			helper.register(DDNames.TALL_MANYIDEAS_IRON_STONE_BRICK, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_iron_stone_brick"), Blocks.IRON_DOOR)));

			helper.register(DDNames.TALL_MANYIDEAS_OAK_BLANK, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_oak_blank"))));
			helper.register(DDNames.TALL_MANYIDEAS_OAK_BOOKSHELF, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_oak_bookshelf"))));
			helper.register(DDNames.TALL_MANYIDEAS_OAK_CASSETTE, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_oak_cassette"))));
			helper.register(DDNames.TALL_MANYIDEAS_OAK_FRENCH, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_oak_french"))));
			helper.register(DDNames.TALL_MANYIDEAS_OAK_FROSTED, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_oak_frosted"))));
			helper.register(DDNames.TALL_MANYIDEAS_OAK_GLASS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_oak_glass"))));
			helper.register(DDNames.TALL_MANYIDEAS_OAK_HEART, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_oak_heart"))));
			helper.register(DDNames.TALL_MANYIDEAS_OAK_ORIGIN, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_oak_origin"))));
			helper.register(DDNames.TALL_MANYIDEAS_OAK_RUSTIC, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_oak_rustic"))));
			helper.register(DDNames.TALL_MANYIDEAS_OAK_SHOJI, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_oak_shoji"))));

			helper.register(DDNames.TALL_MANYIDEAS_SPRUCE_BLANK, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_spruce_blank"))));
			helper.register(DDNames.TALL_MANYIDEAS_SPRUCE_BOOKSHELF, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_spruce_bookshelf"))));
			helper.register(DDNames.TALL_MANYIDEAS_SPRUCE_CASSETTE, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_spruce_cassette"))));
			helper.register(DDNames.TALL_MANYIDEAS_SPRUCE_FRENCH, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_spruce_french"))));
			helper.register(DDNames.TALL_MANYIDEAS_SPRUCE_FROSTED, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_spruce_frosted"))));
			helper.register(DDNames.TALL_MANYIDEAS_SPRUCE_GLASS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_spruce_glass"))));
			helper.register(DDNames.TALL_MANYIDEAS_SPRUCE_HEART, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_spruce_heart"))));
			helper.register(DDNames.TALL_MANYIDEAS_SPRUCE_ORIGIN, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_spruce_origin"))));
			helper.register(DDNames.TALL_MANYIDEAS_SPRUCE_RUSTIC, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_spruce_rustic"))));
			helper.register(DDNames.TALL_MANYIDEAS_SPRUCE_SHOJI, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_spruce_shoji"))));

			helper.register(DDNames.TALL_MANYIDEAS_BIRCH_BLANK, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_birch_blank"))));
			helper.register(DDNames.TALL_MANYIDEAS_BIRCH_BOOKSHELF, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_birch_bookshelf"))));
			helper.register(DDNames.TALL_MANYIDEAS_BIRCH_CASSETTE, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_birch_cassette"))));
			helper.register(DDNames.TALL_MANYIDEAS_BIRCH_FRENCH, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_birch_french"))));
			helper.register(DDNames.TALL_MANYIDEAS_BIRCH_FROSTED, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_birch_frosted"))));
			helper.register(DDNames.TALL_MANYIDEAS_BIRCH_GLASS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_birch_glass"))));
			helper.register(DDNames.TALL_MANYIDEAS_BIRCH_HEART, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_birch_heart"))));
			helper.register(DDNames.TALL_MANYIDEAS_BIRCH_ORIGIN, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_birch_origin"))));
			helper.register(DDNames.TALL_MANYIDEAS_BIRCH_RUSTIC, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_birch_rustic"))));
			helper.register(DDNames.TALL_MANYIDEAS_BIRCH_SHOJI, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_birch_shoji"))));

			helper.register(DDNames.TALL_MANYIDEAS_JUNGLE_BLANK, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_jungle_blank"))));
			helper.register(DDNames.TALL_MANYIDEAS_JUNGLE_BOOKSHELF, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_jungle_bookshelf"))));
			helper.register(DDNames.TALL_MANYIDEAS_JUNGLE_CASSETTE, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_jungle_cassette"))));
			helper.register(DDNames.TALL_MANYIDEAS_JUNGLE_FRENCH, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_jungle_french"))));
			helper.register(DDNames.TALL_MANYIDEAS_JUNGLE_FROSTED, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_jungle_frosted"))));
			helper.register(DDNames.TALL_MANYIDEAS_JUNGLE_GLASS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_jungle_glass"))));
			helper.register(DDNames.TALL_MANYIDEAS_JUNGLE_HEART, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_jungle_heart"))));
			helper.register(DDNames.TALL_MANYIDEAS_JUNGLE_ORIGIN, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_jungle_origin"))));
			helper.register(DDNames.TALL_MANYIDEAS_JUNGLE_RUSTIC, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_jungle_rustic"))));
			helper.register(DDNames.TALL_MANYIDEAS_JUNGLE_SHOJI, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_jungle_shoji"))));

			helper.register(DDNames.TALL_MANYIDEAS_ACACIA_BLANK, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_acacia_blank"))));
			helper.register(DDNames.TALL_MANYIDEAS_ACACIA_BOOKSHELF, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_acacia_bookshelf"))));
			helper.register(DDNames.TALL_MANYIDEAS_ACACIA_CASSETTE, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_acacia_cassette"))));
			helper.register(DDNames.TALL_MANYIDEAS_ACACIA_FRENCH, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_acacia_french"))));
			helper.register(DDNames.TALL_MANYIDEAS_ACACIA_FROSTED, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_acacia_frosted"))));
			helper.register(DDNames.TALL_MANYIDEAS_ACACIA_GLASS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_acacia_glass"))));
			helper.register(DDNames.TALL_MANYIDEAS_ACACIA_HEART, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_acacia_heart"))));
			helper.register(DDNames.TALL_MANYIDEAS_ACACIA_ORIGIN, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_acacia_origin"))));
			helper.register(DDNames.TALL_MANYIDEAS_ACACIA_RUSTIC, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_acacia_rustic"))));
			helper.register(DDNames.TALL_MANYIDEAS_ACACIA_SHOJI, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_acacia_shoji"))));

			helper.register(DDNames.TALL_MANYIDEAS_DARK_OAK_BLANK, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_dark_oak_blank"))));
			helper.register(DDNames.TALL_MANYIDEAS_DARK_OAK_BOOKSHELF, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_dark_oak_bookshelf"))));
			helper.register(DDNames.TALL_MANYIDEAS_DARK_OAK_CASSETTE, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_dark_oak_cassette"))));
			helper.register(DDNames.TALL_MANYIDEAS_DARK_OAK_FRENCH, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_dark_oak_french"))));
			helper.register(DDNames.TALL_MANYIDEAS_DARK_OAK_FROSTED, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_dark_oak_frosted"))));
			helper.register(DDNames.TALL_MANYIDEAS_DARK_OAK_GLASS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_dark_oak_glass"))));
			helper.register(DDNames.TALL_MANYIDEAS_DARK_OAK_HEART, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_dark_oak_heart"))));
			helper.register(DDNames.TALL_MANYIDEAS_DARK_OAK_ORIGIN, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_dark_oak_origin"))));
			helper.register(DDNames.TALL_MANYIDEAS_DARK_OAK_RUSTIC, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_dark_oak_rustic"))));
			helper.register(DDNames.TALL_MANYIDEAS_DARK_OAK_SHOJI, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_dark_oak_shoji"))));

			helper.register(DDNames.TALL_MANYIDEAS_MANGROVE_BLANK, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_mangrove_blank"))));
			helper.register(DDNames.TALL_MANYIDEAS_MANGROVE_BOOKSHELF, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_mangrove_bookshelf"))));
			helper.register(DDNames.TALL_MANYIDEAS_MANGROVE_CASSETTE, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_mangrove_cassette"))));
			helper.register(DDNames.TALL_MANYIDEAS_MANGROVE_FRENCH, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_mangrove_french"))));
			helper.register(DDNames.TALL_MANYIDEAS_MANGROVE_FROSTED, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_mangrove_frosted"))));
			helper.register(DDNames.TALL_MANYIDEAS_MANGROVE_GLASS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_mangrove_glass"))));
			helper.register(DDNames.TALL_MANYIDEAS_MANGROVE_HEART, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_mangrove_heart"))));
			helper.register(DDNames.TALL_MANYIDEAS_MANGROVE_ORIGIN, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_mangrove_origin"))));
			helper.register(DDNames.TALL_MANYIDEAS_MANGROVE_RUSTIC, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_mangrove_rustic"))));
			helper.register(DDNames.TALL_MANYIDEAS_MANGROVE_SHOJI, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_mangrove_shoji"))));

			helper.register(DDNames.TALL_MANYIDEAS_CRIMSON_BLANK, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_crimson_blank"))));
			helper.register(DDNames.TALL_MANYIDEAS_CRIMSON_BOOKSHELF, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_crimson_bookshelf"))));
			helper.register(DDNames.TALL_MANYIDEAS_CRIMSON_CASSETTE, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_crimson_cassette"))));
			helper.register(DDNames.TALL_MANYIDEAS_CRIMSON_FRENCH, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_crimson_french"))));
			helper.register(DDNames.TALL_MANYIDEAS_CRIMSON_FROSTED, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_crimson_frosted"))));
			helper.register(DDNames.TALL_MANYIDEAS_CRIMSON_GLASS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_crimson_glass"))));
			helper.register(DDNames.TALL_MANYIDEAS_CRIMSON_HEART, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_crimson_heart"))));
			helper.register(DDNames.TALL_MANYIDEAS_CRIMSON_ORIGIN, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_crimson_origin"))));
			helper.register(DDNames.TALL_MANYIDEAS_CRIMSON_RUSTIC, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_crimson_rustic"))));
			helper.register(DDNames.TALL_MANYIDEAS_CRIMSON_SHOJI, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_crimson_shoji"))));

			helper.register(DDNames.TALL_MANYIDEAS_WARPED_BLANK, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_warped_blank"))));
			helper.register(DDNames.TALL_MANYIDEAS_WARPED_BOOKSHELF, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_warped_bookshelf"))));
			helper.register(DDNames.TALL_MANYIDEAS_WARPED_CASSETTE, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_warped_cassette"))));
			helper.register(DDNames.TALL_MANYIDEAS_WARPED_FRENCH, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_warped_french"))));
			helper.register(DDNames.TALL_MANYIDEAS_WARPED_FROSTED, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_warped_frosted"))));
			helper.register(DDNames.TALL_MANYIDEAS_WARPED_GLASS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_warped_glass"))));
			helper.register(DDNames.TALL_MANYIDEAS_WARPED_HEART, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_warped_heart"))));
			helper.register(DDNames.TALL_MANYIDEAS_WARPED_ORIGIN, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_warped_origin"))));
			helper.register(DDNames.TALL_MANYIDEAS_WARPED_RUSTIC, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_warped_rustic"))));
			helper.register(DDNames.TALL_MANYIDEAS_WARPED_SHOJI, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_warped_shoji"))));
		});
		event.register(ForgeRegistries.Keys.ITEMS, helper -> {
			helper.register(DDNames.TALL_MANYIDEAS_COPPER_BAR, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_COPPER_BAR)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_COPPER_BARREL, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_COPPER_BARREL)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_COPPER_BRICK, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_COPPER_BRICK)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_COPPER_CORRUGATED, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_COPPER_CORRUGATED)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_COPPER_FACTORY, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_COPPER_FACTORY)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_COPPER_GLASS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_COPPER_GLASS)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_COPPER_MODERN, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_COPPER_MODERN)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_COPPER_SHIP, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_COPPER_SHIP)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_COPPER_SMOOTH_SANDSTONE, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_COPPER_SMOOTH_SANDSTONE)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_COPPER_STEAMPUNK, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_COPPER_STEAMPUNK)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));

			helper.register(DDNames.TALL_MANYIDEAS_IRON_BOOKSHELF, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_IRON_BOOKSHELF)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_IRON_DWARF, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_IRON_DWARF)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_IRON_FANTASY, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_IRON_FANTASY)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_IRON_GLASS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_IRON_GLASS)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_IRON_LABORATORY, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_IRON_LABORATORY)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_IRON_RUSTED, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_IRON_RUSTED)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_IRON_SAFE, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_IRON_SAFE)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_IRON_SHIP, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_IRON_SHIP)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_IRON_SPACE, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_IRON_SPACE)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_IRON_STONE_BRICK, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_IRON_STONE_BRICK)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));

			helper.register(DDNames.TALL_MANYIDEAS_OAK_BLANK, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_OAK_BLANK)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_OAK_BOOKSHELF, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_OAK_BOOKSHELF)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_OAK_CASSETTE, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_OAK_CASSETTE)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_OAK_FRENCH, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_OAK_FRENCH)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_OAK_FROSTED, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_OAK_FROSTED)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_OAK_GLASS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_OAK_GLASS)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_OAK_HEART, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_OAK_HEART)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_OAK_ORIGIN, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_OAK_ORIGIN)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_OAK_RUSTIC, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_OAK_RUSTIC)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_OAK_SHOJI, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_OAK_SHOJI)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));

			helper.register(DDNames.TALL_MANYIDEAS_SPRUCE_BLANK, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_SPRUCE_BLANK)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_SPRUCE_BOOKSHELF, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_SPRUCE_BOOKSHELF)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_SPRUCE_CASSETTE, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_SPRUCE_CASSETTE)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_SPRUCE_FRENCH, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_SPRUCE_FRENCH)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_SPRUCE_FROSTED, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_SPRUCE_FROSTED)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_SPRUCE_GLASS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_SPRUCE_GLASS)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_SPRUCE_HEART, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_SPRUCE_HEART)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_SPRUCE_ORIGIN, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_SPRUCE_ORIGIN)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_SPRUCE_RUSTIC, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_SPRUCE_RUSTIC)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_SPRUCE_SHOJI, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_SPRUCE_SHOJI)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));

			helper.register(DDNames.TALL_MANYIDEAS_BIRCH_BLANK, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_BIRCH_BLANK)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_BIRCH_BOOKSHELF, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_BIRCH_BOOKSHELF)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_BIRCH_CASSETTE, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_BIRCH_CASSETTE)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_BIRCH_FRENCH, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_BIRCH_FRENCH)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_BIRCH_FROSTED, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_BIRCH_FROSTED)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_BIRCH_GLASS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_BIRCH_GLASS)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_BIRCH_HEART, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_BIRCH_HEART)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_BIRCH_ORIGIN, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_BIRCH_ORIGIN)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_BIRCH_RUSTIC, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_BIRCH_RUSTIC)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_BIRCH_SHOJI, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_BIRCH_SHOJI)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));

			helper.register(DDNames.TALL_MANYIDEAS_JUNGLE_BLANK, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_JUNGLE_BLANK)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_JUNGLE_BOOKSHELF, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_JUNGLE_BOOKSHELF)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_JUNGLE_CASSETTE, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_JUNGLE_CASSETTE)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_JUNGLE_FRENCH, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_JUNGLE_FRENCH)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_JUNGLE_FROSTED, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_JUNGLE_FROSTED)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_JUNGLE_GLASS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_JUNGLE_GLASS)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_JUNGLE_HEART, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_JUNGLE_HEART)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_JUNGLE_ORIGIN, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_JUNGLE_ORIGIN)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_JUNGLE_RUSTIC, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_JUNGLE_RUSTIC)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_JUNGLE_SHOJI, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_JUNGLE_SHOJI)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));

			helper.register(DDNames.TALL_MANYIDEAS_ACACIA_BLANK, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_ACACIA_BLANK)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_ACACIA_BOOKSHELF, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_ACACIA_BOOKSHELF)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_ACACIA_CASSETTE, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_ACACIA_CASSETTE)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_ACACIA_FRENCH, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_ACACIA_FRENCH)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_ACACIA_FROSTED, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_ACACIA_FROSTED)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_ACACIA_GLASS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_ACACIA_GLASS)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_ACACIA_HEART, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_ACACIA_HEART)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_ACACIA_ORIGIN, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_ACACIA_ORIGIN)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_ACACIA_RUSTIC, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_ACACIA_RUSTIC)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_ACACIA_SHOJI, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_ACACIA_SHOJI)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));

			helper.register(DDNames.TALL_MANYIDEAS_DARK_OAK_BLANK, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_DARK_OAK_BLANK)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_DARK_OAK_BOOKSHELF, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_DARK_OAK_BOOKSHELF)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_DARK_OAK_CASSETTE, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_DARK_OAK_CASSETTE)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_DARK_OAK_FRENCH, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_DARK_OAK_FRENCH)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_DARK_OAK_FROSTED, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_DARK_OAK_FROSTED)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_DARK_OAK_GLASS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_DARK_OAK_GLASS)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_DARK_OAK_HEART, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_DARK_OAK_HEART)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_DARK_OAK_ORIGIN, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_DARK_OAK_ORIGIN)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_DARK_OAK_RUSTIC, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_DARK_OAK_RUSTIC)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_DARK_OAK_SHOJI, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_DARK_OAK_SHOJI)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));

			helper.register(DDNames.TALL_MANYIDEAS_MANGROVE_BLANK, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_MANGROVE_BLANK)), DDItems.addIfItemIsAvailable(new ResourceLocation("manyideas_doors", "door_mangrove_blank"), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB))));
			helper.register(DDNames.TALL_MANYIDEAS_MANGROVE_BOOKSHELF, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_MANGROVE_BOOKSHELF)), DDItems.addIfItemIsAvailable(new ResourceLocation("manyideas_doors", "door_mangrove_bookshelf"), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB))));
			helper.register(DDNames.TALL_MANYIDEAS_MANGROVE_CASSETTE, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_MANGROVE_CASSETTE)), DDItems.addIfItemIsAvailable(new ResourceLocation("manyideas_doors", "door_mangrove_cassette"), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB))));
			helper.register(DDNames.TALL_MANYIDEAS_MANGROVE_FRENCH, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_MANGROVE_FRENCH)), DDItems.addIfItemIsAvailable(new ResourceLocation("manyideas_doors", "door_mangrove_french"), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB))));
			helper.register(DDNames.TALL_MANYIDEAS_MANGROVE_FROSTED, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_MANGROVE_FROSTED)), DDItems.addIfItemIsAvailable(new ResourceLocation("manyideas_doors", "door_mangrove_frosted"), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB))));
			helper.register(DDNames.TALL_MANYIDEAS_MANGROVE_GLASS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_MANGROVE_GLASS)), DDItems.addIfItemIsAvailable(new ResourceLocation("manyideas_doors", "door_mangrove_glass"), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB))));
			helper.register(DDNames.TALL_MANYIDEAS_MANGROVE_HEART, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_MANGROVE_HEART)), DDItems.addIfItemIsAvailable(new ResourceLocation("manyideas_doors", "door_mangrove_heart"), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB))));
			helper.register(DDNames.TALL_MANYIDEAS_MANGROVE_ORIGIN, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_MANGROVE_ORIGIN)), DDItems.addIfItemIsAvailable(new ResourceLocation("manyideas_doors", "door_mangrove_origin"), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB))));
			helper.register(DDNames.TALL_MANYIDEAS_MANGROVE_RUSTIC, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_MANGROVE_RUSTIC)), DDItems.addIfItemIsAvailable(new ResourceLocation("manyideas_doors", "door_mangrove_rustic"), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB))));
			helper.register(DDNames.TALL_MANYIDEAS_MANGROVE_SHOJI, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_MANGROVE_SHOJI)), DDItems.addIfItemIsAvailable(new ResourceLocation("manyideas_doors", "door_mangrove_shoji"), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB))));

			helper.register(DDNames.TALL_MANYIDEAS_CRIMSON_BLANK, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_CRIMSON_BLANK)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_CRIMSON_BOOKSHELF, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_CRIMSON_BOOKSHELF)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_CRIMSON_CASSETTE, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_CRIMSON_CASSETTE)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_CRIMSON_FRENCH, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_CRIMSON_FRENCH)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_CRIMSON_FROSTED, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_CRIMSON_FROSTED)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_CRIMSON_GLASS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_CRIMSON_GLASS)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_CRIMSON_HEART, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_CRIMSON_HEART)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_CRIMSON_ORIGIN, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_CRIMSON_ORIGIN)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_CRIMSON_RUSTIC, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_CRIMSON_RUSTIC)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_CRIMSON_SHOJI, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_CRIMSON_SHOJI)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));

			helper.register(DDNames.TALL_MANYIDEAS_WARPED_BLANK, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_WARPED_BLANK)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_WARPED_BOOKSHELF, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_WARPED_BOOKSHELF)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_WARPED_CASSETTE, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_WARPED_CASSETTE)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_WARPED_FRENCH, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_WARPED_FRENCH)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_WARPED_FROSTED, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_WARPED_FROSTED)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_WARPED_GLASS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_WARPED_GLASS)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_WARPED_HEART, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_WARPED_HEART)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_WARPED_ORIGIN, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_WARPED_ORIGIN)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_WARPED_RUSTIC, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_WARPED_RUSTIC)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
			helper.register(DDNames.TALL_MANYIDEAS_WARPED_SHOJI, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_WARPED_SHOJI)), DDItems.conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
		});
	}
}
