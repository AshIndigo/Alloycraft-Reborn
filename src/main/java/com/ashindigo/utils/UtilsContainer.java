package com.ashindigo.utils;

import com.ashindigo.alloycraft.tileentites.ForgeTileEntity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.tileentity.TileEntityFurnace;

public class UtilsContainer extends Container {
	
	public int nslot = 40;
	public InventoryPlayer InvPlayer;
	UtilsTileEntity TEforge;

	public UtilsContainer(InventoryPlayer invPlayer) {
		
	}
	public UtilsContainer() {
		
	}

	
	@Override
	public boolean canInteractWith(EntityPlayer p_75145_1_) {

		return true;
	}

}
