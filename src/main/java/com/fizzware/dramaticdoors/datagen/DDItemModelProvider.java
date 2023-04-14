package com.fizzware.dramaticdoors.datagen;

import com.fizzware.dramaticdoors.DramaticDoors;
import com.fizzware.dramaticdoors.init.DDItems;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class DDItemModelProvider extends ItemModelProvider
{
    public DDItemModelProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, DramaticDoors.MOD_ID, exFileHelper);
    }

	@Override
	protected void registerModels() {
		// Insert any tall doors that need to be data-generated. Example below:
		super.basicItem(DDItems.SHORT_IRON_DOOR.get());
		super.basicItem(DDItems.SHORT_OAK_DOOR.get());
		super.basicItem(DDItems.SHORT_SPRUCE_DOOR.get());
		super.basicItem(DDItems.SHORT_BIRCH_DOOR.get());
		super.basicItem(DDItems.SHORT_JUNGLE_DOOR.get());
		super.basicItem(DDItems.SHORT_ACACIA_DOOR.get());
		super.basicItem(DDItems.SHORT_DARK_OAK_DOOR.get());
		super.basicItem(DDItems.SHORT_MANGROVE_DOOR.get());
		super.basicItem(DDItems.SHORT_BAMBOO_DOOR.get());
		super.basicItem(DDItems.SHORT_CRIMSON_DOOR.get());
		super.basicItem(DDItems.SHORT_WARPED_DOOR.get());

		super.basicItem(DDItems.SHORT_GOLD_DOOR.get());
		super.basicItem(DDItems.SHORT_SILVER_DOOR.get());
		super.basicItem(DDItems.SHORT_LEAD_DOOR.get());
		super.basicItem(DDItems.SHORT_NETHERITE_DOOR.get());

		super.basicItem(DDItems.SHORT_CANOPY_DOOR.get());
		super.basicItem(DDItems.SHORT_DARKWOOD_DOOR.get());
		super.basicItem(DDItems.SHORT_TWILIGHT_MANGROVE_DOOR.get());
		super.basicItem(DDItems.SHORT_MINEWOOD_DOOR.get());
		super.basicItem(DDItems.SHORT_SORTINGWOOD_DOOR.get());
		super.basicItem(DDItems.SHORT_TIMEWOOD_DOOR.get());
		super.basicItem(DDItems.SHORT_TRANSWOOD_DOOR.get());
		super.basicItem(DDItems.SHORT_TWILIGHT_OAK_DOOR.get());
		super.basicItem(DDItems.SHORT_TOWERWOOD_DOOR.get());
		
		super.basicItem(DDItems.SHORT_BOP_CHERRY_DOOR.get());
		super.basicItem(DDItems.SHORT_BOP_DEAD_DOOR.get());
		super.basicItem(DDItems.SHORT_BOP_FIR_DOOR.get());
		super.basicItem(DDItems.SHORT_BOP_HELLBARK_DOOR.get());
		super.basicItem(DDItems.SHORT_BOP_JACARANDA_DOOR.get());
		super.basicItem(DDItems.SHORT_BOP_MAGIC_DOOR.get());
		super.basicItem(DDItems.SHORT_BOP_MAHOGANY_DOOR.get());
		super.basicItem(DDItems.SHORT_BOP_PALM_DOOR.get());
		super.basicItem(DDItems.SHORT_BOP_REDWOOD_DOOR.get());
		super.basicItem(DDItems.SHORT_BOP_UMBRAN_DOOR.get());
		super.basicItem(DDItems.SHORT_BOP_WILLOW_DOOR.get());

		super.basicItem(DDItems.SHORT_ASPEN_DOOR.get());
		super.basicItem(DDItems.SHORT_GRIMWOOD_DOOR.get());
		super.basicItem(DDItems.SHORT_KOUSA_DOOR.get());
		super.basicItem(DDItems.SHORT_MORADO_DOOR.get());
		super.basicItem(DDItems.SHORT_ROSEWOOD_DOOR.get());
		super.basicItem(DDItems.SHORT_YUCCA_DOOR.get());
		super.basicItem(DDItems.SHORT_HONEYCOMB_DOOR.get());
		super.basicItem(DDItems.SHORT_AZALEA_DOOR.get());
		super.basicItem(DDItems.SHORT_MAPLE_DOOR.get());
		super.basicItem(DDItems.SHORT_POISE_DOOR.get());
		super.basicItem(DDItems.SHORT_CHERRY_DOOR.get());
		super.basicItem(DDItems.SHORT_WILLOW_DOOR.get());
		super.basicItem(DDItems.SHORT_WISTERIA_DOOR.get());
		super.basicItem(DDItems.SHORT_DRIFTWOOD_DOOR.get());
		super.basicItem(DDItems.SHORT_RIVER_DOOR.get());
		super.basicItem(DDItems.SHORT_GLASS_DOOR.get());
		super.basicItem(DDItems.SHORT_TOOTH_DOOR.get());

		super.basicItem(DDItems.SHORT_JACARANDA_DOOR.get());
		super.basicItem(DDItems.SHORT_REDBUD_DOOR.get());
		super.basicItem(DDItems.SHORT_CYPRESS_DOOR.get());
		super.basicItem(DDItems.SHORT_BROWN_MUSHROOM_DOOR.get());
		super.basicItem(DDItems.SHORT_RED_MUSHROOM_DOOR.get());

		super.basicItem(DDItems.SHORT_ASH_DOOR.get());
		super.basicItem(DDItems.SHORT_GOURDROT_DOOR.get());

		super.basicItem(DDItems.SHORT_AA_STEEL_DOOR.get());
		super.basicItem(DDItems.SHORT_AERONOS_DOOR.get());
		super.basicItem(DDItems.SHORT_GLACIAN_DOOR.get());
		super.basicItem(DDItems.SHORT_STROPHAR_DOOR.get());

		super.basicItem(DDItems.SHORT_ARCHWOOD_DOOR.get());

		super.basicItem(DDItems.SHORT_TWISTED_DOOR.get());

		super.basicItem(DDItems.SHORT_BE_BAMBOO_DOOR.get());
		super.basicItem(DDItems.SHORT_BE_DRY_BAMBOO_DOOR.get());

		super.basicItem(DDItems.SHORT_FLESH_DOOR.get());
		super.basicItem(DDItems.SHORT_FULL_FLESH_DOOR.get());
		super.basicItem(DDItems.SHORT_FLESHKIN_DOOR.get());

		super.basicItem(DDItems.SHORT_BM_ANCIENT_OAK_DOOR.get());
		super.basicItem(DDItems.SHORT_BM_BLIGHTED_BALSA_DOOR.get());
		super.basicItem(DDItems.SHORT_BM_SWAMP_CYPRESS_DOOR.get());
		super.basicItem(DDItems.SHORT_BM_WILLOW_DOOR.get());

		super.basicItem(DDItems.SHORT_BP_BAMBOO_DOOR.get());
		super.basicItem(DDItems.SHORT_BP_COPPER_DOOR.get());
		super.basicItem(DDItems.SHORT_BP_DIAMOND_DOOR.get());
		super.basicItem(DDItems.SHORT_BP_EMERALD_DOOR.get());
		super.basicItem(DDItems.SHORT_BP_GOLDEN_DOOR.get());
		super.basicItem(DDItems.SHORT_BP_MUSHROOM_DOOR.get());
		super.basicItem(DDItems.SHORT_BP_NETHERITE_DOOR.get());

		super.basicItem(DDItems.SHORT_BS_BLUEBRIGHT_DOOR.get());
		super.basicItem(DDItems.SHORT_BS_CHERRY_DOOR.get());
		super.basicItem(DDItems.SHORT_BS_CRYSTALLIZED_DOOR.get());
		super.basicItem(DDItems.SHORT_BS_DUSK_DOOR.get());
		super.basicItem(DDItems.SHORT_BS_FROSTBRIGHT_DOOR.get());
		super.basicItem(DDItems.SHORT_BS_LUNAR_DOOR.get());
		super.basicItem(DDItems.SHORT_BS_MAPLE_DOOR.get());
		super.basicItem(DDItems.SHORT_BS_STARLIT_DOOR.get());

		super.basicItem(DDItems.SHORT_APRICORN_DOOR.get());

		super.basicItem(DDItems.SHORT_AZULE_AZALEA_DOOR.get());
		super.basicItem(DDItems.SHORT_BRIGHT_AZALEA_DOOR.get());
		super.basicItem(DDItems.SHORT_FISS_AZALEA_DOOR.get());
		super.basicItem(DDItems.SHORT_ROZE_AZALEA_DOOR.get());
		super.basicItem(DDItems.SHORT_TECAL_AZALEA_DOOR.get());
		super.basicItem(DDItems.SHORT_TITANIUM_AZALEA_DOOR.get());
		super.basicItem(DDItems.SHORT_WALNUT_AZALEA_DOOR.get());

		super.basicItem(DDItems.SHORT_WALNUT_DOOR.get());

		super.basicItem(DDItems.SHORT_ECHO_DOOR.get());
		
		super.basicItem(DDItems.SHORT_PETRIFIED_DOOR.get());

		super.basicItem(DDItems.SHORT_CEILTRUNK_DOOR.get());
		super.basicItem(DDItems.SHORT_LUZAWOOD_DOOR.get());

		super.basicItem(DDItems.SHORT_STEEL_DOOR.get());
		super.basicItem(DDItems.SHORT_LOCKED_STEEL_DOOR.get());

		super.basicItem(DDItems.SHORT_ANDESITE_DOOR.get());
		super.basicItem(DDItems.SHORT_BRASS_DOOR.get());
		super.basicItem(DDItems.SHORT_COPPER_DOOR.get());
		super.basicItem(DDItems.SHORT_ZINC_DOOR.get());
		super.basicItem(DDItems.SHORT_LOCKED_ANDESITE_DOOR.get());
		super.basicItem(DDItems.SHORT_LOCKED_BRASS_DOOR.get());
		super.basicItem(DDItems.SHORT_LOCKED_COPPER_DOOR.get());
		super.basicItem(DDItems.SHORT_LOCKED_ZINC_DOOR.get());
		
		super.basicItem(DDItems.SHORT_ANDESITE_CASING_DOOR.get());
		super.basicItem(DDItems.SHORT_BRASS_CASING_DOOR.get());
		super.basicItem(DDItems.SHORT_COPPER_CASING_DOOR.get());

		super.basicItem(DDItems.SHORT_CARDBOARD_DOOR.get());
		super.basicItem(DDItems.SHORT_CHAIN_DOOR.get());
		super.basicItem(DDItems.SHORT_IRON_BAR_DOOR.get());
		super.basicItem(DDItems.SHORT_PADDED_DOOR.get());
		super.basicItem(DDItems.SHORT_INDUSTRIAL_IRON_DOOR.get());
		super.basicItem(DDItems.SHORT_RUSTY_IRON_DOOR.get());
		super.basicItem(DDItems.SHORT_SHEET_METAL_DOOR.get());
		super.basicItem(DDItems.SHORT_RUSTY_SHEET_METAL_DOOR.get());

		super.basicItem(DDItems.SHORT_ECO_AZALEA_DOOR.get());
		super.basicItem(DDItems.SHORT_ECO_FLOWERING_AZALEA_DOOR.get());
		super.basicItem(DDItems.SHORT_ECO_COCONUT_DOOR.get());
		super.basicItem(DDItems.SHORT_ECO_WALNUT_DOOR.get());

		super.basicItem(DDItems.SHORT_EBONY_DOOR.get());
		super.basicItem(DDItems.SHORT_PREAM_DOOR.get());

		super.basicItem(DDItems.SHORT_CONGEALED_DOOR.get());
		super.basicItem(DDItems.SHORT_EE_EBONY_DOOR.get());
		super.basicItem(DDItems.TALL_CONGEALED_DOOR.get());
		super.basicItem(DDItems.TALL_EE_EBONY_DOOR.get());

		super.basicItem(DDItems.SHORT_CO_COPPER_DOOR.get());
		super.basicItem(DDItems.SHORT_CO_EXPOSED_COPPER_DOOR.get());
		super.basicItem(DDItems.SHORT_CO_WEATHERED_COPPER_DOOR.get());
		super.basicItem(DDItems.SHORT_CO_OXIDIZED_COPPER_DOOR.get());
		
		super.basicItem(DDItems.SHORT_EC_COPPER_DOOR.get());
		super.basicItem(DDItems.SHORT_EC_EXPOSED_COPPER_DOOR.get());
		super.basicItem(DDItems.SHORT_EC_WEATHERED_COPPER_DOOR.get());
		super.basicItem(DDItems.SHORT_EC_OXIDIZED_COPPER_DOOR.get());

		super.basicItem(DDItems.SHORT_MUSHROOM_DOOR.get());
		super.basicItem(DDItems.SHORT_GLOWSHROOM_DOOR.get());
		super.basicItem(DDItems.SHORT_POISONOUS_MUSHROOM_DOOR.get());
		super.basicItem(DDItems.SHORT_HONEY_FUNGUS_DOOR.get());

		super.basicItem(DDItems.SHORT_DEORUM_DOOR.get());
		super.basicItem(DDItems.SHORT_AURUM_DOOR.get());
		super.basicItem(DDItems.SHORT_EDELWOOD_DOOR.get());
		super.basicItem(DDItems.SHORT_ARCANE_EDELWOOD_DOOR.get());
		super.basicItem(DDItems.SHORT_CHERRYWOOD_DOOR.get());
		super.basicItem(DDItems.SHORT_FUNGYSS_DOOR.get());
		super.basicItem(DDItems.TALL_DEORUM_DOOR.get());
		super.basicItem(DDItems.TALL_AURUM_DOOR.get());

		super.basicItem(DDItems.SHORT_FT_CHERRY_DOOR.get());
		super.basicItem(DDItems.SHORT_FT_CITRUS_DOOR.get());

		super.basicItem(DDItems.SHORT_SOULBLIGHT_DOOR.get());
		super.basicItem(DDItems.SHORT_WHISTLECANE_DOOR.get());

		super.basicItem(DDItems.SHORT_GE_CYPRESS_DOOR.get());
		super.basicItem(DDItems.SHORT_GE_MUDDY_OAK_DOOR.get());

		super.basicItem(DDItems.SHORT_DARK_IRON_DOOR.get());

		super.basicItem(DDItems.SHORT_FAIRY_RING_MUSHROOM_DOOR.get());

		super.basicItem(DDItems.SHORT_EDIFIED_DOOR.get());

		super.basicItem(DDItems.SHORT_HEXEREI_MAHOGANY_DOOR.get());
		super.basicItem(DDItems.SHORT_HEXEREI_WILLOW_DOOR.get());
		super.basicItem(DDItems.SHORT_HEXEREI_WITCH_HAZEL_DOOR.get());
		super.basicItem(DDItems.TALL_HEXEREI_WITCH_HAZEL_DOOR.get());

		super.basicItem(DDItems.SHORT_MENRIL_DOOR.get());

		super.basicItem(DDItems.SHORT_RUNEWOOD_DOOR.get());
		super.basicItem(DDItems.SHORT_SOULWOOD_DOOR.get());

		super.basicItem(DDItems.SHORT_MORECRAFT_NETHERWOOD_DOOR.get());
		super.basicItem(DDItems.SHORT_MORECRAFT_NETHERBRICK_DOOR.get());
		super.basicItem(DDItems.SHORT_MORECRAFT_NETHERITE_DOOR.get());
		super.basicItem(DDItems.SHORT_MORECRAFT_GLASS_DOOR.get());
		super.basicItem(DDItems.SHORT_MORECRAFT_SOUL_GLASS_DOOR.get());
		super.basicItem(DDItems.SHORT_MORECRAFT_BONE_DOOR.get());

		super.basicItem(DDItems.SHORT_JABOTICABA_DOOR.get());
		super.basicItem(DDItems.SHORT_RAMBOUTAN_DOOR.get());

		super.basicItem(DDItems.SHORT_AZURE_DOOR.get());

		super.basicItem(DDItems.SHORT_FIR_DOOR.get());

		super.basicItem(DDItems.SHORT_QUARK_ANCIENT_DOOR.get());
		super.basicItem(DDItems.SHORT_QUARK_AZALEA_DOOR.get());
		super.basicItem(DDItems.SHORT_QUARK_BLOSSOM_DOOR.get());

		super.basicItem(DDItems.SHORT_PW_MAGIC_DOOR.get());
		super.basicItem(DDItems.SHORT_PW_MAPLE_DOOR.get());
		super.basicItem(DDItems.SHORT_PW_PURPLE_HEART_DOOR.get());
		super.basicItem(DDItems.SHORT_PW_SILVERBELL_DOOR.get());
		super.basicItem(DDItems.SHORT_PW_TIGER_DOOR.get());
		super.basicItem(DDItems.SHORT_PW_WILLOW_DOOR.get());

		super.basicItem(DDItems.SHORT_PYROWOOD_DOOR.get());
		super.basicItem(DDItems.SHORT_ROTTEN_PLANKS_DOOR.get());

		super.basicItem(DDItems.SHORT_RUE_BAOBAB_DOOR.get());
		super.basicItem(DDItems.SHORT_RUE_BLACKWOOD_DOOR.get());
		super.basicItem(DDItems.SHORT_RUE_CHERRY_DOOR.get());
		super.basicItem(DDItems.SHORT_RUE_CYPRESS_DOOR.get());
		super.basicItem(DDItems.SHORT_RUE_DEAD_DOOR.get());
		super.basicItem(DDItems.SHORT_RUE_EUCALYPTUS_DOOR.get());
		super.basicItem(DDItems.SHORT_RUE_JOSHUA_DOOR.get());
		super.basicItem(DDItems.SHORT_RUE_LARCH_DOOR.get());
		super.basicItem(DDItems.SHORT_RUE_MAPLE_DOOR.get());
		super.basicItem(DDItems.SHORT_RUE_MAUVE_DOOR.get());
		super.basicItem(DDItems.SHORT_RUE_PALM_DOOR.get());
		super.basicItem(DDItems.SHORT_RUE_PINE_DOOR.get());
		super.basicItem(DDItems.SHORT_RUE_REDWOOD_DOOR.get());
		super.basicItem(DDItems.SHORT_RUE_WILLOW_DOOR.get());

		super.basicItem(DDItems.SHORT_NETHERWOOD_DOOR.get());

		super.basicItem(DDItems.SHORT_GINGERBREAD_DOOR.get());

		super.basicItem(DDItems.SHORT_TWIGS_BAMBOO_DOOR.get());

		super.basicItem(DDItems.SHORT_BLOODSHROOM_DOOR.get());
		super.basicItem(DDItems.SHORT_GREENHEART_DOOR.get());
		super.basicItem(DDItems.SHORT_SKYROOT_DOOR.get());

		super.basicItem(DDItems.SHORT_GRONGLE_DOOR.get());
		super.basicItem(DDItems.SHORT_SMOGSTEM_DOOR.get());
		super.basicItem(DDItems.SHORT_WIGGLEWOOD_DOOR.get());

		super.basicItem(DDItems.SHORT_CHESTNUT_DOOR.get());
		super.basicItem(DDItems.SHORT_HOLLY_DOOR.get());

		super.basicItem(DDItems.SHORT_ARAUCARIA_DOOR.get());
		super.basicItem(DDItems.SHORT_HEIDIPHYLLUM_DOOR.get());
		super.basicItem(DDItems.SHORT_LIRIODENDRITES_DOOR.get());
		super.basicItem(DDItems.SHORT_METASEQUOIA_DOOR.get());
		super.basicItem(DDItems.SHORT_PROTOJUNIPEROXYLON_DOOR.get());
		super.basicItem(DDItems.SHORT_PROTOPICEOXYLON_DOOR.get());
		super.basicItem(DDItems.SHORT_ZAMITES_DOOR.get());
		super.basicItem(DDItems.SHORT_AGATHOXYLON_DOOR.get());
		super.basicItem(DDItems.SHORT_BRACHYPHYLLUM_DOOR.get());
		super.basicItem(DDItems.SHORT_GINKGO_DOOR.get());
		super.basicItem(DDItems.SHORT_NEOCALAMITES_DOOR.get());
		super.basicItem(DDItems.SHORT_SCHILDERIA_DOOR.get());
		super.basicItem(DDItems.SHORT_TROCHODENDROIDES_DOOR.get());
		super.basicItem(DDItems.SHORT_WOODWORTHIA_DOOR.get());
		super.basicItem(DDItems.TALL_AGATHOXYLON_DOOR.get());
		super.basicItem(DDItems.TALL_BRACHYPHYLLUM_DOOR.get());
		super.basicItem(DDItems.TALL_GINKGO_DOOR.get());
		super.basicItem(DDItems.TALL_NEOCALAMITES_DOOR.get());
		super.basicItem(DDItems.TALL_SCHILDERIA_DOOR.get());
		super.basicItem(DDItems.TALL_TROCHODENDROIDES_DOOR.get());
		super.basicItem(DDItems.TALL_WOODWORTHIA_DOOR.get());

		//super.basicItem(DDItems.TALL_OAK_DOOR.get());
	}
	
	// For item textures stored in a subfolder. Otherwise, use super.basicItem
    /*public ItemModelBuilder basicItem(Item item, ResourceLocation tex)
    {
        return getBuilder(Objects.requireNonNull(ForgeRegistries.ITEMS.getKey(item)).toString())
                .parent(new ModelFile.UncheckedModelFile("item/generated"))
                .texture("layer0", new ResourceLocation(tex.getNamespace(), "item/" +tex.getPath()));
    }*/
}
