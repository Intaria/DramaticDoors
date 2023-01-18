package com.fizzware.dramaticdoors.datagen;

import com.fizzware.dramaticdoors.DramaticDoors;
import com.fizzware.dramaticdoors.blocks.DDBlocks;
import com.fizzware.dramaticdoors.blocks.TallDoorBlock;
import com.fizzware.dramaticdoors.state.properties.TripleBlockPart;

import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.DoorHingeSide;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.client.model.generators.ModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class DDBlockStateProvider extends BlockStateProvider {
	
    public DDBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, DramaticDoors.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
    	// If Chipped gets updated for 1.19.2.
    	/*tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_MANGROVE_DOOR_01.get(), "block/chipped/tall_mangrove_door_01", "block/chipped/tall_mangrove_door_1");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_MANGROVE_DOOR_02.get(), "block/chipped/tall_mangrove_door_02", "block/chipped/tall_mangrove_door_2");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_MANGROVE_DOOR_03.get(), "block/chipped/tall_mangrove_door_03", "block/chipped/tall_mangrove_door_3");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_MANGROVE_DOOR_04.get(), "block/chipped/tall_mangrove_door_04", "block/chipped/tall_mangrove_door_4");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_MANGROVE_DOOR_05.get(), "block/chipped/tall_mangrove_door_05", "block/chipped/tall_mangrove_door_5");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_MANGROVE_DOOR_06.get(), "block/chipped/tall_mangrove_door_06", "block/chipped/tall_mangrove_door_6");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_MANGROVE_DOOR_07.get(), "block/chipped/tall_mangrove_door_07", "block/chipped/tall_mangrove_door_7");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_MANGROVE_DOOR_08.get(), "block/chipped/tall_mangrove_door_08", "block/chipped/tall_mangrove_door_8");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_MANGROVE_DOOR_09.get(), "block/chipped/tall_mangrove_door_09", "block/chipped/tall_mangrove_door_9");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_MANGROVE_DOOR_10.get(), "block/chipped/tall_mangrove_door_10", "block/chipped/tall_mangrove_door_10");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_MANGROVE_DOOR_11.get(), "block/chipped/tall_mangrove_door_11", "block/chipped/tall_mangrove_door_11");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_MANGROVE_DOOR_12.get(), "block/chipped/tall_mangrove_door_12", "block/chipped/tall_mangrove_door_12");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_MANGROVE_DOOR_13.get(), "block/chipped/tall_mangrove_door_13", "block/chipped/tall_mangrove_door_13");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_MANGROVE_DOOR_14.get(), "block/chipped/tall_mangrove_door_14", "block/chipped/tall_mangrove_door_14");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_MANGROVE_DOOR_15.get(), "block/chipped/tall_mangrove_door_15", "block/chipped/tall_mangrove_door_15");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_MANGROVE_DOOR_16.get(), "block/chipped/tall_mangrove_door_16", "block/chipped/tall_mangrove_door_16");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_MANGROVE_DOOR_17.get(), "block/chipped/tall_mangrove_door_17", "block/chipped/tall_mangrove_door_17");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_MANGROVE_DOOR_18.get(), "block/chipped/tall_mangrove_door_18", "block/chipped/tall_mangrove_door_18");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_MANGROVE_DOOR_19.get(), "block/chipped/tall_mangrove_door_19", "block/chipped/tall_mangrove_door_19");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_MANGROVE_DOOR_20.get(), "block/chipped/tall_mangrove_door_20", "block/chipped/tall_mangrove_door_20");*/
    	
    	// Insert any tall doors that need to be data-generated. Example below:
    	tallDoorBlock(DDBlocks.TALL_OAK_DOOR.get(), "block/tall_oak");

    }
    
    /*private void tallDoorBlockAlt(Block block, String baseName, String texName) {
    	internalTallDoorBlockAlt((TallDoorBlock)block, baseName, new ResourceLocation(DramaticDoors.MOD_ID, "" + texName + "_bottom"), new ResourceLocation(DramaticDoors.MOD_ID, "" + texName + "_middle"), new ResourceLocation(DramaticDoors.MOD_ID, "" + texName + "_top"));
    }*/
    
    private void tallDoorBlock(Block block, String baseName) {
    	internalTallDoorBlock((TallDoorBlock)block, baseName, new ResourceLocation(DramaticDoors.MOD_ID, "" + baseName + "_door_bottom"), new ResourceLocation(DramaticDoors.MOD_ID, "" + baseName + "_door_middle"), new ResourceLocation(DramaticDoors.MOD_ID, "" + baseName + "_door_top"));
    }
    
    /*private void internalTallDoorBlockAlt(TallDoorBlock block, String baseName, ResourceLocation bottom, ResourceLocation middle, ResourceLocation top) {
        ModelFile bottomLeft = models().withExistingParent(baseName + "_bottom_left", "" + ModelProvider.BLOCK_FOLDER + "/door_bottom_left").texture("bottom", bottom).texture("middle", middle).texture("top", top);
        ModelFile bottomLeftOpen = models().withExistingParent(baseName + "_bottom_left_open", "" + ModelProvider.BLOCK_FOLDER + "/door_bottom_left_open").texture("bottom", bottom).texture("middle", middle).texture("top", top);
        ModelFile bottomRight = models().withExistingParent(baseName + "_bottom_right", "" + ModelProvider.BLOCK_FOLDER + "/door_bottom_right").texture("bottom", bottom).texture("middle", middle).texture("top", top);
        ModelFile bottomRightOpen = models().withExistingParent(baseName + "_bottom_right_open", "" + ModelProvider.BLOCK_FOLDER + "/door_bottom_right_open").texture("bottom", bottom).texture("middle", middle).texture("top",top);
        ModelFile middleLeft = models().withExistingParent(baseName + "_middle_left", "dramaticdoors:" + ModelProvider.BLOCK_FOLDER + "/door_middle_left").texture("bottom", middle).texture("middle", middle).texture("top", middle); 
        ModelFile middleLeftOpen = models().withExistingParent(baseName + "_middle_left_open", "dramaticdoors:" + ModelProvider.BLOCK_FOLDER + "/door_middle_left_open").texture("bottom", middle).texture("middle", middle).texture("top", middle); 
        ModelFile middleRight = models().withExistingParent(baseName + "_middle_right", "dramaticdoors:" + ModelProvider.BLOCK_FOLDER + "/door_middle_right").texture("bottom", middle).texture("middle", middle).texture("top", middle);
        ModelFile middleRightOpen = models().withExistingParent(baseName + "_middle_right_open", "dramaticdoors:" + ModelProvider.BLOCK_FOLDER + "/door_middle_right_open").texture("bottom", middle).texture("middle", middle).texture("top", middle);
        ModelFile topLeft = models().withExistingParent(baseName + "_top_left", "" + ModelProvider.BLOCK_FOLDER + "/door_top_left").texture("bottom", bottom).texture("middle", middle).texture("top", top);
        ModelFile topLeftOpen = models().withExistingParent(baseName + "_top_left_open", "" + ModelProvider.BLOCK_FOLDER + "/door_top_left_open").texture("bottom", bottom).texture("middle", middle).texture("top", top);
        ModelFile topRight = models().withExistingParent(baseName + "_top_right", "" + ModelProvider.BLOCK_FOLDER + "/door_top_right").texture("bottom", bottom).texture("middle", middle).texture("top", top);
        ModelFile topRightOpen = models().withExistingParent(baseName + "_top_right_open", "" + ModelProvider.BLOCK_FOLDER + "/door_top_right_open").texture("bottom", bottom).texture("middle", middle).texture("top",top);
        tallDoorBlock(block, bottomLeft, bottomLeftOpen, bottomRight, bottomRightOpen, middleLeft, middleLeftOpen, middleRight, middleRightOpen, topLeft, topLeftOpen, topRight, topRightOpen);
    }*/
    
    private void internalTallDoorBlock(TallDoorBlock block, String baseName, ResourceLocation bottom, ResourceLocation middle, ResourceLocation top) {
        ModelFile bottomLeft = models().withExistingParent(baseName + "_door_bottom_left", "" + ModelProvider.BLOCK_FOLDER + "/door_bottom_left").texture("bottom", bottom).texture("middle", middle).texture("top", top);
        ModelFile bottomLeftOpen = models().withExistingParent(baseName + "_door_bottom_left_open", "" + ModelProvider.BLOCK_FOLDER + "/door_bottom_left_open").texture("bottom", bottom).texture("middle", middle).texture("top", top);
        ModelFile bottomRight = models().withExistingParent(baseName + "_door_bottom_right", "" + ModelProvider.BLOCK_FOLDER + "/door_bottom_right").texture("bottom", bottom).texture("middle", middle).texture("top", top);
        ModelFile bottomRightOpen = models().withExistingParent(baseName + "_door_bottom_right_open", "" + ModelProvider.BLOCK_FOLDER + "/door_bottom_right_open").texture("bottom", bottom).texture("middle", middle).texture("top",top);
        ModelFile middleLeft = models().withExistingParent(baseName + "_door_middle_left", "dramaticdoors:" + ModelProvider.BLOCK_FOLDER + "/door_middle_left").texture("bottom", middle).texture("middle", middle).texture("top", middle); 
        ModelFile middleLeftOpen = models().withExistingParent(baseName + "_door_middle_left_open", "dramaticdoors:" + ModelProvider.BLOCK_FOLDER + "/door_middle_left_open").texture("bottom", middle).texture("middle", middle).texture("top", middle); 
        ModelFile middleRight = models().withExistingParent(baseName + "_door_middle_right", "dramaticdoors:" + ModelProvider.BLOCK_FOLDER + "/door_middle_right").texture("bottom", middle).texture("middle", middle).texture("top", middle);
        ModelFile middleRightOpen = models().withExistingParent(baseName + "_door_middle_right_open", "dramaticdoors:" + ModelProvider.BLOCK_FOLDER + "/door_middle_right_open").texture("bottom", middle).texture("middle", middle).texture("top", middle);
        ModelFile topLeft = models().withExistingParent(baseName + "_door_top_left", "" + ModelProvider.BLOCK_FOLDER + "/door_top_left").texture("bottom", bottom).texture("middle", middle).texture("top", top);
        ModelFile topLeftOpen = models().withExistingParent(baseName + "_door_top_left_open", "" + ModelProvider.BLOCK_FOLDER + "/door_top_left_open").texture("bottom", bottom).texture("middle", middle).texture("top", top);
        ModelFile topRight = models().withExistingParent(baseName + "_door_top_right", "" + ModelProvider.BLOCK_FOLDER + "/door_top_right").texture("bottom", bottom).texture("middle", middle).texture("top", top);
        ModelFile topRightOpen = models().withExistingParent(baseName + "_door_top_right_open", "" + ModelProvider.BLOCK_FOLDER + "/door_top_right_open").texture("bottom", bottom).texture("middle", middle).texture("top",top);
        tallDoorBlock(block, bottomLeft, bottomLeftOpen, bottomRight, bottomRightOpen, middleLeft, middleLeftOpen, middleRight, middleRightOpen, topLeft, topLeftOpen, topRight, topRightOpen);
    }

    public void tallDoorBlock(TallDoorBlock block, ModelFile bottomLeft, ModelFile bottomLeftOpen, ModelFile bottomRight, ModelFile bottomRightOpen, ModelFile middleLeft, ModelFile middleLeftOpen, ModelFile middleRight, ModelFile middleRightOpen, ModelFile topLeft, ModelFile topLeftOpen, ModelFile topRight, ModelFile topRightOpen) {
        getVariantBuilder(block).forAllStatesExcept(state -> {
            int yRot = ((int) state.getValue(TallDoorBlock.FACING).toYRot()) + 90;
            TripleBlockPart third = state.getValue(TallDoorBlock.THIRD);
            boolean right = state.getValue(TallDoorBlock.HINGE) == DoorHingeSide.RIGHT;
            boolean open = state.getValue(TallDoorBlock.OPEN);
            if (open) {
                yRot += 90;
            }
            if (right && open) {
                yRot += 180;
            }
            yRot %= 360;

            ModelFile model = null;
            switch(third) {
            	case LOWER:
            	default:
		            if (right && open) {
		                model = bottomRightOpen;
		            } else if (!right && open) {
		                model = bottomLeftOpen;
		            }
		            if (right && !open) {
		                model = bottomRight;
		            } else if (!right && !open) {
		                model = bottomLeft;
		            }
            		break;
            	case MIDDLE:
		            if (right && open) {
		                model = middleRightOpen;
		            } else if (!right && open) {
		                model = middleLeftOpen;
		            }
		            if (right && !open) {
		                model = middleRight;
		            } else if (!right && !open) {
		                model = middleLeft;
		            }
            		break;
            	case UPPER:
		            if (right && open) {
		                model = topRightOpen;
		            } else if (!right && open) {
		                model = topLeftOpen;
		            }
		            if (right && !open) {
		                model = topRight;
		            } else if (!right && !open) {
		                model = topLeft;
		            }
            		break;
            }
            return ConfiguredModel.builder().modelFile(model).rotationY(yRot).build();
        }, TallDoorBlock.POWERED, TallDoorBlock.WATERLOGGED);
    }
}