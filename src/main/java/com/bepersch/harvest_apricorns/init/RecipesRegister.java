package com.bepersch.harvest_apricorns.init;

import com.bepersch.harvest_apricorns.constants.ModConstants;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.common.crafting.IRecipeFactory;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class RecipesRegister {

    public static void init() {
        registerRecipes(ModConstants.RECIPE_NAMES);
    }


    private static void registerRecipes(List<String> names) {
        for(String name : names) {
            CraftingHelper.register(
                    new ResourceLocation(ModConstants.MOD_ID, name),
                    (IRecipeFactory) (context, json) -> CraftingHelper.getRecipe(json, context)
            );
        }
    }
}
