package com.ashindigo.RustMod;

import com.ashindigo.RustMod.items.RustedTool;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class RustModItems {
	
	public static Item rustedtool;
	
	public static void preinit() {
		
		rustedtool = new RustedTool();
	}

	public static void init() {
		GameRegistry.registerItem(rustedtool, "RustedTool");
	}

	public static void postinit() {
		// TODO Auto-generated method stub
		
	}

}
