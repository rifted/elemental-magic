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

}
