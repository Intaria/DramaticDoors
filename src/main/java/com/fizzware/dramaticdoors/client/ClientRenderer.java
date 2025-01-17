package com.fizzware.dramaticdoors.client;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DramaticDoors;
import com.fizzware.dramaticdoors.blocks.DDBlocks;
import com.fizzware.dramaticdoors.compat.Compats;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.registries.ForgeRegistries;

@OnlyIn(Dist.CLIENT)
public class ClientRenderer
{
	@SuppressWarnings("removal")
	public static void setRenderers() {
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_IRON_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_OAK_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_SPRUCE_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_BIRCH_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_JUNGLE_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_ACACIA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_DARK_OAK_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_CRIMSON_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_WARPED_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_MANGROVE_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_BAMBOO_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_IRON_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_OAK_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_SPRUCE_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BIRCH_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_JUNGLE_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_ACACIA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_DARK_OAK_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CRIMSON_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_WARPED_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MANGROVE_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BAMBOO_DOOR.get(), RenderType.cutout());

		if (Compats.VANILLAESQUE_PACK_ENABLED.getValue()) {
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ASPEN)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_GRIMWOOD)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_KOUSA)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MORADO)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ROSEWOOD)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_YUCCA)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MAPLE)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_HONEYCOMB)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_AZALEA)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_POISE)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CHERRY)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_WILLOW)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_WISTERIA)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ASPEN)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_GRIMWOOD)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_KOUSA)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MORADO)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ROSEWOOD)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_YUCCA)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MAPLE)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_HONEYCOMB)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_AZALEA)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_POISE)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHERRY)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_WILLOW)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_WISTERIA)), RenderType.cutout());
			
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_JACARANDA)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_REDBUD)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CYPRESS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BROWN_MUSHROOM)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RED_MUSHROOM)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_JACARANDA)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_REDBUD)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CYPRESS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BROWN_MUSHROOM)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RED_MUSHROOM)), RenderType.cutout());
			
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ASH)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_GOURDROT)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ASH)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_GOURDROT)), RenderType.cutout());
			
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_GE_CYPRESS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_GE_MUDDY_OAK)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_GE_CYPRESS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_GE_MUDDY_OAK)), RenderType.cutout());

			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_FAIRY_RING_MUSHROOM)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_FAIRY_RING_MUSHROOM)), RenderType.cutout());
			
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_FIR)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_FIR)), RenderType.cutout());

			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_QUARK_ANCIENT)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_QUARK_AZALEA)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_QUARK_BLOSSOM)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_QUARK_ANCIENT)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_QUARK_AZALEA)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_QUARK_BLOSSOM)), RenderType.cutout());

			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_GOLD)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_SILVER)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_LEAD)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_NETHERITE)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_GOLD)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_SILVER)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_LEAD)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_NETHERITE)), RenderType.cutout());

			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CHESTNUT)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_HOLLY)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHESTNUT)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_HOLLY)), RenderType.cutout());
		}
		if (Compats.BIOME_PACK_ENABLED.getValue()) {
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BOP_CHERRY)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BOP_DEAD)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BOP_FIR)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BOP_HELLBARK)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BOP_JACARANDA)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BOP_MAGIC)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BOP_MAHOGANY)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BOP_PALM)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BOP_REDWOOD)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BOP_UMBRAN)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BOP_WILLOW)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BOP_CHERRY)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BOP_DEAD)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BOP_FIR)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BOP_HELLBARK)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BOP_JACARANDA)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BOP_MAGIC)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BOP_MAHOGANY)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BOP_PALM)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BOP_REDWOOD)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BOP_UMBRAN)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BOP_WILLOW)), RenderType.cutout());
		
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_ASPEN)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_BAOBAB)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_BLUE_ENCHANTED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_BULBIS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_CHERRY)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_CIKA)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_CYPRESS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_EBONY)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_EMBUR)), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_ETHER)), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_FIR)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_FLORUS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_GREEN_ENCHANTED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_HOLLY)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_IMPARIUS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_IRONWOOD)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_JACARANDA)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_LAMENT)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_MAHOGANY)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_MAPLE)), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_NIGHTSHADE)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_PALM)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_PINE)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_RAINBOW_EUCALYPTUS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_REDWOOD)), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_SKYRIS)), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_SOUL_SHROOM)), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_SYTHIAN)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_WHITE_MANGROVE)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_WILLOW)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_WITCH_HAZEL)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_ZELKOVA)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_ASPEN)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_BAOBAB)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_BLUE_ENCHANTED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_BULBIS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_CHERRY)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_CIKA)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_CYPRESS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_EBONY)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_EMBUR)), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_ETHER)), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_FIR)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_FLORUS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_GREEN_ENCHANTED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_HOLLY)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_IMPARIUS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_IRONWOOD)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_JACARANDA)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_LAMENT)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_MAHOGANY)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_MAPLE)), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_NIGHTSHADE)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_PALM)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_PINE)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_RAINBOW_EUCALYPTUS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_REDWOOD)), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_SKYRIS)), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_SOUL_SHROOM)), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_SYTHIAN)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_WHITE_MANGROVE)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_WILLOW)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_WITCH_HAZEL)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_ZELKOVA)), RenderType.cutout());
			
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_BAOBAB)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_BLACKWOOD)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_BRIMWOOD)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_CHERRY)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_CYPRESS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_DEAD)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_EUCALYPTUS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_JOSHUA)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_LARCH)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_MAPLE)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_MAUVE)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_PALM)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_PINE)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_REDWOOD)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_WILLOW)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_BAOBAB)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_BLACKWOOD)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_BRIMWOOD)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_CHERRY)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_CYPRESS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_DEAD)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_EUCALYPTUS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_JOSHUA)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_LARCH)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_MAPLE)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_MAUVE)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_PALM)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_PINE)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_REDWOOD)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_WILLOW)), RenderType.cutout());
			
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BM_ANCIENT_OAK)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BM_BLIGHTED_BALSA)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BM_SWAMP_CYPRESS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BM_WILLOW)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BM_ANCIENT_OAK)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BM_BLIGHTED_BALSA)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BM_SWAMP_CYPRESS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BM_WILLOW)), RenderType.cutout());
			
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ECO_COCONUT)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ECO_WALNUT)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ECO_COCONUT)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ECO_WALNUT)), RenderType.cutout());
			
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_EBONY)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_PREAM)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_EBONY)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_PREAM)), RenderType.cutout());
	
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CONGEALED)), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_EE_EBONY)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CONGEALED)), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_EE_EBONY)), RenderType.cutout());
			
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_EB_TWISTED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_EB_PENUMBRA)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_EB_TWISTED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_EB_PENUMBRA)), RenderType.cutout());
			
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_JABOTICABA)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RAMBOUTAN)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_JABOTICABA)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RAMBOUTAN)), RenderType.cutout());
			
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_SOULBLIGHT)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_WHISTLECANE)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_SOULBLIGHT)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_WHISTLECANE)), RenderType.cutout());

			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MB_CHERRY)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MB_JACARANDA)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MB_STRAWBERRY)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MB_CHERRY)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MB_JACARANDA)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MB_STRAWBERRY)), RenderType.cutout());
						
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_AZURE)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_AZURE)), RenderType.cutout());
	
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_PW_MAGIC)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_PW_MAPLE)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_PW_PURPLE_HEART)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_PW_SILVERBELL)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_PW_TIGER)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_PW_WILLOW)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_PW_MAGIC)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_PW_MAPLE)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_PW_PURPLE_HEART)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_PW_SILVERBELL)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_PW_TIGER)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_PW_WILLOW)), RenderType.cutout());
		}
		if (Compats.DIMENSIONAL_PACK_ENABLED.getValue()) {
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_AERONOS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_GLACIAN)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_STROPHAR)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_AA_STEEL)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_AERONOS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_GLACIAN)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_STROPHAR)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_AA_STEEL)), RenderType.cutout());

			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_AETHER_SKYROOT)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_AETHER_SKYROOT)), RenderType.cutout());

			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BS_BLUEBRIGHT)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BS_CHERRY)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BS_CRYSTALLIZED)), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BS_DUSK)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BS_FROSTBRIGHT)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BS_LUNAR)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BS_MAPLE)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BS_STARLIT)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BS_BLUEBRIGHT)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BS_CHERRY)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BS_CRYSTALLIZED)), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BS_DUSK)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BS_FROSTBRIGHT)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BS_LUNAR)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BS_MAPLE)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BS_STARLIT)), RenderType.cutout());
			
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CEILTRUNK)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_LUZAWOOD)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CEILTRUNK)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_LUZAWOOD)), RenderType.cutout());
		
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_AGATHOXYLON)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ARAUCARIA)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BRACHYPHYLLUM)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_GINKGO)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_HEIDIPHYLLUM)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_LIRIODENDRITES)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_METASEQUOIA)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_NEOCALAMITES)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_PROTOJUNIPEROXYLON)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_PROTOPICEOXYLON)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_SCHILDERIA)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TROCHODENDROIDES)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_WOODWORTHIA)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ZAMITES)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_AGATHOXYLON)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ARAUCARIA)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BRACHYPHYLLUM)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_GINKGO)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_HEIDIPHYLLUM)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_LIRIODENDRITES)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_METASEQUOIA)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_NEOCALAMITES)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_PROTOJUNIPEROXYLON)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_PROTOPICEOXYLON)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_SCHILDERIA)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TROCHODENDROIDES)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_WOODWORTHIA)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ZAMITES)), RenderType.cutout());
			
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CANOPY)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_DARKWOOD)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TWILIGHT_MANGROVE)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MINEWOOD)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_SORTINGWOOD)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TIMEWOOD)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TRANSWOOD)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TWILIGHT_OAK)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TOWERWOOD)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CANOPY)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_DARKWOOD)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TWILIGHT_MANGROVE)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MINEWOOD)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_SORTINGWOOD)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TIMEWOOD)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TRANSWOOD)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TWILIGHT_OAK)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TOWERWOOD)), RenderType.cutout());
			
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ECHO)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ECHO)), RenderType.cutout());
			
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_GRONGLE)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_SMOGSTEM)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_WIGGLEWOOD)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_GRONGLE)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_SMOGSTEM)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_WIGGLEWOOD)), RenderType.cutout());
		}
		if (Compats.MAGIC_PACK_ENABLED.getValue()) {
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ARCHWOOD)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ARCHWOOD)), RenderType.cutout());
			
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_DEORUM)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ARCANE_EDELWOOD)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CHERRYWOOD)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_EDELWOOD)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_FUNGYSS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_AURUM)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_DEORUM)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ARCANE_EDELWOOD)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHERRYWOOD)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_EDELWOOD)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_FUNGYSS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_AURUM)), RenderType.cutout());
			
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_EDIFIED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_EDIFIED)), RenderType.cutout());
			
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_HEXEREI_MAHOGANY)), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_HEXEREI_WILLOW)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_HEXEREI_WITCH_HAZEL)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_HEXEREI_MAHOGANY)), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_HEXEREI_WILLOW)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_HEXEREI_WITCH_HAZEL)), RenderType.cutout());
		
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_PYROWOOD)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ROTTEN_PLANKS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_PYROWOOD)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ROTTEN_PLANKS)), RenderType.cutout());
	
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUNEWOOD)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_SOULWOOD)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUNEWOOD)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_SOULWOOD)), RenderType.cutout());
		}
		if (Compats.TECH_PACK_ENABLED.getValue()) {
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_STEEL)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_LOCKED_STEEL)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_STEEL)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_LOCKED_STEEL)), RenderType.cutout());
	
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ANDESITE)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BRASS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_COPPER)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ZINC)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_LOCKED_ANDESITE)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_LOCKED_BRASS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_LOCKED_COPPER)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_LOCKED_ZINC)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ANDESITE)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BRASS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_COPPER)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ZINC)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_LOCKED_ANDESITE)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_LOCKED_BRASS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_LOCKED_COPPER)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_LOCKED_ZINC)), RenderType.cutout());
	
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ANDESITE_CASING)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BRASS_CASING)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_COPPER_CASING)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ANDESITE_CASING)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BRASS_CASING)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_COPPER_CASING)), RenderType.cutout());
		
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CARDBOARD)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CHAIN)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_INDUSTRIAL_IRON)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_IRON_BAR)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_PADDED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUSTY_IRON)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUSTY_SHEET_METAL)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_SHEET_METAL)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CARDBOARD)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHAIN)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_INDUSTRIAL_IRON)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_IRON_BAR)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_PADDED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUSTY_IRON)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUSTY_SHEET_METAL)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_SHEET_METAL)), RenderType.cutout());
			
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MENRIL)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MENRIL)), RenderType.cutout());
			
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BLOODSHROOM)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_GREENHEART)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_SKYROOT)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BLOODSHROOM)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_GREENHEART)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_SKYROOT)), RenderType.cutout());
		}
		if (Compats.MISC_PACK_ENABLED.getValue()) {
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TWISTED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TWISTED)), RenderType.cutout());
	
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BE_BAMBOO)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BE_DRY_BAMBOO)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BE_BAMBOO)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BE_DRY_BAMBOO)), RenderType.cutout());
	
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_FLESH)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_FULL_FLESH)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_FLESHKIN)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_FLESH)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_FULL_FLESH)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_FLESHKIN)), RenderType.cutout());
	
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BP_BAMBOO)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BP_MUSHROOM)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BP_COPPER)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BP_GOLDEN)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BP_DIAMOND)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BP_EMERALD)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BP_NETHERITE)), RenderType.cutout());
	
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_WALNUT)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_WALNUT)), RenderType.cutout());
	
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_APRICORN)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_APRICORN)), RenderType.cutout());
	
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_AZULE_AZALEA)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BRIGHT_AZALEA)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_FISS_AZALEA)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ROZE_AZALEA)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TECAL_AZALEA)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TITANIUM_AZALEA)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_WALNUT_AZALEA)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_AZULE_AZALEA)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BRIGHT_AZALEA)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_FISS_AZALEA)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ROZE_AZALEA)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TECAL_AZALEA)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TITANIUM_AZALEA)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_WALNUT_AZALEA)), RenderType.cutout());
	
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CO_COPPER)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CO_EXPOSED_COPPER)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CO_WEATHERED_COPPER)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CO_OXIDIZED_COPPER)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CO_COPPER)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CO_EXPOSED_COPPER)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CO_WEATHERED_COPPER)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CO_OXIDIZED_COPPER)), RenderType.cutout());
	
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_PETRIFIED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_PETRIFIED)), RenderType.cutout());
	
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_EC_COPPER)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_EC_EXPOSED_COPPER)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_EC_WEATHERED_COPPER)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_EC_OXIDIZED_COPPER)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_EC_WAXED_COPPER)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_EC_WAXED_EXPOSED_COPPER)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_EC_WAXED_WEATHERED_COPPER)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_EC_WAXED_OXIDIZED_COPPER)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_EC_COPPER)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_EC_EXPOSED_COPPER)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_EC_WEATHERED_COPPER)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_EC_OXIDIZED_COPPER)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_EC_WAXED_COPPER)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_EC_WAXED_EXPOSED_COPPER)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_EC_WAXED_WEATHERED_COPPER)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_EC_WAXED_OXIDIZED_COPPER)), RenderType.cutout());
			
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MUSHROOM)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_GLOWSHROOM)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_POISONOUS_MUSHROOM)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_HONEY_FUNGUS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MUSHROOM)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_GLOWSHROOM)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_POISONOUS_MUSHROOM)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_HONEY_FUNGUS)), RenderType.cutout());
	
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_FT_CHERRY)), RenderType.cutout());
			//ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_FT_CHERRY_SLIDING)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_FT_CITRUS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_FT_CHERRY)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_FT_CHERRY_SLIDING)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_FT_CITRUS)), RenderType.cutout());
	
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_DARK_IRON)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_DARK_IRON)), RenderType.cutout());
			
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_NETHERWOOD)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_NETHERWOOD)), RenderType.cutout());
	
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_GINGERBREAD)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_GINGERBREAD)), RenderType.cutout());

			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TQ_LIGHT_CLOUD)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TQ_DENSE_CLOUD)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TQ_STORM_CLOUD)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TQ_APPLE)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TQ_BANANA)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TQ_CHERRY)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TQ_COCONUT)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TQ_LEMON)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TQ_MANGO)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TQ_MULBERRY)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TQ_ORANGE)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TQ_PEACH)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TQ_PEAR)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TQ_PLUM)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TQ_LIGHT_CLOUD)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TQ_DENSE_CLOUD)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TQ_STORM_CLOUD)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TQ_APPLE)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TQ_BANANA)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TQ_CHERRY)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TQ_COCONUT)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TQ_LEMON)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TQ_MANGO)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TQ_MULBERRY)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TQ_ORANGE)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TQ_PEACH)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TQ_PEAR)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TQ_PLUM)), RenderType.cutout());

			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TWIGS_BAMBOO)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TWIGS_BAMBOO)), RenderType.cutout());

			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MYSTICAL_OAK)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MYSTICAL_OAK)), RenderType.cutout());
		}
		// Set up rendering for all the Chipped doors.
		if (Compats.CHIPPED_INSTALLED) {
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_HEAVY)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_DUAL_PANELED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_PRESSED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_SHACK)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_SLIDING)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_SCREEN)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_GATED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_GLASS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_WINDOWED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_TILED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_TILE_WINDOWED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_SECRET)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_BOARDED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_PAPER)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_BEACH)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_BARRED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_PANELED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_FORTIFIED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_SUPPORTED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_OVERGROWN)), RenderType.cutout());
	
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_HEAVY)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_DUAL_PANELED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_PRESSED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_SHACK)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_SLIDING)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_SCREEN)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_GATED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_GLASS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_WINDOWED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_TILED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_TILE_WINDOWED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_SECRET)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_MODERN)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_PAPER)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_BEACH)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_BARRED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_PANELED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_FORTIFIED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_SUPPORTED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_OVERGROWN)), RenderType.cutout());
	
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_HEAVY)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_DUAL_PANELED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_PRESSED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_SHACK)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_SLIDING)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_SCREEN)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_GATED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_GLASS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_WINDOWED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_TILED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_TILE_WINDOWED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_SECRET)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_MODERN)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_BOARDED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_BEACH)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_BARRED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_PANELED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_FORTIFIED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_SUPPORTED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_OVERGROWN)), RenderType.cutout());
	
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_HEAVY)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_DUAL_PANELED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_PRESSED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_SHACK)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_SLIDING)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_SCREEN)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_GATED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_GLASS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_WINDOWED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_TILED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_TILE_WINDOWED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_SECRET)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_MODERN)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_BOARDED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_PAPER)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_BARRED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_PANELED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_FORTIFIED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_SUPPORTED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_OVERGROWN)), RenderType.cutout());
	
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_HEAVY)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_DUAL_PANELED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_PRESSED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_SHACK)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_SLIDING)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_SCREEN)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_GATED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_GLASS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_WINDOWED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_TILED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_TILE_WINDOWED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_SECRET)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_MODERN)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_BOARDED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_PAPER)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_BEACH)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_PANELED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_FORTIFIED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_SUPPORTED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_OVERGROWN)), RenderType.cutout());
	
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_HEAVY)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_DUAL_PANELED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_PRESSED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_SHACK)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_SLIDING)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_SCREEN)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_GATED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_GLASS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_WINDOWED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_TILED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_TILE_WINDOWED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_SECRET)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_MODERN)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_BOARDED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_PAPER)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_BEACH)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_BARRED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_FORTIFIED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_SUPPORTED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_OVERGROWN)), RenderType.cutout());
	
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_HEAVY)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_DUAL_PANELED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_PRESSED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_SHACK)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_SLIDING)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_SCREEN)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_GATED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_GLASS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_WINDOWED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_TILED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_TILE_WINDOWED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_SECRET)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_MODERN)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_BOARDED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_PAPER)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_BEACH)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_BARRED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_PANELED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_FORTIFIED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_SUPPORTED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_OVERGROWN)), RenderType.cutout());
	
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_HEAVY)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_DUAL_PANELED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_PRESSED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_SHACK)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_SLIDING)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_SCREEN)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_GATED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_GLASS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_WINDOWED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_TILED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_TILE_WINDOWED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_SECRET)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_MODERN)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_BOARDED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_PAPER)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_BEACH)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_BARRED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_PANELED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_FORTIFIED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_OVERGROWN)), RenderType.cutout());
	
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_HEAVY)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_DUAL_PANELED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_PRESSED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_SHACK)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_SLIDING)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_SCREEN)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_GATED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_GLASS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_WINDOWED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_TILED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_TILE_WINDOWED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_SECRET)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_MODERN)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_BOARDED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_PAPER)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_BEACH)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_BARRED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_PANELED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_FORTIFIED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_SUPPORTED)), RenderType.cutout());
		}
	}
}
