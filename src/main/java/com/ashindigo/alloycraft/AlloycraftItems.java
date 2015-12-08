package com.ashindigo.alloycraft;

import com.ashindigo.alloycraft.items.AlloyAxe;
import com.ashindigo.alloycraft.items.AlloyHoe;
import com.ashindigo.alloycraft.items.AlloyItem;
import com.ashindigo.alloycraft.items.AlloyPickaxe;
import com.ashindigo.alloycraft.items.AlloyShovel;
import com.ashindigo.alloycraft.items.AlloySword;
import com.ashindigo.utils.UtilsItem;
import com.ashindigo.utils.UtilsItemBlockLoader;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

public class AlloycraftItems extends UtilsItemBlockLoader {
	
	public static UtilsItem alloy;
	public static AlloySword alloysword;
	public static AlloyShovel alloyshovel;
	public static AlloyPickaxe alloypickaxe;
	public static AlloyHoe alloyhoe;
	public static AlloyAxe alloyaxe;
	public static ToolMaterial AlloyMat = EnumHelper.addToolMaterial("AlloyMat", 2, 400, 5.5F, 2.5F, 30);
	
	public static void preInitItems() {
		alloy = new AlloyItem(AlloycraftMain.modid, "Alloy");
		alloysword = new AlloySword(AlloyMat, "AlloySword", AlloycraftMain.modid, alloy);
		alloyshovel = new AlloyShovel(AlloyMat, "AlloyShovel", AlloycraftMain.modid, alloy);
		alloypickaxe = new AlloyPickaxe(AlloyMat, "AlloyPickaxe", AlloycraftMain.modid, alloy);
		alloyhoe = new AlloyHoe(AlloyMat, "AlloyHoe", AlloycraftMain.modid, alloy);
		alloyaxe = new AlloyAxe(AlloyMat, "AlloyAxe", AlloycraftMain.modid, alloy);
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
