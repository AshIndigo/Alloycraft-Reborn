package com.ashindigo.alloycraft.lib;

import com.ashindigo.alloycraft.AlloycraftItems;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ForgeRecipes {
	
	public ForgeRecipes() {
		
	}
	
	public static ItemStack getSmeltingResult(Item item, Item item2) {
		return getOutput(item, item2);
	}
	
	public static ItemStack getOutput(Item item, Item item2) {
		// TODO get nbt setup
		if (item == AlloycraftItems.alloy && item2 == Items.iron_ingot || item == Items.iron_ingot && item2 == Items.iron_ingot) {
			return new ItemStack(AlloycraftItems.alloy, 2);
		}
		return null;

}
}
