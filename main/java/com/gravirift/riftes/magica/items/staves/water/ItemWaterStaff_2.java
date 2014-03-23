package com.gravirift.riftes.magica.items.staves.water;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityFallingBlock;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

import com.gravirift.riftes.magica.Wand;
import com.gravirift.riftes.magica.assetRegister;
import com.gravirift.riftes.magica.entities.WaterOrb;

public class ItemWaterStaff_2 extends Wand{
	
	@Override
	public int getCooldown() {
		return 150;
	}
	
	@Override
	public int getTier(){
		return 2;
	}
	
	@Override
	public ItemStack getConsumptionCost() {
		return new ItemStack(assetRegister.waterRune, 1);
	}
	
	@Override
	public void registerIcons(IIconRegister iconRegister){
		this.itemIcon = iconRegister.registerIcon("magica:water_staff_2");
	}
	@Override
	public void castSpell(EntityPlayer player) {
		World world = player.worldObj;
		Vec3 look = player.getLookVec();
		if(!world.isRemote){
			WaterOrb orb = new WaterOrb(world,player);
			if(!world.isRemote && player.dimension == 0){
				world.spawnEntityInWorld(orb);
			}
		}
	}
	
	@Override
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
		par3List.add("Tier 2");
		par3List.add("7.5 second cooldown");
	}
}
