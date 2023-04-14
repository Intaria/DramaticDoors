package com.fizzware.dramaticdoors.init.compat;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DramaticDoors;
import com.fizzware.dramaticdoors.blocks.TallDoorBlock;
import com.fizzware.dramaticdoors.init.DDBlocks;
import com.fizzware.dramaticdoors.init.DDItems;
import com.fizzware.dramaticdoors.items.TallDoorItem;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;

public class DDBYGRegistry
{
	@SubscribeEvent
	public static void register(RegisterEvent event) {
		event.register(ForgeRegistries.Keys.BLOCKS, helper -> {
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
		});
		event.register(ForgeRegistries.Keys.ITEMS, helper -> {
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
		});
	}
}
