package com.fizzware.dramaticdoors.client;

import com.fizzware.dramaticdoors.blocks.DDBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class ClientRenderer
{
	public static void setRenderers() {
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

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BOP_CHERRY_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BOP_DEAD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BOP_FIR_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BOP_HELLBARK_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BOP_JACARANDA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BOP_MAGIC_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BOP_MAHOGANY_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BOP_PALM_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BOP_REDWOOD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BOP_UMBRAN_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BOP_WILLOW_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BYG_ASPEN_DOOR.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BYG_BAOBAB_DOOR.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BYG_BLUE_ENCHANTED_DOOR.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BYG_BULBIS_DOOR.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BYG_CHERRY_DOOR.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BYG_CIKA_DOOR.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BYG_CYPRESS_DOOR.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BYG_EBONY_DOOR.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BYG_EMBUR_DOOR.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BYG_ETHER_DOOR.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BYG_FIR_DOOR.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BYG_GREEN_ENCHANTED_DOOR.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BYG_HOLLY_DOOR.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BYG_IMPARIUS_DOOR.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BYG_IRONWOOD_DOOR.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BYG_JACARANDA_DOOR.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BYG_LAMENT_DOOR.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BYG_MAHOGANY_DOOR.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BYG_MAPLE_DOOR.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BYG_NIGHTSHADE_DOOR.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BYG_PALM_DOOR.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BYG_PINE_DOOR.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BYG_RAINBOW_EUCALYPTUS_DOOR.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BYG_REDWOOD_DOOR.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BYG_SKYRIS_DOOR.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BYG_SOUL_SHROOM_DOOR.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BYG_SYTHIAN_DOOR.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BYG_WHITE_MANGROVE_DOOR.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BYG_WILLOW_DOOR.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BYG_WITCH_HAZEL_DOOR.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BYG_ZELKOVA_DOOR.get(), RenderType.translucent());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_ARAUCARIA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_HEIDIPHYLLUM_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_LIRIODENDRITES_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_METASEQUOIA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_PROTOJUNIPEROXYLON_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_PROTOPICEOXYLON_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_ZAMITES_DOOR.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CANOPY_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_DARKWOOD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_TWILIGHT_MANGROVE_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MINEWOOD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_SORTINGWOOD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_TIMEWOOD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_TRANSWOOD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_TWILIGHT_OAK_DOOR.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_ASPEN_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_GRIMWOOD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_KOUSA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MORADO_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_ROSEWOOD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_YUCCA_DOOR.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MAPLE_DOOR.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BAMBOO_DOOR.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_HONEYCOMB_DOOR.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_AZALEA_DOOR.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_POISE_DOOR.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHERRY_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_WILLOW_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_WISTERIA_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_DRIFTWOOD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_RIVER_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_GLASS_DOOR.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_TOOTH_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_JACARANDA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_REDBUD_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CYPRESS_DOOR.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BROWN_MUSHROOM_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_RED_MUSHROOM_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_GLOWSHROOM_DOOR.get(), RenderType.translucent());
		
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_TWISTED_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BP_BAMBOO_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BP_MUSHROOM_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BP_COPPER_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BP_GOLDEN_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BP_DIAMOND_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BP_EMERALD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BP_NETHERITE_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_STEEL_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_LOCKED_STEEL_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_ANDESITE_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BRASS_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_COPPER_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_ZINC_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_LOCKED_ANDESITE_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_LOCKED_BRASS_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_LOCKED_COPPER_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_LOCKED_ZINC_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_PETRIFIED_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CARDBOARD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHAIN_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_INDUSTRIAL_IRON_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_IRON_BAR_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_PADDED_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_RUSTY_IRON_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_RUSTY_SHEET_METAL_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_SHEET_METAL_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_ECO_AZALEA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_ECO_FLOWERING_AZALEA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_ECO_COCONUT_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_ECO_WALNUT_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_FAIRY_RING_MUSHROOM_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_AZURE_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_PW_MAGIC_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_PW_MAPLE_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_PW_PURPLE_HEART_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_PW_SILVERBELL_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_PW_TIGER_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_PW_WILLOW_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_QUARK_AZALEA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_QUARK_BLOSSOM_DOOR.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_GOLD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_SILVER_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_LEAD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_NETHERITE_DOOR.get(), RenderType.cutout());

	}
}
