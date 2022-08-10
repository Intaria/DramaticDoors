package com.fizzware.dramaticdoors.items;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DramaticDoors;
import com.fizzware.dramaticdoors.blocks.DDBlocks;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DDItems {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DramaticDoors.MOD_ID);

    private static final Item.Properties PROPERTIES = new Item.Properties();
    
    // Vanilla
    public static final RegistryObject<Item> TALL_IRON_DOOR = ITEMS.register(DDNames.TALL_IRON, () -> new TallDoorItem(DDBlocks.TALL_IRON_DOOR.get(), PROPERTIES.tab(DramaticDoors.MAIN_TAB)));
    public static final RegistryObject<Item> TALL_OAK_DOOR = ITEMS.register(DDNames.TALL_OAK, () -> new TallDoorItem(DDBlocks.TALL_OAK_DOOR.get(), PROPERTIES.tab(DramaticDoors.MAIN_TAB)));
    public static final RegistryObject<Item> TALL_SPRUCE_DOOR = ITEMS.register(DDNames.TALL_SPRUCE, () -> new TallDoorItem(DDBlocks.TALL_SPRUCE_DOOR.get(), PROPERTIES.tab(DramaticDoors.MAIN_TAB)));
    public static final RegistryObject<Item> TALL_BIRCH_DOOR = ITEMS.register(DDNames.TALL_BIRCH, () -> new TallDoorItem(DDBlocks.TALL_BIRCH_DOOR.get(), PROPERTIES.tab(DramaticDoors.MAIN_TAB)));
    public static final RegistryObject<Item> TALL_JUNGLE_DOOR = ITEMS.register(DDNames.TALL_JUNGLE, () -> new TallDoorItem(DDBlocks.TALL_JUNGLE_DOOR.get(), PROPERTIES.tab(DramaticDoors.MAIN_TAB)));
    public static final RegistryObject<Item> TALL_ACACIA_DOOR = ITEMS.register(DDNames.TALL_ACACIA, () -> new TallDoorItem(DDBlocks.TALL_ACACIA_DOOR.get(), PROPERTIES.tab(DramaticDoors.MAIN_TAB)));
    public static final RegistryObject<Item> TALL_DARK_OAK_DOOR = ITEMS.register(DDNames.TALL_DARK_OAK, () -> new TallDoorItem(DDBlocks.TALL_DARK_OAK_DOOR.get(), PROPERTIES.tab(DramaticDoors.MAIN_TAB)));
    public static final RegistryObject<Item> TALL_MANGROVE_DOOR = ITEMS.register(DDNames.TALL_MANGROVE, () -> new TallDoorItem(DDBlocks.TALL_MANGROVE_DOOR.get(), PROPERTIES.tab(DramaticDoors.MAIN_TAB)));
    public static final RegistryObject<Item> TALL_CRIMSON_DOOR = ITEMS.register(DDNames.TALL_CRIMSON, () -> new TallDoorItem(DDBlocks.TALL_CRIMSON_DOOR.get(), PROPERTIES.tab(DramaticDoors.MAIN_TAB)));
    public static final RegistryObject<Item> TALL_WARPED_DOOR = ITEMS.register(DDNames.TALL_WARPED, () -> new TallDoorItem(DDBlocks.TALL_WARPED_DOOR.get(), PROPERTIES.tab(DramaticDoors.MAIN_TAB)));
    
    // Biomes o' Plenty
    public static final RegistryObject<Item> TALL_BOP_CHERRY_DOOR = ITEMS.register(DDNames.TALL_BOP_CHERRY, () -> new TallDoorItem(DDBlocks.TALL_BOP_CHERRY_DOOR.get(), conditionalTabProperties("biomesoplenty")));
    public static final RegistryObject<Item> TALL_BOP_DEAD_DOOR = ITEMS.register(DDNames.TALL_BOP_DEAD, () -> new TallDoorItem(DDBlocks.TALL_BOP_DEAD_DOOR.get(), conditionalTabProperties("biomesoplenty")));
    public static final RegistryObject<Item> TALL_BOP_FIR_DOOR = ITEMS.register(DDNames.TALL_BOP_FIR, () -> new TallDoorItem(DDBlocks.TALL_BOP_FIR_DOOR.get(), conditionalTabProperties("biomesoplenty")));
    public static final RegistryObject<Item> TALL_BOP_HELLBARK_DOOR = ITEMS.register(DDNames.TALL_BOP_HELLBARK, () -> new TallDoorItem(DDBlocks.TALL_BOP_HELLBARK_DOOR.get(), conditionalTabProperties("biomesoplenty")));
    public static final RegistryObject<Item> TALL_BOP_JACARANDA_DOOR = ITEMS.register(DDNames.TALL_BOP_JACARANDA, () -> new TallDoorItem(DDBlocks.TALL_BOP_JACARANDA_DOOR.get(), conditionalTabProperties("biomesoplenty")));
    public static final RegistryObject<Item> TALL_BOP_MAGIC_DOOR = ITEMS.register(DDNames.TALL_BOP_MAGIC, () -> new TallDoorItem(DDBlocks.TALL_BOP_MAGIC_DOOR.get(), conditionalTabProperties("biomesoplenty")));
    public static final RegistryObject<Item> TALL_BOP_MAHOGANY_DOOR = ITEMS.register(DDNames.TALL_BOP_MAHOGANY, () -> new TallDoorItem(DDBlocks.TALL_BOP_MAHOGANY_DOOR.get(), conditionalTabProperties("biomesoplenty")));
    public static final RegistryObject<Item> TALL_BOP_PALM_DOOR = ITEMS.register(DDNames.TALL_BOP_PALM, () -> new TallDoorItem(DDBlocks.TALL_BOP_PALM_DOOR.get(), conditionalTabProperties("biomesoplenty")));
    public static final RegistryObject<Item> TALL_BOP_REDWOOD_DOOR = ITEMS.register(DDNames.TALL_BOP_REDWOOD, () -> new TallDoorItem(DDBlocks.TALL_BOP_REDWOOD_DOOR.get(), conditionalTabProperties("biomesoplenty")));
    public static final RegistryObject<Item> TALL_BOP_UMBRAN_DOOR = ITEMS.register(DDNames.TALL_BOP_UMBRAN, () -> new TallDoorItem(DDBlocks.TALL_BOP_UMBRAN_DOOR.get(), conditionalTabProperties("biomesoplenty")));
    public static final RegistryObject<Item> TALL_BOP_WILLOW_DOOR = ITEMS.register(DDNames.TALL_BOP_WILLOW, () -> new TallDoorItem(DDBlocks.TALL_BOP_WILLOW_DOOR.get(), conditionalTabProperties("biomesoplenty")));
    
    // Oh the Biomes You'll Go
    public static final RegistryObject<Item> TALL_BYG_ASPEN_DOOR = ITEMS.register(DDNames.TALL_BYG_ASPEN, () -> new TallDoorItem(DDBlocks.TALL_BYG_ASPEN_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_BAOBAB_DOOR = ITEMS.register(DDNames.TALL_BYG_BAOBAB, () -> new TallDoorItem(DDBlocks.TALL_BYG_BAOBAB_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_BLUE_ENCHANTED_DOOR = ITEMS.register(DDNames.TALL_BYG_BLUE_ENCHANTED, () -> new TallDoorItem(DDBlocks.TALL_BYG_BLUE_ENCHANTED_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_BULBIS_DOOR = ITEMS.register(DDNames.TALL_BYG_BULBIS, () -> new TallDoorItem(DDBlocks.TALL_BYG_BULBIS_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_CHERRY_DOOR = ITEMS.register(DDNames.TALL_BYG_CHERRY, () -> new TallDoorItem(DDBlocks.TALL_BYG_CHERRY_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_CIKA_DOOR = ITEMS.register(DDNames.TALL_BYG_CIKA, () -> new TallDoorItem(DDBlocks.TALL_BYG_CIKA_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_CYPRESS_DOOR = ITEMS.register(DDNames.TALL_BYG_CYPRESS, () -> new TallDoorItem(DDBlocks.TALL_BYG_CYPRESS_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_EBONY_DOOR = ITEMS.register(DDNames.TALL_BYG_EBONY, () -> new TallDoorItem(DDBlocks.TALL_BYG_EBONY_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_EMBUR_DOOR = ITEMS.register(DDNames.TALL_BYG_EMBUR, () -> new TallDoorItem(DDBlocks.TALL_BYG_EMBUR_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_ETHER_DOOR = ITEMS.register(DDNames.TALL_BYG_ETHER, () -> new TallDoorItem(DDBlocks.TALL_BYG_ETHER_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_FIR_DOOR = ITEMS.register(DDNames.TALL_BYG_FIR, () -> new TallDoorItem(DDBlocks.TALL_BYG_FIR_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_FLORUS_DOOR = ITEMS.register(DDNames.TALL_BYG_FLORUS, () -> new TallDoorItem(DDBlocks.TALL_BYG_FLORUS_DOOR.get(), addIfItemIsAvailable(new ResourceLocation("byg", "florus_door"), conditionalTabProperties("byg"))));
    public static final RegistryObject<Item> TALL_BYG_GREEN_ENCHANTED_DOOR = ITEMS.register(DDNames.TALL_BYG_GREEN_ENCHANTED, () -> new TallDoorItem(DDBlocks.TALL_BYG_GREEN_ENCHANTED_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_HOLLY_DOOR = ITEMS.register(DDNames.TALL_BYG_HOLLY, () -> new TallDoorItem(DDBlocks.TALL_BYG_HOLLY_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_IMPARIUS_DOOR = ITEMS.register(DDNames.TALL_BYG_IMPARIUS, () -> new TallDoorItem(DDBlocks.TALL_BYG_IMPARIUS_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_IRONWOOD_DOOR = ITEMS.register(DDNames.TALL_BYG_IRONWOOD, () -> new TallDoorItem(DDBlocks.TALL_BYG_IRONWOOD_DOOR.get(), addIfItemIsAvailable(new ResourceLocation("byg", "ironwood_door"), conditionalTabProperties("byg"))));
    public static final RegistryObject<Item> TALL_BYG_JACARANDA_DOOR = ITEMS.register(DDNames.TALL_BYG_JACARANDA, () -> new TallDoorItem(DDBlocks.TALL_BYG_JACARANDA_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_LAMENT_DOOR = ITEMS.register(DDNames.TALL_BYG_LAMENT, () -> new TallDoorItem(DDBlocks.TALL_BYG_LAMENT_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_MAHOGANY_DOOR = ITEMS.register(DDNames.TALL_BYG_MAHOGANY, () -> new TallDoorItem(DDBlocks.TALL_BYG_MAHOGANY_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_MAPLE_DOOR = ITEMS.register(DDNames.TALL_BYG_MAPLE, () -> new TallDoorItem(DDBlocks.TALL_BYG_MAPLE_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_NIGHTSHADE_DOOR = ITEMS.register(DDNames.TALL_BYG_NIGHTSHADE, () -> new TallDoorItem(DDBlocks.TALL_BYG_NIGHTSHADE_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_PALM_DOOR = ITEMS.register(DDNames.TALL_BYG_PALM, () -> new TallDoorItem(DDBlocks.TALL_BYG_PALM_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_PINE_DOOR = ITEMS.register(DDNames.TALL_BYG_PINE, () -> new TallDoorItem(DDBlocks.TALL_BYG_PINE_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_RAINBOW_EUCALYPTUS_DOOR = ITEMS.register(DDNames.TALL_BYG_RAINBOW_EUCALYPTUS, () -> new TallDoorItem(DDBlocks.TALL_BYG_RAINBOW_EUCALYPTUS_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_REDWOOD_DOOR = ITEMS.register(DDNames.TALL_BYG_REDWOOD, () -> new TallDoorItem(DDBlocks.TALL_BYG_REDWOOD_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_SKYRIS_DOOR = ITEMS.register(DDNames.TALL_BYG_SKYRIS, () -> new TallDoorItem(DDBlocks.TALL_BYG_SKYRIS_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_SOUL_SHROOM_DOOR = ITEMS.register(DDNames.TALL_BYG_SOUL_SHROOM, () -> new TallDoorItem(DDBlocks.TALL_BYG_SOUL_SHROOM_DOOR.get(), addIfItemIsAvailable(new ResourceLocation("byg", "soul_shroom_door"), conditionalTabProperties("byg"))));
    public static final RegistryObject<Item> TALL_BYG_SYTHIAN_DOOR = ITEMS.register(DDNames.TALL_BYG_SYTHIAN, () -> new TallDoorItem(DDBlocks.TALL_BYG_SYTHIAN_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_WHITE_MANGROVE_DOOR = ITEMS.register(DDNames.TALL_BYG_WHITE_MANGROVE, () -> new TallDoorItem(DDBlocks.TALL_BYG_WHITE_MANGROVE_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_WILLOW_DOOR = ITEMS.register(DDNames.TALL_BYG_WILLOW, () -> new TallDoorItem(DDBlocks.TALL_BYG_WILLOW_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_WITCH_HAZEL_DOOR = ITEMS.register(DDNames.TALL_BYG_WITCH_HAZEL, () -> new TallDoorItem(DDBlocks.TALL_BYG_WITCH_HAZEL_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_ZELKOVA_DOOR = ITEMS.register(DDNames.TALL_BYG_ZELKOVA, () -> new TallDoorItem(DDBlocks.TALL_BYG_ZELKOVA_DOOR.get(), conditionalTabProperties("byg")));

    // Prehistoric Fauna
    public static final RegistryObject<Item> TALL_ARAUCARIA_DOOR = ITEMS.register(DDNames.TALL_ARAUCARIA, () -> new TallDoorItem(DDBlocks.TALL_ARAUCARIA_DOOR.get(), conditionalTabProperties("prehistoricfauna")));
    public static final RegistryObject<Item> TALL_HEIDIPHYLLUM_DOOR = ITEMS.register(DDNames.TALL_HEIDIPHYLLUM, () -> new TallDoorItem(DDBlocks.TALL_HEIDIPHYLLUM_DOOR.get(), conditionalTabProperties("prehistoricfauna")));
    public static final RegistryObject<Item> TALL_LIRIODENDRITES_DOOR = ITEMS.register(DDNames.TALL_LIRIODENDRITES, () -> new TallDoorItem(DDBlocks.TALL_LIRIODENDRITES_DOOR.get(), conditionalTabProperties("prehistoricfauna")));
    public static final RegistryObject<Item> TALL_METASEQUOIA_DOOR = ITEMS.register(DDNames.TALL_METASEQUOIA, () -> new TallDoorItem(DDBlocks.TALL_METASEQUOIA_DOOR.get(), conditionalTabProperties("prehistoricfauna")));
    public static final RegistryObject<Item> TALL_PROTOJUNIPEROXYLON_DOOR = ITEMS.register(DDNames.TALL_PROTOJUNIPEROXYLON, () -> new TallDoorItem(DDBlocks.TALL_PROTOJUNIPEROXYLON_DOOR.get(), conditionalTabProperties("prehistoricfauna")));
    public static final RegistryObject<Item> TALL_PROTOPICEOXYLON_DOOR = ITEMS.register(DDNames.TALL_PROTOPICEOXYLON, () -> new TallDoorItem(DDBlocks.TALL_PROTOPICEOXYLON_DOOR.get(), conditionalTabProperties("prehistoricfauna")));
    public static final RegistryObject<Item> TALL_ZAMITES_DOOR = ITEMS.register(DDNames.TALL_ZAMITES, () -> new TallDoorItem(DDBlocks.TALL_ZAMITES_DOOR.get(), conditionalTabProperties("prehistoricfauna")));

    // Twilight Forest
    public static final RegistryObject<Item> TALL_CANOPY_DOOR = ITEMS.register(DDNames.TALL_CANOPY, () -> new TallDoorItem(DDBlocks.TALL_CANOPY_DOOR.get(), conditionalTabProperties("twilightforest")));
    public static final RegistryObject<Item> TALL_DARKWOOD_DOOR = ITEMS.register(DDNames.TALL_DARKWOOD, () -> new TallDoorItem(DDBlocks.TALL_DARKWOOD_DOOR.get(), conditionalTabProperties("twilightforest")));
    public static final RegistryObject<Item> TALL_TWILIGHT_MANGROVE_DOOR = ITEMS.register(DDNames.TALL_TWILIGHT_MANGROVE, () -> new TallDoorItem(DDBlocks.TALL_TWILIGHT_MANGROVE_DOOR.get(), conditionalTabProperties("twilightforest")));
    public static final RegistryObject<Item> TALL_MINEWOOD_DOOR = ITEMS.register(DDNames.TALL_MINEWOOD, () -> new TallDoorItem(DDBlocks.TALL_MINEWOOD_DOOR.get(), conditionalTabProperties("twilightforest")));
    public static final RegistryObject<Item> TALL_SORTINGWOOD_DOOR = ITEMS.register(DDNames.TALL_SORTINGWOOD, () -> new TallDoorItem(DDBlocks.TALL_SORTINGWOOD_DOOR.get(), conditionalTabProperties("twilightforest")));
    public static final RegistryObject<Item> TALL_TIMEWOOD_DOOR = ITEMS.register(DDNames.TALL_TIMEWOOD, () -> new TallDoorItem(DDBlocks.TALL_TIMEWOOD_DOOR.get(), conditionalTabProperties("twilightforest")));
    public static final RegistryObject<Item> TALL_TRANSWOOD_DOOR = ITEMS.register(DDNames.TALL_TRANSWOOD, () -> new TallDoorItem(DDBlocks.TALL_TRANSWOOD_DOOR.get(), conditionalTabProperties("twilightforest")));
    public static final RegistryObject<Item> TALL_TWILIGHT_OAK_DOOR = ITEMS.register(DDNames.TALL_TWILIGHT_OAK, () -> new TallDoorItem(DDBlocks.TALL_TWILIGHT_OAK_DOOR.get(), conditionalTabProperties("twilightforest")));

    public static final RegistryObject<Item> TALL_TOWERWOOD_DOOR = ITEMS.register(DDNames.TALL_TOWERWOOD, () -> new TallDoorItem(DDBlocks.TALL_TOWERWOOD_DOOR.get(), conditionalTabProperties("tflostblocks")));

    // The Abnormals Mods
    public static final RegistryObject<Item> TALL_ASPEN_DOOR = ITEMS.register(DDNames.TALL_ASPEN, () -> new TallDoorItem(DDBlocks.TALL_ASPEN_DOOR.get(), conditionalTabProperties("atmospheric")));
    public static final RegistryObject<Item> TALL_GRIMWOOD_DOOR = ITEMS.register(DDNames.TALL_GRIMWOOD, () -> new TallDoorItem(DDBlocks.TALL_GRIMWOOD_DOOR.get(), conditionalTabProperties("atmospheric")));
    public static final RegistryObject<Item> TALL_KOUSA_DOOR = ITEMS.register(DDNames.TALL_KOUSA, () -> new TallDoorItem(DDBlocks.TALL_KOUSA_DOOR.get(), conditionalTabProperties("atmospheric")));
    public static final RegistryObject<Item> TALL_MORADO_DOOR = ITEMS.register(DDNames.TALL_MORADO, () -> new TallDoorItem(DDBlocks.TALL_MORADO_DOOR.get(), conditionalTabProperties("atmospheric")));
    public static final RegistryObject<Item> TALL_ROSEWOOD_DOOR = ITEMS.register(DDNames.TALL_ROSEWOOD, () -> new TallDoorItem(DDBlocks.TALL_ROSEWOOD_DOOR.get(), conditionalTabProperties("atmospheric")));
    public static final RegistryObject<Item> TALL_YUCCA_DOOR = ITEMS.register(DDNames.TALL_YUCCA, () -> new TallDoorItem(DDBlocks.TALL_YUCCA_DOOR.get(), conditionalTabProperties("atmospheric")));
    
    public static final RegistryObject<Item> TALL_MAPLE_DOOR = ITEMS.register(DDNames.TALL_MAPLE, () -> new TallDoorItem(DDBlocks.TALL_MAPLE_DOOR.get(), conditionalTabProperties("autumnity")));

    public static final RegistryObject<Item> TALL_BAMBOO_DOOR = ITEMS.register(DDNames.TALL_BAMBOO, () -> new TallDoorItem(DDBlocks.TALL_BAMBOO_DOOR.get(), conditionalTabProperties("bamboo_blocks")));

    public static final RegistryObject<Item> TALL_HONEYCOMB_DOOR = ITEMS.register(DDNames.TALL_HONEYCOMB, () -> new TallDoorItem(DDBlocks.TALL_HONEYCOMB_DOOR.get(), conditionalTabProperties("buzzier_bees")));

    public static final RegistryObject<Item> TALL_AZALEA_DOOR = ITEMS.register(DDNames.TALL_AZALEA, () -> new TallDoorItem(DDBlocks.TALL_AZALEA_DOOR.get(), conditionalTabProperties("caverns_and_chasms")));

    public static final RegistryObject<Item> TALL_POISE_DOOR = ITEMS.register(DDNames.TALL_POISE, () -> new TallDoorItem(DDBlocks.TALL_POISE_DOOR.get(), conditionalTabProperties("endergetic")));

    public static final RegistryObject<Item> TALL_CHERRY_DOOR = ITEMS.register(DDNames.TALL_CHERRY, () -> new TallDoorItem(DDBlocks.TALL_CHERRY_DOOR.get(), conditionalTabProperties("environmental")));
    public static final RegistryObject<Item> TALL_WILLOW_DOOR = ITEMS.register(DDNames.TALL_WILLOW, () -> new TallDoorItem(DDBlocks.TALL_WILLOW_DOOR.get(), conditionalTabProperties("environmental")));
    public static final RegistryObject<Item> TALL_WISTERIA_DOOR = ITEMS.register(DDNames.TALL_WISTERIA, () -> new TallDoorItem(DDBlocks.TALL_WISTERIA_DOOR.get(), conditionalTabProperties("environmental")));

    public static final RegistryObject<Item> TALL_DRIFTWOOD_DOOR = ITEMS.register(DDNames.TALL_DRIFTWOOD, () -> new TallDoorItem(DDBlocks.TALL_DRIFTWOOD_DOOR.get(), conditionalTabProperties("upgrade_aquatic")));
    public static final RegistryObject<Item> TALL_RIVER_DOOR = ITEMS.register(DDNames.TALL_RIVER, () -> new TallDoorItem(DDBlocks.TALL_RIVER_DOOR.get(), conditionalTabProperties("upgrade_aquatic")));
    public static final RegistryObject<Item> TALL_GLASS_DOOR = ITEMS.register(DDNames.TALL_GLASS, () -> new TallDoorItem(DDBlocks.TALL_GLASS_DOOR.get(), conditionalTabProperties("upgrade_aquatic")));
    public static final RegistryObject<Item> TALL_TOOTH_DOOR = ITEMS.register(DDNames.TALL_TOOTH, () -> new TallDoorItem(DDBlocks.TALL_TOOTH_DOOR.get(), conditionalTabProperties("upgrade_aquatic")));

    // Team Aurora Mods
    public static final RegistryObject<Item> TALL_JACARANDA_DOOR = ITEMS.register(DDNames.TALL_JACARANDA, () -> new TallDoorItem(DDBlocks.TALL_JACARANDA_DOOR.get(), conditionalTabProperties("abundance")));
    public static final RegistryObject<Item> TALL_REDBUD_DOOR = ITEMS.register(DDNames.TALL_REDBUD, () -> new TallDoorItem(DDBlocks.TALL_REDBUD_DOOR.get(), conditionalTabProperties("abundance")));

    public static final RegistryObject<Item> TALL_CYPRESS_DOOR = ITEMS.register(DDNames.TALL_CYPRESS, () -> new TallDoorItem(DDBlocks.TALL_CYPRESS_DOOR.get(), conditionalTabProperties("bayou_blues")));

    public static final RegistryObject<Item> TALL_BROWN_MUSHROOM_DOOR = ITEMS.register(DDNames.TALL_BROWN_MUSHROOM, () -> new TallDoorItem(DDBlocks.TALL_BROWN_MUSHROOM_DOOR.get(), conditionalTabProperties("enhanced_mushrooms")));
    public static final RegistryObject<Item> TALL_RED_MUSHROOM_DOOR = ITEMS.register(DDNames.TALL_RED_MUSHROOM, () -> new TallDoorItem(DDBlocks.TALL_RED_MUSHROOM_DOOR.get(), conditionalTabProperties("enhanced_mushrooms")));
    public static final RegistryObject<Item> TALL_GLOWSHROOM_DOOR = ITEMS.register(DDNames.TALL_GLOWSHROOM, () -> new TallDoorItem(DDBlocks.TALL_GLOWSHROOM_DOOR.get(), conditionalTabProperties("enhanced_mushrooms")));

    // Architects Palette
    public static final RegistryObject<Item> TALL_TWISTED_DOOR = ITEMS.register(DDNames.TALL_TWISTED, () -> new TallDoorItem(DDBlocks.TALL_TWISTED_DOOR.get(), conditionalTabProperties("architects_palette")));
    
    // Blocks+
    public static final RegistryObject<Item> TALL_BP_BAMBOO_DOOR = ITEMS.register(DDNames.TALL_BP_BAMBOO, () -> new TallDoorItem(DDBlocks.TALL_BP_BAMBOO_DOOR.get(), conditionalTabProperties("blocksplus")));
    public static final RegistryObject<Item> TALL_BP_MUSHROOM_DOOR = ITEMS.register(DDNames.TALL_BP_MUSHROOM, () -> new TallDoorItem(DDBlocks.TALL_BP_MUSHROOM_DOOR.get(), conditionalTabProperties("blocksplus")));
    public static final RegistryObject<Item> TALL_BP_COPPER_DOOR = ITEMS.register(DDNames.TALL_BP_COPPER, () -> new TallDoorItem(DDBlocks.TALL_BP_COPPER_DOOR.get(), conditionalTabProperties("blocksplus")));
    public static final RegistryObject<Item> TALL_BP_GOLDEN_DOOR = ITEMS.register(DDNames.TALL_BP_GOLDEN, () -> new TallDoorItem(DDBlocks.TALL_BP_GOLDEN_DOOR.get(), conditionalTabProperties("blocksplus")));
    public static final RegistryObject<Item> TALL_BP_DIAMOND_DOOR = ITEMS.register(DDNames.TALL_BP_DIAMOND, () -> new TallDoorItem(DDBlocks.TALL_BP_DIAMOND_DOOR.get(), conditionalTabProperties("blocksplus")));
    public static final RegistryObject<Item> TALL_BP_EMERALD_DOOR = ITEMS.register(DDNames.TALL_BP_EMERALD, () -> new TallDoorItem(DDBlocks.TALL_BP_EMERALD_DOOR.get(), conditionalTabProperties("blocksplus")));
    public static final RegistryObject<Item> TALL_BP_NETHERITE_DOOR = ITEMS.register(DDNames.TALL_BP_NETHERITE, () -> new TallDoorItem(DDBlocks.TALL_BP_NETHERITE_DOOR.get(), conditionalTabProperties("blocksplus").fireResistant()));
    
    // The Ceilands
    public static final RegistryObject<Item> TALL_CEILTRUNK_DOOR = ITEMS.register(DDNames.TALL_CEILTRUNK, () -> new TallDoorItem(DDBlocks.TALL_CEILTRUNK_DOOR.get(), conditionalTabProperties("ceilands")));
    public static final RegistryObject<Item> TALL_LUZAWOOD_DOOR = ITEMS.register(DDNames.TALL_LUZAWOOD, () -> new TallDoorItem(DDBlocks.TALL_LUZAWOOD_DOOR.get(), conditionalTabProperties("ceilands")));
    
    // Copper Overhaul
    public static final RegistryObject<Item> TALL_CO_COPPER_DOOR = ITEMS.register(DDNames.TALL_CO_COPPER, () -> new TallDoorItem(DDBlocks.TALL_CO_COPPER_DOOR.get(), conditionalTabProperties("copperoverhaul")));
    public static final RegistryObject<Item> TALL_CO_EXPOSED_COPPER_DOOR = ITEMS.register(DDNames.TALL_CO_EXPOSED_COPPER, () -> new TallDoorItem(DDBlocks.TALL_CO_EXPOSED_COPPER_DOOR.get(), conditionalTabProperties("copperoverhaul")));
    public static final RegistryObject<Item> TALL_CO_WEATHERED_COPPER_DOOR = ITEMS.register(DDNames.TALL_CO_WEATHERED_COPPER, () -> new TallDoorItem(DDBlocks.TALL_CO_WEATHERED_COPPER_DOOR.get(), conditionalTabProperties("copperoverhaul")));
    public static final RegistryObject<Item> TALL_CO_OXIDIZED_COPPER_DOOR = ITEMS.register(DDNames.TALL_CO_OXIDIZED_COPPER, () -> new TallDoorItem(DDBlocks.TALL_CO_OXIDIZED_COPPER_DOOR.get(), conditionalTabProperties("copperoverhaul")));
    
    // Create: Alloyed
    public static final RegistryObject<Item> TALL_STEEL_DOOR = ITEMS.register(DDNames.TALL_STEEL, () -> new TallDoorItem(DDBlocks.TALL_STEEL_DOOR.get(), conditionalTabProperties("alloyed")));
    public static final RegistryObject<Item> TALL_LOCKED_STEEL_DOOR = ITEMS.register(DDNames.TALL_LOCKED_STEEL, () -> new TallDoorItem(DDBlocks.TALL_LOCKED_STEEL_DOOR.get(), conditionalTabProperties("alloyed")));
    
    // Create: Deco
    public static final RegistryObject<Item> TALL_ANDESITE_DOOR = ITEMS.register(DDNames.TALL_ANDESITE, () -> new TallDoorItem(DDBlocks.TALL_ANDESITE_DOOR.get(), conditionalTabProperties("createdeco")));
    public static final RegistryObject<Item> TALL_BRASS_DOOR = ITEMS.register(DDNames.TALL_BRASS, () -> new TallDoorItem(DDBlocks.TALL_BRASS_DOOR.get(), conditionalTabProperties("createdeco")));
    public static final RegistryObject<Item> TALL_COPPER_DOOR = ITEMS.register(DDNames.TALL_COPPER, () -> new TallDoorItem(DDBlocks.TALL_COPPER_DOOR.get(), conditionalTabProperties("createdeco")));
    public static final RegistryObject<Item> TALL_ZINC_DOOR = ITEMS.register(DDNames.TALL_ZINC, () -> new TallDoorItem(DDBlocks.TALL_ZINC_DOOR.get(), conditionalTabProperties("createdeco")));
    public static final RegistryObject<Item> TALL_LOCKED_ANDESITE_DOOR = ITEMS.register(DDNames.TALL_LOCKED_ANDESITE, () -> new TallDoorItem(DDBlocks.TALL_LOCKED_ANDESITE_DOOR.get(), conditionalTabProperties("createdeco")));
    public static final RegistryObject<Item> TALL_LOCKED_BRASS_DOOR = ITEMS.register(DDNames.TALL_LOCKED_BRASS, () -> new TallDoorItem(DDBlocks.TALL_LOCKED_BRASS_DOOR.get(), conditionalTabProperties("createdeco")));
    public static final RegistryObject<Item> TALL_LOCKED_COPPER_DOOR = ITEMS.register(DDNames.TALL_LOCKED_COPPER, () -> new TallDoorItem(DDBlocks.TALL_LOCKED_COPPER_DOOR.get(), conditionalTabProperties("createdeco")));
    public static final RegistryObject<Item> TALL_LOCKED_ZINC_DOOR = ITEMS.register(DDNames.TALL_LOCKED_ZINC, () -> new TallDoorItem(DDBlocks.TALL_LOCKED_ZINC_DOOR.get(), conditionalTabProperties("createdeco")));

    // Darker Depths
    public static final RegistryObject<Item> TALL_PETRIFIED_DOOR = ITEMS.register(DDNames.TALL_PETRIFIED, () -> new TallDoorItem(DDBlocks.TALL_PETRIFIED_DOOR.get(), conditionalTabProperties("darkerdepths")));

    // Dustrial Decor
    public static final RegistryObject<Item> TALL_CARDBOARD_DOOR = ITEMS.register(DDNames.TALL_CARDBOARD, () -> new TallDoorItem(DDBlocks.TALL_CARDBOARD_DOOR.get(), conditionalTabProperties("dustrial_decor")));
    public static final RegistryObject<Item> TALL_CHAIN_DOOR = ITEMS.register(DDNames.TALL_CHAIN, () -> new TallDoorItem(DDBlocks.TALL_CHAIN_DOOR.get(), conditionalTabProperties("dustrial_decor")));
    public static final RegistryObject<Item> TALL_INDUSTRIAL_IRON_DOOR = ITEMS.register(DDNames.TALL_INDUSTRIAL_IRON, () -> new TallDoorItem(DDBlocks.TALL_INDUSTRIAL_IRON_DOOR.get(), conditionalTabProperties("dustrial_decor")));
    public static final RegistryObject<Item> TALL_IRON_BAR_DOOR = ITEMS.register(DDNames.TALL_IRON_BAR, () -> new TallDoorItem(DDBlocks.TALL_IRON_BAR_DOOR.get(), conditionalTabProperties("dustrial_decor")));
    public static final RegistryObject<Item> TALL_PADDED_DOOR = ITEMS.register(DDNames.TALL_PADDED, () -> new TallDoorItem(DDBlocks.TALL_PADDED_DOOR.get(), conditionalTabProperties("dustrial_decor")));
    public static final RegistryObject<Item> TALL_RUSTY_IRON_DOOR = ITEMS.register(DDNames.TALL_RUSTY_IRON, () -> new TallDoorItem(DDBlocks.TALL_RUSTY_IRON_DOOR.get(), conditionalTabProperties("dustrial_decor")));
    public static final RegistryObject<Item> TALL_RUSTY_SHEET_METAL_DOOR = ITEMS.register(DDNames.TALL_RUSTY_SHEET_METAL, () -> new TallDoorItem(DDBlocks.TALL_RUSTY_SHEET_METAL_DOOR.get(), conditionalTabProperties("dustrial_decor")));
    public static final RegistryObject<Item> TALL_SHEET_METAL_DOOR = ITEMS.register(DDNames.TALL_SHEET_METAL, () -> new TallDoorItem(DDBlocks.TALL_SHEET_METAL_DOOR.get(), conditionalTabProperties("dustrial_decor")));
    
    // Ecologics
    public static final RegistryObject<Item> TALL_ECO_AZALEA_DOOR = ITEMS.register(DDNames.TALL_ECO_AZALEA, () -> new TallDoorItem(DDBlocks.TALL_ECO_AZALEA_DOOR.get(), conditionalTabProperties("ecologics")));
    public static final RegistryObject<Item> TALL_ECO_FLOWERING_AZALEA_DOOR = ITEMS.register(DDNames.TALL_ECO_FLOWERING_AZALEA, () -> new TallDoorItem(DDBlocks.TALL_ECO_FLOWERING_AZALEA_DOOR.get(), conditionalTabProperties("ecologics")));
    public static final RegistryObject<Item> TALL_ECO_COCONUT_DOOR = ITEMS.register(DDNames.TALL_ECO_COCONUT, () -> new TallDoorItem(DDBlocks.TALL_ECO_COCONUT_DOOR.get(), conditionalTabProperties("ecologics")));
    public static final RegistryObject<Item> TALL_ECO_WALNUT_DOOR = ITEMS.register(DDNames.TALL_ECO_WALNUT, () -> new TallDoorItem(DDBlocks.TALL_ECO_WALNUT_DOOR.get(), conditionalTabProperties("ecologics")));
    
    // End's Phantasm
    public static final RegistryObject<Item> TALL_EBONY_DOOR = ITEMS.register(DDNames.TALL_EBONY, () -> new TallDoorItem(DDBlocks.TALL_EBONY_DOOR.get(), conditionalTabProperties("phantasm")));
    public static final RegistryObject<Item> TALL_PREAM_DOOR = ITEMS.register(DDNames.TALL_PREAM, () -> new TallDoorItem(DDBlocks.TALL_PREAM_DOOR.get(), conditionalTabProperties("phantasm")));
    
    // Enlightened End
    public static final RegistryObject<Item> TALL_CERULEAN_DOOR = ITEMS.register(DDNames.TALL_CERULEAN, () -> new TallDoorItem(DDBlocks.TALL_CERULEAN_DOOR.get(), conditionalTabProperties("nourished_end")));
    public static final RegistryObject<Item> TALL_SELDGE_DOOR = ITEMS.register(DDNames.TALL_SELDGE, () -> new TallDoorItem(DDBlocks.TALL_SELDGE_DOOR.get(), conditionalTabProperties("nourished_end")));
    public static final RegistryObject<Item> TALL_STALK_DOOR = ITEMS.register(DDNames.TALL_STALK, () -> new TallDoorItem(DDBlocks.TALL_STALK_DOOR.get(), addIfItemIsAvailable(new ResourceLocation("nourished_end", "stalk_door"), conditionalTabProperties("nourished_end"))));
    public static final RegistryObject<Item> TALL_VERDANT_DOOR = ITEMS.register(DDNames.TALL_VERDANT, () -> new TallDoorItem(DDBlocks.TALL_VERDANT_DOOR.get(), conditionalTabProperties("nourished_end")));
    
    // Habitat
    public static final RegistryObject<Item> TALL_FAIRY_RING_MUSHROOM_DOOR = ITEMS.register(DDNames.TALL_FAIRY_RING_MUSHROOM, () -> new TallDoorItem(DDBlocks.TALL_FAIRY_RING_MUSHROOM_DOOR.get(), addIfItemIsAvailable(new ResourceLocation("habitat", "fairy_ring_mushroom_door"), conditionalTabProperties("habitat"))));
    
    // Nether's Exoticism
    public static final RegistryObject<Item> TALL_JABOTICABA_DOOR = ITEMS.register(DDNames.TALL_JABOTICABA, () -> new TallDoorItem(DDBlocks.TALL_JABOTICABA_DOOR.get(), conditionalTabProperties("nethers_exoticism")));
    public static final RegistryObject<Item> TALL_RAMBOUTAN_DOOR = ITEMS.register(DDNames.TALL_RAMBOUTAN, () -> new TallDoorItem(DDBlocks.TALL_RAMBOUTAN_DOOR.get(), conditionalTabProperties("nethers_exoticism")));    
    
    // Outer End
    public static final RegistryObject<Item> TALL_AZURE_DOOR = ITEMS.register(DDNames.TALL_AZURE, () -> new TallDoorItem(DDBlocks.TALL_AZURE_DOOR.get(), conditionalTabProperties("outer_end")));
    
    // Pokecube
    public static final RegistryObject<Item> TALL_POKECUBE_ENIGMA_DOOR = ITEMS.register(DDNames.TALL_POKECUBE_ENIGMA, () -> new TallDoorItem(DDBlocks.TALL_POKECUBE_ENIGMA_DOOR.get(), conditionalTabProperties("pokecube")));
    public static final RegistryObject<Item> TALL_POKECUBE_LEPPA_DOOR = ITEMS.register(DDNames.TALL_POKECUBE_LEPPA, () -> new TallDoorItem(DDBlocks.TALL_POKECUBE_LEPPA_DOOR.get(), conditionalTabProperties("pokecube")));
    public static final RegistryObject<Item> TALL_POKECUBE_NANAB_DOOR = ITEMS.register(DDNames.TALL_POKECUBE_NANAB, () -> new TallDoorItem(DDBlocks.TALL_POKECUBE_NANAB_DOOR.get(), conditionalTabProperties("pokecube")));
    public static final RegistryObject<Item> TALL_POKECUBE_ORAN_DOOR = ITEMS.register(DDNames.TALL_POKECUBE_ORAN, () -> new TallDoorItem(DDBlocks.TALL_POKECUBE_ORAN_DOOR.get(), conditionalTabProperties("pokecube")));
    public static final RegistryObject<Item> TALL_POKECUBE_PECHA_DOOR = ITEMS.register(DDNames.TALL_POKECUBE_PECHA, () -> new TallDoorItem(DDBlocks.TALL_POKECUBE_PECHA_DOOR.get(), conditionalTabProperties("pokecube")));
    public static final RegistryObject<Item> TALL_POKECUBE_SITRUS_DOOR = ITEMS.register(DDNames.TALL_POKECUBE_SITRUS, () -> new TallDoorItem(DDBlocks.TALL_POKECUBE_SITRUS_DOOR.get(), conditionalTabProperties("pokecube")));
    public static final RegistryObject<Item> TALL_POKECUBE_AGED_DOOR = ITEMS.register(DDNames.TALL_POKECUBE_AGED, () -> new TallDoorItem(DDBlocks.TALL_POKECUBE_AGED_DOOR.get(), conditionalTabProperties("pokecube")));
    public static final RegistryObject<Item> TALL_POKECUBE_CONCRETE_DOOR = ITEMS.register(DDNames.TALL_POKECUBE_CONCRETE, () -> new TallDoorItem(DDBlocks.TALL_POKECUBE_CONCRETE_DOOR.get(), conditionalTabProperties("pokecube")));
    public static final RegistryObject<Item> TALL_POKECUBE_CORRUPTED_DOOR = ITEMS.register(DDNames.TALL_POKECUBE_CORRUPTED, () -> new TallDoorItem(DDBlocks.TALL_POKECUBE_CORRUPTED_DOOR.get(), conditionalTabProperties("pokecube")));
    public static final RegistryObject<Item> TALL_POKECUBE_DISTORTIC_DOOR = ITEMS.register(DDNames.TALL_POKECUBE_DISTORTIC, () -> new TallDoorItem(DDBlocks.TALL_POKECUBE_DISTORTIC_DOOR.get(), conditionalTabProperties("pokecube")));
    public static final RegistryObject<Item> TALL_POKECUBE_INVERTED_DOOR = ITEMS.register(DDNames.TALL_POKECUBE_INVERTED, () -> new TallDoorItem(DDBlocks.TALL_POKECUBE_INVERTED_DOOR.get(), conditionalTabProperties("pokecube")));
    public static final RegistryObject<Item> TALL_POKECUBE_MIRAGE_DOOR = ITEMS.register(DDNames.TALL_POKECUBE_MIRAGE, () -> new TallDoorItem(DDBlocks.TALL_POKECUBE_MIRAGE_DOOR.get(), conditionalTabProperties("pokecube")));
    public static final RegistryObject<Item> TALL_POKECUBE_TEMPORAL_DOOR = ITEMS.register(DDNames.TALL_POKECUBE_TEMPORAL, () -> new TallDoorItem(DDBlocks.TALL_POKECUBE_TEMPORAL_DOOR.get(), conditionalTabProperties("pokecube")));
    
    // Premium Wood
    public static final RegistryObject<Item> TALL_PW_MAGIC_DOOR = ITEMS.register(DDNames.TALL_PW_MAGIC, () -> new TallDoorItem(DDBlocks.TALL_PW_MAGIC_DOOR.get(), conditionalTabProperties("premium_wood")));
    public static final RegistryObject<Item> TALL_PW_MAPLE_DOOR = ITEMS.register(DDNames.TALL_PW_MAPLE, () -> new TallDoorItem(DDBlocks.TALL_PW_MAPLE_DOOR.get(), conditionalTabProperties("premium_wood")));
    public static final RegistryObject<Item> TALL_PW_PURPLE_HEART_DOOR = ITEMS.register(DDNames.TALL_PW_PURPLE_HEART, () -> new TallDoorItem(DDBlocks.TALL_PW_PURPLE_HEART_DOOR.get(), conditionalTabProperties("premium_wood")));
    public static final RegistryObject<Item> TALL_PW_SILVERBELL_DOOR = ITEMS.register(DDNames.TALL_PW_SILVERBELL, () -> new TallDoorItem(DDBlocks.TALL_PW_SILVERBELL_DOOR.get(), conditionalTabProperties("premium_wood")));
    public static final RegistryObject<Item> TALL_PW_TIGER_DOOR = ITEMS.register(DDNames.TALL_PW_TIGER, () -> new TallDoorItem(DDBlocks.TALL_PW_TIGER_DOOR.get(), conditionalTabProperties("premium_wood")));
    public static final RegistryObject<Item> TALL_PW_WILLOW_DOOR = ITEMS.register(DDNames.TALL_PW_WILLOW, () -> new TallDoorItem(DDBlocks.TALL_PW_WILLOW_DOOR.get(), conditionalTabProperties("premium_wood")));
    
    // Quark
    public static final RegistryObject<Item> TALL_QUARK_AZALEA_DOOR = ITEMS.register(DDNames.TALL_QUARK_AZALEA, () -> new TallDoorItem(DDBlocks.TALL_QUARK_AZALEA_DOOR.get(), conditionalTabProperties("quark")));
    public static final RegistryObject<Item> TALL_QUARK_BLOSSOM_DOOR = ITEMS.register(DDNames.TALL_QUARK_BLOSSOM, () -> new TallDoorItem(DDBlocks.TALL_QUARK_BLOSSOM_DOOR.get(), conditionalTabProperties("quark")));
    
    // Snowy Spirit
    public static final RegistryObject<Item> TALL_GINGERBREAD_DOOR = ITEMS.register(DDNames.TALL_GINGERBREAD, () -> new TallDoorItem(DDBlocks.TALL_GINGERBREAD_DOOR.get(), conditionalTabProperties("snowyspirit")));
    
    // Supplementaries
    public static final RegistryObject<Item> TALL_GOLD_DOOR = ITEMS.register(DDNames.TALL_GOLD, () -> new TallDoorItem(DDBlocks.TALL_GOLD_DOOR.get(), conditionalTabProperties("supplementaries")));
    public static final RegistryObject<Item> TALL_SILVER_DOOR = ITEMS.register(DDNames.TALL_SILVER, () -> new TallDoorItem(DDBlocks.TALL_SILVER_DOOR.get(), addIfItemIsAvailable(new ResourceLocation("supplementaries", "silver_door"), conditionalTabProperties("supplementaries"))));
    public static final RegistryObject<Item> TALL_LEAD_DOOR = ITEMS.register(DDNames.TALL_LEAD, () -> new TallDoorItem(DDBlocks.TALL_LEAD_DOOR.get(), addIfItemIsAvailable(new ResourceLocation("supplementaries", "lead_door"), conditionalTabProperties("supplementaries"))));
    public static final RegistryObject<Item> TALL_NETHERITE_DOOR = ITEMS.register(DDNames.TALL_NETHERITE, () -> new TallDoorItem(DDBlocks.TALL_NETHERITE_DOOR.get(), conditionalTabProperties("supplementaries").fireResistant()));
    
    // Twigs
    public static final RegistryObject<Item> TALL_TWIGS_BAMBOO_DOOR = ITEMS.register(DDNames.TALL_TWIGS_BAMBOO, () -> new TallDoorItem(DDBlocks.TALL_TWIGS_BAMBOO_DOOR.get(), conditionalTabProperties("twigs")));

    // Undergarden
    public static final RegistryObject<Item> TALL_GRONGLE_DOOR = ITEMS.register(DDNames.TALL_GRONGLE, () -> new TallDoorItem(DDBlocks.TALL_GRONGLE_DOOR.get(), conditionalTabProperties("undergarden")));
    public static final RegistryObject<Item> TALL_SMOGSTEM_DOOR = ITEMS.register(DDNames.TALL_SMOGSTEM, () -> new TallDoorItem(DDBlocks.TALL_SMOGSTEM_DOOR.get(), conditionalTabProperties("undergarden")));
    public static final RegistryObject<Item> TALL_WIGGLEWOOD_DOOR = ITEMS.register(DDNames.TALL_WIGGLEWOOD, () -> new TallDoorItem(DDBlocks.TALL_WIGGLEWOOD_DOOR.get(), conditionalTabProperties("undergarden")));
    
    // Macaw
    public static final RegistryObject<Item> TALL_MACAW_JAIL_DOOR = ITEMS.register(DDNames.TALL_MACAW_JAIL, () -> new TallDoorItem(DDBlocks.TALL_MACAW_JAIL_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_METAL_DOOR = ITEMS.register(DDNames.TALL_MACAW_METAL, () -> new TallDoorItem(DDBlocks.TALL_MACAW_METAL_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_METAL_HOSPITAL_DOOR = ITEMS.register(DDNames.TALL_MACAW_METAL_HOSPITAL, () -> new TallDoorItem(DDBlocks.TALL_MACAW_METAL_HOSPITAL_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_METAL_REINFORCED_DOOR = ITEMS.register(DDNames.TALL_MACAW_METAL_REINFORCED, () -> new TallDoorItem(DDBlocks.TALL_MACAW_METAL_REINFORCED_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_METAL_WARNING_DOOR = ITEMS.register(DDNames.TALL_MACAW_METAL_WARNING, () -> new TallDoorItem(DDBlocks.TALL_MACAW_METAL_WARNING_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_METAL_WINDOWED_DOOR = ITEMS.register(DDNames.TALL_MACAW_METAL_WINDOWED, () -> new TallDoorItem(DDBlocks.TALL_MACAW_METAL_WINDOWED_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));

    public static final RegistryObject<Item> TALL_MACAW_OAK_BARN_DOOR = ITEMS.register(DDNames.TALL_MACAW_OAK_BARN, () -> new TallDoorItem(DDBlocks.TALL_MACAW_OAK_BARN_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_SPRUCE_BARN_DOOR = ITEMS.register(DDNames.TALL_MACAW_SPRUCE_BARN, () -> new TallDoorItem(DDBlocks.TALL_MACAW_SPRUCE_BARN_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_BIRCH_BARN_DOOR = ITEMS.register(DDNames.TALL_MACAW_BIRCH_BARN, () -> new TallDoorItem(DDBlocks.TALL_MACAW_BIRCH_BARN_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_JUNGLE_BARN_DOOR = ITEMS.register(DDNames.TALL_MACAW_JUNGLE_BARN, () -> new TallDoorItem(DDBlocks.TALL_MACAW_JUNGLE_BARN_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_ACACIA_BARN_DOOR = ITEMS.register(DDNames.TALL_MACAW_ACACIA_BARN, () -> new TallDoorItem(DDBlocks.TALL_MACAW_ACACIA_BARN_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_DARK_OAK_BARN_DOOR = ITEMS.register(DDNames.TALL_MACAW_DARK_OAK_BARN, () -> new TallDoorItem(DDBlocks.TALL_MACAW_DARK_OAK_BARN_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_MANGROVE_BARN_DOOR = ITEMS.register(DDNames.TALL_MACAW_MANGROVE_BARN, () -> new TallDoorItem(DDBlocks.TALL_MACAW_MANGROVE_BARN_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_CRIMSON_BARN_DOOR = ITEMS.register(DDNames.TALL_MACAW_CRIMSON_BARN, () -> new TallDoorItem(DDBlocks.TALL_MACAW_CRIMSON_BARN_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_WARPED_BARN_DOOR = ITEMS.register(DDNames.TALL_MACAW_WARPED_BARN, () -> new TallDoorItem(DDBlocks.TALL_MACAW_WARPED_BARN_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));

    public static final RegistryObject<Item> TALL_MACAW_OAK_BARN_GLASS_DOOR = ITEMS.register(DDNames.TALL_MACAW_OAK_BARN_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MACAW_OAK_BARN_GLASS_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_SPRUCE_BARN_GLASS_DOOR = ITEMS.register(DDNames.TALL_MACAW_SPRUCE_BARN_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MACAW_SPRUCE_BARN_GLASS_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_BIRCH_BARN_GLASS_DOOR = ITEMS.register(DDNames.TALL_MACAW_BIRCH_BARN_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MACAW_BIRCH_BARN_GLASS_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_JUNGLE_BARN_GLASS_DOOR = ITEMS.register(DDNames.TALL_MACAW_JUNGLE_BARN_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MACAW_JUNGLE_BARN_GLASS_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_ACACIA_BARN_GLASS_DOOR = ITEMS.register(DDNames.TALL_MACAW_ACACIA_BARN_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MACAW_ACACIA_BARN_GLASS_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_DARK_OAK_BARN_GLASS_DOOR = ITEMS.register(DDNames.TALL_MACAW_DARK_OAK_BARN_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MACAW_DARK_OAK_BARN_GLASS_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_MANGROVE_BARN_GLASS_DOOR = ITEMS.register(DDNames.TALL_MACAW_MANGROVE_BARN_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MACAW_MANGROVE_BARN_GLASS_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_CRIMSON_BARN_GLASS_DOOR = ITEMS.register(DDNames.TALL_MACAW_CRIMSON_BARN_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MACAW_CRIMSON_BARN_GLASS_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_WARPED_BARN_GLASS_DOOR = ITEMS.register(DDNames.TALL_MACAW_WARPED_BARN_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MACAW_WARPED_BARN_GLASS_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));

    public static final RegistryObject<Item> TALL_MACAW_OAK_STABLE_DOOR = ITEMS.register(DDNames.TALL_MACAW_OAK_STABLE, () -> new TallDoorItem(DDBlocks.TALL_MACAW_OAK_STABLE_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_SPRUCE_STABLE_DOOR = ITEMS.register(DDNames.TALL_MACAW_SPRUCE_STABLE, () -> new TallDoorItem(DDBlocks.TALL_MACAW_SPRUCE_STABLE_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_BIRCH_STABLE_DOOR = ITEMS.register(DDNames.TALL_MACAW_BIRCH_STABLE, () -> new TallDoorItem(DDBlocks.TALL_MACAW_BIRCH_STABLE_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_JUNGLE_STABLE_DOOR = ITEMS.register(DDNames.TALL_MACAW_JUNGLE_STABLE, () -> new TallDoorItem(DDBlocks.TALL_MACAW_JUNGLE_STABLE_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_ACACIA_STABLE_DOOR = ITEMS.register(DDNames.TALL_MACAW_ACACIA_STABLE, () -> new TallDoorItem(DDBlocks.TALL_MACAW_ACACIA_STABLE_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_DARK_OAK_STABLE_DOOR = ITEMS.register(DDNames.TALL_MACAW_DARK_OAK_STABLE, () -> new TallDoorItem(DDBlocks.TALL_MACAW_DARK_OAK_STABLE_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_MANGROVE_STABLE_DOOR = ITEMS.register(DDNames.TALL_MACAW_MANGROVE_STABLE, () -> new TallDoorItem(DDBlocks.TALL_MACAW_MANGROVE_STABLE_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_CRIMSON_STABLE_DOOR = ITEMS.register(DDNames.TALL_MACAW_CRIMSON_STABLE, () -> new TallDoorItem(DDBlocks.TALL_MACAW_CRIMSON_STABLE_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_WARPED_STABLE_DOOR = ITEMS.register(DDNames.TALL_MACAW_WARPED_STABLE, () -> new TallDoorItem(DDBlocks.TALL_MACAW_WARPED_STABLE_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));

    public static final RegistryObject<Item> TALL_MACAW_OAK_STABLE_HEAD_DOOR = ITEMS.register(DDNames.TALL_MACAW_OAK_STABLE_HEAD, () -> new TallDoorItem(DDBlocks.TALL_MACAW_OAK_STABLE_HEAD_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_SPRUCE_STABLE_HEAD_DOOR = ITEMS.register(DDNames.TALL_MACAW_SPRUCE_STABLE_HEAD, () -> new TallDoorItem(DDBlocks.TALL_MACAW_SPRUCE_STABLE_HEAD_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_BIRCH_STABLE_HEAD_DOOR = ITEMS.register(DDNames.TALL_MACAW_BIRCH_STABLE_HEAD, () -> new TallDoorItem(DDBlocks.TALL_MACAW_BIRCH_STABLE_HEAD_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_JUNGLE_STABLE_HEAD_DOOR = ITEMS.register(DDNames.TALL_MACAW_JUNGLE_STABLE_HEAD, () -> new TallDoorItem(DDBlocks.TALL_MACAW_JUNGLE_STABLE_HEAD_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_ACACIA_STABLE_HEAD_DOOR = ITEMS.register(DDNames.TALL_MACAW_ACACIA_STABLE_HEAD, () -> new TallDoorItem(DDBlocks.TALL_MACAW_ACACIA_STABLE_HEAD_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_DARK_OAK_STABLE_HEAD_DOOR = ITEMS.register(DDNames.TALL_MACAW_DARK_OAK_STABLE_HEAD, () -> new TallDoorItem(DDBlocks.TALL_MACAW_DARK_OAK_STABLE_HEAD_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_MANGROVE_STABLE_HEAD_DOOR = ITEMS.register(DDNames.TALL_MACAW_MANGROVE_STABLE_HEAD, () -> new TallDoorItem(DDBlocks.TALL_MACAW_MANGROVE_STABLE_HEAD_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_CRIMSON_STABLE_HEAD_DOOR = ITEMS.register(DDNames.TALL_MACAW_CRIMSON_STABLE_HEAD, () -> new TallDoorItem(DDBlocks.TALL_MACAW_CRIMSON_STABLE_HEAD_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_WARPED_STABLE_HEAD_DOOR = ITEMS.register(DDNames.TALL_MACAW_WARPED_STABLE_HEAD, () -> new TallDoorItem(DDBlocks.TALL_MACAW_WARPED_STABLE_HEAD_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));

    public static final RegistryObject<Item> TALL_MACAW_OAK_BARK_GLASS_DOOR = ITEMS.register(DDNames.TALL_MACAW_OAK_BARK_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MACAW_OAK_BARK_GLASS_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_SPRUCE_BARK_GLASS_DOOR = ITEMS.register(DDNames.TALL_MACAW_SPRUCE_BARK_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MACAW_SPRUCE_BARK_GLASS_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_BIRCH_BARK_GLASS_DOOR = ITEMS.register(DDNames.TALL_MACAW_BIRCH_BARK_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MACAW_BIRCH_BARK_GLASS_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_JUNGLE_BARK_GLASS_DOOR = ITEMS.register(DDNames.TALL_MACAW_JUNGLE_BARK_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MACAW_JUNGLE_BARK_GLASS_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_ACACIA_BARK_GLASS_DOOR = ITEMS.register(DDNames.TALL_MACAW_ACACIA_BARK_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MACAW_ACACIA_BARK_GLASS_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_DARK_OAK_BARK_GLASS_DOOR = ITEMS.register(DDNames.TALL_MACAW_DARK_OAK_BARK_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MACAW_DARK_OAK_BARK_GLASS_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_MANGROVE_BARK_GLASS_DOOR = ITEMS.register(DDNames.TALL_MACAW_MANGROVE_BARK_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MACAW_MANGROVE_BARK_GLASS_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_CRIMSON_STEM_GLASS_DOOR = ITEMS.register(DDNames.TALL_MACAW_CRIMSON_STEM_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MACAW_CRIMSON_STEM_GLASS_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_WARPED_STEM_GLASS_DOOR = ITEMS.register(DDNames.TALL_MACAW_WARPED_STEM_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MACAW_WARPED_STEM_GLASS_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));

    public static final RegistryObject<Item> TALL_MACAW_OAK_GLASS_DOOR = ITEMS.register(DDNames.TALL_MACAW_OAK_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MACAW_OAK_GLASS_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_SPRUCE_GLASS_DOOR = ITEMS.register(DDNames.TALL_MACAW_SPRUCE_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MACAW_SPRUCE_GLASS_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_BIRCH_GLASS_DOOR = ITEMS.register(DDNames.TALL_MACAW_BIRCH_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MACAW_BIRCH_GLASS_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_JUNGLE_GLASS_DOOR = ITEMS.register(DDNames.TALL_MACAW_JUNGLE_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MACAW_JUNGLE_GLASS_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_ACACIA_GLASS_DOOR = ITEMS.register(DDNames.TALL_MACAW_ACACIA_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MACAW_ACACIA_GLASS_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_DARK_OAK_GLASS_DOOR = ITEMS.register(DDNames.TALL_MACAW_DARK_OAK_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MACAW_DARK_OAK_GLASS_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_MANGROVE_GLASS_DOOR = ITEMS.register(DDNames.TALL_MACAW_MANGROVE_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MACAW_MANGROVE_GLASS_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_CRIMSON_GLASS_DOOR = ITEMS.register(DDNames.TALL_MACAW_CRIMSON_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MACAW_CRIMSON_GLASS_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_WARPED_GLASS_DOOR = ITEMS.register(DDNames.TALL_MACAW_WARPED_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MACAW_WARPED_GLASS_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    
    public static final RegistryObject<Item> TALL_MACAW_OAK_MODERN_DOOR = ITEMS.register(DDNames.TALL_MACAW_OAK_MODERN, () -> new TallDoorItem(DDBlocks.TALL_MACAW_OAK_MODERN_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_SPRUCE_MODERN_DOOR = ITEMS.register(DDNames.TALL_MACAW_SPRUCE_MODERN, () -> new TallDoorItem(DDBlocks.TALL_MACAW_SPRUCE_MODERN_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_BIRCH_MODERN_DOOR = ITEMS.register(DDNames.TALL_MACAW_BIRCH_MODERN, () -> new TallDoorItem(DDBlocks.TALL_MACAW_BIRCH_MODERN_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_JUNGLE_MODERN_DOOR = ITEMS.register(DDNames.TALL_MACAW_JUNGLE_MODERN, () -> new TallDoorItem(DDBlocks.TALL_MACAW_JUNGLE_MODERN_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_ACACIA_MODERN_DOOR = ITEMS.register(DDNames.TALL_MACAW_ACACIA_MODERN, () -> new TallDoorItem(DDBlocks.TALL_MACAW_ACACIA_MODERN_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_DARK_OAK_MODERN_DOOR = ITEMS.register(DDNames.TALL_MACAW_DARK_OAK_MODERN, () -> new TallDoorItem(DDBlocks.TALL_MACAW_DARK_OAK_MODERN_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_MANGROVE_MODERN_DOOR = ITEMS.register(DDNames.TALL_MACAW_MANGROVE_MODERN, () -> new TallDoorItem(DDBlocks.TALL_MACAW_MANGROVE_MODERN_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_CRIMSON_MODERN_DOOR = ITEMS.register(DDNames.TALL_MACAW_CRIMSON_MODERN, () -> new TallDoorItem(DDBlocks.TALL_MACAW_CRIMSON_MODERN_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_WARPED_MODERN_DOOR = ITEMS.register(DDNames.TALL_MACAW_WARPED_MODERN, () -> new TallDoorItem(DDBlocks.TALL_MACAW_WARPED_MODERN_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));

    public static final RegistryObject<Item> TALL_MACAW_OAK_JAPANESE_DOOR = ITEMS.register(DDNames.TALL_MACAW_OAK_JAPANESE, () -> new TallDoorItem(DDBlocks.TALL_MACAW_OAK_JAPANESE_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_SPRUCE_JAPANESE_DOOR = ITEMS.register(DDNames.TALL_MACAW_SPRUCE_JAPANESE, () -> new TallDoorItem(DDBlocks.TALL_MACAW_SPRUCE_JAPANESE_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_BIRCH_JAPANESE_DOOR = ITEMS.register(DDNames.TALL_MACAW_BIRCH_JAPANESE, () -> new TallDoorItem(DDBlocks.TALL_MACAW_BIRCH_JAPANESE_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_JUNGLE_JAPANESE_DOOR = ITEMS.register(DDNames.TALL_MACAW_JUNGLE_JAPANESE, () -> new TallDoorItem(DDBlocks.TALL_MACAW_JUNGLE_JAPANESE_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_ACACIA_JAPANESE_DOOR = ITEMS.register(DDNames.TALL_MACAW_ACACIA_JAPANESE, () -> new TallDoorItem(DDBlocks.TALL_MACAW_ACACIA_JAPANESE_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_DARK_OAK_JAPANESE_DOOR = ITEMS.register(DDNames.TALL_MACAW_DARK_OAK_JAPANESE, () -> new TallDoorItem(DDBlocks.TALL_MACAW_DARK_OAK_JAPANESE_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_MANGROVE_JAPANESE_DOOR = ITEMS.register(DDNames.TALL_MACAW_MANGROVE_JAPANESE, () -> new TallDoorItem(DDBlocks.TALL_MACAW_MANGROVE_JAPANESE_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_CRIMSON_JAPANESE_DOOR = ITEMS.register(DDNames.TALL_MACAW_CRIMSON_JAPANESE, () -> new TallDoorItem(DDBlocks.TALL_MACAW_CRIMSON_JAPANESE_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_WARPED_JAPANESE_DOOR = ITEMS.register(DDNames.TALL_MACAW_WARPED_JAPANESE, () -> new TallDoorItem(DDBlocks.TALL_MACAW_WARPED_JAPANESE_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));

    public static final RegistryObject<Item> TALL_MACAW_OAK_JAPANESE2_DOOR = ITEMS.register(DDNames.TALL_MACAW_OAK_JAPANESE2, () -> new TallDoorItem(DDBlocks.TALL_MACAW_OAK_JAPANESE2_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_SPRUCE_JAPANESE2_DOOR = ITEMS.register(DDNames.TALL_MACAW_SPRUCE_JAPANESE2, () -> new TallDoorItem(DDBlocks.TALL_MACAW_SPRUCE_JAPANESE2_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_BIRCH_JAPANESE2_DOOR = ITEMS.register(DDNames.TALL_MACAW_BIRCH_JAPANESE2, () -> new TallDoorItem(DDBlocks.TALL_MACAW_BIRCH_JAPANESE2_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_JUNGLE_JAPANESE2_DOOR = ITEMS.register(DDNames.TALL_MACAW_JUNGLE_JAPANESE2, () -> new TallDoorItem(DDBlocks.TALL_MACAW_JUNGLE_JAPANESE2_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_ACACIA_JAPANESE2_DOOR = ITEMS.register(DDNames.TALL_MACAW_ACACIA_JAPANESE2, () -> new TallDoorItem(DDBlocks.TALL_MACAW_ACACIA_JAPANESE2_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_DARK_OAK_JAPANESE2_DOOR = ITEMS.register(DDNames.TALL_MACAW_DARK_OAK_JAPANESE2, () -> new TallDoorItem(DDBlocks.TALL_MACAW_DARK_OAK_JAPANESE2_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_MANGROVE_JAPANESE2_DOOR = ITEMS.register(DDNames.TALL_MACAW_MANGROVE_JAPANESE2, () -> new TallDoorItem(DDBlocks.TALL_MACAW_MANGROVE_JAPANESE2_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_CRIMSON_JAPANESE2_DOOR = ITEMS.register(DDNames.TALL_MACAW_CRIMSON_JAPANESE2, () -> new TallDoorItem(DDBlocks.TALL_MACAW_CRIMSON_JAPANESE2_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_WARPED_JAPANESE2_DOOR = ITEMS.register(DDNames.TALL_MACAW_WARPED_JAPANESE2, () -> new TallDoorItem(DDBlocks.TALL_MACAW_WARPED_JAPANESE2_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));

    public static final RegistryObject<Item> TALL_MACAW_SPRUCE_CLASSIC_DOOR = ITEMS.register(DDNames.TALL_MACAW_SPRUCE_CLASSIC, () -> new TallDoorItem(DDBlocks.TALL_MACAW_SPRUCE_CLASSIC_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_BIRCH_CLASSIC_DOOR = ITEMS.register(DDNames.TALL_MACAW_BIRCH_CLASSIC, () -> new TallDoorItem(DDBlocks.TALL_MACAW_BIRCH_CLASSIC_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_JUNGLE_CLASSIC_DOOR = ITEMS.register(DDNames.TALL_MACAW_JUNGLE_CLASSIC, () -> new TallDoorItem(DDBlocks.TALL_MACAW_JUNGLE_CLASSIC_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_ACACIA_CLASSIC_DOOR = ITEMS.register(DDNames.TALL_MACAW_ACACIA_CLASSIC, () -> new TallDoorItem(DDBlocks.TALL_MACAW_ACACIA_CLASSIC_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_DARK_OAK_CLASSIC_DOOR = ITEMS.register(DDNames.TALL_MACAW_DARK_OAK_CLASSIC, () -> new TallDoorItem(DDBlocks.TALL_MACAW_DARK_OAK_CLASSIC_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_MANGROVE_CLASSIC_DOOR = ITEMS.register(DDNames.TALL_MACAW_MANGROVE_CLASSIC, () -> new TallDoorItem(DDBlocks.TALL_MACAW_MANGROVE_CLASSIC_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_CRIMSON_CLASSIC_DOOR = ITEMS.register(DDNames.TALL_MACAW_CRIMSON_CLASSIC, () -> new TallDoorItem(DDBlocks.TALL_MACAW_CRIMSON_CLASSIC_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_WARPED_CLASSIC_DOOR = ITEMS.register(DDNames.TALL_MACAW_WARPED_CLASSIC, () -> new TallDoorItem(DDBlocks.TALL_MACAW_WARPED_CLASSIC_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));

    public static final RegistryObject<Item> TALL_MACAW_OAK_COTTAGE_DOOR = ITEMS.register(DDNames.TALL_MACAW_OAK_COTTAGE, () -> new TallDoorItem(DDBlocks.TALL_MACAW_OAK_COTTAGE_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_BIRCH_COTTAGE_DOOR = ITEMS.register(DDNames.TALL_MACAW_BIRCH_COTTAGE, () -> new TallDoorItem(DDBlocks.TALL_MACAW_BIRCH_COTTAGE_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_JUNGLE_COTTAGE_DOOR = ITEMS.register(DDNames.TALL_MACAW_JUNGLE_COTTAGE, () -> new TallDoorItem(DDBlocks.TALL_MACAW_JUNGLE_COTTAGE_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_ACACIA_COTTAGE_DOOR = ITEMS.register(DDNames.TALL_MACAW_ACACIA_COTTAGE, () -> new TallDoorItem(DDBlocks.TALL_MACAW_ACACIA_COTTAGE_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_DARK_OAK_COTTAGE_DOOR = ITEMS.register(DDNames.TALL_MACAW_DARK_OAK_COTTAGE, () -> new TallDoorItem(DDBlocks.TALL_MACAW_DARK_OAK_COTTAGE_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_MANGROVE_COTTAGE_DOOR = ITEMS.register(DDNames.TALL_MACAW_MANGROVE_COTTAGE, () -> new TallDoorItem(DDBlocks.TALL_MACAW_MANGROVE_COTTAGE_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_CRIMSON_COTTAGE_DOOR = ITEMS.register(DDNames.TALL_MACAW_CRIMSON_COTTAGE, () -> new TallDoorItem(DDBlocks.TALL_MACAW_CRIMSON_COTTAGE_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_WARPED_COTTAGE_DOOR = ITEMS.register(DDNames.TALL_MACAW_WARPED_COTTAGE, () -> new TallDoorItem(DDBlocks.TALL_MACAW_WARPED_COTTAGE_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));

    public static final RegistryObject<Item> TALL_MACAW_OAK_PAPER_DOOR = ITEMS.register(DDNames.TALL_MACAW_OAK_PAPER, () -> new TallDoorItem(DDBlocks.TALL_MACAW_OAK_PAPER_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_SPRUCE_PAPER_DOOR = ITEMS.register(DDNames.TALL_MACAW_SPRUCE_PAPER, () -> new TallDoorItem(DDBlocks.TALL_MACAW_SPRUCE_PAPER_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_JUNGLE_PAPER_DOOR = ITEMS.register(DDNames.TALL_MACAW_JUNGLE_PAPER, () -> new TallDoorItem(DDBlocks.TALL_MACAW_JUNGLE_PAPER_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_ACACIA_PAPER_DOOR = ITEMS.register(DDNames.TALL_MACAW_ACACIA_PAPER, () -> new TallDoorItem(DDBlocks.TALL_MACAW_ACACIA_PAPER_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_DARK_OAK_PAPER_DOOR = ITEMS.register(DDNames.TALL_MACAW_DARK_OAK_PAPER, () -> new TallDoorItem(DDBlocks.TALL_MACAW_DARK_OAK_PAPER_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_MANGROVE_PAPER_DOOR = ITEMS.register(DDNames.TALL_MACAW_MANGROVE_PAPER, () -> new TallDoorItem(DDBlocks.TALL_MACAW_MANGROVE_PAPER_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_CRIMSON_PAPER_DOOR = ITEMS.register(DDNames.TALL_MACAW_CRIMSON_PAPER, () -> new TallDoorItem(DDBlocks.TALL_MACAW_CRIMSON_PAPER_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_WARPED_PAPER_DOOR = ITEMS.register(DDNames.TALL_MACAW_WARPED_PAPER, () -> new TallDoorItem(DDBlocks.TALL_MACAW_WARPED_PAPER_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));

    public static final RegistryObject<Item> TALL_MACAW_OAK_BEACH_DOOR = ITEMS.register(DDNames.TALL_MACAW_OAK_BEACH, () -> new TallDoorItem(DDBlocks.TALL_MACAW_OAK_BEACH_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_SPRUCE_BEACH_DOOR = ITEMS.register(DDNames.TALL_MACAW_SPRUCE_BEACH, () -> new TallDoorItem(DDBlocks.TALL_MACAW_SPRUCE_BEACH_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_BIRCH_BEACH_DOOR = ITEMS.register(DDNames.TALL_MACAW_BIRCH_BEACH, () -> new TallDoorItem(DDBlocks.TALL_MACAW_BIRCH_BEACH_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_ACACIA_BEACH_DOOR = ITEMS.register(DDNames.TALL_MACAW_ACACIA_BEACH, () -> new TallDoorItem(DDBlocks.TALL_MACAW_ACACIA_BEACH_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_DARK_OAK_BEACH_DOOR = ITEMS.register(DDNames.TALL_MACAW_DARK_OAK_BEACH, () -> new TallDoorItem(DDBlocks.TALL_MACAW_DARK_OAK_BEACH_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_MANGROVE_BEACH_DOOR = ITEMS.register(DDNames.TALL_MACAW_MANGROVE_BEACH, () -> new TallDoorItem(DDBlocks.TALL_MACAW_MANGROVE_BEACH_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_CRIMSON_BEACH_DOOR = ITEMS.register(DDNames.TALL_MACAW_CRIMSON_BEACH, () -> new TallDoorItem(DDBlocks.TALL_MACAW_CRIMSON_BEACH_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_WARPED_BEACH_DOOR = ITEMS.register(DDNames.TALL_MACAW_WARPED_BEACH, () -> new TallDoorItem(DDBlocks.TALL_MACAW_WARPED_BEACH_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));

    public static final RegistryObject<Item> TALL_MACAW_OAK_TROPICAL_DOOR = ITEMS.register(DDNames.TALL_MACAW_OAK_TROPICAL, () -> new TallDoorItem(DDBlocks.TALL_MACAW_OAK_TROPICAL_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_SPRUCE_TROPICAL_DOOR = ITEMS.register(DDNames.TALL_MACAW_SPRUCE_TROPICAL, () -> new TallDoorItem(DDBlocks.TALL_MACAW_SPRUCE_TROPICAL_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_BIRCH_TROPICAL_DOOR = ITEMS.register(DDNames.TALL_MACAW_BIRCH_TROPICAL, () -> new TallDoorItem(DDBlocks.TALL_MACAW_BIRCH_TROPICAL_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_JUNGLE_TROPICAL_DOOR = ITEMS.register(DDNames.TALL_MACAW_JUNGLE_TROPICAL, () -> new TallDoorItem(DDBlocks.TALL_MACAW_JUNGLE_TROPICAL_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_DARK_OAK_TROPICAL_DOOR = ITEMS.register(DDNames.TALL_MACAW_DARK_OAK_TROPICAL, () -> new TallDoorItem(DDBlocks.TALL_MACAW_DARK_OAK_TROPICAL_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_MANGROVE_TROPICAL_DOOR = ITEMS.register(DDNames.TALL_MACAW_MANGROVE_TROPICAL, () -> new TallDoorItem(DDBlocks.TALL_MACAW_MANGROVE_TROPICAL_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_CRIMSON_TROPICAL_DOOR = ITEMS.register(DDNames.TALL_MACAW_CRIMSON_TROPICAL, () -> new TallDoorItem(DDBlocks.TALL_MACAW_CRIMSON_TROPICAL_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_WARPED_TROPICAL_DOOR = ITEMS.register(DDNames.TALL_MACAW_WARPED_TROPICAL, () -> new TallDoorItem(DDBlocks.TALL_MACAW_WARPED_TROPICAL_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));

    public static final RegistryObject<Item> TALL_MACAW_OAK_FOUR_PANEL_DOOR = ITEMS.register(DDNames.TALL_MACAW_OAK_FOUR_PANEL, () -> new TallDoorItem(DDBlocks.TALL_MACAW_OAK_FOUR_PANEL_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_SPRUCE_FOUR_PANEL_DOOR = ITEMS.register(DDNames.TALL_MACAW_SPRUCE_FOUR_PANEL, () -> new TallDoorItem(DDBlocks.TALL_MACAW_SPRUCE_FOUR_PANEL_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_BIRCH_FOUR_PANEL_DOOR = ITEMS.register(DDNames.TALL_MACAW_BIRCH_FOUR_PANEL, () -> new TallDoorItem(DDBlocks.TALL_MACAW_BIRCH_FOUR_PANEL_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_JUNGLE_FOUR_PANEL_DOOR = ITEMS.register(DDNames.TALL_MACAW_JUNGLE_FOUR_PANEL, () -> new TallDoorItem(DDBlocks.TALL_MACAW_JUNGLE_FOUR_PANEL_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_ACACIA_FOUR_PANEL_DOOR = ITEMS.register(DDNames.TALL_MACAW_ACACIA_FOUR_PANEL, () -> new TallDoorItem(DDBlocks.TALL_MACAW_ACACIA_FOUR_PANEL_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_MANGROVE_FOUR_PANEL_DOOR = ITEMS.register(DDNames.TALL_MACAW_MANGROVE_FOUR_PANEL, () -> new TallDoorItem(DDBlocks.TALL_MACAW_MANGROVE_FOUR_PANEL_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_CRIMSON_FOUR_PANEL_DOOR = ITEMS.register(DDNames.TALL_MACAW_CRIMSON_FOUR_PANEL, () -> new TallDoorItem(DDBlocks.TALL_MACAW_CRIMSON_FOUR_PANEL_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_WARPED_FOUR_PANEL_DOOR = ITEMS.register(DDNames.TALL_MACAW_WARPED_FOUR_PANEL, () -> new TallDoorItem(DDBlocks.TALL_MACAW_WARPED_FOUR_PANEL_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));

    public static final RegistryObject<Item> TALL_MACAW_OAK_SWAMP_DOOR = ITEMS.register(DDNames.TALL_MACAW_OAK_SWAMP, () -> new TallDoorItem(DDBlocks.TALL_MACAW_OAK_SWAMP_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_SPRUCE_SWAMP_DOOR = ITEMS.register(DDNames.TALL_MACAW_SPRUCE_SWAMP, () -> new TallDoorItem(DDBlocks.TALL_MACAW_SPRUCE_SWAMP_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_BIRCH_SWAMP_DOOR = ITEMS.register(DDNames.TALL_MACAW_BIRCH_SWAMP, () -> new TallDoorItem(DDBlocks.TALL_MACAW_BIRCH_SWAMP_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_JUNGLE_SWAMP_DOOR = ITEMS.register(DDNames.TALL_MACAW_JUNGLE_SWAMP, () -> new TallDoorItem(DDBlocks.TALL_MACAW_JUNGLE_SWAMP_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_ACACIA_SWAMP_DOOR = ITEMS.register(DDNames.TALL_MACAW_ACACIA_SWAMP, () -> new TallDoorItem(DDBlocks.TALL_MACAW_ACACIA_SWAMP_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_DARK_OAK_SWAMP_DOOR = ITEMS.register(DDNames.TALL_MACAW_DARK_OAK_SWAMP, () -> new TallDoorItem(DDBlocks.TALL_MACAW_DARK_OAK_SWAMP_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_CRIMSON_SWAMP_DOOR = ITEMS.register(DDNames.TALL_MACAW_CRIMSON_SWAMP, () -> new TallDoorItem(DDBlocks.TALL_MACAW_CRIMSON_SWAMP_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_WARPED_SWAMP_DOOR = ITEMS.register(DDNames.TALL_MACAW_WARPED_SWAMP, () -> new TallDoorItem(DDBlocks.TALL_MACAW_WARPED_SWAMP_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    
    public static final RegistryObject<Item> TALL_MACAW_OAK_NETHER_DOOR = ITEMS.register(DDNames.TALL_MACAW_OAK_NETHER, () -> new TallDoorItem(DDBlocks.TALL_MACAW_OAK_NETHER_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_SPRUCE_NETHER_DOOR = ITEMS.register(DDNames.TALL_MACAW_SPRUCE_NETHER, () -> new TallDoorItem(DDBlocks.TALL_MACAW_SPRUCE_NETHER_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_BIRCH_NETHER_DOOR = ITEMS.register(DDNames.TALL_MACAW_BIRCH_NETHER, () -> new TallDoorItem(DDBlocks.TALL_MACAW_BIRCH_NETHER_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_JUNGLE_NETHER_DOOR = ITEMS.register(DDNames.TALL_MACAW_JUNGLE_NETHER, () -> new TallDoorItem(DDBlocks.TALL_MACAW_JUNGLE_NETHER_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_ACACIA_NETHER_DOOR = ITEMS.register(DDNames.TALL_MACAW_ACACIA_NETHER, () -> new TallDoorItem(DDBlocks.TALL_MACAW_ACACIA_NETHER_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_DARK_OAK_NETHER_DOOR = ITEMS.register(DDNames.TALL_MACAW_DARK_OAK_NETHER, () -> new TallDoorItem(DDBlocks.TALL_MACAW_DARK_OAK_NETHER_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_MANGROVE_NETHER_DOOR = ITEMS.register(DDNames.TALL_MACAW_MANGROVE_NETHER, () -> new TallDoorItem(DDBlocks.TALL_MACAW_MANGROVE_NETHER_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_WARPED_NETHER_DOOR = ITEMS.register(DDNames.TALL_MACAW_WARPED_NETHER, () -> new TallDoorItem(DDBlocks.TALL_MACAW_WARPED_NETHER_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));

    public static final RegistryObject<Item> TALL_MACAW_OAK_MYSTIC_DOOR = ITEMS.register(DDNames.TALL_MACAW_OAK_MYSTIC, () -> new TallDoorItem(DDBlocks.TALL_MACAW_OAK_MYSTIC_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_SPRUCE_MYSTIC_DOOR = ITEMS.register(DDNames.TALL_MACAW_SPRUCE_MYSTIC, () -> new TallDoorItem(DDBlocks.TALL_MACAW_SPRUCE_MYSTIC_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_BIRCH_MYSTIC_DOOR = ITEMS.register(DDNames.TALL_MACAW_BIRCH_MYSTIC, () -> new TallDoorItem(DDBlocks.TALL_MACAW_BIRCH_MYSTIC_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_JUNGLE_MYSTIC_DOOR = ITEMS.register(DDNames.TALL_MACAW_JUNGLE_MYSTIC, () -> new TallDoorItem(DDBlocks.TALL_MACAW_JUNGLE_MYSTIC_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_ACACIA_MYSTIC_DOOR = ITEMS.register(DDNames.TALL_MACAW_ACACIA_MYSTIC, () -> new TallDoorItem(DDBlocks.TALL_MACAW_ACACIA_MYSTIC_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_MANGROVE_MYSTIC_DOOR = ITEMS.register(DDNames.TALL_MACAW_MANGROVE_MYSTIC, () -> new TallDoorItem(DDBlocks.TALL_MACAW_MANGROVE_MYSTIC_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_DARK_OAK_MYSTIC_DOOR = ITEMS.register(DDNames.TALL_MACAW_DARK_OAK_MYSTIC, () -> new TallDoorItem(DDBlocks.TALL_MACAW_DARK_OAK_MYSTIC_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_CRIMSON_MYSTIC_DOOR = ITEMS.register(DDNames.TALL_MACAW_CRIMSON_MYSTIC, () -> new TallDoorItem(DDBlocks.TALL_MACAW_CRIMSON_MYSTIC_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    
	private static Item.Properties conditionalTabProperties(String modid) {
     return conditionalTabProperties(modid, DramaticDoors.MAIN_TAB);
	}
    
    private static Item.Properties conditionalTabProperties(String modid, CreativeModeTab tab) {
    	return ModList.get().isLoaded(modid) ? PROPERTIES.tab(tab) : PROPERTIES.tab(null);
    }
    
    // If a mod conditionally adds doors, only make doors available if the corresponding normal-sized doors are available.
	private static Item.Properties addIfItemIsAvailable(ResourceLocation loc, Item.Properties tabProperties) {
    	if (ForgeRegistries.ITEMS.containsKey(loc)) {
    		Item item = ForgeRegistries.ITEMS.getValue(loc);
	    	if (item.getItemCategory() != null) {
	    		return tabProperties;
	    	}
    	}
    	return PROPERTIES.tab(null);
    }
}
