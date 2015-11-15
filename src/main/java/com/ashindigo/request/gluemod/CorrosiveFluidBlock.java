package com.ashindigo.request.gluemod;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialLiquid;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

public class CorrosiveFluidBlock  extends BlockFluidClassic {
	
	public static final Material materialFluidCorrosive = new MaterialLiquid(MapColor.greenColor);

	public CorrosiveFluidBlock(Fluid fluid, Material material) {
		super(GlueMod.corrosivefluidfluid, materialFluidCorrosive);
		
		// TODO Auto-generated constructor stub
	}

}
