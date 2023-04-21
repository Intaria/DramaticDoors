package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DramaticDoors;
import com.fizzware.dramaticdoors.blocks.DDBlocks;
import com.fizzware.dramaticdoors.blocks.ShortDoorBlock;
import com.fizzware.dramaticdoors.blocks.ShortLeadDoorBlock;
import com.fizzware.dramaticdoors.blocks.ShortNetheriteDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallLeadDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallNetheriteDoorBlock;
import com.fizzware.dramaticdoors.items.DDItems;
import com.fizzware.dramaticdoors.items.ShortDoorItem;
import com.fizzware.dramaticdoors.items.TallDoorItem;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;

public class DDVanillaesquePackRegistry
{
	// Register doors with special functionality here.
	public static final Block SHORT_GOLD_DOOR = new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("supplementaries", "gold_door"), Blocks.IRON_DOOR));
	public static final Block TALL_GOLD_DOOR = new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("supplementaries", "gold_door"), Blocks.IRON_DOOR));
	public static final Block SHORT_SILVER_DOOR = new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("supplementaries", "silver_door"), Blocks.IRON_DOOR));
	public static final Block TALL_SILVER_DOOR = new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("supplementaries", "silver_door"), Blocks.IRON_DOOR));
	public static final Block SHORT_LEAD_DOOR = new ShortLeadDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("supplementaries", "lead_door"), Blocks.IRON_DOOR));
	public static final Block TALL_LEAD_DOOR = new TallLeadDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("supplementaries", "lead_door"), Blocks.IRON_DOOR));
	public static final Block SHORT_NETHERITE_DOOR = new ShortNetheriteDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("supplementaries", "netherite_door"), Blocks.IRON_DOOR));
	public static final Block TALL_NETHERITE_DOOR = new TallNetheriteDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("supplementaries", "netherite_door"), Blocks.IRON_DOOR));
	public static final Block SHORT_TOOTH_DOOR = new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("upgrade_aquatic", "tooth_door")));
	public static final Block TALL_TOOTH_DOOR = new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("upgrade_aquatic", "tooth_door")));
	
	@SubscribeEvent
	public static void register(RegisterEvent event) {
		event.register(ForgeRegistries.Keys.BLOCKS, helper -> {
		    // The Abnormals Mods (7 mod compats)
		    helper.register(DDNames.SHORT_ASPEN, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("atmospheric", "aspen_door"))));
		    helper.register(DDNames.SHORT_GRIMWOOD, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("atmospheric", "grimwood_door"))));
		    helper.register(DDNames.SHORT_KOUSA, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("atmospheric", "kousa_door"))));
		    helper.register(DDNames.SHORT_MORADO, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("atmospheric", "morado_door"))));
		    helper.register(DDNames.SHORT_ROSEWOOD, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("atmospheric", "rosewood_door"))));
		    helper.register(DDNames.SHORT_YUCCA, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("atmospheric", "yucca_door"))));
		    helper.register(DDNames.SHORT_MAPLE, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("autumnity", "maple_door"))));
		    helper.register(DDNames.SHORT_HONEYCOMB, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("buzzier_bees", "honeycomb_door"))));
		    helper.register(DDNames.SHORT_AZALEA, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("caverns_and_chasms", "azalea_door"))));
		    helper.register(DDNames.SHORT_POISE, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("endergetic", "poise_door"))));
		    helper.register(DDNames.SHORT_CHERRY, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("environmental", "cherry_door"))));
		    helper.register(DDNames.SHORT_WILLOW, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("environmental", "willow_door"))));
		    helper.register(DDNames.SHORT_WISTERIA, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("environmental", "wisteria_door"))));
		    helper.register(DDNames.SHORT_DRIFTWOOD, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("upgrade_aquatic", "driftwood_door"))));
		    helper.register(DDNames.SHORT_RIVER, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("upgrade_aquatic", "river_door"))));
		    helper.register(DDNames.SHORT_GLASS, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("upgrade_aquatic", "glass_door"))));
		    helper.register(DDNames.SHORT_TOOTH, SHORT_TOOTH_DOOR);
		    
		    helper.register(DDNames.TALL_ASPEN, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("atmospheric", "aspen_door"))));
		    helper.register(DDNames.TALL_GRIMWOOD, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("atmospheric", "grimwood_door"))));
		    helper.register(DDNames.TALL_KOUSA, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("atmospheric", "kousa_door"))));
		    helper.register(DDNames.TALL_MORADO, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("atmospheric", "morado_door"))));
		    helper.register(DDNames.TALL_ROSEWOOD, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("atmospheric", "rosewood_door"))));
		    helper.register(DDNames.TALL_YUCCA, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("atmospheric", "yucca_door"))));
		    helper.register(DDNames.TALL_MAPLE, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("autumnity", "maple_door"))));
		    helper.register(DDNames.TALL_HONEYCOMB, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("buzzier_bees", "honeycomb_door"))));
		    helper.register(DDNames.TALL_AZALEA, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("caverns_and_chasms", "azalea_door"))));
		    helper.register(DDNames.TALL_POISE, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("endergetic", "poise_door"))));
		    helper.register(DDNames.TALL_CHERRY, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("environmental", "cherry_door"))));
		    helper.register(DDNames.TALL_WILLOW, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("environmental", "willow_door"))));
		    helper.register(DDNames.TALL_WISTERIA, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("environmental", "wisteria_door"))));
		    helper.register(DDNames.TALL_DRIFTWOOD, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("upgrade_aquatic", "driftwood_door"))));
		    helper.register(DDNames.TALL_RIVER, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("upgrade_aquatic", "river_door"))));
		    helper.register(DDNames.TALL_GLASS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("upgrade_aquatic", "glass_door"))));
		    helper.register(DDNames.TALL_TOOTH, TALL_TOOTH_DOOR);
		    
		    // Team Aurora Mods (3 mod compats)
		    helper.register(DDNames.SHORT_JACARANDA, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("abundance", "jacaranda_door"))));
		    helper.register(DDNames.SHORT_REDBUD, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("abundance", "redbud_door"))));
		    helper.register(DDNames.SHORT_CYPRESS, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("cypress", "cypress_door"))));
		    helper.register(DDNames.SHORT_BROWN_MUSHROOM, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("enhanced_mushrooms", "brown_mushroom_door"))));
		    helper.register(DDNames.SHORT_RED_MUSHROOM, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("enhanced_mushrooms", "red_mushroom_door"))));
		    
		    helper.register(DDNames.TALL_JACARANDA, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("abundance", "jacaranda_door"))));
		    helper.register(DDNames.TALL_REDBUD, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("abundance", "redbud_door"))));
		    helper.register(DDNames.TALL_CYPRESS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("cypress", "cypress_door"))));
		    helper.register(DDNames.TALL_BROWN_MUSHROOM, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("enhanced_mushrooms", "brown_mushroom_door"))));
		    helper.register(DDNames.TALL_RED_MUSHROOM, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("enhanced_mushrooms", "red_mushroom_door"))));
		
		    // Abundant Atmosphere
		    helper.register(DDNames.SHORT_ASH, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("abundant_atmosphere", "ash_door"))));
		    helper.register(DDNames.SHORT_GOURDROT, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("abundant_atmosphere", "gourdrot_door"))));
		
		    helper.register(DDNames.TALL_ASH, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("abundant_atmosphere", "ash_door"))));
		    helper.register(DDNames.TALL_GOURDROT, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("abundant_atmosphere", "gourdrot_door"))));
		    
		    // Good Ending
		    helper.register(DDNames.SHORT_GE_CYPRESS, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("goodending", "cypress_door"))));
		    helper.register(DDNames.SHORT_GE_MUDDY_OAK, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("goodending", "muddy_oak_door"))));
		
		    helper.register(DDNames.TALL_GE_CYPRESS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("goodending", "cypress_door"))));
		    helper.register(DDNames.TALL_GE_MUDDY_OAK, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("goodending", "muddy_oak_door"))));
		    
		    // Habitat
		    helper.register(DDNames.SHORT_FAIRY_RING_MUSHROOM, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("habitat", "fairy_ring_mushroom_door"))));
		
		    helper.register(DDNames.TALL_FAIRY_RING_MUSHROOM, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("habitat", "fairy_ring_mushroom_door"))));
		    
		    // Morecraft
		    helper.register(DDNames.SHORT_MORECRAFT_NETHERBRICK, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("morecraft", "netherbrick_door")))); 
			helper.register(DDNames.SHORT_MORECRAFT_NETHERWOOD, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("morecraft", "netherwood_door"))));
			helper.register(DDNames.SHORT_MORECRAFT_NETHERITE, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("morecraft", "netherite_door"))));
			helper.register(DDNames.SHORT_MORECRAFT_GLASS, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("morecraft", "glass_door"))));
			helper.register(DDNames.SHORT_MORECRAFT_SOUL_GLASS, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("morecraft", "soul_glass_door"))));
			helper.register(DDNames.SHORT_MORECRAFT_BONE, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("morecraft", "bone_door"))));
			
		    helper.register(DDNames.TALL_MORECRAFT_NETHERBRICK, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("morecraft", "netherbrick_door")))); 
			helper.register(DDNames.TALL_MORECRAFT_NETHERWOOD, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("morecraft", "netherwood_door"))));
			helper.register(DDNames.TALL_MORECRAFT_NETHERITE, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("morecraft", "netherite_door"))));
			helper.register(DDNames.TALL_MORECRAFT_GLASS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("morecraft", "glass_door"))));
			helper.register(DDNames.TALL_MORECRAFT_SOUL_GLASS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("morecraft", "soul_glass_door"))));
			helper.register(DDNames.TALL_MORECRAFT_BONE, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("morecraft", "bone_door"))));
			
		    // New World
		    helper.register(DDNames.SHORT_FIR, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("newworld", "fir_door"))));
		
		    helper.register(DDNames.TALL_FIR, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("newworld", "fir_door"))));
		    
		    // Quark
		    helper.register(DDNames.SHORT_QUARK_ANCIENT, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("quark", "ancient_door"))));
		    helper.register(DDNames.SHORT_QUARK_AZALEA, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("quark", "azalea_door"))));
		    helper.register(DDNames.SHORT_QUARK_BLOSSOM, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("quark", "blossom_door"))));
		
		    helper.register(DDNames.TALL_QUARK_ANCIENT, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("quark", "ancient_door"))));
		    helper.register(DDNames.TALL_QUARK_AZALEA, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("quark", "azalea_door"))));
		    helper.register(DDNames.TALL_QUARK_BLOSSOM, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("quark", "blossom_door"))));
		
		    // Supplementaries
		    helper.register(DDNames.SHORT_GOLD, SHORT_GOLD_DOOR);
		    helper.register(DDNames.SHORT_SILVER, SHORT_SILVER_DOOR);
		    helper.register(DDNames.SHORT_LEAD, SHORT_LEAD_DOOR);
		    helper.register(DDNames.SHORT_NETHERITE, SHORT_NETHERITE_DOOR);
		
		    helper.register(DDNames.TALL_GOLD, TALL_GOLD_DOOR);
		    helper.register(DDNames.TALL_SILVER, TALL_SILVER_DOOR);
		    helper.register(DDNames.TALL_LEAD, TALL_LEAD_DOOR);
		    helper.register(DDNames.TALL_NETHERITE, TALL_NETHERITE_DOOR);

		    // Windswept
		    helper.register(DDNames.SHORT_CHESTNUT, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("windswept", "chestnut_door"))));
		    helper.register(DDNames.SHORT_HOLLY, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("windswept", "holly_door"))));
		    
		    helper.register(DDNames.TALL_CHESTNUT, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("windswept", "chestnut_door"))));
		    helper.register(DDNames.TALL_HOLLY, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("windswept", "holly_door"))));
		});
		event.register(ForgeRegistries.Keys.ITEMS, helper -> {
		    // The Abnormals Mods (7 mod compats)
		    helper.register(DDNames.SHORT_ASPEN, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ASPEN)), DDItems.conditionalTabProperties("atmospheric")));
		    helper.register(DDNames.SHORT_GRIMWOOD, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_GRIMWOOD)), DDItems.conditionalTabProperties("atmospheric")));
		    helper.register(DDNames.SHORT_KOUSA, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_KOUSA)), DDItems.conditionalTabProperties("atmospheric")));
		    helper.register(DDNames.SHORT_MORADO, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MORADO)), DDItems.conditionalTabProperties("atmospheric")));
		    helper.register(DDNames.SHORT_ROSEWOOD, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ROSEWOOD)), DDItems.conditionalTabProperties("atmospheric")));
		    helper.register(DDNames.SHORT_YUCCA, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_YUCCA)), DDItems.conditionalTabProperties("atmospheric")));
		    helper.register(DDNames.SHORT_MAPLE, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MAPLE)), DDItems.conditionalTabProperties("autumnity")));
		    helper.register(DDNames.SHORT_HONEYCOMB, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_HONEYCOMB)), DDItems.conditionalTabProperties("buzzier_bees")));
		    helper.register(DDNames.SHORT_AZALEA, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_AZALEA)), DDItems.conditionalTabProperties("caverns_and_chasms")));
		    helper.register(DDNames.SHORT_POISE, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_POISE)), DDItems.conditionalTabProperties("endergetic")));
		    helper.register(DDNames.SHORT_CHERRY, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CHERRY)), DDItems.conditionalTabProperties("environmental")));
		    helper.register(DDNames.SHORT_WILLOW, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_WILLOW)), DDItems.conditionalTabProperties("environmental")));
		    helper.register(DDNames.SHORT_WISTERIA, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_WISTERIA)), DDItems.conditionalTabProperties("environmental")));
		    helper.register(DDNames.SHORT_DRIFTWOOD, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_DRIFTWOOD)), DDItems.conditionalTabProperties("upgrade_aquatic")));
		    helper.register(DDNames.SHORT_RIVER, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RIVER)), DDItems.conditionalTabProperties("upgrade_aquatic")));
		    helper.register(DDNames.SHORT_GLASS, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_GLASS)), DDItems.conditionalTabProperties("upgrade_aquatic")));
		    helper.register(DDNames.SHORT_TOOTH, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TOOTH)), DDItems.conditionalTabProperties("upgrade_aquatic")));
		
		    helper.register(DDNames.TALL_ASPEN, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ASPEN)), DDItems.conditionalTabProperties("atmospheric")));
		    helper.register(DDNames.TALL_GRIMWOOD, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_GRIMWOOD)), DDItems.conditionalTabProperties("atmospheric")));
		    helper.register(DDNames.TALL_KOUSA, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_KOUSA)), DDItems.conditionalTabProperties("atmospheric")));
		    helper.register(DDNames.TALL_MORADO, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MORADO)), DDItems.conditionalTabProperties("atmospheric")));
		    helper.register(DDNames.TALL_ROSEWOOD, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ROSEWOOD)), DDItems.conditionalTabProperties("atmospheric")));
		    helper.register(DDNames.TALL_YUCCA, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_YUCCA)), DDItems.conditionalTabProperties("atmospheric")));
		    helper.register(DDNames.TALL_MAPLE, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MAPLE)), DDItems.conditionalTabProperties("autumnity")));
		    helper.register(DDNames.TALL_HONEYCOMB, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_HONEYCOMB)), DDItems.conditionalTabProperties("buzzier_bees")));
		    helper.register(DDNames.TALL_AZALEA, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_AZALEA)), DDItems.conditionalTabProperties("caverns_and_chasms")));
		    helper.register(DDNames.TALL_POISE, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_POISE)), DDItems.conditionalTabProperties("endergetic")));
		    helper.register(DDNames.TALL_CHERRY, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHERRY)), DDItems.conditionalTabProperties("environmental")));
		    helper.register(DDNames.TALL_WILLOW, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_WILLOW)), DDItems.conditionalTabProperties("environmental")));
		    helper.register(DDNames.TALL_WISTERIA, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_WISTERIA)), DDItems.conditionalTabProperties("environmental")));
		    helper.register(DDNames.TALL_DRIFTWOOD, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_DRIFTWOOD)), DDItems.conditionalTabProperties("upgrade_aquatic")));
		    helper.register(DDNames.TALL_RIVER, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RIVER)), DDItems.conditionalTabProperties("upgrade_aquatic")));
		    helper.register(DDNames.TALL_GLASS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_GLASS)), DDItems.conditionalTabProperties("upgrade_aquatic")));
		    helper.register(DDNames.TALL_TOOTH, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TOOTH)), DDItems.conditionalTabProperties("upgrade_aquatic")));
		
		    // Team Aurora Mods (3 mod compats)
		    helper.register(DDNames.SHORT_JACARANDA, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_JACARANDA)), DDItems.conditionalTabProperties("horizons")));
		    helper.register(DDNames.SHORT_REDBUD, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_REDBUD)), DDItems.conditionalTabProperties("horizons")));
		    helper.register(DDNames.SHORT_CYPRESS, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CYPRESS)), DDItems.conditionalTabProperties("horizons")));
		    helper.register(DDNames.SHORT_BROWN_MUSHROOM, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BROWN_MUSHROOM)), DDItems.conditionalTabProperties("enhanced_mushrooms")));
		    helper.register(DDNames.SHORT_RED_MUSHROOM, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RED_MUSHROOM)), DDItems.conditionalTabProperties("enhanced_mushrooms")));
		
		    helper.register(DDNames.TALL_JACARANDA, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_JACARANDA)), DDItems.conditionalTabProperties("horizons")));
		    helper.register(DDNames.TALL_REDBUD, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_REDBUD)), DDItems.conditionalTabProperties("horizons")));
		    helper.register(DDNames.TALL_CYPRESS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CYPRESS)), DDItems.conditionalTabProperties("horizons")));
		    helper.register(DDNames.TALL_BROWN_MUSHROOM, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BROWN_MUSHROOM)), DDItems.conditionalTabProperties("enhanced_mushrooms")));
		    helper.register(DDNames.TALL_RED_MUSHROOM, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RED_MUSHROOM)), DDItems.conditionalTabProperties("enhanced_mushrooms")));
		
		    // Abundant Atmosphere
		    helper.register(DDNames.SHORT_ASH, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ASH)), DDItems.conditionalTabProperties("abundant_atmosphere")));    
		    helper.register(DDNames.SHORT_GOURDROT, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_GOURDROT)), DDItems.conditionalTabProperties("abundant_atmosphere")));    
		    
		    helper.register(DDNames.TALL_ASH, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ASH)), DDItems.conditionalTabProperties("abundant_atmosphere")));    
		    helper.register(DDNames.TALL_GOURDROT, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_GOURDROT)), DDItems.conditionalTabProperties("abundant_atmosphere")));    
		    
		    // Good Ending
		    helper.register(DDNames.SHORT_GE_CYPRESS, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_GE_CYPRESS)), DDItems.conditionalTabProperties("goodending")));
		    helper.register(DDNames.SHORT_GE_MUDDY_OAK, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_GE_MUDDY_OAK)), DDItems.conditionalTabProperties("goodending")));
		    
		    helper.register(DDNames.TALL_GE_CYPRESS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_GE_CYPRESS)), DDItems.conditionalTabProperties("goodending")));
		    helper.register(DDNames.TALL_GE_MUDDY_OAK, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_GE_MUDDY_OAK)), DDItems.conditionalTabProperties("goodending")));
		    
		    // Habitat
		    helper.register(DDNames.SHORT_FAIRY_RING_MUSHROOM, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_FAIRY_RING_MUSHROOM)), DDItems.addIfItemIsAvailable(new ResourceLocation("habitat", "fairy_ring_mushroom_door"), DDItems.conditionalTabProperties("habitat"))));
		    
		    helper.register(DDNames.TALL_FAIRY_RING_MUSHROOM, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_FAIRY_RING_MUSHROOM)), DDItems.addIfItemIsAvailable(new ResourceLocation("habitat", "fairy_ring_mushroom_door"), DDItems.conditionalTabProperties("habitat"))));
		    
		    // Morecraft
		    helper.register(DDNames.SHORT_MORECRAFT_NETHERBRICK, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MORECRAFT_NETHERBRICK)), DDItems.conditionalTabProperties("morecraft")));
		    helper.register(DDNames.SHORT_MORECRAFT_NETHERWOOD, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MORECRAFT_NETHERWOOD)), DDItems.conditionalTabProperties("morecraft")));
		    helper.register(DDNames.SHORT_MORECRAFT_NETHERITE, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MORECRAFT_NETHERITE)), DDItems.conditionalTabProperties("morecraft").fireResistant()));
			helper.register(DDNames.SHORT_MORECRAFT_GLASS, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MORECRAFT_GLASS)), DDItems.conditionalTabProperties("morecraft")));
			helper.register(DDNames.SHORT_MORECRAFT_SOUL_GLASS, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MORECRAFT_SOUL_GLASS)), DDItems.conditionalTabProperties("morecraft")));
		    helper.register(DDNames.SHORT_MORECRAFT_BONE, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MORECRAFT_BONE)), DDItems.conditionalTabProperties("morecraft")));
		    
		    helper.register(DDNames.TALL_MORECRAFT_NETHERBRICK, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MORECRAFT_NETHERBRICK)), DDItems.conditionalTabProperties("morecraft")));
		    helper.register(DDNames.TALL_MORECRAFT_NETHERWOOD, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MORECRAFT_NETHERWOOD)), DDItems.conditionalTabProperties("morecraft")));
		    helper.register(DDNames.TALL_MORECRAFT_NETHERITE, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MORECRAFT_NETHERITE)), DDItems.conditionalTabProperties("morecraft").fireResistant()));
			helper.register(DDNames.TALL_MORECRAFT_GLASS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MORECRAFT_GLASS)), DDItems.conditionalTabProperties("morecraft")));
			helper.register(DDNames.TALL_MORECRAFT_SOUL_GLASS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MORECRAFT_SOUL_GLASS)), DDItems.conditionalTabProperties("morecraft")));
		    helper.register(DDNames.TALL_MORECRAFT_BONE, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MORECRAFT_BONE)), DDItems.conditionalTabProperties("morecraft")));
		    
		    // New World
		    helper.register(DDNames.SHORT_FIR, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_FIR)), DDItems.conditionalTabProperties("newworld")));
		
		    helper.register(DDNames.TALL_FIR, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_FIR)), DDItems.conditionalTabProperties("newworld")));
		    
		    // Quark
		    helper.register(DDNames.SHORT_QUARK_ANCIENT, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_QUARK_ANCIENT)), DDItems.addIfItemIsAvailable(new ResourceLocation("quark", "ancient_door"), DDItems.conditionalTabProperties("quark"))));
		    helper.register(DDNames.SHORT_QUARK_AZALEA, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_QUARK_AZALEA)), DDItems.conditionalTabProperties("quark")));
		    helper.register(DDNames.SHORT_QUARK_BLOSSOM, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_QUARK_BLOSSOM)), DDItems.conditionalTabProperties("quark")));
		    
		    helper.register(DDNames.TALL_QUARK_ANCIENT, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_QUARK_ANCIENT)), DDItems.addIfItemIsAvailable(new ResourceLocation("quark", "ancient_door"), DDItems.conditionalTabProperties("quark"))));
		    helper.register(DDNames.TALL_QUARK_AZALEA, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_QUARK_AZALEA)), DDItems.conditionalTabProperties("quark")));
		    helper.register(DDNames.TALL_QUARK_BLOSSOM, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_QUARK_BLOSSOM)), DDItems.conditionalTabProperties("quark")));
		    
		    // Supplementaries
		    helper.register(DDNames.SHORT_GOLD, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_GOLD)), DDItems.conditionalTabProperties("supplementaries")));
		    helper.register(DDNames.SHORT_SILVER, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_SILVER)), DDItems.addIfItemIsAvailable(new ResourceLocation("supplementaries", "silver_door"), DDItems.conditionalTabProperties("supplementaries"))));
		    helper.register(DDNames.SHORT_LEAD, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_LEAD)), DDItems.addIfItemIsAvailable(new ResourceLocation("supplementaries", "lead_door"), DDItems.conditionalTabProperties("supplementaries"))));
		    helper.register(DDNames.SHORT_NETHERITE, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_NETHERITE)), DDItems.conditionalTabProperties("supplementaries").fireResistant()));
		    
		    helper.register(DDNames.TALL_GOLD, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_GOLD)), DDItems.conditionalTabProperties("supplementaries")));
		    helper.register(DDNames.TALL_SILVER, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_SILVER)), DDItems.addIfItemIsAvailable(new ResourceLocation("supplementaries", "silver_door"), DDItems.conditionalTabProperties("supplementaries"))));
		    helper.register(DDNames.TALL_LEAD, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_LEAD)), DDItems.addIfItemIsAvailable(new ResourceLocation("supplementaries", "lead_door"), DDItems.conditionalTabProperties("supplementaries"))));
		    helper.register(DDNames.TALL_NETHERITE, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_NETHERITE)), DDItems.conditionalTabProperties("supplementaries").fireResistant()));

		    // Windswept
		    helper.register(DDNames.SHORT_CHESTNUT, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CHESTNUT)), DDItems.conditionalTabProperties("windswept")));
		    helper.register(DDNames.SHORT_HOLLY, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_HOLLY)), DDItems.conditionalTabProperties("windswept")));    
		
		    helper.register(DDNames.TALL_CHESTNUT, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHESTNUT)), DDItems.conditionalTabProperties("windswept")));
		    helper.register(DDNames.TALL_HOLLY, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_HOLLY)), DDItems.conditionalTabProperties("windswept")));    
		    
		});
	}
	
}
