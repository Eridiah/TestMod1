package com.eridiah.testmod1.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

import com.eridiah.testmod1.common.util.IMetaName;

public class BlockTudor extends Block implements IMetaName
{
	public static final PropertyEnum<BlockTudor.EnumType> VARIANT = PropertyEnum.<BlockTudor.EnumType>create("variant", BlockTudor.EnumType.class);
	
	public BlockTudor(String name) 
	{
		super(Material.WOOD);
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setSoundType(SoundType.WOOD);
		this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, BlockTudor.EnumType.OAK));
	}
	
	@Override
	public int damageDropped(IBlockState state) 
	{
		return ((BlockTudor.EnumType)state.getValue(VARIANT)).getMeta();
	}
	
	@Override
	public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items) 
	{
		for(BlockTudor.EnumType blocktudor$enumtype : BlockTudor.EnumType.values())
		{
			items.add(new ItemStack(this, 1, blocktudor$enumtype.getMeta()));
		}
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta) 
	{
		return this.getDefaultState().withProperty(VARIANT, BlockTudor.EnumType.byMetaData(meta));
	}
	
	@Override
	public int getMetaFromState(IBlockState state) 
	{
		return ((BlockTudor.EnumType)state.getValue(VARIANT)).getMeta();
	}
	
	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) 
	{
		return new ItemStack(Item.getItemFromBlock(this), 1, (int)(getMetaFromState(world.getBlockState(pos))));
	}
	
	@Override
	protected BlockStateContainer createBlockState() 
	{
		return new BlockStateContainer(this, new IProperty[] {VARIANT});
	}
	
	public static enum EnumType implements IStringSerializable
	{
		OAK(0, "oak"),
		SPRUCE(1, "spruce");
		
		private static final BlockTudor.EnumType[] META_LOOKUP = new BlockTudor.EnumType[values().length];
		private final int meta;
		private final String name, unlocalizedName;
		
		private EnumType(int meta, String name)
		{
			this(meta, name, name);
		}
		
		private EnumType(int meta, String name, String unlocalizedName) 
		{
			this.meta = meta;
			this.name = name;
			this.unlocalizedName = unlocalizedName;
		}
		
		public String getName()
		{
			return this.name;
		}
		
		public int getMeta()
		{
			return this.meta;
		}
		
		public String getUnlocalizedName()
		{
			return this.getUnlocalizedName();
		}
		
		@Override
		public String toString()
		{
			return this.name;
		}
		
		public static BlockTudor.EnumType byMetaData(int meta)
		{
			return META_LOOKUP[meta];
		}
		
		static
		{
			for(BlockTudor.EnumType blocktudor$enumtype : values())
			{
				META_LOOKUP[blocktudor$enumtype.getMeta()] = blocktudor$enumtype;
			}
		}
		
	}
	
	public String getSpecialName(ItemStack stack) 
	{
		return BlockTudor.EnumType.values()[stack.getItemDamage()].getName();
	}

}
