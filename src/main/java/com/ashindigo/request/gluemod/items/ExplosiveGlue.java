package com.ashindigo.request.gluemod.items;

import com.ashindigo.request.gluemod.GlueMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ExplosiveGlue extends Item {
	
public ExplosiveGlue() {
		
		setUnlocalizedName(GlueMod.MODID + "_" + "ExplosiveGlue");
		setCreativeTab(CreativeTabs.tabMisc);
		setTextureName(GlueMod.MODID + ":" + "ExplosiveGlue");
	}

}
