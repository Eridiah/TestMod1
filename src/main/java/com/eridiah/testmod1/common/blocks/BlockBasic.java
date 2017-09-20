package com.eridiah.testmod1.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockBasic extends Block
{
	public BlockBasic(String name, float resistance, float hardness, SoundType soundType) 
	{
		super(Material.ROCK);
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setResistance(resistance);
		this.setHardness(hardness);
		this.setSoundType(soundType);
	}

}
