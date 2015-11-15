package com.ashindigo.alloycraft;

import java.lang.reflect.Array;
import java.util.ArrayList;

import com.ashindigo.alloycraft.items.AlloyItem;
import com.ashindigo.utils.UtilsArmor;
import com.ashindigo.utils.UtilsItem;
import com.ashindigo.utils.UtilsItemBlockLoader;
import com.ashindigo.utils.UtilsToolset;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

public class AlloycraftItems extends UtilsItemBlockLoader {
	
	public static UtilsItem alloy;
	
	public static void preInitItems() {
		alloy = new AlloyItem(AlloycraftMain.modid, "Alloy");
	}

	public static void initItems() {
		GameRegistry.addShapelessRecipe(new ItemStack(alloy, 1), new Object[]{
	    		new ItemStack(Blocks.dirt, 1)
		});
		
	}
	
	public static void postInitItems() {
		// TODO Auto-generated method stub
		
	}

}