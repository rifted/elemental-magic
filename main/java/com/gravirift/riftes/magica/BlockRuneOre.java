package com.gravirift.riftes.magica;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemBlock;

public class BlockRuneOre extends ItemBlock{

	protected BlockRuneOre() {
		super(Material.rock);
	}
	
	@Override
	public void registerBlockIcons(IIconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon("magica:rune_ore");
	}

}
