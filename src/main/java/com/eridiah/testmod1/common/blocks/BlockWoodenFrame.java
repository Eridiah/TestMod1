package com.eridiah.testmod1.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockWoodenFrame extends Block 
{	
	public BlockWoodenFrame(String name) 
	{
		super(Material.WOOD);
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setResistance(15.0F);
		this.setHardness(1.0F);
		this.setSoundType(SoundType.LADDER);
	}

	@Override
	public boolean isTranslucent(IBlockState state) 
	{
		return true;
	}
	
	@Override
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.TRANSLUCENT;
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state) 
	{
		return false;
	}
}
