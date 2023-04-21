package com.fizzware.dramaticdoors.datagen;

import java.util.Objects;

import com.fizzware.dramaticdoors.DramaticDoors;
import com.fizzware.dramaticdoors.items.DDItems;

import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

public class DDItemModelProvider extends ItemModelProvider
{
    public DDItemModelProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, DramaticDoors.MOD_ID, exFileHelper);
    }

	@Override
	protected void registerModels() {
		// Insert any items that need to be data-generated. Example below:
		super.basicItem(DDItems.SHORT_OAK_DOOR.get());
		super.basicItem(DDItems.TALL_OAK_DOOR.get());
	}
	
	// For item textures stored in a subfolder. Otherwise, use super.basicItem
    public ItemModelBuilder basicItem(Item item, ResourceLocation tex)
    {
        return getBuilder(Objects.requireNonNull(ForgeRegistries.ITEMS.getKey(item)).toString())
                .parent(new ModelFile.UncheckedModelFile("item/generated"))
                .texture("layer0", new ResourceLocation(tex.getNamespace(), "item/" +tex.getPath()));
    }
}
