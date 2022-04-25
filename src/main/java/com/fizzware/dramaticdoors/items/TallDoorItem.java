package com.fizzware.dramaticdoors.items;

import javax.annotation.Nullable;

import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Material;

public class TallDoorItem extends BlockItem
{
	public TallDoorItem(Block block, Properties properties) {
		super(block, properties);
	}

	@Override
	public int getBurnTime(ItemStack stack, @Nullable RecipeType<?> recipeType) {
		if (this.getBlock().defaultBlockState().getMaterial() == Material.WOOD && !stack.is(ItemTags.NON_FLAMMABLE_WOOD)) {
			return 300;
		}
		else {
			return -1; // Can't be used as furnace fuel.
		}
	}
}
