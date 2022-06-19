package com.bepersch.harvest_apricorns.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Catalyst extends Item {

    public Catalyst(String name) {
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setCreativeTab(CreativeTabs.MISC);
    }
}
