package com.eridiah.testmod1.common.handlers;

import com.eridiah.testmod1.client.handlers.RecipeHandler;
import com.eridiah.testmod1.common.init.InitBlocks;
import com.eridiah.testmod1.common.init.InitItems;

public class RegistryHandler 
{
	public static void Client()
	{
		RecipeHandler.registerCrafting();
		RecipeHandler.registerSmelting();
	}
	
	public static void Common()
	{
		InitItems.init();
		InitItems.register();
		
		InitBlocks.init();
		InitBlocks.register();
		InitBlocks.registerRenders();
	}
}
