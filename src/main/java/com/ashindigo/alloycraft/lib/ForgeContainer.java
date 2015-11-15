package com.ashindigo.alloycraft.lib;

import com.ashindigo.alloycraft.tileentites.ForgeTileEntity;
import com.ashindigo.utils.UtilsContainer;
import com.ashindigo.utils.UtilsSlot;
import com.ashindigo.utils.UtilsTileEntity;

import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Slot;

public class ForgeContainer extends UtilsContainer {

	static UtilsContainer container;
	public static int Nslots = 40;
	ForgeTileEntity teforge;

	public ForgeContainer(InventoryPlayer invPlayer) {
		super(invPlayer);
		
		//Inventory
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 9; j++) {
				this.addSlotToContainer(new Slot(invPlayer, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
			}
		}
		
		//ActionBar
		for(int i = 0; i < 9; i++) {
			this.addSlotToContainer(new Slot(invPlayer, i, 8 + i * 18, 142));
		}
		
		this.addSlotToContainer(new Slot(teforge, 0, 45, 17));
		this.addSlotToContainer(new Slot(teforge, 1, 45, 49));
		this.addSlotToContainer(new Slot(teforge, 2, 8, 56));
		this.addSlotToContainer(new UtilsSlot(invPlayer.player, teforge, 3, 113, 33));
	}
	}
