package com.ashindigo.request.gluemod.items;

import java.util.List;

import com.ashindigo.request.gluemod.EntityGPELBolt;
import com.ashindigo.request.gluemod.GlueMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemGPEL extends Item {

  public ItemGPEL() {
	  	setUnlocalizedName(GlueMod.MODID + "_" + "GPEL");
		setCreativeTab(CreativeTabs.tabTools);
		setTextureName(GlueMod.MODID + ":" + "GPEL");
		setMaxStackSize(1);
  }
  
  public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
  {
	  if(par3EntityPlayer.capabilities.isCreativeMode || par3EntityPlayer.inventory.consumeInventoryItem(GlueMod.glueammo)) {
		  par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
		
	          par2World.spawnEntityInWorld(new EntityGPELBolt(par2World, par3EntityPlayer));
	  }
            
      return par1ItemStack;
  }
  		  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
          {
          	par3List.add("Glue Powered Explosive Launcher");

          }
    	  
      }
