package com.fizzware.dramaticdoors;

import java.io.IOException;

import com.fizzware.dramaticdoors.client.ClientRenderer;
import com.fizzware.dramaticdoors.compat.AutomaticDoorCompat;
import com.fizzware.dramaticdoors.compat.Compats;
import com.fizzware.dramaticdoors.compat.QuarkCompat;
import com.fizzware.dramaticdoors.compat.StatementCompat;
import com.fizzware.dramaticdoors.init.DDBlockEntities;
import com.fizzware.dramaticdoors.init.DDBlocks;
import com.fizzware.dramaticdoors.init.DDItems;
import com.fizzware.dramaticdoors.init.compat.DDBYGRegistry;
import com.fizzware.dramaticdoors.init.compat.DDChippedRegistry;
import com.fizzware.dramaticdoors.init.compat.DDMacawsDoorsRegistry;
import com.fizzware.dramaticdoors.init.compat.DDManyIdeasDoorsRegistry;
import com.fizzware.dramaticdoors.init.compat.DDMoShizRegistry;
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
import oshi.util.tuples.Triplet;

@Mod("dramaticdoors")
public class DramaticDoors
{
    public static final String MOD_ID = "dramaticdoors";
    
    public DramaticDoors() {
    	IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus(); // Please let this be a normal field trip.
    	
    	// With the LexManos? No freakin' way! Register events for the Magic Forge Bus to take them on an extraordinary trip.
    	DDBlocks.BLOCKS.register(bus);
    	DDItems.ITEMS.register(bus);
    	DDBlockEntities.BLOCK_ENTITIES.register(bus);
    	ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, DDConfig.CONFIG);
    	
        bus.addListener(this::setupCommon);
        if (FMLEnvironment.dist == Dist.CLIENT) { bus.addListener(this::setupClient); }
        
        MinecraftForge.EVENT_BUS.register(this);
        
        // Hook in the compats.
        if (Compats.CHIPPED_INSTALLED) {
        	bus.register(DDChippedRegistry.class);
        }
        if (Compats.MACAWS_DOORS_INSTALLED) {
        	bus.register(DDMacawsDoorsRegistry.class);
        }
        if (Compats.MANYIDEAS_DOORS_INSTALLED) {
        	bus.register(DDManyIdeasDoorsRegistry.class);
        }
        if (ModList.get().isLoaded("byg")) {
        	bus.register(DDBYGRegistry.class);
        }
       if (ModList.get().isLoaded("ms")) {
        	bus.register(DDMoShizRegistry.class);
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
    	var pack1 = new Triplet<>("byg", "datapacks/dd_byg_compat", "Dramatic Doors - Oh the Biomes You'll Go Compat");
    	var pack2 = new Triplet<>("ms", "datapacks/dd_ms_compat", "Dramatic Doors - Mo'Shiz Compat");
    	var pack3 = new Triplet<>("chipped", "datapacks/dd_chipped_compat", "Dramatic Doors - Chipped Compat");
    	var pack4 = new Triplet<>("mcwdoors", "datapacks/dd_macaws_compat", "Dramatic Doors - Macaw's Doors Compat");
    	var pack5 = new Triplet<>("manyideas_doors", "datapacks/dd_manyideas_compat", "Dramatic Doors - ManyIdeas Doors Compat");
    	var packs = ImmutableList.of(pack1, pack2, pack3, pack4, pack5);
    	// Iterate through the pack list and accordingly add packs.

    	if (event.getPackType() == PackType.SERVER_DATA) {
    		try {
		    	for (Triplet<String, String, String> packToCheck : packs) {
	    			if (!ModList.get().isLoaded(packToCheck.getA())) {
	    				continue;
	    			}
	        		var resourcePath = ModList.get().getModFileById(MOD_ID).getFile().findResource(packToCheck.getB());
	                try (var pack = new PathPackResources(ModList.get().getModFileById(MOD_ID).getFile().getFileName() + ":" + resourcePath, resourcePath)) {
						var metadataSection = pack.getMetadataSection(PackMetadataSection.SERIALIZER);
						if (metadataSection != null) {
						    event.addRepositorySource((packConsumer, packConstructor) -> packConsumer.accept(packConstructor.create("builtin/dramaticdoors-" + packToCheck.getA(), Component.literal(packToCheck.getC()), false, () -> pack, metadataSection, Pack.Position.BOTTOM, PackSource.BUILT_IN, false)));
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
