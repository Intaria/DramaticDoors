package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DramaticDoors;
import com.fizzware.dramaticdoors.blocks.DDBlocks;
import com.fizzware.dramaticdoors.blocks.ShortCopperDoorBlock;
import com.fizzware.dramaticdoors.blocks.ShortDoorBlock;
import com.fizzware.dramaticdoors.blocks.ShortFleshDoorBlock;
import com.fizzware.dramaticdoors.blocks.ShortFullFleshDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallCopperDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallFleshDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallFullFleshDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallStableDoorBlock;
import com.fizzware.dramaticdoors.items.DDItems;
import com.fizzware.dramaticdoors.items.ShortDoorItem;
import com.fizzware.dramaticdoors.items.TallDoorItem;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.WeatheringCopper.WeatherState;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;

public class DDMiscPackRegistry
{
	// Create referencable doors.
	public static final Block SHORT_COPPER_DOOR = new ShortCopperDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("everythingcopper", "copper_door"), Blocks.IRON_DOOR), WeatherState.UNAFFECTED);
	public static final Block SHORT_EXPOSED_COPPER_DOOR = new ShortCopperDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("everythingcopper", "exposed_copper_door"), Blocks.IRON_DOOR), WeatherState.EXPOSED);
	public static final Block SHORT_WEATHERED_COPPER_DOOR = new ShortCopperDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("everythingcopper", "weathered_copper_door"), Blocks.IRON_DOOR), WeatherState.WEATHERED);
	public static final Block SHORT_OXIDIZED_COPPER_DOOR = new ShortCopperDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("everythingcopper", "oxidized_copper_door"), Blocks.IRON_DOOR), WeatherState.OXIDIZED);
	public static final Block SHORT_WAXED_COPPER_DOOR = new ShortCopperDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("everythingcopper", "waxed_copper_door"), Blocks.IRON_DOOR), WeatherState.UNAFFECTED);
	public static final Block SHORT_WAXED_EXPOSED_COPPER_DOOR = new ShortCopperDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("everythingcopper", "waxed_exposed_copper_door"), Blocks.IRON_DOOR), WeatherState.EXPOSED);
	public static final Block SHORT_WAXED_WEATHERED_COPPER_DOOR = new ShortCopperDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("everythingcopper", "waxed_weathered_copper_door"), Blocks.IRON_DOOR), WeatherState.WEATHERED);
	public static final Block SHORT_WAXED_OXIDIZED_COPPER_DOOR = new ShortCopperDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("everythingcopper", "waxed_oxidized_copper_door"), Blocks.IRON_DOOR), WeatherState.OXIDIZED);
	public static final Block TALL_COPPER_DOOR = new TallCopperDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("everythingcopper", "copper_door"), Blocks.IRON_DOOR), WeatherState.UNAFFECTED);
	public static final Block TALL_EXPOSED_COPPER_DOOR = new TallCopperDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("everythingcopper", "exposed_copper_door"), Blocks.IRON_DOOR), WeatherState.EXPOSED);
	public static final Block TALL_WEATHERED_COPPER_DOOR = new TallCopperDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("everythingcopper", "weathered_copper_door"), Blocks.IRON_DOOR), WeatherState.WEATHERED);
	public static final Block TALL_OXIDIZED_COPPER_DOOR = new TallCopperDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("everythingcopper", "oxidized_copper_door"), Blocks.IRON_DOOR), WeatherState.OXIDIZED);
	public static final Block TALL_WAXED_COPPER_DOOR = new TallCopperDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("everythingcopper", "waxed_copper_door"), Blocks.IRON_DOOR), WeatherState.UNAFFECTED);
	public static final Block TALL_WAXED_EXPOSED_COPPER_DOOR = new TallCopperDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("everythingcopper", "waxed_exposed_copper_door"), Blocks.IRON_DOOR), WeatherState.EXPOSED);
	public static final Block TALL_WAXED_WEATHERED_COPPER_DOOR = new TallCopperDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("everythingcopper", "waxed_weathered_copper_door"), Blocks.IRON_DOOR), WeatherState.WEATHERED);
	public static final Block TALL_WAXED_OXIDIZED_COPPER_DOOR = new TallCopperDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("everythingcopper", "waxed_oxidized_copper_door"), Blocks.IRON_DOOR), WeatherState.OXIDIZED);
	
	// Register doors with special functionality here.
	@SubscribeEvent
	public static void register(RegisterEvent event) {
		event.register(ForgeRegistries.Keys.BLOCKS, helper -> {
			// Architects Palette
		    helper.register(DDNames.SHORT_TWISTED, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("architects_palette", "twisted_door"))));
		
		    helper.register(DDNames.TALL_TWISTED, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("architects_palette", "twisted_door"))));
		
		    // Bamboo Everything
		    helper.register(DDNames.SHORT_BE_BAMBOO, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("bambooeverything", "bamboo_door"))));
		    helper.register(DDNames.SHORT_BE_DRY_BAMBOO, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("bambooeverything", "dry_bamboo_door"))));
		
		    helper.register(DDNames.TALL_BE_BAMBOO, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("bambooeverything", "bamboo_door"))));
		    helper.register(DDNames.TALL_BE_DRY_BAMBOO, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("bambooeverything", "dry_bamboo_door"))));
		    
		    // Biomancy
		    helper.register(DDNames.SHORT_FLESH, new ShortFleshDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("biomancy", "flesh_door"))));    
		    helper.register(DDNames.SHORT_FULL_FLESH, new ShortFullFleshDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("biomancy", "flesh_door"))));    
		    helper.register(DDNames.SHORT_FLESHKIN, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("biomancy", "flesh_door"))));    
		    
		    helper.register(DDNames.TALL_FLESH, new TallFleshDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("biomancy", "flesh_door"))));    
		    helper.register(DDNames.TALL_FULL_FLESH, new TallFullFleshDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("biomancy", "flesh_door"))));    
		    helper.register(DDNames.TALL_FLESHKIN, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("biomancy", "flesh_door"))));    
		    
		    //Blocks Plus
		    helper.register(DDNames.SHORT_BP_BAMBOO, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("blocksplus", "bamboo_door"))));
		    helper.register(DDNames.SHORT_BP_MUSHROOM, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("blocksplus", "mushroom_door"))));
		    helper.register(DDNames.SHORT_BP_COPPER, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("blocksplus", "copper_door"))));
		    helper.register(DDNames.SHORT_BP_GOLDEN, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("blocksplus", "golden_door"))));
		    helper.register(DDNames.SHORT_BP_DIAMOND, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("blocksplus", "diamond_door"))));
		    helper.register(DDNames.SHORT_BP_EMERALD, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("blocksplus", "emerald_door"))));
		    helper.register(DDNames.SHORT_BP_NETHERITE, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("blocksplus", "netherite_door"))));
		    
		    helper.register(DDNames.TALL_BP_BAMBOO, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("blocksplus", "bamboo_door"))));
		    helper.register(DDNames.TALL_BP_MUSHROOM, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("blocksplus", "mushroom_door"))));
		    helper.register(DDNames.TALL_BP_COPPER, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("blocksplus", "copper_door"))));
		    helper.register(DDNames.TALL_BP_GOLDEN, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("blocksplus", "golden_door"))));
		    helper.register(DDNames.TALL_BP_DIAMOND, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("blocksplus", "diamond_door"))));
		    helper.register(DDNames.TALL_BP_EMERALD, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("blocksplus", "emerald_door"))));
		    helper.register(DDNames.TALL_BP_NETHERITE, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("blocksplus", "netherite_door"))));
		    
		    // Caupona
		    helper.register(DDNames.SHORT_WALNUT, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("caupona", "walnut_door"))));    
		
		    helper.register(DDNames.TALL_WALNUT, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("caupona", "walnut_door"))));    
		    
		    // Cobblemon
			helper.register(DDNames.SHORT_APRICORN, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("cobblemon", "apricorn_door"))));
		
			helper.register(DDNames.TALL_APRICORN, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("cobblemon", "apricorn_door"))));

		    // Colourful Azaleas
		    helper.register(DDNames.SHORT_AZULE_AZALEA, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("colorfulazaleas", "azule_azalea_door"))));
		    helper.register(DDNames.SHORT_BRIGHT_AZALEA, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("colorfulazaleas", "bright_azalea_door"))));
		    helper.register(DDNames.SHORT_FISS_AZALEA, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("colorfulazaleas", "fiss_azalea_door"))));
		    helper.register(DDNames.SHORT_ROZE_AZALEA, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("colorfulazaleas", "roze_azalea_door"))));
		    helper.register(DDNames.SHORT_TECAL_AZALEA, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("colorfulazaleas", "tecal_azalea_door"))));
		    helper.register(DDNames.SHORT_TITANIUM_AZALEA, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("colorfulazaleas", "titanium_azalea_door"))));
		    helper.register(DDNames.SHORT_WALNUT_AZALEA, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("colorfulazaleas", "walnut_azalea_door"))));    
		    
		    helper.register(DDNames.TALL_AZULE_AZALEA, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("colorfulazaleas", "azule_azalea_door"))));
		    helper.register(DDNames.TALL_BRIGHT_AZALEA, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("colorfulazaleas", "bright_azalea_door"))));
		    helper.register(DDNames.TALL_FISS_AZALEA, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("colorfulazaleas", "fiss_azalea_door"))));
		    helper.register(DDNames.TALL_ROZE_AZALEA, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("colorfulazaleas", "roze_azalea_door"))));
		    helper.register(DDNames.TALL_TECAL_AZALEA, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("colorfulazaleas", "tecal_azalea_door"))));
		    helper.register(DDNames.TALL_TITANIUM_AZALEA, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("colorfulazaleas", "titanium_azalea_door"))));
		    helper.register(DDNames.TALL_WALNUT_AZALEA, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("colorfulazaleas", "walnut_azalea_door"))));    

		    // Copper Overhaul
		    helper.register(DDNames.SHORT_CO_COPPER, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("copperoverhaul", "copper_door"))));
		    helper.register(DDNames.SHORT_CO_EXPOSED_COPPER, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("copperoverhaul", "exposed_copper_door"))));
		    helper.register(DDNames.SHORT_CO_WEATHERED_COPPER, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("copperoverhaul", "weathered_copper_door"))));
		    helper.register(DDNames.SHORT_CO_OXIDIZED_COPPER, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("copperoverhaul", "oxidized_copper_door"))));
		    
		    helper.register(DDNames.TALL_CO_COPPER, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("copperoverhaul", "copper_door"))));
		    helper.register(DDNames.TALL_CO_EXPOSED_COPPER, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("copperoverhaul", "exposed_copper_door"))));
		    helper.register(DDNames.TALL_CO_WEATHERED_COPPER, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("copperoverhaul", "weathered_copper_door"))));
		    helper.register(DDNames.TALL_CO_OXIDIZED_COPPER, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("copperoverhaul", "oxidized_copper_door"))));
		    
		    // Everything is Copper
		    helper.register(DDNames.SHORT_EC_COPPER, SHORT_COPPER_DOOR);
		    helper.register(DDNames.SHORT_EC_EXPOSED_COPPER, SHORT_EXPOSED_COPPER_DOOR);
		    helper.register(DDNames.SHORT_EC_WEATHERED_COPPER, SHORT_WEATHERED_COPPER_DOOR);
		    helper.register(DDNames.SHORT_EC_OXIDIZED_COPPER, SHORT_OXIDIZED_COPPER_DOOR);
		    helper.register(DDNames.SHORT_EC_WAXED_COPPER, SHORT_WAXED_COPPER_DOOR);
		    helper.register(DDNames.SHORT_EC_WAXED_EXPOSED_COPPER, SHORT_WAXED_EXPOSED_COPPER_DOOR);
		    helper.register(DDNames.SHORT_EC_WAXED_WEATHERED_COPPER, SHORT_WAXED_WEATHERED_COPPER_DOOR);
		    helper.register(DDNames.SHORT_EC_WAXED_OXIDIZED_COPPER, SHORT_WAXED_OXIDIZED_COPPER_DOOR);
		    
		    helper.register(DDNames.TALL_EC_COPPER, TALL_COPPER_DOOR);
		    helper.register(DDNames.TALL_EC_EXPOSED_COPPER, TALL_EXPOSED_COPPER_DOOR);
		    helper.register(DDNames.TALL_EC_WEATHERED_COPPER, TALL_WEATHERED_COPPER_DOOR);
		    helper.register(DDNames.TALL_EC_OXIDIZED_COPPER, TALL_OXIDIZED_COPPER_DOOR);
		    helper.register(DDNames.TALL_EC_WAXED_COPPER, TALL_WAXED_COPPER_DOOR);
		    helper.register(DDNames.TALL_EC_WAXED_EXPOSED_COPPER, TALL_WAXED_EXPOSED_COPPER_DOOR);
		    helper.register(DDNames.TALL_EC_WAXED_WEATHERED_COPPER, TALL_WAXED_WEATHERED_COPPER_DOOR);
		    helper.register(DDNames.TALL_EC_WAXED_OXIDIZED_COPPER, TALL_WAXED_OXIDIZED_COPPER_DOOR);
		    
		    // Extended Mushrooms
		    helper.register(DDNames.SHORT_MUSHROOM, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("extendedmushrooms", "mushroom_door"))));
		    helper.register(DDNames.SHORT_GLOWSHROOM, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("extendedmushrooms", "glowshroom_door"))));
		    helper.register(DDNames.SHORT_POISONOUS_MUSHROOM, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("extendedmushrooms", "poisonous_mushroom_door"))));
		    helper.register(DDNames.SHORT_HONEY_FUNGUS, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("extendedmushrooms", "honey_fungus_door"))));
		    
		    helper.register(DDNames.TALL_MUSHROOM, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("extendedmushrooms", "mushroom_door"))));
		    helper.register(DDNames.TALL_GLOWSHROOM, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("extendedmushrooms", "glowshroom_door"))));
		    helper.register(DDNames.TALL_POISONOUS_MUSHROOM, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("extendedmushrooms", "poisonous_mushroom_door"))));
		    helper.register(DDNames.TALL_HONEY_FUNGUS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("extendedmushrooms", "honey_fungus_door"))));
		    
		    // Fruit Trees
		    helper.register(DDNames.SHORT_FT_CHERRY, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("fruittrees", "cherry_door"))));
		    //helper.register(DDNames.SHORT_FT_CHERRY_SLIDING, new ShortStableDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("fruittrees", "cherry_sliding_door"))));
		    helper.register(DDNames.SHORT_FT_CITRUS, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("fruittrees", "citrus_door"))));
		
		    helper.register(DDNames.TALL_FT_CHERRY, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("fruittrees", "cherry_door"))));
		    helper.register(DDNames.TALL_FT_CHERRY_SLIDING, new TallStableDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("fruittrees", "cherry_sliding_door"))));
		    helper.register(DDNames.TALL_FT_CITRUS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("fruittrees", "citrus_door"))));
		
		    // Graveyard
		    helper.register(DDNames.SHORT_DARK_IRON, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("graveyard", "dark_iron_door"), Blocks.IRON_DOOR)));
		
		    helper.register(DDNames.TALL_DARK_IRON, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("graveyard", "dark_iron_door"), Blocks.IRON_DOOR)));
		    
		    // Silent Gear
		    helper.register(DDNames.SHORT_NETHERWOOD, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("silentgear", "netherwood_door"))));
		
		    helper.register(DDNames.TALL_NETHERWOOD, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("silentgear", "netherwood_door"))));
		    
		    // Snowy Spirit
		    helper.register(DDNames.SHORT_GINGERBREAD, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("snowyspirit", "gingerbread_door"))));
		
		    helper.register(DDNames.TALL_GINGERBREAD, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("snowyspirit", "gingerbread_door"))));
		    
		    // Terraqueous
		    helper.register(DDNames.SHORT_TQ_LIGHT_CLOUD, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("terraqueous", "light_cloud_door"))));
		    helper.register(DDNames.SHORT_TQ_DENSE_CLOUD, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("terraqueous", "dense_cloud_door"))));
		    helper.register(DDNames.SHORT_TQ_STORM_CLOUD, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("terraqueous", "storm_cloud_door"))));
		    helper.register(DDNames.SHORT_TQ_APPLE, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("terraqueous", "apple_door"))));
		    helper.register(DDNames.SHORT_TQ_BANANA, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("terraqueous", "banana_door"))));
		    helper.register(DDNames.SHORT_TQ_CHERRY, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("terraqueous", "cherry_door"))));
		    helper.register(DDNames.SHORT_TQ_COCONUT, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("terraqueous", "coconut_door"))));
		    helper.register(DDNames.SHORT_TQ_LEMON, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("terraqueous", "lemon_door"))));
		    helper.register(DDNames.SHORT_TQ_MANGO, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("terraqueous", "mango_door"))));
		    helper.register(DDNames.SHORT_TQ_MULBERRY, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("terraqueous", "mulberry_door"))));
		    helper.register(DDNames.SHORT_TQ_ORANGE, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("terraqueous", "orange_door"))));
		    helper.register(DDNames.SHORT_TQ_PEACH, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("terraqueous", "peach_door"))));
		    helper.register(DDNames.SHORT_TQ_PEAR, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("terraqueous", "pear_door"))));
		    helper.register(DDNames.SHORT_TQ_PLUM, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("terraqueous", "plum_door"))));
		
		    helper.register(DDNames.TALL_TQ_LIGHT_CLOUD, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("terraqueous", "light_cloud_door"))));
		    helper.register(DDNames.TALL_TQ_DENSE_CLOUD, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("terraqueous", "dense_cloud_door"))));
		    helper.register(DDNames.TALL_TQ_STORM_CLOUD, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("terraqueous", "storm_cloud_door"))));
		    helper.register(DDNames.TALL_TQ_APPLE, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("terraqueous", "apple_door"))));
		    helper.register(DDNames.TALL_TQ_BANANA, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("terraqueous", "banana_door"))));
		    helper.register(DDNames.TALL_TQ_CHERRY, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("terraqueous", "cherry_door"))));
		    helper.register(DDNames.TALL_TQ_COCONUT, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("terraqueous", "coconut_door"))));
		    helper.register(DDNames.TALL_TQ_LEMON, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("terraqueous", "lemon_door"))));
		    helper.register(DDNames.TALL_TQ_MANGO, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("terraqueous", "mango_door"))));
		    helper.register(DDNames.TALL_TQ_MULBERRY, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("terraqueous", "mulberry_door"))));
		    helper.register(DDNames.TALL_TQ_ORANGE, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("terraqueous", "orange_door"))));
		    helper.register(DDNames.TALL_TQ_PEACH, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("terraqueous", "peach_door"))));
		    helper.register(DDNames.TALL_TQ_PEAR, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("terraqueous", "pear_door"))));
		    helper.register(DDNames.TALL_TQ_PLUM, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("terraqueous", "plum_door"))));
		    
		    // Twigs
			helper.register(DDNames.SHORT_TWIGS_BAMBOO, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("twigs", "bamboo_door"))));    
		
			helper.register(DDNames.TALL_TWIGS_BAMBOO, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("twigs", "bamboo_door"))));    
		    
			// Yippee
			helper.register(DDNames.SHORT_MYSTICAL_OAK, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("yippee", "mystical_oak_door"))));    
		
			helper.register(DDNames.TALL_MYSTICAL_OAK, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("yippee", "mystical_oak_door"))));    
			
		});
		event.register(ForgeRegistries.Keys.ITEMS, helper -> {
			// Architects Palette
		    helper.register(DDNames.SHORT_TWISTED, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TWISTED)), DDItems.conditionalTabProperties("architects_palette")));
		    
		    helper.register(DDNames.TALL_TWISTED, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TWISTED)), DDItems.conditionalTabProperties("architects_palette")));
		
		    // Bamboo Everything
		    helper.register(DDNames.SHORT_BE_BAMBOO, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BE_BAMBOO)), DDItems.conditionalTabProperties("bambooeverything")));  
		    helper.register(DDNames.SHORT_BE_DRY_BAMBOO, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BE_DRY_BAMBOO)), DDItems.conditionalTabProperties("bambooeverything")));  
		    
		    helper.register(DDNames.TALL_BE_BAMBOO, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BE_BAMBOO)), DDItems.conditionalTabProperties("bambooeverything")));  
		    helper.register(DDNames.TALL_BE_DRY_BAMBOO, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BE_DRY_BAMBOO)), DDItems.conditionalTabProperties("bambooeverything")));  
		    
		    // Biomancy
		    helper.register(DDNames.SHORT_FLESH, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_FLESH)), DDItems.conditionalTabProperties("biomancy")));  
		    helper.register(DDNames.SHORT_FULL_FLESH, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_FULL_FLESH)), DDItems.conditionalTabProperties("biomancy")));
		    helper.register(DDNames.SHORT_FLESHKIN, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_FLESHKIN)), DDItems.addIfItemIsAvailable(new ResourceLocation("biomancy", "fleshkin_door"), DDItems.conditionalTabProperties("biomancy"))));  
		
		    helper.register(DDNames.TALL_FLESH, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_FLESH)), DDItems.conditionalTabProperties("biomancy")));  
		    helper.register(DDNames.TALL_FULL_FLESH, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_FULL_FLESH)), DDItems.conditionalTabProperties("biomancy")));
		    helper.register(DDNames.TALL_FLESHKIN, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_FLESHKIN)), DDItems.addIfItemIsAvailable(new ResourceLocation("biomancy", "fleshkin_door"), DDItems.conditionalTabProperties("biomancy"))));  
		    
		    // Blocks+
		    helper.register(DDNames.SHORT_BP_BAMBOO, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BP_BAMBOO)), DDItems.conditionalTabProperties("blocksplus")));
		    helper.register(DDNames.SHORT_BP_MUSHROOM, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BP_MUSHROOM)), DDItems.conditionalTabProperties("blocksplus")));
		    helper.register(DDNames.SHORT_BP_COPPER, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BP_COPPER)), DDItems.conditionalTabProperties("blocksplus")));
		    helper.register(DDNames.SHORT_BP_GOLDEN, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BP_GOLDEN)), DDItems.conditionalTabProperties("blocksplus")));
		    helper.register(DDNames.SHORT_BP_DIAMOND, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BP_DIAMOND)), DDItems.conditionalTabProperties("blocksplus")));
		    helper.register(DDNames.SHORT_BP_EMERALD, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BP_EMERALD)), DDItems.conditionalTabProperties("blocksplus")));
		    helper.register(DDNames.SHORT_BP_NETHERITE, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BP_NETHERITE)), DDItems.conditionalTabProperties("blocksplus").fireResistant()));
		    
		    helper.register(DDNames.TALL_BP_BAMBOO, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BP_BAMBOO)), DDItems.conditionalTabProperties("blocksplus")));
		    helper.register(DDNames.TALL_BP_MUSHROOM, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BP_MUSHROOM)), DDItems.conditionalTabProperties("blocksplus")));
		    helper.register(DDNames.TALL_BP_COPPER, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BP_COPPER)), DDItems.conditionalTabProperties("blocksplus")));
		    helper.register(DDNames.TALL_BP_GOLDEN, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BP_GOLDEN)), DDItems.conditionalTabProperties("blocksplus")));
		    helper.register(DDNames.TALL_BP_DIAMOND, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BP_DIAMOND)), DDItems.conditionalTabProperties("blocksplus")));
		    helper.register(DDNames.TALL_BP_EMERALD, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BP_EMERALD)), DDItems.conditionalTabProperties("blocksplus")));
		    helper.register(DDNames.TALL_BP_NETHERITE, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BP_NETHERITE)), DDItems.conditionalTabProperties("blocksplus").fireResistant()));
		    
		    // Caupona
		    helper.register(DDNames.SHORT_WALNUT, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_WALNUT)), DDItems.conditionalTabProperties("caupona")));
		
		    helper.register(DDNames.TALL_WALNUT, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_WALNUT)), DDItems.conditionalTabProperties("caupona")));
		    
		    // Cobblemon
		    helper.register(DDNames.SHORT_APRICORN, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_APRICORN)), DDItems.conditionalTabProperties("cobblemon")));
		    
		    helper.register(DDNames.TALL_APRICORN, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_APRICORN)), DDItems.conditionalTabProperties("cobblemon")));

		    // Colourful Azaleas
		    helper.register(DDNames.SHORT_AZULE_AZALEA, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_AZULE_AZALEA)), DDItems.conditionalTabProperties("colorfulazaleas")));
		    helper.register(DDNames.SHORT_BRIGHT_AZALEA, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BRIGHT_AZALEA)), DDItems.conditionalTabProperties("colorfulazaleas")));
		    helper.register(DDNames.SHORT_FISS_AZALEA, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_FISS_AZALEA)), DDItems.conditionalTabProperties("colorfulazaleas")));
		    helper.register(DDNames.SHORT_ROZE_AZALEA, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ROZE_AZALEA)), DDItems.conditionalTabProperties("colorfulazaleas")));
		    helper.register(DDNames.SHORT_TECAL_AZALEA, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TECAL_AZALEA)), DDItems.conditionalTabProperties("colorfulazaleas")));
		    helper.register(DDNames.SHORT_TITANIUM_AZALEA, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TITANIUM_AZALEA)), DDItems.conditionalTabProperties("colorfulazaleas")));
		    helper.register(DDNames.SHORT_WALNUT_AZALEA, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_WALNUT_AZALEA)), DDItems.conditionalTabProperties("colorfulazaleas")));
		    
		    helper.register(DDNames.TALL_AZULE_AZALEA, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_AZULE_AZALEA)), DDItems.conditionalTabProperties("colorfulazaleas")));
		    helper.register(DDNames.TALL_BRIGHT_AZALEA, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BRIGHT_AZALEA)), DDItems.conditionalTabProperties("colorfulazaleas")));
		    helper.register(DDNames.TALL_FISS_AZALEA, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_FISS_AZALEA)), DDItems.conditionalTabProperties("colorfulazaleas")));
		    helper.register(DDNames.TALL_ROZE_AZALEA, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ROZE_AZALEA)), DDItems.conditionalTabProperties("colorfulazaleas")));
		    helper.register(DDNames.TALL_TECAL_AZALEA, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TECAL_AZALEA)), DDItems.conditionalTabProperties("colorfulazaleas")));
		    helper.register(DDNames.TALL_TITANIUM_AZALEA, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TITANIUM_AZALEA)), DDItems.conditionalTabProperties("colorfulazaleas")));
		    helper.register(DDNames.TALL_WALNUT_AZALEA, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_WALNUT_AZALEA)), DDItems.conditionalTabProperties("colorfulazaleas")));
		    
		    // Copper Overhaul
		    helper.register(DDNames.SHORT_CO_COPPER, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CO_COPPER)), DDItems.conditionalTabProperties("copperoverhaul")));
		    helper.register(DDNames.SHORT_CO_EXPOSED_COPPER, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CO_EXPOSED_COPPER)), DDItems.conditionalTabProperties("copperoverhaul")));
		    helper.register(DDNames.SHORT_CO_WEATHERED_COPPER, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CO_WEATHERED_COPPER)), DDItems.conditionalTabProperties("copperoverhaul")));
		    helper.register(DDNames.SHORT_CO_OXIDIZED_COPPER, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CO_OXIDIZED_COPPER)), DDItems.conditionalTabProperties("copperoverhaul")));
		    
		    helper.register(DDNames.TALL_CO_COPPER, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CO_COPPER)), DDItems.conditionalTabProperties("copperoverhaul")));
		    helper.register(DDNames.TALL_CO_EXPOSED_COPPER, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CO_EXPOSED_COPPER)), DDItems.conditionalTabProperties("copperoverhaul")));
		    helper.register(DDNames.TALL_CO_WEATHERED_COPPER, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CO_WEATHERED_COPPER)), DDItems.conditionalTabProperties("copperoverhaul")));
		    helper.register(DDNames.TALL_CO_OXIDIZED_COPPER, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CO_OXIDIZED_COPPER)), DDItems.conditionalTabProperties("copperoverhaul")));
		    
		    // Everything Copper
		    helper.register(DDNames.SHORT_EC_COPPER, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_EC_COPPER)), DDItems.conditionalTabProperties("everythingcopper")));
		    helper.register(DDNames.SHORT_EC_EXPOSED_COPPER, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_EC_EXPOSED_COPPER)), DDItems.conditionalTabProperties("everythingcopper")));
		    helper.register(DDNames.SHORT_EC_WEATHERED_COPPER, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_EC_WEATHERED_COPPER)), DDItems.conditionalTabProperties("everythingcopper")));
		    helper.register(DDNames.SHORT_EC_OXIDIZED_COPPER, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_EC_OXIDIZED_COPPER)), DDItems.conditionalTabProperties("everythingcopper")));
		    helper.register(DDNames.SHORT_EC_WAXED_COPPER, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_EC_WAXED_COPPER)), DDItems.conditionalTabProperties("everythingcopper")));
		    helper.register(DDNames.SHORT_EC_WAXED_EXPOSED_COPPER, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_EC_WAXED_EXPOSED_COPPER)), DDItems.conditionalTabProperties("everythingcopper")));
		    helper.register(DDNames.SHORT_EC_WAXED_WEATHERED_COPPER, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_EC_WAXED_WEATHERED_COPPER)), DDItems.conditionalTabProperties("everythingcopper")));
		    helper.register(DDNames.SHORT_EC_WAXED_OXIDIZED_COPPER, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_EC_WAXED_OXIDIZED_COPPER)), DDItems.conditionalTabProperties("everythingcopper")));
		    
		    helper.register(DDNames.TALL_EC_COPPER, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_EC_COPPER)), DDItems.conditionalTabProperties("everythingcopper")));
		    helper.register(DDNames.TALL_EC_EXPOSED_COPPER, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_EC_EXPOSED_COPPER)), DDItems.conditionalTabProperties("everythingcopper")));
		    helper.register(DDNames.TALL_EC_WEATHERED_COPPER, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_EC_WEATHERED_COPPER)), DDItems.conditionalTabProperties("everythingcopper")));
		    helper.register(DDNames.TALL_EC_OXIDIZED_COPPER, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_EC_OXIDIZED_COPPER)), DDItems.conditionalTabProperties("everythingcopper")));
		    helper.register(DDNames.TALL_EC_WAXED_COPPER, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_EC_WAXED_COPPER)), DDItems.conditionalTabProperties("everythingcopper")));
		    helper.register(DDNames.TALL_EC_WAXED_EXPOSED_COPPER, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_EC_WAXED_EXPOSED_COPPER)), DDItems.conditionalTabProperties("everythingcopper")));
		    helper.register(DDNames.TALL_EC_WAXED_WEATHERED_COPPER, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_EC_WAXED_WEATHERED_COPPER)), DDItems.conditionalTabProperties("everythingcopper")));
		    helper.register(DDNames.TALL_EC_WAXED_OXIDIZED_COPPER, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_EC_WAXED_OXIDIZED_COPPER)), DDItems.conditionalTabProperties("everythingcopper")));
		    
		    // Extended Mushrooms
		    helper.register(DDNames.SHORT_MUSHROOM, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MUSHROOM)), DDItems.conditionalTabProperties("extendedmushrooms")));
		    helper.register(DDNames.SHORT_GLOWSHROOM, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_GLOWSHROOM)), DDItems.conditionalTabProperties("extendedmushrooms")));
		    helper.register(DDNames.SHORT_POISONOUS_MUSHROOM, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_POISONOUS_MUSHROOM)), DDItems.conditionalTabProperties("extendedmushrooms")));
		    helper.register(DDNames.SHORT_HONEY_FUNGUS, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_HONEY_FUNGUS)), DDItems.conditionalTabProperties("extendedmushrooms")));
		    
		    helper.register(DDNames.TALL_MUSHROOM, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MUSHROOM)), DDItems.conditionalTabProperties("extendedmushrooms")));
		    helper.register(DDNames.TALL_GLOWSHROOM, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_GLOWSHROOM)), DDItems.conditionalTabProperties("extendedmushrooms")));
		    helper.register(DDNames.TALL_POISONOUS_MUSHROOM, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_POISONOUS_MUSHROOM)), DDItems.conditionalTabProperties("extendedmushrooms")));
		    helper.register(DDNames.TALL_HONEY_FUNGUS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_HONEY_FUNGUS)), DDItems.conditionalTabProperties("extendedmushrooms")));
		
		    // Fruit Trees
		    helper.register(DDNames.SHORT_FT_CHERRY, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_FT_CHERRY)), DDItems.conditionalTabProperties("fruittrees")));
		    //helper.register(DDNames.SHORT_FT_CHERRY_SLIDING, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_FT_CHERRY_SLIDING)), addIfItemIsAvailable(new ResourceLocation("fruittrees", "cherry_sliding_door"), DDItems.conditionalTabProperties("fruittrees"))));
		    helper.register(DDNames.SHORT_FT_CITRUS, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_FT_CITRUS)), DDItems.conditionalTabProperties("fruittrees")));
		    
		    helper.register(DDNames.TALL_FT_CHERRY, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_FT_CHERRY)), DDItems.conditionalTabProperties("fruittrees")));
		    helper.register(DDNames.TALL_FT_CHERRY_SLIDING, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_FT_CHERRY_SLIDING)), DDItems.addIfItemIsAvailable(new ResourceLocation("fruittrees", "cherry_sliding_door"), DDItems.conditionalTabProperties("fruittrees"))));
		    helper.register(DDNames.TALL_FT_CITRUS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_FT_CITRUS)), DDItems.conditionalTabProperties("fruittrees")));
		    
		    // Graveyard
		    helper.register(DDNames.SHORT_DARK_IRON, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_DARK_IRON)), DDItems.conditionalTabProperties("graveyard")));
		    
		    helper.register(DDNames.TALL_DARK_IRON, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_DARK_IRON)), DDItems.conditionalTabProperties("graveyard")));
		    
		    // Silent Gear
		    helper.register(DDNames.SHORT_NETHERWOOD, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_NETHERWOOD)), DDItems.conditionalTabProperties("silentgear")));
		
		    helper.register(DDNames.TALL_NETHERWOOD, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_NETHERWOOD)), DDItems.conditionalTabProperties("silentgear")));
		
		    // Snowy Spirit
		    helper.register(DDNames.SHORT_GINGERBREAD, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_GINGERBREAD)), DDItems.conditionalTabProperties("snowyspirit")));
		    
		    helper.register(DDNames.TALL_GINGERBREAD, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_GINGERBREAD)), DDItems.conditionalTabProperties("snowyspirit")));
		    
		    // Terraqueous
		    helper.register(DDNames.SHORT_TQ_LIGHT_CLOUD, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TQ_LIGHT_CLOUD)), DDItems.conditionalTabProperties("terraqueous")));
		    helper.register(DDNames.SHORT_TQ_DENSE_CLOUD, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TQ_DENSE_CLOUD)), DDItems.conditionalTabProperties("terraqueous")));
		    helper.register(DDNames.SHORT_TQ_STORM_CLOUD, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TQ_STORM_CLOUD)), DDItems.conditionalTabProperties("terraqueous")));
		    helper.register(DDNames.SHORT_TQ_APPLE, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TQ_APPLE)), DDItems.conditionalTabProperties("terraqueous")));
		    helper.register(DDNames.SHORT_TQ_BANANA, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TQ_BANANA)), DDItems.conditionalTabProperties("terraqueous")));
		    helper.register(DDNames.SHORT_TQ_CHERRY, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TQ_CHERRY)), DDItems.conditionalTabProperties("terraqueous")));
		    helper.register(DDNames.SHORT_TQ_COCONUT, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TQ_COCONUT)), DDItems.conditionalTabProperties("terraqueous")));
		    helper.register(DDNames.SHORT_TQ_LEMON, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TQ_LEMON)), DDItems.conditionalTabProperties("terraqueous")));
		    helper.register(DDNames.SHORT_TQ_MANGO, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TQ_MANGO)), DDItems.conditionalTabProperties("terraqueous")));
		    helper.register(DDNames.SHORT_TQ_MULBERRY, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TQ_MULBERRY)), DDItems.conditionalTabProperties("terraqueous")));
		    helper.register(DDNames.SHORT_TQ_ORANGE, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TQ_ORANGE)), DDItems.conditionalTabProperties("terraqueous")));
		    helper.register(DDNames.SHORT_TQ_PEACH, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TQ_PEACH)), DDItems.conditionalTabProperties("terraqueous")));
		    helper.register(DDNames.SHORT_TQ_PEAR, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TQ_PEAR)), DDItems.conditionalTabProperties("terraqueous")));
		    helper.register(DDNames.SHORT_TQ_PLUM, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TQ_PLUM)), DDItems.conditionalTabProperties("terraqueous")));

		    helper.register(DDNames.TALL_TQ_LIGHT_CLOUD, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TQ_LIGHT_CLOUD)), DDItems.conditionalTabProperties("terraqueous")));
		    helper.register(DDNames.TALL_TQ_DENSE_CLOUD, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TQ_DENSE_CLOUD)), DDItems.conditionalTabProperties("terraqueous")));
		    helper.register(DDNames.TALL_TQ_STORM_CLOUD, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TQ_STORM_CLOUD)), DDItems.conditionalTabProperties("terraqueous")));
		    helper.register(DDNames.TALL_TQ_APPLE, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TQ_APPLE)), DDItems.conditionalTabProperties("terraqueous")));
		    helper.register(DDNames.TALL_TQ_BANANA, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TQ_BANANA)), DDItems.conditionalTabProperties("terraqueous")));
		    helper.register(DDNames.TALL_TQ_CHERRY, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TQ_CHERRY)), DDItems.conditionalTabProperties("terraqueous")));
		    helper.register(DDNames.TALL_TQ_COCONUT, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TQ_COCONUT)), DDItems.conditionalTabProperties("terraqueous")));
		    helper.register(DDNames.TALL_TQ_LEMON, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TQ_LEMON)), DDItems.conditionalTabProperties("terraqueous")));
		    helper.register(DDNames.TALL_TQ_MANGO, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TQ_MANGO)), DDItems.conditionalTabProperties("terraqueous")));
		    helper.register(DDNames.TALL_TQ_MULBERRY, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TQ_MULBERRY)), DDItems.conditionalTabProperties("terraqueous")));
		    helper.register(DDNames.TALL_TQ_ORANGE, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TQ_ORANGE)), DDItems.conditionalTabProperties("terraqueous")));
		    helper.register(DDNames.TALL_TQ_PEACH, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TQ_PEACH)), DDItems.conditionalTabProperties("terraqueous")));
		    helper.register(DDNames.TALL_TQ_PEAR, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TQ_PEAR)), DDItems.conditionalTabProperties("terraqueous")));
		    helper.register(DDNames.TALL_TQ_PLUM, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TQ_PLUM)), DDItems.conditionalTabProperties("terraqueous")));
		    
		    // Twigs
		    helper.register(DDNames.SHORT_TWIGS_BAMBOO, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TWIGS_BAMBOO)), DDItems.conditionalTabProperties("twigs")));
		
		    helper.register(DDNames.TALL_TWIGS_BAMBOO, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TWIGS_BAMBOO)), DDItems.conditionalTabProperties("twigs")));
		
		    // Yippee
		    helper.register(DDNames.SHORT_MYSTICAL_OAK, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MYSTICAL_OAK)), DDItems.conditionalTabProperties("yippee")));
		
		    helper.register(DDNames.TALL_MYSTICAL_OAK, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MYSTICAL_OAK)), DDItems.conditionalTabProperties("yippee")));		    
		});
	}
}
