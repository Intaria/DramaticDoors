package com.fizzware.dramaticdoors.compat;

import com.fizzware.dramaticdoors.DDConfig;

import net.minecraftforge.event.level.LevelEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.loading.FMLPaths;

public class QuarkCompat
{
	protected static boolean hasQuarkDoubleDoor = DDConfig.getConfigBooleanValue(DDConfig.CONFIG, FMLPaths.CONFIGDIR.get().resolve("quark-common.toml"), "tweaks.Double Door Opening");
	
    public static boolean hasQuarkDoubleDoorsModule() {
    	if (Compats.QUARK_INSTALLED && hasQuarkDoubleDoor) {
    		return true;
    	}
    	return false;
    }
    
    @SubscribeEvent
	public void onWorldLoad(LevelEvent.Load e) {
    	hasQuarkDoubleDoor = DDConfig.getConfigBooleanValue(DDConfig.CONFIG, FMLPaths.CONFIGDIR.get().resolve("quark-common.toml"), "tweaks.Double Door Opening");
    }
}
