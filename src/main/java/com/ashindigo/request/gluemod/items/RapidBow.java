package com.ashindigo.request.gluemod.items;

import com.ashindigo.request.gluemod.EntityGPELBolt;
import com.ashindigo.request.gluemod.GlueMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class RapidBow extends Item {

  public RapidBow() {
	  	setUnlocalizedName(GlueMod.MODID + "_" + "RapidBow");
		setCreativeTab(CreativeTabs.tabTools);
		setTextureName(GlueMod.MODID + ":" + "RapidBow");
		setMaxStackSize(1);
  }
  
  public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
  {
	  if(par3EntityPlayer.capabilities.isCreativeMode || par3EntityPlayer.inventory.consumeInventoryItem(Items.arrow)) {
		  par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
		
	          par2World.spawnEntityInWorld(new EntityArrow(par2World, par3EntityPlayer, 5));
	  }
            
      return par1ItemStack;
  }
}