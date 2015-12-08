package com.ashindigo.alloycraft.items;

import com.ashindigo.utils.UtilsToolset;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class AlloyAxe extends UtilsToolset.UtilsAxe {
	
	static int runtime = 0;
	static String MODID;
	public static String textureName;
	static Item Material;

	public AlloyAxe(ToolMaterial material, String name, String modid, Item toolmat) {
		super(material, name, modid, toolmat);
		this.setUnlocalizedName(modid + "_" + name);
	    this.setTextureName(modid + ":" + name);
	    setCreativeTab(CreativeTabs.tabCombat);
	    UtilsToolset.listtools.add(name);
	    Material = toolmat;
	    UtilsToolset.axe= this;
	}

}
