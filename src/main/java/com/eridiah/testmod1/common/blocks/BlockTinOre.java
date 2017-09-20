package com.eridiah.testmod1.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockTinOre extends BlockBasic
{
	public BlockTinOre(String name, float resistance, float hardness, SoundType soundType, int harvestLevel) 
	{
		super(name, resistance, hardness, soundType);
		this.setHarvestLevel("pickaxe", harvestLevel);
	}

}
