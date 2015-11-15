package com.ashindigo.alloycraft;

import com.ashindigo.alloycraft.blocks.ForgeBlock;
import com.ashindigo.alloycraft.tileentites.ForgeTileEntity;
import com.ashindigo.utils.*;

import net.minecraft.block.material.Material;

public class AlloycraftBlocks extends UtilsItemBlockLoader {
	
	public static UtilsBlockContainer forge;
	static ForgeTileEntity teforge;

	public static void preInitBlocks() {
		
		forge = new ForgeBlock(Material.rock, AlloycraftMain.modid, "forgeblock", teforge, false);
	}

	public static void initBlocks() {
		
	}
	
	public static void postInitBlocks() {
		
	}

}