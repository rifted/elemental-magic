package com.gravirift.riftes.magica;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class OverlayHandle {
	 @SubscribeEvent
	  public void onTick(PlayerTickEvent event){
		 MagicaMain.overlayText1 = "";
		 MagicaMain.overlayText2 = "";
		 MagicaMain.overlayText3 = "";
		 if(event.player.inventory.getCurrentItem() != null){
			 if(event.player.inventory.getCurrentItem().getItem() instanceof Wand){
				 String suffix = "";
				 Wand wand = (Wand) event.player.inventory.getCurrentItem().getItem();
				 ItemStack wandStack = event.player.inventory.getCurrentItem();
				 if(wandStack.stackTagCompound == null){
					 wandStack.stackTagCompound = new NBTTagCompound();
					 wandStack.stackTagCompound.setInteger("cooldown", 0);
				}
				 if(wandStack.stackTagCompound.getInteger("cooldown") <= 0){
					 suffix = "Ready";
				 }else{
					 suffix = "Cooling Down...";
				 }
				 MagicaMain.overlayText1=event.player.inventory.getCurrentItem().getDisplayName()+" - "+suffix;
				 MagicaMain.overlayText2="Tier "+wand.getTier();
				 
				 int amount = 0;
				 for(ItemStack i : event.player.inventory.mainInventory){
					if(i != null){
						if(i.getItem() == wand.getConsumptionCost().getItem()){
							amount += i.stackSize;
						}
					}
				 }
				 MagicaMain.overlayText3=Integer.toString(amount)+" "+wand.getConsumptionCost().getDisplayName()+"(s) remaining.";
				 
			 }
		 }
	  }
}
