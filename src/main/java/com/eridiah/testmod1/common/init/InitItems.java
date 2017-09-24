package com.eridiah.testmod1.common.init;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import com.eridiah.testmod1.common.items.ItemBasic;

public class InitItems 
{
	// Other Stuff
	public static Item broken_blade;
	public static Item tin_ingot;
	
	// Chain Mail Stuff
	public static Item iron_ring, gold_ring, diamond_ring, emerald_ring; // Default Ore Rings
	public static Item tin_ring, copper_ring, steel_ring; // Custom Ore Rings
	public static Item chain_mail;
	
	// Building Materials
	public static Item daub;

	public static void init() 
	{
		broken_blade = new ItemBasic("broken_blade");
		tin_ingot = new ItemBasic("tin_ingot");
		
		iron_ring = new ItemBasic("iron_ring");
		gold_ring = new ItemBasic("gold_ring");
		diamond_ring = new ItemBasic("diamond_ring");
		emerald_ring = new ItemBasic("emerald_ring");
		
		chain_mail = new ItemBasic("chain_mail");
		
		daub = new ItemBasic("daub");
	}
	
	public static void register()
	{
		registerItem(broken_blade);
		registerItem(tin_ingot);
		
		registerItem(iron_ring);
		registerItem(gold_ring);
		registerItem(diamond_ring);
		registerItem(emerald_ring);
		
		registerItem(chain_mail);
		
		registerItem(daub);
	}
	
	public static void registerItem(Item item)
	{
		ForgeRegistries.ITEMS.register(item);
		item.setCreativeTab(CreativeTabs.MISC);
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
	
}
