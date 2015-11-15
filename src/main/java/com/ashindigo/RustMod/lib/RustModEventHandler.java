package com.ashindigo.RustMod.lib;

import com.ashindigo.RustMod.RustMod;
import com.ashindigo.RustMod.RustModItems;

import akka.actor.FSM.Event;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.PlayerTickEvent;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class RustModEventHandler {
	
	public RustModEventHandler() {
		super();
		// TODO Auto-generated constructor stub
	}
	static EntityPlayer player;
	
	@SubscribeEvent
	public void onPlayerTick(PlayerTickEvent event)
	{
		//See if the player is in water
			if (event.player.isInWater() == true){
				try{
					//If true then see if the player has an iron pick equipped
				if (event.player.getCurrentEquippedItem().getItem() == Items.iron_pickaxe){
					//Change the iron pick based on config
					if(RustMod.hardcoremode == true){
						event.player.setCurrentItemOrArmor(0, new ItemStack(RustModItems.rustedtool));
					} else { 
						event.player.getCurrentEquippedItem().getItem().setDamage(event.player.getCurrentEquippedItem(), event.player.getCurrentEquippedItem().getItemDamage() + RustMod.decayrate);
					}
				}
				if (event.player.getCurrentEquippedItem().getItem() == Items.iron_shovel){
					//Change the iron shovel based on config
					if(RustMod.hardcoremode == true){
						event.player.setCurrentItemOrArmor(0, new ItemStack(RustModItems.rustedtool));
					} else {
					event.player.getCurrentEquippedItem().getItem().setDamage(event.player.getCurrentEquippedItem(), event.player.getCurrentEquippedItem().getItemDamage() + RustMod.decayrate);
					}
				}
				if (event.player.getCurrentEquippedItem().getItem() == Items.iron_sword){
					//Change the iron sword based on config
					if(RustMod.hardcoremode == true){
						event.player.setCurrentItemOrArmor(0, new ItemStack(RustModItems.rustedtool));
					} else {
					event.player.getCurrentEquippedItem().getItem().setDamage(event.player.getCurrentEquippedItem(), event.player.getCurrentEquippedItem().getItemDamage() + RustMod.decayrate);
					}
				}
				if (event.player.getCurrentEquippedItem().getItem() == Items.iron_axe){
					//Change the iron axe based on config
					if(RustMod.hardcoremode == true){
						event.player.setCurrentItemOrArmor(0, new ItemStack(RustModItems.rustedtool));
					} else {
					event.player.getCurrentEquippedItem().getItem().setDamage(event.player.getCurrentEquippedItem(), event.player.getCurrentEquippedItem().getItemDamage() + RustMod.decayrate);
					}
				}
				if (event.player.getCurrentEquippedItem().getItem() == Items.iron_hoe){
					//Change the iron hoe based on config
					if(RustMod.hardcoremode == true){
						event.player.setCurrentItemOrArmor(0, new ItemStack(RustModItems.rustedtool));
					} else {
					event.player.getCurrentEquippedItem().getItem().setDamage(event.player.getCurrentEquippedItem(), event.player.getCurrentEquippedItem().getItemDamage() + RustMod.decayrate);
					}
				}
				if (RustMod.fun == true){
				if (event.player.getCurrentEquippedItem().getItemDamage() == 100){
				
						event.player.worldObj.spawnEntityInWorld(new EntityPrankTNT(event.player.worldObj, event.player.posX, event.player.posY, event.player.posZ, event.player));
				}
				}
				}
				
				
				//Catch block to stop the game from crashing if the player's hand is empty.
					catch (NullPointerException nullpointer){
						//Debug Code
						//System.out.println("Nice Try!");
					}
				}
			
	}
	  @SubscribeEvent
	  public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent eventArgs) {
	    if(eventArgs.modID.equals("rustmod"))
	     RustMod.syncConfig();
	  }
}
