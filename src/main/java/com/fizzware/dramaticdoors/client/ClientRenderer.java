package com.fizzware.dramaticdoors.client;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DramaticDoors;
import com.fizzware.dramaticdoors.compat.Compats;
import com.fizzware.dramaticdoors.init.DDBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.ModList;
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

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_BOP_CHERRY_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_BOP_DEAD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_BOP_FIR_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_BOP_HELLBARK_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_BOP_JACARANDA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_BOP_MAGIC_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_BOP_MAHOGANY_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_BOP_PALM_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_BOP_REDWOOD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_BOP_UMBRAN_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_BOP_WILLOW_DOOR.get(), RenderType.cutout());
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

		if (ModList.get().isLoaded("byg")) {
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
		}

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_BS_BLUEBRIGHT_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_BS_CHERRY_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_BS_CRYSTALLIZED_DOOR.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_BS_DUSK_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_BS_FROSTBRIGHT_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_BS_LUNAR_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_BS_MAPLE_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_BS_STARLIT_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BS_BLUEBRIGHT_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BS_CHERRY_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BS_CRYSTALLIZED_DOOR.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BS_DUSK_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BS_FROSTBRIGHT_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BS_LUNAR_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BS_MAPLE_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BS_STARLIT_DOOR.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_AGATHOXYLON_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_ARAUCARIA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_BRACHYPHYLLUM_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_GINKGO_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_HEIDIPHYLLUM_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_LIRIODENDRITES_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_METASEQUOIA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_NEOCALAMITES_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_PROTOJUNIPEROXYLON_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_PROTOPICEOXYLON_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_SCHILDERIA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_TROCHODENDROIDES_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_WOODWORTHIA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_ZAMITES_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_AGATHOXYLON_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_ARAUCARIA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BRACHYPHYLLUM_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_GINKGO_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_HEIDIPHYLLUM_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_LIRIODENDRITES_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_METASEQUOIA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_NEOCALAMITES_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_PROTOJUNIPEROXYLON_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_PROTOPICEOXYLON_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_SCHILDERIA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_TROCHODENDROIDES_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_WOODWORTHIA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_ZAMITES_DOOR.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_RUE_BAOBAB_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_RUE_BLACKWOOD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_RUE_CHERRY_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_RUE_CYPRESS_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_RUE_DEAD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_RUE_EUCALYPTUS_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_RUE_JOSHUA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_RUE_LARCH_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_RUE_MAPLE_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_RUE_MAUVE_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_RUE_PALM_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_RUE_PINE_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_RUE_REDWOOD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_RUE_WILLOW_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_RUE_BAOBAB_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_RUE_BLACKWOOD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_RUE_CHERRY_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_RUE_CYPRESS_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_RUE_DEAD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_RUE_EUCALYPTUS_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_RUE_JOSHUA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_RUE_LARCH_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_RUE_MAPLE_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_RUE_MAUVE_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_RUE_PALM_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_RUE_PINE_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_RUE_REDWOOD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_RUE_WILLOW_DOOR.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_CANOPY_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_DARKWOOD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_TWILIGHT_MANGROVE_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_MINEWOOD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_SORTINGWOOD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_TIMEWOOD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_TRANSWOOD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_TWILIGHT_OAK_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_TOWERWOOD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CANOPY_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_DARKWOOD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_TWILIGHT_MANGROVE_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MINEWOOD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_SORTINGWOOD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_TIMEWOOD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_TRANSWOOD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_TWILIGHT_OAK_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_TOWERWOOD_DOOR.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_ASPEN_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_GRIMWOOD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_KOUSA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_MORADO_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_ROSEWOOD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_YUCCA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_MAPLE_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_HONEYCOMB_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_AZALEA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_POISE_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_CHERRY_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_WILLOW_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_WISTERIA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_DRIFTWOOD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_RIVER_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_GLASS_DOOR.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_TOOTH_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_ASPEN_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_GRIMWOOD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_KOUSA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MORADO_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_ROSEWOOD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_YUCCA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MAPLE_DOOR.get(), RenderType.cutout());
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

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_JACARANDA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_REDBUD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_CYPRESS_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_BROWN_MUSHROOM_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_RED_MUSHROOM_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_JACARANDA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_REDBUD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CYPRESS_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BROWN_MUSHROOM_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_RED_MUSHROOM_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_AERONOS_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_GLACIAN_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_STROPHAR_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_AA_STEEL_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_AERONOS_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_GLACIAN_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_STROPHAR_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_AA_STEEL_DOOR.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_ASH_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_GOURDROT_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_ASH_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_GOURDROT_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_TWISTED_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_TWISTED_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_ARCHWOOD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_ARCHWOOD_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_BE_BAMBOO_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_BE_DRY_BAMBOO_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BE_BAMBOO_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BE_DRY_BAMBOO_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_FLESH_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_FULL_FLESH_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_FLESHKIN_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_FLESH_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_FULL_FLESH_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_FLESHKIN_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_BM_ANCIENT_OAK_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_BM_BLIGHTED_BALSA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_BM_SWAMP_CYPRESS_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_BM_WILLOW_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BM_ANCIENT_OAK_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BM_BLIGHTED_BALSA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BM_SWAMP_CYPRESS_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BM_WILLOW_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BP_BAMBOO_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BP_MUSHROOM_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BP_COPPER_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BP_GOLDEN_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BP_DIAMOND_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BP_EMERALD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BP_NETHERITE_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_WALNUT_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_WALNUT_DOOR.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_CEILTRUNK_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_LUZAWOOD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CEILTRUNK_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_LUZAWOOD_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_APRICORN_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_APRICORN_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_AZULE_AZALEA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_BRIGHT_AZALEA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_FISS_AZALEA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_ROZE_AZALEA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_TECAL_AZALEA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_TITANIUM_AZALEA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_WALNUT_AZALEA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_AZULE_AZALEA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BRIGHT_AZALEA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_FISS_AZALEA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_ROZE_AZALEA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_TECAL_AZALEA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_TITANIUM_AZALEA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_WALNUT_AZALEA_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_STEEL_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_LOCKED_STEEL_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_STEEL_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_LOCKED_STEEL_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_ANDESITE_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_BRASS_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_COPPER_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_ZINC_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_LOCKED_ANDESITE_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_LOCKED_BRASS_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_LOCKED_COPPER_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_LOCKED_ZINC_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_ANDESITE_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BRASS_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_COPPER_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_ZINC_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_LOCKED_ANDESITE_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_LOCKED_BRASS_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_LOCKED_COPPER_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_LOCKED_ZINC_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_ANDESITE_CASING_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_BRASS_CASING_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_COPPER_CASING_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_ANDESITE_CASING_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BRASS_CASING_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_COPPER_CASING_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_CO_COPPER_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_CO_EXPOSED_COPPER_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_CO_WEATHERED_COPPER_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_CO_OXIDIZED_COPPER_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CO_COPPER_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CO_EXPOSED_COPPER_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CO_WEATHERED_COPPER_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CO_OXIDIZED_COPPER_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_PETRIFIED_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_PETRIFIED_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_ECHO_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_ECHO_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_CARDBOARD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_CHAIN_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_INDUSTRIAL_IRON_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_IRON_BAR_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_PADDED_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_RUSTY_IRON_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_RUSTY_SHEET_METAL_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_SHEET_METAL_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CARDBOARD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHAIN_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_INDUSTRIAL_IRON_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_IRON_BAR_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_PADDED_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_RUSTY_IRON_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_RUSTY_SHEET_METAL_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_SHEET_METAL_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_ECO_AZALEA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_ECO_FLOWERING_AZALEA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_ECO_COCONUT_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_ECO_WALNUT_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_ECO_AZALEA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_ECO_FLOWERING_AZALEA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_ECO_COCONUT_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_ECO_WALNUT_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_EC_COPPER_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_EC_EXPOSED_COPPER_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_EC_WEATHERED_COPPER_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_EC_OXIDIZED_COPPER_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_EC_WAXED_COPPER_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_EC_WAXED_EXPOSED_COPPER_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_EC_WAXED_WEATHERED_COPPER_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_EC_WAXED_OXIDIZED_COPPER_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_EC_COPPER_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_EC_EXPOSED_COPPER_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_EC_WEATHERED_COPPER_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_EC_OXIDIZED_COPPER_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_EC_WAXED_COPPER_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_EC_WAXED_EXPOSED_COPPER_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_EC_WAXED_WEATHERED_COPPER_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_EC_WAXED_OXIDIZED_COPPER_DOOR.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_MUSHROOM_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_GLOWSHROOM_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_POISONOUS_MUSHROOM_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_HONEY_FUNGUS_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MUSHROOM_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_GLOWSHROOM_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_POISONOUS_MUSHROOM_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_HONEY_FUNGUS_DOOR.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_DEORUM_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_ARCANE_EDELWOOD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_CHERRYWOOD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_EDELWOOD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_FUNGYSS_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_AURUM_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_DEORUM_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_ARCANE_EDELWOOD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHERRYWOOD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_EDELWOOD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_FUNGYSS_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_AURUM_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_EBONY_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_PREAM_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_EBONY_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_PREAM_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_CONGEALED_DOOR.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_EE_EBONY_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CONGEALED_DOOR.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_EE_EBONY_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_FT_CHERRY_DOOR.get(), RenderType.cutout());
		//ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_FT_CHERRY_SLIDING_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_FT_CITRUS_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_FT_CHERRY_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_FT_CHERRY_SLIDING_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_FT_CITRUS_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_SOULBLIGHT_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_WHISTLECANE_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_SOULBLIGHT_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_WHISTLECANE_DOOR.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_GE_CYPRESS_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_GE_MUDDY_OAK_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_GE_CYPRESS_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_GE_MUDDY_OAK_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_DARK_IRON_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_DARK_IRON_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_FAIRY_RING_MUSHROOM_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_FAIRY_RING_MUSHROOM_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_EDIFIED_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_EDIFIED_DOOR.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_HEXEREI_MAHOGANY_DOOR.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_HEXEREI_WILLOW_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_HEXEREI_WITCH_HAZEL_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_HEXEREI_MAHOGANY_DOOR.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_HEXEREI_WILLOW_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_HEXEREI_WITCH_HAZEL_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_MENRIL_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MENRIL_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_RUNEWOOD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_SOULWOOD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_RUNEWOOD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_SOULWOOD_DOOR.get(), RenderType.cutout());

		if (ModList.get().isLoaded("ms")) {
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_IRON_BAR)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_BAMBOO)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_CHERRY)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_GLOWOOD)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_HELLWOOD)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_MAPLE)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_SILVERBELL)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_TIGERWOOD)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_WILLOW)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_GLASS)), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_SOUL_GLASS)), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_TINTED_GLASS)), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_BLACK_GLASS)), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_GREY_GLASS)), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_LIGHT_GREY_GLASS)), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_WHITE_GLASS)), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_RED_GLASS)), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_ORANGE_GLASS)), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_YELLOW_GLASS)), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_LIME_GLASS)), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_GREEN_GLASS)), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_CYAN_GLASS)), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_BLUE_GLASS)), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_PURPLE_GLASS)), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_MAGENTA_GLASS)), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_PINK_GLASS)), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_LIGHT_BLUE_GLASS)), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_BROWN_GLASS)), RenderType.translucent());
		}

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_JABOTICABA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_RAMBOUTAN_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_JABOTICABA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_RAMBOUTAN_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_FIR_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_FIR_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_AZURE_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_AZURE_DOOR.get(), RenderType.cutout());

		/*ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_POKECUBE_AGED_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_POKECUBE_CONCRETE_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_POKECUBE_CORRUPTED_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_POKECUBE_DISTORTIC_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_POKECUBE_ENIGMA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_POKECUBE_INVERTED_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_POKECUBE_LEPPA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_POKECUBE_MIRAGE_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_POKECUBE_NANAB_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_POKECUBE_ORAN_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_POKECUBE_PECHA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_POKECUBE_SITRUS_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_POKECUBE_TEMPORAL_DOOR.get(), RenderType.cutout());*/
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_POKECUBE_AGED_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_POKECUBE_CONCRETE_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_POKECUBE_CORRUPTED_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_POKECUBE_DISTORTIC_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_POKECUBE_ENIGMA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_POKECUBE_INVERTED_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_POKECUBE_LEPPA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_POKECUBE_MIRAGE_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_POKECUBE_NANAB_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_POKECUBE_ORAN_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_POKECUBE_PECHA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_POKECUBE_SITRUS_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_POKECUBE_TEMPORAL_DOOR.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_PW_MAGIC_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_PW_MAPLE_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_PW_PURPLE_HEART_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_PW_SILVERBELL_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_PW_TIGER_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_PW_WILLOW_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_PW_MAGIC_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_PW_MAPLE_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_PW_PURPLE_HEART_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_PW_SILVERBELL_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_PW_TIGER_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_PW_WILLOW_DOOR.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_PYROWOOD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_ROTTEN_PLANKS_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_PYROWOOD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_ROTTEN_PLANKS_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_QUARK_ANCIENT_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_QUARK_AZALEA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_QUARK_BLOSSOM_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_QUARK_ANCIENT_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_QUARK_AZALEA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_QUARK_BLOSSOM_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_NETHERWOOD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_NETHERWOOD_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_GINGERBREAD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_GINGERBREAD_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_GOLD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_SILVER_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_LEAD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_NETHERITE_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_GOLD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_SILVER_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_LEAD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_NETHERITE_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_BLOODSHROOM_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_GREENHEART_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_SKYROOT_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BLOODSHROOM_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_GREENHEART_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_SKYROOT_DOOR.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_TWIGS_BAMBOO_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_TWIGS_BAMBOO_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_GRONGLE_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_SMOGSTEM_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_WIGGLEWOOD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_GRONGLE_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_SMOGSTEM_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_WIGGLEWOOD_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_CHESTNUT_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_HOLLY_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHESTNUT_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_HOLLY_DOOR.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_MORECRAFT_NETHERWOOD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_MORECRAFT_NETHERBRICK_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_MORECRAFT_NETHERITE_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_MORECRAFT_GLASS_DOOR.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_MORECRAFT_SOUL_GLASS_DOOR.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.SHORT_MORECRAFT_BONE_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MORECRAFT_NETHERWOOD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MORECRAFT_NETHERBRICK_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MORECRAFT_NETHERITE_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MORECRAFT_GLASS_DOOR.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MORECRAFT_SOUL_GLASS_DOOR.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MORECRAFT_BONE_DOOR.get(), RenderType.cutout());
		
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
		// Set up rendering for all the Macaw doors.
		if (Compats.MACAWS_DOORS_INSTALLED) {
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_STORE)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SLIDING_GLASS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JAIL)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_METAL)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_METAL_HOSPITAL)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_METAL_REINFORCED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_METAL_WARNING)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_METAL_WINDOWED)), RenderType.cutout());
	
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_BARN)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_BARN)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_BARN)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_BARN)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_BARN)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_BARN)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_BARN)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_BARN)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_BARN)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_BARN)), RenderType.cutout());
	
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_BARN_GLASS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_BARN_GLASS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_BARN_GLASS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_BARN_GLASS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_BARN_GLASS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_BARN_GLASS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_BARN_GLASS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_BARN_GLASS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_BARN_GLASS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_BARN_GLASS)), RenderType.cutout());
	
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_STABLE)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_STABLE)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_STABLE)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_STABLE)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_STABLE)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_STABLE)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_STABLE)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_STABLE)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_STABLE)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_STABLE)), RenderType.cutout());
	
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_STABLE_HEAD)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_STABLE_HEAD)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_STABLE_HEAD)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_STABLE_HEAD)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_STABLE_HEAD)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_STABLE_HEAD)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_STABLE_HEAD)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_STABLE_HEAD)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_STABLE_HEAD)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_STABLE_HEAD)), RenderType.cutout());
	
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_GLASS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_GLASS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_GLASS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_GLASS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_GLASS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_GLASS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_GLASS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_GLASS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_GLASS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_GLASS)), RenderType.cutout());
	
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_BARK_GLASS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_BARK_GLASS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_BARK_GLASS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_STEM_GLASS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_BARK_GLASS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_BARK_GLASS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_BARK_GLASS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_BARK_GLASS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_BARK_GLASS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_STEM_GLASS)), RenderType.cutout());
	
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_MODERN)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_MODERN)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_MODERN)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_MODERN)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_MODERN)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_MODERN)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_MODERN)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_MODERN)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_MODERN)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_MODERN)), RenderType.cutout());
	
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_CLASSIC)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_CLASSIC)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_CLASSIC)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_CLASSIC)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_CLASSIC)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_CLASSIC)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_CLASSIC)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_CLASSIC)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_CLASSIC)), RenderType.cutout());
	
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_COTTAGE)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_COTTAGE)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_COTTAGE)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_COTTAGE)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_COTTAGE)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_COTTAGE)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_COTTAGE)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_COTTAGE)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_COTTAGE)), RenderType.cutout());
	
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_PAPER)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_PAPER)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_PAPER)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_PAPER)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_PAPER)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_PAPER)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_PAPER)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_PAPER)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_PAPER)), RenderType.cutout());
	
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_BEACH)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_BEACH)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_BEACH)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_BEACH)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_BEACH)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_BEACH)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_BEACH)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_BEACH)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_BEACH)), RenderType.cutout());
	
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_TROPICAL)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_TROPICAL)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_TROPICAL)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_TROPICAL)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_TROPICAL)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_TROPICAL)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_TROPICAL)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_TROPICAL)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_TROPICAL)), RenderType.cutout());
	
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_FOUR_PANEL)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_FOUR_PANEL)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_FOUR_PANEL)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_FOUR_PANEL)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_FOUR_PANEL)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_FOUR_PANEL)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_FOUR_PANEL)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_FOUR_PANEL)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_FOUR_PANEL)), RenderType.cutout());
	
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_SWAMP)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_SWAMP)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_SWAMP)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_SWAMP)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_SWAMP)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_SWAMP)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_SWAMP)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_SWAMP)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_SWAMP)), RenderType.cutout());
			
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_BAMBOO)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_BAMBOO)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_BAMBOO)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_BAMBOO)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_BAMBOO)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_BAMBOO)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_BAMBOO)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_BAMBOO)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_BAMBOO)), RenderType.cutout());
			
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_NETHER)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_NETHER)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_NETHER)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_NETHER)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_NETHER)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_NETHER)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_NETHER)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_NETHER)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_NETHER)), RenderType.cutout());
	
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_MYSTIC)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_MYSTIC)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_MYSTIC)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_MYSTIC)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_MYSTIC)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_MYSTIC)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_MYSTIC)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_MYSTIC)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_MYSTIC)), RenderType.cutout());
		}
		// Set up rendering for all the ManyIdeas doors.
		if (Compats.MANYIDEAS_DOORS_INSTALLED) {
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_COPPER_BAR)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_COPPER_BARREL)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_COPPER_BRICK)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_COPPER_CORRUGATED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_COPPER_FACTORY)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_COPPER_GLASS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_COPPER_MODERN)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_COPPER_SHIP)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_COPPER_SMOOTH_SANDSTONE)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_COPPER_STEAMPUNK)), RenderType.translucent());
	
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_IRON_BOOKSHELF)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_IRON_DWARF)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_IRON_FANTASY)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_IRON_GLASS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_IRON_LABORATORY)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_IRON_RUSTED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_IRON_SAFE)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_IRON_SHIP)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_IRON_SPACE)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_IRON_STONE_BRICK)), RenderType.cutout());
	
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_OAK_BLANK)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_OAK_BOOKSHELF)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_OAK_CASSETTE)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_OAK_FRENCH)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_OAK_FROSTED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_OAK_GLASS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_OAK_HEART)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_OAK_ORIGIN)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_OAK_RUSTIC)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_OAK_SHOJI)), RenderType.cutout());
	
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_SPRUCE_BLANK)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_SPRUCE_BOOKSHELF)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_SPRUCE_CASSETTE)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_SPRUCE_FRENCH)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_SPRUCE_FROSTED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_SPRUCE_GLASS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_SPRUCE_HEART)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_SPRUCE_ORIGIN)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_SPRUCE_RUSTIC)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_SPRUCE_SHOJI)), RenderType.cutout());
	
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_BIRCH_BLANK)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_BIRCH_BOOKSHELF)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_BIRCH_CASSETTE)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_BIRCH_FRENCH)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_BIRCH_FROSTED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_BIRCH_GLASS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_BIRCH_HEART)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_BIRCH_ORIGIN)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_BIRCH_RUSTIC)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_BIRCH_SHOJI)), RenderType.cutout());
	
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_JUNGLE_BLANK)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_JUNGLE_BOOKSHELF)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_JUNGLE_CASSETTE)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_JUNGLE_FRENCH)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_JUNGLE_FROSTED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_JUNGLE_GLASS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_JUNGLE_HEART)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_JUNGLE_ORIGIN)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_JUNGLE_RUSTIC)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_JUNGLE_SHOJI)), RenderType.cutout());
	
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_ACACIA_BLANK)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_ACACIA_BOOKSHELF)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_ACACIA_CASSETTE)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_ACACIA_FRENCH)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_ACACIA_FROSTED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_ACACIA_GLASS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_ACACIA_HEART)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_ACACIA_ORIGIN)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_ACACIA_RUSTIC)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_ACACIA_SHOJI)), RenderType.cutout());
	
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_DARK_OAK_BLANK)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_DARK_OAK_BOOKSHELF)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_DARK_OAK_CASSETTE)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_DARK_OAK_FRENCH)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_DARK_OAK_FROSTED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_DARK_OAK_GLASS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_DARK_OAK_HEART)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_DARK_OAK_ORIGIN)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_DARK_OAK_RUSTIC)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_DARK_OAK_SHOJI)), RenderType.cutout());
	
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_MANGROVE_BLANK)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_MANGROVE_BOOKSHELF)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_MANGROVE_CASSETTE)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_MANGROVE_FRENCH)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_MANGROVE_FROSTED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_MANGROVE_GLASS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_MANGROVE_HEART)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_MANGROVE_ORIGIN)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_MANGROVE_RUSTIC)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_MANGROVE_SHOJI)), RenderType.cutout());
	
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_CRIMSON_BLANK)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_CRIMSON_BOOKSHELF)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_CRIMSON_CASSETTE)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_CRIMSON_FRENCH)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_CRIMSON_FROSTED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_CRIMSON_GLASS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_CRIMSON_HEART)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_CRIMSON_ORIGIN)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_CRIMSON_RUSTIC)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_CRIMSON_SHOJI)), RenderType.cutout());
			
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_WARPED_BLANK)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_WARPED_BOOKSHELF)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_WARPED_CASSETTE)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_WARPED_FRENCH)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_WARPED_FROSTED)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_WARPED_GLASS)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_WARPED_HEART)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_WARPED_ORIGIN)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_WARPED_RUSTIC)), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_WARPED_SHOJI)), RenderType.cutout());
		}
	}
}
