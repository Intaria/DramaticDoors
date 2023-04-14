package com.fizzware.dramaticdoors.datagen;

import com.fizzware.dramaticdoors.DramaticDoors;
import com.fizzware.dramaticdoors.blocks.ShortDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallDoorBlock;
import com.fizzware.dramaticdoors.init.DDBlocks;
import com.fizzware.dramaticdoors.state.properties.TripleBlockPart;

import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.DoorHingeSide;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.client.model.generators.ModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class DDBlockStateProvider extends BlockStateProvider {
		
    public DDBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, DramaticDoors.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
    	// Insert any tall doors that need to be data-generated. Example below:
    	shortDoorBlock(DDBlocks.SHORT_IRON_DOOR.get(), "block/short_iron");
    	shortDoorBlock(DDBlocks.SHORT_OAK_DOOR.get(), "block/short_oak");
    	shortDoorBlock(DDBlocks.SHORT_SPRUCE_DOOR.get(), "block/short_spruce");
    	shortDoorBlock(DDBlocks.SHORT_BIRCH_DOOR.get(), "block/short_birch");
    	shortDoorBlock(DDBlocks.SHORT_JUNGLE_DOOR.get(), "block/short_jungle");
    	shortDoorBlock(DDBlocks.SHORT_ACACIA_DOOR.get(), "block/short_acacia");
    	shortDoorBlock(DDBlocks.SHORT_DARK_OAK_DOOR.get(), "block/short_dark_oak");
    	shortDoorBlock(DDBlocks.SHORT_MANGROVE_DOOR.get(), "block/short_mangrove");
    	shortDoorBlock(DDBlocks.SHORT_BAMBOO_DOOR.get(), "block/short_bamboo");
    	shortDoorBlock(DDBlocks.SHORT_CRIMSON_DOOR.get(), "block/short_crimson");
    	shortDoorBlock(DDBlocks.SHORT_WARPED_DOOR.get(), "block/short_warped");
    	
    	shortDoorBlock(DDBlocks.SHORT_GOLD_DOOR.get(), "block/short_gold");
    	shortDoorBlock(DDBlocks.SHORT_SILVER_DOOR.get(), "block/short_silver");
    	shortDoorBlock(DDBlocks.SHORT_LEAD_DOOR.get(), "block/short_lead");
    	shortDoorBlock(DDBlocks.SHORT_NETHERITE_DOOR.get(), "block/short_netherite");

    	shortDoorBlock(DDBlocks.SHORT_CANOPY_DOOR.get(), "block/short_canopy");
    	shortDoorBlock(DDBlocks.SHORT_DARKWOOD_DOOR.get(), "block/short_darkwood");
    	shortDoorBlock(DDBlocks.SHORT_TWILIGHT_MANGROVE_DOOR.get(), "block/short_twilight_mangrove");
    	shortDoorBlock(DDBlocks.SHORT_MINEWOOD_DOOR.get(), "block/short_minewood");
    	shortDoorBlock(DDBlocks.SHORT_SORTINGWOOD_DOOR.get(), "block/short_sortingwood");
    	shortDoorBlock(DDBlocks.SHORT_TIMEWOOD_DOOR.get(), "block/short_timewood");
    	shortDoorBlock(DDBlocks.SHORT_TRANSWOOD_DOOR.get(), "block/short_transwood");
    	shortDoorBlock(DDBlocks.SHORT_TWILIGHT_OAK_DOOR.get(), "block/short_twilight_oak");
    	shortDoorBlock(DDBlocks.SHORT_TOWERWOOD_DOOR.get(), "block/short_towerwood");

    	shortDoorBlock(DDBlocks.SHORT_BOP_CHERRY_DOOR.get(), "block/short_bop_cherry");
    	shortDoorBlock(DDBlocks.SHORT_BOP_DEAD_DOOR.get(), "block/short_bop_dead");
    	shortDoorBlock(DDBlocks.SHORT_BOP_FIR_DOOR.get(), "block/short_bop_fir");
    	shortDoorBlock(DDBlocks.SHORT_BOP_HELLBARK_DOOR.get(), "block/short_bop_hellbark");
    	shortDoorBlock(DDBlocks.SHORT_BOP_JACARANDA_DOOR.get(), "block/short_bop_jacaranda");
    	shortDoorBlock(DDBlocks.SHORT_BOP_MAGIC_DOOR.get(), "block/short_bop_magic");
    	shortDoorBlock(DDBlocks.SHORT_BOP_MAHOGANY_DOOR.get(), "block/short_bop_mahogany");
    	shortDoorBlock(DDBlocks.SHORT_BOP_PALM_DOOR.get(), "block/short_bop_palm");
    	shortDoorBlock(DDBlocks.SHORT_BOP_REDWOOD_DOOR.get(), "block/short_bop_redwood");
    	shortDoorBlock(DDBlocks.SHORT_BOP_UMBRAN_DOOR.get(), "block/short_bop_umbran");
    	shortDoorBlock(DDBlocks.SHORT_BOP_WILLOW_DOOR.get(), "block/short_bop_willow");

    	shortDoorBlock(DDBlocks.SHORT_ASPEN_DOOR.get(), "block/short_aspen");
    	shortDoorBlock(DDBlocks.SHORT_GRIMWOOD_DOOR.get(), "block/short_grimwood");
    	shortDoorBlock(DDBlocks.SHORT_KOUSA_DOOR.get(), "block/short_kousa");
    	shortDoorBlock(DDBlocks.SHORT_MORADO_DOOR.get(), "block/short_morado");
    	shortDoorBlock(DDBlocks.SHORT_ROSEWOOD_DOOR.get(), "block/short_rosewood");
    	shortDoorBlock(DDBlocks.SHORT_YUCCA_DOOR.get(), "block/short_yucca");
    	shortDoorBlock(DDBlocks.SHORT_HONEYCOMB_DOOR.get(), "block/short_honeycomb");
    	shortDoorBlock(DDBlocks.SHORT_AZALEA_DOOR.get(), "block/short_azalea");
    	shortDoorBlock(DDBlocks.SHORT_MAPLE_DOOR.get(), "block/short_maple");
    	shortDoorBlock(DDBlocks.SHORT_POISE_DOOR.get(), "block/short_poise");
    	shortDoorBlock(DDBlocks.SHORT_CHERRY_DOOR.get(), "block/short_cherry");
    	shortDoorBlock(DDBlocks.SHORT_WILLOW_DOOR.get(), "block/short_willow");
    	shortDoorBlock(DDBlocks.SHORT_WISTERIA_DOOR.get(), "block/short_wisteria");
    	shortDoorBlock(DDBlocks.SHORT_DRIFTWOOD_DOOR.get(), "block/short_driftwood");
    	shortDoorBlock(DDBlocks.SHORT_RIVER_DOOR.get(), "block/short_river");
    	shortDoorBlock(DDBlocks.SHORT_TOOTH_DOOR.get(), "block/short_tooth");
    	shortDoorBlock(DDBlocks.SHORT_GLASS_DOOR.get(), "block/short_glass");

    	shortDoorBlock(DDBlocks.SHORT_JACARANDA_DOOR.get(), "block/short_jacaranda");
    	shortDoorBlock(DDBlocks.SHORT_REDBUD_DOOR.get(), "block/short_redbud");
    	shortDoorBlock(DDBlocks.SHORT_CYPRESS_DOOR.get(), "block/short_cypress");
    	shortDoorBlock(DDBlocks.SHORT_BROWN_MUSHROOM_DOOR.get(), "block/short_brown_mushroom");
    	shortDoorBlock(DDBlocks.SHORT_RED_MUSHROOM_DOOR.get(), "block/short_red_mushroom");

    	shortDoorBlock(DDBlocks.SHORT_ASH_DOOR.get(), "block/short_ash");
    	shortDoorBlock(DDBlocks.SHORT_GOURDROT_DOOR.get(), "block/short_gourdrot");

    	shortDoorBlock(DDBlocks.SHORT_AA_STEEL_DOOR.get(), "block/short_aa_steel");
    	shortDoorBlock(DDBlocks.SHORT_AERONOS_DOOR.get(), "block/short_aeronos");
    	shortDoorBlock(DDBlocks.SHORT_GLACIAN_DOOR.get(), "block/short_glacian");
    	shortDoorBlock(DDBlocks.SHORT_STROPHAR_DOOR.get(), "block/short_strophar");

    	shortDoorBlock(DDBlocks.SHORT_ARCHWOOD_DOOR.get(), "block/short_archwood");

    	shortDoorBlock(DDBlocks.SHORT_TWISTED_DOOR.get(), "block/short_twisted");

    	shortDoorBlock(DDBlocks.SHORT_BE_BAMBOO_DOOR.get(), "block/short_be_bamboo");
    	shortDoorBlock(DDBlocks.SHORT_BE_DRY_BAMBOO_DOOR.get(), "block/short_be_dry_bamboo");

    	shortDoorBlock(DDBlocks.SHORT_FLESHKIN_DOOR.get(), "block/short_fleshkin");

    	shortDoorBlock(DDBlocks.SHORT_BM_ANCIENT_OAK_DOOR.get(), "block/short_bm_ancient_oak");
    	shortDoorBlock(DDBlocks.SHORT_BM_BLIGHTED_BALSA_DOOR.get(), "block/short_bm_blighted_balsa");
    	shortDoorBlock(DDBlocks.SHORT_BM_SWAMP_CYPRESS_DOOR.get(), "block/short_bm_swamp_cypress");
    	shortDoorBlock(DDBlocks.SHORT_BM_WILLOW_DOOR.get(), "block/short_bm_willow");

    	shortDoorBlock(DDBlocks.SHORT_BP_BAMBOO_DOOR.get(), "block/short_bp_bamboo");
    	shortDoorBlock(DDBlocks.SHORT_BP_COPPER_DOOR.get(), "block/short_bp_copper");
    	shortDoorBlock(DDBlocks.SHORT_BP_DIAMOND_DOOR.get(), "block/short_bp_diamond");
    	shortDoorBlock(DDBlocks.SHORT_BP_EMERALD_DOOR.get(), "block/short_bp_emerald");
    	shortDoorBlock(DDBlocks.SHORT_BP_GOLDEN_DOOR.get(), "block/short_bp_golden");
    	shortDoorBlock(DDBlocks.SHORT_BP_MUSHROOM_DOOR.get(), "block/short_bp_mushroom");
    	shortDoorBlock(DDBlocks.SHORT_BP_NETHERITE_DOOR.get(), "block/short_bp_netherite");

    	shortDoorBlock(DDBlocks.SHORT_BS_BLUEBRIGHT_DOOR.get(), "block/short_bs_bluebright");
    	shortDoorBlock(DDBlocks.SHORT_BS_CHERRY_DOOR.get(), "block/short_bs_cherry");
    	shortDoorBlock(DDBlocks.SHORT_BS_CRYSTALLIZED_DOOR.get(), "block/short_bs_crystallized");
    	shortDoorBlock(DDBlocks.SHORT_BS_DUSK_DOOR.get(), "block/short_bs_dusk");
    	shortDoorBlock(DDBlocks.SHORT_BS_FROSTBRIGHT_DOOR.get(), "block/short_bs_frostbright");
    	shortDoorBlock(DDBlocks.SHORT_BS_LUNAR_DOOR.get(), "block/short_bs_lunar");
    	shortDoorBlock(DDBlocks.SHORT_BS_MAPLE_DOOR.get(), "block/short_bs_maple");
    	shortDoorBlock(DDBlocks.SHORT_BS_STARLIT_DOOR.get(), "block/short_bs_starlit");

    	shortDoorBlock(DDBlocks.SHORT_WALNUT_DOOR.get(), "block/short_walnut");

    	shortDoorBlock(DDBlocks.SHORT_CEILTRUNK_DOOR.get(), "block/short_ceiltrunk");
    	shortDoorBlock(DDBlocks.SHORT_LUZAWOOD_DOOR.get(), "block/short_luzawood");
    	
    	shortDoorBlock(DDBlocks.SHORT_CO_COPPER_DOOR.get(), "block/short_co_copper");
    	shortDoorBlock(DDBlocks.SHORT_CO_EXPOSED_COPPER_DOOR.get(), "block/short_co_exposed_copper");
    	shortDoorBlock(DDBlocks.SHORT_CO_WEATHERED_COPPER_DOOR.get(), "block/short_co_weathered_copper");
    	shortDoorBlock(DDBlocks.SHORT_CO_OXIDIZED_COPPER_DOOR.get(), "block/short_co_oxidized_copper");

    	shortDoorBlock(DDBlocks.SHORT_AZULE_AZALEA_DOOR.get(), "block/short_azule_azalea");
    	shortDoorBlock(DDBlocks.SHORT_BRIGHT_AZALEA_DOOR.get(), "block/short_bright_azalea");
    	shortDoorBlock(DDBlocks.SHORT_FISS_AZALEA_DOOR.get(), "block/short_fiss_azalea");
    	shortDoorBlock(DDBlocks.SHORT_ROZE_AZALEA_DOOR.get(), "block/short_roze_azalea");
    	shortDoorBlock(DDBlocks.SHORT_TECAL_AZALEA_DOOR.get(), "block/short_tecal_azalea");
    	shortDoorBlock(DDBlocks.SHORT_TITANIUM_AZALEA_DOOR.get(), "block/short_titanium_azalea");
    	shortDoorBlock(DDBlocks.SHORT_WALNUT_AZALEA_DOOR.get(), "block/short_walnut_azalea");

    	shortDoorBlock(DDBlocks.SHORT_STEEL_DOOR.get(), "block/short_steel");
    	shortDoorBlock(DDBlocks.SHORT_LOCKED_STEEL_DOOR.get(), "block/short_locked_steel");

    	shortDoorBlock(DDBlocks.SHORT_ANDESITE_DOOR.get(), "block/short_andesite");
    	shortDoorBlock(DDBlocks.SHORT_BRASS_DOOR.get(), "block/short_brass");
    	shortDoorBlock(DDBlocks.SHORT_COPPER_DOOR.get(), "block/short_copper");
    	shortDoorBlock(DDBlocks.SHORT_ZINC_DOOR.get(), "block/short_zinc");
    	shortDoorBlock(DDBlocks.SHORT_LOCKED_ANDESITE_DOOR.get(), "block/short_locked_andesite");
    	shortDoorBlock(DDBlocks.SHORT_LOCKED_BRASS_DOOR.get(), "block/short_locked_brass");
    	shortDoorBlock(DDBlocks.SHORT_LOCKED_COPPER_DOOR.get(), "block/short_locked_copper");
    	shortDoorBlock(DDBlocks.SHORT_LOCKED_ZINC_DOOR.get(), "block/short_locked_zinc");
    	
    	shortDoorBlock(DDBlocks.SHORT_ANDESITE_CASING_DOOR.get(), "block/short_andesite_casing");
    	shortDoorBlock(DDBlocks.SHORT_BRASS_CASING_DOOR.get(), "block/short_brass_casing");
    	shortDoorBlock(DDBlocks.SHORT_COPPER_CASING_DOOR.get(), "block/short_copper_casing");

		shortDoorBlock(DDBlocks.SHORT_CARDBOARD_DOOR.get(), "block/short_cardboard");
		shortDoorBlock(DDBlocks.SHORT_CHAIN_DOOR.get(), "block/short_chain");
		shortDoorBlock(DDBlocks.SHORT_IRON_BAR_DOOR.get(), "block/short_iron_bar");
		shortDoorBlock(DDBlocks.SHORT_PADDED_DOOR.get(), "block/short_padded");
		shortDoorBlock(DDBlocks.SHORT_INDUSTRIAL_IRON_DOOR.get(), "block/short_industrial_iron");
		shortDoorBlock(DDBlocks.SHORT_RUSTY_IRON_DOOR.get(), "block/short_rusty_iron");
		shortDoorBlock(DDBlocks.SHORT_SHEET_METAL_DOOR.get(), "block/short_sheet_metal");
		shortDoorBlock(DDBlocks.SHORT_RUSTY_SHEET_METAL_DOOR.get(), "block/short_rusty_sheet_metal");
    	
    	shortDoorBlock(DDBlocks.SHORT_ECO_AZALEA_DOOR.get(), "block/short_eco_azalea");
    	shortDoorBlock(DDBlocks.SHORT_ECO_FLOWERING_AZALEA_DOOR.get(), "block/short_eco_flowering_azalea");
    	shortDoorBlock(DDBlocks.SHORT_ECO_WALNUT_DOOR.get(), "block/short_eco_walnut");
    	shortDoorBlock(DDBlocks.SHORT_ECO_COCONUT_DOOR.get(), "block/short_eco_coconut");

    	shortDoorBlock(DDBlocks.SHORT_EC_COPPER_DOOR.get(), "block/short_ec_copper");
    	shortDoorBlock(DDBlocks.SHORT_EC_EXPOSED_COPPER_DOOR.get(), "block/short_ec_exposed_copper");
    	shortDoorBlock(DDBlocks.SHORT_EC_WEATHERED_COPPER_DOOR.get(), "block/short_ec_weathered_copper");
    	shortDoorBlock(DDBlocks.SHORT_EC_OXIDIZED_COPPER_DOOR.get(), "block/short_ec_oxidized_copper");
    	shortDoorBlockAlt(DDBlocks.SHORT_EC_WAXED_COPPER_DOOR.get(), "block/short_ec_waxed_copper", "block/short_ec_copper");
    	shortDoorBlockAlt(DDBlocks.SHORT_EC_WAXED_EXPOSED_COPPER_DOOR.get(), "block/short_ec_waxed_exposed_copper", "block/short_ec_exposed_copper");
    	shortDoorBlockAlt(DDBlocks.SHORT_EC_WAXED_WEATHERED_COPPER_DOOR.get(), "block/short_ec_waxed_weathered_copper", "block/short_ec_weathered_copper");
    	shortDoorBlockAlt(DDBlocks.SHORT_EC_WAXED_OXIDIZED_COPPER_DOOR.get(), "block/short_ec_waxed_oxidized_copper", "block/short_ec_oxidized_copper");

    	shortDoorBlock(DDBlocks.SHORT_EBONY_DOOR.get(), "block/short_ebony");
    	shortDoorBlock(DDBlocks.SHORT_PREAM_DOOR.get(), "block/short_pream");

    	shortDoorBlock(DDBlocks.SHORT_CONGEALED_DOOR.get(), "block/short_congealed");
    	shortDoorBlock(DDBlocks.SHORT_EE_EBONY_DOOR.get(), "block/short_ee_ebony");
    	tallDoorBlock(DDBlocks.TALL_CONGEALED_DOOR.get(), "block/tall_congealed");
    	tallDoorBlock(DDBlocks.TALL_EE_EBONY_DOOR.get(), "block/tall_ee_ebony");

    	shortDoorBlock(DDBlocks.SHORT_MUSHROOM_DOOR.get(), "block/short_mushroom");
    	shortDoorBlock(DDBlocks.SHORT_GLOWSHROOM_DOOR.get(), "block/short_glowshroom");
    	shortDoorBlock(DDBlocks.SHORT_POISONOUS_MUSHROOM_DOOR.get(), "block/short_poisonous_mushroom");
    	shortDoorBlock(DDBlocks.SHORT_HONEY_FUNGUS_DOOR.get(), "block/short_honey_fungus");

    	shortDoorBlock(DDBlocks.SHORT_DEORUM_DOOR.get(), "block/short_deorum");
    	tallDoorBlock(DDBlocks.TALL_DEORUM_DOOR.get(), "block/tall_deorum");
    	shortDoorBlock(DDBlocks.SHORT_ARCANE_EDELWOOD_DOOR.get(), "block/short_edelwood");
    	shortDoorBlock(DDBlocks.SHORT_AURUM_DOOR.get(), "block/short_aurum");
    	tallDoorBlock(DDBlocks.TALL_AURUM_DOOR.get(), "block/tall_aurum");
    	shortDoorBlock(DDBlocks.SHORT_CHERRYWOOD_DOOR.get(), "block/short_cherrywood");
    	shortDoorBlock(DDBlocks.SHORT_EDELWOOD_DOOR.get(), "block/short_edelwood");
    	shortDoorBlock(DDBlocks.SHORT_FUNGYSS_DOOR.get(), "block/short_fungyss");

    	shortDoorBlock(DDBlocks.SHORT_FT_CHERRY_DOOR.get(), "block/short_ft_cherry");
    	shortDoorBlock(DDBlocks.SHORT_FT_CITRUS_DOOR.get(), "block/short_ft_citrus");

    	shortDoorBlock(DDBlocks.SHORT_DARK_IRON_DOOR.get(), "block/short_dark_iron");

    	shortDoorBlock(DDBlocks.SHORT_PETRIFIED_DOOR.get(), "block/short_petrified");

    	shortDoorBlock(DDBlocks.SHORT_ECHO_DOOR.get(), "block/short_echo");

    	shortDoorBlock(DDBlocks.SHORT_WHISTLECANE_DOOR.get(), "block/short_whistlecane");
    	shortDoorBlock(DDBlocks.SHORT_SOULBLIGHT_DOOR.get(), "block/short_soulblight");

    	shortDoorBlock(DDBlocks.SHORT_GE_CYPRESS_DOOR.get(), "block/short_ge_cypress");
    	shortDoorBlock(DDBlocks.SHORT_GE_MUDDY_OAK_DOOR.get(), "block/short_ge_muddy_oak");

    	shortDoorBlock(DDBlocks.SHORT_FAIRY_RING_MUSHROOM_DOOR.get(), "block/short_fairy_ring_mushroom");

    	shortDoorBlock(DDBlocks.SHORT_EDIFIED_DOOR.get(), "block/short_edified");

    	shortDoorBlock(DDBlocks.SHORT_HEXEREI_MAHOGANY_DOOR.get(), "block/short_hexerei_mahogany");
    	shortDoorBlock(DDBlocks.SHORT_HEXEREI_WILLOW_DOOR.get(), "block/short_hexerei_willow");
    	shortDoorBlock(DDBlocks.SHORT_HEXEREI_WITCH_HAZEL_DOOR.get(), "block/short_hexerei_witch_hazel");
    	
    	shortDoorBlock(DDBlocks.SHORT_MENRIL_DOOR.get(), "block/short_menril");

    	shortDoorBlock(DDBlocks.SHORT_RUNEWOOD_DOOR.get(), "block/short_runewood");
    	shortDoorBlock(DDBlocks.SHORT_SOULWOOD_DOOR.get(), "block/short_soulwood");

    	shortDoorBlock(DDBlocks.SHORT_MORECRAFT_NETHERWOOD_DOOR.get(), "block/short_morecraft_netherwood");
    	shortDoorBlock(DDBlocks.SHORT_MORECRAFT_NETHERBRICK_DOOR.get(), "block/short_morecraft_netherbrick");
    	shortDoorBlock(DDBlocks.SHORT_MORECRAFT_NETHERITE_DOOR.get(), "block/short_morecraft_netherite");
    	shortDoorBlock(DDBlocks.SHORT_MORECRAFT_GLASS_DOOR.get(), "block/short_morecraft_glass");
    	shortDoorBlock(DDBlocks.SHORT_MORECRAFT_SOUL_GLASS_DOOR.get(), "block/short_morecraft_soul_glass");
    	shortDoorBlock(DDBlocks.SHORT_MORECRAFT_BONE_DOOR.get(), "block/short_morecraft_bone");

    	shortDoorBlock(DDBlocks.SHORT_JABOTICABA_DOOR.get(), "block/short_jaboticaba");
    	shortDoorBlock(DDBlocks.SHORT_RAMBOUTAN_DOOR.get(), "block/short_ramboutan");

    	shortDoorBlock(DDBlocks.SHORT_FIR_DOOR.get(), "block/short_fir");

    	shortDoorBlock(DDBlocks.SHORT_PYROWOOD_DOOR.get(), "block/short_pyrowood");
    	shortDoorBlock(DDBlocks.SHORT_ROTTEN_PLANKS_DOOR.get(), "block/short_rotten_planks");

    	shortDoorBlock(DDBlocks.SHORT_QUARK_ANCIENT_DOOR.get(), "block/short_quark_ancient");
    	shortDoorBlock(DDBlocks.SHORT_QUARK_AZALEA_DOOR.get(), "block/short_quark_azalea");
    	shortDoorBlock(DDBlocks.SHORT_QUARK_BLOSSOM_DOOR.get(), "block/short_quark_blossom");

    	shortDoorBlock(DDBlocks.SHORT_PW_MAGIC_DOOR.get(), "block/short_pw_magic");
    	shortDoorBlock(DDBlocks.SHORT_PW_MAPLE_DOOR.get(), "block/short_pw_maple");
    	shortDoorBlock(DDBlocks.SHORT_PW_PURPLE_HEART_DOOR.get(), "block/short_pw_purple_heart");
    	shortDoorBlock(DDBlocks.SHORT_PW_SILVERBELL_DOOR.get(), "block/short_pw_silverbell");
    	shortDoorBlock(DDBlocks.SHORT_PW_TIGER_DOOR.get(), "block/short_pw_tiger");
    	shortDoorBlock(DDBlocks.SHORT_PW_WILLOW_DOOR.get(), "block/short_pw_willow");

    	shortDoorBlock(DDBlocks.SHORT_RUE_BAOBAB_DOOR.get(), "block/short_rue_baobab");
    	shortDoorBlock(DDBlocks.SHORT_RUE_BLACKWOOD_DOOR.get(), "block/short_rue_blackwood");
    	shortDoorBlock(DDBlocks.SHORT_RUE_CHERRY_DOOR.get(), "block/short_rue_cherry");
    	shortDoorBlock(DDBlocks.SHORT_RUE_CYPRESS_DOOR.get(), "block/short_rue_cypress");
    	shortDoorBlock(DDBlocks.SHORT_RUE_DEAD_DOOR.get(), "block/short_rue_dead");
    	shortDoorBlock(DDBlocks.SHORT_RUE_EUCALYPTUS_DOOR.get(), "block/short_rue_eucalyptus");
    	shortDoorBlock(DDBlocks.SHORT_RUE_JOSHUA_DOOR.get(), "block/short_rue_joshua");
    	shortDoorBlock(DDBlocks.SHORT_RUE_LARCH_DOOR.get(), "block/short_rue_larch");
    	shortDoorBlock(DDBlocks.SHORT_RUE_MAPLE_DOOR.get(), "block/short_rue_maple");
    	shortDoorBlock(DDBlocks.SHORT_RUE_MAUVE_DOOR.get(), "block/short_rue_mauve");
    	shortDoorBlock(DDBlocks.SHORT_RUE_PALM_DOOR.get(), "block/short_rue_palm");
    	shortDoorBlock(DDBlocks.SHORT_RUE_PINE_DOOR.get(), "block/short_rue_pine");
    	shortDoorBlock(DDBlocks.SHORT_RUE_REDWOOD_DOOR.get(), "block/short_rue_redwood");
    	shortDoorBlock(DDBlocks.SHORT_RUE_WILLOW_DOOR.get(), "block/short_rue_willow");

    	shortDoorBlock(DDBlocks.SHORT_NETHERWOOD_DOOR.get(), "block/short_netherwood");

    	shortDoorBlock(DDBlocks.SHORT_GINGERBREAD_DOOR.get(), "block/short_gingerbread");

    	shortDoorBlock(DDBlocks.SHORT_BLOODSHROOM_DOOR.get(), "block/short_bloodshroom");
    	shortDoorBlock(DDBlocks.SHORT_GREENHEART_DOOR.get(), "block/short_greenheart");
    	shortDoorBlock(DDBlocks.SHORT_SKYROOT_DOOR.get(), "block/short_skyroot");

    	shortDoorBlock(DDBlocks.SHORT_TWIGS_BAMBOO_DOOR.get(), "block/short_twigs_bamboo");

    	shortDoorBlock(DDBlocks.SHORT_GRONGLE_DOOR.get(), "block/short_grongle");
    	shortDoorBlock(DDBlocks.SHORT_SMOGSTEM_DOOR.get(), "block/short_smogstem");
    	shortDoorBlock(DDBlocks.SHORT_WIGGLEWOOD_DOOR.get(), "block/short_wigglewood");

    	shortDoorBlock(DDBlocks.SHORT_CHESTNUT_DOOR.get(), "block/short_chestnut");
    	shortDoorBlock(DDBlocks.SHORT_HOLLY_DOOR.get(), "block/short_holly");

    	shortDoorBlock(DDBlocks.SHORT_APRICORN_DOOR.get(), "block/short_apricorn");
    	tallDoorBlock(DDBlocks.TALL_APRICORN_DOOR.get(), "block/tall_apricorn");
    	tallDoorBlock(DDBlocks.TALL_HEXEREI_WITCH_HAZEL_DOOR.get(), "block/tall_hexerei_witch_hazel");
    	
		shortDoorBlock(DDBlocks.SHORT_ARAUCARIA_DOOR.get(), "block/short_araucaria");
		shortDoorBlock(DDBlocks.SHORT_HEIDIPHYLLUM_DOOR.get(), "block/short_heidiphyllum");
		shortDoorBlock(DDBlocks.SHORT_LIRIODENDRITES_DOOR.get(), "block/short_liriodendrites");
		shortDoorBlock(DDBlocks.SHORT_METASEQUOIA_DOOR.get(), "block/short_metasequoia");
		shortDoorBlock(DDBlocks.SHORT_PROTOJUNIPEROXYLON_DOOR.get(), "block/short_protojuniperoxylon");
		shortDoorBlock(DDBlocks.SHORT_PROTOPICEOXYLON_DOOR.get(), "block/short_protopiceoxylon");
		shortDoorBlock(DDBlocks.SHORT_ZAMITES_DOOR.get(), "block/short_zamites");
		shortDoorBlock(DDBlocks.SHORT_AGATHOXYLON_DOOR.get(), "block/short_agathoxylon");
		shortDoorBlock(DDBlocks.SHORT_BRACHYPHYLLUM_DOOR.get(), "block/short_brachyphyllum");
		shortDoorBlock(DDBlocks.SHORT_GINKGO_DOOR.get(), "block/short_ginkgo");
		shortDoorBlock(DDBlocks.SHORT_NEOCALAMITES_DOOR.get(), "block/short_neocalamites");
		shortDoorBlock(DDBlocks.SHORT_SCHILDERIA_DOOR.get(), "block/short_schilderia");
		shortDoorBlock(DDBlocks.SHORT_TROCHODENDROIDES_DOOR.get(), "block/short_trochodendroides");
		shortDoorBlock(DDBlocks.SHORT_WOODWORTHIA_DOOR.get(), "block/short_woodworthia");
		tallDoorBlock(DDBlocks.TALL_AGATHOXYLON_DOOR.get(), "block/tall_agathoxylon");
		tallDoorBlock(DDBlocks.TALL_BRACHYPHYLLUM_DOOR.get(), "block/tall_brachyphyllum");
		tallDoorBlock(DDBlocks.TALL_GINKGO_DOOR.get(), "block/tall_ginkgo");
		tallDoorBlock(DDBlocks.TALL_NEOCALAMITES_DOOR.get(), "block/tall_neocalamites");
		tallDoorBlock(DDBlocks.TALL_SCHILDERIA_DOOR.get(), "block/tall_schilderia");
		tallDoorBlock(DDBlocks.TALL_TROCHODENDROIDES_DOOR.get(), "block/tall_trochodendroides");
		tallDoorBlock(DDBlocks.TALL_WOODWORTHIA_DOOR.get(), "block/tall_woodworthia");
    	//tallDoorBlock(DDBlocks.TALL_OAK_DOOR.get(), "block/tall_oak");
    }
    
    /*private void tallDoorBlockAlt(Block block, String baseName, String texName) {
    	internalTallDoorBlockAlt((TallDoorBlock)block, baseName, new ResourceLocation(DramaticDoors.MOD_ID, "" + texName + "_bottom"), new ResourceLocation(DramaticDoors.MOD_ID, "" + texName + "_middle"), new ResourceLocation(DramaticDoors.MOD_ID, "" + texName + "_top"));
    }*/
    
    private void tallDoorBlock(Block block, String baseName) {
    	internalTallDoorBlock((TallDoorBlock)block, baseName, new ResourceLocation(DramaticDoors.MOD_ID, "" + baseName + "_door_bottom"), new ResourceLocation(DramaticDoors.MOD_ID, "" + baseName + "_door_middle"), new ResourceLocation(DramaticDoors.MOD_ID, "" + baseName + "_door_top"));
    }
    
    private void shortDoorBlockAlt(Block block, String baseName, String texName) {
    	internalShortDoorBlockAlt((ShortDoorBlock)block, baseName, new ResourceLocation(DramaticDoors.MOD_ID, "" + texName + "_door"));
    }
    
    private void shortDoorBlock(Block block, String baseName) {
    	internalShortDoorBlock((ShortDoorBlock)block, baseName, new ResourceLocation(DramaticDoors.MOD_ID, "" + baseName + "_door"));
    }
    
    /*private void internalTallDoorBlockAlt(TallDoorBlock block, String baseName, ResourceLocation bottom, ResourceLocation middle, ResourceLocation top) {
        ModelFile bottomLeft = models().withExistingParent(baseName + "_bottom_left", "" + ModelProvider.BLOCK_FOLDER + "/door_bottom_left").texture("bottom", bottom).texture("middle", middle).texture("top", top);
        ModelFile bottomLeftOpen = models().withExistingParent(baseName + "_bottom_left_open", "" + ModelProvider.BLOCK_FOLDER + "/door_bottom_left_open").texture("bottom", bottom).texture("middle", middle).texture("top", top);
        ModelFile bottomRight = models().withExistingParent(baseName + "_bottom_right", "" + ModelProvider.BLOCK_FOLDER + "/door_bottom_right").texture("bottom", bottom).texture("middle", middle).texture("top", top);
        ModelFile bottomRightOpen = models().withExistingParent(baseName + "_bottom_right_open", "" + ModelProvider.BLOCK_FOLDER + "/door_bottom_right_open").texture("bottom", bottom).texture("middle", middle).texture("top",top);
        ModelFile middleLeft = models().withExistingParent(baseName + "_middle_left", "dramaticdoors:" + ModelProvider.BLOCK_FOLDER + "/door_middle_left").texture("bottom", middle).texture("middle", middle).texture("top", middle); 
        ModelFile middleLeftOpen = models().withExistingParent(baseName + "_middle_left_open", "dramaticdoors:" + ModelProvider.BLOCK_FOLDER + "/door_middle_left_open").texture("bottom", middle).texture("middle", middle).texture("top", middle); 
        ModelFile middleRight = models().withExistingParent(baseName + "_middle_right", "dramaticdoors:" + ModelProvider.BLOCK_FOLDER + "/door_middle_right").texture("bottom", middle).texture("middle", middle).texture("top", middle);
        ModelFile middleRightOpen = models().withExistingParent(baseName + "_middle_right_open", "dramaticdoors:" + ModelProvider.BLOCK_FOLDER + "/door_middle_right_open").texture("bottom", middle).texture("middle", middle).texture("top", middle);
        ModelFile topLeft = models().withExistingParent(baseName + "_top_left", "" + ModelProvider.BLOCK_FOLDER + "/door_top_left").texture("bottom", bottom).texture("middle", middle).texture("top", top);
        ModelFile topLeftOpen = models().withExistingParent(baseName + "_top_left_open", "" + ModelProvider.BLOCK_FOLDER + "/door_top_left_open").texture("bottom", bottom).texture("middle", middle).texture("top", top);
        ModelFile topRight = models().withExistingParent(baseName + "_top_right", "" + ModelProvider.BLOCK_FOLDER + "/door_top_right").texture("bottom", bottom).texture("middle", middle).texture("top", top);
        ModelFile topRightOpen = models().withExistingParent(baseName + "_top_right_open", "" + ModelProvider.BLOCK_FOLDER + "/door_top_right_open").texture("bottom", bottom).texture("middle", middle).texture("top",top);
        tallDoorBlock(block, bottomLeft, bottomLeftOpen, bottomRight, bottomRightOpen, middleLeft, middleLeftOpen, middleRight, middleRightOpen, topLeft, topLeftOpen, topRight, topRightOpen);
    }*/
    
    private void internalTallDoorBlock(TallDoorBlock block, String baseName, ResourceLocation bottom, ResourceLocation middle, ResourceLocation top) {
        ModelFile bottomLeft = models().withExistingParent(baseName + "_door_bottom_left", ":" + ModelProvider.BLOCK_FOLDER + "/door_bottom_left").texture("bottom", bottom).texture("middle", middle).texture("top", top);
        ModelFile bottomLeftOpen = models().withExistingParent(baseName + "_door_bottom_left_open", "" + ModelProvider.BLOCK_FOLDER + "/door_bottom_left_open").texture("bottom", bottom).texture("middle", middle).texture("top", top);
        ModelFile bottomRight = models().withExistingParent(baseName + "_door_bottom_right", "" + ModelProvider.BLOCK_FOLDER + "/door_bottom_right").texture("bottom", bottom).texture("middle", middle).texture("top", top);
        ModelFile bottomRightOpen = models().withExistingParent(baseName + "_door_bottom_right_open", "" + ModelProvider.BLOCK_FOLDER + "/door_bottom_right_open").texture("bottom", bottom).texture("middle", middle).texture("top",top);
        ModelFile middleLeft = models().withExistingParent(baseName + "_door_middle_left", "dramaticdoors:" + ModelProvider.BLOCK_FOLDER + "/door_middle_left").texture("bottom", middle).texture("middle", middle).texture("top", middle); 
        ModelFile middleLeftOpen = models().withExistingParent(baseName + "_door_middle_left_open", "dramaticdoors:" + ModelProvider.BLOCK_FOLDER + "/door_middle_left_open").texture("bottom", middle).texture("middle", middle).texture("top", middle); 
        ModelFile middleRight = models().withExistingParent(baseName + "_door_middle_right", "dramaticdoors:" + ModelProvider.BLOCK_FOLDER + "/door_middle_right").texture("bottom", middle).texture("middle", middle).texture("top", middle);
        ModelFile middleRightOpen = models().withExistingParent(baseName + "_door_middle_right_open", "dramaticdoors:" + ModelProvider.BLOCK_FOLDER + "/door_middle_right_open").texture("bottom", middle).texture("middle", middle).texture("top", middle);
        ModelFile topLeft = models().withExistingParent(baseName + "_door_top_left", "" + ModelProvider.BLOCK_FOLDER + "/door_top_left").texture("bottom", bottom).texture("middle", middle).texture("top", top);
        ModelFile topLeftOpen = models().withExistingParent(baseName + "_door_top_left_open", "" + ModelProvider.BLOCK_FOLDER + "/door_top_left_open").texture("bottom", bottom).texture("middle", middle).texture("top", top);
        ModelFile topRight = models().withExistingParent(baseName + "_door_top_right", "" + ModelProvider.BLOCK_FOLDER + "/door_top_right").texture("bottom", bottom).texture("middle", middle).texture("top", top);
        ModelFile topRightOpen = models().withExistingParent(baseName + "_door_top_right_open", "" + ModelProvider.BLOCK_FOLDER + "/door_top_right_open").texture("bottom", bottom).texture("middle", middle).texture("top",top);
        tallDoorBlock(block, bottomLeft, bottomLeftOpen, bottomRight, bottomRightOpen, middleLeft, middleLeftOpen, middleRight, middleRightOpen, topLeft, topLeftOpen, topRight, topRightOpen);
    }
    
    private void internalShortDoorBlock(ShortDoorBlock block, String baseName, ResourceLocation tex) {
        ModelFile left = models().withExistingParent(baseName + "_door_left", "dramaticdoors:" + ModelProvider.BLOCK_FOLDER + "/door_short_left").texture("texture", tex);
        ModelFile leftOpen = models().withExistingParent(baseName + "_door_left_open", "dramaticdoors:" + ModelProvider.BLOCK_FOLDER + "/door_short_left_open").texture("texture", tex);
        ModelFile right = models().withExistingParent(baseName + "_door_right", "dramaticdoors:" + ModelProvider.BLOCK_FOLDER + "/door_short_right").texture("texture", tex);
        ModelFile rightOpen = models().withExistingParent(baseName + "_door_right_open", "dramaticdoors:" + ModelProvider.BLOCK_FOLDER + "/door_short_right_open").texture("texture", tex);
        shortDoorBlock(block, left, leftOpen, right, rightOpen);
    }
    
    private void internalShortDoorBlockAlt(ShortDoorBlock block, String baseName, ResourceLocation tex) {
        ModelFile left = models().withExistingParent(baseName + "_door_left", "dramaticdoors:" + ModelProvider.BLOCK_FOLDER + "/door_short_left").texture("texture", tex);
        ModelFile leftOpen = models().withExistingParent(baseName + "_door_left_open", "dramaticdoors:" + ModelProvider.BLOCK_FOLDER + "/door_short_left_open").texture("texture", tex);
        ModelFile right = models().withExistingParent(baseName + "_door_right", "dramaticdoors:" + ModelProvider.BLOCK_FOLDER + "/door_short_right").texture("texture", tex);
        ModelFile rightOpen = models().withExistingParent(baseName + "_door_right_open", "dramaticdoors:" + ModelProvider.BLOCK_FOLDER + "/door_short_right_open").texture("texture", tex);
        shortDoorBlock(block, left, leftOpen, right, rightOpen);
    }

    public void tallDoorBlock(TallDoorBlock block, ModelFile bottomLeft, ModelFile bottomLeftOpen, ModelFile bottomRight, ModelFile bottomRightOpen, ModelFile middleLeft, ModelFile middleLeftOpen, ModelFile middleRight, ModelFile middleRightOpen, ModelFile topLeft, ModelFile topLeftOpen, ModelFile topRight, ModelFile topRightOpen) {
        getVariantBuilder(block).forAllStatesExcept(state -> {
            int yRot = ((int) state.getValue(TallDoorBlock.FACING).toYRot()) + 90;
            TripleBlockPart third = state.getValue(TallDoorBlock.THIRD);
            boolean right = state.getValue(TallDoorBlock.HINGE) == DoorHingeSide.RIGHT;
            boolean open = state.getValue(TallDoorBlock.OPEN);
            if (open) {
                yRot += 90;
            }
            if (right && open) {
                yRot += 180;
            }
            yRot %= 360;

            ModelFile model = null;
            switch(third) {
            	case LOWER:
            	default:
		            if (right && open) {
		                model = bottomRightOpen;
		            } else if (!right && open) {
		                model = bottomLeftOpen;
		            }
		            if (right && !open) {
		                model = bottomRight;
		            } else if (!right && !open) {
		                model = bottomLeft;
		            }
            		break;
            	case MIDDLE:
		            if (right && open) {
		                model = middleRightOpen;
		            } else if (!right && open) {
		                model = middleLeftOpen;
		            }
		            if (right && !open) {
		                model = middleRight;
		            } else if (!right && !open) {
		                model = middleLeft;
		            }
            		break;
            	case UPPER:
		            if (right && open) {
		                model = topRightOpen;
		            } else if (!right && open) {
		                model = topLeftOpen;
		            }
		            if (right && !open) {
		                model = topRight;
		            } else if (!right && !open) {
		                model = topLeft;
		            }
            		break;
            }
            return ConfiguredModel.builder().modelFile(model).rotationY(yRot).build();
        }, TallDoorBlock.POWERED, TallDoorBlock.WATERLOGGED);
    }
    
    public void shortDoorBlock(ShortDoorBlock block, ModelFile left, ModelFile leftOpen, ModelFile right, ModelFile rightOpen) {
        getVariantBuilder(block).forAllStatesExcept(state -> {
            int yRot = ((int) state.getValue(ShortDoorBlock.FACING).toYRot()) + 90;
            boolean isRight = state.getValue(ShortDoorBlock.HINGE) == DoorHingeSide.RIGHT;
            boolean open = state.getValue(ShortDoorBlock.OPEN);
            if (open) {
                yRot += 90;
            }
            if (isRight && open) {
                yRot += 180;
            }
            yRot %= 360;

            ModelFile model = null;
            if (isRight) {
                model = open ? rightOpen : right;
            } 
            else {
                model = open ? leftOpen : left;
            }
            return ConfiguredModel.builder().modelFile(model).rotationY(yRot).build();
        }, ShortDoorBlock.POWERED, TallDoorBlock.WATERLOGGED);
    }
}