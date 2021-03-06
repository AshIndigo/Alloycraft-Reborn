package com.ashindigo.RustMod;

import com.ashindigo.RustMod.lib.CommonProxy;
import com.ashindigo.RustMod.lib.RustModEventHandler;
import com.ashindigo.RustMod.lib.Strings;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraft.world.World;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;

@Mod(modid = Strings.modid, version = Strings.version, name = Strings.name, guiFactory = "com.ashindigo.RustMod.lib.GuiFactory")
public class RustMod {
	
	@SidedProxy(clientSide = Strings.CLIENT_PROXY_CLASS, serverSide = Strings.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;
	
	@Instance(Strings.modid)
	public static RustMod instance;
	
	public static Configuration config;
	public static boolean hardcoremode;
	public static int decayrate;
	public static boolean fun;
	
	RustModEventHandler events = new RustModEventHandler();
	
	@EventHandler
	public void preinit(FMLPreInitializationEvent event){
		
		//Get config setup and start creating item(s).
		config = new Configuration(event.getSuggestedConfigurationFile());
		RustModItems.preinit();
		syncConfig();
		//decayrate = 1;
	}

	//Config Manager
	public static void syncConfig() {
		//config.load();
		fun = config.getBoolean("???", "general", false, "??? Default: False");
    	hardcoremode =  config.getBoolean("Is Hardcore Mode enabled?", "general", false, "Enables Hardcore mode if true Default: False");
    	decayrate = config.getInt("Decay Rate", "general", 1, 1, 1000, "How fast do tools decay when in water");
    	config.save();
	}


	@EventHandler
	public void init(FMLInitializationEvent event){
		
		//Create item(s), add recipe(s), and setup event bus.
		RustModItems.init();
		GameRegistry.addSmelting(RustModItems.rustedtool,new ItemStack(Items.iron_ingot), 0);
		MinecraftForge.EVENT_BUS.register(events);
		FMLCommonHandler.instance().bus().register(events);
	}
	
	@EventHandler
	public void postinit(FMLPostInitializationEvent event){
		
		//Nothing to see here.
		RustModItems.postinit();
	}

}
