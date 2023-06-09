package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DramaticDoors;
import com.fizzware.dramaticdoors.blocks.DDBlocks;
import com.fizzware.dramaticdoors.blocks.ShortDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallDoorBlock;
import com.fizzware.dramaticdoors.items.DDItems;
import com.fizzware.dramaticdoors.items.ShortDoorItem;
import com.fizzware.dramaticdoors.items.TallDoorItem;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;

public class DDBiomePackRegistry
{
	@SubscribeEvent
	public static void register(RegisterEvent event) {
		event.register(ForgeRegistries.Keys.BLOCKS, helper -> {
		    // Biomes O' Plenty
		    helper.register(DDNames.SHORT_BOP_CHERRY,  new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("biomesoplenty", "cherry_door"))));
		    helper.register(DDNames.SHORT_BOP_DEAD,  new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("biomesoplenty", "dead_door"))));
		    helper.register(DDNames.SHORT_BOP_FIR,  new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("biomesoplenty", "fir_door"))));
		    helper.register(DDNames.SHORT_BOP_HELLBARK,  new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("biomesoplenty", "hellbark_door"))));
		    helper.register(DDNames.SHORT_BOP_JACARANDA,  new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("biomesoplenty", "jacaranda_door"))));
		    helper.register(DDNames.SHORT_BOP_MAGIC,  new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("biomesoplenty", "magic_door"))));
		    helper.register(DDNames.SHORT_BOP_MAHOGANY,  new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("biomesoplenty", "mahogany_door"))));
		    helper.register(DDNames.SHORT_BOP_PALM,  new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("biomesoplenty", "palm_door"))));
		    helper.register(DDNames.SHORT_BOP_REDWOOD,  new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("biomesoplenty", "redwood_door"))));
		    helper.register(DDNames.SHORT_BOP_UMBRAN,  new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("biomesoplenty", "umbran_door"))));
		    helper.register(DDNames.SHORT_BOP_WILLOW,  new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("biomesoplenty", "willow_door"))));
		    
		    helper.register(DDNames.TALL_BOP_CHERRY,  new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("biomesoplenty", "cherry_door"))));
		    helper.register(DDNames.TALL_BOP_DEAD,  new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("biomesoplenty", "dead_door"))));
		    helper.register(DDNames.TALL_BOP_FIR,  new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("biomesoplenty", "fir_door"))));
		    helper.register(DDNames.TALL_BOP_HELLBARK,  new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("biomesoplenty", "hellbark_door"))));
		    helper.register(DDNames.TALL_BOP_JACARANDA,  new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("biomesoplenty", "jacaranda_door"))));
		    helper.register(DDNames.TALL_BOP_MAGIC,  new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("biomesoplenty", "magic_door"))));
		    helper.register(DDNames.TALL_BOP_MAHOGANY,  new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("biomesoplenty", "mahogany_door"))));
		    helper.register(DDNames.TALL_BOP_PALM,  new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("biomesoplenty", "palm_door"))));
		    helper.register(DDNames.TALL_BOP_REDWOOD,  new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("biomesoplenty", "redwood_door"))));
		    helper.register(DDNames.TALL_BOP_UMBRAN,  new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("biomesoplenty", "umbran_door"))));
		    helper.register(DDNames.TALL_BOP_WILLOW,  new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("biomesoplenty", "willow_door"))));
		    
		    // Oh the Biomes You'll Go
			helper.register(DDNames.SHORT_BYG_ASPEN, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("byg", "aspen_door"))));
			helper.register(DDNames.SHORT_BYG_BAOBAB, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("byg", "baobab_door"))));
			helper.register(DDNames.SHORT_BYG_BLUE_ENCHANTED, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("byg", "blue_enchanted_door"))));
			helper.register(DDNames.SHORT_BYG_BULBIS, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("byg", "bulbis_door"))));
			helper.register(DDNames.SHORT_BYG_CHERRY, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("byg", "cherry_door"))));
			helper.register(DDNames.SHORT_BYG_CIKA, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("byg", "cika_door"))));
			helper.register(DDNames.SHORT_BYG_CYPRESS, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("byg", "cypress_door"))));
			helper.register(DDNames.SHORT_BYG_EBONY, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("byg", "ebony_door"))));
			helper.register(DDNames.SHORT_BYG_EMBUR, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("byg", "embur_door"))));
			helper.register(DDNames.SHORT_BYG_ETHER, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("byg", "ether_door"))));
			helper.register(DDNames.SHORT_BYG_FIR, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("byg", "fir_door"))));
			helper.register(DDNames.SHORT_BYG_FLORUS, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("byg", "florus_door"))));
			helper.register(DDNames.SHORT_BYG_GREEN_ENCHANTED, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("byg", "green_enchanted_door"))));
			helper.register(DDNames.SHORT_BYG_HOLLY, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("byg", "holly_door"))));
			helper.register(DDNames.SHORT_BYG_IMPARIUS, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("byg", "imparius_door"))));
			helper.register(DDNames.SHORT_BYG_IRONWOOD, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("byg", "ironwood_door"))));
			helper.register(DDNames.SHORT_BYG_JACARANDA, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("byg", "jacaranda_door"))));
			helper.register(DDNames.SHORT_BYG_LAMENT, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("byg", "lament_door"))));
			helper.register(DDNames.SHORT_BYG_MAHOGANY, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("byg", "mahogany_door"))));
			helper.register(DDNames.SHORT_BYG_MAPLE, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("byg", "maple_door"))));
			helper.register(DDNames.SHORT_BYG_NIGHTSHADE, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("byg", "nightshade_door"))));
			helper.register(DDNames.SHORT_BYG_PALM, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("byg", "palm_door"))));
			helper.register(DDNames.SHORT_BYG_PINE, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("byg", "pine_door"))));
			helper.register(DDNames.SHORT_BYG_RAINBOW_EUCALYPTUS, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("byg", "rainbow_eucalyptus_door"))));
			helper.register(DDNames.SHORT_BYG_REDWOOD, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("byg", "redwood_door"))));
			helper.register(DDNames.SHORT_BYG_SKYRIS, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("byg", "skyris_door"))));
			helper.register(DDNames.SHORT_BYG_SOUL_SHROOM, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("byg", "soul_shroom_door"))));
			helper.register(DDNames.SHORT_BYG_SYTHIAN, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("byg", "sythian_door"))));
			helper.register(DDNames.SHORT_BYG_WHITE_MANGROVE, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("byg", "mangrove_door"))));
			helper.register(DDNames.SHORT_BYG_WILLOW, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("byg", "willow_door"))));
			helper.register(DDNames.SHORT_BYG_WITCH_HAZEL, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("byg", "witch_hazel_door"))));
			helper.register(DDNames.SHORT_BYG_ZELKOVA, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("byg", "zelkova_door"))));
			
			helper.register(DDNames.TALL_BYG_ASPEN, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("byg", "aspen_door"))));
			helper.register(DDNames.TALL_BYG_BAOBAB, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("byg", "baobab_door"))));
			helper.register(DDNames.TALL_BYG_BLUE_ENCHANTED, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("byg", "blue_enchanted_door"))));
			helper.register(DDNames.TALL_BYG_BULBIS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("byg", "bulbis_door"))));
			helper.register(DDNames.TALL_BYG_CHERRY, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("byg", "cherry_door"))));
			helper.register(DDNames.TALL_BYG_CIKA, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("byg", "cika_door"))));
			helper.register(DDNames.TALL_BYG_CYPRESS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("byg", "cypress_door"))));
			helper.register(DDNames.TALL_BYG_EBONY, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("byg", "ebony_door"))));
			helper.register(DDNames.TALL_BYG_EMBUR, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("byg", "embur_door"))));
			helper.register(DDNames.TALL_BYG_ETHER, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("byg", "ether_door"))));
			helper.register(DDNames.TALL_BYG_FIR, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("byg", "fir_door"))));
			helper.register(DDNames.TALL_BYG_FLORUS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("byg", "florus_door"))));
			helper.register(DDNames.TALL_BYG_GREEN_ENCHANTED, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("byg", "green_enchanted_door"))));
			helper.register(DDNames.TALL_BYG_HOLLY, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("byg", "holly_door"))));
			helper.register(DDNames.TALL_BYG_IMPARIUS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("byg", "imparius_door"))));
			helper.register(DDNames.TALL_BYG_IRONWOOD, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("byg", "ironwood_door"))));
			helper.register(DDNames.TALL_BYG_JACARANDA, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("byg", "jacaranda_door"))));
			helper.register(DDNames.TALL_BYG_LAMENT, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("byg", "lament_door"))));
			helper.register(DDNames.TALL_BYG_MAHOGANY, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("byg", "mahogany_door"))));
			helper.register(DDNames.TALL_BYG_MAPLE, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("byg", "maple_door"))));
			helper.register(DDNames.TALL_BYG_NIGHTSHADE, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("byg", "nightshade_door"))));
			helper.register(DDNames.TALL_BYG_PALM, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("byg", "palm_door"))));
			helper.register(DDNames.TALL_BYG_PINE, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("byg", "pine_door"))));
			helper.register(DDNames.TALL_BYG_RAINBOW_EUCALYPTUS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("byg", "rainbow_eucalyptus_door"))));
			helper.register(DDNames.TALL_BYG_REDWOOD, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("byg", "redwood_door"))));
			helper.register(DDNames.TALL_BYG_SKYRIS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("byg", "skyris_door"))));
			helper.register(DDNames.TALL_BYG_SOUL_SHROOM, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("byg", "soul_shroom_door"))));
			helper.register(DDNames.TALL_BYG_SYTHIAN, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("byg", "sythian_door"))));
			helper.register(DDNames.TALL_BYG_WHITE_MANGROVE, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("byg", "mangrove_door"))));
			helper.register(DDNames.TALL_BYG_WILLOW, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("byg", "willow_door"))));
			helper.register(DDNames.TALL_BYG_WITCH_HAZEL, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("byg", "witch_hazel_door"))));
			helper.register(DDNames.TALL_BYG_ZELKOVA, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("byg", "zelkova_door"))));
			
			// Regions Unexplored
		    helper.register(DDNames.SHORT_RUE_BAOBAB,  new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("regions_unexplored", "baobab_door"))));
		    helper.register(DDNames.SHORT_RUE_BLACKWOOD,  new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("regions_unexplored", "blackwood_door"))));
		    helper.register(DDNames.SHORT_RUE_BRIMWOOD,  new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("regions_unexplored", "brimwood_door"), Blocks.CRIMSON_DOOR)));
		    helper.register(DDNames.SHORT_RUE_CHERRY,  new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("regions_unexplored", "cherry_door"))));
		    helper.register(DDNames.SHORT_RUE_CYPRESS,  new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("regions_unexplored", "cypress_door"))));
		    helper.register(DDNames.SHORT_RUE_DEAD,  new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("regions_unexplored", "dead_door"))));
		    helper.register(DDNames.SHORT_RUE_EUCALYPTUS,  new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("regions_unexplored", "eucalyptus_door"))));
		    helper.register(DDNames.SHORT_RUE_JOSHUA,  new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("regions_unexplored", "joshua_door"))));
		    helper.register(DDNames.SHORT_RUE_LARCH,  new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("regions_unexplored", "larch_door"))));
		    helper.register(DDNames.SHORT_RUE_MAPLE,  new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("regions_unexplored", "maple_door"))));
		    helper.register(DDNames.SHORT_RUE_MAUVE,  new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("regions_unexplored", "mauve_door"))));
		    helper.register(DDNames.SHORT_RUE_PALM,  new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("regions_unexplored", "palm_door"))));
		    helper.register(DDNames.SHORT_RUE_PINE,  new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("regions_unexplored", "pine_door"))));
		    helper.register(DDNames.SHORT_RUE_REDWOOD,  new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("regions_unexplored", "redwood_door"))));
		    helper.register(DDNames.SHORT_RUE_WILLOW,  new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("regions_unexplored", "willow_door"))));
		
		    helper.register(DDNames.TALL_RUE_BAOBAB,  new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("regions_unexplored", "baobab_door"))));
		    helper.register(DDNames.TALL_RUE_BLACKWOOD,  new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("regions_unexplored", "blackwood_door"))));
		    helper.register(DDNames.TALL_RUE_BRIMWOOD,  new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("regions_unexplored", "brimwood_door"), Blocks.CRIMSON_DOOR)));
		    helper.register(DDNames.TALL_RUE_CHERRY,  new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("regions_unexplored", "cherry_door"))));
		    helper.register(DDNames.TALL_RUE_CYPRESS,  new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("regions_unexplored", "cypress_door"))));
		    helper.register(DDNames.TALL_RUE_DEAD,  new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("regions_unexplored", "dead_door"))));
		    helper.register(DDNames.TALL_RUE_EUCALYPTUS,  new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("regions_unexplored", "eucalyptus_door"))));
		    helper.register(DDNames.TALL_RUE_JOSHUA,  new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("regions_unexplored", "joshua_door"))));
		    helper.register(DDNames.TALL_RUE_LARCH,  new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("regions_unexplored", "larch_door"))));
		    helper.register(DDNames.TALL_RUE_MAPLE,  new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("regions_unexplored", "maple_door"))));
		    helper.register(DDNames.TALL_RUE_MAUVE,  new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("regions_unexplored", "mauve_door"))));
		    helper.register(DDNames.TALL_RUE_PALM,  new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("regions_unexplored", "palm_door"))));
		    helper.register(DDNames.TALL_RUE_PINE,  new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("regions_unexplored", "pine_door"))));
		    helper.register(DDNames.TALL_RUE_REDWOOD,  new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("regions_unexplored", "redwood_door"))));
		    helper.register(DDNames.TALL_RUE_WILLOW,  new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("regions_unexplored", "willow_door"))));
		    
		    // Biome Makeover
		    helper.register(DDNames.SHORT_BM_ANCIENT_OAK, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("biomemakeover", "ancient_oak_door"))));
		    helper.register(DDNames.SHORT_BM_BLIGHTED_BALSA, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("biomemakeover", "blighted_balsa_door"))));
		    helper.register(DDNames.SHORT_BM_SWAMP_CYPRESS, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("biomemakeover", "swamp_cypress_door"))));
		    helper.register(DDNames.SHORT_BM_WILLOW, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("biomemakeover", "willow_door"))));
		
		    helper.register(DDNames.TALL_BM_ANCIENT_OAK, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("biomemakeover", "ancient_oak_door"))));
		    helper.register(DDNames.TALL_BM_BLIGHTED_BALSA, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("biomemakeover", "blighted_balsa_door"))));
		    helper.register(DDNames.TALL_BM_SWAMP_CYPRESS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("biomemakeover", "swamp_cypress_door"))));
		    helper.register(DDNames.TALL_BM_WILLOW, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("biomemakeover", "willow_door"))));
		    
		    // Darker Depths
		    helper.register(DDNames.SHORT_PETRIFIED, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("darkerdepths", "petrified_door"))));
		
		    helper.register(DDNames.TALL_PETRIFIED, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("darkerdepths", "petrified_door"))));

		    // Ecologics
		    helper.register(DDNames.SHORT_ECO_AZALEA, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ecologics", "azalea_door"))));
		    helper.register(DDNames.SHORT_ECO_FLOWERING_AZALEA, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ecologics", "flowering_azalea_door"))));
		    helper.register(DDNames.SHORT_ECO_COCONUT, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ecologics", "coconut_door"))));
		    helper.register(DDNames.SHORT_ECO_WALNUT, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ecologics", "walnut_door"))));
		    
		    helper.register(DDNames.TALL_ECO_AZALEA, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ecologics", "azalea_door"))));
		    helper.register(DDNames.TALL_ECO_FLOWERING_AZALEA, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ecologics", "flowering_azalea_door"))));
		    helper.register(DDNames.TALL_ECO_COCONUT, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ecologics", "coconut_door"))));
		    helper.register(DDNames.TALL_ECO_WALNUT, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ecologics", "walnut_door"))));
				    
		    // End's Phantasm
		    helper.register(DDNames.SHORT_EBONY, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("phantasm", "ebony_door"))));
		    helper.register(DDNames.SHORT_PREAM, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("phantasm", "pream_door"))));
		    
		    helper.register(DDNames.TALL_EBONY, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("phantasm", "ebony_door"))));
		    helper.register(DDNames.TALL_PREAM, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("phantasm", "pream_door"))));
		    
		    // Enlightened End
		    helper.register(DDNames.SHORT_CONGEALED, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("enlightened_end", "congealed_door"))));
		    helper.register(DDNames.SHORT_EE_EBONY, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("enlightened_end", "verdant_door"))));
		    
		    helper.register(DDNames.TALL_CONGEALED, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("enlightened_end", "congealed_door"))));
		    helper.register(DDNames.TALL_EE_EBONY, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("enlightened_end", "verdant_door"))));
		
		    // Gardens of the Dead
		    helper.register(DDNames.SHORT_SOULBLIGHT, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("gardens_of_the_dead", "soulblight_door"))));
		    helper.register(DDNames.SHORT_WHISTLECANE, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("gardens_of_the_dead", "whistlecane_door"))));
		
		    helper.register(DDNames.TALL_SOULBLIGHT, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("gardens_of_the_dead", "soulblight_door"))));
		    helper.register(DDNames.TALL_WHISTLECANE, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("gardens_of_the_dead", "whistlecane_door"))));
		    
		    // Mystic's Biomes
		    helper.register(DDNames.SHORT_MB_CHERRY, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mysticsbiomes", "cherry_door"))));
		    helper.register(DDNames.SHORT_MB_JACARANDA, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mysticsbiomes", "jacaranda_door"))));
		    helper.register(DDNames.SHORT_MB_STRAWBERRY, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mysticsbiomes", "strawberry_door"))));

		    helper.register(DDNames.TALL_MB_CHERRY, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mysticsbiomes", "cherry_door"))));
		    helper.register(DDNames.TALL_MB_JACARANDA, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mysticsbiomes", "jacaranda_door"))));
		    helper.register(DDNames.TALL_MB_STRAWBERRY, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mysticsbiomes", "strawberry_door"))));
		    
		    // Nether's Exoticism
		    helper.register(DDNames.SHORT_JABOTICABA, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("nethers_exoticism", "jaboticaba_door"))));
		    helper.register(DDNames.SHORT_RAMBOUTAN, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("nethers_exoticism", "ramboutan_door"))));
		
		    helper.register(DDNames.TALL_JABOTICABA, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("nethers_exoticism", "jaboticaba_door"))));
		    helper.register(DDNames.TALL_RAMBOUTAN, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("nethers_exoticism", "ramboutan_door"))));

		    // Outer End
		    helper.register(DDNames.SHORT_AZURE, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("outer_end", "azure_door"))));
		
		    helper.register(DDNames.TALL_AZURE, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("outer_end", "azure_door"))));

		    // Premium Wood
		    helper.register(DDNames.SHORT_PW_MAGIC, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("premium_wood", "magic_door"))));
		    helper.register(DDNames.SHORT_PW_MAPLE, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("premium_wood", "maple_door"))));
		    helper.register(DDNames.SHORT_PW_PURPLE_HEART, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("premium_wood", "purple_heart_door"))));
		    helper.register(DDNames.SHORT_PW_SILVERBELL, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("premium_wood", "silverbell_door"))));
		    helper.register(DDNames.SHORT_PW_TIGER, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("premium_wood", "tiger_door"))));
		    helper.register(DDNames.SHORT_PW_WILLOW, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("premium_wood", "willow_door"))));
		    
		    helper.register(DDNames.TALL_PW_MAGIC, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("premium_wood", "magic_door"))));
		    helper.register(DDNames.TALL_PW_MAPLE, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("premium_wood", "maple_door"))));
		    helper.register(DDNames.TALL_PW_PURPLE_HEART, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("premium_wood", "purple_heart_door"))));
		    helper.register(DDNames.TALL_PW_SILVERBELL, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("premium_wood", "silverbell_door"))));
		    helper.register(DDNames.TALL_PW_TIGER, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("premium_wood", "tiger_door"))));
		    helper.register(DDNames.TALL_PW_WILLOW, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("premium_wood", "willow_door"))));
		});
		event.register(ForgeRegistries.Keys.ITEMS, helper -> {
			// Biomes o' Plenty
		    helper.register(DDNames.SHORT_BOP_CHERRY, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BOP_CHERRY)), DDItems.conditionalTabProperties("biomesoplenty")));
		    helper.register(DDNames.SHORT_BOP_DEAD, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BOP_DEAD)), DDItems.conditionalTabProperties("biomesoplenty")));
		    helper.register(DDNames.SHORT_BOP_FIR, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BOP_FIR)), DDItems.conditionalTabProperties("biomesoplenty")));
		    helper.register(DDNames.SHORT_BOP_HELLBARK, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BOP_HELLBARK)), DDItems.conditionalTabProperties("biomesoplenty")));
		    helper.register(DDNames.SHORT_BOP_JACARANDA, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BOP_JACARANDA)), DDItems.conditionalTabProperties("biomesoplenty")));
		    helper.register(DDNames.SHORT_BOP_MAGIC, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BOP_MAGIC)), DDItems.conditionalTabProperties("biomesoplenty")));
		    helper.register(DDNames.SHORT_BOP_MAHOGANY, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BOP_MAHOGANY)), DDItems.conditionalTabProperties("biomesoplenty")));
		    helper.register(DDNames.SHORT_BOP_PALM, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BOP_PALM)), DDItems.conditionalTabProperties("biomesoplenty")));
		    helper.register(DDNames.SHORT_BOP_REDWOOD, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BOP_REDWOOD)), DDItems.conditionalTabProperties("biomesoplenty")));
		    helper.register(DDNames.SHORT_BOP_UMBRAN, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BOP_UMBRAN)), DDItems.conditionalTabProperties("biomesoplenty")));
		    helper.register(DDNames.SHORT_BOP_WILLOW, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BOP_WILLOW)), DDItems.conditionalTabProperties("biomesoplenty")));
		    
		    helper.register(DDNames.TALL_BOP_CHERRY, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BOP_CHERRY)), DDItems.conditionalTabProperties("biomesoplenty")));
		    helper.register(DDNames.TALL_BOP_DEAD, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BOP_DEAD)), DDItems.conditionalTabProperties("biomesoplenty")));
		    helper.register(DDNames.TALL_BOP_FIR, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BOP_FIR)), DDItems.conditionalTabProperties("biomesoplenty")));
		    helper.register(DDNames.TALL_BOP_HELLBARK, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BOP_HELLBARK)), DDItems.conditionalTabProperties("biomesoplenty")));
		    helper.register(DDNames.TALL_BOP_JACARANDA, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BOP_JACARANDA)), DDItems.conditionalTabProperties("biomesoplenty")));
		    helper.register(DDNames.TALL_BOP_MAGIC, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BOP_MAGIC)), DDItems.conditionalTabProperties("biomesoplenty")));
		    helper.register(DDNames.TALL_BOP_MAHOGANY, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BOP_MAHOGANY)), DDItems.conditionalTabProperties("biomesoplenty")));
		    helper.register(DDNames.TALL_BOP_PALM, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BOP_PALM)), DDItems.conditionalTabProperties("biomesoplenty")));
		    helper.register(DDNames.TALL_BOP_REDWOOD, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BOP_REDWOOD)), DDItems.conditionalTabProperties("biomesoplenty")));
		    helper.register(DDNames.TALL_BOP_UMBRAN, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BOP_UMBRAN)), DDItems.conditionalTabProperties("biomesoplenty")));
		    helper.register(DDNames.TALL_BOP_WILLOW, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BOP_WILLOW)), DDItems.conditionalTabProperties("biomesoplenty")));
		    
			// Oh the Biomes You'll Go
			helper.register(DDNames.SHORT_BYG_ASPEN, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_ASPEN)), DDItems.conditionalTabProperties("byg")));
			helper.register(DDNames.SHORT_BYG_BAOBAB, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_BAOBAB)), DDItems.conditionalTabProperties("byg")));
			helper.register(DDNames.SHORT_BYG_BLUE_ENCHANTED, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_BLUE_ENCHANTED)), DDItems.conditionalTabProperties("byg")));
			helper.register(DDNames.SHORT_BYG_BULBIS, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_BULBIS)), DDItems.conditionalTabProperties("byg")));
			helper.register(DDNames.SHORT_BYG_CHERRY, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_CHERRY)), DDItems.conditionalTabProperties("byg")));
			helper.register(DDNames.SHORT_BYG_CIKA, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_CIKA)), DDItems.conditionalTabProperties("byg")));
			helper.register(DDNames.SHORT_BYG_CYPRESS, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_CYPRESS)), DDItems.conditionalTabProperties("byg")));
			helper.register(DDNames.SHORT_BYG_EBONY, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_EBONY)), DDItems.conditionalTabProperties("byg")));
			helper.register(DDNames.SHORT_BYG_EMBUR, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_EMBUR)), DDItems.conditionalTabProperties("byg")));
			helper.register(DDNames.SHORT_BYG_ETHER, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_ETHER)), DDItems.conditionalTabProperties("byg")));
			helper.register(DDNames.SHORT_BYG_FIR, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_FIR)), DDItems.conditionalTabProperties("byg")));
			helper.register(DDNames.SHORT_BYG_FLORUS, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_FLORUS)), DDItems.addIfItemIsAvailable(new ResourceLocation("byg", "florus_door"), DDItems.conditionalTabProperties("byg"))));
			helper.register(DDNames.SHORT_BYG_GREEN_ENCHANTED, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_GREEN_ENCHANTED)), DDItems.conditionalTabProperties("byg")));
			helper.register(DDNames.SHORT_BYG_HOLLY, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_HOLLY)), DDItems.conditionalTabProperties("byg")));
			helper.register(DDNames.SHORT_BYG_IMPARIUS, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_IMPARIUS)), DDItems.conditionalTabProperties("byg")));
			helper.register(DDNames.SHORT_BYG_IRONWOOD, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_IRONWOOD)), DDItems.addIfItemIsAvailable(new ResourceLocation("byg", "ironwood_door"), DDItems.conditionalTabProperties("byg"))));
			helper.register(DDNames.SHORT_BYG_JACARANDA, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_JACARANDA)), DDItems.conditionalTabProperties("byg")));
			helper.register(DDNames.SHORT_BYG_LAMENT, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_LAMENT)), DDItems.conditionalTabProperties("byg")));
			helper.register(DDNames.SHORT_BYG_MAHOGANY, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_MAHOGANY)), DDItems.conditionalTabProperties("byg")));
			helper.register(DDNames.SHORT_BYG_MAPLE, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_MAPLE)), DDItems.conditionalTabProperties("byg")));
			helper.register(DDNames.SHORT_BYG_NIGHTSHADE, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_NIGHTSHADE)), DDItems.conditionalTabProperties("byg")));
			helper.register(DDNames.SHORT_BYG_PALM, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_PALM)), DDItems.conditionalTabProperties("byg")));
			helper.register(DDNames.SHORT_BYG_PINE, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_PINE)), DDItems.conditionalTabProperties("byg")));
			helper.register(DDNames.SHORT_BYG_RAINBOW_EUCALYPTUS, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_RAINBOW_EUCALYPTUS)), DDItems.conditionalTabProperties("byg")));
			helper.register(DDNames.SHORT_BYG_REDWOOD, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_REDWOOD)), DDItems.conditionalTabProperties("byg")));
			helper.register(DDNames.SHORT_BYG_SKYRIS, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_SKYRIS)), DDItems.conditionalTabProperties("byg")));
			helper.register(DDNames.SHORT_BYG_SOUL_SHROOM, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_SOUL_SHROOM)), DDItems.addIfItemIsAvailable(new ResourceLocation("byg", "soul_shroom_door"), DDItems.conditionalTabProperties("byg"))));
			helper.register(DDNames.SHORT_BYG_SYTHIAN, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_SYTHIAN)), DDItems.conditionalTabProperties("byg")));
			helper.register(DDNames.SHORT_BYG_WHITE_MANGROVE, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_WHITE_MANGROVE)), DDItems.conditionalTabProperties("byg")));
			helper.register(DDNames.SHORT_BYG_WILLOW, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_WILLOW)), DDItems.conditionalTabProperties("byg")));
			helper.register(DDNames.SHORT_BYG_WITCH_HAZEL, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_WITCH_HAZEL)), DDItems.conditionalTabProperties("byg")));
			helper.register(DDNames.SHORT_BYG_ZELKOVA, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_ZELKOVA)), DDItems.conditionalTabProperties("byg")));
			
			helper.register(DDNames.TALL_BYG_ASPEN, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_ASPEN)), DDItems.conditionalTabProperties("byg")));
			helper.register(DDNames.TALL_BYG_BAOBAB, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_BAOBAB)), DDItems.conditionalTabProperties("byg")));
			helper.register(DDNames.TALL_BYG_BLUE_ENCHANTED, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_BLUE_ENCHANTED)), DDItems.conditionalTabProperties("byg")));
			helper.register(DDNames.TALL_BYG_BULBIS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_BULBIS)), DDItems.conditionalTabProperties("byg")));
			helper.register(DDNames.TALL_BYG_CHERRY, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_CHERRY)), DDItems.conditionalTabProperties("byg")));
			helper.register(DDNames.TALL_BYG_CIKA, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_CIKA)), DDItems.conditionalTabProperties("byg")));
			helper.register(DDNames.TALL_BYG_CYPRESS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_CYPRESS)), DDItems.conditionalTabProperties("byg")));
			helper.register(DDNames.TALL_BYG_EBONY, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_EBONY)), DDItems.conditionalTabProperties("byg")));
			helper.register(DDNames.TALL_BYG_EMBUR, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_EMBUR)), DDItems.conditionalTabProperties("byg")));
			helper.register(DDNames.TALL_BYG_ETHER, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_ETHER)), DDItems.conditionalTabProperties("byg")));
			helper.register(DDNames.TALL_BYG_FIR, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_FIR)), DDItems.conditionalTabProperties("byg")));
			helper.register(DDNames.TALL_BYG_FLORUS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_FLORUS)), DDItems.addIfItemIsAvailable(new ResourceLocation("byg", "florus_door"), DDItems.conditionalTabProperties("byg"))));
			helper.register(DDNames.TALL_BYG_GREEN_ENCHANTED, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_GREEN_ENCHANTED)), DDItems.conditionalTabProperties("byg")));
			helper.register(DDNames.TALL_BYG_HOLLY, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_HOLLY)), DDItems.conditionalTabProperties("byg")));
			helper.register(DDNames.TALL_BYG_IMPARIUS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_IMPARIUS)), DDItems.conditionalTabProperties("byg")));
			helper.register(DDNames.TALL_BYG_IRONWOOD, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_IRONWOOD)), DDItems.addIfItemIsAvailable(new ResourceLocation("byg", "ironwood_door"), DDItems.conditionalTabProperties("byg"))));
			helper.register(DDNames.TALL_BYG_JACARANDA, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_JACARANDA)), DDItems.conditionalTabProperties("byg")));
			helper.register(DDNames.TALL_BYG_LAMENT, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_LAMENT)), DDItems.conditionalTabProperties("byg")));
			helper.register(DDNames.TALL_BYG_MAHOGANY, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_MAHOGANY)), DDItems.conditionalTabProperties("byg")));
			helper.register(DDNames.TALL_BYG_MAPLE, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_MAPLE)), DDItems.conditionalTabProperties("byg")));
			helper.register(DDNames.TALL_BYG_NIGHTSHADE, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_NIGHTSHADE)), DDItems.conditionalTabProperties("byg")));
			helper.register(DDNames.TALL_BYG_PALM, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_PALM)), DDItems.conditionalTabProperties("byg")));
			helper.register(DDNames.TALL_BYG_PINE, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_PINE)), DDItems.conditionalTabProperties("byg")));
			helper.register(DDNames.TALL_BYG_RAINBOW_EUCALYPTUS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_RAINBOW_EUCALYPTUS)), DDItems.conditionalTabProperties("byg")));
			helper.register(DDNames.TALL_BYG_REDWOOD, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_REDWOOD)), DDItems.conditionalTabProperties("byg")));
			helper.register(DDNames.TALL_BYG_SKYRIS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_SKYRIS)), DDItems.conditionalTabProperties("byg")));
			helper.register(DDNames.TALL_BYG_SOUL_SHROOM, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_SOUL_SHROOM)), DDItems.addIfItemIsAvailable(new ResourceLocation("byg", "soul_shroom_door"), DDItems.conditionalTabProperties("byg"))));
			helper.register(DDNames.TALL_BYG_SYTHIAN, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_SYTHIAN)), DDItems.conditionalTabProperties("byg")));
			helper.register(DDNames.TALL_BYG_WHITE_MANGROVE, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_WHITE_MANGROVE)), DDItems.conditionalTabProperties("byg")));
			helper.register(DDNames.TALL_BYG_WILLOW, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_WILLOW)), DDItems.conditionalTabProperties("byg")));
			helper.register(DDNames.TALL_BYG_WITCH_HAZEL, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_WITCH_HAZEL)), DDItems.conditionalTabProperties("byg")));
			helper.register(DDNames.TALL_BYG_ZELKOVA, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_ZELKOVA)), DDItems.conditionalTabProperties("byg")));
			
		    // Regions Unexplored
		    helper.register(DDNames.SHORT_RUE_BAOBAB, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_BAOBAB)), DDItems.conditionalTabProperties("regions_unexplored")));
		    helper.register(DDNames.SHORT_RUE_BLACKWOOD, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_BLACKWOOD)), DDItems.conditionalTabProperties("regions_unexplored")));
		    helper.register(DDNames.SHORT_RUE_BRIMWOOD, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_BRIMWOOD)), DDItems.conditionalTabProperties("regions_unexplored")));
		    helper.register(DDNames.SHORT_RUE_CHERRY, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_CHERRY)), DDItems.conditionalTabProperties("regions_unexplored")));
		    helper.register(DDNames.SHORT_RUE_CYPRESS, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_CYPRESS)), DDItems.conditionalTabProperties("regions_unexplored")));
		    helper.register(DDNames.SHORT_RUE_DEAD, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_DEAD)), DDItems.conditionalTabProperties("regions_unexplored")));
		    helper.register(DDNames.SHORT_RUE_EUCALYPTUS, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_EUCALYPTUS)), DDItems.conditionalTabProperties("regions_unexplored")));
		    helper.register(DDNames.SHORT_RUE_JOSHUA, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_JOSHUA)), DDItems.conditionalTabProperties("regions_unexplored")));
		    helper.register(DDNames.SHORT_RUE_LARCH, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_LARCH)), DDItems.conditionalTabProperties("regions_unexplored")));
		    helper.register(DDNames.SHORT_RUE_MAPLE, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_MAPLE)), DDItems.conditionalTabProperties("regions_unexplored")));
		    helper.register(DDNames.SHORT_RUE_MAUVE, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_MAUVE)), DDItems.conditionalTabProperties("regions_unexplored")));
		    helper.register(DDNames.SHORT_RUE_PALM, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_PALM)), DDItems.conditionalTabProperties("regions_unexplored")));
		    helper.register(DDNames.SHORT_RUE_PINE, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_PINE)), DDItems.conditionalTabProperties("regions_unexplored")));
		    helper.register(DDNames.SHORT_RUE_REDWOOD, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_REDWOOD)), DDItems.conditionalTabProperties("regions_unexplored")));
		    helper.register(DDNames.SHORT_RUE_WILLOW, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_WILLOW)), DDItems.conditionalTabProperties("regions_unexplored")));
		
		    helper.register(DDNames.TALL_RUE_BAOBAB, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_BAOBAB)), DDItems.conditionalTabProperties("regions_unexplored")));
		    helper.register(DDNames.TALL_RUE_BLACKWOOD, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_BLACKWOOD)), DDItems.conditionalTabProperties("regions_unexplored")));
		    helper.register(DDNames.TALL_RUE_BRIMWOOD, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_BRIMWOOD)), DDItems.conditionalTabProperties("regions_unexplored")));
		    helper.register(DDNames.TALL_RUE_CHERRY, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_CHERRY)), DDItems.conditionalTabProperties("regions_unexplored")));
		    helper.register(DDNames.TALL_RUE_CYPRESS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_CYPRESS)), DDItems.conditionalTabProperties("regions_unexplored")));
		    helper.register(DDNames.TALL_RUE_DEAD, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_DEAD)), DDItems.conditionalTabProperties("regions_unexplored")));
		    helper.register(DDNames.TALL_RUE_EUCALYPTUS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_EUCALYPTUS)), DDItems.conditionalTabProperties("regions_unexplored")));
		    helper.register(DDNames.TALL_RUE_JOSHUA, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_JOSHUA)), DDItems.conditionalTabProperties("regions_unexplored")));
		    helper.register(DDNames.TALL_RUE_LARCH, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_LARCH)), DDItems.conditionalTabProperties("regions_unexplored")));
		    helper.register(DDNames.TALL_RUE_MAPLE, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_MAPLE)), DDItems.conditionalTabProperties("regions_unexplored")));
		    helper.register(DDNames.TALL_RUE_MAUVE, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_MAUVE)), DDItems.conditionalTabProperties("regions_unexplored")));
		    helper.register(DDNames.TALL_RUE_PALM, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_PALM)), DDItems.conditionalTabProperties("regions_unexplored")));
		    helper.register(DDNames.TALL_RUE_PINE, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_PINE)), DDItems.conditionalTabProperties("regions_unexplored")));
		    helper.register(DDNames.TALL_RUE_REDWOOD, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_REDWOOD)), DDItems.conditionalTabProperties("regions_unexplored")));
		    helper.register(DDNames.TALL_RUE_WILLOW, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_WILLOW)), DDItems.conditionalTabProperties("regions_unexplored")));
		    
		    // Biome Makeover
		    helper.register(DDNames.SHORT_BM_ANCIENT_OAK, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BM_ANCIENT_OAK)), DDItems.conditionalTabProperties("biomemakeover")));
		    helper.register(DDNames.SHORT_BM_BLIGHTED_BALSA, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BM_BLIGHTED_BALSA)), DDItems.conditionalTabProperties("biomemakeover")));
		    helper.register(DDNames.SHORT_BM_SWAMP_CYPRESS, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BM_SWAMP_CYPRESS)), DDItems.conditionalTabProperties("biomemakeover")));
		    helper.register(DDNames.SHORT_BM_WILLOW, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BM_WILLOW)), DDItems.conditionalTabProperties("biomemakeover")));
		    
		    helper.register(DDNames.TALL_BM_ANCIENT_OAK, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BM_ANCIENT_OAK)), DDItems.conditionalTabProperties("biomemakeover")));
		    helper.register(DDNames.TALL_BM_BLIGHTED_BALSA, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BM_BLIGHTED_BALSA)), DDItems.conditionalTabProperties("biomemakeover")));
		    helper.register(DDNames.TALL_BM_SWAMP_CYPRESS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BM_SWAMP_CYPRESS)), DDItems.conditionalTabProperties("biomemakeover")));
		    helper.register(DDNames.TALL_BM_WILLOW, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BM_WILLOW)), DDItems.conditionalTabProperties("biomemakeover")));
		    
		    // Darker Depths
		    helper.register(DDNames.SHORT_PETRIFIED, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_PETRIFIED)), DDItems.conditionalTabProperties("darkerdepths")));
		
		    helper.register(DDNames.TALL_PETRIFIED, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_PETRIFIED)), DDItems.conditionalTabProperties("darkerdepths")));
		    
		    // Ecologics
		    helper.register(DDNames.SHORT_ECO_AZALEA, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ECO_AZALEA)), DDItems.conditionalTabProperties("ecologics")));
		    helper.register(DDNames.SHORT_ECO_FLOWERING_AZALEA, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ECO_FLOWERING_AZALEA)), DDItems.conditionalTabProperties("ecologics")));
		    helper.register(DDNames.SHORT_ECO_COCONUT, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ECO_COCONUT)), DDItems.conditionalTabProperties("ecologics")));
		    helper.register(DDNames.SHORT_ECO_WALNUT, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ECO_WALNUT)), DDItems.conditionalTabProperties("ecologics")));
		    
		    helper.register(DDNames.TALL_ECO_AZALEA, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ECO_AZALEA)), DDItems.conditionalTabProperties("ecologics")));
		    helper.register(DDNames.TALL_ECO_FLOWERING_AZALEA, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ECO_FLOWERING_AZALEA)), DDItems.conditionalTabProperties("ecologics")));
		    helper.register(DDNames.TALL_ECO_COCONUT, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ECO_COCONUT)), DDItems.conditionalTabProperties("ecologics")));
		    helper.register(DDNames.TALL_ECO_WALNUT, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ECO_WALNUT)), DDItems.conditionalTabProperties("ecologics")));
		    
		    // End's Phantasm
		    helper.register(DDNames.SHORT_EBONY, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_EBONY)), DDItems.conditionalTabProperties("phantasm")));
		    helper.register(DDNames.SHORT_PREAM, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_PREAM)), DDItems.conditionalTabProperties("phantasm")));
		    
		    helper.register(DDNames.TALL_EBONY, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_EBONY)), DDItems.conditionalTabProperties("phantasm")));
		    helper.register(DDNames.TALL_PREAM, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_PREAM)), DDItems.conditionalTabProperties("phantasm")));
		    
		    // Enlightened End
		    helper.register(DDNames.SHORT_CONGEALED, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CONGEALED)), DDItems.conditionalTabProperties("enlightened_end")));
		    helper.register(DDNames.SHORT_EE_EBONY, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_EE_EBONY)), DDItems.conditionalTabProperties("enlightened_end")));
		
		    helper.register(DDNames.TALL_CONGEALED, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CONGEALED)), DDItems.conditionalTabProperties("enlightened_end")));
		    helper.register(DDNames.TALL_EE_EBONY, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_EE_EBONY)), DDItems.conditionalTabProperties("enlightened_end")));
		
		    // Garden of the Dead
		    helper.register(DDNames.SHORT_SOULBLIGHT, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_SOULBLIGHT)), DDItems.conditionalTabProperties("gardens_of_the_dead")));
		    helper.register(DDNames.SHORT_WHISTLECANE, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_WHISTLECANE)), DDItems.conditionalTabProperties("gardens_of_the_dead")));
		    
		    helper.register(DDNames.TALL_SOULBLIGHT, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_SOULBLIGHT)), DDItems.conditionalTabProperties("gardens_of_the_dead")));
		    helper.register(DDNames.TALL_WHISTLECANE, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_WHISTLECANE)), DDItems.conditionalTabProperties("gardens_of_the_dead")));
		    
		    // Mystic's Biomes
		    helper.register(DDNames.SHORT_MB_CHERRY, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MB_CHERRY)), DDItems.conditionalTabProperties("mysticsbiomes")));
		    helper.register(DDNames.SHORT_MB_JACARANDA, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MB_JACARANDA)), DDItems.conditionalTabProperties("mysticsbiomes")));    
		    helper.register(DDNames.SHORT_MB_STRAWBERRY, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MB_STRAWBERRY)), DDItems.conditionalTabProperties("mysticsbiomes")));
		
		    helper.register(DDNames.TALL_MB_CHERRY, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MB_CHERRY)), DDItems.conditionalTabProperties("mysticsbiomes")));
		    helper.register(DDNames.TALL_MB_JACARANDA, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MB_JACARANDA)), DDItems.conditionalTabProperties("mysticsbiomes")));    
		    helper.register(DDNames.TALL_MB_STRAWBERRY, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MB_STRAWBERRY)), DDItems.conditionalTabProperties("mysticsbiomes")));
		    
		    // Nether's Exoticism
		    helper.register(DDNames.SHORT_JABOTICABA, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_JABOTICABA)), DDItems.conditionalTabProperties("nethers_exoticism")));
		    helper.register(DDNames.SHORT_RAMBOUTAN, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RAMBOUTAN)), DDItems.conditionalTabProperties("nethers_exoticism")));
		
		    helper.register(DDNames.TALL_JABOTICABA, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_JABOTICABA)), DDItems.conditionalTabProperties("nethers_exoticism")));
		    helper.register(DDNames.TALL_RAMBOUTAN, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RAMBOUTAN)), DDItems.conditionalTabProperties("nethers_exoticism")));
		    
		    // Outer End
		    helper.register(DDNames.SHORT_AZURE, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_AZURE)), DDItems.conditionalTabProperties("outer_end")));
		
		    helper.register(DDNames.TALL_AZURE, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_AZURE)), DDItems.conditionalTabProperties("outer_end")));    
		    
		    // Premium Wood
		    helper.register(DDNames.SHORT_PW_MAGIC, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_PW_MAGIC)), DDItems.conditionalTabProperties("premium_wood")));
		    helper.register(DDNames.SHORT_PW_MAPLE, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_PW_MAPLE)), DDItems.conditionalTabProperties("premium_wood")));
		    helper.register(DDNames.SHORT_PW_PURPLE_HEART, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_PW_PURPLE_HEART)), DDItems.conditionalTabProperties("premium_wood")));
		    helper.register(DDNames.SHORT_PW_SILVERBELL, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_PW_SILVERBELL)), DDItems.conditionalTabProperties("premium_wood")));
		    helper.register(DDNames.SHORT_PW_TIGER, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_PW_TIGER)), DDItems.conditionalTabProperties("premium_wood")));
		    helper.register(DDNames.SHORT_PW_WILLOW, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_PW_WILLOW)), DDItems.conditionalTabProperties("premium_wood")));
		    
		    helper.register(DDNames.TALL_PW_MAGIC, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_PW_MAGIC)), DDItems.conditionalTabProperties("premium_wood")));
		    helper.register(DDNames.TALL_PW_MAPLE, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_PW_MAPLE)), DDItems.conditionalTabProperties("premium_wood")));
		    helper.register(DDNames.TALL_PW_PURPLE_HEART, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_PW_PURPLE_HEART)), DDItems.conditionalTabProperties("premium_wood")));
		    helper.register(DDNames.TALL_PW_SILVERBELL, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_PW_SILVERBELL)), DDItems.conditionalTabProperties("premium_wood")));
		    helper.register(DDNames.TALL_PW_TIGER, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_PW_TIGER)), DDItems.conditionalTabProperties("premium_wood")));
		    helper.register(DDNames.TALL_PW_WILLOW, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_PW_WILLOW)), DDItems.conditionalTabProperties("premium_wood")));
		});
	}
}
