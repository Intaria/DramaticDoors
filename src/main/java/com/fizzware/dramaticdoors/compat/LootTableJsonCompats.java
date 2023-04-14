package com.fizzware.dramaticdoors.compat;

import java.util.ArrayList;

import javax.annotation.Nullable;

import com.google.gson.JsonObject;

import net.minecraft.resources.ResourceLocation;

public class LootTableJsonCompats
{
    public static JsonObject createLootTableJson(ArrayList<Character> keys, ArrayList<ResourceLocation> items, ArrayList<String> type, ArrayList<String> pattern, ResourceLocation output, @Nullable String group) {
        //Creating a new json object, where we will store our recipe.
        JsonObject json = new JsonObject();
        return json;
    }
}
