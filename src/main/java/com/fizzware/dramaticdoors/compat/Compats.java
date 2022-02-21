package com.fizzware.dramaticdoors.compat;

import net.minecraftforge.fml.ModList;

public class Compats
{
    public static final boolean DOUBLE_DOORS_INSTALLED;
    public static final boolean SUPPLEMENTARIES_INSTALLED;
    
    static {
    	DOUBLE_DOORS_INSTALLED = ModList.get().isLoaded("doubledoors");
    	SUPPLEMENTARIES_INSTALLED = ModList.get().isLoaded("supplementaries");
    }
}
