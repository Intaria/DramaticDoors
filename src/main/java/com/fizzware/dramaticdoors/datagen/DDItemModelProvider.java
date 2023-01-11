package com.fizzware.dramaticdoors.datagen;

import com.fizzware.dramaticdoors.DramaticDoors;
import com.fizzware.dramaticdoors.items.DDItems;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class DDItemModelProvider extends ItemModelProvider
{
    public DDItemModelProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, DramaticDoors.MOD_ID, exFileHelper);
    }

	@Override
	protected void registerModels() {
		// Insert any tall doors that needs to be data-generated. Example below:
		super.basicItem(DDItems.TALL_OAK_DOOR.get());
	}
}
