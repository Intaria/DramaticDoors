package com.fizzware.dramaticdoors.compat;

import java.util.List;
import org.apache.commons.lang3.mutable.MutableBoolean;

import com.fizzware.dramaticdoors.DDConfig;
import com.google.common.collect.ImmutableList;

import net.minecraftforge.fml.ModList;
import oshi.util.tuples.Pair;

public class Compats
{
    // Determining what Data Packs will be enabled, and additionally register extra blocks. Create lists and values.
	public static final List<String> VANILLAESQUE_PACK_MODS = ImmutableList.of("blueprint", "horizons", "enhanced_mushrooms", "quark", "supplementaries", "goodending", "morecraft", "habitat", "abundant_atmosphere", "newworld", "windswept");
	public static final List<String> BIOME_PACK_MODS = ImmutableList.of("biomesoplenty", "byg", "regions_unexplored", "biomemakeover", "darkerdepths", "ecologics", "phantasm", "enlightened_end", "gardens_of_the_dead", "nethers_exoticism", "outer_end", "premium_wood");
	public static final List<String> DIMENSIONAL_PACK_MODS = ImmutableList.of("ad_astra", "aether", "blue_skies", "ceilands", "deeperdarker", "prehistoricfauna", "twilightforest", "undergarden");
	public static final List<String> TECH_PACK_MODS = ImmutableList.of("create", "dustrial_decor", "integrateddynamics", "tconstruct");
	public static final List<String> MAGIC_PACK_MODS = ImmutableList.of("ars_nouveau", "forbidden_arcanus", "hexcasting", "hexerei", "malum", "pyromancer");
	public static final List<String> MISC_PACK_MODS = ImmutableList.of("ms", "pokecube", "architects_palette", "bambooeverything", "biomancy", "blocksplus", "caupona", "cobblemon", "copperoverhaul", "everythingcopper", "extendedmushrooms", "fruittrees", "graveyard", "silentgear", "snowyspirit", "twigs");
	
    public static final MutableBoolean VANILLAESQUE_PACK_ENABLED = new MutableBoolean(false);
    public static final MutableBoolean BIOME_PACK_ENABLED = new MutableBoolean(false);
    public static final MutableBoolean DIMENSIONAL_PACK_ENABLED = new MutableBoolean(false);
    public static final MutableBoolean TECH_PACK_ENABLED = new MutableBoolean(false);
    public static final MutableBoolean MAGIC_PACK_ENABLED = new MutableBoolean(false);
    public static final MutableBoolean MISC_PACK_ENABLED = new MutableBoolean(false);

	public static final List<Pair<List<String>, MutableBoolean>> COMPAT_PACKS = ImmutableList.of(new Pair<>(VANILLAESQUE_PACK_MODS, VANILLAESQUE_PACK_ENABLED), new Pair<>(BIOME_PACK_MODS, BIOME_PACK_ENABLED), new Pair<>(DIMENSIONAL_PACK_MODS, DIMENSIONAL_PACK_ENABLED), new Pair<>(TECH_PACK_MODS, TECH_PACK_ENABLED), new Pair<>(MAGIC_PACK_MODS, MAGIC_PACK_ENABLED), new Pair<>(MISC_PACK_MODS, MISC_PACK_ENABLED));

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
    	for (Pair<List<String>, MutableBoolean> compatpackIteration : COMPAT_PACKS) {
	    	for (String modToCheck : compatpackIteration.getA()) {
	    		if (ModList.get().isLoaded(modToCheck)) {
	    			compatpackIteration.getB().setTrue();
	    			break;
	    		}	
	    	}
	    	if (DDConfig.devMode.get()) {
	    		compatpackIteration.getB().setTrue();
	    	}
    	}
    }
}
