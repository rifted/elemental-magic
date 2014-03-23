package com.gravirift.riftes.magica.entities;

import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class RenderWaterOrb extends RenderSnowball{

	ResourceLocation loc = new ResourceLocation("magica:fire_wand");
	
	public RenderWaterOrb(Item par1Item) {
		super(par1Item);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected ResourceLocation getEntityTexture(Entity par1Entity) {
		return loc;
	}
	
	@Override
	protected void bindEntityTexture(Entity par1Entity) {
		// TODO Auto-generated method stub
		super.bindEntityTexture(par1Entity);
	}
	
	@Override
	public void doRender(Entity par1Entity, double par2, double par4,
			double par6, float par8, float par9) {
		// TODO Auto-generated method stub
		super.doRender(par1Entity, par2, par4, par6, par8, par9);
	}

}
