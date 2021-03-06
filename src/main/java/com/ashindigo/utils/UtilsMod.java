package com.ashindigo.utils;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Small Forge mod to run required methods.
 */
//Make dummy varible declarations to make the set TODO
@Mod(modid = "indigoutils", version = "1.0", name = "IndigoUtils")
public class UtilsMod implements UtilsMain{

	@Override
	@EventHandler
	public void preinit(FMLPreInitializationEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@EventHandler
	public void init(FMLInitializationEvent event) {
		UtilsItemBlockLoader.initItems();
		UtilsItemBlockLoader.initBlocks();
	}

	@Override
	@EventHandler
	public void postinit(FMLPostInitializationEvent event) {
		UtilsItemBlockLoader.postInitItems();
		UtilsItemBlockLoader.postInitBlocks();
		GameRegistry.registerWorldGenerator(new UtilsWorldgen(), 1);
	}

}
