package com.fizzware.dramaticdoors.blocks;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DramaticDoors;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DDBlocks {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, DramaticDoors.MOD_ID);
	
	// Vanilla
    public static final RegistryObject<Block> TALL_IRON_DOOR = BLOCKS.register(DDNames.TALL_IRON, () -> new TallDoorBlock(Blocks.IRON_DOOR));
    public static final RegistryObject<Block> TALL_OAK_DOOR = BLOCKS.register(DDNames.TALL_OAK, () -> new TallDoorBlock(Blocks.OAK_DOOR));
    public static final RegistryObject<Block> TALL_SPRUCE_DOOR = BLOCKS.register(DDNames.TALL_SPRUCE, () -> new TallDoorBlock(Blocks.SPRUCE_DOOR));
    public static final RegistryObject<Block> TALL_BIRCH_DOOR = BLOCKS.register(DDNames.TALL_BIRCH, () -> new TallDoorBlock(Blocks.BIRCH_DOOR));
    public static final RegistryObject<Block> TALL_JUNGLE_DOOR = BLOCKS.register(DDNames.TALL_JUNGLE, () -> new TallDoorBlock(Blocks.JUNGLE_DOOR));
    public static final RegistryObject<Block> TALL_ACACIA_DOOR = BLOCKS.register(DDNames.TALL_ACACIA, () -> new TallDoorBlock(Blocks.ACACIA_DOOR));
    public static final RegistryObject<Block> TALL_DARK_OAK_DOOR = BLOCKS.register(DDNames.TALL_DARK_OAK, () -> new TallDoorBlock(Blocks.DARK_OAK_DOOR));
    public static final RegistryObject<Block> TALL_MANGROVE_DOOR = BLOCKS.register(DDNames.TALL_MANGROVE, () -> new TallDoorBlock(Blocks.MANGROVE_DOOR));
    public static final RegistryObject<Block> TALL_CRIMSON_DOOR = BLOCKS.register(DDNames.TALL_CRIMSON, () -> new TallDoorBlock(Blocks.CRIMSON_DOOR));
    public static final RegistryObject<Block> TALL_WARPED_DOOR = BLOCKS.register(DDNames.TALL_WARPED, () -> new TallDoorBlock(Blocks.WARPED_DOOR));
    
    //Biomes O' Plenty
    public static final RegistryObject<Block> TALL_BOP_CHERRY_DOOR = BLOCKS.register(DDNames.TALL_BOP_CHERRY, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("biomesoplenty", "cherry_door"))));
    public static final RegistryObject<Block> TALL_BOP_DEAD_DOOR = BLOCKS.register(DDNames.TALL_BOP_DEAD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("biomesoplenty", "dead_door"))));
    public static final RegistryObject<Block> TALL_BOP_FIR_DOOR = BLOCKS.register(DDNames.TALL_BOP_FIR, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("biomesoplenty", "fir_door"))));
    public static final RegistryObject<Block> TALL_BOP_HELLBARK_DOOR = BLOCKS.register(DDNames.TALL_BOP_HELLBARK, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("biomesoplenty", "hellbark_door"))));
    public static final RegistryObject<Block> TALL_BOP_JACARANDA_DOOR = BLOCKS.register(DDNames.TALL_BOP_JACARANDA, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("biomesoplenty", "jacaranda_door"))));
    public static final RegistryObject<Block> TALL_BOP_MAGIC_DOOR = BLOCKS.register(DDNames.TALL_BOP_MAGIC, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("biomesoplenty", "magic_door"))));
    public static final RegistryObject<Block> TALL_BOP_MAHOGANY_DOOR = BLOCKS.register(DDNames.TALL_BOP_MAHOGANY, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("biomesoplenty", "mahogany_door"))));
    public static final RegistryObject<Block> TALL_BOP_PALM_DOOR = BLOCKS.register(DDNames.TALL_BOP_PALM, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("biomesoplenty", "palm_door"))));
    public static final RegistryObject<Block> TALL_BOP_REDWOOD_DOOR = BLOCKS.register(DDNames.TALL_BOP_REDWOOD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("biomesoplenty", "redwood_door"))));
    public static final RegistryObject<Block> TALL_BOP_UMBRAN_DOOR = BLOCKS.register(DDNames.TALL_BOP_UMBRAN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("biomesoplenty", "umbran_door"))));
    public static final RegistryObject<Block> TALL_BOP_WILLOW_DOOR = BLOCKS.register(DDNames.TALL_BOP_WILLOW, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("biomesoplenty", "willow_door"))));
    
    //Oh the Biomes You'll Go
    public static final RegistryObject<Block> TALL_BYG_ASPEN_DOOR = BLOCKS.register(DDNames.TALL_BYG_ASPEN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("byg", "aspen_door"))));
    public static final RegistryObject<Block> TALL_BYG_BAOBAB_DOOR = BLOCKS.register(DDNames.TALL_BYG_BAOBAB, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("byg", "baobab_door"))));
    public static final RegistryObject<Block> TALL_BYG_BLUE_ENCHANTED_DOOR = BLOCKS.register(DDNames.TALL_BYG_BLUE_ENCHANTED, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("byg", "blue_enchanted_door"))));
    public static final RegistryObject<Block> TALL_BYG_BULBIS_DOOR = BLOCKS.register(DDNames.TALL_BYG_BULBIS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("byg", "bulbis_door"))));
    public static final RegistryObject<Block> TALL_BYG_CHERRY_DOOR = BLOCKS.register(DDNames.TALL_BYG_CHERRY, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("byg", "cherry_door"))));
    public static final RegistryObject<Block> TALL_BYG_CIKA_DOOR = BLOCKS.register(DDNames.TALL_BYG_CIKA, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("byg", "cika_door"))));
    public static final RegistryObject<Block> TALL_BYG_CYPRESS_DOOR = BLOCKS.register(DDNames.TALL_BYG_CYPRESS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("byg", "cypress_door"))));
    public static final RegistryObject<Block> TALL_BYG_EBONY_DOOR = BLOCKS.register(DDNames.TALL_BYG_EBONY, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("byg", "ebony_door"))));
    public static final RegistryObject<Block> TALL_BYG_EMBUR_DOOR = BLOCKS.register(DDNames.TALL_BYG_EMBUR, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("byg", "embur_door"))));
    public static final RegistryObject<Block> TALL_BYG_ETHER_DOOR = BLOCKS.register(DDNames.TALL_BYG_ETHER, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("byg", "ether_door"))));
    public static final RegistryObject<Block> TALL_BYG_FIR_DOOR = BLOCKS.register(DDNames.TALL_BYG_FIR, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("byg", "fir_door"))));
    public static final RegistryObject<Block> TALL_BYG_FLORUS_DOOR = BLOCKS.register(DDNames.TALL_BYG_FLORUS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("byg", "florus_door"))));
    public static final RegistryObject<Block> TALL_BYG_GREEN_ENCHANTED_DOOR = BLOCKS.register(DDNames.TALL_BYG_GREEN_ENCHANTED, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("byg", "green_enchanted_door"))));
    public static final RegistryObject<Block> TALL_BYG_HOLLY_DOOR = BLOCKS.register(DDNames.TALL_BYG_HOLLY, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("byg", "holly_door"))));
    public static final RegistryObject<Block> TALL_BYG_IMPARIUS_DOOR = BLOCKS.register(DDNames.TALL_BYG_IMPARIUS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("byg", "imparius_door"))));
    public static final RegistryObject<Block> TALL_BYG_IRONWOOD_DOOR = BLOCKS.register(DDNames.TALL_BYG_IRONWOOD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("byg", "ironwood_door"))));
    public static final RegistryObject<Block> TALL_BYG_JACARANDA_DOOR = BLOCKS.register(DDNames.TALL_BYG_JACARANDA, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("byg", "jacaranda_door"))));
    public static final RegistryObject<Block> TALL_BYG_LAMENT_DOOR = BLOCKS.register(DDNames.TALL_BYG_LAMENT, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("byg", "lament_door"))));
    public static final RegistryObject<Block> TALL_BYG_MAHOGANY_DOOR = BLOCKS.register(DDNames.TALL_BYG_MAHOGANY, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("byg", "mahogany_door"))));
    public static final RegistryObject<Block> TALL_BYG_MAPLE_DOOR = BLOCKS.register(DDNames.TALL_BYG_MAPLE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("byg", "maple_door"))));
    public static final RegistryObject<Block> TALL_BYG_NIGHTSHADE_DOOR = BLOCKS.register(DDNames.TALL_BYG_NIGHTSHADE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("byg", "nightshade_door"))));
    public static final RegistryObject<Block> TALL_BYG_PALM_DOOR = BLOCKS.register(DDNames.TALL_BYG_PALM, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("byg", "palm_door"))));
    public static final RegistryObject<Block> TALL_BYG_PINE_DOOR = BLOCKS.register(DDNames.TALL_BYG_PINE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("byg", "pine_door"))));
    public static final RegistryObject<Block> TALL_BYG_RAINBOW_EUCALYPTUS_DOOR = BLOCKS.register(DDNames.TALL_BYG_RAINBOW_EUCALYPTUS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("byg", "rainbow_eucalyptus_door"))));
    public static final RegistryObject<Block> TALL_BYG_REDWOOD_DOOR = BLOCKS.register(DDNames.TALL_BYG_REDWOOD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("byg", "redwood_door"))));
    public static final RegistryObject<Block> TALL_BYG_SKYRIS_DOOR = BLOCKS.register(DDNames.TALL_BYG_SKYRIS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("byg", "skyris_door"))));
    public static final RegistryObject<Block> TALL_BYG_SOUL_SHROOM_DOOR = BLOCKS.register(DDNames.TALL_BYG_SOUL_SHROOM, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("byg", "soul_shroom_door"))));
    public static final RegistryObject<Block> TALL_BYG_SYTHIAN_DOOR = BLOCKS.register(DDNames.TALL_BYG_SYTHIAN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("byg", "sythian_door"))));
    public static final RegistryObject<Block> TALL_BYG_WHITE_MANGROVE_DOOR = BLOCKS.register(DDNames.TALL_BYG_WHITE_MANGROVE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("byg", "mangrove_door"))));
    public static final RegistryObject<Block> TALL_BYG_WILLOW_DOOR = BLOCKS.register(DDNames.TALL_BYG_WILLOW, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("byg", "willow_door"))));
    public static final RegistryObject<Block> TALL_BYG_WITCH_HAZEL_DOOR = BLOCKS.register(DDNames.TALL_BYG_WITCH_HAZEL, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("byg", "witch_hazel_door"))));
    public static final RegistryObject<Block> TALL_BYG_ZELKOVA_DOOR = BLOCKS.register(DDNames.TALL_BYG_ZELKOVA, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("byg", "zelkova_door"))));
    
    //Prehistoric Fauna
    public static final RegistryObject<Block> TALL_ARAUCARIA_DOOR = BLOCKS.register(DDNames.TALL_ARAUCARIA, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("prehistoricfauna", "araucaria_door"))));
    public static final RegistryObject<Block> TALL_HEIDIPHYLLUM_DOOR = BLOCKS.register(DDNames.TALL_HEIDIPHYLLUM, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("prehistoricfauna", "heidiphyllum_door"))));
    public static final RegistryObject<Block> TALL_LIRIODENDRITES_DOOR = BLOCKS.register(DDNames.TALL_LIRIODENDRITES, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("prehistoricfauna", "liriodendrites_door"))));
    public static final RegistryObject<Block> TALL_METASEQUOIA_DOOR = BLOCKS.register(DDNames.TALL_METASEQUOIA, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("prehistoricfauna", "metasequoia_door"))));
    public static final RegistryObject<Block> TALL_PROTOJUNIPEROXYLON_DOOR = BLOCKS.register(DDNames.TALL_PROTOJUNIPEROXYLON, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("prehistoricfauna", "protojuniperoxylon_door"))));
    public static final RegistryObject<Block> TALL_PROTOPICEOXYLON_DOOR = BLOCKS.register(DDNames.TALL_PROTOPICEOXYLON, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("prehistoricfauna", "protopiceoxylon_door"))));
    public static final RegistryObject<Block> TALL_ZAMITES_DOOR = BLOCKS.register(DDNames.TALL_ZAMITES, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("prehistoricfauna", "zamites_door"))));
    
    //Twilight Forest
    public static final RegistryObject<Block> TALL_CANOPY_DOOR = BLOCKS.register(DDNames.TALL_CANOPY, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("twilightforest", "canopy_door"))));
    public static final RegistryObject<Block> TALL_DARKWOOD_DOOR = BLOCKS.register(DDNames.TALL_DARKWOOD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("twilightforest", "dark_door"))));
    public static final RegistryObject<Block> TALL_TWILIGHT_MANGROVE_DOOR = BLOCKS.register(DDNames.TALL_TWILIGHT_MANGROVE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("twilightforest", "mangrove_door"))));
    public static final RegistryObject<Block> TALL_MINEWOOD_DOOR = BLOCKS.register(DDNames.TALL_MINEWOOD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("twilightforest", "mining_door"))));
    public static final RegistryObject<Block> TALL_SORTINGWOOD_DOOR = BLOCKS.register(DDNames.TALL_SORTINGWOOD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("twilightforest", "sorting_door"))));
    public static final RegistryObject<Block> TALL_TIMEWOOD_DOOR = BLOCKS.register(DDNames.TALL_TIMEWOOD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("twilightforest", "time_door"))));
    public static final RegistryObject<Block> TALL_TRANSWOOD_DOOR = BLOCKS.register(DDNames.TALL_TRANSWOOD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("twilightforest", "transformation_door"))));
    public static final RegistryObject<Block> TALL_TWILIGHT_OAK_DOOR = BLOCKS.register(DDNames.TALL_TWILIGHT_OAK, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("twilightforest", "twilight_oak_door"))));
    
    public static final RegistryObject<Block> TALL_TOWERWOOD_DOOR = BLOCKS.register(DDNames.TALL_TOWERWOOD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("tflostblocks", "towerwood_door"))));

    
    //Atmospheric
    public static final RegistryObject<Block> TALL_ASPEN_DOOR = BLOCKS.register(DDNames.TALL_ASPEN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("atmospheric", "aspen_door"))));
    public static final RegistryObject<Block> TALL_GRIMWOOD_DOOR = BLOCKS.register(DDNames.TALL_GRIMWOOD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("atmospheric", "grimwood_door"))));
    public static final RegistryObject<Block> TALL_KOUSA_DOOR = BLOCKS.register(DDNames.TALL_KOUSA, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("atmospheric", "kousa_door"))));
    public static final RegistryObject<Block> TALL_MORADO_DOOR = BLOCKS.register(DDNames.TALL_MORADO, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("atmospheric", "morado_door"))));
    public static final RegistryObject<Block> TALL_ROSEWOOD_DOOR = BLOCKS.register(DDNames.TALL_ROSEWOOD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("atmospheric", "rosewood_door"))));
    public static final RegistryObject<Block> TALL_YUCCA_DOOR = BLOCKS.register(DDNames.TALL_YUCCA, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("atmospheric", "yucca_door"))));
    
    //Autumnity
    public static final RegistryObject<Block> TALL_MAPLE_DOOR = BLOCKS.register(DDNames.TALL_MAPLE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("autumnity", "maple_door"))));
    
    //Bamboo Blocks
    public static final RegistryObject<Block> TALL_BAMBOO_DOOR = BLOCKS.register(DDNames.TALL_BAMBOO, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("bamboo_blocks", "bamboo_door"))));

    //Buzzier Bees
    public static final RegistryObject<Block> TALL_HONEYCOMB_DOOR = BLOCKS.register(DDNames.TALL_HONEYCOMB, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("buzzier_bees", "honeycomb_door"))));
    
    //Caverns & Chasms
    public static final RegistryObject<Block> TALL_AZALEA_DOOR = BLOCKS.register(DDNames.TALL_AZALEA, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("caverns_and_chasms", "azalea_door"))));
    
    //Endergetic Expansion
    public static final RegistryObject<Block> TALL_POISE_DOOR = BLOCKS.register(DDNames.TALL_POISE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("endergetic", "poise_door"))));
    
    //Environmental
    public static final RegistryObject<Block> TALL_CHERRY_DOOR = BLOCKS.register(DDNames.TALL_CHERRY, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("environmental", "cherry_door"))));
    public static final RegistryObject<Block> TALL_WILLOW_DOOR = BLOCKS.register(DDNames.TALL_WILLOW, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("environmental", "willow_door"))));
    public static final RegistryObject<Block> TALL_WISTERIA_DOOR = BLOCKS.register(DDNames.TALL_WISTERIA, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("environmental", "wisteria_door"))));
    
    //Upgrade Aquatic
    public static final RegistryObject<Block> TALL_DRIFTWOOD_DOOR = BLOCKS.register(DDNames.TALL_DRIFTWOOD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("upgrade_aquatic", "driftwood_door"))));
    public static final RegistryObject<Block> TALL_RIVER_DOOR = BLOCKS.register(DDNames.TALL_RIVER, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("upgrade_aquatic", "river_door"))));
    public static final RegistryObject<Block> TALL_GLASS_DOOR = BLOCKS.register(DDNames.TALL_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("upgrade_aquatic", "glass_door"))));
    public static final RegistryObject<Block> TALL_TOOTH_DOOR = BLOCKS.register(DDNames.TALL_TOOTH, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("upgrade_aquatic", "tooth_door"))));
    
    //Abundance
    public static final RegistryObject<Block> TALL_JACARANDA_DOOR = BLOCKS.register(DDNames.TALL_JACARANDA, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("abundance", "jacaranda_door"))));
    public static final RegistryObject<Block> TALL_REDBUD_DOOR = BLOCKS.register(DDNames.TALL_REDBUD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("abundance", "redbud_door"))));
    
    //Bayou Blues
    public static final RegistryObject<Block> TALL_CYPRESS_DOOR = BLOCKS.register(DDNames.TALL_CYPRESS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("cypress", "cypress_door"))));
    
    //Enhanced Mushrooms
    public static final RegistryObject<Block> TALL_BROWN_MUSHROOM_DOOR = BLOCKS.register(DDNames.TALL_BROWN_MUSHROOM, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("enhanced_mushrooms", "brown_mushroom_door"))));
    public static final RegistryObject<Block> TALL_RED_MUSHROOM_DOOR = BLOCKS.register(DDNames.TALL_RED_MUSHROOM, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("enhanced_mushrooms", "red_mushroom_door"))));
    public static final RegistryObject<Block> TALL_GLOWSHROOM_DOOR = BLOCKS.register(DDNames.TALL_GLOWSHROOM, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("enhanced_mushrooms", "glowshroom_door"))));
    
    //Architects Palette
    public static final RegistryObject<Block> TALL_TWISTED_DOOR = BLOCKS.register(DDNames.TALL_TWISTED, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("architects_palette", "twisted_door"))));
    
    //Blocks Plus
    public static final RegistryObject<Block> TALL_BP_BAMBOO_DOOR = BLOCKS.register(DDNames.TALL_BP_BAMBOO, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("blocksplus", "bamboo_door"))));
    public static final RegistryObject<Block> TALL_BP_MUSHROOM_DOOR = BLOCKS.register(DDNames.TALL_BP_MUSHROOM, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("blocksplus", "mushroom_door"))));
    public static final RegistryObject<Block> TALL_BP_COPPER_DOOR = BLOCKS.register(DDNames.TALL_BP_COPPER, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("blocksplus", "copper_door"))));
    public static final RegistryObject<Block> TALL_BP_GOLDEN_DOOR = BLOCKS.register(DDNames.TALL_BP_GOLDEN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("blocksplus", "golden_door"))));
    public static final RegistryObject<Block> TALL_BP_DIAMOND_DOOR = BLOCKS.register(DDNames.TALL_BP_DIAMOND, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("blocksplus", "diamond_door"))));
    public static final RegistryObject<Block> TALL_BP_EMERALD_DOOR = BLOCKS.register(DDNames.TALL_BP_EMERALD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("blocksplus", "emerald_door"))));
    public static final RegistryObject<Block> TALL_BP_NETHERITE_DOOR = BLOCKS.register(DDNames.TALL_BP_NETHERITE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("blocksplus", "netherite_door"))));
    
    //The Ceilands
    public static final RegistryObject<Block> TALL_CEILTRUNK_DOOR = BLOCKS.register(DDNames.TALL_CEILTRUNK, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("ceilands", "ceiltrunk_door"))));
    public static final RegistryObject<Block> TALL_LUZAWOOD_DOOR = BLOCKS.register(DDNames.TALL_LUZAWOOD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("ceilands", "luzawood_door"))));

    //Create: Alloyed
    public static final RegistryObject<Block> TALL_STEEL_DOOR = BLOCKS.register(DDNames.TALL_STEEL, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("alloyed", "steel_door"))));
    public static final RegistryObject<Block> TALL_LOCKED_STEEL_DOOR = BLOCKS.register(DDNames.TALL_LOCKED_STEEL, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("alloyed", "locked_steel_door"))));
    
    //Create: Deco
    public static final RegistryObject<Block> TALL_ANDESITE_DOOR = BLOCKS.register(DDNames.TALL_ANDESITE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("createdeco", "andesite_door"))));
    public static final RegistryObject<Block> TALL_BRASS_DOOR = BLOCKS.register(DDNames.TALL_BRASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("createdeco", "brass_door"))));
    public static final RegistryObject<Block> TALL_COPPER_DOOR = BLOCKS.register(DDNames.TALL_COPPER, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("createdeco", "copper_door"))));
    public static final RegistryObject<Block> TALL_ZINC_DOOR = BLOCKS.register(DDNames.TALL_ZINC, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("createdeco", "zinc_door"))));
    public static final RegistryObject<Block> TALL_LOCKED_ANDESITE_DOOR = BLOCKS.register(DDNames.TALL_LOCKED_ANDESITE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("createdeco", "locked_andesite_door"))));
    public static final RegistryObject<Block> TALL_LOCKED_BRASS_DOOR = BLOCKS.register(DDNames.TALL_LOCKED_BRASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("createdeco", "locked_brass_door"))));
    public static final RegistryObject<Block> TALL_LOCKED_COPPER_DOOR = BLOCKS.register(DDNames.TALL_LOCKED_COPPER, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("createdeco", "locked_copper_door"))));
    public static final RegistryObject<Block> TALL_LOCKED_ZINC_DOOR = BLOCKS.register(DDNames.TALL_LOCKED_ZINC, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("createdeco", "locked_zinc_door"))));
    
    //Darker Depths
    public static final RegistryObject<Block> TALL_PETRIFIED_DOOR = BLOCKS.register(DDNames.TALL_PETRIFIED, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("darkerdepths", "petrified_door"))));
    
    //Dustrial Decor
    public static final RegistryObject<Block> TALL_CARDBOARD_DOOR = BLOCKS.register(DDNames.TALL_CARDBOARD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("dustrial_decor", "cardboard_door"))));
    public static final RegistryObject<Block> TALL_CHAIN_DOOR = BLOCKS.register(DDNames.TALL_CHAIN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("dustrial_decor", "chain_door"))));
    public static final RegistryObject<Block> TALL_INDUSTRIAL_IRON_DOOR = BLOCKS.register(DDNames.TALL_INDUSTRIAL_IRON, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("dustrial_decor", "industrial_iron_door"))));
    public static final RegistryObject<Block> TALL_IRON_BAR_DOOR = BLOCKS.register(DDNames.TALL_IRON_BAR, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("dustrial_decor", "iron_bar_door"))));
    public static final RegistryObject<Block> TALL_PADDED_DOOR = BLOCKS.register(DDNames.TALL_PADDED, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("dustrial_decor", "padded_door"))));
    public static final RegistryObject<Block> TALL_RUSTY_IRON_DOOR = BLOCKS.register(DDNames.TALL_RUSTY_IRON, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("dustrial_decor", "rusty_iron_door"))));
    public static final RegistryObject<Block> TALL_RUSTY_SHEET_METAL_DOOR = BLOCKS.register(DDNames.TALL_RUSTY_SHEET_METAL, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("dustrial_decor", "rusty_sheet_metal_door"))));
    public static final RegistryObject<Block> TALL_SHEET_METAL_DOOR = BLOCKS.register(DDNames.TALL_SHEET_METAL, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("dustrial_decor", "sheet_metal_door"))));

    //Ecologics
    public static final RegistryObject<Block> TALL_ECO_AZALEA_DOOR = BLOCKS.register(DDNames.TALL_ECO_AZALEA, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("ecologics", "azalea_door"))));
    public static final RegistryObject<Block> TALL_ECO_FLOWERING_AZALEA_DOOR = BLOCKS.register(DDNames.TALL_ECO_FLOWERING_AZALEA, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("ecologics", "flowering_azalea_door"))));
    public static final RegistryObject<Block> TALL_ECO_COCONUT_DOOR = BLOCKS.register(DDNames.TALL_ECO_COCONUT, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("ecologics", "coconut_door"))));
    public static final RegistryObject<Block> TALL_ECO_WALNUT_DOOR = BLOCKS.register(DDNames.TALL_ECO_WALNUT, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("ecologics", "walnut_door"))));
    
    // End's Phantasm
    public static final RegistryObject<Block> TALL_EBONY_DOOR = BLOCKS.register(DDNames.TALL_EBONY, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("phantasm", "ebony_door"))));
    public static final RegistryObject<Block> TALL_PREAM_DOOR = BLOCKS.register(DDNames.TALL_PREAM, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("phantasm", "pream_door"))));
    
    // Habitat
    public static final RegistryObject<Block> TALL_FAIRY_RING_MUSHROOM_DOOR = BLOCKS.register(DDNames.TALL_FAIRY_RING_MUSHROOM, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("habitat", "fairy_ring_mushroom_door"))));
    
    // Nether's Exoticism
    public static final RegistryObject<Block> TALL_JABOTICABA_DOOR = BLOCKS.register(DDNames.TALL_JABOTICABA, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("nethers_exoticism", "jaboticaba_door"))));
    public static final RegistryObject<Block> TALL_RAMBOUTAN_DOOR = BLOCKS.register(DDNames.TALL_RAMBOUTAN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("nethers_exoticism", "ramboutan_door"))));
    
    // Outer End
    public static final RegistryObject<Block> TALL_AZURE_DOOR = BLOCKS.register(DDNames.TALL_AZURE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("outer_end", "azure_door"))));
    
    // Pokecube
    public static final RegistryObject<Block> TALL_POKECUBE_ENIGMA_DOOR = BLOCKS.register(DDNames.TALL_POKECUBE_ENIGMA, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("pokecube", "enigma_door"))));
    public static final RegistryObject<Block> TALL_POKECUBE_LEPPA_DOOR = BLOCKS.register(DDNames.TALL_POKECUBE_LEPPA, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("pokecube", "leppa_door"))));
    public static final RegistryObject<Block> TALL_POKECUBE_NANAB_DOOR = BLOCKS.register(DDNames.TALL_POKECUBE_NANAB, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("pokecube", "nanab_door"))));
    public static final RegistryObject<Block> TALL_POKECUBE_ORAN_DOOR = BLOCKS.register(DDNames.TALL_POKECUBE_ORAN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("pokecube", "oran_door"))));
    public static final RegistryObject<Block> TALL_POKECUBE_PECHA_DOOR = BLOCKS.register(DDNames.TALL_POKECUBE_PECHA, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("pokecube", "pecha_door"))));
    public static final RegistryObject<Block> TALL_POKECUBE_SITRUS_DOOR = BLOCKS.register(DDNames.TALL_POKECUBE_SITRUS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("pokecube", "sitrus_door"))));
    public static final RegistryObject<Block> TALL_POKECUBE_AGED_DOOR = BLOCKS.register(DDNames.TALL_POKECUBE_AGED, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("pokecube", "aged_door"))));
    public static final RegistryObject<Block> TALL_POKECUBE_CONCRETE_DOOR = BLOCKS.register(DDNames.TALL_POKECUBE_CONCRETE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("pokecube", "concrete_door"))));
    public static final RegistryObject<Block> TALL_POKECUBE_CORRUPTED_DOOR = BLOCKS.register(DDNames.TALL_POKECUBE_CORRUPTED, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("pokecube", "corrupted_door"))));
    public static final RegistryObject<Block> TALL_POKECUBE_DISTORTIC_DOOR = BLOCKS.register(DDNames.TALL_POKECUBE_DISTORTIC, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("pokecube", "distortic_door"))));
    public static final RegistryObject<Block> TALL_POKECUBE_INVERTED_DOOR = BLOCKS.register(DDNames.TALL_POKECUBE_INVERTED, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("pokecube", "inverted_door"))));
    public static final RegistryObject<Block> TALL_POKECUBE_MIRAGE_DOOR = BLOCKS.register(DDNames.TALL_POKECUBE_MIRAGE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("pokecube", "mirage_door"))));
    public static final RegistryObject<Block> TALL_POKECUBE_TEMPORAL_DOOR = BLOCKS.register(DDNames.TALL_POKECUBE_TEMPORAL, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("pokecube", "temporal_door"))));
    
    // Premium Wood
    public static final RegistryObject<Block> TALL_PW_MAGIC_DOOR = BLOCKS.register(DDNames.TALL_PW_MAGIC, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("premium_wood", "magic_door"))));
    public static final RegistryObject<Block> TALL_PW_MAPLE_DOOR = BLOCKS.register(DDNames.TALL_PW_MAPLE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("premium_wood", "maple_door"))));
    public static final RegistryObject<Block> TALL_PW_PURPLE_HEART_DOOR = BLOCKS.register(DDNames.TALL_PW_PURPLE_HEART, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("premium_wood", "purple_heart_door"))));
    public static final RegistryObject<Block> TALL_PW_SILVERBELL_DOOR = BLOCKS.register(DDNames.TALL_PW_SILVERBELL, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("premium_wood", "silverbell_door"))));
    public static final RegistryObject<Block> TALL_PW_TIGER_DOOR = BLOCKS.register(DDNames.TALL_PW_TIGER, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("premium_wood", "tiger_door"))));
    public static final RegistryObject<Block> TALL_PW_WILLOW_DOOR = BLOCKS.register(DDNames.TALL_PW_WILLOW, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("premium_wood", "willow_door"))));
    
    // Quark
    public static final RegistryObject<Block> TALL_QUARK_AZALEA_DOOR = BLOCKS.register(DDNames.TALL_QUARK_AZALEA, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("quark", "azalea_door"))));
    public static final RegistryObject<Block> TALL_QUARK_BLOSSOM_DOOR = BLOCKS.register(DDNames.TALL_QUARK_BLOSSOM, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("quark", "blossom_door"))));

    // Snowy Spirit
    public static final RegistryObject<Block> TALL_GINGERBREAD_DOOR = BLOCKS.register(DDNames.TALL_GINGERBREAD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("snowyspirit", "gingerbread_door"))));
    
    // Supplementaries
    public static final RegistryObject<Block> TALL_GOLD_DOOR = BLOCKS.register(DDNames.TALL_GOLD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("supplementaries", "gold_door"))));
    public static final RegistryObject<Block> TALL_SILVER_DOOR = BLOCKS.register(DDNames.TALL_SILVER, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("supplementaries", "silver_door"))));
    public static final RegistryObject<Block> TALL_LEAD_DOOR = BLOCKS.register(DDNames.TALL_LEAD, () -> new TallLeadDoorBlock(getBlockByKey(new ResourceLocation("supplementaries", "lead_door"))));
    public static final RegistryObject<Block> TALL_NETHERITE_DOOR = BLOCKS.register(DDNames.TALL_NETHERITE, () -> new TallNetheriteDoorBlock(getBlockByKey(new ResourceLocation("supplementaries", "netherite_door"))));

    // Twigs
	public static final RegistryObject<Block> TALL_TWIGS_BAMBOO_DOOR = BLOCKS.register(DDNames.TALL_TWIGS_BAMBOO, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("twigs", "bamboo_door"))));    
    
    //Undergarden
	public static final RegistryObject<Block> TALL_GRONGLE_DOOR = BLOCKS.register(DDNames.TALL_GRONGLE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("undergarden", "grongle_door"))));
    public static final RegistryObject<Block> TALL_SMOGSTEM_DOOR = BLOCKS.register(DDNames.TALL_SMOGSTEM, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("undergarden", "smogstem_door"))));
    public static final RegistryObject<Block> TALL_WIGGLEWOOD_DOOR = BLOCKS.register(DDNames.TALL_WIGGLEWOOD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("undergarden", "wigglewood_door"))));

    // Macaw
	public static final RegistryObject<Block> TALL_MACAW_JAIL_DOOR = BLOCKS.register(DDNames.TALL_MACAW_JAIL, () -> new TallSlidingDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "jail_door"))));
	public static final RegistryObject<Block> TALL_MACAW_METAL_DOOR = BLOCKS.register(DDNames.TALL_MACAW_METAL, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "metal_door"))));
	public static final RegistryObject<Block> TALL_MACAW_METAL_HOSPITAL_DOOR = BLOCKS.register(DDNames.TALL_MACAW_METAL_HOSPITAL, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "metal_hospital_door"))));
	public static final RegistryObject<Block> TALL_MACAW_METAL_REINFORCED_DOOR = BLOCKS.register(DDNames.TALL_MACAW_METAL_REINFORCED, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "metal_reinforced_door"))));
	public static final RegistryObject<Block> TALL_MACAW_METAL_WARNING_DOOR = BLOCKS.register(DDNames.TALL_MACAW_METAL_WARNING, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "metal_warning_door"))));
	public static final RegistryObject<Block> TALL_MACAW_METAL_WINDOWED_DOOR = BLOCKS.register(DDNames.TALL_MACAW_METAL_WINDOWED, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "metal_windowed_door"))));

	public static final RegistryObject<Block> TALL_MACAW_OAK_BARN_DOOR = BLOCKS.register(DDNames.TALL_MACAW_OAK_BARN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "oak_barn_door"))));
	public static final RegistryObject<Block> TALL_MACAW_SPRUCE_BARN_DOOR = BLOCKS.register(DDNames.TALL_MACAW_SPRUCE_BARN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "spruce_barn_door"))));
	public static final RegistryObject<Block> TALL_MACAW_BIRCH_BARN_DOOR = BLOCKS.register(DDNames.TALL_MACAW_BIRCH_BARN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "birch_barn_door"))));
	public static final RegistryObject<Block> TALL_MACAW_JUNGLE_BARN_DOOR = BLOCKS.register(DDNames.TALL_MACAW_JUNGLE_BARN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "jungle_barn_door"))));
	public static final RegistryObject<Block> TALL_MACAW_ACACIA_BARN_DOOR = BLOCKS.register(DDNames.TALL_MACAW_ACACIA_BARN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "mangrove_barn_door"))));
	public static final RegistryObject<Block> TALL_MACAW_DARK_OAK_BARN_DOOR = BLOCKS.register(DDNames.TALL_MACAW_DARK_OAK_BARN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "dark_oak_barn_door"))));
	public static final RegistryObject<Block> TALL_MACAW_MANGROVE_BARN_DOOR = BLOCKS.register(DDNames.TALL_MACAW_MANGROVE_BARN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "mangrove_barn_door"))));
	public static final RegistryObject<Block> TALL_MACAW_CRIMSON_BARN_DOOR = BLOCKS.register(DDNames.TALL_MACAW_CRIMSON_BARN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "crimson_barn_door"))));
	public static final RegistryObject<Block> TALL_MACAW_WARPED_BARN_DOOR = BLOCKS.register(DDNames.TALL_MACAW_WARPED_BARN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "warped_barn_door"))));

	public static final RegistryObject<Block> TALL_MACAW_OAK_BARN_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MACAW_OAK_BARN_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "oak_barn_glass_door"))));
	public static final RegistryObject<Block> TALL_MACAW_SPRUCE_BARN_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MACAW_SPRUCE_BARN_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "spruce_barn_glass_door"))));
	public static final RegistryObject<Block> TALL_MACAW_BIRCH_BARN_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MACAW_BIRCH_BARN_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "birch_barn_glass_door"))));
	public static final RegistryObject<Block> TALL_MACAW_JUNGLE_BARN_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MACAW_JUNGLE_BARN_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "jungle_barn_glass_door"))));
	public static final RegistryObject<Block> TALL_MACAW_ACACIA_BARN_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MACAW_ACACIA_BARN_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "mangrove_barn_glass_door"))));
	public static final RegistryObject<Block> TALL_MACAW_MANGROVE_BARN_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MACAW_MANGROVE_BARN_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "mangrove_barn_glass_door"))));
	public static final RegistryObject<Block> TALL_MACAW_DARK_OAK_BARN_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MACAW_DARK_OAK_BARN_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "dark_oak_barn_glass_door"))));
	public static final RegistryObject<Block> TALL_MACAW_CRIMSON_BARN_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MACAW_CRIMSON_BARN_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "crimson_barn_glass_door"))));
	public static final RegistryObject<Block> TALL_MACAW_WARPED_BARN_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MACAW_WARPED_BARN_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "warped_barn_glass_door"))));

	public static final RegistryObject<Block> TALL_MACAW_OAK_STABLE_DOOR = BLOCKS.register(DDNames.TALL_MACAW_OAK_STABLE, () -> new TallStableDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "oak_stable_door"))));
	public static final RegistryObject<Block> TALL_MACAW_SPRUCE_STABLE_DOOR = BLOCKS.register(DDNames.TALL_MACAW_SPRUCE_STABLE, () -> new TallStableDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "spruce_stable_door"))));
	public static final RegistryObject<Block> TALL_MACAW_BIRCH_STABLE_DOOR = BLOCKS.register(DDNames.TALL_MACAW_BIRCH_STABLE, () -> new TallStableDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "birch_stable_door"))));
	public static final RegistryObject<Block> TALL_MACAW_JUNGLE_STABLE_DOOR = BLOCKS.register(DDNames.TALL_MACAW_JUNGLE_STABLE, () -> new TallStableDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "jungle_stable_door"))));
	public static final RegistryObject<Block> TALL_MACAW_ACACIA_STABLE_DOOR = BLOCKS.register(DDNames.TALL_MACAW_ACACIA_STABLE, () -> new TallStableDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "mangrove_stable_door"))));
	public static final RegistryObject<Block> TALL_MACAW_DARK_OAK_STABLE_DOOR = BLOCKS.register(DDNames.TALL_MACAW_DARK_OAK_STABLE, () -> new TallStableDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "dark_oak_stable_door"))));
	public static final RegistryObject<Block> TALL_MACAW_MANGROVE_STABLE_DOOR = BLOCKS.register(DDNames.TALL_MACAW_MANGROVE_STABLE, () -> new TallStableDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "mangrove_stable_door"))));
	public static final RegistryObject<Block> TALL_MACAW_CRIMSON_STABLE_DOOR = BLOCKS.register(DDNames.TALL_MACAW_CRIMSON_STABLE, () -> new TallStableDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "crimson_stable_door"))));
	public static final RegistryObject<Block> TALL_MACAW_WARPED_STABLE_DOOR = BLOCKS.register(DDNames.TALL_MACAW_WARPED_STABLE, () -> new TallStableDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "warped_stable_door"))));

	public static final RegistryObject<Block> TALL_MACAW_OAK_STABLE_HEAD_DOOR = BLOCKS.register(DDNames.TALL_MACAW_OAK_STABLE_HEAD, () -> new TallStableDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "oak_stable_head_door"))));
	public static final RegistryObject<Block> TALL_MACAW_SPRUCE_STABLE_HEAD_DOOR = BLOCKS.register(DDNames.TALL_MACAW_SPRUCE_STABLE_HEAD, () -> new TallStableDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "spruce_stable_head_door"))));
	public static final RegistryObject<Block> TALL_MACAW_BIRCH_STABLE_HEAD_DOOR = BLOCKS.register(DDNames.TALL_MACAW_BIRCH_STABLE_HEAD, () -> new TallStableDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "birch_stable_head_door"))));
	public static final RegistryObject<Block> TALL_MACAW_JUNGLE_STABLE_HEAD_DOOR = BLOCKS.register(DDNames.TALL_MACAW_JUNGLE_STABLE_HEAD, () -> new TallStableDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "jungle_stable_head_door"))));
	public static final RegistryObject<Block> TALL_MACAW_ACACIA_STABLE_HEAD_DOOR = BLOCKS.register(DDNames.TALL_MACAW_ACACIA_STABLE_HEAD, () -> new TallStableDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "mangrove_stable_head_door"))));
	public static final RegistryObject<Block> TALL_MACAW_DARK_OAK_STABLE_HEAD_DOOR = BLOCKS.register(DDNames.TALL_MACAW_DARK_OAK_STABLE_HEAD, () -> new TallStableDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "dark_oak_stable_head_door"))));
	public static final RegistryObject<Block> TALL_MACAW_MANGROVE_STABLE_HEAD_DOOR = BLOCKS.register(DDNames.TALL_MACAW_MANGROVE_STABLE_HEAD, () -> new TallStableDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "mangrove_stable_head_door"))));
	public static final RegistryObject<Block> TALL_MACAW_CRIMSON_STABLE_HEAD_DOOR = BLOCKS.register(DDNames.TALL_MACAW_CRIMSON_STABLE_HEAD, () -> new TallStableDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "crimson_stable_head_door"))));
	public static final RegistryObject<Block> TALL_MACAW_WARPED_STABLE_HEAD_DOOR = BLOCKS.register(DDNames.TALL_MACAW_WARPED_STABLE_HEAD, () -> new TallStableDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "warped_stable_head_door"))));

	public static final RegistryObject<Block> TALL_MACAW_OAK_BARK_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MACAW_OAK_BARK_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "oak_bark_glass_door"))));
	public static final RegistryObject<Block> TALL_MACAW_SPRUCE_BARK_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MACAW_SPRUCE_BARK_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "spruce_bark_glass_door"))));
	public static final RegistryObject<Block> TALL_MACAW_BIRCH_BARK_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MACAW_BIRCH_BARK_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "birch_bark_glass_door"))));
	public static final RegistryObject<Block> TALL_MACAW_JUNGLE_BARK_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MACAW_JUNGLE_BARK_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "jungle_bark_glass_door"))));
	public static final RegistryObject<Block> TALL_MACAW_ACACIA_BARK_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MACAW_ACACIA_BARK_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "mangrove_bark_glass_door"))));
	public static final RegistryObject<Block> TALL_MACAW_DARK_OAK_BARK_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MACAW_DARK_OAK_BARK_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "dark_oak_bark_glass_door"))));
	public static final RegistryObject<Block> TALL_MACAW_MANGROVE_BARK_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MACAW_MANGROVE_BARK_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "mangrove_bark_glass_door"))));
	public static final RegistryObject<Block> TALL_MACAW_CRIMSON_STEM_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MACAW_CRIMSON_STEM_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "crimson_stem_glass_door"))));
	public static final RegistryObject<Block> TALL_MACAW_WARPED_STEM_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MACAW_WARPED_STEM_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "warped_stem_glass_door"))));
	
	public static final RegistryObject<Block> TALL_MACAW_OAK_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MACAW_OAK_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "oak_glass_door"))));
	public static final RegistryObject<Block> TALL_MACAW_SPRUCE_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MACAW_SPRUCE_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "spruce_glass_door"))));
	public static final RegistryObject<Block> TALL_MACAW_BIRCH_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MACAW_BIRCH_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "birch_glass_door"))));
	public static final RegistryObject<Block> TALL_MACAW_JUNGLE_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MACAW_JUNGLE_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "jungle_glass_door"))));
	public static final RegistryObject<Block> TALL_MACAW_ACACIA_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MACAW_ACACIA_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "mangrove_glass_door"))));
	public static final RegistryObject<Block> TALL_MACAW_DARK_OAK_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MACAW_DARK_OAK_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "dark_oak_glass_door"))));
	public static final RegistryObject<Block> TALL_MACAW_MANGROVE_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MACAW_MANGROVE_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "mangrove_glass_door"))));
	public static final RegistryObject<Block> TALL_MACAW_CRIMSON_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MACAW_CRIMSON_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "crimson_glass_door"))));
	public static final RegistryObject<Block> TALL_MACAW_WARPED_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MACAW_WARPED_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "warped_glass_door"))));

	public static final RegistryObject<Block> TALL_MACAW_OAK_MODERN_DOOR = BLOCKS.register(DDNames.TALL_MACAW_OAK_MODERN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "oak_modern_door"))));
	public static final RegistryObject<Block> TALL_MACAW_SPRUCE_MODERN_DOOR = BLOCKS.register(DDNames.TALL_MACAW_SPRUCE_MODERN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "spruce_modern_door"))));
	public static final RegistryObject<Block> TALL_MACAW_BIRCH_MODERN_DOOR = BLOCKS.register(DDNames.TALL_MACAW_BIRCH_MODERN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "birch_modern_door"))));
	public static final RegistryObject<Block> TALL_MACAW_JUNGLE_MODERN_DOOR = BLOCKS.register(DDNames.TALL_MACAW_JUNGLE_MODERN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "jungle_modern_door"))));
	public static final RegistryObject<Block> TALL_MACAW_ACACIA_MODERN_DOOR = BLOCKS.register(DDNames.TALL_MACAW_ACACIA_MODERN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "mangrove_modern_door"))));
	public static final RegistryObject<Block> TALL_MACAW_DARK_OAK_MODERN_DOOR = BLOCKS.register(DDNames.TALL_MACAW_DARK_OAK_MODERN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "dark_oak_modern_door"))));
	public static final RegistryObject<Block> TALL_MACAW_MANGROVE_MODERN_DOOR = BLOCKS.register(DDNames.TALL_MACAW_MANGROVE_MODERN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "mangrove_modern_door"))));
	public static final RegistryObject<Block> TALL_MACAW_CRIMSON_MODERN_DOOR = BLOCKS.register(DDNames.TALL_MACAW_CRIMSON_MODERN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "crimson_modern_door"))));
	public static final RegistryObject<Block> TALL_MACAW_WARPED_MODERN_DOOR = BLOCKS.register(DDNames.TALL_MACAW_WARPED_MODERN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "warped_modern_door"))));

	public static final RegistryObject<Block> TALL_MACAW_OAK_JAPANESE_DOOR = BLOCKS.register(DDNames.TALL_MACAW_OAK_JAPANESE, () -> new TallSlidingDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "oak_japanese_door"))));
	public static final RegistryObject<Block> TALL_MACAW_SPRUCE_JAPANESE_DOOR = BLOCKS.register(DDNames.TALL_MACAW_SPRUCE_JAPANESE, () -> new TallSlidingDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "spruce_japanese_door"))));
	public static final RegistryObject<Block> TALL_MACAW_BIRCH_JAPANESE_DOOR = BLOCKS.register(DDNames.TALL_MACAW_BIRCH_JAPANESE, () -> new TallSlidingDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "birch_japanese_door"))));
	public static final RegistryObject<Block> TALL_MACAW_JUNGLE_JAPANESE_DOOR = BLOCKS.register(DDNames.TALL_MACAW_JUNGLE_JAPANESE, () -> new TallSlidingDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "jungle_japanese_door"))));
	public static final RegistryObject<Block> TALL_MACAW_ACACIA_JAPANESE_DOOR = BLOCKS.register(DDNames.TALL_MACAW_ACACIA_JAPANESE, () -> new TallSlidingDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "mangrove_japanese_door"))));
	public static final RegistryObject<Block> TALL_MACAW_DARK_OAK_JAPANESE_DOOR = BLOCKS.register(DDNames.TALL_MACAW_DARK_OAK_JAPANESE, () -> new TallSlidingDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "dark_oak_japanese_door"))));
	public static final RegistryObject<Block> TALL_MACAW_MANGROVE_JAPANESE_DOOR = BLOCKS.register(DDNames.TALL_MACAW_MANGROVE_JAPANESE, () -> new TallSlidingDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "mangrove_japanese_door"))));
	public static final RegistryObject<Block> TALL_MACAW_CRIMSON_JAPANESE_DOOR = BLOCKS.register(DDNames.TALL_MACAW_CRIMSON_JAPANESE, () -> new TallSlidingDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "crimson_japanese_door"))));
	public static final RegistryObject<Block> TALL_MACAW_WARPED_JAPANESE_DOOR = BLOCKS.register(DDNames.TALL_MACAW_WARPED_JAPANESE, () -> new TallSlidingDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "warped_japanese_door"))));

	public static final RegistryObject<Block> TALL_MACAW_OAK_JAPANESE2_DOOR = BLOCKS.register(DDNames.TALL_MACAW_OAK_JAPANESE2, () -> new TallSlidingDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "oak_japanese2_door"))));
	public static final RegistryObject<Block> TALL_MACAW_SPRUCE_JAPANESE2_DOOR = BLOCKS.register(DDNames.TALL_MACAW_SPRUCE_JAPANESE2, () -> new TallSlidingDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "spruce_japanese2_door"))));
	public static final RegistryObject<Block> TALL_MACAW_BIRCH_JAPANESE2_DOOR = BLOCKS.register(DDNames.TALL_MACAW_BIRCH_JAPANESE2, () -> new TallSlidingDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "birch_japanese2_door"))));
	public static final RegistryObject<Block> TALL_MACAW_JUNGLE_JAPANESE2_DOOR = BLOCKS.register(DDNames.TALL_MACAW_JUNGLE_JAPANESE2, () -> new TallSlidingDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "jungle_japanese2_door"))));
	public static final RegistryObject<Block> TALL_MACAW_ACACIA_JAPANESE2_DOOR = BLOCKS.register(DDNames.TALL_MACAW_ACACIA_JAPANESE2, () -> new TallSlidingDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "mangrove_japanese2_door"))));
	public static final RegistryObject<Block> TALL_MACAW_DARK_OAK_JAPANESE2_DOOR = BLOCKS.register(DDNames.TALL_MACAW_DARK_OAK_JAPANESE2, () -> new TallSlidingDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "dark_oak_japanese2_door"))));
	public static final RegistryObject<Block> TALL_MACAW_MANGROVE_JAPANESE2_DOOR = BLOCKS.register(DDNames.TALL_MACAW_MANGROVE_JAPANESE2, () -> new TallSlidingDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "mangrove_japanese2_door"))));
	public static final RegistryObject<Block> TALL_MACAW_CRIMSON_JAPANESE2_DOOR = BLOCKS.register(DDNames.TALL_MACAW_CRIMSON_JAPANESE2, () -> new TallSlidingDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "crimson_japanese2_door"))));
	public static final RegistryObject<Block> TALL_MACAW_WARPED_JAPANESE2_DOOR = BLOCKS.register(DDNames.TALL_MACAW_WARPED_JAPANESE2, () -> new TallSlidingDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "warped_japanese2_door"))));

	public static final RegistryObject<Block> TALL_MACAW_SPRUCE_CLASSIC_DOOR = BLOCKS.register(DDNames.TALL_MACAW_SPRUCE_CLASSIC, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "spruce_classic_door"))));
	public static final RegistryObject<Block> TALL_MACAW_BIRCH_CLASSIC_DOOR = BLOCKS.register(DDNames.TALL_MACAW_BIRCH_CLASSIC, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "birch_classic_door"))));
	public static final RegistryObject<Block> TALL_MACAW_JUNGLE_CLASSIC_DOOR = BLOCKS.register(DDNames.TALL_MACAW_JUNGLE_CLASSIC, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "jungle_classic_door"))));
	public static final RegistryObject<Block> TALL_MACAW_ACACIA_CLASSIC_DOOR = BLOCKS.register(DDNames.TALL_MACAW_ACACIA_CLASSIC, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "mangrove_classic_door"))));
	public static final RegistryObject<Block> TALL_MACAW_DARK_OAK_CLASSIC_DOOR = BLOCKS.register(DDNames.TALL_MACAW_DARK_OAK_CLASSIC, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "dark_oak_classic_door"))));
	public static final RegistryObject<Block> TALL_MACAW_MANGROVE_CLASSIC_DOOR = BLOCKS.register(DDNames.TALL_MACAW_MANGROVE_CLASSIC, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "mangrove_classic_door"))));
	public static final RegistryObject<Block> TALL_MACAW_CRIMSON_CLASSIC_DOOR = BLOCKS.register(DDNames.TALL_MACAW_CRIMSON_CLASSIC, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "crimson_classic_door"))));
	public static final RegistryObject<Block> TALL_MACAW_WARPED_CLASSIC_DOOR = BLOCKS.register(DDNames.TALL_MACAW_WARPED_CLASSIC, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "warped_classic_door"))));

	public static final RegistryObject<Block> TALL_MACAW_OAK_COTTAGE_DOOR = BLOCKS.register(DDNames.TALL_MACAW_OAK_COTTAGE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "oak_cottage_door"))));
	public static final RegistryObject<Block> TALL_MACAW_BIRCH_COTTAGE_DOOR = BLOCKS.register(DDNames.TALL_MACAW_BIRCH_COTTAGE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "birch_cottage_door"))));
	public static final RegistryObject<Block> TALL_MACAW_JUNGLE_COTTAGE_DOOR = BLOCKS.register(DDNames.TALL_MACAW_JUNGLE_COTTAGE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "jungle_cottage_door"))));
	public static final RegistryObject<Block> TALL_MACAW_ACACIA_COTTAGE_DOOR = BLOCKS.register(DDNames.TALL_MACAW_ACACIA_COTTAGE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "mangrove_cottage_door"))));
	public static final RegistryObject<Block> TALL_MACAW_DARK_OAK_COTTAGE_DOOR = BLOCKS.register(DDNames.TALL_MACAW_DARK_OAK_COTTAGE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "dark_oak_cottage_door"))));
	public static final RegistryObject<Block> TALL_MACAW_MANGROVE_COTTAGE_DOOR = BLOCKS.register(DDNames.TALL_MACAW_MANGROVE_COTTAGE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "mangrove_cottage_door"))));
	public static final RegistryObject<Block> TALL_MACAW_CRIMSON_COTTAGE_DOOR = BLOCKS.register(DDNames.TALL_MACAW_CRIMSON_COTTAGE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "crimson_cottage_door"))));
	public static final RegistryObject<Block> TALL_MACAW_WARPED_COTTAGE_DOOR = BLOCKS.register(DDNames.TALL_MACAW_WARPED_COTTAGE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "warped_cottage_door"))));

	public static final RegistryObject<Block> TALL_MACAW_OAK_PAPER_DOOR = BLOCKS.register(DDNames.TALL_MACAW_OAK_PAPER, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "oak_paper_door"))));
	public static final RegistryObject<Block> TALL_MACAW_SPRUCE_PAPER_DOOR = BLOCKS.register(DDNames.TALL_MACAW_SPRUCE_PAPER, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "spruce_paper_door"))));
	public static final RegistryObject<Block> TALL_MACAW_JUNGLE_PAPER_DOOR = BLOCKS.register(DDNames.TALL_MACAW_JUNGLE_PAPER, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "jungle_paper_door"))));
	public static final RegistryObject<Block> TALL_MACAW_ACACIA_PAPER_DOOR = BLOCKS.register(DDNames.TALL_MACAW_ACACIA_PAPER, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "mangrove_paper_door"))));
	public static final RegistryObject<Block> TALL_MACAW_DARK_OAK_PAPER_DOOR = BLOCKS.register(DDNames.TALL_MACAW_DARK_OAK_PAPER, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "dark_oak_paper_door"))));
	public static final RegistryObject<Block> TALL_MACAW_MANGROVE_PAPER_DOOR = BLOCKS.register(DDNames.TALL_MACAW_MANGROVE_PAPER, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "mangrove_paper_door"))));
	public static final RegistryObject<Block> TALL_MACAW_CRIMSON_PAPER_DOOR = BLOCKS.register(DDNames.TALL_MACAW_CRIMSON_PAPER, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "crimson_paper_door"))));
	public static final RegistryObject<Block> TALL_MACAW_WARPED_PAPER_DOOR = BLOCKS.register(DDNames.TALL_MACAW_WARPED_PAPER, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "warped_paper_door"))));

	public static final RegistryObject<Block> TALL_MACAW_OAK_BEACH_DOOR = BLOCKS.register(DDNames.TALL_MACAW_OAK_BEACH, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "oak_beach_door"))));
	public static final RegistryObject<Block> TALL_MACAW_SPRUCE_BEACH_DOOR = BLOCKS.register(DDNames.TALL_MACAW_SPRUCE_BEACH, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "spruce_beach_door"))));
	public static final RegistryObject<Block> TALL_MACAW_BIRCH_BEACH_DOOR = BLOCKS.register(DDNames.TALL_MACAW_BIRCH_BEACH, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "birch_beach_door"))));
	public static final RegistryObject<Block> TALL_MACAW_ACACIA_BEACH_DOOR = BLOCKS.register(DDNames.TALL_MACAW_ACACIA_BEACH, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "mangrove_beach_door"))));
	public static final RegistryObject<Block> TALL_MACAW_DARK_OAK_BEACH_DOOR = BLOCKS.register(DDNames.TALL_MACAW_DARK_OAK_BEACH, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "dark_oak_beach_door"))));
	public static final RegistryObject<Block> TALL_MACAW_MANGROVE_BEACH_DOOR = BLOCKS.register(DDNames.TALL_MACAW_MANGROVE_BEACH, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "mangrove_beach_door"))));
	public static final RegistryObject<Block> TALL_MACAW_CRIMSON_BEACH_DOOR = BLOCKS.register(DDNames.TALL_MACAW_CRIMSON_BEACH, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "crimson_beach_door"))));
	public static final RegistryObject<Block> TALL_MACAW_WARPED_BEACH_DOOR = BLOCKS.register(DDNames.TALL_MACAW_WARPED_BEACH, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "warped_beach_door"))));

	public static final RegistryObject<Block> TALL_MACAW_OAK_TROPICAL_DOOR = BLOCKS.register(DDNames.TALL_MACAW_OAK_TROPICAL, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "oak_tropical_door"))));
	public static final RegistryObject<Block> TALL_MACAW_SPRUCE_TROPICAL_DOOR = BLOCKS.register(DDNames.TALL_MACAW_SPRUCE_TROPICAL, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "spruce_tropical_door"))));
	public static final RegistryObject<Block> TALL_MACAW_BIRCH_TROPICAL_DOOR = BLOCKS.register(DDNames.TALL_MACAW_BIRCH_TROPICAL, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "birch_tropical_door"))));
	public static final RegistryObject<Block> TALL_MACAW_JUNGLE_TROPICAL_DOOR = BLOCKS.register(DDNames.TALL_MACAW_JUNGLE_TROPICAL, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "jungle_tropical_door"))));
	public static final RegistryObject<Block> TALL_MACAW_DARK_OAK_TROPICAL_DOOR = BLOCKS.register(DDNames.TALL_MACAW_DARK_OAK_TROPICAL, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "dark_oak_tropical_door"))));
	public static final RegistryObject<Block> TALL_MACAW_MANGROVE_TROPICAL_DOOR = BLOCKS.register(DDNames.TALL_MACAW_MANGROVE_TROPICAL, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "mangrove_tropical_door"))));
	public static final RegistryObject<Block> TALL_MACAW_CRIMSON_TROPICAL_DOOR = BLOCKS.register(DDNames.TALL_MACAW_CRIMSON_TROPICAL, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "crimson_tropical_door"))));
	public static final RegistryObject<Block> TALL_MACAW_WARPED_TROPICAL_DOOR = BLOCKS.register(DDNames.TALL_MACAW_WARPED_TROPICAL, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "warped_tropical_door"))));

	public static final RegistryObject<Block> TALL_MACAW_OAK_FOUR_PANEL_DOOR = BLOCKS.register(DDNames.TALL_MACAW_OAK_FOUR_PANEL, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "oak_four_panel_door"))));
	public static final RegistryObject<Block> TALL_MACAW_SPRUCE_FOUR_PANEL_DOOR = BLOCKS.register(DDNames.TALL_MACAW_SPRUCE_FOUR_PANEL, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "spruce_four_panel_door"))));
	public static final RegistryObject<Block> TALL_MACAW_BIRCH_FOUR_PANEL_DOOR = BLOCKS.register(DDNames.TALL_MACAW_BIRCH_FOUR_PANEL, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "birch_four_panel_door"))));
	public static final RegistryObject<Block> TALL_MACAW_JUNGLE_FOUR_PANEL_DOOR = BLOCKS.register(DDNames.TALL_MACAW_JUNGLE_FOUR_PANEL, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "jungle_four_panel_door"))));
	public static final RegistryObject<Block> TALL_MACAW_ACACIA_FOUR_PANEL_DOOR = BLOCKS.register(DDNames.TALL_MACAW_ACACIA_FOUR_PANEL, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "mangrove_four_panel_door"))));
	public static final RegistryObject<Block> TALL_MACAW_MANGROVE_FOUR_PANEL_DOOR = BLOCKS.register(DDNames.TALL_MACAW_MANGROVE_FOUR_PANEL, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "mangrove_four_panel_door"))));
	public static final RegistryObject<Block> TALL_MACAW_CRIMSON_FOUR_PANEL_DOOR = BLOCKS.register(DDNames.TALL_MACAW_CRIMSON_FOUR_PANEL, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "crimson_four_panel_door"))));
	public static final RegistryObject<Block> TALL_MACAW_WARPED_FOUR_PANEL_DOOR = BLOCKS.register(DDNames.TALL_MACAW_WARPED_FOUR_PANEL, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "warped_four_panel_door"))));

	public static final RegistryObject<Block> TALL_MACAW_OAK_SWAMP_DOOR = BLOCKS.register(DDNames.TALL_MACAW_OAK_SWAMP, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "oak_swamp_door"))));
	public static final RegistryObject<Block> TALL_MACAW_SPRUCE_SWAMP_DOOR = BLOCKS.register(DDNames.TALL_MACAW_SPRUCE_SWAMP, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "spruce_swamp_door"))));
	public static final RegistryObject<Block> TALL_MACAW_BIRCH_SWAMP_DOOR = BLOCKS.register(DDNames.TALL_MACAW_BIRCH_SWAMP, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "birch_swamp_door"))));
	public static final RegistryObject<Block> TALL_MACAW_JUNGLE_SWAMP_DOOR = BLOCKS.register(DDNames.TALL_MACAW_JUNGLE_SWAMP, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "jungle_swamp_door"))));
	public static final RegistryObject<Block> TALL_MACAW_ACACIA_SWAMP_DOOR = BLOCKS.register(DDNames.TALL_MACAW_ACACIA_SWAMP, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "mangrove_swamp_door"))));
	public static final RegistryObject<Block> TALL_MACAW_DARK_OAK_SWAMP_DOOR = BLOCKS.register(DDNames.TALL_MACAW_DARK_OAK_SWAMP, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "dark_oak_swamp_door"))));
	public static final RegistryObject<Block> TALL_MACAW_CRIMSON_SWAMP_DOOR = BLOCKS.register(DDNames.TALL_MACAW_CRIMSON_SWAMP, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "crimson_swamp_door"))));
	public static final RegistryObject<Block> TALL_MACAW_WARPED_SWAMP_DOOR = BLOCKS.register(DDNames.TALL_MACAW_WARPED_SWAMP, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "warped_swamp_door"))));
	
	public static final RegistryObject<Block> TALL_MACAW_OAK_NETHER_DOOR = BLOCKS.register(DDNames.TALL_MACAW_OAK_NETHER, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "oak_nether_door"))));
	public static final RegistryObject<Block> TALL_MACAW_SPRUCE_NETHER_DOOR = BLOCKS.register(DDNames.TALL_MACAW_SPRUCE_NETHER, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "spruce_nether_door"))));
	public static final RegistryObject<Block> TALL_MACAW_BIRCH_NETHER_DOOR = BLOCKS.register(DDNames.TALL_MACAW_BIRCH_NETHER, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "birch_nether_door"))));
	public static final RegistryObject<Block> TALL_MACAW_JUNGLE_NETHER_DOOR = BLOCKS.register(DDNames.TALL_MACAW_JUNGLE_NETHER, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "jungle_nether_door"))));
	public static final RegistryObject<Block> TALL_MACAW_ACACIA_NETHER_DOOR = BLOCKS.register(DDNames.TALL_MACAW_ACACIA_NETHER, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "mangrove_nether_door"))));
	public static final RegistryObject<Block> TALL_MACAW_MANGROVE_NETHER_DOOR = BLOCKS.register(DDNames.TALL_MACAW_MANGROVE_NETHER, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "mangrove_nether_door"))));
	public static final RegistryObject<Block> TALL_MACAW_DARK_OAK_NETHER_DOOR = BLOCKS.register(DDNames.TALL_MACAW_DARK_OAK_NETHER, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "dark_oak_nether_door"))));
	public static final RegistryObject<Block> TALL_MACAW_WARPED_NETHER_DOOR = BLOCKS.register(DDNames.TALL_MACAW_WARPED_NETHER, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "warped_nether_door"))));

	public static final RegistryObject<Block> TALL_MACAW_OAK_MYSTIC_DOOR = BLOCKS.register(DDNames.TALL_MACAW_OAK_MYSTIC, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "oak_mystic_door"))));
	public static final RegistryObject<Block> TALL_MACAW_SPRUCE_MYSTIC_DOOR = BLOCKS.register(DDNames.TALL_MACAW_SPRUCE_MYSTIC, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "spruce_mystic_door"))));
	public static final RegistryObject<Block> TALL_MACAW_BIRCH_MYSTIC_DOOR = BLOCKS.register(DDNames.TALL_MACAW_BIRCH_MYSTIC, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "birch_mystic_door"))));
	public static final RegistryObject<Block> TALL_MACAW_JUNGLE_MYSTIC_DOOR = BLOCKS.register(DDNames.TALL_MACAW_JUNGLE_MYSTIC, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "jungle_mystic_door"))));
	public static final RegistryObject<Block> TALL_MACAW_ACACIA_MYSTIC_DOOR = BLOCKS.register(DDNames.TALL_MACAW_ACACIA_MYSTIC, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "mangrove_mystic_door"))));
	public static final RegistryObject<Block> TALL_MACAW_MANGROVE_MYSTIC_DOOR = BLOCKS.register(DDNames.TALL_MACAW_MANGROVE_MYSTIC, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "mangrove_mystic_door"))));
	public static final RegistryObject<Block> TALL_MACAW_DARK_OAK_MYSTIC_DOOR = BLOCKS.register(DDNames.TALL_MACAW_DARK_OAK_MYSTIC, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "dark_oak_mystic_door"))));
	public static final RegistryObject<Block> TALL_MACAW_CRIMSON_MYSTIC_DOOR = BLOCKS.register(DDNames.TALL_MACAW_CRIMSON_MYSTIC, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "crimson_mystic_door"))));
    
    public static Block getBlockByKey(ResourceLocation loc) {
    	if (ForgeRegistries.BLOCKS.containsKey(loc)) {
    		return ForgeRegistries.BLOCKS.getValue(loc);
    	}
    	else {
    		return Blocks.OAK_DOOR; // Fallback
    	}
    }
}
