package com.fizzware.dramaticdoors.init.compat;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DramaticDoors;
import com.fizzware.dramaticdoors.blocks.TallDoorBlock;
import com.fizzware.dramaticdoors.init.DDBlocks;
import com.fizzware.dramaticdoors.init.DDItems;
import com.fizzware.dramaticdoors.items.TallDoorItem;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;

public class DDMoShizRegistry
{
	@SubscribeEvent
	public static void register(RegisterEvent event) {
		event.register(ForgeRegistries.Keys.BLOCKS, helper -> {
			helper.register(DDNames.TALL_MS_IRON_BAR, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/iron_bar"), Blocks.IRON_DOOR)));
		    helper.register(DDNames.TALL_MS_BAMBOO, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/bamboo"))));
		    helper.register(DDNames.TALL_MS_CHERRY, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/cherry"))));
		    helper.register(DDNames.TALL_MS_GLOWOOD, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/glowood"))));
		    helper.register(DDNames.TALL_MS_HELLWOOD, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/hellwood"))));
		    helper.register(DDNames.TALL_MS_MAPLE, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/maple"))));
		    helper.register(DDNames.TALL_MS_SILVERBELL, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/silverbell"))));
		    helper.register(DDNames.TALL_MS_TIGERWOOD, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/tigerwood"))));
		    helper.register(DDNames.TALL_MS_WILLOW, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/willow"))));
		    helper.register(DDNames.TALL_MS_GLASS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/glass"))));
		    helper.register(DDNames.TALL_MS_SOUL_GLASS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/soul_glass"))));
		    helper.register(DDNames.TALL_MS_TINTED_GLASS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/tinted_glass"))));
		    helper.register(DDNames.TALL_MS_BLACK_GLASS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/black_glass"))));
		    helper.register(DDNames.TALL_MS_GREY_GLASS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/grey_glass"))));
		    helper.register(DDNames.TALL_MS_LIGHT_GREY_GLASS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/light_grey_glass"))));
		    helper.register(DDNames.TALL_MS_WHITE_GLASS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/white_glass"))));
		    helper.register(DDNames.TALL_MS_RED_GLASS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/red_glass"))));
		    helper.register(DDNames.TALL_MS_ORANGE_GLASS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/orange_glass"))));
		    helper.register(DDNames.TALL_MS_YELLOW_GLASS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/yellow_glass"))));
		    helper.register(DDNames.TALL_MS_LIME_GLASS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/lime_glass"))));
		    helper.register(DDNames.TALL_MS_GREEN_GLASS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/green_glass"))));
		    helper.register(DDNames.TALL_MS_CYAN_GLASS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/cyan_glass"))));
		    helper.register(DDNames.TALL_MS_BLUE_GLASS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/blue_glass"))));
		    helper.register(DDNames.TALL_MS_PURPLE_GLASS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/purple_glass"))));
		    helper.register(DDNames.TALL_MS_MAGENTA_GLASS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/magenta_glass"))));
		    helper.register(DDNames.TALL_MS_PINK_GLASS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/pink_glassr"))));
		    helper.register(DDNames.TALL_MS_LIGHT_BLUE_GLASS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/light_blue_glass"))));
		    helper.register(DDNames.TALL_MS_BROWN_GLASS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/brown_glass"))));
		});
		event.register(ForgeRegistries.Keys.ITEMS, helper -> {
		    helper.register(DDNames.TALL_MS_IRON_BAR, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_IRON_BAR)), DDItems.conditionalTabProperties("ms")));
		    helper.register(DDNames.TALL_MS_BAMBOO, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_BAMBOO)), DDItems.conditionalTabProperties("ms")));
		    helper.register(DDNames.TALL_MS_CHERRY, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_CHERRY)), DDItems.conditionalTabProperties("ms")));
		    helper.register(DDNames.TALL_MS_GLOWOOD, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_GLOWOOD)), DDItems.conditionalTabProperties("ms")));
		    helper.register(DDNames.TALL_MS_HELLWOOD, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_HELLWOOD)), DDItems.conditionalTabProperties("ms")));
		    helper.register(DDNames.TALL_MS_MAPLE, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_MAPLE)), DDItems.conditionalTabProperties("ms")));
		    helper.register(DDNames.TALL_MS_SILVERBELL, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_SILVERBELL)), DDItems.conditionalTabProperties("ms")));
		    helper.register(DDNames.TALL_MS_TIGERWOOD, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_TIGERWOOD)), DDItems.conditionalTabProperties("ms")));
		    helper.register(DDNames.TALL_MS_WILLOW, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_WILLOW)), DDItems.conditionalTabProperties("ms")));
		    helper.register(DDNames.TALL_MS_GLASS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_GLASS)), DDItems.conditionalTabProperties("ms")));
		    helper.register(DDNames.TALL_MS_SOUL_GLASS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_SOUL_GLASS)), DDItems.conditionalTabProperties("ms")));
		    helper.register(DDNames.TALL_MS_TINTED_GLASS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_TINTED_GLASS)), DDItems.conditionalTabProperties("ms")));
		    helper.register(DDNames.TALL_MS_BLACK_GLASS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_BLACK_GLASS)), DDItems.conditionalTabProperties("ms")));
		    helper.register(DDNames.TALL_MS_GREY_GLASS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_GREY_GLASS)), DDItems.conditionalTabProperties("ms")));
		    helper.register(DDNames.TALL_MS_LIGHT_GREY_GLASS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_LIGHT_GREY_GLASS)), DDItems.conditionalTabProperties("ms")));
		    helper.register(DDNames.TALL_MS_WHITE_GLASS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_WHITE_GLASS)), DDItems.conditionalTabProperties("ms")));
		    helper.register(DDNames.TALL_MS_RED_GLASS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_RED_GLASS)), DDItems.conditionalTabProperties("ms")));
		    helper.register(DDNames.TALL_MS_ORANGE_GLASS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_ORANGE_GLASS)), DDItems.conditionalTabProperties("ms")));
		    helper.register(DDNames.TALL_MS_YELLOW_GLASS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_YELLOW_GLASS)), DDItems.conditionalTabProperties("ms")));
		    helper.register(DDNames.TALL_MS_LIME_GLASS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_LIME_GLASS)), DDItems.conditionalTabProperties("ms")));
		    helper.register(DDNames.TALL_MS_GREEN_GLASS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_GREEN_GLASS)), DDItems.conditionalTabProperties("ms")));
		    helper.register(DDNames.TALL_MS_CYAN_GLASS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_CYAN_GLASS)), DDItems.conditionalTabProperties("ms")));
		    helper.register(DDNames.TALL_MS_BLUE_GLASS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_BLUE_GLASS)), DDItems.conditionalTabProperties("ms")));
		    helper.register(DDNames.TALL_MS_PURPLE_GLASS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_PURPLE_GLASS)), DDItems.conditionalTabProperties("ms")));
		    helper.register(DDNames.TALL_MS_MAGENTA_GLASS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_MAGENTA_GLASS)), DDItems.conditionalTabProperties("ms")));
		    helper.register(DDNames.TALL_MS_PINK_GLASS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_PINK_GLASS)), DDItems.conditionalTabProperties("ms")));
		    helper.register(DDNames.TALL_MS_LIGHT_BLUE_GLASS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_LIGHT_BLUE_GLASS)), DDItems.conditionalTabProperties("ms")));
		    helper.register(DDNames.TALL_MS_BROWN_GLASS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_BROWN_GLASS)), DDItems.conditionalTabProperties("ms")));
		});
	}
}
