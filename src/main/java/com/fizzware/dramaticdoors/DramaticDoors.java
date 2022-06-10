package com.fizzware.dramaticdoors;

import com.fizzware.dramaticdoors.blockentities.DDBlockEntities;
import com.fizzware.dramaticdoors.blocks.DDBlocks;
import com.fizzware.dramaticdoors.client.ClientRenderer;
import com.fizzware.dramaticdoors.items.DDItems;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLEnvironment;

@Mod("dramaticdoors")
public class DramaticDoors
{
    public static final String MOD_ID = "dramaticdoors";

    public DramaticDoors() {
    	DDBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    	DDItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    	DDBlockEntities.BLOCK_ENTITIES.register(FMLJavaModLoadingContext.get().getModEventBus());
    	
    	
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setupCommon);
        if (FMLEnvironment.dist == Dist.CLIENT) {
        	FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setupClient); 
        }

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setupCommon(final FMLCommonSetupEvent event) {
        MinecraftForge.EVENT_BUS.register(new DDEvents());
    }
    
    private void setupClient(final FMLClientSetupEvent event) {
    	ClientRenderer.setRenderers();
    }

    public static final CreativeModeTab TAB = new CreativeModeTab("dramaticdoors") {
		@Override
		public ItemStack makeIcon() {
			return new ItemStack(DDItems.TALL_OAK_DOOR.get());
		}
    };

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {}
}
