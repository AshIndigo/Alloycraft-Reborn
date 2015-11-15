package com.ashindigo.request.gluemod.items;

import com.ashindigo.request.gluemod.GlueMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class GlueAmmo extends Item {
	
	public GlueAmmo() {

		setUnlocalizedName(GlueMod.MODID + "_" + "GlueAmmo");
		setCreativeTab(CreativeTabs.tabMisc);
		setTextureName(GlueMod.MODID + ":" + "GlueAmmo");
	}

}
