package com.ashindigo.request.gluemod.items;

import com.ashindigo.request.gluemod.GlueMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class DirtRing extends ItemFood {
	
	public DirtRing(int p_i45340_1_, boolean p_i45340_2_) {
		super(p_i45340_1_, p_i45340_2_);
		
		setUnlocalizedName(GlueMod.MODID + "_" + "DirtRing");
		setCreativeTab(CreativeTabs.tabMisc);
		setTextureName(GlueMod.MODID + ":" + "DirtRing");
	}

}
