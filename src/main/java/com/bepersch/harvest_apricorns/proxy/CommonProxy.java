package com.bepersch.harvest_apricorns.proxy;

import com.bepersch.harvest_apricorns.init.BlocksRegister;
import com.bepersch.harvest_apricorns.init.ItemsRegister;
import com.bepersch.harvest_apricorns.init.RecipesRegister;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event) {
        ItemsRegister.initItems();
        BlocksRegister.initBlocks();
        BlocksRegister.registerBlocks();
    }

    public void init(FMLInitializationEvent event) {
        RecipesRegister.init();
    }

    public void postInit(FMLPostInitializationEvent event) {

    }
}
