package com.bepersch.harvest_apricorns.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class InfusedIngredient extends Item {

    //In future will add potions from apricorns and infused ingredients
    public InfusedIngredient(String name) {
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setCreativeTab(CreativeTabs.BREWING);
    }
}
