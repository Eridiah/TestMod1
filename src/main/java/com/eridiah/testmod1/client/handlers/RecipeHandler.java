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
		// Recipies for Tin Stuff
		GameRegistry.addShapedRecipe(new ResourceLocation("tm:tin_block"), new ResourceLocation("tm:testing_blocks"), new ItemStack(InitBlocks.tin_block), new Object[] {"TTT", "TTT", "TTT", 'T', InitItems.tin_ingot});
		
		// Recipes for Tudor Stuff
		GameRegistry.addShapedRecipe(new ResourceLocation("tm:tudor_oak"), new ResourceLocation("tm:testing_blocks"), new ItemStack(InitBlocks.tudor, 1, 0), new Object[] {"DDD", "DWD", "DDD", 'W', InitBlocks.wooden_frame, 'D', InitItems.daub});
		GameRegistry.addShapedRecipe(new ResourceLocation("tm:wooden_frame"), new ResourceLocation("tm:testing_blocks"), new ItemStack(InitBlocks.wooden_frame), new Object[] {"SPS", "PSP", "SPS", 'P', new ItemStack(Blocks.PLANKS, 1, 0), 'S', Items.STICK});
		
		// Recipes for Chain Stuff
		GameRegistry.addShapedRecipe(new ResourceLocation("tm:iron_ring"), new ResourceLocation("tm:testing_items"), new ItemStack(InitItems.iron_ring), new Object[] {"III", "I I", "III", 'I', Items.IRON_INGOT});
		GameRegistry.addShapedRecipe(new ResourceLocation("tm:gold_ring"), new ResourceLocation("tm:testing_items"), new ItemStack(InitItems.gold_ring), new Object[] {"GGG", "G G", "GGG", 'G', Items.GOLD_INGOT});
		GameRegistry.addShapedRecipe(new ResourceLocation("tm:diamond_ring"), new ResourceLocation("tm:testing_items"), new ItemStack(InitItems.diamond_ring), new Object[] {"DDD", "D D", "DDD", 'D', Items.DIAMOND});
		GameRegistry.addShapedRecipe(new ResourceLocation("tm:emerald_ring"), new ResourceLocation("tm:testing_items"), new ItemStack(InitItems.emerald_ring), new Object[] {"EEE", "E E", "EEE", 'E', Items.EMERALD});
		
		GameRegistry.addShapedRecipe(new ResourceLocation("tm:chain_mail"), new ResourceLocation("tm:testing_items"), new ItemStack(InitItems.chain_mail), new Object[] {" I ", "III", " I ", 'I', InitItems.iron_ring});
		
		GameRegistry.addShapedRecipe(new ResourceLocation("tm:chainmail_helmet"), new ResourceLocation("tm:testing_armor"), new ItemStack(Items.CHAINMAIL_HELMET), new Object[] {"CCC", "C C", 'C', InitItems.chain_mail});
		GameRegistry.addShapedRecipe(new ResourceLocation("tm:chainmail_chestplate"), new ResourceLocation("tm:testing_armor"), new ItemStack(Items.CHAINMAIL_CHESTPLATE), new Object[] {"C C", "CCC", "CCC", 'C', InitItems.chain_mail});
		GameRegistry.addShapedRecipe(new ResourceLocation("tm:chainmail_leggings"), new ResourceLocation("tm:testing_armor"), new ItemStack(Items.CHAINMAIL_LEGGINGS), new Object[] {"CCC", "C C", "C C", 'C', InitItems.chain_mail});
		GameRegistry.addShapedRecipe(new ResourceLocation("tm:chainmail_boots"), new ResourceLocation("tm:testing_armor"), new ItemStack(Items.CHAINMAIL_BOOTS), new Object[] {"C C", "C C", 'C', InitItems.chain_mail});
	}
	
	public static void registerSmelting()
	{
		GameRegistry.addSmelting(InitBlocks.tin_ore, new ItemStack(InitItems.tin_ingot), 20);
	}
}
