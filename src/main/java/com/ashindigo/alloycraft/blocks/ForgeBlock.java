package com.ashindigo.alloycraft.blocks;

import java.util.Random;

import com.ashindigo.alloycraft.AlloycraftBlocks;
import com.ashindigo.alloycraft.AlloycraftMain;
import com.ashindigo.alloycraft.tileentites.ForgeTileEntity;
import com.ashindigo.utils.UtilsBlockContainer;

import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class ForgeBlock extends UtilsBlockContainer {
	
	private Random rand;
	private final boolean isActive;
	private static boolean keepInventory = true;
	private Block drop;
	private int meta;
	private int least_quantity;
	private int most_quantity;
	
	@SideOnly(Side.CLIENT)
	private IIcon iconFront;

	public ForgeBlock(Material mat, String modid, String name, TileEntity tilentity, boolean blockState) {
		super(mat, modid, name, tilentity);
		setBlockName(modid + "_" + name);
		setCreativeTab(CreativeTabs.tabBlock);
		setBlockTextureName(modid + ":" + name);
		this.tileEntity = tilentity;
		rand = new Random();
		isActive = blockState;
	}
	
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
    	if (world.isRemote) {
    		return true;
    	}else if (!player.isSneaking()) {
    		ForgeTileEntity entity = (ForgeTileEntity) world.getTileEntity(x, y, z);
    		if (entity != null) {
    			FMLNetworkHandler.openGui(player, AlloycraftMain.instance, AlloycraftMain.guiIDForge, world, x, y, z);
    		}
    		return true;
    	}else{
    		return false;
    	}
    }
	

	public static void updateBlockState(boolean issmelting, World world, int xCoord, int yCoord, int zCoord) {
		
		int i = world.getBlockMetadata(xCoord, yCoord, zCoord);
		TileEntity entity = world.getTileEntity(xCoord, yCoord, zCoord);
		keepInventory = true;
		
		if (issmelting) {
			world.setBlock(xCoord, yCoord, zCoord, AlloycraftBlocks.forge);
		}else{
			world.setBlock(xCoord, yCoord, zCoord, AlloycraftBlocks.forge);
		}
		
		keepInventory = false;
		world.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, i, 2);
		
		if (entity != null) {
			entity.validate();
			world.setTileEntity(xCoord, yCoord, zCoord, entity);
		}
	}
	
	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		// TODO Auto-generated method stub
		return new ForgeTileEntity();
	}

}
