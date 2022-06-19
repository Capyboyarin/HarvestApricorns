package com.bepersch.harvest_apricorns.init;


import com.bepersch.harvest_apricorns.constants.ModConstants;
import com.bepersch.harvest_apricorns.item.Catalyst;
import com.bepersch.harvest_apricorns.item.InfusedIngredient;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Mod.EventBusSubscriber
public class ItemsRegister {

    static List<Item> modItems = new ArrayList<Item>();

    public static void initItems() {

        modItems.addAll(Arrays.asList(
                new Catalyst(ModConstants.APRICORN_CATALYST),
                new Catalyst(ModConstants.GREAT_APRICORN_CATALYST),
                new Catalyst(ModConstants.ULTIMATE_APRICORN_CATALYST),
                new InfusedIngredient(ModConstants.CATALYST_DUST),
                new InfusedIngredient(ModConstants.INFUSED_GEMSTONE)
        ));
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(modItems.toArray(new Item[0]));
    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void registerModels(ModelRegistryEvent event) {
        registerItemsModels(modItems);
    }

    @SideOnly(Side.CLIENT)
    private static void registerItemsModels(List<Item> items) {
        for (Item item : items) {
            ModelLoader.setCustomModelResourceLocation(
                    item,
                    0,
                    new ModelResourceLocation(item.getRegistryName(), "inventory")
            );
        }
    }
}
