package com.ashindigo.RustMod.lib;

import com.ashindigo.RustMod.RustMod;

import cpw.mods.fml.client.config.GuiConfig;
import cpw.mods.fml.client.config.GuiMessageDialog;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.client.event.ConfigChangedEvent.PostConfigChangedEvent;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.eventhandler.Event.Result;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

public class GuiConfigRustMod extends GuiConfig {
	  public GuiConfigRustMod(GuiScreen parent) {
	    super(parent,
	        new ConfigElement(RustMod.config.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
	        "rustmod", true, false, GuiConfig.getAbridgedConfigPath(RustMod.config.toString()));
	  }
}

   