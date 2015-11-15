package com.ashindigo.request.gluemod;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.ReportedException;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntityGPELBolt extends EntityThrowable {
	private double explosionRadius = 1F;
	
	public EntityGPELBolt(World par1World) {
		super(par1World);
	}
	
	public EntityGPELBolt(World par1World, double arg1Double, double arg2Double, double arg3Double) {
		super(par1World, arg1Double, arg2Double, arg3Double);
	}
	
	public EntityGPELBolt(World par1World, EntityLivingBase arg1EntityLivingBase) {
		super(par1World, arg1EntityLivingBase);
	}
	
	protected void setEntityTexture()
    {
        ResourceLocation gpeltexture = new ResourceLocation(GlueMod.MODID+":textures/entity/gpel.png");
    }
	@Override
	protected void onImpact(MovingObjectPosition par1MovingObjectPosition) {
	try{
		this.worldObj.createExplosion(this, this.posX, this.posY, this.posZ, (float)this.explosionRadius, true);
		this.worldObj.spawnParticle("crit", this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
		par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(EntityGPELBolt.this, this), 10000F);
		try{
			
		}
		catch(NullPointerException npe){
			System.out.println("What?");
			
		}
		catch(ReportedException re){
			System.out.println("What?");
		}
		this.setDead();
	}
	catch(NullPointerException npe){
		System.out.println("What?");
		
	}
	catch(ReportedException re){
		System.out.println("What?");
	}
	}
	}