package com.eridiah.testmod1.common.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

import com.eridiah.testmod1.Reference;

public class ItemBasic extends Item 
{
	public ItemBasic(String name) 
	{
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setCreativeTab(CreativeTabs.MATERIALS);
	}
}
