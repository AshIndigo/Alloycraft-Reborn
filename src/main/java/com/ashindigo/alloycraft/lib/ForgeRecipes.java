package com.ashindigo.alloycraft.lib;

import com.ashindigo.alloycraft.AlloycraftItems;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class ForgeRecipes {
	
		static ItemStack itemstack = new ItemStack(AlloycraftItems.alloy, 1);
	
	public ForgeRecipes() {
		
	}
	
	public static ItemStack getSmeltingResult(Item item, Item item2) {
		return getOutput(item, item2);
	}
	
	public static ItemStack getOutput(Item item, Item item2) {
		// TODO get nbt setup
		if (item == Items.iron_ingot && item2 == AlloycraftItems.alloy || item == AlloycraftItems.alloy && item2 == Items.iron_ingot) {
			if (!itemstack.hasTagCompound())
				   itemstack.setTagCompound(new NBTTagCompound());
				itemstack.getTagCompound().setInteger("???", 5);
			return itemstack;
		}
		return null;

}
}
