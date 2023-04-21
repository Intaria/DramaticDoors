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

public class DDDimensionalPackRegistry
{
	@SubscribeEvent
	public static void register(RegisterEvent event) {
		event.register(ForgeRegistries.Keys.BLOCKS, helper -> {
		    // Ad Astra
		    helper.register(DDNames.SHORT_AERONOS, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ad_astra", "aeronos"))));
		    helper.register(DDNames.SHORT_GLACIAN, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ad_astra", "glacian_door"))));
		    helper.register(DDNames.SHORT_STROPHAR, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ad_astra", "strophar_door"))));
		    helper.register(DDNames.SHORT_AA_STEEL, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ad_astra", "steel_door"), Blocks.IRON_DOOR)));
		    
		    helper.register(DDNames.TALL_AERONOS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ad_astra", "aeronos"))));
		    helper.register(DDNames.TALL_GLACIAN, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ad_astra", "glacian_door"))));
		    helper.register(DDNames.TALL_STROPHAR, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ad_astra", "strophar_door"))));
		    helper.register(DDNames.TALL_AA_STEEL, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ad_astra", "steel_door"), Blocks.IRON_DOOR)));
		    
		    // Blue Skies
		    helper.register(DDNames.SHORT_BS_BLUEBRIGHT, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("blue_skies", "bluebright_door"))));
		    helper.register(DDNames.SHORT_BS_CHERRY, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("blue_skies", "cherry_door"))));
		    helper.register(DDNames.SHORT_BS_CRYSTALLIZED, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("blue_skies", "crystallized_door"))));
		    helper.register(DDNames.SHORT_BS_DUSK, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("blue_skies", "dusk_door"))));
		    helper.register(DDNames.SHORT_BS_FROSTBRIGHT, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("blue_skies", "frostbright_door"))));
		    helper.register(DDNames.SHORT_BS_LUNAR, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("blue_skies", "lunar_door"))));
		    helper.register(DDNames.SHORT_BS_MAPLE, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("blue_skies", "maple_door"))));
		    helper.register(DDNames.SHORT_BS_STARLIT, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("blue_skies", "starlit_door"))));
		    
		    helper.register(DDNames.TALL_BS_BLUEBRIGHT, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("blue_skies", "bluebright_door"))));
		    helper.register(DDNames.TALL_BS_CHERRY, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("blue_skies", "cherry_door"))));
		    helper.register(DDNames.TALL_BS_CRYSTALLIZED, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("blue_skies", "crystallized_door"))));
		    helper.register(DDNames.TALL_BS_DUSK, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("blue_skies", "dusk_door"))));
		    helper.register(DDNames.TALL_BS_FROSTBRIGHT, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("blue_skies", "frostbright_door"))));
		    helper.register(DDNames.TALL_BS_LUNAR, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("blue_skies", "lunar_door"))));
		    helper.register(DDNames.TALL_BS_MAPLE, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("blue_skies", "maple_door"))));
		    helper.register(DDNames.TALL_BS_STARLIT, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("blue_skies", "starlit_door"))));
		    
		    // The Ceilands
		    helper.register(DDNames.SHORT_CEILTRUNK, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ceilands", "ceiltrunk_door"))));
		    helper.register(DDNames.SHORT_LUZAWOOD, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ceilands", "luzawood_door"))));
		
		    helper.register(DDNames.TALL_CEILTRUNK, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ceilands", "ceiltrunk_door"))));
		    helper.register(DDNames.TALL_LUZAWOOD, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ceilands", "luzawood_door"))));

		    // Deeper Darker
		    helper.register(DDNames.SHORT_ECHO, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("deeperdarker", "echo_door"))));
		    
		    helper.register(DDNames.TALL_ECHO, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("deeperdarker", "echo_door"))));
		    
		    // Prehistoric Fauna
		    helper.register(DDNames.SHORT_AGATHOXYLON, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("prehistoricfauna", "agathoxylon_door"))));
		    helper.register(DDNames.SHORT_ARAUCARIA, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("prehistoricfauna", "araucaria_door"))));
		    helper.register(DDNames.SHORT_BRACHYPHYLLUM, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("prehistoricfauna", "brachphyllum_door"))));
		    helper.register(DDNames.SHORT_GINKGO, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("prehistoricfauna", "ginkgo_door"))));
		    helper.register(DDNames.SHORT_HEIDIPHYLLUM, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("prehistoricfauna", "heidiphyllum_door"))));
		    helper.register(DDNames.SHORT_LIRIODENDRITES, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("prehistoricfauna", "liriodendrites_door"))));
		    helper.register(DDNames.SHORT_METASEQUOIA, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("prehistoricfauna", "metasequoia_door"))));
		    helper.register(DDNames.SHORT_NEOCALAMITES, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("prehistoricfauna", "neocalamites_door"))));
		    helper.register(DDNames.SHORT_PROTOJUNIPEROXYLON, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("prehistoricfauna", "protojuniperoxylon_door"))));
		    helper.register(DDNames.SHORT_PROTOPICEOXYLON, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("prehistoricfauna", "protopiceoxylon_door"))));
		    helper.register(DDNames.SHORT_SCHILDERIA, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("prehistoricfauna", "schilderia_door"))));
		    helper.register(DDNames.SHORT_TROCHODENDROIDES, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("prehistoricfauna", "trochodendroides_door"))));
		    helper.register(DDNames.SHORT_WOODWORTHIA, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("prehistoricfauna", "woodworthia_door"))));
		    helper.register(DDNames.SHORT_ZAMITES, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("prehistoricfauna", "zamites_door"))));
		    
		    helper.register(DDNames.TALL_AGATHOXYLON, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("prehistoricfauna", "agathoxylon_door"))));
		    helper.register(DDNames.TALL_ARAUCARIA, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("prehistoricfauna", "araucaria_door"))));
		    helper.register(DDNames.TALL_BRACHYPHYLLUM, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("prehistoricfauna", "brachphyllum_door"))));
		    helper.register(DDNames.TALL_GINKGO, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("prehistoricfauna", "ginkgo_door"))));
		    helper.register(DDNames.TALL_HEIDIPHYLLUM, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("prehistoricfauna", "heidiphyllum_door"))));
		    helper.register(DDNames.TALL_LIRIODENDRITES, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("prehistoricfauna", "liriodendrites_door"))));
		    helper.register(DDNames.TALL_METASEQUOIA, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("prehistoricfauna", "metasequoia_door"))));
		    helper.register(DDNames.TALL_NEOCALAMITES, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("prehistoricfauna", "neocalamites_door"))));
		    helper.register(DDNames.TALL_PROTOJUNIPEROXYLON, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("prehistoricfauna", "protojuniperoxylon_door"))));
		    helper.register(DDNames.TALL_PROTOPICEOXYLON, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("prehistoricfauna", "protopiceoxylon_door"))));
		    helper.register(DDNames.TALL_SCHILDERIA, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("prehistoricfauna", "schilderia_door"))));
		    helper.register(DDNames.TALL_TROCHODENDROIDES, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("prehistoricfauna", "trochodendroides_door"))));
		    helper.register(DDNames.TALL_WOODWORTHIA, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("prehistoricfauna", "woodworthia_door"))));
		    helper.register(DDNames.TALL_ZAMITES, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("prehistoricfauna", "zamites_door"))));
		    
		    // Twilight Forest
		    helper.register(DDNames.SHORT_CANOPY, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("twilightforest", "canopy_door"))));
		    helper.register(DDNames.SHORT_DARKWOOD, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("twilightforest", "dark_door"))));
		    helper.register(DDNames.SHORT_TWILIGHT_MANGROVE, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("twilightforest", "mangrove_door"))));
		    helper.register(DDNames.SHORT_MINEWOOD, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("twilightforest", "mining_door"))));
		    helper.register(DDNames.SHORT_SORTINGWOOD, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("twilightforest", "sorting_door"))));
		    helper.register(DDNames.SHORT_TIMEWOOD, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("twilightforest", "time_door"))));
		    helper.register(DDNames.SHORT_TRANSWOOD, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("twilightforest", "transformation_door"))));
		    helper.register(DDNames.SHORT_TWILIGHT_OAK, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("twilightforest", "twilight_oak_door"))));
		    
		    helper.register(DDNames.SHORT_TOWERWOOD, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("tflostblocks", "towerwood_door"))));
		    
		    helper.register(DDNames.TALL_CANOPY, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("twilightforest", "canopy_door"))));
		    helper.register(DDNames.TALL_DARKWOOD, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("twilightforest", "dark_door"))));
		    helper.register(DDNames.TALL_TWILIGHT_MANGROVE, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("twilightforest", "mangrove_door"))));
		    helper.register(DDNames.TALL_MINEWOOD, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("twilightforest", "mining_door"))));
		    helper.register(DDNames.TALL_SORTINGWOOD, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("twilightforest", "sorting_door"))));
		    helper.register(DDNames.TALL_TIMEWOOD, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("twilightforest", "time_door"))));
		    helper.register(DDNames.TALL_TRANSWOOD, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("twilightforest", "transformation_door"))));
		    helper.register(DDNames.TALL_TWILIGHT_OAK, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("twilightforest", "twilight_oak_door"))));
		    
		    helper.register(DDNames.TALL_TOWERWOOD, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("tflostblocks", "towerwood_door"))));

		    // Undergarden
			helper.register(DDNames.SHORT_GRONGLE, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("undergarden", "grongle_door"))));
		    helper.register(DDNames.SHORT_SMOGSTEM, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("undergarden", "smogstem_door"))));
		    helper.register(DDNames.SHORT_WIGGLEWOOD, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("undergarden", "wigglewood_door"))));
		    
			helper.register(DDNames.TALL_GRONGLE, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("undergarden", "grongle_door"))));
		    helper.register(DDNames.TALL_SMOGSTEM, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("undergarden", "smogstem_door"))));
		    helper.register(DDNames.TALL_WIGGLEWOOD, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("undergarden", "wigglewood_door"))));

		});
		event.register(ForgeRegistries.Keys.ITEMS, helper -> {
		    // Ad Astra
		    helper.register(DDNames.SHORT_AERONOS, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_AERONOS)), DDItems.conditionalTabProperties("ad_astra")));
		    helper.register(DDNames.SHORT_GLACIAN, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_GLACIAN)), DDItems.conditionalTabProperties("ad_astra")));
		    helper.register(DDNames.SHORT_STROPHAR, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_STROPHAR)), DDItems.conditionalTabProperties("ad_astra")));
		    helper.register(DDNames.SHORT_AA_STEEL, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_AA_STEEL)), DDItems.conditionalTabProperties("ad_astra")));
		    
		    helper.register(DDNames.TALL_AERONOS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_AERONOS)), DDItems.conditionalTabProperties("ad_astra")));
		    helper.register(DDNames.TALL_GLACIAN, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_GLACIAN)), DDItems.conditionalTabProperties("ad_astra")));
		    helper.register(DDNames.TALL_STROPHAR, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_STROPHAR)), DDItems.conditionalTabProperties("ad_astra")));
		    helper.register(DDNames.TALL_AA_STEEL, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_AA_STEEL)), DDItems.conditionalTabProperties("ad_astra")));
		    
		    // Blue Skies
		    helper.register(DDNames.SHORT_BS_BLUEBRIGHT, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BS_BLUEBRIGHT)), DDItems.conditionalTabProperties("blue_skies")));
		    helper.register(DDNames.SHORT_BS_CHERRY, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BS_CHERRY)), DDItems.conditionalTabProperties("blue_skies")));
		    helper.register(DDNames.SHORT_BS_CRYSTALLIZED, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BS_CRYSTALLIZED)), DDItems.conditionalTabProperties("blue_skies")));
		    helper.register(DDNames.SHORT_BS_DUSK, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BS_DUSK)), DDItems.conditionalTabProperties("blue_skies")));
		    helper.register(DDNames.SHORT_BS_FROSTBRIGHT, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BS_FROSTBRIGHT)), DDItems.conditionalTabProperties("blue_skies")));
		    helper.register(DDNames.SHORT_BS_LUNAR, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BS_LUNAR)), DDItems.conditionalTabProperties("blue_skies")));
		    helper.register(DDNames.SHORT_BS_MAPLE, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BS_MAPLE)), DDItems.conditionalTabProperties("blue_skies")));
		    helper.register(DDNames.SHORT_BS_STARLIT, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BS_STARLIT)), DDItems.conditionalTabProperties("blue_skies")));
		    
		    helper.register(DDNames.TALL_BS_BLUEBRIGHT, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BS_BLUEBRIGHT)), DDItems.conditionalTabProperties("blue_skies")));
		    helper.register(DDNames.TALL_BS_CHERRY, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BS_CHERRY)), DDItems.conditionalTabProperties("blue_skies")));
		    helper.register(DDNames.TALL_BS_CRYSTALLIZED, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BS_CRYSTALLIZED)), DDItems.conditionalTabProperties("blue_skies")));
		    helper.register(DDNames.TALL_BS_DUSK, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BS_DUSK)), DDItems.conditionalTabProperties("blue_skies")));
		    helper.register(DDNames.TALL_BS_FROSTBRIGHT, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BS_FROSTBRIGHT)), DDItems.conditionalTabProperties("blue_skies")));
		    helper.register(DDNames.TALL_BS_LUNAR, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BS_LUNAR)), DDItems.conditionalTabProperties("blue_skies")));
		    helper.register(DDNames.TALL_BS_MAPLE, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BS_MAPLE)), DDItems.conditionalTabProperties("blue_skies")));
		    helper.register(DDNames.TALL_BS_STARLIT, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BS_STARLIT)), DDItems.conditionalTabProperties("blue_skies")));
		    
		    // The Ceilands
		    helper.register(DDNames.SHORT_CEILTRUNK, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CEILTRUNK)), DDItems.conditionalTabProperties("ceilands")));
		    helper.register(DDNames.SHORT_LUZAWOOD, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_LUZAWOOD)), DDItems.conditionalTabProperties("ceilands")));
		    
		    helper.register(DDNames.TALL_CEILTRUNK, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CEILTRUNK)), DDItems.conditionalTabProperties("ceilands")));
		    helper.register(DDNames.TALL_LUZAWOOD, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_LUZAWOOD)), DDItems.conditionalTabProperties("ceilands")));
		    
		    // Deeper Darker
		    helper.register(DDNames.SHORT_ECHO, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ECHO)), DDItems.conditionalTabProperties("deeperdarker")));    
		
		    helper.register(DDNames.TALL_ECHO, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ECHO)), DDItems.conditionalTabProperties("deeperdarker")));    
		    
		    // Prehistoric Fauna
		    helper.register(DDNames.SHORT_AGATHOXYLON, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_AGATHOXYLON)), DDItems.conditionalTabProperties("prehistoricfauna")));
		    helper.register(DDNames.SHORT_ARAUCARIA, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ARAUCARIA)), DDItems.conditionalTabProperties("prehistoricfauna")));
		    helper.register(DDNames.SHORT_BRACHYPHYLLUM, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BRACHYPHYLLUM)), DDItems.conditionalTabProperties("prehistoricfauna")));
		    helper.register(DDNames.SHORT_GINKGO, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_GINKGO)), DDItems.conditionalTabProperties("prehistoricfauna")));
		    helper.register(DDNames.SHORT_HEIDIPHYLLUM, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_HEIDIPHYLLUM)), DDItems.conditionalTabProperties("prehistoricfauna")));
		    helper.register(DDNames.SHORT_LIRIODENDRITES, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_LIRIODENDRITES)), DDItems.conditionalTabProperties("prehistoricfauna")));
		    helper.register(DDNames.SHORT_METASEQUOIA, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_METASEQUOIA)), DDItems.conditionalTabProperties("prehistoricfauna")));
		    helper.register(DDNames.SHORT_NEOCALAMITES, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_NEOCALAMITES)), DDItems.conditionalTabProperties("prehistoricfauna")));
		    helper.register(DDNames.SHORT_PROTOJUNIPEROXYLON, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_PROTOJUNIPEROXYLON)), DDItems.conditionalTabProperties("prehistoricfauna")));
		    helper.register(DDNames.SHORT_PROTOPICEOXYLON, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_PROTOPICEOXYLON)), DDItems.conditionalTabProperties("prehistoricfauna")));
		    helper.register(DDNames.SHORT_SCHILDERIA, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_SCHILDERIA)), DDItems.conditionalTabProperties("prehistoricfauna")));
		    helper.register(DDNames.SHORT_TROCHODENDROIDES, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TROCHODENDROIDES)), DDItems.conditionalTabProperties("prehistoricfauna")));
		    helper.register(DDNames.SHORT_WOODWORTHIA, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_WOODWORTHIA)), DDItems.conditionalTabProperties("prehistoricfauna")));
		    helper.register(DDNames.SHORT_ZAMITES, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ZAMITES)), DDItems.conditionalTabProperties("prehistoricfauna")));
		
		    helper.register(DDNames.TALL_AGATHOXYLON, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_AGATHOXYLON)), DDItems.conditionalTabProperties("prehistoricfauna")));
		    helper.register(DDNames.TALL_ARAUCARIA, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ARAUCARIA)), DDItems.conditionalTabProperties("prehistoricfauna")));
		    helper.register(DDNames.TALL_BRACHYPHYLLUM, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BRACHYPHYLLUM)), DDItems.conditionalTabProperties("prehistoricfauna")));
		    helper.register(DDNames.TALL_GINKGO, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_GINKGO)), DDItems.conditionalTabProperties("prehistoricfauna")));
		    helper.register(DDNames.TALL_HEIDIPHYLLUM, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_HEIDIPHYLLUM)), DDItems.conditionalTabProperties("prehistoricfauna")));
		    helper.register(DDNames.TALL_LIRIODENDRITES, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_LIRIODENDRITES)), DDItems.conditionalTabProperties("prehistoricfauna")));
		    helper.register(DDNames.TALL_METASEQUOIA, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_METASEQUOIA)), DDItems.conditionalTabProperties("prehistoricfauna")));
		    helper.register(DDNames.TALL_NEOCALAMITES, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_NEOCALAMITES)), DDItems.conditionalTabProperties("prehistoricfauna")));
		    helper.register(DDNames.TALL_PROTOJUNIPEROXYLON, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_PROTOJUNIPEROXYLON)), DDItems.conditionalTabProperties("prehistoricfauna")));
		    helper.register(DDNames.TALL_PROTOPICEOXYLON, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_PROTOPICEOXYLON)), DDItems.conditionalTabProperties("prehistoricfauna")));
		    helper.register(DDNames.TALL_SCHILDERIA, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_SCHILDERIA)), DDItems.conditionalTabProperties("prehistoricfauna")));
		    helper.register(DDNames.TALL_TROCHODENDROIDES, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TROCHODENDROIDES)), DDItems.conditionalTabProperties("prehistoricfauna")));
		    helper.register(DDNames.TALL_WOODWORTHIA, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_WOODWORTHIA)), DDItems.conditionalTabProperties("prehistoricfauna")));
		    helper.register(DDNames.TALL_ZAMITES, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ZAMITES)), DDItems.conditionalTabProperties("prehistoricfauna")));
		
		    // Twilight Forest
		    helper.register(DDNames.SHORT_CANOPY, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CANOPY)), DDItems.conditionalTabProperties("twilightforest")));
		    helper.register(DDNames.SHORT_DARKWOOD, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_DARKWOOD)), DDItems.conditionalTabProperties("twilightforest")));
		    helper.register(DDNames.SHORT_TWILIGHT_MANGROVE, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TWILIGHT_MANGROVE)), DDItems.conditionalTabProperties("twilightforest")));
		    helper.register(DDNames.SHORT_MINEWOOD, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MINEWOOD)), DDItems.conditionalTabProperties("twilightforest")));
		    helper.register(DDNames.SHORT_SORTINGWOOD, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_SORTINGWOOD)), DDItems.conditionalTabProperties("twilightforest")));
		    helper.register(DDNames.SHORT_TIMEWOOD, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TIMEWOOD)), DDItems.conditionalTabProperties("twilightforest")));
		    helper.register(DDNames.SHORT_TRANSWOOD, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TRANSWOOD)), DDItems.conditionalTabProperties("twilightforest")));
		    helper.register(DDNames.SHORT_TWILIGHT_OAK, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TWILIGHT_OAK)), DDItems.conditionalTabProperties("twilightforest")));
		
		    helper.register(DDNames.SHORT_TOWERWOOD, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TOWERWOOD)), DDItems.conditionalTabProperties("tflostblocks")));
		
		    helper.register(DDNames.TALL_CANOPY, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CANOPY)), DDItems.conditionalTabProperties("twilightforest")));
		    helper.register(DDNames.TALL_DARKWOOD, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_DARKWOOD)), DDItems.conditionalTabProperties("twilightforest")));
		    helper.register(DDNames.TALL_TWILIGHT_MANGROVE, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TWILIGHT_MANGROVE)), DDItems.conditionalTabProperties("twilightforest")));
		    helper.register(DDNames.TALL_MINEWOOD, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MINEWOOD)), DDItems.conditionalTabProperties("twilightforest")));
		    helper.register(DDNames.TALL_SORTINGWOOD, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_SORTINGWOOD)), DDItems.conditionalTabProperties("twilightforest")));
		    helper.register(DDNames.TALL_TIMEWOOD, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TIMEWOOD)), DDItems.conditionalTabProperties("twilightforest")));
		    helper.register(DDNames.TALL_TRANSWOOD, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TRANSWOOD)), DDItems.conditionalTabProperties("twilightforest")));
		    helper.register(DDNames.TALL_TWILIGHT_OAK, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TWILIGHT_OAK)), DDItems.conditionalTabProperties("twilightforest")));
		
		    helper.register(DDNames.TALL_TOWERWOOD, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TOWERWOOD)), DDItems.conditionalTabProperties("tflostblocks")));

		    // Undergarden
		    helper.register(DDNames.SHORT_GRONGLE, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_GRONGLE)), DDItems.conditionalTabProperties("undergarden")));
		    helper.register(DDNames.SHORT_SMOGSTEM, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_SMOGSTEM)), DDItems.conditionalTabProperties("undergarden")));
		    helper.register(DDNames.SHORT_WIGGLEWOOD, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_WIGGLEWOOD)), DDItems.conditionalTabProperties("undergarden")));
		    
		    helper.register(DDNames.TALL_GRONGLE, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_GRONGLE)), DDItems.conditionalTabProperties("undergarden")));
		    helper.register(DDNames.TALL_SMOGSTEM, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_SMOGSTEM)), DDItems.conditionalTabProperties("undergarden")));
		    helper.register(DDNames.TALL_WIGGLEWOOD, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_WIGGLEWOOD)), DDItems.conditionalTabProperties("undergarden")));
		});
	}
}
