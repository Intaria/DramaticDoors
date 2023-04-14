package com.fizzware.dramaticdoors.init;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DramaticDoors;
import com.fizzware.dramaticdoors.items.ShortDoorItem;
import com.fizzware.dramaticdoors.items.TallDoorItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class DDItems {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DramaticDoors.MOD_ID);

    public static final Item.Properties PROPERTIES = new Item.Properties();
    
    // Vanilla
    public static final RegistryObject<Item> SHORT_IRON_DOOR = ITEMS.register(DDNames.SHORT_IRON, () -> new ShortDoorItem(DDBlocks.SHORT_IRON_DOOR.get(), PROPERTIES.tab(DramaticDoors.MAIN_TAB)));
    public static final RegistryObject<Item> SHORT_OAK_DOOR = ITEMS.register(DDNames.SHORT_OAK, () -> new ShortDoorItem(DDBlocks.SHORT_OAK_DOOR.get(), PROPERTIES.tab(DramaticDoors.MAIN_TAB)));
    public static final RegistryObject<Item> SHORT_SPRUCE_DOOR = ITEMS.register(DDNames.SHORT_SPRUCE, () -> new ShortDoorItem(DDBlocks.SHORT_SPRUCE_DOOR.get(), PROPERTIES.tab(DramaticDoors.MAIN_TAB)));
    public static final RegistryObject<Item> SHORT_BIRCH_DOOR = ITEMS.register(DDNames.SHORT_BIRCH, () -> new ShortDoorItem(DDBlocks.SHORT_BIRCH_DOOR.get(), PROPERTIES.tab(DramaticDoors.MAIN_TAB)));
    public static final RegistryObject<Item> SHORT_JUNGLE_DOOR = ITEMS.register(DDNames.SHORT_JUNGLE, () -> new ShortDoorItem(DDBlocks.SHORT_JUNGLE_DOOR.get(), PROPERTIES.tab(DramaticDoors.MAIN_TAB)));
    public static final RegistryObject<Item> SHORT_ACACIA_DOOR = ITEMS.register(DDNames.SHORT_ACACIA, () -> new ShortDoorItem(DDBlocks.SHORT_ACACIA_DOOR.get(), PROPERTIES.tab(DramaticDoors.MAIN_TAB)));
    public static final RegistryObject<Item> SHORT_DARK_OAK_DOOR = ITEMS.register(DDNames.SHORT_DARK_OAK, () -> new ShortDoorItem(DDBlocks.SHORT_DARK_OAK_DOOR.get(), PROPERTIES.tab(DramaticDoors.MAIN_TAB)));
    public static final RegistryObject<Item> SHORT_MANGROVE_DOOR = ITEMS.register(DDNames.SHORT_MANGROVE, () -> new ShortDoorItem(DDBlocks.SHORT_MANGROVE_DOOR.get(), PROPERTIES.tab(DramaticDoors.MAIN_TAB)));
    public static final RegistryObject<Item> SHORT_BAMBOO_DOOR = ITEMS.register(DDNames.SHORT_BAMBOO, () -> new ShortDoorItem(DDBlocks.SHORT_BAMBOO_DOOR.get(), conditionalTabProperties("quark"))); // Quark's Bamboo Backport
    public static final RegistryObject<Item> SHORT_CRIMSON_DOOR = ITEMS.register(DDNames.SHORT_CRIMSON, () -> new ShortDoorItem(DDBlocks.SHORT_CRIMSON_DOOR.get(), PROPERTIES.tab(DramaticDoors.MAIN_TAB)));
    public static final RegistryObject<Item> SHORT_WARPED_DOOR = ITEMS.register(DDNames.SHORT_WARPED, () -> new ShortDoorItem(DDBlocks.SHORT_WARPED_DOOR.get(), PROPERTIES.tab(DramaticDoors.MAIN_TAB)));

    public static final RegistryObject<Item> TALL_IRON_DOOR = ITEMS.register(DDNames.TALL_IRON, () -> new TallDoorItem(DDBlocks.TALL_IRON_DOOR.get(), PROPERTIES.tab(DramaticDoors.MAIN_TAB)));
    public static final RegistryObject<Item> TALL_OAK_DOOR = ITEMS.register(DDNames.TALL_OAK, () -> new TallDoorItem(DDBlocks.TALL_OAK_DOOR.get(), PROPERTIES.tab(DramaticDoors.MAIN_TAB)));
    public static final RegistryObject<Item> TALL_SPRUCE_DOOR = ITEMS.register(DDNames.TALL_SPRUCE, () -> new TallDoorItem(DDBlocks.TALL_SPRUCE_DOOR.get(), PROPERTIES.tab(DramaticDoors.MAIN_TAB)));
    public static final RegistryObject<Item> TALL_BIRCH_DOOR = ITEMS.register(DDNames.TALL_BIRCH, () -> new TallDoorItem(DDBlocks.TALL_BIRCH_DOOR.get(), PROPERTIES.tab(DramaticDoors.MAIN_TAB)));
    public static final RegistryObject<Item> TALL_JUNGLE_DOOR = ITEMS.register(DDNames.TALL_JUNGLE, () -> new TallDoorItem(DDBlocks.TALL_JUNGLE_DOOR.get(), PROPERTIES.tab(DramaticDoors.MAIN_TAB)));
    public static final RegistryObject<Item> TALL_ACACIA_DOOR = ITEMS.register(DDNames.TALL_ACACIA, () -> new TallDoorItem(DDBlocks.TALL_ACACIA_DOOR.get(), PROPERTIES.tab(DramaticDoors.MAIN_TAB)));
    public static final RegistryObject<Item> TALL_DARK_OAK_DOOR = ITEMS.register(DDNames.TALL_DARK_OAK, () -> new TallDoorItem(DDBlocks.TALL_DARK_OAK_DOOR.get(), PROPERTIES.tab(DramaticDoors.MAIN_TAB)));
    public static final RegistryObject<Item> TALL_MANGROVE_DOOR = ITEMS.register(DDNames.TALL_MANGROVE, () -> new TallDoorItem(DDBlocks.TALL_MANGROVE_DOOR.get(), PROPERTIES.tab(DramaticDoors.MAIN_TAB)));
    public static final RegistryObject<Item> TALL_BAMBOO_DOOR = ITEMS.register(DDNames.TALL_BAMBOO, () -> new TallDoorItem(DDBlocks.TALL_BAMBOO_DOOR.get(), conditionalTabProperties("quark"))); // Quark's Bamboo Backport
    public static final RegistryObject<Item> TALL_CRIMSON_DOOR = ITEMS.register(DDNames.TALL_CRIMSON, () -> new TallDoorItem(DDBlocks.TALL_CRIMSON_DOOR.get(), PROPERTIES.tab(DramaticDoors.MAIN_TAB)));
    public static final RegistryObject<Item> TALL_WARPED_DOOR = ITEMS.register(DDNames.TALL_WARPED, () -> new TallDoorItem(DDBlocks.TALL_WARPED_DOOR.get(), PROPERTIES.tab(DramaticDoors.MAIN_TAB)));
    
    // Biomes o' Plenty
    public static final RegistryObject<Item> SHORT_BOP_CHERRY_DOOR = ITEMS.register(DDNames.SHORT_BOP_CHERRY, () -> new ShortDoorItem(DDBlocks.SHORT_BOP_CHERRY_DOOR.get(), conditionalTabProperties("biomesoplenty")));
    public static final RegistryObject<Item> SHORT_BOP_DEAD_DOOR = ITEMS.register(DDNames.SHORT_BOP_DEAD, () -> new ShortDoorItem(DDBlocks.SHORT_BOP_DEAD_DOOR.get(), conditionalTabProperties("biomesoplenty")));
    public static final RegistryObject<Item> SHORT_BOP_FIR_DOOR = ITEMS.register(DDNames.SHORT_BOP_FIR, () -> new ShortDoorItem(DDBlocks.SHORT_BOP_FIR_DOOR.get(), conditionalTabProperties("biomesoplenty")));
    public static final RegistryObject<Item> SHORT_BOP_HELLBARK_DOOR = ITEMS.register(DDNames.SHORT_BOP_HELLBARK, () -> new ShortDoorItem(DDBlocks.SHORT_BOP_HELLBARK_DOOR.get(), conditionalTabProperties("biomesoplenty")));
    public static final RegistryObject<Item> SHORT_BOP_JACARANDA_DOOR = ITEMS.register(DDNames.SHORT_BOP_JACARANDA, () -> new ShortDoorItem(DDBlocks.SHORT_BOP_JACARANDA_DOOR.get(), conditionalTabProperties("biomesoplenty")));
    public static final RegistryObject<Item> SHORT_BOP_MAGIC_DOOR = ITEMS.register(DDNames.SHORT_BOP_MAGIC, () -> new ShortDoorItem(DDBlocks.SHORT_BOP_MAGIC_DOOR.get(), conditionalTabProperties("biomesoplenty")));
    public static final RegistryObject<Item> SHORT_BOP_MAHOGANY_DOOR = ITEMS.register(DDNames.SHORT_BOP_MAHOGANY, () -> new ShortDoorItem(DDBlocks.SHORT_BOP_MAHOGANY_DOOR.get(), conditionalTabProperties("biomesoplenty")));
    public static final RegistryObject<Item> SHORT_BOP_PALM_DOOR = ITEMS.register(DDNames.SHORT_BOP_PALM, () -> new ShortDoorItem(DDBlocks.SHORT_BOP_PALM_DOOR.get(), conditionalTabProperties("biomesoplenty")));
    public static final RegistryObject<Item> SHORT_BOP_REDWOOD_DOOR = ITEMS.register(DDNames.SHORT_BOP_REDWOOD, () -> new ShortDoorItem(DDBlocks.SHORT_BOP_REDWOOD_DOOR.get(), conditionalTabProperties("biomesoplenty")));
    public static final RegistryObject<Item> SHORT_BOP_UMBRAN_DOOR = ITEMS.register(DDNames.SHORT_BOP_UMBRAN, () -> new ShortDoorItem(DDBlocks.SHORT_BOP_UMBRAN_DOOR.get(), conditionalTabProperties("biomesoplenty")));
    public static final RegistryObject<Item> SHORT_BOP_WILLOW_DOOR = ITEMS.register(DDNames.SHORT_BOP_WILLOW, () -> new ShortDoorItem(DDBlocks.SHORT_BOP_WILLOW_DOOR.get(), conditionalTabProperties("biomesoplenty")));
    
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
    
    // Prehistoric Fauna
    public static final RegistryObject<Item> SHORT_AGATHOXYLON_DOOR = ITEMS.register(DDNames.SHORT_AGATHOXYLON, () -> new ShortDoorItem(DDBlocks.SHORT_AGATHOXYLON_DOOR.get(), conditionalTabProperties("prehistoricfauna")));
    public static final RegistryObject<Item> SHORT_ARAUCARIA_DOOR = ITEMS.register(DDNames.SHORT_ARAUCARIA, () -> new ShortDoorItem(DDBlocks.SHORT_ARAUCARIA_DOOR.get(), conditionalTabProperties("prehistoricfauna")));
    public static final RegistryObject<Item> SHORT_BRACHYPHYLLUM_DOOR = ITEMS.register(DDNames.SHORT_BRACHYPHYLLUM, () -> new ShortDoorItem(DDBlocks.SHORT_BRACHYPHYLLUM_DOOR.get(), conditionalTabProperties("prehistoricfauna")));
    public static final RegistryObject<Item> SHORT_GINKGO_DOOR = ITEMS.register(DDNames.SHORT_GINKGO, () -> new ShortDoorItem(DDBlocks.SHORT_GINKGO_DOOR.get(), conditionalTabProperties("prehistoricfauna")));
    public static final RegistryObject<Item> SHORT_HEIDIPHYLLUM_DOOR = ITEMS.register(DDNames.SHORT_HEIDIPHYLLUM, () -> new ShortDoorItem(DDBlocks.SHORT_HEIDIPHYLLUM_DOOR.get(), conditionalTabProperties("prehistoricfauna")));
    public static final RegistryObject<Item> SHORT_LIRIODENDRITES_DOOR = ITEMS.register(DDNames.SHORT_LIRIODENDRITES, () -> new ShortDoorItem(DDBlocks.SHORT_LIRIODENDRITES_DOOR.get(), conditionalTabProperties("prehistoricfauna")));
    public static final RegistryObject<Item> SHORT_METASEQUOIA_DOOR = ITEMS.register(DDNames.SHORT_METASEQUOIA, () -> new ShortDoorItem(DDBlocks.SHORT_METASEQUOIA_DOOR.get(), conditionalTabProperties("prehistoricfauna")));
    public static final RegistryObject<Item> SHORT_NEOCALAMITES_DOOR = ITEMS.register(DDNames.SHORT_NEOCALAMITES, () -> new ShortDoorItem(DDBlocks.SHORT_NEOCALAMITES_DOOR.get(), conditionalTabProperties("prehistoricfauna")));
    public static final RegistryObject<Item> SHORT_PROTOJUNIPEROXYLON_DOOR = ITEMS.register(DDNames.SHORT_PROTOJUNIPEROXYLON, () -> new ShortDoorItem(DDBlocks.SHORT_PROTOJUNIPEROXYLON_DOOR.get(), conditionalTabProperties("prehistoricfauna")));
    public static final RegistryObject<Item> SHORT_PROTOPICEOXYLON_DOOR = ITEMS.register(DDNames.SHORT_PROTOPICEOXYLON, () -> new ShortDoorItem(DDBlocks.SHORT_PROTOPICEOXYLON_DOOR.get(), conditionalTabProperties("prehistoricfauna")));
    public static final RegistryObject<Item> SHORT_SCHILDERIA_DOOR = ITEMS.register(DDNames.SHORT_SCHILDERIA, () -> new ShortDoorItem(DDBlocks.SHORT_SCHILDERIA_DOOR.get(), conditionalTabProperties("prehistoricfauna")));
    public static final RegistryObject<Item> SHORT_TROCHODENDROIDES_DOOR = ITEMS.register(DDNames.SHORT_TROCHODENDROIDES, () -> new ShortDoorItem(DDBlocks.SHORT_TROCHODENDROIDES_DOOR.get(), conditionalTabProperties("prehistoricfauna")));
    public static final RegistryObject<Item> SHORT_WOODWORTHIA_DOOR = ITEMS.register(DDNames.SHORT_WOODWORTHIA, () -> new ShortDoorItem(DDBlocks.SHORT_WOODWORTHIA_DOOR.get(), conditionalTabProperties("prehistoricfauna")));
    public static final RegistryObject<Item> SHORT_ZAMITES_DOOR = ITEMS.register(DDNames.SHORT_ZAMITES, () -> new ShortDoorItem(DDBlocks.SHORT_ZAMITES_DOOR.get(), conditionalTabProperties("prehistoricfauna")));

    public static final RegistryObject<Item> TALL_AGATHOXYLON_DOOR = ITEMS.register(DDNames.TALL_AGATHOXYLON, () -> new TallDoorItem(DDBlocks.TALL_AGATHOXYLON_DOOR.get(), conditionalTabProperties("prehistoricfauna")));
    public static final RegistryObject<Item> TALL_ARAUCARIA_DOOR = ITEMS.register(DDNames.TALL_ARAUCARIA, () -> new TallDoorItem(DDBlocks.TALL_ARAUCARIA_DOOR.get(), conditionalTabProperties("prehistoricfauna")));
    public static final RegistryObject<Item> TALL_BRACHYPHYLLUM_DOOR = ITEMS.register(DDNames.TALL_BRACHYPHYLLUM, () -> new TallDoorItem(DDBlocks.TALL_BRACHYPHYLLUM_DOOR.get(), conditionalTabProperties("prehistoricfauna")));
    public static final RegistryObject<Item> TALL_GINKGO_DOOR = ITEMS.register(DDNames.TALL_GINKGO, () -> new TallDoorItem(DDBlocks.TALL_GINKGO_DOOR.get(), conditionalTabProperties("prehistoricfauna")));
    public static final RegistryObject<Item> TALL_HEIDIPHYLLUM_DOOR = ITEMS.register(DDNames.TALL_HEIDIPHYLLUM, () -> new TallDoorItem(DDBlocks.TALL_HEIDIPHYLLUM_DOOR.get(), conditionalTabProperties("prehistoricfauna")));
    public static final RegistryObject<Item> TALL_LIRIODENDRITES_DOOR = ITEMS.register(DDNames.TALL_LIRIODENDRITES, () -> new TallDoorItem(DDBlocks.TALL_LIRIODENDRITES_DOOR.get(), conditionalTabProperties("prehistoricfauna")));
    public static final RegistryObject<Item> TALL_METASEQUOIA_DOOR = ITEMS.register(DDNames.TALL_METASEQUOIA, () -> new TallDoorItem(DDBlocks.TALL_METASEQUOIA_DOOR.get(), conditionalTabProperties("prehistoricfauna")));
    public static final RegistryObject<Item> TALL_NEOCALAMITES_DOOR = ITEMS.register(DDNames.TALL_NEOCALAMITES, () -> new TallDoorItem(DDBlocks.TALL_NEOCALAMITES_DOOR.get(), conditionalTabProperties("prehistoricfauna")));
    public static final RegistryObject<Item> TALL_PROTOJUNIPEROXYLON_DOOR = ITEMS.register(DDNames.TALL_PROTOJUNIPEROXYLON, () -> new TallDoorItem(DDBlocks.TALL_PROTOJUNIPEROXYLON_DOOR.get(), conditionalTabProperties("prehistoricfauna")));
    public static final RegistryObject<Item> TALL_PROTOPICEOXYLON_DOOR = ITEMS.register(DDNames.TALL_PROTOPICEOXYLON, () -> new TallDoorItem(DDBlocks.TALL_PROTOPICEOXYLON_DOOR.get(), conditionalTabProperties("prehistoricfauna")));
    public static final RegistryObject<Item> TALL_SCHILDERIA_DOOR = ITEMS.register(DDNames.TALL_SCHILDERIA, () -> new TallDoorItem(DDBlocks.TALL_SCHILDERIA_DOOR.get(), conditionalTabProperties("prehistoricfauna")));
    public static final RegistryObject<Item> TALL_TROCHODENDROIDES_DOOR = ITEMS.register(DDNames.TALL_TROCHODENDROIDES, () -> new TallDoorItem(DDBlocks.TALL_TROCHODENDROIDES_DOOR.get(), conditionalTabProperties("prehistoricfauna")));
    public static final RegistryObject<Item> TALL_WOODWORTHIA_DOOR = ITEMS.register(DDNames.TALL_WOODWORTHIA, () -> new TallDoorItem(DDBlocks.TALL_WOODWORTHIA_DOOR.get(), conditionalTabProperties("prehistoricfauna")));
    public static final RegistryObject<Item> TALL_ZAMITES_DOOR = ITEMS.register(DDNames.TALL_ZAMITES, () -> new TallDoorItem(DDBlocks.TALL_ZAMITES_DOOR.get(), conditionalTabProperties("prehistoricfauna")));

    // Regions Unexplored
    public static final RegistryObject<Item> SHORT_RUE_BAOBAB_DOOR = ITEMS.register(DDNames.SHORT_RUE_BAOBAB, () -> new ShortDoorItem(DDBlocks.SHORT_RUE_BAOBAB_DOOR.get(), conditionalTabProperties("regions_unexplored")));
    public static final RegistryObject<Item> SHORT_RUE_BLACKWOOD_DOOR = ITEMS.register(DDNames.SHORT_RUE_BLACKWOOD, () -> new ShortDoorItem(DDBlocks.SHORT_RUE_BLACKWOOD_DOOR.get(), conditionalTabProperties("regions_unexplored")));
    public static final RegistryObject<Item> SHORT_RUE_CHERRY_DOOR = ITEMS.register(DDNames.SHORT_RUE_CHERRY, () -> new ShortDoorItem(DDBlocks.SHORT_RUE_CHERRY_DOOR.get(), conditionalTabProperties("regions_unexplored")));
    public static final RegistryObject<Item> SHORT_RUE_CYPRESS_DOOR = ITEMS.register(DDNames.SHORT_RUE_CYPRESS, () -> new ShortDoorItem(DDBlocks.SHORT_RUE_CYPRESS_DOOR.get(), conditionalTabProperties("regions_unexplored")));
    public static final RegistryObject<Item> SHORT_RUE_DEAD_DOOR = ITEMS.register(DDNames.SHORT_RUE_DEAD, () -> new ShortDoorItem(DDBlocks.SHORT_RUE_DEAD_DOOR.get(), conditionalTabProperties("regions_unexplored")));
    public static final RegistryObject<Item> SHORT_RUE_EUCALYPTUS_DOOR = ITEMS.register(DDNames.SHORT_RUE_EUCALYPTUS, () -> new ShortDoorItem(DDBlocks.SHORT_RUE_EUCALYPTUS_DOOR.get(), conditionalTabProperties("regions_unexplored")));
    public static final RegistryObject<Item> SHORT_RUE_JOSHUA_DOOR = ITEMS.register(DDNames.SHORT_RUE_JOSHUA, () -> new ShortDoorItem(DDBlocks.SHORT_RUE_JOSHUA_DOOR.get(), conditionalTabProperties("regions_unexplored")));
    public static final RegistryObject<Item> SHORT_RUE_LARCH_DOOR = ITEMS.register(DDNames.SHORT_RUE_LARCH, () -> new ShortDoorItem(DDBlocks.SHORT_RUE_LARCH_DOOR.get(), conditionalTabProperties("regions_unexplored")));
    public static final RegistryObject<Item> SHORT_RUE_MAPLE_DOOR = ITEMS.register(DDNames.SHORT_RUE_MAPLE, () -> new ShortDoorItem(DDBlocks.SHORT_RUE_MAPLE_DOOR.get(), conditionalTabProperties("regions_unexplored")));
    public static final RegistryObject<Item> SHORT_RUE_MAUVE_DOOR = ITEMS.register(DDNames.SHORT_RUE_MAUVE, () -> new ShortDoorItem(DDBlocks.SHORT_RUE_MAUVE_DOOR.get(), conditionalTabProperties("regions_unexplored")));
    public static final RegistryObject<Item> SHORT_RUE_PALM_DOOR = ITEMS.register(DDNames.SHORT_RUE_PALM, () -> new ShortDoorItem(DDBlocks.SHORT_RUE_PALM_DOOR.get(), conditionalTabProperties("regions_unexplored")));
    public static final RegistryObject<Item> SHORT_RUE_PINE_DOOR = ITEMS.register(DDNames.SHORT_RUE_PINE, () -> new ShortDoorItem(DDBlocks.SHORT_RUE_PINE_DOOR.get(), conditionalTabProperties("regions_unexplored")));
    public static final RegistryObject<Item> SHORT_RUE_REDWOOD_DOOR = ITEMS.register(DDNames.SHORT_RUE_REDWOOD, () -> new ShortDoorItem(DDBlocks.SHORT_RUE_REDWOOD_DOOR.get(), conditionalTabProperties("regions_unexplored")));
    public static final RegistryObject<Item> SHORT_RUE_WILLOW_DOOR = ITEMS.register(DDNames.SHORT_RUE_WILLOW, () -> new ShortDoorItem(DDBlocks.SHORT_RUE_WILLOW_DOOR.get(), conditionalTabProperties("regions_unexplored")));

    public static final RegistryObject<Item> TALL_RUE_BAOBAB_DOOR = ITEMS.register(DDNames.TALL_RUE_BAOBAB, () -> new TallDoorItem(DDBlocks.TALL_RUE_BAOBAB_DOOR.get(), conditionalTabProperties("regions_unexplored")));
    public static final RegistryObject<Item> TALL_RUE_BLACKWOOD_DOOR = ITEMS.register(DDNames.TALL_RUE_BLACKWOOD, () -> new TallDoorItem(DDBlocks.TALL_RUE_BLACKWOOD_DOOR.get(), conditionalTabProperties("regions_unexplored")));
    public static final RegistryObject<Item> TALL_RUE_CHERRY_DOOR = ITEMS.register(DDNames.TALL_RUE_CHERRY, () -> new TallDoorItem(DDBlocks.TALL_RUE_CHERRY_DOOR.get(), conditionalTabProperties("regions_unexplored")));
    public static final RegistryObject<Item> TALL_RUE_CYPRESS_DOOR = ITEMS.register(DDNames.TALL_RUE_CYPRESS, () -> new TallDoorItem(DDBlocks.TALL_RUE_CYPRESS_DOOR.get(), conditionalTabProperties("regions_unexplored")));
    public static final RegistryObject<Item> TALL_RUE_DEAD_DOOR = ITEMS.register(DDNames.TALL_RUE_DEAD, () -> new TallDoorItem(DDBlocks.TALL_RUE_DEAD_DOOR.get(), conditionalTabProperties("regions_unexplored")));
    public static final RegistryObject<Item> TALL_RUE_EUCALYPTUS_DOOR = ITEMS.register(DDNames.TALL_RUE_EUCALYPTUS, () -> new TallDoorItem(DDBlocks.TALL_RUE_EUCALYPTUS_DOOR.get(), conditionalTabProperties("regions_unexplored")));
    public static final RegistryObject<Item> TALL_RUE_JOSHUA_DOOR = ITEMS.register(DDNames.TALL_RUE_JOSHUA, () -> new TallDoorItem(DDBlocks.TALL_RUE_JOSHUA_DOOR.get(), conditionalTabProperties("regions_unexplored")));
    public static final RegistryObject<Item> TALL_RUE_LARCH_DOOR = ITEMS.register(DDNames.TALL_RUE_LARCH, () -> new TallDoorItem(DDBlocks.TALL_RUE_LARCH_DOOR.get(), conditionalTabProperties("regions_unexplored")));
    public static final RegistryObject<Item> TALL_RUE_MAPLE_DOOR = ITEMS.register(DDNames.TALL_RUE_MAPLE, () -> new TallDoorItem(DDBlocks.TALL_RUE_MAPLE_DOOR.get(), conditionalTabProperties("regions_unexplored")));
    public static final RegistryObject<Item> TALL_RUE_MAUVE_DOOR = ITEMS.register(DDNames.TALL_RUE_MAUVE, () -> new TallDoorItem(DDBlocks.TALL_RUE_MAUVE_DOOR.get(), conditionalTabProperties("regions_unexplored")));
    public static final RegistryObject<Item> TALL_RUE_PALM_DOOR = ITEMS.register(DDNames.TALL_RUE_PALM, () -> new TallDoorItem(DDBlocks.TALL_RUE_PALM_DOOR.get(), conditionalTabProperties("regions_unexplored")));
    public static final RegistryObject<Item> TALL_RUE_PINE_DOOR = ITEMS.register(DDNames.TALL_RUE_PINE, () -> new TallDoorItem(DDBlocks.TALL_RUE_PINE_DOOR.get(), conditionalTabProperties("regions_unexplored")));
    public static final RegistryObject<Item> TALL_RUE_REDWOOD_DOOR = ITEMS.register(DDNames.TALL_RUE_REDWOOD, () -> new TallDoorItem(DDBlocks.TALL_RUE_REDWOOD_DOOR.get(), conditionalTabProperties("regions_unexplored")));
    public static final RegistryObject<Item> TALL_RUE_WILLOW_DOOR = ITEMS.register(DDNames.TALL_RUE_WILLOW, () -> new TallDoorItem(DDBlocks.TALL_RUE_WILLOW_DOOR.get(), conditionalTabProperties("regions_unexplored")));

    // Twilight Forest
    public static final RegistryObject<Item> SHORT_CANOPY_DOOR = ITEMS.register(DDNames.SHORT_CANOPY, () -> new ShortDoorItem(DDBlocks.SHORT_CANOPY_DOOR.get(), conditionalTabProperties("twilightforest")));
    public static final RegistryObject<Item> SHORT_DARKWOOD_DOOR = ITEMS.register(DDNames.SHORT_DARKWOOD, () -> new ShortDoorItem(DDBlocks.SHORT_DARKWOOD_DOOR.get(), conditionalTabProperties("twilightforest")));
    public static final RegistryObject<Item> SHORT_TWILIGHT_MANGROVE_DOOR = ITEMS.register(DDNames.SHORT_TWILIGHT_MANGROVE, () -> new ShortDoorItem(DDBlocks.SHORT_TWILIGHT_MANGROVE_DOOR.get(), conditionalTabProperties("twilightforest")));
    public static final RegistryObject<Item> SHORT_MINEWOOD_DOOR = ITEMS.register(DDNames.SHORT_MINEWOOD, () -> new ShortDoorItem(DDBlocks.SHORT_MINEWOOD_DOOR.get(), conditionalTabProperties("twilightforest")));
    public static final RegistryObject<Item> SHORT_SORTINGWOOD_DOOR = ITEMS.register(DDNames.SHORT_SORTINGWOOD, () -> new ShortDoorItem(DDBlocks.SHORT_SORTINGWOOD_DOOR.get(), conditionalTabProperties("twilightforest")));
    public static final RegistryObject<Item> SHORT_TIMEWOOD_DOOR = ITEMS.register(DDNames.SHORT_TIMEWOOD, () -> new ShortDoorItem(DDBlocks.SHORT_TIMEWOOD_DOOR.get(), conditionalTabProperties("twilightforest")));
    public static final RegistryObject<Item> SHORT_TRANSWOOD_DOOR = ITEMS.register(DDNames.SHORT_TRANSWOOD, () -> new ShortDoorItem(DDBlocks.SHORT_TRANSWOOD_DOOR.get(), conditionalTabProperties("twilightforest")));
    public static final RegistryObject<Item> SHORT_TWILIGHT_OAK_DOOR = ITEMS.register(DDNames.SHORT_TWILIGHT_OAK, () -> new ShortDoorItem(DDBlocks.SHORT_TWILIGHT_OAK_DOOR.get(), conditionalTabProperties("twilightforest")));

    public static final RegistryObject<Item> SHORT_TOWERWOOD_DOOR = ITEMS.register(DDNames.SHORT_TOWERWOOD, () -> new ShortDoorItem(DDBlocks.SHORT_TOWERWOOD_DOOR.get(), conditionalTabProperties("tflostblocks")));

    public static final RegistryObject<Item> TALL_CANOPY_DOOR = ITEMS.register(DDNames.TALL_CANOPY, () -> new TallDoorItem(DDBlocks.TALL_CANOPY_DOOR.get(), conditionalTabProperties("twilightforest")));
    public static final RegistryObject<Item> TALL_DARKWOOD_DOOR = ITEMS.register(DDNames.TALL_DARKWOOD, () -> new TallDoorItem(DDBlocks.TALL_DARKWOOD_DOOR.get(), conditionalTabProperties("twilightforest")));
    public static final RegistryObject<Item> TALL_TWILIGHT_MANGROVE_DOOR = ITEMS.register(DDNames.TALL_TWILIGHT_MANGROVE, () -> new TallDoorItem(DDBlocks.TALL_TWILIGHT_MANGROVE_DOOR.get(), conditionalTabProperties("twilightforest")));
    public static final RegistryObject<Item> TALL_MINEWOOD_DOOR = ITEMS.register(DDNames.TALL_MINEWOOD, () -> new TallDoorItem(DDBlocks.TALL_MINEWOOD_DOOR.get(), conditionalTabProperties("twilightforest")));
    public static final RegistryObject<Item> TALL_SORTINGWOOD_DOOR = ITEMS.register(DDNames.TALL_SORTINGWOOD, () -> new TallDoorItem(DDBlocks.TALL_SORTINGWOOD_DOOR.get(), conditionalTabProperties("twilightforest")));
    public static final RegistryObject<Item> TALL_TIMEWOOD_DOOR = ITEMS.register(DDNames.TALL_TIMEWOOD, () -> new TallDoorItem(DDBlocks.TALL_TIMEWOOD_DOOR.get(), conditionalTabProperties("twilightforest")));
    public static final RegistryObject<Item> TALL_TRANSWOOD_DOOR = ITEMS.register(DDNames.TALL_TRANSWOOD, () -> new TallDoorItem(DDBlocks.TALL_TRANSWOOD_DOOR.get(), conditionalTabProperties("twilightforest")));
    public static final RegistryObject<Item> TALL_TWILIGHT_OAK_DOOR = ITEMS.register(DDNames.TALL_TWILIGHT_OAK, () -> new TallDoorItem(DDBlocks.TALL_TWILIGHT_OAK_DOOR.get(), conditionalTabProperties("twilightforest")));

    public static final RegistryObject<Item> TALL_TOWERWOOD_DOOR = ITEMS.register(DDNames.TALL_TOWERWOOD, () -> new TallDoorItem(DDBlocks.TALL_TOWERWOOD_DOOR.get(), conditionalTabProperties("tflostblocks")));

    // The Abnormals Mods (7 mod compats)
    public static final RegistryObject<Item> SHORT_ASPEN_DOOR = ITEMS.register(DDNames.SHORT_ASPEN, () -> new ShortDoorItem(DDBlocks.SHORT_ASPEN_DOOR.get(), conditionalTabProperties("atmospheric")));
    public static final RegistryObject<Item> SHORT_GRIMWOOD_DOOR = ITEMS.register(DDNames.SHORT_GRIMWOOD, () -> new ShortDoorItem(DDBlocks.SHORT_GRIMWOOD_DOOR.get(), conditionalTabProperties("atmospheric")));
    public static final RegistryObject<Item> SHORT_KOUSA_DOOR = ITEMS.register(DDNames.SHORT_KOUSA, () -> new ShortDoorItem(DDBlocks.SHORT_KOUSA_DOOR.get(), conditionalTabProperties("atmospheric")));
    public static final RegistryObject<Item> SHORT_MORADO_DOOR = ITEMS.register(DDNames.SHORT_MORADO, () -> new ShortDoorItem(DDBlocks.SHORT_MORADO_DOOR.get(), conditionalTabProperties("atmospheric")));
    public static final RegistryObject<Item> SHORT_ROSEWOOD_DOOR = ITEMS.register(DDNames.SHORT_ROSEWOOD, () -> new ShortDoorItem(DDBlocks.SHORT_ROSEWOOD_DOOR.get(), conditionalTabProperties("atmospheric")));
    public static final RegistryObject<Item> SHORT_YUCCA_DOOR = ITEMS.register(DDNames.SHORT_YUCCA, () -> new ShortDoorItem(DDBlocks.SHORT_YUCCA_DOOR.get(), conditionalTabProperties("atmospheric")));
    public static final RegistryObject<Item> SHORT_MAPLE_DOOR = ITEMS.register(DDNames.SHORT_MAPLE, () -> new ShortDoorItem(DDBlocks.SHORT_MAPLE_DOOR.get(), conditionalTabProperties("autumnity")));
    public static final RegistryObject<Item> SHORT_HONEYCOMB_DOOR = ITEMS.register(DDNames.SHORT_HONEYCOMB, () -> new ShortDoorItem(DDBlocks.SHORT_HONEYCOMB_DOOR.get(), conditionalTabProperties("buzzier_bees")));
    public static final RegistryObject<Item> SHORT_AZALEA_DOOR = ITEMS.register(DDNames.SHORT_AZALEA, () -> new ShortDoorItem(DDBlocks.SHORT_AZALEA_DOOR.get(), conditionalTabProperties("caverns_and_chasms")));
    public static final RegistryObject<Item> SHORT_POISE_DOOR = ITEMS.register(DDNames.SHORT_POISE, () -> new ShortDoorItem(DDBlocks.SHORT_POISE_DOOR.get(), conditionalTabProperties("endergetic")));
    public static final RegistryObject<Item> SHORT_CHERRY_DOOR = ITEMS.register(DDNames.SHORT_CHERRY, () -> new ShortDoorItem(DDBlocks.SHORT_CHERRY_DOOR.get(), conditionalTabProperties("environmental")));
    public static final RegistryObject<Item> SHORT_WILLOW_DOOR = ITEMS.register(DDNames.SHORT_WILLOW, () -> new ShortDoorItem(DDBlocks.SHORT_WILLOW_DOOR.get(), conditionalTabProperties("environmental")));
    public static final RegistryObject<Item> SHORT_WISTERIA_DOOR = ITEMS.register(DDNames.SHORT_WISTERIA, () -> new ShortDoorItem(DDBlocks.SHORT_WISTERIA_DOOR.get(), conditionalTabProperties("environmental")));
    public static final RegistryObject<Item> SHORT_DRIFTWOOD_DOOR = ITEMS.register(DDNames.SHORT_DRIFTWOOD, () -> new ShortDoorItem(DDBlocks.SHORT_DRIFTWOOD_DOOR.get(), conditionalTabProperties("upgrade_aquatic")));
    public static final RegistryObject<Item> SHORT_RIVER_DOOR = ITEMS.register(DDNames.SHORT_RIVER, () -> new ShortDoorItem(DDBlocks.SHORT_RIVER_DOOR.get(), conditionalTabProperties("upgrade_aquatic")));
    public static final RegistryObject<Item> SHORT_GLASS_DOOR = ITEMS.register(DDNames.SHORT_GLASS, () -> new ShortDoorItem(DDBlocks.SHORT_GLASS_DOOR.get(), conditionalTabProperties("upgrade_aquatic")));
    public static final RegistryObject<Item> SHORT_TOOTH_DOOR = ITEMS.register(DDNames.SHORT_TOOTH, () -> new ShortDoorItem(DDBlocks.SHORT_TOOTH_DOOR.get(), conditionalTabProperties("upgrade_aquatic")));

    public static final RegistryObject<Item> TALL_ASPEN_DOOR = ITEMS.register(DDNames.TALL_ASPEN, () -> new TallDoorItem(DDBlocks.TALL_ASPEN_DOOR.get(), conditionalTabProperties("atmospheric")));
    public static final RegistryObject<Item> TALL_GRIMWOOD_DOOR = ITEMS.register(DDNames.TALL_GRIMWOOD, () -> new TallDoorItem(DDBlocks.TALL_GRIMWOOD_DOOR.get(), conditionalTabProperties("atmospheric")));
    public static final RegistryObject<Item> TALL_KOUSA_DOOR = ITEMS.register(DDNames.TALL_KOUSA, () -> new TallDoorItem(DDBlocks.TALL_KOUSA_DOOR.get(), conditionalTabProperties("atmospheric")));
    public static final RegistryObject<Item> TALL_MORADO_DOOR = ITEMS.register(DDNames.TALL_MORADO, () -> new TallDoorItem(DDBlocks.TALL_MORADO_DOOR.get(), conditionalTabProperties("atmospheric")));
    public static final RegistryObject<Item> TALL_ROSEWOOD_DOOR = ITEMS.register(DDNames.TALL_ROSEWOOD, () -> new TallDoorItem(DDBlocks.TALL_ROSEWOOD_DOOR.get(), conditionalTabProperties("atmospheric")));
    public static final RegistryObject<Item> TALL_YUCCA_DOOR = ITEMS.register(DDNames.TALL_YUCCA, () -> new TallDoorItem(DDBlocks.TALL_YUCCA_DOOR.get(), conditionalTabProperties("atmospheric")));
    public static final RegistryObject<Item> TALL_MAPLE_DOOR = ITEMS.register(DDNames.TALL_MAPLE, () -> new TallDoorItem(DDBlocks.TALL_MAPLE_DOOR.get(), conditionalTabProperties("autumnity")));
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

    // Team Aurora Mods (3 mod compats)
    public static final RegistryObject<Item> SHORT_JACARANDA_DOOR = ITEMS.register(DDNames.SHORT_JACARANDA, () -> new ShortDoorItem(DDBlocks.SHORT_JACARANDA_DOOR.get(), conditionalTabProperties("abundance")));
    public static final RegistryObject<Item> SHORT_REDBUD_DOOR = ITEMS.register(DDNames.SHORT_REDBUD, () -> new ShortDoorItem(DDBlocks.SHORT_REDBUD_DOOR.get(), conditionalTabProperties("abundance")));
    public static final RegistryObject<Item> SHORT_CYPRESS_DOOR = ITEMS.register(DDNames.SHORT_CYPRESS, () -> new ShortDoorItem(DDBlocks.SHORT_CYPRESS_DOOR.get(), conditionalTabProperties("bayou_blues")));
    public static final RegistryObject<Item> SHORT_BROWN_MUSHROOM_DOOR = ITEMS.register(DDNames.SHORT_BROWN_MUSHROOM, () -> new ShortDoorItem(DDBlocks.SHORT_BROWN_MUSHROOM_DOOR.get(), conditionalTabProperties("enhanced_mushrooms")));
    public static final RegistryObject<Item> SHORT_RED_MUSHROOM_DOOR = ITEMS.register(DDNames.SHORT_RED_MUSHROOM, () -> new ShortDoorItem(DDBlocks.SHORT_RED_MUSHROOM_DOOR.get(), conditionalTabProperties("enhanced_mushrooms")));

    public static final RegistryObject<Item> TALL_JACARANDA_DOOR = ITEMS.register(DDNames.TALL_JACARANDA, () -> new TallDoorItem(DDBlocks.TALL_JACARANDA_DOOR.get(), conditionalTabProperties("abundance")));
    public static final RegistryObject<Item> TALL_REDBUD_DOOR = ITEMS.register(DDNames.TALL_REDBUD, () -> new TallDoorItem(DDBlocks.TALL_REDBUD_DOOR.get(), conditionalTabProperties("abundance")));
    public static final RegistryObject<Item> TALL_CYPRESS_DOOR = ITEMS.register(DDNames.TALL_CYPRESS, () -> new TallDoorItem(DDBlocks.TALL_CYPRESS_DOOR.get(), conditionalTabProperties("bayou_blues")));
    public static final RegistryObject<Item> TALL_BROWN_MUSHROOM_DOOR = ITEMS.register(DDNames.TALL_BROWN_MUSHROOM, () -> new TallDoorItem(DDBlocks.TALL_BROWN_MUSHROOM_DOOR.get(), conditionalTabProperties("enhanced_mushrooms")));
    public static final RegistryObject<Item> TALL_RED_MUSHROOM_DOOR = ITEMS.register(DDNames.TALL_RED_MUSHROOM, () -> new TallDoorItem(DDBlocks.TALL_RED_MUSHROOM_DOOR.get(), conditionalTabProperties("enhanced_mushrooms")));

    // Ad Astra
    public static final RegistryObject<Item> SHORT_AERONOS_DOOR = ITEMS.register(DDNames.SHORT_AERONOS, () -> new ShortDoorItem(DDBlocks.SHORT_AERONOS_DOOR.get(), conditionalTabProperties("ad_astra")));
    public static final RegistryObject<Item> SHORT_GLACIAN_DOOR = ITEMS.register(DDNames.SHORT_GLACIAN, () -> new ShortDoorItem(DDBlocks.SHORT_GLACIAN_DOOR.get(), conditionalTabProperties("ad_astra")));
    public static final RegistryObject<Item> SHORT_STROPHAR_DOOR = ITEMS.register(DDNames.SHORT_STROPHAR, () -> new ShortDoorItem(DDBlocks.SHORT_STROPHAR_DOOR.get(), conditionalTabProperties("ad_astra")));
    public static final RegistryObject<Item> SHORT_AA_STEEL_DOOR = ITEMS.register(DDNames.SHORT_AA_STEEL, () -> new ShortDoorItem(DDBlocks.SHORT_AA_STEEL_DOOR.get(), conditionalTabProperties("ad_astra")));
    
    public static final RegistryObject<Item> TALL_AERONOS_DOOR = ITEMS.register(DDNames.TALL_AERONOS, () -> new TallDoorItem(DDBlocks.TALL_AERONOS_DOOR.get(), conditionalTabProperties("ad_astra")));
    public static final RegistryObject<Item> TALL_GLACIAN_DOOR = ITEMS.register(DDNames.TALL_GLACIAN, () -> new TallDoorItem(DDBlocks.TALL_GLACIAN_DOOR.get(), conditionalTabProperties("ad_astra")));
    public static final RegistryObject<Item> TALL_STROPHAR_DOOR = ITEMS.register(DDNames.TALL_STROPHAR, () -> new TallDoorItem(DDBlocks.TALL_STROPHAR_DOOR.get(), conditionalTabProperties("ad_astra")));
    public static final RegistryObject<Item> TALL_AA_STEEL_DOOR = ITEMS.register(DDNames.TALL_AA_STEEL, () -> new TallDoorItem(DDBlocks.TALL_AA_STEEL_DOOR.get(), conditionalTabProperties("ad_astra")));
    
    // Abundant Atmosphere
    public static final RegistryObject<Item> SHORT_ASH_DOOR = ITEMS.register(DDNames.SHORT_ASH, () -> new ShortDoorItem(DDBlocks.SHORT_ASH_DOOR.get(), conditionalTabProperties("abundant_atmosphere")));    
    public static final RegistryObject<Item> SHORT_GOURDROT_DOOR = ITEMS.register(DDNames.SHORT_GOURDROT, () -> new ShortDoorItem(DDBlocks.SHORT_GOURDROT_DOOR.get(), conditionalTabProperties("abundant_atmosphere")));    
    
    public static final RegistryObject<Item> TALL_ASH_DOOR = ITEMS.register(DDNames.TALL_ASH, () -> new TallDoorItem(DDBlocks.TALL_ASH_DOOR.get(), conditionalTabProperties("abundant_atmosphere")));    
    public static final RegistryObject<Item> TALL_GOURDROT_DOOR = ITEMS.register(DDNames.TALL_GOURDROT, () -> new TallDoorItem(DDBlocks.TALL_GOURDROT_DOOR.get(), conditionalTabProperties("abundant_atmosphere")));    
    
    // Architects Palette
    public static final RegistryObject<Item> SHORT_TWISTED_DOOR = ITEMS.register(DDNames.SHORT_TWISTED, () -> new ShortDoorItem(DDBlocks.SHORT_TWISTED_DOOR.get(), conditionalTabProperties("architects_palette")));
    
    public static final RegistryObject<Item> TALL_TWISTED_DOOR = ITEMS.register(DDNames.TALL_TWISTED, () -> new TallDoorItem(DDBlocks.TALL_TWISTED_DOOR.get(), conditionalTabProperties("architects_palette")));
    
    // Ars Nouveau
    public static final RegistryObject<Item> SHORT_ARCHWOOD_DOOR = ITEMS.register(DDNames.SHORT_ARCHWOOD, () -> new ShortDoorItem(DDBlocks.SHORT_ARCHWOOD_DOOR.get(), conditionalTabProperties("ars_nouveau")));
    
    public static final RegistryObject<Item> TALL_ARCHWOOD_DOOR = ITEMS.register(DDNames.TALL_ARCHWOOD, () -> new TallDoorItem(DDBlocks.TALL_ARCHWOOD_DOOR.get(), conditionalTabProperties("ars_nouveau")));
    
    // Bamboo Everything
    public static final RegistryObject<Item> SHORT_BE_BAMBOO_DOOR = ITEMS.register(DDNames.SHORT_BE_BAMBOO, () -> new ShortDoorItem(DDBlocks.SHORT_BE_BAMBOO_DOOR.get(), conditionalTabProperties("bambooeverything")));  
    public static final RegistryObject<Item> SHORT_BE_DRY_BAMBOO_DOOR = ITEMS.register(DDNames.SHORT_BE_DRY_BAMBOO, () -> new ShortDoorItem(DDBlocks.SHORT_BE_DRY_BAMBOO_DOOR.get(), conditionalTabProperties("bambooeverything")));  
    
    public static final RegistryObject<Item> TALL_BE_BAMBOO_DOOR = ITEMS.register(DDNames.TALL_BE_BAMBOO, () -> new TallDoorItem(DDBlocks.TALL_BE_BAMBOO_DOOR.get(), conditionalTabProperties("bambooeverything")));  
    public static final RegistryObject<Item> TALL_BE_DRY_BAMBOO_DOOR = ITEMS.register(DDNames.TALL_BE_DRY_BAMBOO, () -> new TallDoorItem(DDBlocks.TALL_BE_DRY_BAMBOO_DOOR.get(), conditionalTabProperties("bambooeverything")));  
    
    // Biomancy
    public static final RegistryObject<Item> SHORT_FLESH_DOOR = ITEMS.register(DDNames.SHORT_FLESH, () -> new ShortDoorItem(DDBlocks.SHORT_FLESH_DOOR.get(), conditionalTabProperties("biomancy")));  
    public static final RegistryObject<Item> SHORT_FULL_FLESH_DOOR = ITEMS.register(DDNames.SHORT_FULL_FLESH, () -> new ShortDoorItem(DDBlocks.SHORT_FULL_FLESH_DOOR.get(), addIfItemIsAvailable(new ResourceLocation("biomancy", "full_flesh_door"), conditionalTabProperties("biomancy"))));
    public static final RegistryObject<Item> SHORT_FLESHKIN_DOOR = ITEMS.register(DDNames.SHORT_FLESHKIN, () -> new ShortDoorItem(DDBlocks.SHORT_FLESHKIN_DOOR.get(), addIfItemIsAvailable(new ResourceLocation("biomancy", "fleshkin_door"), conditionalTabProperties("biomancy"))));  

    public static final RegistryObject<Item> TALL_FLESH_DOOR = ITEMS.register(DDNames.TALL_FLESH, () -> new TallDoorItem(DDBlocks.TALL_FLESH_DOOR.get(), conditionalTabProperties("biomancy")));  
    public static final RegistryObject<Item> TALL_FULL_FLESH_DOOR = ITEMS.register(DDNames.TALL_FULL_FLESH, () -> new TallDoorItem(DDBlocks.TALL_FULL_FLESH_DOOR.get(), addIfItemIsAvailable(new ResourceLocation("biomancy", "full_flesh_door"), conditionalTabProperties("biomancy"))));
    public static final RegistryObject<Item> TALL_FLESHKIN_DOOR = ITEMS.register(DDNames.TALL_FLESHKIN, () -> new TallDoorItem(DDBlocks.TALL_FLESHKIN_DOOR.get(), addIfItemIsAvailable(new ResourceLocation("biomancy", "fleshkin_door"), conditionalTabProperties("biomancy"))));  

    // Biome Makeover
    public static final RegistryObject<Item> SHORT_BM_ANCIENT_OAK_DOOR = ITEMS.register(DDNames.SHORT_BM_ANCIENT_OAK, () -> new ShortDoorItem(DDBlocks.SHORT_BM_ANCIENT_OAK_DOOR.get(), conditionalTabProperties("biomemakeover")));
    public static final RegistryObject<Item> SHORT_BM_BLIGHTED_BALSA_DOOR = ITEMS.register(DDNames.SHORT_BM_BLIGHTED_BALSA, () -> new ShortDoorItem(DDBlocks.SHORT_BM_BLIGHTED_BALSA_DOOR.get(), conditionalTabProperties("biomemakeover")));
    public static final RegistryObject<Item> SHORT_BM_SWAMP_CYPRESS_DOOR = ITEMS.register(DDNames.SHORT_BM_SWAMP_CYPRESS, () -> new ShortDoorItem(DDBlocks.SHORT_BM_SWAMP_CYPRESS_DOOR.get(), conditionalTabProperties("biomemakeover")));
    public static final RegistryObject<Item> SHORT_BM_WILLOW_DOOR = ITEMS.register(DDNames.SHORT_BM_WILLOW, () -> new ShortDoorItem(DDBlocks.SHORT_BM_WILLOW_DOOR.get(), conditionalTabProperties("biomemakeover")));
    
    public static final RegistryObject<Item> TALL_BM_ANCIENT_OAK_DOOR = ITEMS.register(DDNames.TALL_BM_ANCIENT_OAK, () -> new TallDoorItem(DDBlocks.TALL_BM_ANCIENT_OAK_DOOR.get(), conditionalTabProperties("biomemakeover")));
    public static final RegistryObject<Item> TALL_BM_BLIGHTED_BALSA_DOOR = ITEMS.register(DDNames.TALL_BM_BLIGHTED_BALSA, () -> new TallDoorItem(DDBlocks.TALL_BM_BLIGHTED_BALSA_DOOR.get(), conditionalTabProperties("biomemakeover")));
    public static final RegistryObject<Item> TALL_BM_SWAMP_CYPRESS_DOOR = ITEMS.register(DDNames.TALL_BM_SWAMP_CYPRESS, () -> new TallDoorItem(DDBlocks.TALL_BM_SWAMP_CYPRESS_DOOR.get(), conditionalTabProperties("biomemakeover")));
    public static final RegistryObject<Item> TALL_BM_WILLOW_DOOR = ITEMS.register(DDNames.TALL_BM_WILLOW, () -> new TallDoorItem(DDBlocks.TALL_BM_WILLOW_DOOR.get(), conditionalTabProperties("biomemakeover")));
    
    // Blocks+
    public static final RegistryObject<Item> SHORT_BP_BAMBOO_DOOR = ITEMS.register(DDNames.SHORT_BP_BAMBOO, () -> new ShortDoorItem(DDBlocks.SHORT_BP_BAMBOO_DOOR.get(), conditionalTabProperties("blocksplus")));
    public static final RegistryObject<Item> SHORT_BP_MUSHROOM_DOOR = ITEMS.register(DDNames.SHORT_BP_MUSHROOM, () -> new ShortDoorItem(DDBlocks.SHORT_BP_MUSHROOM_DOOR.get(), conditionalTabProperties("blocksplus")));
    public static final RegistryObject<Item> SHORT_BP_COPPER_DOOR = ITEMS.register(DDNames.SHORT_BP_COPPER, () -> new ShortDoorItem(DDBlocks.SHORT_BP_COPPER_DOOR.get(), conditionalTabProperties("blocksplus")));
    public static final RegistryObject<Item> SHORT_BP_GOLDEN_DOOR = ITEMS.register(DDNames.SHORT_BP_GOLDEN, () -> new ShortDoorItem(DDBlocks.SHORT_BP_GOLDEN_DOOR.get(), conditionalTabProperties("blocksplus")));
    public static final RegistryObject<Item> SHORT_BP_DIAMOND_DOOR = ITEMS.register(DDNames.SHORT_BP_DIAMOND, () -> new ShortDoorItem(DDBlocks.SHORT_BP_DIAMOND_DOOR.get(), conditionalTabProperties("blocksplus")));
    public static final RegistryObject<Item> SHORT_BP_EMERALD_DOOR = ITEMS.register(DDNames.SHORT_BP_EMERALD, () -> new ShortDoorItem(DDBlocks.SHORT_BP_EMERALD_DOOR.get(), conditionalTabProperties("blocksplus")));
    public static final RegistryObject<Item> SHORT_BP_NETHERITE_DOOR = ITEMS.register(DDNames.SHORT_BP_NETHERITE, () -> new ShortDoorItem(DDBlocks.SHORT_BP_NETHERITE_DOOR.get(), conditionalTabProperties("blocksplus").fireResistant()));
    
    public static final RegistryObject<Item> TALL_BP_BAMBOO_DOOR = ITEMS.register(DDNames.TALL_BP_BAMBOO, () -> new TallDoorItem(DDBlocks.TALL_BP_BAMBOO_DOOR.get(), conditionalTabProperties("blocksplus")));
    public static final RegistryObject<Item> TALL_BP_MUSHROOM_DOOR = ITEMS.register(DDNames.TALL_BP_MUSHROOM, () -> new TallDoorItem(DDBlocks.TALL_BP_MUSHROOM_DOOR.get(), conditionalTabProperties("blocksplus")));
    public static final RegistryObject<Item> TALL_BP_COPPER_DOOR = ITEMS.register(DDNames.TALL_BP_COPPER, () -> new TallDoorItem(DDBlocks.TALL_BP_COPPER_DOOR.get(), conditionalTabProperties("blocksplus")));
    public static final RegistryObject<Item> TALL_BP_GOLDEN_DOOR = ITEMS.register(DDNames.TALL_BP_GOLDEN, () -> new TallDoorItem(DDBlocks.TALL_BP_GOLDEN_DOOR.get(), conditionalTabProperties("blocksplus")));
    public static final RegistryObject<Item> TALL_BP_DIAMOND_DOOR = ITEMS.register(DDNames.TALL_BP_DIAMOND, () -> new TallDoorItem(DDBlocks.TALL_BP_DIAMOND_DOOR.get(), conditionalTabProperties("blocksplus")));
    public static final RegistryObject<Item> TALL_BP_EMERALD_DOOR = ITEMS.register(DDNames.TALL_BP_EMERALD, () -> new TallDoorItem(DDBlocks.TALL_BP_EMERALD_DOOR.get(), conditionalTabProperties("blocksplus")));
    public static final RegistryObject<Item> TALL_BP_NETHERITE_DOOR = ITEMS.register(DDNames.TALL_BP_NETHERITE, () -> new TallDoorItem(DDBlocks.TALL_BP_NETHERITE_DOOR.get(), conditionalTabProperties("blocksplus").fireResistant()));
    
    // Blue Skies
    public static final RegistryObject<Item> SHORT_BS_BLUEBRIGHT_DOOR = ITEMS.register(DDNames.SHORT_BS_BLUEBRIGHT, () -> new ShortDoorItem(DDBlocks.SHORT_BS_BLUEBRIGHT_DOOR.get(), conditionalTabProperties("blue_skies")));
    public static final RegistryObject<Item> SHORT_BS_CHERRY_DOOR = ITEMS.register(DDNames.SHORT_BS_CHERRY, () -> new ShortDoorItem(DDBlocks.SHORT_BS_CHERRY_DOOR.get(), conditionalTabProperties("blue_skies")));
    public static final RegistryObject<Item> SHORT_BS_CRYSTALLIZED_DOOR = ITEMS.register(DDNames.SHORT_BS_CRYSTALLIZED, () -> new ShortDoorItem(DDBlocks.SHORT_BS_CRYSTALLIZED_DOOR.get(), conditionalTabProperties("blue_skies")));
    public static final RegistryObject<Item> SHORT_BS_DUSK_DOOR = ITEMS.register(DDNames.SHORT_BS_DUSK, () -> new ShortDoorItem(DDBlocks.SHORT_BS_DUSK_DOOR.get(), conditionalTabProperties("blue_skies")));
    public static final RegistryObject<Item> SHORT_BS_FROSTBRIGHT_DOOR = ITEMS.register(DDNames.SHORT_BS_FROSTBRIGHT, () -> new ShortDoorItem(DDBlocks.SHORT_BS_FROSTBRIGHT_DOOR.get(), conditionalTabProperties("blue_skies")));
    public static final RegistryObject<Item> SHORT_BS_LUNAR_DOOR = ITEMS.register(DDNames.SHORT_BS_LUNAR, () -> new ShortDoorItem(DDBlocks.SHORT_BS_LUNAR_DOOR.get(), conditionalTabProperties("blue_skies")));
    public static final RegistryObject<Item> SHORT_BS_MAPLE_DOOR = ITEMS.register(DDNames.SHORT_BS_MAPLE, () -> new ShortDoorItem(DDBlocks.SHORT_BS_MAPLE_DOOR.get(), conditionalTabProperties("blue_skies")));
    public static final RegistryObject<Item> SHORT_BS_STARLIT_DOOR = ITEMS.register(DDNames.SHORT_BS_STARLIT, () -> new ShortDoorItem(DDBlocks.SHORT_BS_STARLIT_DOOR.get(), conditionalTabProperties("blue_skies")));
    
    public static final RegistryObject<Item> TALL_BS_BLUEBRIGHT_DOOR = ITEMS.register(DDNames.TALL_BS_BLUEBRIGHT, () -> new TallDoorItem(DDBlocks.TALL_BS_BLUEBRIGHT_DOOR.get(), conditionalTabProperties("blue_skies")));
    public static final RegistryObject<Item> TALL_BS_CHERRY_DOOR = ITEMS.register(DDNames.TALL_BS_CHERRY, () -> new TallDoorItem(DDBlocks.TALL_BS_CHERRY_DOOR.get(), conditionalTabProperties("blue_skies")));
    public static final RegistryObject<Item> TALL_BS_CRYSTALLIZED_DOOR = ITEMS.register(DDNames.TALL_BS_CRYSTALLIZED, () -> new TallDoorItem(DDBlocks.TALL_BS_CRYSTALLIZED_DOOR.get(), conditionalTabProperties("blue_skies")));
    public static final RegistryObject<Item> TALL_BS_DUSK_DOOR = ITEMS.register(DDNames.TALL_BS_DUSK, () -> new TallDoorItem(DDBlocks.TALL_BS_DUSK_DOOR.get(), conditionalTabProperties("blue_skies")));
    public static final RegistryObject<Item> TALL_BS_FROSTBRIGHT_DOOR = ITEMS.register(DDNames.TALL_BS_FROSTBRIGHT, () -> new TallDoorItem(DDBlocks.TALL_BS_FROSTBRIGHT_DOOR.get(), conditionalTabProperties("blue_skies")));
    public static final RegistryObject<Item> TALL_BS_LUNAR_DOOR = ITEMS.register(DDNames.TALL_BS_LUNAR, () -> new TallDoorItem(DDBlocks.TALL_BS_LUNAR_DOOR.get(), conditionalTabProperties("blue_skies")));
    public static final RegistryObject<Item> TALL_BS_MAPLE_DOOR = ITEMS.register(DDNames.TALL_BS_MAPLE, () -> new TallDoorItem(DDBlocks.TALL_BS_MAPLE_DOOR.get(), conditionalTabProperties("blue_skies")));
    public static final RegistryObject<Item> TALL_BS_STARLIT_DOOR = ITEMS.register(DDNames.TALL_BS_STARLIT, () -> new TallDoorItem(DDBlocks.TALL_BS_STARLIT_DOOR.get(), conditionalTabProperties("blue_skies")));
    
    // Caupona
    public static final RegistryObject<Item> SHORT_WALNUT_DOOR = ITEMS.register(DDNames.SHORT_WALNUT, () -> new ShortDoorItem(DDBlocks.SHORT_WALNUT_DOOR.get(), conditionalTabProperties("caupona")));

    public static final RegistryObject<Item> TALL_WALNUT_DOOR = ITEMS.register(DDNames.TALL_WALNUT, () -> new TallDoorItem(DDBlocks.TALL_WALNUT_DOOR.get(), conditionalTabProperties("caupona")));
    
    // The Ceilands
    public static final RegistryObject<Item> SHORT_CEILTRUNK_DOOR = ITEMS.register(DDNames.SHORT_CEILTRUNK, () -> new ShortDoorItem(DDBlocks.SHORT_CEILTRUNK_DOOR.get(), conditionalTabProperties("ceilands")));
    public static final RegistryObject<Item> SHORT_LUZAWOOD_DOOR = ITEMS.register(DDNames.SHORT_LUZAWOOD, () -> new ShortDoorItem(DDBlocks.SHORT_LUZAWOOD_DOOR.get(), conditionalTabProperties("ceilands")));
    
    public static final RegistryObject<Item> TALL_CEILTRUNK_DOOR = ITEMS.register(DDNames.TALL_CEILTRUNK, () -> new TallDoorItem(DDBlocks.TALL_CEILTRUNK_DOOR.get(), conditionalTabProperties("ceilands")));
    public static final RegistryObject<Item> TALL_LUZAWOOD_DOOR = ITEMS.register(DDNames.TALL_LUZAWOOD, () -> new TallDoorItem(DDBlocks.TALL_LUZAWOOD_DOOR.get(), conditionalTabProperties("ceilands")));
    
    // Cobblemon
    public static final RegistryObject<Item> SHORT_APRICORN_DOOR = ITEMS.register(DDNames.SHORT_APRICORN, () -> new ShortDoorItem(DDBlocks.SHORT_APRICORN_DOOR.get(), conditionalTabProperties("cobblemon")));
    
    public static final RegistryObject<Item> TALL_APRICORN_DOOR = ITEMS.register(DDNames.TALL_APRICORN, () -> new TallDoorItem(DDBlocks.TALL_APRICORN_DOOR.get(), conditionalTabProperties("cobblemon")));
    
    // Colourful Azaleas
    public static final RegistryObject<Item> SHORT_AZULE_AZALEA_DOOR = ITEMS.register(DDNames.SHORT_AZULE_AZALEA, () -> new ShortDoorItem(DDBlocks.SHORT_AZULE_AZALEA_DOOR.get(), conditionalTabProperties("colorfulazaleas")));
    public static final RegistryObject<Item> SHORT_BRIGHT_AZALEA_DOOR = ITEMS.register(DDNames.SHORT_BRIGHT_AZALEA, () -> new ShortDoorItem(DDBlocks.SHORT_BRIGHT_AZALEA_DOOR.get(), conditionalTabProperties("colorfulazaleas")));
    public static final RegistryObject<Item> SHORT_FISS_AZALEA_DOOR = ITEMS.register(DDNames.SHORT_FISS_AZALEA, () -> new ShortDoorItem(DDBlocks.SHORT_FISS_AZALEA_DOOR.get(), conditionalTabProperties("colorfulazaleas")));
    public static final RegistryObject<Item> SHORT_ROZE_AZALEA_DOOR = ITEMS.register(DDNames.SHORT_ROZE_AZALEA, () -> new ShortDoorItem(DDBlocks.SHORT_ROZE_AZALEA_DOOR.get(), conditionalTabProperties("colorfulazaleas")));
    public static final RegistryObject<Item> SHORT_TECAL_AZALEA_DOOR = ITEMS.register(DDNames.SHORT_TECAL_AZALEA, () -> new ShortDoorItem(DDBlocks.SHORT_TECAL_AZALEA_DOOR.get(), conditionalTabProperties("colorfulazaleas")));
    public static final RegistryObject<Item> SHORT_TITANIUM_AZALEA_DOOR = ITEMS.register(DDNames.SHORT_TITANIUM_AZALEA, () -> new ShortDoorItem(DDBlocks.SHORT_TITANIUM_AZALEA_DOOR.get(), conditionalTabProperties("colorfulazaleas")));
    public static final RegistryObject<Item> SHORT_WALNUT_AZALEA_DOOR = ITEMS.register(DDNames.SHORT_WALNUT_AZALEA, () -> new ShortDoorItem(DDBlocks.SHORT_WALNUT_AZALEA_DOOR.get(), conditionalTabProperties("colorfulazaleas")));
    
    public static final RegistryObject<Item> TALL_AZULE_AZALEA_DOOR = ITEMS.register(DDNames.TALL_AZULE_AZALEA, () -> new TallDoorItem(DDBlocks.TALL_AZULE_AZALEA_DOOR.get(), conditionalTabProperties("colorfulazaleas")));
    public static final RegistryObject<Item> TALL_BRIGHT_AZALEA_DOOR = ITEMS.register(DDNames.TALL_BRIGHT_AZALEA, () -> new TallDoorItem(DDBlocks.TALL_BRIGHT_AZALEA_DOOR.get(), conditionalTabProperties("colorfulazaleas")));
    public static final RegistryObject<Item> TALL_FISS_AZALEA_DOOR = ITEMS.register(DDNames.TALL_FISS_AZALEA, () -> new TallDoorItem(DDBlocks.TALL_FISS_AZALEA_DOOR.get(), conditionalTabProperties("colorfulazaleas")));
    public static final RegistryObject<Item> TALL_ROZE_AZALEA_DOOR = ITEMS.register(DDNames.TALL_ROZE_AZALEA, () -> new TallDoorItem(DDBlocks.TALL_ROZE_AZALEA_DOOR.get(), conditionalTabProperties("colorfulazaleas")));
    public static final RegistryObject<Item> TALL_TECAL_AZALEA_DOOR = ITEMS.register(DDNames.TALL_TECAL_AZALEA, () -> new TallDoorItem(DDBlocks.TALL_TECAL_AZALEA_DOOR.get(), conditionalTabProperties("colorfulazaleas")));
    public static final RegistryObject<Item> TALL_TITANIUM_AZALEA_DOOR = ITEMS.register(DDNames.TALL_TITANIUM_AZALEA, () -> new TallDoorItem(DDBlocks.TALL_TITANIUM_AZALEA_DOOR.get(), conditionalTabProperties("colorfulazaleas")));
    public static final RegistryObject<Item> TALL_WALNUT_AZALEA_DOOR = ITEMS.register(DDNames.TALL_WALNUT_AZALEA, () -> new TallDoorItem(DDBlocks.TALL_WALNUT_AZALEA_DOOR.get(), conditionalTabProperties("colorfulazaleas")));
    
    // Copper Overhaul
    public static final RegistryObject<Item> SHORT_CO_COPPER_DOOR = ITEMS.register(DDNames.SHORT_CO_COPPER, () -> new ShortDoorItem(DDBlocks.SHORT_CO_COPPER_DOOR.get(), conditionalTabProperties("copperoverhaul")));
    public static final RegistryObject<Item> SHORT_CO_EXPOSED_COPPER_DOOR = ITEMS.register(DDNames.SHORT_CO_EXPOSED_COPPER, () -> new ShortDoorItem(DDBlocks.SHORT_CO_EXPOSED_COPPER_DOOR.get(), conditionalTabProperties("copperoverhaul")));
    public static final RegistryObject<Item> SHORT_CO_WEATHERED_COPPER_DOOR = ITEMS.register(DDNames.SHORT_CO_WEATHERED_COPPER, () -> new ShortDoorItem(DDBlocks.SHORT_CO_WEATHERED_COPPER_DOOR.get(), conditionalTabProperties("copperoverhaul")));
    public static final RegistryObject<Item> SHORT_CO_OXIDIZED_COPPER_DOOR = ITEMS.register(DDNames.SHORT_CO_OXIDIZED_COPPER, () -> new ShortDoorItem(DDBlocks.SHORT_CO_OXIDIZED_COPPER_DOOR.get(), conditionalTabProperties("copperoverhaul")));
    
    public static final RegistryObject<Item> TALL_CO_COPPER_DOOR = ITEMS.register(DDNames.TALL_CO_COPPER, () -> new TallDoorItem(DDBlocks.TALL_CO_COPPER_DOOR.get(), conditionalTabProperties("copperoverhaul")));
    public static final RegistryObject<Item> TALL_CO_EXPOSED_COPPER_DOOR = ITEMS.register(DDNames.TALL_CO_EXPOSED_COPPER, () -> new TallDoorItem(DDBlocks.TALL_CO_EXPOSED_COPPER_DOOR.get(), conditionalTabProperties("copperoverhaul")));
    public static final RegistryObject<Item> TALL_CO_WEATHERED_COPPER_DOOR = ITEMS.register(DDNames.TALL_CO_WEATHERED_COPPER, () -> new TallDoorItem(DDBlocks.TALL_CO_WEATHERED_COPPER_DOOR.get(), conditionalTabProperties("copperoverhaul")));
    public static final RegistryObject<Item> TALL_CO_OXIDIZED_COPPER_DOOR = ITEMS.register(DDNames.TALL_CO_OXIDIZED_COPPER, () -> new TallDoorItem(DDBlocks.TALL_CO_OXIDIZED_COPPER_DOOR.get(), conditionalTabProperties("copperoverhaul")));
    
    // Create: Alloyed
    public static final RegistryObject<Item> SHORT_STEEL_DOOR = ITEMS.register(DDNames.SHORT_STEEL, () -> new ShortDoorItem(DDBlocks.SHORT_STEEL_DOOR.get(), conditionalTabProperties("alloyed")));
    public static final RegistryObject<Item> SHORT_LOCKED_STEEL_DOOR = ITEMS.register(DDNames.SHORT_LOCKED_STEEL, () -> new ShortDoorItem(DDBlocks.SHORT_LOCKED_STEEL_DOOR.get(), conditionalTabProperties("alloyed")));
    
    public static final RegistryObject<Item> TALL_STEEL_DOOR = ITEMS.register(DDNames.TALL_STEEL, () -> new TallDoorItem(DDBlocks.TALL_STEEL_DOOR.get(), conditionalTabProperties("alloyed")));
    public static final RegistryObject<Item> TALL_LOCKED_STEEL_DOOR = ITEMS.register(DDNames.TALL_LOCKED_STEEL, () -> new TallDoorItem(DDBlocks.TALL_LOCKED_STEEL_DOOR.get(), conditionalTabProperties("alloyed")));
    
    // Create: Deco
    public static final RegistryObject<Item> SHORT_ANDESITE_DOOR = ITEMS.register(DDNames.SHORT_ANDESITE, () -> new ShortDoorItem(DDBlocks.SHORT_ANDESITE_DOOR.get(), conditionalTabProperties("createdeco")));
    public static final RegistryObject<Item> SHORT_BRASS_DOOR = ITEMS.register(DDNames.SHORT_BRASS, () -> new ShortDoorItem(DDBlocks.SHORT_BRASS_DOOR.get(), conditionalTabProperties("createdeco")));
    public static final RegistryObject<Item> SHORT_COPPER_DOOR = ITEMS.register(DDNames.SHORT_COPPER, () -> new ShortDoorItem(DDBlocks.SHORT_COPPER_DOOR.get(), conditionalTabProperties("createdeco")));
    public static final RegistryObject<Item> SHORT_ZINC_DOOR = ITEMS.register(DDNames.SHORT_ZINC, () -> new ShortDoorItem(DDBlocks.SHORT_ZINC_DOOR.get(), conditionalTabProperties("createdeco")));
    public static final RegistryObject<Item> SHORT_LOCKED_ANDESITE_DOOR = ITEMS.register(DDNames.SHORT_LOCKED_ANDESITE, () -> new ShortDoorItem(DDBlocks.SHORT_LOCKED_ANDESITE_DOOR.get(), conditionalTabProperties("createdeco")));
    public static final RegistryObject<Item> SHORT_LOCKED_BRASS_DOOR = ITEMS.register(DDNames.SHORT_LOCKED_BRASS, () -> new ShortDoorItem(DDBlocks.SHORT_LOCKED_BRASS_DOOR.get(), conditionalTabProperties("createdeco")));
    public static final RegistryObject<Item> SHORT_LOCKED_COPPER_DOOR = ITEMS.register(DDNames.SHORT_LOCKED_COPPER, () -> new ShortDoorItem(DDBlocks.SHORT_LOCKED_COPPER_DOOR.get(), conditionalTabProperties("createdeco")));
    public static final RegistryObject<Item> SHORT_LOCKED_ZINC_DOOR = ITEMS.register(DDNames.SHORT_LOCKED_ZINC, () -> new ShortDoorItem(DDBlocks.SHORT_LOCKED_ZINC_DOOR.get(), conditionalTabProperties("createdeco")));

    public static final RegistryObject<Item> TALL_ANDESITE_DOOR = ITEMS.register(DDNames.TALL_ANDESITE, () -> new TallDoorItem(DDBlocks.TALL_ANDESITE_DOOR.get(), conditionalTabProperties("createdeco")));
    public static final RegistryObject<Item> TALL_BRASS_DOOR = ITEMS.register(DDNames.TALL_BRASS, () -> new TallDoorItem(DDBlocks.TALL_BRASS_DOOR.get(), conditionalTabProperties("createdeco")));
    public static final RegistryObject<Item> TALL_COPPER_DOOR = ITEMS.register(DDNames.TALL_COPPER, () -> new TallDoorItem(DDBlocks.TALL_COPPER_DOOR.get(), conditionalTabProperties("createdeco")));
    public static final RegistryObject<Item> TALL_ZINC_DOOR = ITEMS.register(DDNames.TALL_ZINC, () -> new TallDoorItem(DDBlocks.TALL_ZINC_DOOR.get(), conditionalTabProperties("createdeco")));
    public static final RegistryObject<Item> TALL_LOCKED_ANDESITE_DOOR = ITEMS.register(DDNames.TALL_LOCKED_ANDESITE, () -> new TallDoorItem(DDBlocks.TALL_LOCKED_ANDESITE_DOOR.get(), conditionalTabProperties("createdeco")));
    public static final RegistryObject<Item> TALL_LOCKED_BRASS_DOOR = ITEMS.register(DDNames.TALL_LOCKED_BRASS, () -> new TallDoorItem(DDBlocks.TALL_LOCKED_BRASS_DOOR.get(), conditionalTabProperties("createdeco")));
    public static final RegistryObject<Item> TALL_LOCKED_COPPER_DOOR = ITEMS.register(DDNames.TALL_LOCKED_COPPER, () -> new TallDoorItem(DDBlocks.TALL_LOCKED_COPPER_DOOR.get(), conditionalTabProperties("createdeco")));
    public static final RegistryObject<Item> TALL_LOCKED_ZINC_DOOR = ITEMS.register(DDNames.TALL_LOCKED_ZINC, () -> new TallDoorItem(DDBlocks.TALL_LOCKED_ZINC_DOOR.get(), conditionalTabProperties("createdeco")));

    // Create: Misc & Things
    public static final RegistryObject<Item> SHORT_ANDESITE_CASING_DOOR = ITEMS.register(DDNames.SHORT_ANDESITE_CASING, () -> new ShortDoorItem(DDBlocks.SHORT_ANDESITE_CASING_DOOR.get(), conditionalTabProperties("create_things_and_misc")));
    public static final RegistryObject<Item> SHORT_BRASS_CASING_DOOR = ITEMS.register(DDNames.SHORT_BRASS_CASING, () -> new ShortDoorItem(DDBlocks.SHORT_BRASS_CASING_DOOR.get(), conditionalTabProperties("create_things_and_misc")));
    public static final RegistryObject<Item> SHORT_COPPER_CASING_DOOR = ITEMS.register(DDNames.SHORT_COPPER_CASING, () -> new ShortDoorItem(DDBlocks.SHORT_COPPER_CASING_DOOR.get(), conditionalTabProperties("create_things_and_misc")));
    
    public static final RegistryObject<Item> TALL_ANDESITE_CASING_DOOR = ITEMS.register(DDNames.TALL_ANDESITE_CASING, () -> new TallDoorItem(DDBlocks.TALL_ANDESITE_CASING_DOOR.get(), conditionalTabProperties("create_things_and_misc")));
    public static final RegistryObject<Item> TALL_BRASS_CASING_DOOR = ITEMS.register(DDNames.TALL_BRASS_CASING, () -> new TallDoorItem(DDBlocks.TALL_BRASS_CASING_DOOR.get(), conditionalTabProperties("create_things_and_misc")));
    public static final RegistryObject<Item> TALL_COPPER_CASING_DOOR = ITEMS.register(DDNames.TALL_COPPER_CASING, () -> new TallDoorItem(DDBlocks.TALL_COPPER_CASING_DOOR.get(), conditionalTabProperties("create_things_and_misc")));
    
    // Darker Depths
    public static final RegistryObject<Item> SHORT_PETRIFIED_DOOR = ITEMS.register(DDNames.SHORT_PETRIFIED, () -> new ShortDoorItem(DDBlocks.SHORT_PETRIFIED_DOOR.get(), conditionalTabProperties("darkerdepths")));

    public static final RegistryObject<Item> TALL_PETRIFIED_DOOR = ITEMS.register(DDNames.TALL_PETRIFIED, () -> new TallDoorItem(DDBlocks.TALL_PETRIFIED_DOOR.get(), conditionalTabProperties("darkerdepths")));

    // Deeper Darker
    public static final RegistryObject<Item> SHORT_ECHO_DOOR = ITEMS.register(DDNames.SHORT_ECHO, () -> new ShortDoorItem(DDBlocks.SHORT_ECHO_DOOR.get(), conditionalTabProperties("deeperdarker")));    

    public static final RegistryObject<Item> TALL_ECHO_DOOR = ITEMS.register(DDNames.TALL_ECHO, () -> new TallDoorItem(DDBlocks.TALL_ECHO_DOOR.get(), conditionalTabProperties("deeperdarker")));    
    
    // Dustrial Decor
    public static final RegistryObject<Item> SHORT_CARDBOARD_DOOR = ITEMS.register(DDNames.SHORT_CARDBOARD, () -> new ShortDoorItem(DDBlocks.SHORT_CARDBOARD_DOOR.get(), conditionalTabProperties("dustrial_decor")));
    public static final RegistryObject<Item> SHORT_CHAIN_DOOR = ITEMS.register(DDNames.SHORT_CHAIN, () -> new ShortDoorItem(DDBlocks.SHORT_CHAIN_DOOR.get(), conditionalTabProperties("dustrial_decor")));
    public static final RegistryObject<Item> SHORT_INDUSTRIAL_IRON_DOOR = ITEMS.register(DDNames.SHORT_INDUSTRIAL_IRON, () -> new ShortDoorItem(DDBlocks.SHORT_INDUSTRIAL_IRON_DOOR.get(), conditionalTabProperties("dustrial_decor")));
    public static final RegistryObject<Item> SHORT_IRON_BAR_DOOR = ITEMS.register(DDNames.SHORT_IRON_BAR, () -> new ShortDoorItem(DDBlocks.SHORT_IRON_BAR_DOOR.get(), conditionalTabProperties("dustrial_decor")));
    public static final RegistryObject<Item> SHORT_PADDED_DOOR = ITEMS.register(DDNames.SHORT_PADDED, () -> new ShortDoorItem(DDBlocks.SHORT_PADDED_DOOR.get(), conditionalTabProperties("dustrial_decor")));
    public static final RegistryObject<Item> SHORT_RUSTY_IRON_DOOR = ITEMS.register(DDNames.SHORT_RUSTY_IRON, () -> new ShortDoorItem(DDBlocks.SHORT_RUSTY_IRON_DOOR.get(), conditionalTabProperties("dustrial_decor")));
    public static final RegistryObject<Item> SHORT_RUSTY_SHEET_METAL_DOOR = ITEMS.register(DDNames.SHORT_RUSTY_SHEET_METAL, () -> new ShortDoorItem(DDBlocks.SHORT_RUSTY_SHEET_METAL_DOOR.get(), conditionalTabProperties("dustrial_decor")));
    public static final RegistryObject<Item> SHORT_SHEET_METAL_DOOR = ITEMS.register(DDNames.SHORT_SHEET_METAL, () -> new ShortDoorItem(DDBlocks.SHORT_SHEET_METAL_DOOR.get(), conditionalTabProperties("dustrial_decor")));
    
    public static final RegistryObject<Item> TALL_CARDBOARD_DOOR = ITEMS.register(DDNames.TALL_CARDBOARD, () -> new TallDoorItem(DDBlocks.TALL_CARDBOARD_DOOR.get(), conditionalTabProperties("dustrial_decor")));
    public static final RegistryObject<Item> TALL_CHAIN_DOOR = ITEMS.register(DDNames.TALL_CHAIN, () -> new TallDoorItem(DDBlocks.TALL_CHAIN_DOOR.get(), conditionalTabProperties("dustrial_decor")));
    public static final RegistryObject<Item> TALL_INDUSTRIAL_IRON_DOOR = ITEMS.register(DDNames.TALL_INDUSTRIAL_IRON, () -> new TallDoorItem(DDBlocks.TALL_INDUSTRIAL_IRON_DOOR.get(), conditionalTabProperties("dustrial_decor")));
    public static final RegistryObject<Item> TALL_IRON_BAR_DOOR = ITEMS.register(DDNames.TALL_IRON_BAR, () -> new TallDoorItem(DDBlocks.TALL_IRON_BAR_DOOR.get(), conditionalTabProperties("dustrial_decor")));
    public static final RegistryObject<Item> TALL_PADDED_DOOR = ITEMS.register(DDNames.TALL_PADDED, () -> new TallDoorItem(DDBlocks.TALL_PADDED_DOOR.get(), conditionalTabProperties("dustrial_decor")));
    public static final RegistryObject<Item> TALL_RUSTY_IRON_DOOR = ITEMS.register(DDNames.TALL_RUSTY_IRON, () -> new TallDoorItem(DDBlocks.TALL_RUSTY_IRON_DOOR.get(), conditionalTabProperties("dustrial_decor")));
    public static final RegistryObject<Item> TALL_RUSTY_SHEET_METAL_DOOR = ITEMS.register(DDNames.TALL_RUSTY_SHEET_METAL, () -> new TallDoorItem(DDBlocks.TALL_RUSTY_SHEET_METAL_DOOR.get(), conditionalTabProperties("dustrial_decor")));
    public static final RegistryObject<Item> TALL_SHEET_METAL_DOOR = ITEMS.register(DDNames.TALL_SHEET_METAL, () -> new TallDoorItem(DDBlocks.TALL_SHEET_METAL_DOOR.get(), conditionalTabProperties("dustrial_decor")));
    
    // Ecologics
    public static final RegistryObject<Item> SHORT_ECO_AZALEA_DOOR = ITEMS.register(DDNames.SHORT_ECO_AZALEA, () -> new ShortDoorItem(DDBlocks.SHORT_ECO_AZALEA_DOOR.get(), conditionalTabProperties("ecologics")));
    public static final RegistryObject<Item> SHORT_ECO_FLOWERING_AZALEA_DOOR = ITEMS.register(DDNames.SHORT_ECO_FLOWERING_AZALEA, () -> new ShortDoorItem(DDBlocks.SHORT_ECO_FLOWERING_AZALEA_DOOR.get(), conditionalTabProperties("ecologics")));
    public static final RegistryObject<Item> SHORT_ECO_COCONUT_DOOR = ITEMS.register(DDNames.SHORT_ECO_COCONUT, () -> new ShortDoorItem(DDBlocks.SHORT_ECO_COCONUT_DOOR.get(), conditionalTabProperties("ecologics")));
    public static final RegistryObject<Item> SHORT_ECO_WALNUT_DOOR = ITEMS.register(DDNames.SHORT_ECO_WALNUT, () -> new ShortDoorItem(DDBlocks.SHORT_ECO_WALNUT_DOOR.get(), conditionalTabProperties("ecologics")));
    
    public static final RegistryObject<Item> TALL_ECO_AZALEA_DOOR = ITEMS.register(DDNames.TALL_ECO_AZALEA, () -> new TallDoorItem(DDBlocks.TALL_ECO_AZALEA_DOOR.get(), conditionalTabProperties("ecologics")));
    public static final RegistryObject<Item> TALL_ECO_FLOWERING_AZALEA_DOOR = ITEMS.register(DDNames.TALL_ECO_FLOWERING_AZALEA, () -> new TallDoorItem(DDBlocks.TALL_ECO_FLOWERING_AZALEA_DOOR.get(), conditionalTabProperties("ecologics")));
    public static final RegistryObject<Item> TALL_ECO_COCONUT_DOOR = ITEMS.register(DDNames.TALL_ECO_COCONUT, () -> new TallDoorItem(DDBlocks.TALL_ECO_COCONUT_DOOR.get(), conditionalTabProperties("ecologics")));
    public static final RegistryObject<Item> TALL_ECO_WALNUT_DOOR = ITEMS.register(DDNames.TALL_ECO_WALNUT, () -> new TallDoorItem(DDBlocks.TALL_ECO_WALNUT_DOOR.get(), conditionalTabProperties("ecologics")));
    
    // End's Phantasm
    public static final RegistryObject<Item> SHORT_EBONY_DOOR = ITEMS.register(DDNames.SHORT_EBONY, () -> new ShortDoorItem(DDBlocks.SHORT_EBONY_DOOR.get(), conditionalTabProperties("phantasm")));
    public static final RegistryObject<Item> SHORT_PREAM_DOOR = ITEMS.register(DDNames.SHORT_PREAM, () -> new ShortDoorItem(DDBlocks.SHORT_PREAM_DOOR.get(), conditionalTabProperties("phantasm")));
    
    public static final RegistryObject<Item> TALL_EBONY_DOOR = ITEMS.register(DDNames.TALL_EBONY, () -> new TallDoorItem(DDBlocks.TALL_EBONY_DOOR.get(), conditionalTabProperties("phantasm")));
    public static final RegistryObject<Item> TALL_PREAM_DOOR = ITEMS.register(DDNames.TALL_PREAM, () -> new TallDoorItem(DDBlocks.TALL_PREAM_DOOR.get(), conditionalTabProperties("phantasm")));
    
    // Enlightened End
    public static final RegistryObject<Item> SHORT_CONGEALED_DOOR = ITEMS.register(DDNames.SHORT_CONGEALED, () -> new ShortDoorItem(DDBlocks.SHORT_CONGEALED_DOOR.get(), conditionalTabProperties("enlightened_end")));
    public static final RegistryObject<Item> SHORT_EE_EBONY_DOOR = ITEMS.register(DDNames.SHORT_EE_EBONY, () -> new ShortDoorItem(DDBlocks.SHORT_EE_EBONY_DOOR.get(), conditionalTabProperties("enlightened_end")));

    public static final RegistryObject<Item> TALL_CONGEALED_DOOR = ITEMS.register(DDNames.TALL_CONGEALED, () -> new TallDoorItem(DDBlocks.TALL_CONGEALED_DOOR.get(), conditionalTabProperties("enlightened_end")));
    public static final RegistryObject<Item> TALL_EE_EBONY_DOOR = ITEMS.register(DDNames.TALL_EE_EBONY, () -> new TallDoorItem(DDBlocks.TALL_EE_EBONY_DOOR.get(), conditionalTabProperties("enlightened_end")));

    // Everything Copper
    public static final RegistryObject<Item> SHORT_EC_COPPER_DOOR = ITEMS.register(DDNames.SHORT_EC_COPPER, () -> new ShortDoorItem(DDBlocks.SHORT_EC_COPPER_DOOR.get(), conditionalTabProperties("everythingcopper")));
    public static final RegistryObject<Item> SHORT_EC_EXPOSED_COPPER_DOOR = ITEMS.register(DDNames.SHORT_EC_EXPOSED_COPPER, () -> new ShortDoorItem(DDBlocks.SHORT_EC_EXPOSED_COPPER_DOOR.get(), conditionalTabProperties("everythingcopper")));
    public static final RegistryObject<Item> SHORT_EC_WEATHERED_COPPER_DOOR = ITEMS.register(DDNames.SHORT_EC_WEATHERED_COPPER, () -> new ShortDoorItem(DDBlocks.SHORT_EC_WEATHERED_COPPER_DOOR.get(), conditionalTabProperties("everythingcopper")));
    public static final RegistryObject<Item> SHORT_EC_OXIDIZED_COPPER_DOOR = ITEMS.register(DDNames.SHORT_EC_OXIDIZED_COPPER, () -> new ShortDoorItem(DDBlocks.SHORT_EC_OXIDIZED_COPPER_DOOR.get(), conditionalTabProperties("everythingcopper")));
    public static final RegistryObject<Item> SHORT_EC_WAXED_COPPER_DOOR = ITEMS.register(DDNames.SHORT_EC_WAXED_COPPER, () -> new ShortDoorItem(DDBlocks.SHORT_EC_WAXED_COPPER_DOOR.get(), conditionalTabProperties("everythingcopper")));
    public static final RegistryObject<Item> SHORT_EC_WAXED_EXPOSED_COPPER_DOOR = ITEMS.register(DDNames.SHORT_EC_WAXED_EXPOSED_COPPER, () -> new ShortDoorItem(DDBlocks.SHORT_EC_WAXED_EXPOSED_COPPER_DOOR.get(), conditionalTabProperties("everythingcopper")));
    public static final RegistryObject<Item> SHORT_EC_WAXED_WEATHERED_COPPER_DOOR = ITEMS.register(DDNames.SHORT_EC_WAXED_WEATHERED_COPPER, () -> new ShortDoorItem(DDBlocks.SHORT_EC_WAXED_WEATHERED_COPPER_DOOR.get(), conditionalTabProperties("everythingcopper")));
    public static final RegistryObject<Item> SHORT_EC_WAXED_OXIDIZED_COPPER_DOOR = ITEMS.register(DDNames.SHORT_EC_WAXED_OXIDIZED_COPPER, () -> new ShortDoorItem(DDBlocks.SHORT_EC_WAXED_OXIDIZED_COPPER_DOOR.get(), conditionalTabProperties("everythingcopper")));
    
    public static final RegistryObject<Item> TALL_EC_COPPER_DOOR = ITEMS.register(DDNames.TALL_EC_COPPER, () -> new TallDoorItem(DDBlocks.TALL_EC_COPPER_DOOR.get(), conditionalTabProperties("everythingcopper")));
    public static final RegistryObject<Item> TALL_EC_EXPOSED_COPPER_DOOR = ITEMS.register(DDNames.TALL_EC_EXPOSED_COPPER, () -> new TallDoorItem(DDBlocks.TALL_EC_EXPOSED_COPPER_DOOR.get(), conditionalTabProperties("everythingcopper")));
    public static final RegistryObject<Item> TALL_EC_WEATHERED_COPPER_DOOR = ITEMS.register(DDNames.TALL_EC_WEATHERED_COPPER, () -> new TallDoorItem(DDBlocks.TALL_EC_WEATHERED_COPPER_DOOR.get(), conditionalTabProperties("everythingcopper")));
    public static final RegistryObject<Item> TALL_EC_OXIDIZED_COPPER_DOOR = ITEMS.register(DDNames.TALL_EC_OXIDIZED_COPPER, () -> new TallDoorItem(DDBlocks.TALL_EC_OXIDIZED_COPPER_DOOR.get(), conditionalTabProperties("everythingcopper")));
    public static final RegistryObject<Item> TALL_EC_WAXED_COPPER_DOOR = ITEMS.register(DDNames.TALL_EC_WAXED_COPPER, () -> new TallDoorItem(DDBlocks.TALL_EC_WAXED_COPPER_DOOR.get(), conditionalTabProperties("everythingcopper")));
    public static final RegistryObject<Item> TALL_EC_WAXED_EXPOSED_COPPER_DOOR = ITEMS.register(DDNames.TALL_EC_WAXED_EXPOSED_COPPER, () -> new TallDoorItem(DDBlocks.TALL_EC_WAXED_EXPOSED_COPPER_DOOR.get(), conditionalTabProperties("everythingcopper")));
    public static final RegistryObject<Item> TALL_EC_WAXED_WEATHERED_COPPER_DOOR = ITEMS.register(DDNames.TALL_EC_WAXED_WEATHERED_COPPER, () -> new TallDoorItem(DDBlocks.TALL_EC_WAXED_WEATHERED_COPPER_DOOR.get(), conditionalTabProperties("everythingcopper")));
    public static final RegistryObject<Item> TALL_EC_WAXED_OXIDIZED_COPPER_DOOR = ITEMS.register(DDNames.TALL_EC_WAXED_OXIDIZED_COPPER, () -> new TallDoorItem(DDBlocks.TALL_EC_WAXED_OXIDIZED_COPPER_DOOR.get(), conditionalTabProperties("everythingcopper")));
    
    // Extended Mushrooms
    public static final RegistryObject<Item> SHORT_MUSHROOM_DOOR = ITEMS.register(DDNames.SHORT_MUSHROOM, () -> new ShortDoorItem(DDBlocks.SHORT_MUSHROOM_DOOR.get(), conditionalTabProperties("extendedmushrooms")));
    public static final RegistryObject<Item> SHORT_GLOWSHROOM_DOOR = ITEMS.register(DDNames.SHORT_GLOWSHROOM, () -> new ShortDoorItem(DDBlocks.SHORT_GLOWSHROOM_DOOR.get(), conditionalTabProperties("extendedmushrooms")));
    public static final RegistryObject<Item> SHORT_POISONOUS_MUSHROOM_DOOR = ITEMS.register(DDNames.SHORT_POISONOUS_MUSHROOM, () -> new ShortDoorItem(DDBlocks.SHORT_POISONOUS_MUSHROOM_DOOR.get(), conditionalTabProperties("extendedmushrooms")));
    public static final RegistryObject<Item> SHORT_HONEY_FUNGUS_DOOR = ITEMS.register(DDNames.SHORT_HONEY_FUNGUS, () -> new ShortDoorItem(DDBlocks.SHORT_HONEY_FUNGUS_DOOR.get(), conditionalTabProperties("extendedmushrooms")));
    
    public static final RegistryObject<Item> TALL_MUSHROOM_DOOR = ITEMS.register(DDNames.TALL_MUSHROOM, () -> new TallDoorItem(DDBlocks.TALL_MUSHROOM_DOOR.get(), conditionalTabProperties("extendedmushrooms")));
    public static final RegistryObject<Item> TALL_GLOWSHROOM_DOOR = ITEMS.register(DDNames.TALL_GLOWSHROOM, () -> new TallDoorItem(DDBlocks.TALL_GLOWSHROOM_DOOR.get(), conditionalTabProperties("extendedmushrooms")));
    public static final RegistryObject<Item> TALL_POISONOUS_MUSHROOM_DOOR = ITEMS.register(DDNames.TALL_POISONOUS_MUSHROOM, () -> new TallDoorItem(DDBlocks.TALL_POISONOUS_MUSHROOM_DOOR.get(), conditionalTabProperties("extendedmushrooms")));
    public static final RegistryObject<Item> TALL_HONEY_FUNGUS_DOOR = ITEMS.register(DDNames.TALL_HONEY_FUNGUS, () -> new TallDoorItem(DDBlocks.TALL_HONEY_FUNGUS_DOOR.get(), conditionalTabProperties("extendedmushrooms")));
    
    // Forbidden & Arcanus
    public static final RegistryObject<Item> SHORT_DEORUM_DOOR = ITEMS.register(DDNames.SHORT_DEORUM, () -> new ShortDoorItem(DDBlocks.SHORT_DEORUM_DOOR.get(), conditionalTabProperties("forbidden_arcanus")));
    public static final RegistryObject<Item> SHORT_ARCANE_EDELWOOD_DOOR = ITEMS.register(DDNames.SHORT_ARCANE_EDELWOOD, () -> new ShortDoorItem(DDBlocks.SHORT_ARCANE_EDELWOOD_DOOR.get(), conditionalTabProperties("forbidden_arcanus")));
    public static final RegistryObject<Item> SHORT_CHERRYWOOD_DOOR = ITEMS.register(DDNames.SHORT_CHERRYWOOD, () -> new ShortDoorItem(DDBlocks.SHORT_CHERRYWOOD_DOOR.get(), conditionalTabProperties("forbidden_arcanus")));
    public static final RegistryObject<Item> SHORT_EDELWOOD_DOOR = ITEMS.register(DDNames.SHORT_EDELWOOD, () -> new ShortDoorItem(DDBlocks.SHORT_EDELWOOD_DOOR.get(), conditionalTabProperties("forbidden_arcanus")));
    public static final RegistryObject<Item> SHORT_FUNGYSS_DOOR = ITEMS.register(DDNames.SHORT_FUNGYSS, () -> new ShortDoorItem(DDBlocks.SHORT_FUNGYSS_DOOR.get(), conditionalTabProperties("forbidden_arcanus")));
    public static final RegistryObject<Item> SHORT_AURUM_DOOR = ITEMS.register(DDNames.SHORT_AURUM, () -> new ShortDoorItem(DDBlocks.SHORT_AURUM_DOOR.get(), conditionalTabProperties("forbidden_arcanus")));
    
    public static final RegistryObject<Item> TALL_DEORUM_DOOR = ITEMS.register(DDNames.TALL_DEORUM, () -> new TallDoorItem(DDBlocks.TALL_DEORUM_DOOR.get(), conditionalTabProperties("forbidden_arcanus")));
    public static final RegistryObject<Item> TALL_ARCANE_EDELWOOD_DOOR = ITEMS.register(DDNames.TALL_ARCANE_EDELWOOD, () -> new TallDoorItem(DDBlocks.TALL_ARCANE_EDELWOOD_DOOR.get(), conditionalTabProperties("forbidden_arcanus")));
    public static final RegistryObject<Item> TALL_CHERRYWOOD_DOOR = ITEMS.register(DDNames.TALL_CHERRYWOOD, () -> new TallDoorItem(DDBlocks.TALL_CHERRYWOOD_DOOR.get(), conditionalTabProperties("forbidden_arcanus")));
    public static final RegistryObject<Item> TALL_EDELWOOD_DOOR = ITEMS.register(DDNames.TALL_EDELWOOD, () -> new TallDoorItem(DDBlocks.TALL_EDELWOOD_DOOR.get(), conditionalTabProperties("forbidden_arcanus")));
    public static final RegistryObject<Item> TALL_FUNGYSS_DOOR = ITEMS.register(DDNames.TALL_FUNGYSS, () -> new TallDoorItem(DDBlocks.TALL_FUNGYSS_DOOR.get(), conditionalTabProperties("forbidden_arcanus")));
    public static final RegistryObject<Item> TALL_AURUM_DOOR = ITEMS.register(DDNames.TALL_AURUM, () -> new TallDoorItem(DDBlocks.TALL_AURUM_DOOR.get(), conditionalTabProperties("forbidden_arcanus")));
    
    // Fruit Trees
    public static final RegistryObject<Item> SHORT_FT_CHERRY_DOOR = ITEMS.register(DDNames.SHORT_FT_CHERRY, () -> new ShortDoorItem(DDBlocks.SHORT_FT_CHERRY_DOOR.get(), conditionalTabProperties("fruittrees")));
    //public static final RegistryObject<Item> SHORT_FT_CHERRY_SLIDING_DOOR = ITEMS.register(DDNames.SHORT_FT_CHERRY_SLIDING, () -> new ShortDoorItem(DDBlocks.SHORT_FT_CHERRY_SLIDING_DOOR.get(), addIfItemIsAvailable(new ResourceLocation("fruittrees", "cherry_sliding_door"), conditionalTabProperties("fruittrees"))));
    public static final RegistryObject<Item> SHORT_FT_CITRUS_DOOR = ITEMS.register(DDNames.SHORT_FT_CITRUS, () -> new ShortDoorItem(DDBlocks.SHORT_FT_CITRUS_DOOR.get(), conditionalTabProperties("fruittrees")));
    
    public static final RegistryObject<Item> TALL_FT_CHERRY_DOOR = ITEMS.register(DDNames.TALL_FT_CHERRY, () -> new TallDoorItem(DDBlocks.TALL_FT_CHERRY_DOOR.get(), conditionalTabProperties("fruittrees")));
    public static final RegistryObject<Item> TALL_FT_CHERRY_SLIDING_DOOR = ITEMS.register(DDNames.TALL_FT_CHERRY_SLIDING, () -> new TallDoorItem(DDBlocks.TALL_FT_CHERRY_SLIDING_DOOR.get(), addIfItemIsAvailable(new ResourceLocation("fruittrees", "cherry_sliding_door"), conditionalTabProperties("fruittrees"))));
    public static final RegistryObject<Item> TALL_FT_CITRUS_DOOR = ITEMS.register(DDNames.TALL_FT_CITRUS, () -> new TallDoorItem(DDBlocks.TALL_FT_CITRUS_DOOR.get(), conditionalTabProperties("fruittrees")));
        
    // Garden of the Dead
    public static final RegistryObject<Item> SHORT_SOULBLIGHT_DOOR = ITEMS.register(DDNames.SHORT_SOULBLIGHT, () -> new ShortDoorItem(DDBlocks.SHORT_SOULBLIGHT_DOOR.get(), conditionalTabProperties("gardens_of_the_dead")));
    public static final RegistryObject<Item> SHORT_WHISTLECANE_DOOR = ITEMS.register(DDNames.SHORT_WHISTLECANE, () -> new ShortDoorItem(DDBlocks.SHORT_WHISTLECANE_DOOR.get(), conditionalTabProperties("gardens_of_the_dead")));
    
    public static final RegistryObject<Item> TALL_SOULBLIGHT_DOOR = ITEMS.register(DDNames.TALL_SOULBLIGHT, () -> new TallDoorItem(DDBlocks.TALL_SOULBLIGHT_DOOR.get(), conditionalTabProperties("gardens_of_the_dead")));
    public static final RegistryObject<Item> TALL_WHISTLECANE_DOOR = ITEMS.register(DDNames.TALL_WHISTLECANE, () -> new TallDoorItem(DDBlocks.TALL_WHISTLECANE_DOOR.get(), conditionalTabProperties("gardens_of_the_dead")));
    
    // Good Ending
    public static final RegistryObject<Item> SHORT_GE_CYPRESS_DOOR = ITEMS.register(DDNames.SHORT_GE_CYPRESS, () -> new ShortDoorItem(DDBlocks.SHORT_GE_CYPRESS_DOOR.get(), conditionalTabProperties("goodending")));
    public static final RegistryObject<Item> SHORT_GE_MUDDY_OAK_DOOR = ITEMS.register(DDNames.SHORT_GE_MUDDY_OAK, () -> new ShortDoorItem(DDBlocks.SHORT_GE_MUDDY_OAK_DOOR.get(), conditionalTabProperties("goodending")));
    
    public static final RegistryObject<Item> TALL_GE_CYPRESS_DOOR = ITEMS.register(DDNames.TALL_GE_CYPRESS, () -> new TallDoorItem(DDBlocks.TALL_GE_CYPRESS_DOOR.get(), conditionalTabProperties("goodending")));
    public static final RegistryObject<Item> TALL_GE_MUDDY_OAK_DOOR = ITEMS.register(DDNames.TALL_GE_MUDDY_OAK, () -> new TallDoorItem(DDBlocks.TALL_GE_MUDDY_OAK_DOOR.get(), conditionalTabProperties("goodending")));
    
    // Graveyard
    public static final RegistryObject<Item> SHORT_DARK_IRON_DOOR = ITEMS.register(DDNames.SHORT_DARK_IRON, () -> new ShortDoorItem(DDBlocks.SHORT_DARK_IRON_DOOR.get(), conditionalTabProperties("graveyard")));
    
    public static final RegistryObject<Item> TALL_DARK_IRON_DOOR = ITEMS.register(DDNames.TALL_DARK_IRON, () -> new TallDoorItem(DDBlocks.TALL_DARK_IRON_DOOR.get(), conditionalTabProperties("graveyard")));
    
    // Habitat
    public static final RegistryObject<Item> SHORT_FAIRY_RING_MUSHROOM_DOOR = ITEMS.register(DDNames.SHORT_FAIRY_RING_MUSHROOM, () -> new ShortDoorItem(DDBlocks.SHORT_FAIRY_RING_MUSHROOM_DOOR.get(), addIfItemIsAvailable(new ResourceLocation("habitat", "fairy_ring_mushroom_door"), conditionalTabProperties("habitat"))));
    
    public static final RegistryObject<Item> TALL_FAIRY_RING_MUSHROOM_DOOR = ITEMS.register(DDNames.TALL_FAIRY_RING_MUSHROOM, () -> new TallDoorItem(DDBlocks.TALL_FAIRY_RING_MUSHROOM_DOOR.get(), addIfItemIsAvailable(new ResourceLocation("habitat", "fairy_ring_mushroom_door"), conditionalTabProperties("habitat"))));
    
    // Hexcasting
    public static final RegistryObject<Item> SHORT_EDIFIED_DOOR = ITEMS.register(DDNames.SHORT_EDIFIED, () -> new ShortDoorItem(DDBlocks.SHORT_EDIFIED_DOOR.get(), conditionalTabProperties("hexcasting")));
    
    public static final RegistryObject<Item> TALL_EDIFIED_DOOR = ITEMS.register(DDNames.TALL_EDIFIED, () -> new TallDoorItem(DDBlocks.TALL_EDIFIED_DOOR.get(), conditionalTabProperties("hexcasting")));
    
    // Hexeri
    public static final RegistryObject<Item> SHORT_HEXEREI_MAHOGANY_DOOR = ITEMS.register(DDNames.SHORT_HEXEREI_MAHOGANY, () -> new ShortDoorItem(DDBlocks.SHORT_HEXEREI_MAHOGANY_DOOR.get(), conditionalTabProperties("hexerei")));
    public static final RegistryObject<Item> SHORT_HEXEREI_WILLOW_DOOR = ITEMS.register(DDNames.SHORT_HEXEREI_WILLOW, () -> new ShortDoorItem(DDBlocks.SHORT_HEXEREI_WILLOW_DOOR.get(), conditionalTabProperties("hexerei")));
    public static final RegistryObject<Item> SHORT_HEXEREI_WITCH_HAZEL_DOOR = ITEMS.register(DDNames.SHORT_HEXEREI_WITCH_HAZEL, () -> new ShortDoorItem(DDBlocks.SHORT_HEXEREI_WITCH_HAZEL_DOOR.get(), conditionalTabProperties("hexerei")));
    
    public static final RegistryObject<Item> TALL_HEXEREI_MAHOGANY_DOOR = ITEMS.register(DDNames.TALL_HEXEREI_MAHOGANY, () -> new TallDoorItem(DDBlocks.TALL_HEXEREI_MAHOGANY_DOOR.get(), conditionalTabProperties("hexerei")));
    public static final RegistryObject<Item> TALL_HEXEREI_WILLOW_DOOR = ITEMS.register(DDNames.TALL_HEXEREI_WILLOW, () -> new TallDoorItem(DDBlocks.TALL_HEXEREI_WILLOW_DOOR.get(), conditionalTabProperties("hexerei")));
    public static final RegistryObject<Item> TALL_HEXEREI_WITCH_HAZEL_DOOR = ITEMS.register(DDNames.TALL_HEXEREI_WITCH_HAZEL, () -> new TallDoorItem(DDBlocks.TALL_HEXEREI_WITCH_HAZEL_DOOR.get(), conditionalTabProperties("hexerei")));
    
    // Integrated Dynamics
    public static final RegistryObject<Item> SHORT_MENRIL_DOOR = ITEMS.register(DDNames.SHORT_MENRIL, () -> new ShortDoorItem(DDBlocks.SHORT_MENRIL_DOOR.get(), conditionalTabProperties("integrateddynamics")));
    
    public static final RegistryObject<Item> TALL_MENRIL_DOOR = ITEMS.register(DDNames.TALL_MENRIL, () -> new TallDoorItem(DDBlocks.TALL_MENRIL_DOOR.get(), conditionalTabProperties("integrateddynamics")));
    
    // Malum
    public static final RegistryObject<Item> SHORT_RUNEWOOD_DOOR = ITEMS.register(DDNames.SHORT_RUNEWOOD, () -> new ShortDoorItem(DDBlocks.SHORT_RUNEWOOD_DOOR.get(), conditionalTabProperties("malum")));
    public static final RegistryObject<Item> SHORT_SOULWOOD_DOOR = ITEMS.register(DDNames.SHORT_SOULWOOD, () -> new ShortDoorItem(DDBlocks.SHORT_SOULWOOD_DOOR.get(), conditionalTabProperties("malum")));
    
    public static final RegistryObject<Item> TALL_RUNEWOOD_DOOR = ITEMS.register(DDNames.TALL_RUNEWOOD, () -> new TallDoorItem(DDBlocks.TALL_RUNEWOOD_DOOR.get(), conditionalTabProperties("malum")));
    public static final RegistryObject<Item> TALL_SOULWOOD_DOOR = ITEMS.register(DDNames.TALL_SOULWOOD, () -> new TallDoorItem(DDBlocks.TALL_SOULWOOD_DOOR.get(), conditionalTabProperties("malum")));
    
    // Morecraft
    public static final RegistryObject<Item> SHORT_MORECRAFT_NETHERBRICK_DOOR = ITEMS.register(DDNames.SHORT_MORECRAFT_NETHERBRICK, () -> new ShortDoorItem(DDBlocks.SHORT_MORECRAFT_NETHERBRICK_DOOR.get(), conditionalTabProperties("morecraft")));
    public static final RegistryObject<Item> SHORT_MORECRAFT_NETHERWOOD_DOOR = ITEMS.register(DDNames.SHORT_MORECRAFT_NETHERWOOD, () -> new ShortDoorItem(DDBlocks.SHORT_MORECRAFT_NETHERWOOD_DOOR.get(), conditionalTabProperties("morecraft")));
    public static final RegistryObject<Item> SHORT_MORECRAFT_NETHERITE_DOOR = ITEMS.register(DDNames.SHORT_MORECRAFT_NETHERITE, () -> new ShortDoorItem(DDBlocks.SHORT_MORECRAFT_NETHERITE_DOOR.get(), conditionalTabProperties("morecraft").fireResistant()));
	public static final RegistryObject<Item> SHORT_MORECRAFT_GLASS_DOOR = ITEMS.register(DDNames.SHORT_MORECRAFT_GLASS, () -> new ShortDoorItem(DDBlocks.SHORT_MORECRAFT_GLASS_DOOR.get(), conditionalTabProperties("morecraft")));
	public static final RegistryObject<Item> SHORT_MORECRAFT_SOUL_GLASS_DOOR = ITEMS.register(DDNames.SHORT_MORECRAFT_SOUL_GLASS, () -> new ShortDoorItem(DDBlocks.SHORT_MORECRAFT_SOUL_GLASS_DOOR.get(), conditionalTabProperties("morecraft")));
    public static final RegistryObject<Item> SHORT_MORECRAFT_BONE_DOOR = ITEMS.register(DDNames.SHORT_MORECRAFT_BONE, () -> new ShortDoorItem(DDBlocks.SHORT_MORECRAFT_BONE_DOOR.get(), conditionalTabProperties("morecraft")));
    
    public static final RegistryObject<Item> TALL_MORECRAFT_NETHERBRICK_DOOR = ITEMS.register(DDNames.TALL_MORECRAFT_NETHERBRICK, () -> new TallDoorItem(DDBlocks.TALL_MORECRAFT_NETHERBRICK_DOOR.get(), conditionalTabProperties("morecraft")));
    public static final RegistryObject<Item> TALL_MORECRAFT_NETHERWOOD_DOOR = ITEMS.register(DDNames.TALL_MORECRAFT_NETHERWOOD, () -> new TallDoorItem(DDBlocks.TALL_MORECRAFT_NETHERWOOD_DOOR.get(), conditionalTabProperties("morecraft")));
    public static final RegistryObject<Item> TALL_MORECRAFT_NETHERITE_DOOR = ITEMS.register(DDNames.TALL_MORECRAFT_NETHERITE, () -> new TallDoorItem(DDBlocks.TALL_MORECRAFT_NETHERITE_DOOR.get(), conditionalTabProperties("morecraft").fireResistant()));
	public static final RegistryObject<Item> TALL_MORECRAFT_GLASS_DOOR = ITEMS.register(DDNames.TALL_MORECRAFT_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MORECRAFT_GLASS_DOOR.get(), conditionalTabProperties("morecraft")));
	public static final RegistryObject<Item> TALL_MORECRAFT_SOUL_GLASS_DOOR = ITEMS.register(DDNames.TALL_MORECRAFT_SOUL_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MORECRAFT_SOUL_GLASS_DOOR.get(), conditionalTabProperties("morecraft")));
    public static final RegistryObject<Item> TALL_MORECRAFT_BONE_DOOR = ITEMS.register(DDNames.TALL_MORECRAFT_BONE, () -> new TallDoorItem(DDBlocks.TALL_MORECRAFT_BONE_DOOR.get(), conditionalTabProperties("morecraft")));
    
    // Nether's Exoticism
    public static final RegistryObject<Item> SHORT_JABOTICABA_DOOR = ITEMS.register(DDNames.SHORT_JABOTICABA, () -> new ShortDoorItem(DDBlocks.SHORT_JABOTICABA_DOOR.get(), conditionalTabProperties("nethers_exoticism")));
    public static final RegistryObject<Item> SHORT_RAMBOUTAN_DOOR = ITEMS.register(DDNames.SHORT_RAMBOUTAN, () -> new ShortDoorItem(DDBlocks.SHORT_RAMBOUTAN_DOOR.get(), conditionalTabProperties("nethers_exoticism")));    

    public static final RegistryObject<Item> TALL_JABOTICABA_DOOR = ITEMS.register(DDNames.TALL_JABOTICABA, () -> new TallDoorItem(DDBlocks.TALL_JABOTICABA_DOOR.get(), conditionalTabProperties("nethers_exoticism")));
    public static final RegistryObject<Item> TALL_RAMBOUTAN_DOOR = ITEMS.register(DDNames.TALL_RAMBOUTAN, () -> new TallDoorItem(DDBlocks.TALL_RAMBOUTAN_DOOR.get(), conditionalTabProperties("nethers_exoticism")));    
    
    // New World
    public static final RegistryObject<Item> SHORT_FIR_DOOR = ITEMS.register(DDNames.SHORT_FIR, () -> new ShortDoorItem(DDBlocks.SHORT_FIR_DOOR.get(), conditionalTabProperties("newworld")));

    public static final RegistryObject<Item> TALL_FIR_DOOR = ITEMS.register(DDNames.TALL_FIR, () -> new TallDoorItem(DDBlocks.TALL_FIR_DOOR.get(), conditionalTabProperties("newworld")));
    
    // Outer End
    public static final RegistryObject<Item> SHORT_AZURE_DOOR = ITEMS.register(DDNames.SHORT_AZURE, () -> new ShortDoorItem(DDBlocks.SHORT_AZURE_DOOR.get(), conditionalTabProperties("outer_end")));

    public static final RegistryObject<Item> TALL_AZURE_DOOR = ITEMS.register(DDNames.TALL_AZURE, () -> new TallDoorItem(DDBlocks.TALL_AZURE_DOOR.get(), conditionalTabProperties("outer_end")));
    
    // Pokecube
    /*public static final RegistryObject<Item> SHORT_POKECUBE_ENIGMA_DOOR = ITEMS.register(DDNames.SHORT_POKECUBE_ENIGMA, () -> new ShortDoorItem(DDBlocks.SHORT_POKECUBE_ENIGMA_DOOR.get(), conditionalTabProperties("pokecube")));
    public static final RegistryObject<Item> SHORT_POKECUBE_LEPPA_DOOR = ITEMS.register(DDNames.SHORT_POKECUBE_LEPPA, () -> new ShortDoorItem(DDBlocks.SHORT_POKECUBE_LEPPA_DOOR.get(), conditionalTabProperties("pokecube")));
    public static final RegistryObject<Item> SHORT_POKECUBE_NANAB_DOOR = ITEMS.register(DDNames.SHORT_POKECUBE_NANAB, () -> new ShortDoorItem(DDBlocks.SHORT_POKECUBE_NANAB_DOOR.get(), conditionalTabProperties("pokecube")));
    public static final RegistryObject<Item> SHORT_POKECUBE_ORAN_DOOR = ITEMS.register(DDNames.SHORT_POKECUBE_ORAN, () -> new ShortDoorItem(DDBlocks.SHORT_POKECUBE_ORAN_DOOR.get(), conditionalTabProperties("pokecube")));
    public static final RegistryObject<Item> SHORT_POKECUBE_PECHA_DOOR = ITEMS.register(DDNames.SHORT_POKECUBE_PECHA, () -> new ShortDoorItem(DDBlocks.SHORT_POKECUBE_PECHA_DOOR.get(), conditionalTabProperties("pokecube")));
    public static final RegistryObject<Item> SHORT_POKECUBE_SITRUS_DOOR = ITEMS.register(DDNames.SHORT_POKECUBE_SITRUS, () -> new ShortDoorItem(DDBlocks.SHORT_POKECUBE_SITRUS_DOOR.get(), conditionalTabProperties("pokecube")));
    public static final RegistryObject<Item> SHORT_POKECUBE_AGED_DOOR = ITEMS.register(DDNames.SHORT_POKECUBE_AGED, () -> new ShortDoorItem(DDBlocks.SHORT_POKECUBE_AGED_DOOR.get(), conditionalTabProperties("pokecube")));
    public static final RegistryObject<Item> SHORT_POKECUBE_CONCRETE_DOOR = ITEMS.register(DDNames.SHORT_POKECUBE_CONCRETE, () -> new ShortDoorItem(DDBlocks.SHORT_POKECUBE_CONCRETE_DOOR.get(), conditionalTabProperties("pokecube")));
    public static final RegistryObject<Item> SHORT_POKECUBE_CORRUPTED_DOOR = ITEMS.register(DDNames.SHORT_POKECUBE_CORRUPTED, () -> new ShortDoorItem(DDBlocks.SHORT_POKECUBE_CORRUPTED_DOOR.get(), conditionalTabProperties("pokecube")));
    public static final RegistryObject<Item> SHORT_POKECUBE_DISTORTIC_DOOR = ITEMS.register(DDNames.SHORT_POKECUBE_DISTORTIC, () -> new ShortDoorItem(DDBlocks.SHORT_POKECUBE_DISTORTIC_DOOR.get(), conditionalTabProperties("pokecube")));
    public static final RegistryObject<Item> SHORT_POKECUBE_INVERTED_DOOR = ITEMS.register(DDNames.SHORT_POKECUBE_INVERTED, () -> new ShortDoorItem(DDBlocks.SHORT_POKECUBE_INVERTED_DOOR.get(), conditionalTabProperties("pokecube")));
    public static final RegistryObject<Item> SHORT_POKECUBE_MIRAGE_DOOR = ITEMS.register(DDNames.SHORT_POKECUBE_MIRAGE, () -> new ShortDoorItem(DDBlocks.SHORT_POKECUBE_MIRAGE_DOOR.get(), conditionalTabProperties("pokecube")));
    public static final RegistryObject<Item> SHORT_POKECUBE_TEMPORAL_DOOR = ITEMS.register(DDNames.SHORT_POKECUBE_TEMPORAL, () -> new ShortDoorItem(DDBlocks.SHORT_POKECUBE_TEMPORAL_DOOR.get(), conditionalTabProperties("pokecube")));
    */
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
    public static final RegistryObject<Item> SHORT_PW_MAGIC_DOOR = ITEMS.register(DDNames.SHORT_PW_MAGIC, () -> new ShortDoorItem(DDBlocks.SHORT_PW_MAGIC_DOOR.get(), conditionalTabProperties("premium_wood")));
    public static final RegistryObject<Item> SHORT_PW_MAPLE_DOOR = ITEMS.register(DDNames.SHORT_PW_MAPLE, () -> new ShortDoorItem(DDBlocks.SHORT_PW_MAPLE_DOOR.get(), conditionalTabProperties("premium_wood")));
    public static final RegistryObject<Item> SHORT_PW_PURPLE_HEART_DOOR = ITEMS.register(DDNames.SHORT_PW_PURPLE_HEART, () -> new ShortDoorItem(DDBlocks.SHORT_PW_PURPLE_HEART_DOOR.get(), conditionalTabProperties("premium_wood")));
    public static final RegistryObject<Item> SHORT_PW_SILVERBELL_DOOR = ITEMS.register(DDNames.SHORT_PW_SILVERBELL, () -> new ShortDoorItem(DDBlocks.SHORT_PW_SILVERBELL_DOOR.get(), conditionalTabProperties("premium_wood")));
    public static final RegistryObject<Item> SHORT_PW_TIGER_DOOR = ITEMS.register(DDNames.SHORT_PW_TIGER, () -> new ShortDoorItem(DDBlocks.SHORT_PW_TIGER_DOOR.get(), conditionalTabProperties("premium_wood")));
    public static final RegistryObject<Item> SHORT_PW_WILLOW_DOOR = ITEMS.register(DDNames.SHORT_PW_WILLOW, () -> new ShortDoorItem(DDBlocks.SHORT_PW_WILLOW_DOOR.get(), conditionalTabProperties("premium_wood")));
    
    public static final RegistryObject<Item> TALL_PW_MAGIC_DOOR = ITEMS.register(DDNames.TALL_PW_MAGIC, () -> new TallDoorItem(DDBlocks.TALL_PW_MAGIC_DOOR.get(), conditionalTabProperties("premium_wood")));
    public static final RegistryObject<Item> TALL_PW_MAPLE_DOOR = ITEMS.register(DDNames.TALL_PW_MAPLE, () -> new TallDoorItem(DDBlocks.TALL_PW_MAPLE_DOOR.get(), conditionalTabProperties("premium_wood")));
    public static final RegistryObject<Item> TALL_PW_PURPLE_HEART_DOOR = ITEMS.register(DDNames.TALL_PW_PURPLE_HEART, () -> new TallDoorItem(DDBlocks.TALL_PW_PURPLE_HEART_DOOR.get(), conditionalTabProperties("premium_wood")));
    public static final RegistryObject<Item> TALL_PW_SILVERBELL_DOOR = ITEMS.register(DDNames.TALL_PW_SILVERBELL, () -> new TallDoorItem(DDBlocks.TALL_PW_SILVERBELL_DOOR.get(), conditionalTabProperties("premium_wood")));
    public static final RegistryObject<Item> TALL_PW_TIGER_DOOR = ITEMS.register(DDNames.TALL_PW_TIGER, () -> new TallDoorItem(DDBlocks.TALL_PW_TIGER_DOOR.get(), conditionalTabProperties("premium_wood")));
    public static final RegistryObject<Item> TALL_PW_WILLOW_DOOR = ITEMS.register(DDNames.TALL_PW_WILLOW, () -> new TallDoorItem(DDBlocks.TALL_PW_WILLOW_DOOR.get(), conditionalTabProperties("premium_wood")));
    
    // Pyromancer
    public static final RegistryObject<Item> SHORT_PYROWOOD_DOOR = ITEMS.register(DDNames.SHORT_PYROWOOD, () -> new ShortDoorItem(DDBlocks.SHORT_PYROWOOD_DOOR.get(), conditionalTabProperties("pyromancer")));
    public static final RegistryObject<Item> SHORT_ROTTEN_PLANKS_DOOR = ITEMS.register(DDNames.SHORT_ROTTEN_PLANKS, () -> new ShortDoorItem(DDBlocks.SHORT_ROTTEN_PLANKS_DOOR.get(), conditionalTabProperties("pyromancer")));

    public static final RegistryObject<Item> TALL_PYROWOOD_DOOR = ITEMS.register(DDNames.TALL_PYROWOOD, () -> new TallDoorItem(DDBlocks.TALL_PYROWOOD_DOOR.get(), conditionalTabProperties("pyromancer")));
    public static final RegistryObject<Item> TALL_ROTTEN_PLANKS_DOOR = ITEMS.register(DDNames.TALL_ROTTEN_PLANKS, () -> new TallDoorItem(DDBlocks.TALL_ROTTEN_PLANKS_DOOR.get(), conditionalTabProperties("pyromancer")));
    
    // Quark
    public static final RegistryObject<Item> SHORT_QUARK_ANCIENT_DOOR = ITEMS.register(DDNames.SHORT_QUARK_ANCIENT, () -> new ShortDoorItem(DDBlocks.SHORT_QUARK_ANCIENT_DOOR.get(), addIfItemIsAvailable(new ResourceLocation("quark", "ancient_door"), conditionalTabProperties("quark"))));
    public static final RegistryObject<Item> SHORT_QUARK_AZALEA_DOOR = ITEMS.register(DDNames.SHORT_QUARK_AZALEA, () -> new ShortDoorItem(DDBlocks.SHORT_QUARK_AZALEA_DOOR.get(), conditionalTabProperties("quark")));
    public static final RegistryObject<Item> SHORT_QUARK_BLOSSOM_DOOR = ITEMS.register(DDNames.SHORT_QUARK_BLOSSOM, () -> new ShortDoorItem(DDBlocks.SHORT_QUARK_BLOSSOM_DOOR.get(), conditionalTabProperties("quark")));
    
    public static final RegistryObject<Item> TALL_QUARK_ANCIENT_DOOR = ITEMS.register(DDNames.TALL_QUARK_ANCIENT, () -> new TallDoorItem(DDBlocks.TALL_QUARK_ANCIENT_DOOR.get(), addIfItemIsAvailable(new ResourceLocation("quark", "ancient_door"), conditionalTabProperties("quark"))));
    public static final RegistryObject<Item> TALL_QUARK_AZALEA_DOOR = ITEMS.register(DDNames.TALL_QUARK_AZALEA, () -> new TallDoorItem(DDBlocks.TALL_QUARK_AZALEA_DOOR.get(), conditionalTabProperties("quark")));
    public static final RegistryObject<Item> TALL_QUARK_BLOSSOM_DOOR = ITEMS.register(DDNames.TALL_QUARK_BLOSSOM, () -> new TallDoorItem(DDBlocks.TALL_QUARK_BLOSSOM_DOOR.get(), conditionalTabProperties("quark")));
    
    // Silent Gear
    public static final RegistryObject<Item> SHORT_NETHERWOOD_DOOR = ITEMS.register(DDNames.SHORT_NETHERWOOD, () -> new ShortDoorItem(DDBlocks.SHORT_NETHERWOOD_DOOR.get(), conditionalTabProperties("silentgear")));

    public static final RegistryObject<Item> TALL_NETHERWOOD_DOOR = ITEMS.register(DDNames.TALL_NETHERWOOD, () -> new TallDoorItem(DDBlocks.TALL_NETHERWOOD_DOOR.get(), conditionalTabProperties("silentgear")));

    // Snowy Spirit
    public static final RegistryObject<Item> SHORT_GINGERBREAD_DOOR = ITEMS.register(DDNames.SHORT_GINGERBREAD, () -> new ShortDoorItem(DDBlocks.SHORT_GINGERBREAD_DOOR.get(), conditionalTabProperties("snowyspirit")));
    
    public static final RegistryObject<Item> TALL_GINGERBREAD_DOOR = ITEMS.register(DDNames.TALL_GINGERBREAD, () -> new TallDoorItem(DDBlocks.TALL_GINGERBREAD_DOOR.get(), conditionalTabProperties("snowyspirit")));
    
    // Supplementaries
    public static final RegistryObject<Item> SHORT_GOLD_DOOR = ITEMS.register(DDNames.SHORT_GOLD, () -> new ShortDoorItem(DDBlocks.SHORT_GOLD_DOOR.get(), conditionalTabProperties("supplementaries")));
    public static final RegistryObject<Item> SHORT_SILVER_DOOR = ITEMS.register(DDNames.SHORT_SILVER, () -> new ShortDoorItem(DDBlocks.SHORT_SILVER_DOOR.get(), addIfItemIsAvailable(new ResourceLocation("supplementaries", "silver_door"), conditionalTabProperties("supplementaries"))));
    public static final RegistryObject<Item> SHORT_LEAD_DOOR = ITEMS.register(DDNames.SHORT_LEAD, () -> new ShortDoorItem(DDBlocks.SHORT_LEAD_DOOR.get(), addIfItemIsAvailable(new ResourceLocation("supplementaries", "lead_door"), conditionalTabProperties("supplementaries"))));
    public static final RegistryObject<Item> SHORT_NETHERITE_DOOR = ITEMS.register(DDNames.SHORT_NETHERITE, () -> new ShortDoorItem(DDBlocks.SHORT_NETHERITE_DOOR.get(), conditionalTabProperties("supplementaries").fireResistant()));
    
    public static final RegistryObject<Item> TALL_GOLD_DOOR = ITEMS.register(DDNames.TALL_GOLD, () -> new TallDoorItem(DDBlocks.TALL_GOLD_DOOR.get(), conditionalTabProperties("supplementaries")));
    public static final RegistryObject<Item> TALL_SILVER_DOOR = ITEMS.register(DDNames.TALL_SILVER, () -> new TallDoorItem(DDBlocks.TALL_SILVER_DOOR.get(), addIfItemIsAvailable(new ResourceLocation("supplementaries", "silver_door"), conditionalTabProperties("supplementaries"))));
    public static final RegistryObject<Item> TALL_LEAD_DOOR = ITEMS.register(DDNames.TALL_LEAD, () -> new TallDoorItem(DDBlocks.TALL_LEAD_DOOR.get(), addIfItemIsAvailable(new ResourceLocation("supplementaries", "lead_door"), conditionalTabProperties("supplementaries"))));
    public static final RegistryObject<Item> TALL_NETHERITE_DOOR = ITEMS.register(DDNames.TALL_NETHERITE, () -> new TallDoorItem(DDBlocks.TALL_NETHERITE_DOOR.get(), conditionalTabProperties("supplementaries").fireResistant()));
    
    // Tinkers Construct
    public static final RegistryObject<Item> SHORT_BLOODSHROOM_DOOR = ITEMS.register(DDNames.SHORT_BLOODSHROOM, () -> new ShortDoorItem(DDBlocks.SHORT_BLOODSHROOM_DOOR.get(), conditionalTabProperties("tconstruct")));
    public static final RegistryObject<Item> SHORT_GREENHEART_DOOR = ITEMS.register(DDNames.SHORT_GREENHEART, () -> new ShortDoorItem(DDBlocks.SHORT_GREENHEART_DOOR.get(), conditionalTabProperties("tconstruct")));
    public static final RegistryObject<Item> SHORT_SKYROOT_DOOR = ITEMS.register(DDNames.SHORT_SKYROOT, () -> new ShortDoorItem(DDBlocks.SHORT_SKYROOT_DOOR.get(), conditionalTabProperties("tconstruct")));

    public static final RegistryObject<Item> TALL_BLOODSHROOM_DOOR = ITEMS.register(DDNames.TALL_BLOODSHROOM, () -> new TallDoorItem(DDBlocks.TALL_BLOODSHROOM_DOOR.get(), conditionalTabProperties("tconstruct")));
    public static final RegistryObject<Item> TALL_GREENHEART_DOOR = ITEMS.register(DDNames.TALL_GREENHEART, () -> new TallDoorItem(DDBlocks.TALL_GREENHEART_DOOR.get(), conditionalTabProperties("tconstruct")));
    public static final RegistryObject<Item> TALL_SKYROOT_DOOR = ITEMS.register(DDNames.TALL_SKYROOT, () -> new TallDoorItem(DDBlocks.TALL_SKYROOT_DOOR.get(), conditionalTabProperties("tconstruct")));
    
    // Twigs
    public static final RegistryObject<Item> SHORT_TWIGS_BAMBOO_DOOR = ITEMS.register(DDNames.SHORT_TWIGS_BAMBOO, () -> new ShortDoorItem(DDBlocks.SHORT_TWIGS_BAMBOO_DOOR.get(), conditionalTabProperties("twigs")));

    public static final RegistryObject<Item> TALL_TWIGS_BAMBOO_DOOR = ITEMS.register(DDNames.TALL_TWIGS_BAMBOO, () -> new TallDoorItem(DDBlocks.TALL_TWIGS_BAMBOO_DOOR.get(), conditionalTabProperties("twigs")));

    // Undergarden
    public static final RegistryObject<Item> SHORT_GRONGLE_DOOR = ITEMS.register(DDNames.SHORT_GRONGLE, () -> new ShortDoorItem(DDBlocks.SHORT_GRONGLE_DOOR.get(), conditionalTabProperties("undergarden")));
    public static final RegistryObject<Item> SHORT_SMOGSTEM_DOOR = ITEMS.register(DDNames.SHORT_SMOGSTEM, () -> new ShortDoorItem(DDBlocks.SHORT_SMOGSTEM_DOOR.get(), conditionalTabProperties("undergarden")));
    public static final RegistryObject<Item> SHORT_WIGGLEWOOD_DOOR = ITEMS.register(DDNames.SHORT_WIGGLEWOOD, () -> new ShortDoorItem(DDBlocks.SHORT_WIGGLEWOOD_DOOR.get(), conditionalTabProperties("undergarden")));
    
    public static final RegistryObject<Item> TALL_GRONGLE_DOOR = ITEMS.register(DDNames.TALL_GRONGLE, () -> new TallDoorItem(DDBlocks.TALL_GRONGLE_DOOR.get(), conditionalTabProperties("undergarden")));
    public static final RegistryObject<Item> TALL_SMOGSTEM_DOOR = ITEMS.register(DDNames.TALL_SMOGSTEM, () -> new TallDoorItem(DDBlocks.TALL_SMOGSTEM_DOOR.get(), conditionalTabProperties("undergarden")));
    public static final RegistryObject<Item> TALL_WIGGLEWOOD_DOOR = ITEMS.register(DDNames.TALL_WIGGLEWOOD, () -> new TallDoorItem(DDBlocks.TALL_WIGGLEWOOD_DOOR.get(), conditionalTabProperties("undergarden")));
    
    // Windswept
    public static final RegistryObject<Item> SHORT_CHESTNUT_DOOR = ITEMS.register(DDNames.SHORT_CHESTNUT, () -> new ShortDoorItem(DDBlocks.SHORT_CHESTNUT_DOOR.get(), conditionalTabProperties("windswept")));
    public static final RegistryObject<Item> SHORT_HOLLY_DOOR = ITEMS.register(DDNames.SHORT_HOLLY, () -> new ShortDoorItem(DDBlocks.SHORT_HOLLY_DOOR.get(), conditionalTabProperties("windswept")));    

    public static final RegistryObject<Item> TALL_CHESTNUT_DOOR = ITEMS.register(DDNames.TALL_CHESTNUT, () -> new TallDoorItem(DDBlocks.TALL_CHESTNUT_DOOR.get(), conditionalTabProperties("windswept")));
    public static final RegistryObject<Item> TALL_HOLLY_DOOR = ITEMS.register(DDNames.TALL_HOLLY, () -> new TallDoorItem(DDBlocks.TALL_HOLLY_DOOR.get(), conditionalTabProperties("windswept")));    
    
	public static Item.Properties conditionalTabProperties(String modid) {
		return conditionalTabProperties(modid, DramaticDoors.MAIN_TAB);
	}
    
    public static Item.Properties conditionalTabProperties(String modid, CreativeModeTab tab) {
    	return ModList.get().isLoaded(modid) ? PROPERTIES.tab(tab) : PROPERTIES.tab(null);
    }
    
    // If a mod conditionally adds doors, only make doors available if the corresponding normal-sized doors are available.
	public static Item.Properties addIfItemIsAvailable(ResourceLocation loc, Item.Properties tabProperties) {
    	if (ForgeRegistries.ITEMS.containsKey(loc)) {
    		Item item = ForgeRegistries.ITEMS.getValue(loc);
	    	if (item.getItemCategory() != null) {
	    		return tabProperties;
	    	}
    	}
    	return PROPERTIES.tab(null);
    }
}
