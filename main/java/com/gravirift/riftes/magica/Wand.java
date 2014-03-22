package com.gravirift.riftes.magica;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class Wand extends Item{
	public static int cooldown = 0;
	public static int cooldownPeriod;
	
	public ItemStack getConsumptionCost(){
		return null;	
	}
	
	@Override
	public void onUpdate(ItemStack stack, World world, Entity entity, int par4, boolean par5) {
		if(stack.stackTagCompound == null){
			stack.stackTagCompound = new NBTTagCompound();
			stack.stackTagCompound.setInteger("cooldown", 0);
		}
		if(stack.stackTagCompound.getInteger("cooldown") != 0){
			stack.stackTagCompound.setInteger("cooldown",stack.stackTagCompound.getInteger("cooldown")-1);
			if(stack.stackTagCompound.getInteger("cooldown") == 0){
				world.playSoundAtEntity(entity, "random.orb", 1, 1);
			}
		}
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
		if(stack.stackTagCompound == null){
			stack.stackTagCompound = new NBTTagCompound();
			stack.stackTagCompound.setInteger("cooldown", 0);
		}
		if(stack.stackTagCompound.getInteger("cooldown") == 0){
			Wand wand = (Wand) stack.getItem();
			ItemStack requirements = wand.getConsumptionCost();
			if(tryRemove(player, requirements)){
				stack.setItemDamage(stack.getItemDamage()-1);
				wand.castSpell(player);
				stack.stackTagCompound.setInteger("cooldown", wand.getCooldown());
			}
		}
		
		return stack;
	}
	
	public boolean tryRemove(EntityPlayer p, ItemStack testStack){
		int slot = 0;
		for(ItemStack i : p.inventory.mainInventory){
			if(i != null){
				if(i.getItem() == testStack.getItem()){
					if(i.stackSize >= testStack.stackSize){
						if(i.stackSize == 1){
							p.inventory.setInventorySlotContents(slot, null);
						}else{
							i.stackSize -= testStack.stackSize;
						}
						return true;
					}
				}
			}
			slot++;
		}
		return false;
	}
	
	public int getCooldown(){
		return 60;
	}
	
	public int getTier(){
		return 1;
	}

	public void castSpell(EntityPlayer player) {
		// TODO Auto-generated method stub
	}
}
