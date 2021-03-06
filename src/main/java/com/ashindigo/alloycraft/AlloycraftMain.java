package com.ashindigo.alloycraft;

import com.ashindigo.alloycraft.lib.CommonProxy;
import com.ashindigo.alloycraft.lib.GuiHandler;
import com.ashindigo.alloycraft.lib.RecipeHandler;
import com.ashindigo.alloycraft.tileentites.ForgeTileEntity;
import com.ashindigo.utils.UtilsMain;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = AlloycraftMain.modid, version = "1.0", name = "Alloycraft")
public class AlloycraftMain implements UtilsMain {
	
	public static final String modid = "alloycraft";
	public final static String CLIENT_PROXY_CLASS = "com.ashindigo.alloycraft.lib.ClientProxy";
	public final static String SERVER_PROXY_CLASS = "com.ashindigo.alloycraft.lib.CommonProxy";
		
		@SidedProxy(clientSide = CLIENT_PROXY_CLASS, serverSide = SERVER_PROXY_CLASS)
	    public static CommonProxy proxy;
		
		@Instance(modid)
		public static AlloycraftMain instance;

		public static final int guiIDForge = 1;
		
		@Override
		@EventHandler
		public void preinit(FMLPreInitializationEvent event) {
			
			AlloycraftItems.preInitItems();
			AlloycraftBlocks.preInitBlocks();
		}

		@Override
		@EventHandler
		public void init(FMLInitializationEvent event) {
			
			AlloycraftBlocks.initBlocks();
			AlloycraftItems.initItems();
			GameRegistry.addRecipe(new RecipeHandler());
	    	NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());
			GameRegistry.registerTileEntity(ForgeTileEntity.class, "forgefurnace2");
			GameRegistry.registerBlock(AlloycraftBlocks.forgeoff, "cool");
			GameRegistry.registerBlock(AlloycraftBlocks.forgeon, "cool2");
		}

		@Override
		@EventHandler
		public void postinit(FMLPostInitializationEvent event) {
			
			AlloycraftItems.postInitItems();
			AlloycraftBlocks.postInitBlocks();
			
		}



}
