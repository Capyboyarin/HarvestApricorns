package com.bepersch.harvest_apricorns.init;

import com.bepersch.harvest_apricorns.block.ApricornFarmland;
import com.bepersch.harvest_apricorns.constants.ModConstants;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Mod.EventBusSubscriber
public class BlocksRegister {

    static List<Block> modBlocks = new ArrayList<Block>();

    public static void initBlocks() {
        modBlocks.addAll(Arrays.asList(
                new ApricornFarmland(ModConstants.APRICORN_FARMLAND),
                new ApricornFarmland(ModConstants.GREAT_APRICORN_FARMLAND),
                new ApricornFarmland(ModConstants.ULTIMATE_APRICORN_FARMLAND)
        ));
    }

    public static void registerBlocks() {
        for (Block block : modBlocks) {
            registerBlock(block);
        }
    }

    public static void registerBlockRenders() {
        for (Block block : modBlocks) {
            registerBlockRender(block);
        }
    }

    @SideOnly(Side.CLIENT)
    private static void registerBlock(Block block) {
        ForgeRegistries.BLOCKS.register(block);
        ForgeRegistries.ITEMS.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
    }

    @SideOnly(Side.CLIENT)
    private static void registerBlockRender(Block block) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(
                Item.getItemFromBlock(block),
                0,
                new ModelResourceLocation(block.getRegistryName(), "inventory")
        );
    }
}
