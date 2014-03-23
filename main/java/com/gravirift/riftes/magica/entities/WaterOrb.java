package com.gravirift.riftes.magica.entities;

import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.init.Blocks;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class WaterOrb extends EntitySnowball{
	
	public WaterOrb(World par1World, EntityLivingBase par2EntityLivingBase) {
		super(par1World, par2EntityLivingBase);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void onImpact(MovingObjectPosition pos) {
		boolean changed = false;
		if(this.worldObj.getBlock(pos.blockX, pos.blockY, pos.blockZ).getMaterial() == Material.air){
			this.worldObj.setBlock(pos.blockX, pos.blockY, pos.blockZ, Blocks.water);
			changed = true;
		}else if(this.worldObj.getBlock(pos.blockX, pos.blockY+1, pos.blockZ).getMaterial() == Material.air){
			this.worldObj.setBlock(pos.blockX, pos.blockY+1, pos.blockZ, Blocks.water);
			changed = true;
		}
		
		if(changed){
			this.kill();
		}
	}

}
