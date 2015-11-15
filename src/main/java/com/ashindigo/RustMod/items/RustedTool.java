package com.ashindigo.RustMod.items;

import com.ashindigo.RustMod.lib.Strings;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class RustedTool extends Item {
	
public RustedTool() {
		
		setUnlocalizedName(Strings.modid + "_" + "RustedTool");
		setCreativeTab(CreativeTabs.tabMisc);
		setTextureName(Strings.modid + ":" + "RustedTool");
	}

}
