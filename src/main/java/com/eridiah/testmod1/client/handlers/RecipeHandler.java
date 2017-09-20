package com.eridiah.testmod1.client.handlers;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.eridiah.testmod1.common.init.InitBlocks;
import com.eridiah.testmod1.common.init.InitItems;

public class RecipeHandler 
{
	public static void registerCrafting()
	{
		GameRegistry.addShapedRecipe(new ResourceLocation("tm:tudor_oak"), new ResourceLocation("tm:testing_blocks"), new ItemStack(InitBlocks.tudor, 1, 0), new Object[] {"DDD", "DWD", "DDD", 'W', InitBlocks.wooden_frame, 'D', InitItems.daub});
		GameRegistry.addShapedRecipe(new ResourceLocation("tm:wooden_frame"), new ResourceLocation("tm:testing_blocks"), new ItemStack(InitBlocks.wooden_frame), new Object[] {"SPS", "PSP", "SPS", 'P', new ItemStack(Blocks.PLANKS, 1, 0), 'S', Items.STICK});
	}
	
	public static void registerSmelting()
	{
		GameRegistry.addSmelting(InitBlocks.tin_ore, new ItemStack(InitItems.tin_ingot), 20);
	}
}
