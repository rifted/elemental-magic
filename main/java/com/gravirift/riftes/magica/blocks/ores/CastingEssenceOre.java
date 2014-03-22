package com.gravirift.riftes.magica.blocks.ores;

import java.util.ArrayList;

import com.gravirift.riftes.magica.assetRegister;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class CastingEssenceOre extends Block{

	public CastingEssenceOre() {
		super(Material.rock);
	}
	
	@Override
	public void registerBlockIcons(IIconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon("magica:casting_essence_ore");
	}
	
	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
		ArrayList<ItemStack> drops = new ArrayList<ItemStack>(1);
		drops.add(new ItemStack(assetRegister.castingEssence, 1+fortune));
		return drops;
	}
	
	@Override
	public float getBlockHardness(World p_149712_1_, int p_149712_2_, int p_149712_3_, int p_149712_4_) {
		return 3.0F;
	}

}
