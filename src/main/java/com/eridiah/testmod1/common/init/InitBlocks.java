package com.eridiah.testmod1.common.init;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import com.eridiah.testmod1.Reference;
import com.eridiah.testmod1.common.blocks.BlockBasic;
import com.eridiah.testmod1.common.blocks.BlockTinOre;
import com.eridiah.testmod1.common.blocks.BlockTudor;
import com.eridiah.testmod1.common.blocks.BlockWoodenFrame;
import com.eridiah.testmod1.common.blocks.item.ItemBlockVariants;

public class InitBlocks 
{
	public static Block tin_ore;
	public static Block tin_block;
	
	public static Block wooden_frame;
	
	public static Block tudor;
	
	public static void init()
	{
		tin_ore = new BlockTinOre("tin_ore", 4.0F, 2.0F, SoundType.STONE, 1);
		tin_block = new BlockBasic("tin_block", 4.0F, 2.0F, SoundType.METAL);
		
		wooden_frame = new BlockWoodenFrame("wooden_frame");
		
		tudor = new BlockTudor("tudor");
	}
	
	public static void register()
	{
		registerBlock(tin_ore);
		registerBlock(tin_block);
		
		registerBlock(wooden_frame);
		
		registerBlockWithVariants(tudor, new ItemBlockVariants(tudor));
	}
	
	public static void registerRenders()
	{
		for(int i = 0; i < BlockTudor.EnumType.values().length; i++)
		{
			registerRender(tudor, i, "tudor_" + BlockTudor.EnumType.values()[i].getName());
		}
	}
	
	public static void registerBlock(Block block)
	{
		ForgeRegistries.BLOCKS.register(block);
		block.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		ForgeRegistries.ITEMS.register(item);
		
		ModelLoader.setCustomModelResourceLocation(item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
	
	public static void registerBlockWithVariants(Block block, ItemBlock itemBlock)
	{
		ForgeRegistries.BLOCKS.register(block);
		block.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		itemBlock.setRegistryName(block.getRegistryName());
		ForgeRegistries.ITEMS.register(itemBlock);
	}
	
	public static void registerRender(Block block, int meta, String fileName)
	{
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), meta, new ModelResourceLocation(new ResourceLocation(Reference.MODID, fileName), "inventory"));
	}
}
