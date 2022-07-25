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
    	// Insert any tall doors that needs to be data-generated. Example below:
    	tallDoorBlock(DDBlocks.TALL_OAK_DOOR.get(), "block/tall_oak");
    }
    
    private void tallDoorBlock(Block block, String baseName) {
    	internalTallDoorBlock((TallDoorBlock)block, baseName, new ResourceLocation(DramaticDoors.MOD_ID, "" + baseName + "_door_bottom"), new ResourceLocation(DramaticDoors.MOD_ID, "" + baseName + "_door_middle"), new ResourceLocation(DramaticDoors.MOD_ID, "" + baseName + "_door_top"));
    }
    
    private void internalTallDoorBlock(TallDoorBlock block, String baseName, ResourceLocation bottom, ResourceLocation middle, ResourceLocation top) {
        ModelFile bottomLeft = models().withExistingParent(baseName + "_door_bottom_left", "" + ModelProvider.BLOCK_FOLDER + "/door_bottom_left").texture("bottom", bottom).texture("middle", middle).texture("top", top);
        ModelFile bottomLeftOpen = models().withExistingParent(baseName + "_door_bottom_left_open", "" + ModelProvider.BLOCK_FOLDER + "/door_bottom_left_open").texture("bottom", bottom).texture("middle", middle).texture("top", top);
        ModelFile bottomRight = models().withExistingParent(baseName + "_door_bottom_right", "" + ModelProvider.BLOCK_FOLDER + "/door_bottom_right").texture("bottom", bottom).texture("middle", middle).texture("top", top);
        ModelFile bottomRightOpen = models().withExistingParent(baseName + "_door_bottom_right_open", "" + ModelProvider.BLOCK_FOLDER + "/door_bottom_right_open").texture("bottom", bottom).texture("middle", middle).texture("top",top);
        ModelFile middleLeft = models().withExistingParent(baseName + "_door_middle_left", "dramaticdoors:" + ModelProvider.BLOCK_FOLDER + "/door_middle_left").texture("bottom", middle).texture("middle", middle).texture("top", middle); 
        ModelFile middleLeftOpen = models().withExistingParent(baseName + "_door_middle_left_open", "dramaticdoors:" + ModelProvider.BLOCK_FOLDER + "/door_middle_left_open").texture("bottom", middle).texture("middle", middle).texture("top", middle); 
        ModelFile middleRight = models().withExistingParent(baseName + "_door_middle_right", "dramaticdoors:" + ModelProvider.BLOCK_FOLDER + "/door_middle_right").texture("bottom", middle).texture("middle", middle).texture("top", middle);
        ModelFile middleRightOpen = models().withExistingParent(baseName + "_door_middle_right_open", "dramaticdoors:" + ModelProvider.BLOCK_FOLDER + "/door_middle_right_open").texture("bottom", middle).texture("middle", middle).texture("top", middle); ;
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
        }, TallDoorBlock.POWERED);
    }
}