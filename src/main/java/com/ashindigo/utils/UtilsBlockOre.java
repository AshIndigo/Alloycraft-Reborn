package com.ashindigo.utils;

import java.util.ArrayList;
import java.util.Random;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
/**
 * Sub-Class dedicated to adding ores with automatic smelting recipes added.
 * @author 19jasonides_a
 */
public class UtilsBlockOre extends UtilsBlock{

	public static Item Ingot;
	public static ArrayList orelist = new ArrayList();
	public static ArrayList ingotlist = new ArrayList();
	public static int Dim;
	private static Block Ore;
	private static Block CompressedBlock;
	private static ArrayList compressedlist = new ArrayList();

	/**
	 * 
	 * @param mat The material just use Material.rock
	 * @param ingot The resulting item from the ore (Item)
	 * @param ore The ore block that will be smelted (Block)
	 * @param dim The dimension number 0: Overworld 1: Nether 2: End
	 * @param compressedblock The compressed version of the ingots
	 */
	public UtilsBlockOre(Material mat, Item ingot, Block ore, int dim, Block compressedblock) {
		super(mat);
		ingotlist.add(ingot);
		orelist.add(ore);
		Dim = dim;
		CompressedBlock = compressedblock;
		Ore = ore;
		compressedlist .add(compressedblock);
    }
	/**
	 * Default constructor used to declare variables
	 * @param mat Just use Material.rock
	 */
	public UtilsBlockOre(Material mat) {
		super(mat);
	}
	/**
	 * 
	 * @param random ignore
	 * @param chunkX ignore
	 * @param chunkZ ignore
	 * @param world ignore
	 * @param chunkGenerator ignore
	 * @param chunkProvider ignore
	 * Used for the ore generation
	 */
	public static void generate() {
		UtilsWorldgen worldgen = new UtilsWorldgen();
		switch (Dim) {
            case 0: UtilsWorldgen.OverworldList.add(Ore); break;
            case 1: UtilsWorldgen.NetherList.add(Ore); break;
            case 2: UtilsWorldgen.EndList.add(Ore); break;
		}
        }
	/**
	 * Method to add smelting recipes to ores and compression reipes
	 */
	public static void registerRecipes(){
		int oreruntime = 0;
		while(oreruntime < orelist.size()){
		GameRegistry.addSmelting((Block) orelist.get(oreruntime), new ItemStack ((Item) ingotlist.get(oreruntime), 1), 5);
		GameRegistry.addRecipe(new ItemStack((Block) compressedlist.get(oreruntime), 1), new Object[]{
	        	"AAA",
	        	"AAA",
	        	"AAA",
	        	'A', ingotlist.get(oreruntime)
	    	});
		GameRegistry.addShapelessRecipe(new ItemStack((Item) ingotlist.get(oreruntime), 9), new Object[]{
	    		new ItemStack((Block) compressedlist.get(oreruntime), 1)
		});
		oreruntime++;
	}
		}
	}