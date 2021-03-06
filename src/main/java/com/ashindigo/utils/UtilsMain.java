package com.ashindigo.utils;

import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
* An interface dedicated to making an easy base mod file
* @author Ash Indigo
*/
public interface UtilsMain {
	
	/**
	* The preinit event for Forge
	* Make sure to add @EventHandler
	*/
	@EventHandler
	public void preinit(FMLPreInitializationEvent event);
	
	/**
	* The init event for Forge
	* Make sure to add @EventHandler
	*/
	@EventHandler
	public void init(FMLInitializationEvent event);
	
	/**
	* The postinit event for Forge
	* Make sure to add @EventHandler
	*/
	@EventHandler
	public void postinit(FMLPostInitializationEvent event);


}
