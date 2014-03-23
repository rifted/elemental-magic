package com.gravirift.riftes.magica.entities;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class WaterOrbItem extends Item{
	@Override
	public void registerIcons(IIconRegister par1IconRegister) {
		this.itemIcon = par1IconRegister.registerIcon("magica:fire_wand");
	}
}
