package com.ashindigo.request.gluemod;

import com.ashindigo.request.gluemod.items.CorrosiveFluid;
import com.ashindigo.request.gluemod.items.DirtRing;
import com.ashindigo.request.gluemod.items.ExplosiveGlue;
import com.ashindigo.request.gluemod.items.GlueAmmo;
import com.ashindigo.request.gluemod.items.ItemGPEL;
import com.ashindigo.request.gluemod.items.RapidBow;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidRegistry;

@Mod(name = "GlueMod", modid = "gluemod", version = "1.0")
public class GlueMod {
	
	public static Item dirtring;
	public static Item corrosivefluid;
	public static Item explosiveglue;
	public static Item gpel;
	public static Item glueammo;
	public static Item rapidbow;
	public static Fluid corrosivefluidfluid;
	public static Block corrosivefluidblock;
	public static ModelGPELBolt modelgpelbolt;
	public static String MODID = "GlueMod";
	
	@EventHandler
	public void preinit(FMLPreInitializationEvent event){
		
		dirtring = new DirtRing(2 , true);
		GameRegistry.registerItem(dirtring, "DirtRing");
		explosiveglue = new ExplosiveGlue();
		GameRegistry.registerItem(explosiveglue, "ExplosiveGlue");
		gpel = new ItemGPEL();
		GameRegistry.registerItem(gpel, "GPEL");
		glueammo = new GlueAmmo();
		GameRegistry.registerItem(glueammo, "GlueAmmo");
		rapidbow = new RapidBow();
		GameRegistry.registerItem(rapidbow, "RapidBow");
		corrosivefluidfluid = new Fluid("corrosivefluidfluid");
		FluidRegistry.registerFluid(corrosivefluidfluid);
		corrosivefluidblock = new CorrosiveFluidBlock(GlueMod.corrosivefluidfluid, CorrosiveFluidBlock.materialFluidCorrosive);
		GameRegistry.registerBlock(corrosivefluidblock, "CorrosiveFluidBlock");
		corrosivefluid = new CorrosiveFluid(corrosivefluidblock);
		GameRegistry.registerItem(corrosivefluid, "CorrosiveFluid");
		corrosivefluid.setUnlocalizedName("corrosivefluid").setContainerItem(Items.bucket);
		FluidContainerRegistry.registerFluidContainer(corrosivefluidfluid, new ItemStack(corrosivefluid), new ItemStack(Items.bucket));
		BucketHandler.INSTANCE.buckets.put(corrosivefluidblock, corrosivefluid);
		MinecraftForge.EVENT_BUS.register(BucketHandler.INSTANCE);
		GameRegistry.addShapedRecipe(new ItemStack(dirtring, 1), new Object[]{
	        	"AAA",
	        	"A A",
	        	"AAA",
	        	'A', Blocks.dirt
	    });
		GameRegistry.addShapedRecipe(new ItemStack(Items.iron_ingot, 3), new Object[]{
	        	" A ",
	        	"ABA",
	        	" A ",
	        	'A', GlueMod.dirtring, 'B', Items.iron_ingot
	    });
		GameRegistry.addShapelessRecipe(new ItemStack(corrosivefluid, 1), new Object[]
		{
		    	Items.bucket, dirtring, Items.slime_ball, Items.fermented_spider_eye
		});
		GameRegistry.addShapedRecipe(new ItemStack(explosiveglue, 1), new Object[]{
	        	"AAA",
	        	"CBC",
	        	"AAA",
	        	'A', Items.gunpowder, 'B', corrosivefluid, 'C', Items.iron_ingot
	    });
		GameRegistry.addShapedRecipe(new ItemStack(gpel, 1), new Object[]{
	        	" AA",
	        	"AB ",
	        	"AA ",
	        	'A', Items.iron_ingot, 'B', explosiveglue
	    });
		GameRegistry.addShapedRecipe(new ItemStack(glueammo, 32), new Object[]{
	        	"AA ",
	        	"BCD",
	        	"AA ",
	        	'A', Items.iron_ingot, 'B', Items.gunpowder, 'C', explosiveglue, 'D', Blocks.stone
	    });
		GameRegistry.addShapedRecipe(new ItemStack(rapidbow, 1), new Object[]{
	        	"AB ",
	        	"ACD",
	        	"AB ",
	        	'A', Items.string, 'B', Items.stick, 'C', Items.repeater, 'D', Items.diamond
	    });
		RenderingRegistry.registerEntityRenderingHandler(EntityGPELBolt.class, new GPELBoltRender(modelgpelbolt, 0));

	}
	
	public void init(FMLInitializationEvent event){
		
		
	}
	

}
