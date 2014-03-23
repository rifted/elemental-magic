package com.gravirift.riftes.magica.items.staves.water;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

import com.gravirift.riftes.magica.Wand;
import com.gravirift.riftes.magica.assetRegister;
import com.gravirift.riftes.magica.entities.WaterOrb;

public class ItemWaterStaff extends Wand{
	
	@Override
	public int getCooldown() {
		return 45;
	}
	
	@Override
	public int getTier(){
		return 1;
	}
	
	@Override
	public ItemStack getConsumptionCost() {
		return new ItemStack(assetRegister.waterRune, 1);
	}
	
	@Override
	public void registerIcons(IIconRegister iconRegister){
		this.itemIcon = iconRegister.registerIcon("magica:water_staff");
	}
	@Override
	public void castSpell(EntityPlayer player) {
		World world = player.worldObj;
		Vec3 look = player.getLookVec();
		if(!world.isRemote){
			WaterOrb orb = new WaterOrb(world,player);
			world.spawnEntityInWorld(orb);
		}
	}
	
	@Override
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
		par3List.add("Tier 1");
		par3List.add("2.5 second cooldown");
	}
}
