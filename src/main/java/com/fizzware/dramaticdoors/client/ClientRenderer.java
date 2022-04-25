package com.fizzware.dramaticdoors.client;

import com.fizzware.dramaticdoors.blocks.DramaticDoorsBlocks;
import com.fizzware.dramaticdoors.blocks.DramaticDoorsBlocks.DoorSeries;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class ClientRenderer
{
	public static void setRenderers() {
        // Setup Render Types (mainly for transparent doors like Acacia and Jungle)
        setRenderersForDoorSeries(DramaticDoorsBlocks.DoorSeries.VANILLA_TALL);
        //Conditionally add rendering on where mods are loaded.
        setRenderersForDoorSeries(DramaticDoorsBlocks.DoorSeries.BOP_TALL);
        setRenderersForDoorSeries(DramaticDoorsBlocks.DoorSeries.BYG_TALL);
        setRenderersForDoorSeries(DramaticDoorsBlocks.DoorSeries.POKECUBE_TALL);
        setRenderersForDoorSeries(DramaticDoorsBlocks.DoorSeries.PREHISTORIC_FAUNA_TALL);
        setRenderersForDoorSeries(DramaticDoorsBlocks.DoorSeries.TWILIGHT_FOREST_TALL);

        setRenderersForDoorSeries(DramaticDoorsBlocks.DoorSeries.ATMOSPHERIC_TALL);
        setRenderersForDoorSeries(DramaticDoorsBlocks.DoorSeries.AUTUMNITY_TALL);
        setRenderersForDoorSeries(DramaticDoorsBlocks.DoorSeries.BAMBOO_TALL);
        setRenderersForDoorSeries(DramaticDoorsBlocks.DoorSeries.BUZZIER_TALL);
        setRenderersForDoorSeries(DramaticDoorsBlocks.DoorSeries.ENDERGETIC_TALL);
        setRenderersForDoorSeries(DramaticDoorsBlocks.DoorSeries.ENVIRONMENTAL_TALL);
        setRenderersForDoorSeries(DramaticDoorsBlocks.DoorSeries.UPGRADE_AQUATIC_TALL);

        setRenderersForDoorSeries(DramaticDoorsBlocks.DoorSeries.ABUNDANCE_TALL);
        setRenderersForDoorSeries(DramaticDoorsBlocks.DoorSeries.BAYOU_BLUES_TALL);
        setRenderersForDoorSeries(DramaticDoorsBlocks.DoorSeries.ENH_MUSHROOMS_TALL);
        setRenderersForDoorSeries(DramaticDoorsBlocks.DoorSeries.ARCHITECTS_PALETTE_TALL);
        setRenderersForDoorSeries(DramaticDoorsBlocks.DoorSeries.CREATE_ALLOYED_TALL);
        setRenderersForDoorSeries(DramaticDoorsBlocks.DoorSeries.CREATE_DECO_TALL);
        setRenderersForDoorSeries(DramaticDoorsBlocks.DoorSeries.DARKER_DEPTHS_TALL);
        setRenderersForDoorSeries(DramaticDoorsBlocks.DoorSeries.DUSTRIAL_DECOR_TALL);
        setRenderersForDoorSeries(DramaticDoorsBlocks.DoorSeries.ECOLOGICS_TALL);
        setRenderersForDoorSeries(DramaticDoorsBlocks.DoorSeries.HABITAT_TALL);
        setRenderersForDoorSeries(DramaticDoorsBlocks.DoorSeries.OUTER_END_TALL);
        setRenderersForDoorSeries(DramaticDoorsBlocks.DoorSeries.PREMIUM_WOOD_TALL);
        setRenderersForDoorSeries(DramaticDoorsBlocks.DoorSeries.QUARK_TALL);
        setRenderersForDoorSeries(DramaticDoorsBlocks.DoorSeries.SUPPLEMENTARIES_TALL);
	}
	
	private static void setRenderersForDoorSeries(DoorSeries series) {
        for (Block doorBlock : DramaticDoorsBlocks.getBlockList(series)) {
        	if (doorBlock != null) {
        		ItemBlockRenderTypes.setRenderLayer(doorBlock, RenderType.translucent());
        	}
        }
	}

}
