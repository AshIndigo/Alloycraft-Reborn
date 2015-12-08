package com.ashindigo.alloycraft.items;

import java.util.ArrayList;

import com.ashindigo.utils.UtilsToolset;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class AlloySword extends UtilsToolset.UtilsSword {
	
	static int runtime = 0;
	static String MODID;
	public static String textureName;
	static Item Material;

	public AlloySword(ToolMaterial material, String name, String modid, Item toolmat) {
		super(material, name, modid, toolmat);
		this.setUnlocalizedName(modid + "_" + name);
	    this.setTextureName(modid + ":" + name);
	    setCreativeTab(CreativeTabs.tabCombat);
	    UtilsToolset.listtools.add(name);
	    Material = toolmat;
	    UtilsToolset.sword = this;
	}
	}