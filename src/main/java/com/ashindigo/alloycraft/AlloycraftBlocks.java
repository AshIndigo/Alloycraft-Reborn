package com.ashindigo.alloycraft;

import com.ashindigo.alloycraft.blocks.ForgeBlock;
import com.ashindigo.utils.UtilsItemBlockLoader;

import net.minecraft.block.Block;

public class AlloycraftBlocks extends UtilsItemBlockLoader {

	public static Block forgeoff;
	public static Block forgeon;

	public static void preInitBlocks() {
		
		forgeon = new ForgeBlock(true);
		forgeoff = new ForgeBlock(false);
	}

	public static void initBlocks() {
		
	}
	
	public static void postInitBlocks() {
		
	}

}
