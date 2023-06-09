package com.fizzware.dramaticdoors;

import java.io.IOException;

import com.fizzware.dramaticdoors.blockentities.DDBlockEntities;
import com.fizzware.dramaticdoors.blocks.DDBlocks;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

import com.fizzware.dramaticdoors.client.ClientRenderer;
import com.fizzware.dramaticdoors.compat.AutomaticDoorCompat;
import com.fizzware.dramaticdoors.compat.Compats;
import com.fizzware.dramaticdoors.compat.QuarkCompat;
import com.fizzware.dramaticdoors.compat.StatementCompat;
import com.fizzware.dramaticdoors.compat.registries.DDBiomePackRegistry;
import com.fizzware.dramaticdoors.compat.registries.DDChippedRegistry;
import com.fizzware.dramaticdoors.compat.registries.DDDimensionalPackRegistry;
import com.fizzware.dramaticdoors.compat.registries.DDMacawsDoorsRegistry;
import com.fizzware.dramaticdoors.compat.registries.DDMagicPackRegistry;
import com.fizzware.dramaticdoors.compat.registries.DDManyIdeasDoorsRegistry;
import com.fizzware.dramaticdoors.compat.registries.DDMiscPackRegistry;
import com.fizzware.dramaticdoors.compat.registries.DDTechPackRegistry;
import com.fizzware.dramaticdoors.compat.registries.DDVanillaesquePackRegistry;
import com.fizzware.dramaticdoors.items.DDItems;
import com.google.common.collect.ImmutableList;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.metadata.pack.PackMetadataSection;
import net.minecraft.server.packs.repository.PackSource;
import net.minecraft.server.packs.repository.Pack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.AddPackFindersEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLEnvironment;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.resource.PathPackResources;
import oshi.util.tuples.Quartet;

@Mod("dramaticdoors")
public class DramaticDoors
{
    public static final String MOD_ID = "dramaticdoors";
    
    //public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    
    public DramaticDoors() {
    	IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus(); // Please let this be a normal field trip.
    	
    	// With the Mr. Fizzware? No freakin' way! Register events for the Magic Forge Bus to take them on an extraordinary trip.
    	DDBlocks.BLOCKS.register(bus);
    	DDItems.ITEMS.register(bus);
    	ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, DDConfig.CONFIG);
    	
        bus.addListener(this::setupCommon);
        if (FMLEnvironment.dist == Dist.CLIENT) { bus.addListener(this::setupClient); }
        
        MinecraftForge.EVENT_BUS.register(this);
        
        // Hook in the compats.
        if (Compats.VANILLAESQUE_PACK_ENABLED.getValue()) {
        	bus.register(DDVanillaesquePackRegistry.class);
        	DDBlockEntities.BLOCK_ENTITIES.register(bus);
        }
        if (Compats.BIOME_PACK_ENABLED.getValue()) {
        	bus.register(DDBiomePackRegistry.class);
        }
        if (Compats.DIMENSIONAL_PACK_ENABLED.getValue()) {
        	bus.register(DDDimensionalPackRegistry.class);
        }
        if (Compats.MAGIC_PACK_ENABLED.getValue()) {
        	bus.register(DDMagicPackRegistry.class);
        }
        if (Compats.TECH_PACK_ENABLED.getValue()) {
        	bus.register(DDTechPackRegistry.class);
        }
        if (Compats.MISC_PACK_ENABLED.getValue()) {
        	bus.register(DDMiscPackRegistry.class);
        }
        if (Compats.CHIPPED_INSTALLED) {
        	bus.register(DDChippedRegistry.class);
        }
        if (Compats.MACAWS_DOORS_INSTALLED) {
        	bus.register(DDMacawsDoorsRegistry.class);
        }
        if (Compats.MANYIDEAS_DOORS_INSTALLED) {
        	bus.register(DDManyIdeasDoorsRegistry.class);
        }
    	/*if (Compats.STATEMENT_INSTALLED) { 
    		StatementCompat.implementWaterlogging(false);
    	}*/
    	bus.addListener(this::setupBuiltInDataPack);
    }
    
    private void setupCommon(final FMLCommonSetupEvent event) {
    	if (Compats.STATEMENT_INSTALLED) {
    		StatementCompat.implementWaterlogging(true);
    	}
    	if (Compats.AUTOMATIC_DOORS_INSTALLED) {
    		MinecraftForge.EVENT_BUS.register(new AutomaticDoorCompat());
    	}
    	if (Compats.QUARK_INSTALLED) {
    		MinecraftForge.EVENT_BUS.register(new QuarkCompat());
    	}
    	MinecraftForge.EVENT_BUS.register(DDEvents.class);
    }
    
    private void setupClient(final FMLClientSetupEvent event) {
    	ClientRenderer.setRenderers();
    }

    public static final CreativeModeTab MAIN_TAB = new CreativeModeTab("dramaticdoors") {
		@Override
		public ItemStack makeIcon() { return new ItemStack(DDItems.TALL_OAK_DOOR.get()); }
    };
    
    public static final CreativeModeTab CHIPPED_TAB = Compats.CHIPPED_INSTALLED ? new CreativeModeTab("dramaticdoors_chipped") {
		@Override
		public ItemStack makeIcon() { return new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation(MOD_ID, DDNames.TALL_CHIPPED_BIRCH_GATED))); }
    } : null;
    
    public static final CreativeModeTab MACAW_TAB = Compats.MACAWS_DOORS_INSTALLED ? new CreativeModeTab("dramaticdoors_macaw") {
		@Override
		public ItemStack makeIcon() { return new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation(MOD_ID, DDNames.TALL_MACAW_DARK_OAK_BARN))); }
    } : null;
    
    public static final CreativeModeTab MANYIDEAS_TAB = Compats.MANYIDEAS_DOORS_INSTALLED ? new CreativeModeTab("dramaticdoors_manyideas") {
		@Override
		public ItemStack makeIcon() { return new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation(MOD_ID, DDNames.TALL_MANYIDEAS_CRIMSON_BLANK))); }
    } : null;

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {}
    
    private void setupBuiltInDataPack(final AddPackFindersEvent event) {
    	// Declare variables and bundle them in an immutable list.
    	var packVanilla = new Quartet<>("vanillaesque", Compats.VANILLAESQUE_PACK_ENABLED.getValue(), "datapacks/dd_vanillaesque_compatpack", "DD - Vanillaesque Pack");
    	var packBiome = new Quartet<>("biome", Compats.BIOME_PACK_ENABLED.getValue(), "datapacks/dd_biomes_compatpack", "DD - Biome Pack");
    	var packDim = new Quartet<>("dimensional", Compats.DIMENSIONAL_PACK_ENABLED.getValue(), "datapacks/dd_dimensions_compatpack", "DD - Dimensional Pack");
    	var packMagic = new Quartet<>("magic", Compats.MAGIC_PACK_ENABLED.getValue(), "datapacks/dd_magic_compatpack", "DD - Magic Pack");
    	var packTech = new Quartet<>("tech", Compats.TECH_PACK_ENABLED.getValue(), "datapacks/dd_tech_compatpack", "DD - Tech Pack");
    	var packMisc = new Quartet<>("misc", Compats.MISC_PACK_ENABLED.getValue(), "datapacks/dd_misc_compatpack", "DD - Misc Pack");
    	var pack1 = new Quartet<>("chipped", Compats.CHIPPED_INSTALLED, "datapacks/dd_chipped_compat", "DD - Chipped Compat");
    	var pack2 = new Quartet<>("macaw", Compats.MACAWS_DOORS_INSTALLED, "datapacks/dd_macaws_compat", "DD - Macaw's Doors Compat");
    	var pack3 = new Quartet<>("manyideas", Compats.MANYIDEAS_DOORS_INSTALLED, "datapacks/dd_manyideas_compat", "DD - ManyIdeas Doors Compat");
    	var packs = ImmutableList.of(packVanilla, packBiome, packDim, packMagic, packTech, packMisc, pack1, pack2, pack3);
    	// Iterate through the pack list and accordingly add packs.

    	if (event.getPackType() == PackType.SERVER_DATA) {
    		try {
		    	for (Quartet<String, Boolean, String, String> packToCheck : packs) {
	    			if (!packToCheck.getB()) {
	    				continue;
	    			}
	        		var resourcePath = ModList.get().getModFileById(MOD_ID).getFile().findResource(packToCheck.getC());
	                try (var pack = new PathPackResources(ModList.get().getModFileById(MOD_ID).getFile().getFileName() + ":" + resourcePath, resourcePath)) {
						var metadataSection = pack.getMetadataSection(PackMetadataSection.SERIALIZER);
						if (metadataSection != null) {
						    event.addRepositorySource((packConsumer, packConstructor) -> packConsumer.accept(packConstructor.create("builtin/dramaticdoors-" + packToCheck.getA(), Component.literal(packToCheck.getD()), false, () -> pack, metadataSection, Pack.Position.BOTTOM, PackSource.BUILT_IN, false)));
						}
					}
		    	}
		    }
	        catch(IOException ex) {
	        	throw new RuntimeException(ex);
	        }
        }
    }
}
