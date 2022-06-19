package com.bepersch.harvest_apricorns;

import com.bepersch.harvest_apricorns.constants.ModConstants;
import com.bepersch.harvest_apricorns.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(
        modid = ModConstants.MOD_ID,
        version = ModConstants.MOD_VERSION,
        name = ModConstants.MOD_NAME
)
public class HarvestApricorns {

    @SidedProxy(
            clientSide = ModConstants.CLIENT_PROXY_PATH,
            serverSide = ModConstants.SERVER_PROXY_PATH
    )
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}
