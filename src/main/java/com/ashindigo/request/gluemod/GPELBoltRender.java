package com.ashindigo.request.gluemod;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderEntity;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.boss.BossStatus;
import net.minecraft.util.ResourceLocation;

public class GPELBoltRender extends RenderEntity{

	private static final ResourceLocation mobTextures = new ResourceLocation(GlueMod.MODID + ":textures/entity/gpelbolt.png");
	private static final String __OBFID = "CL_00000984";
	public static EntityGPELBolt PureBoss;
	
	public GPELBoltRender(ModelBase par1ModelBase, float par2) {
		super();
		
	}
	
	protected ResourceLocation getEntityTexture(EntityGPELBolt entity){
		return mobTextures;
	}
	
	protected ResourceLocation getEntityTexture(Entity entity){
		return this.getEntityTexture((EntityGPELBolt)entity);
	}
	

	//private void preRenderCallbackPureBoss(EntityGPELBolt entity, float f) {
	 
	 
		
	}

//}