package com.fizzware.dramaticdoors.compat;

import java.util.List;

import com.fizzware.dramaticdoors.DDConfig;
import com.google.common.collect.ImmutableList;

import net.minecraftforge.fml.ModList;

public class Compats
{
	public static final List<String> VANILLAESQUE_PACK_MODS = ImmutableList.of("blueprint", "horizons", "enhanced_mushrooms", "quark", "supplementaries", "goodending", "morecraft", "habitat", "abundant_atmosphere", "newworld", "windswept");
	public static final List<String> BIOME_PACK_MODS = ImmutableList.of("biomesoplenty", "byg", "regions_unexplored", "biomemakeover", "darkerdepths", "ecologics", "phantasm", "enlightened_end", "gardens_of_the_dead", "nethers_exoticism", "outer_end", "premium_wood");
	public static final List<String> DIMENSIONAL_PACK_MODS = ImmutableList.of("ad_astra", "blue_skies", "ceilands", "deeperdarker", "prehistoricfauna", "twilightforest", "undergarden");
	public static final List<String> TECH_PACK_MODS = ImmutableList.of("create", "dustrial_decor", "integrateddynamics", "tconstruct");
	public static final List<String> MAGIC_PACK_MODS = ImmutableList.of("ars_nouveau", "forbidden_arcanus", "hexcasting", "hexerei", "malum", "pyromancer");
	public static final List<String> MISC_PACK_MODS = ImmutableList.of("ms", "pokecube", "architects_palette", "bambooeverything", "biomancy", "blocksplus", "caupona", "cobblemon", "copperoverhaul", "everythingcopper", "extendedmushrooms", "fruittrees", "graveyard", "silentgear", "snowyspirit", "twigs");
	
    // Determining what Data Packs will be enabled, and additionally register extra blocks.
    public static final boolean VANILLAESQUE_PACK_ENABLED;
    public static final boolean BIOME_PACK_ENABLED;
    public static final boolean DIMENSIONAL_PACK_ENABLED;
    public static final boolean TECH_PACK_ENABLED;
    public static final boolean MAGIC_PACK_ENABLED;
    public static final boolean MISC_PACK_ENABLED;

    // Check if the additional mods are installed.
    public static final boolean AUTOMATIC_DOORS_INSTALLED;
	public static final boolean CURIOS_INSTALLED;
    public static final boolean DOUBLE_DOORS_INSTALLED;
    public static final boolean CHIPPED_INSTALLED;
    public static final boolean MACAWS_DOORS_INSTALLED;
    public static final boolean MANYIDEAS_DOORS_INSTALLED;
    public static final boolean QUARK_INSTALLED;
    public static final boolean SUPPLEMENTARIES_INSTALLED;
    public static final boolean STATEMENT_INSTALLED;
    
    static {
    	AUTOMATIC_DOORS_INSTALLED = ModList.get().isLoaded("automaticdoors");
    	CURIOS_INSTALLED = ModList.get().isLoaded("curios");
    	DOUBLE_DOORS_INSTALLED = ModList.get().isLoaded("doubledoors");
    	CHIPPED_INSTALLED = ModList.get().isLoaded("chipped") || DDConfig.devMode.get();
    	MACAWS_DOORS_INSTALLED = ModList.get().isLoaded("mcwdoors") || DDConfig.devMode.get();
    	MANYIDEAS_DOORS_INSTALLED = ModList.get().isLoaded("manyideas_doors") || DDConfig.devMode.get();
    	QUARK_INSTALLED = ModList.get().isLoaded("quark");
    	SUPPLEMENTARIES_INSTALLED = ModList.get().isLoaded("supplementaries");
    	STATEMENT_INSTALLED = ModList.get().isLoaded("statement");
    	
    	// Enable additional packs.
    	boolean hasVanillaesque = false;
    	for (String modToCheck : VANILLAESQUE_PACK_MODS) {
    		if (ModList.get().isLoaded(modToCheck)) {
    			hasVanillaesque = true;
    			break;
    		}	
    	}
    	VANILLAESQUE_PACK_ENABLED = hasVanillaesque || DDConfig.devMode.get();
    	
    	boolean hasBiomes = false;
    	for (String modToCheck : BIOME_PACK_MODS) {
    		if (ModList.get().isLoaded(modToCheck)) {
    			hasBiomes = true;
    			break;
    		}	
    	}
    	BIOME_PACK_ENABLED = hasBiomes || DDConfig.devMode.get();
    	
    	boolean hasDimensional = false;
    	for (String modToCheck : BIOME_PACK_MODS) {
    		if (ModList.get().isLoaded(modToCheck)) {
    			hasDimensional = true;
    			break;
    		}	
    	}
    	DIMENSIONAL_PACK_ENABLED = hasDimensional || DDConfig.devMode.get();
    	
    	boolean hasTech = false;
    	for (String modToCheck : TECH_PACK_MODS) {
    		if (ModList.get().isLoaded(modToCheck)) {
    			hasDimensional = true;
    			break;
    		}	
    	}
    	TECH_PACK_ENABLED = hasTech || DDConfig.devMode.get();
    	
    	boolean hasMagic = false;
    	for (String modToCheck : MAGIC_PACK_MODS) {
    		if (ModList.get().isLoaded(modToCheck)) {
    			hasDimensional = true;
    			break;
    		}	
    	}
    	MAGIC_PACK_ENABLED = hasMagic || DDConfig.devMode.get();
    	
    	boolean hasMisc = false;
    	for (String modToCheck : MISC_PACK_MODS) {
    		if (ModList.get().isLoaded(modToCheck)) {
    			hasDimensional = true;
    			break;
    		}	
    	}
    	MISC_PACK_ENABLED = hasMisc || DDConfig.devMode.get();
    }
}
