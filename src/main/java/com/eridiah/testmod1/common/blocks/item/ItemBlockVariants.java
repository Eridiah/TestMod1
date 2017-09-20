package com.eridiah.testmod1.common.blocks.item;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

import com.eridiah.testmod1.common.util.IMetaName;

public class ItemBlockVariants extends ItemBlock
{
	public ItemBlockVariants(Block block) 
	{
		super(block);
		this.setHasSubtypes(true);
		this.setMaxDamage(0);
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack) 
	{
		return super.getUnlocalizedName() + "_" + ((IMetaName)this.block).getSpecialName(stack);
	}
	
	@Override
	public int getMetadata(int damage) 
	{
		return damage;
	}
	
}
