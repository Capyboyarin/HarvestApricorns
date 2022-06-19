package com.bepersch.harvest_apricorns.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class ApricornFarmland extends Block {

    public ApricornFarmland(String name) {
        super(Material.GROUND);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        this.setSoundType(SoundType.GROUND);
        this.setHarvestLevel("shovel", 1);
        this.setHardness(1.2F);
    }
}
