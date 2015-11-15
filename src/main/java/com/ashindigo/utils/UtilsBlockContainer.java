package com.ashindigo.utils;

import java.util.ArrayList;

import com.ashindigo.alloycraft.tileentites.ForgeTileEntity;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class UtilsBlockContainer extends BlockContainer {

	public static ArrayList listblock = new ArrayList();
	static int runtime = 0;
	public static ArrayList blocklists = new ArrayList();
	public static TileEntity tileEntity;
	
	/**
	 * Constructor used for declaring blocks
	 * @param mat The material for the block
	 * @param modid Your mod's Mod ID
	 * @param name The name of the block
	 * TODO Make more compact
	 */
	public UtilsBlockContainer(Material mat, String modid, String name, TileEntity tileentity) {
			super(mat);
			setBlockName(modid + "_" + name);
			setCreativeTab(CreativeTabs.tabBlock);
			setBlockTextureName(modid + ":" + name);
			listblock.add(name);
			blocklists.add(this);
			tileEntity = tileentity;
			
		}
	/**
	 * Default constructor for setting up a varible
	 * @param mat Just use Material.rock
	 */
	public UtilsBlockContainer(Material mat) {
		super(mat);
	}
	/**
	 * Method that starts the automatic registration of blocks.
	 */
	public static void register() {
		while(runtime < listblock.size()){
			GameRegistry.registerBlock((Block) blocklists.get(runtime), ("indigoapiblockcontainer" + runtime));
			runtime++;
			}
		}

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		// TODO Auto-generated method stub
		return tileEntity;
	}

}