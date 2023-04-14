package com.fizzware.dramaticdoors.datagen;

import java.util.function.Consumer;

import com.fizzware.dramaticdoors.DramaticDoors;
import com.fizzware.dramaticdoors.init.DDItems;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;

public class DDRecipeProvider extends RecipeProvider
{

	public DDRecipeProvider(DataGenerator gen) {
		super(gen);
	}

	@Override
	public String getName() {
		return "Redstone " + super.getName();
	}
	
	@Override
	protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
		// Generate recipes for tall doors. Example below.
		tallDoorRecipe(consumer, DDItems.TALL_OAK_DOOR.get(), Items.OAK_DOOR, "tall_wooden_door");
	}
	
	// At the moment, you will need to manually add mod loaded conditions.
	protected static void tallDoorRecipe(Consumer<FinishedRecipe> consumer, ItemLike tallDoor, ItemLike baseDoor, String group) {
		ShapedRecipeBuilder.shaped(tallDoor, 2).define('#', baseDoor).pattern("#").pattern("#").pattern("#").group(group).unlockedBy("has_items", has(baseDoor)).save(consumer, new ResourceLocation(DramaticDoors.MOD_ID, getSimpleRecipeName(tallDoor)));
	}
}
