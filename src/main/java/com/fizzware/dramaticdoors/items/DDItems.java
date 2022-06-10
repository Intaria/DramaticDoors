package com.fizzware.dramaticdoors.items;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DramaticDoors;
import com.fizzware.dramaticdoors.blocks.DDBlocks;

import net.minecraft.resources.ResourceLocation;
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
    public static final RegistryObject<Item> TALL_IRON_DOOR = ITEMS.register(DDNames.NAME_IRON, () -> new TallDoorItem(DDBlocks.TALL_IRON_DOOR.get(), PROPERTIES.tab(DramaticDoors.TAB)));
    public static final RegistryObject<Item> TALL_OAK_DOOR = ITEMS.register(DDNames.NAME_OAK, () -> new TallDoorItem(DDBlocks.TALL_OAK_DOOR.get(), PROPERTIES.tab(DramaticDoors.TAB)));
    public static final RegistryObject<Item> TALL_SPRUCE_DOOR = ITEMS.register(DDNames.NAME_SPRUCE, () -> new TallDoorItem(DDBlocks.TALL_SPRUCE_DOOR.get(), PROPERTIES.tab(DramaticDoors.TAB)));
    public static final RegistryObject<Item> TALL_BIRCH_DOOR = ITEMS.register(DDNames.NAME_BIRCH, () -> new TallDoorItem(DDBlocks.TALL_BIRCH_DOOR.get(), PROPERTIES.tab(DramaticDoors.TAB)));
    public static final RegistryObject<Item> TALL_JUNGLE_DOOR = ITEMS.register(DDNames.NAME_JUNGLE, () -> new TallDoorItem(DDBlocks.TALL_JUNGLE_DOOR.get(), PROPERTIES.tab(DramaticDoors.TAB)));
    public static final RegistryObject<Item> TALL_ACACIA_DOOR = ITEMS.register(DDNames.NAME_ACACIA, () -> new TallDoorItem(DDBlocks.TALL_ACACIA_DOOR.get(), PROPERTIES.tab(DramaticDoors.TAB)));
    public static final RegistryObject<Item> TALL_DARK_OAK_DOOR = ITEMS.register(DDNames.NAME_DARK_OAK, () -> new TallDoorItem(DDBlocks.TALL_DARK_OAK_DOOR.get(), PROPERTIES.tab(DramaticDoors.TAB)));
    public static final RegistryObject<Item> TALL_MANGROVE_DOOR = ITEMS.register(DDNames.NAME_MANGROVE, () -> new TallDoorItem(DDBlocks.TALL_MANGROVE_DOOR.get(), PROPERTIES.tab(DramaticDoors.TAB)));
    public static final RegistryObject<Item> TALL_CRIMSON_DOOR = ITEMS.register(DDNames.NAME_CRIMSON, () -> new TallDoorItem(DDBlocks.TALL_CRIMSON_DOOR.get(), PROPERTIES.tab(DramaticDoors.TAB)));
    public static final RegistryObject<Item> TALL_WARPED_DOOR = ITEMS.register(DDNames.NAME_WARPED, () -> new TallDoorItem(DDBlocks.TALL_WARPED_DOOR.get(), PROPERTIES.tab(DramaticDoors.TAB)));
    
    // Biomes o' Plenty
    public static final RegistryObject<Item> TALL_BOP_CHERRY_DOOR = ITEMS.register(DDNames.NAME_BOP_CHERRY, () -> new TallDoorItem(DDBlocks.TALL_BOP_CHERRY_DOOR.get(), conditionalTabProperties("biomesoplenty")));
    public static final RegistryObject<Item> TALL_BOP_DEAD_DOOR = ITEMS.register(DDNames.NAME_BOP_DEAD, () -> new TallDoorItem(DDBlocks.TALL_BOP_DEAD_DOOR.get(), conditionalTabProperties("biomesoplenty")));
    public static final RegistryObject<Item> TALL_BOP_FIR_DOOR = ITEMS.register(DDNames.NAME_BOP_FIR, () -> new TallDoorItem(DDBlocks.TALL_BOP_FIR_DOOR.get(), conditionalTabProperties("biomesoplenty")));
    public static final RegistryObject<Item> TALL_BOP_HELLBARK_DOOR = ITEMS.register(DDNames.NAME_BOP_HELLBARK, () -> new TallDoorItem(DDBlocks.TALL_BOP_HELLBARK_DOOR.get(), conditionalTabProperties("biomesoplenty")));
    public static final RegistryObject<Item> TALL_BOP_JACARANDA_DOOR = ITEMS.register(DDNames.NAME_BOP_JACARANDA, () -> new TallDoorItem(DDBlocks.TALL_BOP_JACARANDA_DOOR.get(), conditionalTabProperties("biomesoplenty")));
    public static final RegistryObject<Item> TALL_BOP_MAGIC_DOOR = ITEMS.register(DDNames.NAME_BOP_MAGIC, () -> new TallDoorItem(DDBlocks.TALL_BOP_MAGIC_DOOR.get(), conditionalTabProperties("biomesoplenty")));
    public static final RegistryObject<Item> TALL_BOP_MAHOGANY_DOOR = ITEMS.register(DDNames.NAME_BOP_MAHOGANY, () -> new TallDoorItem(DDBlocks.TALL_BOP_MAHOGANY_DOOR.get(), conditionalTabProperties("biomesoplenty")));
    public static final RegistryObject<Item> TALL_BOP_PALM_DOOR = ITEMS.register(DDNames.NAME_BOP_PALM, () -> new TallDoorItem(DDBlocks.TALL_BOP_PALM_DOOR.get(), conditionalTabProperties("biomesoplenty")));
    public static final RegistryObject<Item> TALL_BOP_REDWOOD_DOOR = ITEMS.register(DDNames.NAME_BOP_REDWOOD, () -> new TallDoorItem(DDBlocks.TALL_BOP_REDWOOD_DOOR.get(), conditionalTabProperties("biomesoplenty")));
    public static final RegistryObject<Item> TALL_BOP_UMBRAN_DOOR = ITEMS.register(DDNames.NAME_BOP_UMBRAN, () -> new TallDoorItem(DDBlocks.TALL_BOP_UMBRAN_DOOR.get(), conditionalTabProperties("biomesoplenty")));
    public static final RegistryObject<Item> TALL_BOP_WILLOW_DOOR = ITEMS.register(DDNames.NAME_BOP_WILLOW, () -> new TallDoorItem(DDBlocks.TALL_BOP_WILLOW_DOOR.get(), conditionalTabProperties("biomesoplenty")));
    
    // Oh the Biomes You'll Go
    public static final RegistryObject<Item> TALL_BYG_ASPEN_DOOR = ITEMS.register(DDNames.NAME_BYG_ASPEN, () -> new TallDoorItem(DDBlocks.TALL_BYG_ASPEN_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_BAOBAB_DOOR = ITEMS.register(DDNames.NAME_BYG_BAOBAB, () -> new TallDoorItem(DDBlocks.TALL_BYG_BAOBAB_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_BLUE_ENCHANTED_DOOR = ITEMS.register(DDNames.NAME_BYG_BLUE_ENCHANTED, () -> new TallDoorItem(DDBlocks.TALL_BYG_BLUE_ENCHANTED_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_BULBIS_DOOR = ITEMS.register(DDNames.NAME_BYG_BULBIS, () -> new TallDoorItem(DDBlocks.TALL_BYG_BULBIS_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_CHERRY_DOOR = ITEMS.register(DDNames.NAME_BYG_CHERRY, () -> new TallDoorItem(DDBlocks.TALL_BYG_CHERRY_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_CIKA_DOOR = ITEMS.register(DDNames.NAME_BYG_CIKA, () -> new TallDoorItem(DDBlocks.TALL_BYG_CIKA_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_CYPRESS_DOOR = ITEMS.register(DDNames.NAME_BYG_CYPRESS, () -> new TallDoorItem(DDBlocks.TALL_BYG_CYPRESS_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_EBONY_DOOR = ITEMS.register(DDNames.NAME_BYG_EBONY, () -> new TallDoorItem(DDBlocks.TALL_BYG_EBONY_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_EMBUR_DOOR = ITEMS.register(DDNames.NAME_BYG_EMBUR, () -> new TallDoorItem(DDBlocks.TALL_BYG_EMBUR_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_ETHER_DOOR = ITEMS.register(DDNames.NAME_BYG_ETHER, () -> new TallDoorItem(DDBlocks.TALL_BYG_ETHER_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_FIR_DOOR = ITEMS.register(DDNames.NAME_BYG_FIR, () -> new TallDoorItem(DDBlocks.TALL_BYG_FIR_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_FLORUS_DOOR = ITEMS.register(DDNames.NAME_BYG_FLORUS, () -> new TallDoorItem(DDBlocks.TALL_BYG_FLORUS_DOOR.get(), addIfItemIsAvailable(new ResourceLocation("byg", "florus_door"), conditionalTabProperties("byg"))));
    public static final RegistryObject<Item> TALL_BYG_GREEN_ENCHANTED_DOOR = ITEMS.register(DDNames.NAME_BYG_GREEN_ENCHANTED, () -> new TallDoorItem(DDBlocks.TALL_BYG_GREEN_ENCHANTED_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_HOLLY_DOOR = ITEMS.register(DDNames.NAME_BYG_HOLLY, () -> new TallDoorItem(DDBlocks.TALL_BYG_HOLLY_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_IMPARIUS_DOOR = ITEMS.register(DDNames.NAME_BYG_IMPARIUS, () -> new TallDoorItem(DDBlocks.TALL_BYG_IMPARIUS_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_IRONWOOD_DOOR = ITEMS.register(DDNames.NAME_BYG_IRONWOOD, () -> new TallDoorItem(DDBlocks.TALL_BYG_IRONWOOD_DOOR.get(), addIfItemIsAvailable(new ResourceLocation("byg", "ironwood_door"), conditionalTabProperties("byg"))));
    public static final RegistryObject<Item> TALL_BYG_JACARANDA_DOOR = ITEMS.register(DDNames.NAME_BYG_JACARANDA, () -> new TallDoorItem(DDBlocks.TALL_BYG_JACARANDA_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_LAMENT_DOOR = ITEMS.register(DDNames.NAME_BYG_LAMENT, () -> new TallDoorItem(DDBlocks.TALL_BYG_LAMENT_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_MAHOGANY_DOOR = ITEMS.register(DDNames.NAME_BYG_MAHOGANY, () -> new TallDoorItem(DDBlocks.TALL_BYG_MAHOGANY_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_MAPLE_DOOR = ITEMS.register(DDNames.NAME_BYG_MAPLE, () -> new TallDoorItem(DDBlocks.TALL_BYG_MAPLE_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_NIGHTSHADE_DOOR = ITEMS.register(DDNames.NAME_BYG_NIGHTSHADE, () -> new TallDoorItem(DDBlocks.TALL_BYG_NIGHTSHADE_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_PALM_DOOR = ITEMS.register(DDNames.NAME_BYG_PALM, () -> new TallDoorItem(DDBlocks.TALL_BYG_PALM_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_PINE_DOOR = ITEMS.register(DDNames.NAME_BYG_PINE, () -> new TallDoorItem(DDBlocks.TALL_BYG_PINE_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_RAINBOW_EUCALYPTUS_DOOR = ITEMS.register(DDNames.NAME_BYG_RAINBOW_EUCALYPTUS, () -> new TallDoorItem(DDBlocks.TALL_BYG_RAINBOW_EUCALYPTUS_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_REDWOOD_DOOR = ITEMS.register(DDNames.NAME_BYG_REDWOOD, () -> new TallDoorItem(DDBlocks.TALL_BYG_REDWOOD_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_SKYRIS_DOOR = ITEMS.register(DDNames.NAME_BYG_SKYRIS, () -> new TallDoorItem(DDBlocks.TALL_BYG_SKYRIS_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_SOUL_SHROOM_DOOR = ITEMS.register(DDNames.NAME_BYG_SOUL_SHROOM, () -> new TallDoorItem(DDBlocks.TALL_BYG_SOUL_SHROOM_DOOR.get(), addIfItemIsAvailable(new ResourceLocation("byg", "soul_shroom_door"), conditionalTabProperties("byg"))));
    public static final RegistryObject<Item> TALL_BYG_SYTHIAN_DOOR = ITEMS.register(DDNames.NAME_BYG_SYTHIAN, () -> new TallDoorItem(DDBlocks.TALL_BYG_SYTHIAN_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_WHITE_MANGROVE_DOOR = ITEMS.register(DDNames.NAME_BYG_WHITE_MANGROVE, () -> new TallDoorItem(DDBlocks.TALL_BYG_WHITE_MANGROVE_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_WILLOW_DOOR = ITEMS.register(DDNames.NAME_BYG_WILLOW, () -> new TallDoorItem(DDBlocks.TALL_BYG_WILLOW_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_WITCH_HAZEL_DOOR = ITEMS.register(DDNames.NAME_BYG_WITCH_HAZEL, () -> new TallDoorItem(DDBlocks.TALL_BYG_WITCH_HAZEL_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_ZELKOVA_DOOR = ITEMS.register(DDNames.NAME_BYG_ZELKOVA, () -> new TallDoorItem(DDBlocks.TALL_BYG_ZELKOVA_DOOR.get(), conditionalTabProperties("byg")));

    // Prehistoric Fauna
    public static final RegistryObject<Item> TALL_ARAUCARIA_DOOR = ITEMS.register(DDNames.NAME_ARAUCARIA, () -> new TallDoorItem(DDBlocks.TALL_ARAUCARIA_DOOR.get(), conditionalTabProperties("prehistoricfauna")));
    public static final RegistryObject<Item> TALL_HEIDIPHYLLUM_DOOR = ITEMS.register(DDNames.NAME_HEIDIPHYLLUM, () -> new TallDoorItem(DDBlocks.TALL_HEIDIPHYLLUM_DOOR.get(), conditionalTabProperties("prehistoricfauna")));
    public static final RegistryObject<Item> TALL_LIRIODENDRITES_DOOR = ITEMS.register(DDNames.NAME_LIRIODENDRITES, () -> new TallDoorItem(DDBlocks.TALL_LIRIODENDRITES_DOOR.get(), conditionalTabProperties("prehistoricfauna")));
    public static final RegistryObject<Item> TALL_METASEQUOIA_DOOR = ITEMS.register(DDNames.NAME_METASEQUOIA, () -> new TallDoorItem(DDBlocks.TALL_METASEQUOIA_DOOR.get(), conditionalTabProperties("prehistoricfauna")));
    public static final RegistryObject<Item> TALL_PROTOJUNIPEROXYLON_DOOR = ITEMS.register(DDNames.NAME_PROTOJUNIPEROXYLON, () -> new TallDoorItem(DDBlocks.TALL_PROTOJUNIPEROXYLON_DOOR.get(), conditionalTabProperties("prehistoricfauna")));
    public static final RegistryObject<Item> TALL_PROTOPICEOXYLON_DOOR = ITEMS.register(DDNames.NAME_PROTOPICEOXYLON, () -> new TallDoorItem(DDBlocks.TALL_PROTOPICEOXYLON_DOOR.get(), conditionalTabProperties("prehistoricfauna")));
    public static final RegistryObject<Item> TALL_ZAMITES_DOOR = ITEMS.register(DDNames.NAME_ZAMITES, () -> new TallDoorItem(DDBlocks.TALL_ZAMITES_DOOR.get(), conditionalTabProperties("prehistoricfauna")));

    // Twilight Forest
    public static final RegistryObject<Item> TALL_CANOPY_DOOR = ITEMS.register(DDNames.NAME_CANOPY, () -> new TallDoorItem(DDBlocks.TALL_CANOPY_DOOR.get(), conditionalTabProperties("twilightforest")));
    public static final RegistryObject<Item> TALL_DARKWOOD_DOOR = ITEMS.register(DDNames.NAME_DARKWOOD, () -> new TallDoorItem(DDBlocks.TALL_DARKWOOD_DOOR.get(), conditionalTabProperties("twilightforest")));
    public static final RegistryObject<Item> TALL_TWILIGHT_MANGROVE_DOOR = ITEMS.register(DDNames.NAME_TWILIGHT_MANGROVE, () -> new TallDoorItem(DDBlocks.TALL_TWILIGHT_MANGROVE_DOOR.get(), conditionalTabProperties("twilightforest")));
    public static final RegistryObject<Item> TALL_MINEWOOD_DOOR = ITEMS.register(DDNames.NAME_MINEWOOD, () -> new TallDoorItem(DDBlocks.TALL_MINEWOOD_DOOR.get(), conditionalTabProperties("twilightforest")));
    public static final RegistryObject<Item> TALL_SORTINGWOOD_DOOR = ITEMS.register(DDNames.NAME_SORTINGWOOD, () -> new TallDoorItem(DDBlocks.TALL_SORTINGWOOD_DOOR.get(), conditionalTabProperties("twilightforest")));
    public static final RegistryObject<Item> TALL_TIMEWOOD_DOOR = ITEMS.register(DDNames.NAME_TIMEWOOD, () -> new TallDoorItem(DDBlocks.TALL_TIMEWOOD_DOOR.get(), conditionalTabProperties("twilightforest")));
    public static final RegistryObject<Item> TALL_TRANSWOOD_DOOR = ITEMS.register(DDNames.NAME_TRANSWOOD, () -> new TallDoorItem(DDBlocks.TALL_TRANSWOOD_DOOR.get(), conditionalTabProperties("twilightforest")));
    public static final RegistryObject<Item> TALL_TWILIGHT_OAK_DOOR = ITEMS.register(DDNames.NAME_TWILIGHT_OAK, () -> new TallDoorItem(DDBlocks.TALL_TWILIGHT_OAK_DOOR.get(), conditionalTabProperties("twilightforest")));
    
    // The Abnormals Mods
    public static final RegistryObject<Item> TALL_ASPEN_DOOR = ITEMS.register(DDNames.NAME_ASPEN, () -> new TallDoorItem(DDBlocks.TALL_ASPEN_DOOR.get(), conditionalTabProperties("atmospheric")));
    public static final RegistryObject<Item> TALL_GRIMWOOD_DOOR = ITEMS.register(DDNames.NAME_GRIMWOOD, () -> new TallDoorItem(DDBlocks.TALL_GRIMWOOD_DOOR.get(), conditionalTabProperties("atmospheric")));
    public static final RegistryObject<Item> TALL_KOUSA_DOOR = ITEMS.register(DDNames.NAME_KOUSA, () -> new TallDoorItem(DDBlocks.TALL_KOUSA_DOOR.get(), conditionalTabProperties("atmospheric")));
    public static final RegistryObject<Item> TALL_MORADO_DOOR = ITEMS.register(DDNames.NAME_MORADO, () -> new TallDoorItem(DDBlocks.TALL_MORADO_DOOR.get(), conditionalTabProperties("atmospheric")));
    public static final RegistryObject<Item> TALL_ROSEWOOD_DOOR = ITEMS.register(DDNames.NAME_ROSEWOOD, () -> new TallDoorItem(DDBlocks.TALL_ROSEWOOD_DOOR.get(), conditionalTabProperties("atmospheric")));
    public static final RegistryObject<Item> TALL_YUCCA_DOOR = ITEMS.register(DDNames.NAME_YUCCA, () -> new TallDoorItem(DDBlocks.TALL_YUCCA_DOOR.get(), conditionalTabProperties("atmospheric")));
    
    public static final RegistryObject<Item> TALL_MAPLE_DOOR = ITEMS.register(DDNames.NAME_MAPLE, () -> new TallDoorItem(DDBlocks.TALL_MAPLE_DOOR.get(), conditionalTabProperties("autumnity")));

    public static final RegistryObject<Item> TALL_BAMBOO_DOOR = ITEMS.register(DDNames.NAME_BAMBOO, () -> new TallDoorItem(DDBlocks.TALL_BAMBOO_DOOR.get(), conditionalTabProperties("bamboo_blocks")));

    public static final RegistryObject<Item> TALL_HONEYCOMB_DOOR = ITEMS.register(DDNames.NAME_HONEYCOMB, () -> new TallDoorItem(DDBlocks.TALL_HONEYCOMB_DOOR.get(), conditionalTabProperties("buzzier_bees")));

    public static final RegistryObject<Item> TALL_AZALEA_DOOR = ITEMS.register(DDNames.NAME_AZALEA, () -> new TallDoorItem(DDBlocks.TALL_AZALEA_DOOR.get(), conditionalTabProperties("caverns_and_chasms")));

    public static final RegistryObject<Item> TALL_POISE_DOOR = ITEMS.register(DDNames.NAME_POISE, () -> new TallDoorItem(DDBlocks.TALL_POISE_DOOR.get(), conditionalTabProperties("endergetic")));

    public static final RegistryObject<Item> TALL_CHERRY_DOOR = ITEMS.register(DDNames.NAME_CHERRY, () -> new TallDoorItem(DDBlocks.TALL_CHERRY_DOOR.get(), conditionalTabProperties("environmental")));
    public static final RegistryObject<Item> TALL_WILLOW_DOOR = ITEMS.register(DDNames.NAME_WILLOW, () -> new TallDoorItem(DDBlocks.TALL_WILLOW_DOOR.get(), conditionalTabProperties("environmental")));
    public static final RegistryObject<Item> TALL_WISTERIA_DOOR = ITEMS.register(DDNames.NAME_WISTERIA, () -> new TallDoorItem(DDBlocks.TALL_WISTERIA_DOOR.get(), conditionalTabProperties("environmental")));

    public static final RegistryObject<Item> TALL_DRIFTWOOD_DOOR = ITEMS.register(DDNames.NAME_DRIFTWOOD, () -> new TallDoorItem(DDBlocks.TALL_DRIFTWOOD_DOOR.get(), conditionalTabProperties("upgrade_aquatic")));
    public static final RegistryObject<Item> TALL_RIVER_DOOR = ITEMS.register(DDNames.NAME_RIVER, () -> new TallDoorItem(DDBlocks.TALL_RIVER_DOOR.get(), conditionalTabProperties("upgrade_aquatic")));
    public static final RegistryObject<Item> TALL_GLASS_DOOR = ITEMS.register(DDNames.NAME_GLASS, () -> new TallDoorItem(DDBlocks.TALL_GLASS_DOOR.get(), conditionalTabProperties("upgrade_aquatic")));
    public static final RegistryObject<Item> TALL_TOOTH_DOOR = ITEMS.register(DDNames.NAME_TOOTH, () -> new TallDoorItem(DDBlocks.TALL_TOOTH_DOOR.get(), conditionalTabProperties("upgrade_aquatic")));

    // Team Aurora Mods
    public static final RegistryObject<Item> TALL_JACARANDA_DOOR = ITEMS.register(DDNames.NAME_JACARANDA, () -> new TallDoorItem(DDBlocks.TALL_JACARANDA_DOOR.get(), conditionalTabProperties("abundance")));
    public static final RegistryObject<Item> TALL_REDBUD_DOOR = ITEMS.register(DDNames.NAME_REDBUD, () -> new TallDoorItem(DDBlocks.TALL_REDBUD_DOOR.get(), conditionalTabProperties("abundance")));

    public static final RegistryObject<Item> TALL_CYPRESS_DOOR = ITEMS.register(DDNames.NAME_CYPRESS, () -> new TallDoorItem(DDBlocks.TALL_CYPRESS_DOOR.get(), conditionalTabProperties("bayou_blues")));

    public static final RegistryObject<Item> TALL_BROWN_MUSHROOM_DOOR = ITEMS.register(DDNames.NAME_BROWN_MUSHROOM, () -> new TallDoorItem(DDBlocks.TALL_BROWN_MUSHROOM_DOOR.get(), conditionalTabProperties("enhanced_mushrooms")));
    public static final RegistryObject<Item> TALL_RED_MUSHROOM_DOOR = ITEMS.register(DDNames.NAME_RED_MUSHROOM, () -> new TallDoorItem(DDBlocks.TALL_RED_MUSHROOM_DOOR.get(), conditionalTabProperties("enhanced_mushrooms")));
    public static final RegistryObject<Item> TALL_GLOWSHROOM_DOOR = ITEMS.register(DDNames.NAME_GLOWSHROOM, () -> new TallDoorItem(DDBlocks.TALL_GLOWSHROOM_DOOR.get(), conditionalTabProperties("enhanced_mushrooms")));

    // Architects Palette
    public static final RegistryObject<Item> TALL_TWISTED_DOOR = ITEMS.register(DDNames.NAME_TWISTED, () -> new TallDoorItem(DDBlocks.TALL_TWISTED_DOOR.get(), conditionalTabProperties("architects_palette")));
    
    // Blocks+
    public static final RegistryObject<Item> TALL_BP_BAMBOO_DOOR = ITEMS.register(DDNames.NAME_BP_BAMBOO, () -> new TallDoorItem(DDBlocks.TALL_BP_BAMBOO_DOOR.get(), conditionalTabProperties("blocksplus")));
    public static final RegistryObject<Item> TALL_BP_MUSHROOM_DOOR = ITEMS.register(DDNames.NAME_BP_MUSHROOM, () -> new TallDoorItem(DDBlocks.TALL_BP_MUSHROOM_DOOR.get(), conditionalTabProperties("blocksplus")));
    public static final RegistryObject<Item> TALL_BP_COPPER_DOOR = ITEMS.register(DDNames.NAME_BP_COPPER, () -> new TallDoorItem(DDBlocks.TALL_BP_COPPER_DOOR.get(), conditionalTabProperties("blocksplus")));
    public static final RegistryObject<Item> TALL_BP_GOLDEN_DOOR = ITEMS.register(DDNames.NAME_BP_GOLDEN, () -> new TallDoorItem(DDBlocks.TALL_BP_GOLDEN_DOOR.get(), conditionalTabProperties("blocksplus")));
    public static final RegistryObject<Item> TALL_BP_DIAMOND_DOOR = ITEMS.register(DDNames.NAME_BP_DIAMOND, () -> new TallDoorItem(DDBlocks.TALL_BP_DIAMOND_DOOR.get(), conditionalTabProperties("blocksplus")));
    public static final RegistryObject<Item> TALL_BP_EMERALD_DOOR = ITEMS.register(DDNames.NAME_BP_EMERALD, () -> new TallDoorItem(DDBlocks.TALL_BP_EMERALD_DOOR.get(), conditionalTabProperties("blocksplus")));
    public static final RegistryObject<Item> TALL_BP_NETHERITE_DOOR = ITEMS.register(DDNames.NAME_BP_NETHERITE, () -> new TallDoorItem(DDBlocks.TALL_BP_NETHERITE_DOOR.get(), conditionalTabProperties("blocksplus")));
    
    // Darker Depths
    public static final RegistryObject<Item> TALL_PETRIFIED_DOOR = ITEMS.register(DDNames.NAME_PETRIFIED, () -> new TallDoorItem(DDBlocks.TALL_PETRIFIED_DOOR.get(), conditionalTabProperties("darkerdepths")));
    
    // Create: Alloyed
    public static final RegistryObject<Item> TALL_STEEL_DOOR = ITEMS.register(DDNames.NAME_STEEL, () -> new TallDoorItem(DDBlocks.TALL_STEEL_DOOR.get(), conditionalTabProperties("alloyed")));
    public static final RegistryObject<Item> TALL_LOCKED_STEEL_DOOR = ITEMS.register(DDNames.NAME_LOCKED_STEEL, () -> new TallDoorItem(DDBlocks.TALL_LOCKED_STEEL_DOOR.get(), conditionalTabProperties("alloyed")));
    
    // Create: Deco
    public static final RegistryObject<Item> TALL_ANDESITE_DOOR = ITEMS.register(DDNames.NAME_ANDESITE, () -> new TallDoorItem(DDBlocks.TALL_ANDESITE_DOOR.get(), conditionalTabProperties("createdeco")));
    public static final RegistryObject<Item> TALL_BRASS_DOOR = ITEMS.register(DDNames.NAME_BRASS, () -> new TallDoorItem(DDBlocks.TALL_BRASS_DOOR.get(), conditionalTabProperties("createdeco")));
    public static final RegistryObject<Item> TALL_COPPER_DOOR = ITEMS.register(DDNames.NAME_COPPER, () -> new TallDoorItem(DDBlocks.TALL_COPPER_DOOR.get(), conditionalTabProperties("createdeco")));
    public static final RegistryObject<Item> TALL_ZINC_DOOR = ITEMS.register(DDNames.NAME_ZINC, () -> new TallDoorItem(DDBlocks.TALL_ZINC_DOOR.get(), conditionalTabProperties("createdeco")));
    public static final RegistryObject<Item> TALL_LOCKED_ANDESITE_DOOR = ITEMS.register(DDNames.NAME_LOCKED_ANDESITE, () -> new TallDoorItem(DDBlocks.TALL_LOCKED_ANDESITE_DOOR.get(), conditionalTabProperties("createdeco")));
    public static final RegistryObject<Item> TALL_LOCKED_BRASS_DOOR = ITEMS.register(DDNames.NAME_LOCKED_BRASS, () -> new TallDoorItem(DDBlocks.TALL_LOCKED_BRASS_DOOR.get(), conditionalTabProperties("createdeco")));
    public static final RegistryObject<Item> TALL_LOCKED_COPPER_DOOR = ITEMS.register(DDNames.NAME_LOCKED_COPPER, () -> new TallDoorItem(DDBlocks.TALL_LOCKED_COPPER_DOOR.get(), conditionalTabProperties("createdeco")));
    public static final RegistryObject<Item> TALL_LOCKED_ZINC_DOOR = ITEMS.register(DDNames.NAME_LOCKED_ZINC, () -> new TallDoorItem(DDBlocks.TALL_LOCKED_ZINC_DOOR.get(), conditionalTabProperties("createdeco")));

    // Dustrial Decor
    public static final RegistryObject<Item> TALL_CARDBOARD_DOOR = ITEMS.register(DDNames.NAME_CARDBOARD, () -> new TallDoorItem(DDBlocks.TALL_CARDBOARD_DOOR.get(), conditionalTabProperties("dustrial_decor")));
    public static final RegistryObject<Item> TALL_CHAIN_DOOR = ITEMS.register(DDNames.NAME_CHAIN, () -> new TallDoorItem(DDBlocks.TALL_CHAIN_DOOR.get(), conditionalTabProperties("dustrial_decor")));
    public static final RegistryObject<Item> TALL_INDUSTRIAL_IRON_DOOR = ITEMS.register(DDNames.NAME_INDUSTRIAL_IRON, () -> new TallDoorItem(DDBlocks.TALL_INDUSTRIAL_IRON_DOOR.get(), conditionalTabProperties("dustrial_decor")));
    public static final RegistryObject<Item> TALL_IRON_BAR_DOOR = ITEMS.register(DDNames.NAME_IRON_BAR, () -> new TallDoorItem(DDBlocks.TALL_IRON_BAR_DOOR.get(), conditionalTabProperties("dustrial_decor")));
    public static final RegistryObject<Item> TALL_PADDED_DOOR = ITEMS.register(DDNames.NAME_PADDED, () -> new TallDoorItem(DDBlocks.TALL_PADDED_DOOR.get(), conditionalTabProperties("dustrial_decor")));
    public static final RegistryObject<Item> TALL_RUSTY_IRON_DOOR = ITEMS.register(DDNames.NAME_RUSTY_IRON, () -> new TallDoorItem(DDBlocks.TALL_RUSTY_IRON_DOOR.get(), conditionalTabProperties("dustrial_decor")));
    public static final RegistryObject<Item> TALL_RUSTY_SHEET_METAL_DOOR = ITEMS.register(DDNames.NAME_RUSTY_SHEET_METAL, () -> new TallDoorItem(DDBlocks.TALL_RUSTY_SHEET_METAL_DOOR.get(), conditionalTabProperties("dustrial_decor")));
    public static final RegistryObject<Item> TALL_SHEET_METAL_DOOR = ITEMS.register(DDNames.NAME_SHEET_METAL, () -> new TallDoorItem(DDBlocks.TALL_SHEET_METAL_DOOR.get(), conditionalTabProperties("dustrial_decor")));
    
    // Ecologics
    public static final RegistryObject<Item> TALL_ECO_AZALEA_DOOR = ITEMS.register(DDNames.NAME_ECO_AZALEA, () -> new TallDoorItem(DDBlocks.TALL_ECO_AZALEA_DOOR.get(), conditionalTabProperties("ecologics")));
    public static final RegistryObject<Item> TALL_ECO_FLOWERING_AZALEA_DOOR = ITEMS.register(DDNames.NAME_ECO_FLOWERING_AZALEA, () -> new TallDoorItem(DDBlocks.TALL_ECO_FLOWERING_AZALEA_DOOR.get(), conditionalTabProperties("ecologics")));
    public static final RegistryObject<Item> TALL_ECO_COCONUT_DOOR = ITEMS.register(DDNames.NAME_ECO_COCONUT, () -> new TallDoorItem(DDBlocks.TALL_ECO_COCONUT_DOOR.get(), conditionalTabProperties("ecologics")));
    public static final RegistryObject<Item> TALL_ECO_WALNUT_DOOR = ITEMS.register(DDNames.NAME_ECO_WALNUT, () -> new TallDoorItem(DDBlocks.TALL_ECO_WALNUT_DOOR.get(), conditionalTabProperties("ecologics")));
    
    // Habitat
    public static final RegistryObject<Item> TALL_FAIRY_RING_MUSHROOM_DOOR = ITEMS.register(DDNames.NAME_FAIRY_RING_MUSHROOM, () -> new TallDoorItem(DDBlocks.TALL_FAIRY_RING_MUSHROOM_DOOR.get(), addIfItemIsAvailable(new ResourceLocation("habitat", "fairy_ring_mushroom_door"), conditionalTabProperties("habitat"))));
    
    // Outer End
    public static final RegistryObject<Item> TALL_AZURE_DOOR = ITEMS.register(DDNames.NAME_AZURE, () -> new TallDoorItem(DDBlocks.TALL_AZURE_DOOR.get(), conditionalTabProperties("outer_end")));
    
    // Pokecube
    public static final RegistryObject<Item> TALL_POKECUBE_ENIGMA_DOOR = ITEMS.register(DDNames.NAME_POKECUBE_ENIGMA, () -> new TallDoorItem(DDBlocks.TALL_POKECUBE_ENIGMA_DOOR.get(), conditionalTabProperties("pokecube")));
    public static final RegistryObject<Item> TALL_POKECUBE_LEPPA_DOOR = ITEMS.register(DDNames.NAME_POKECUBE_LEPPA, () -> new TallDoorItem(DDBlocks.TALL_POKECUBE_LEPPA_DOOR.get(), conditionalTabProperties("pokecube")));
    public static final RegistryObject<Item> TALL_POKECUBE_NANAB_DOOR = ITEMS.register(DDNames.NAME_POKECUBE_NANAB, () -> new TallDoorItem(DDBlocks.TALL_POKECUBE_NANAB_DOOR.get(), conditionalTabProperties("pokecube")));
    public static final RegistryObject<Item> TALL_POKECUBE_ORAN_DOOR = ITEMS.register(DDNames.NAME_POKECUBE_ORAN, () -> new TallDoorItem(DDBlocks.TALL_POKECUBE_ORAN_DOOR.get(), conditionalTabProperties("pokecube")));
    public static final RegistryObject<Item> TALL_POKECUBE_PECHA_DOOR = ITEMS.register(DDNames.NAME_POKECUBE_PECHA, () -> new TallDoorItem(DDBlocks.TALL_POKECUBE_PECHA_DOOR.get(), conditionalTabProperties("pokecube")));
    public static final RegistryObject<Item> TALL_POKECUBE_SITRUS_DOOR = ITEMS.register(DDNames.NAME_POKECUBE_SITRUS, () -> new TallDoorItem(DDBlocks.TALL_POKECUBE_SITRUS_DOOR.get(), conditionalTabProperties("pokecube")));
    public static final RegistryObject<Item> TALL_POKECUBE_AGED_DOOR = ITEMS.register(DDNames.NAME_POKECUBE_AGED, () -> new TallDoorItem(DDBlocks.TALL_POKECUBE_AGED_DOOR.get(), conditionalTabProperties("pokecube")));
    public static final RegistryObject<Item> TALL_POKECUBE_CONCRETE_DOOR = ITEMS.register(DDNames.NAME_POKECUBE_CONCRETE, () -> new TallDoorItem(DDBlocks.TALL_POKECUBE_CONCRETE_DOOR.get(), conditionalTabProperties("pokecube")));
    public static final RegistryObject<Item> TALL_POKECUBE_CORRUPTED_DOOR = ITEMS.register(DDNames.NAME_POKECUBE_CORRUPTED, () -> new TallDoorItem(DDBlocks.TALL_POKECUBE_CORRUPTED_DOOR.get(), conditionalTabProperties("pokecube")));
    public static final RegistryObject<Item> TALL_POKECUBE_DISTORTIC_DOOR = ITEMS.register(DDNames.NAME_POKECUBE_DISTORTIC, () -> new TallDoorItem(DDBlocks.TALL_POKECUBE_DISTORTIC_DOOR.get(), conditionalTabProperties("pokecube")));
    public static final RegistryObject<Item> TALL_POKECUBE_INVERTED_DOOR = ITEMS.register(DDNames.NAME_POKECUBE_INVERTED, () -> new TallDoorItem(DDBlocks.TALL_POKECUBE_INVERTED_DOOR.get(), conditionalTabProperties("pokecube")));
    public static final RegistryObject<Item> TALL_POKECUBE_MIRAGE_DOOR = ITEMS.register(DDNames.NAME_POKECUBE_MIRAGE, () -> new TallDoorItem(DDBlocks.TALL_POKECUBE_MIRAGE_DOOR.get(), conditionalTabProperties("pokecube")));
    public static final RegistryObject<Item> TALL_POKECUBE_TEMPORAL_DOOR = ITEMS.register(DDNames.NAME_POKECUBE_TEMPORAL, () -> new TallDoorItem(DDBlocks.TALL_POKECUBE_TEMPORAL_DOOR.get(), conditionalTabProperties("pokecube")));
    
    // Premium Wood
    public static final RegistryObject<Item> TALL_PW_MAGIC_DOOR = ITEMS.register(DDNames.NAME_PW_MAGIC, () -> new TallDoorItem(DDBlocks.TALL_PW_MAGIC_DOOR.get(), conditionalTabProperties("premium_wood")));
    public static final RegistryObject<Item> TALL_PW_MAPLE_DOOR = ITEMS.register(DDNames.NAME_PW_MAPLE, () -> new TallDoorItem(DDBlocks.TALL_PW_MAPLE_DOOR.get(), conditionalTabProperties("premium_wood")));
    public static final RegistryObject<Item> TALL_PW_PURPLE_HEART_DOOR = ITEMS.register(DDNames.NAME_PW_PURPLE_HEART, () -> new TallDoorItem(DDBlocks.TALL_PW_PURPLE_HEART_DOOR.get(), conditionalTabProperties("premium_wood")));
    public static final RegistryObject<Item> TALL_PW_SILVERBELL_DOOR = ITEMS.register(DDNames.NAME_PW_SILVERBELL, () -> new TallDoorItem(DDBlocks.TALL_PW_SILVERBELL_DOOR.get(), conditionalTabProperties("premium_wood")));
    public static final RegistryObject<Item> TALL_PW_TIGER_DOOR = ITEMS.register(DDNames.NAME_PW_TIGER, () -> new TallDoorItem(DDBlocks.TALL_PW_TIGER_DOOR.get(), conditionalTabProperties("premium_wood")));
    public static final RegistryObject<Item> TALL_PW_WILLOW_DOOR = ITEMS.register(DDNames.NAME_PW_WILLOW, () -> new TallDoorItem(DDBlocks.TALL_PW_WILLOW_DOOR.get(), conditionalTabProperties("premium_wood")));
    
    // Quark
    public static final RegistryObject<Item> TALL_QUARK_AZALEA_DOOR = ITEMS.register(DDNames.NAME_QUARK_AZALEA, () -> new TallDoorItem(DDBlocks.TALL_QUARK_AZALEA_DOOR.get(), conditionalTabProperties("quark")));
    public static final RegistryObject<Item> TALL_QUARK_BLOSSOM_DOOR = ITEMS.register(DDNames.NAME_QUARK_BLOSSOM, () -> new TallDoorItem(DDBlocks.TALL_QUARK_BLOSSOM_DOOR.get(), conditionalTabProperties("quark")));
    
    // Supplementaries
    public static final RegistryObject<Item> TALL_GOLD_DOOR = ITEMS.register(DDNames.NAME_GOLD, () -> new TallDoorItem(DDBlocks.TALL_GOLD_DOOR.get(), conditionalTabProperties("supplementaries")));
    public static final RegistryObject<Item> TALL_SILVER_DOOR = ITEMS.register(DDNames.NAME_SILVER, () -> new TallDoorItem(DDBlocks.TALL_SILVER_DOOR.get(), conditionalTabProperties("supplementaries")));
    public static final RegistryObject<Item> TALL_LEAD_DOOR = ITEMS.register(DDNames.NAME_LEAD, () -> new TallDoorItem(DDBlocks.TALL_LEAD_DOOR.get(), conditionalTabProperties("supplementaries")));
    public static final RegistryObject<Item> TALL_NETHERITE_DOOR = ITEMS.register(DDNames.NAME_NETHERITE, () -> new TallDoorItem(DDBlocks.TALL_NETHERITE_DOOR.get(), conditionalTabProperties("supplementaries")));
    
    // Undergarden
    public static final RegistryObject<Item> TALL_GRONGLE_DOOR = ITEMS.register(DDNames.NAME_GRONGLE, () -> new TallDoorItem(DDBlocks.TALL_GRONGLE_DOOR.get(), conditionalTabProperties("undergarden")));
    public static final RegistryObject<Item> TALL_SMOGSTEM_DOOR = ITEMS.register(DDNames.NAME_SMOGSTEM, () -> new TallDoorItem(DDBlocks.TALL_SMOGSTEM_DOOR.get(), conditionalTabProperties("undergarden")));
    public static final RegistryObject<Item> TALL_WIGGLEWOOD_DOOR = ITEMS.register(DDNames.NAME_WIGGLEWOOD, () -> new TallDoorItem(DDBlocks.TALL_WIGGLEWOOD_DOOR.get(), conditionalTabProperties("undergarden")));
    
    private static Item.Properties conditionalTabProperties(String modid) {
    	return ModList.get().isLoaded(modid) ? PROPERTIES.tab(DramaticDoors.TAB) : PROPERTIES.tab(null);
    }
    
    // If a mod conditionally adds doors, only make doors available if the corresponding normal-sized doors are available.
	private static Item.Properties addIfItemIsAvailable(ResourceLocation loc, Item.Properties tabProperties) {
    	Item item = ForgeRegistries.ITEMS.getValue(loc);
    	if (item != null) {
    		if (item.getItemCategory() != null) {
    			return tabProperties;
    		}
    		else {
    			return PROPERTIES.tab(null);
    		}
    	}
    	else {
    		return PROPERTIES.tab(null);
    	}
    }
}
