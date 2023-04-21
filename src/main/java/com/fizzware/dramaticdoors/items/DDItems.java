package com.fizzware.dramaticdoors.items;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DramaticDoors;
import com.fizzware.dramaticdoors.blocks.DDBlocks;

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
    
    // Register all those items for short and tall version of vanilla regular-sized doors.
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
