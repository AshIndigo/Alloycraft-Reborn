/*
package com.ashindigo.alloycraft.lib;

import java.util.ArrayList;

import com.ashindigo.alloycraft.AlloycraftItems;

import net.minecraft.init.Items;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemDye;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.world.World;

public class Spare implements IRecipe {
	
	
	private ItemStack field_92102_a;
	int iron = 0;
    int gold = 0;
	private ItemStack itemStack2;
	private int K1;

	@Override
	public boolean matches(InventoryCrafting p_77569_1_, World p_77569_2_) {
		 {
		        this.field_92102_a = null;
		        int k = 0;
		        int l = 0;
		        int i1 = 0;
		        int j1 = 0;

		        for (int k1 = 0; k1 < p_77569_1_.getSizeInventory(); ++k1)
		        {
		            ItemStack itemstack = p_77569_1_.getStackInSlot(k1);
		            ItemStack itemstack2 = p_77569_1_.getStackInSlot(k1);
		            K1 = k1;

		            if (itemstack != null)
		            {
		                if (itemstack.getItem() == Items.iron_ingot && itemstack2.getItem() == AlloycraftItems.alloy)
		                {
		                    ++iron;
		                }
		                else if (itemstack.getItem() == Items.gold_ingot && itemstack2.getItem() == AlloycraftItems.alloy)
		                {
		                    ++gold;
		                }
		                
		              
		            }
		                }
		            }


		        if (gold <= 1 && iron <= 1)
		        {
		        	
		        }
		        else
		        {
		            return false;
		        }
				return false;
		 }

	@Override
	public ItemStack getCraftingResult(InventoryCrafting p_77572_1_) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getRecipeSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ItemStack getRecipeOutput() {
		// TODO Auto-generated method stub
		return null;
	}

}
*/	