package com.gravirift.riftes.magica;

import java.util.ArrayList;

import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import staffs.fire.ItemFireStaff;
import staffs.fire.ItemFireStaff_2;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = MagicaMain.MODID, version = MagicaMain.VERSION)
public class MagicaMain
{
    public static final String MODID = "magica";
    public static final String VERSION = "1.0";
    
    public static String overlayText1, overlayText2, overlayText3;
    
    public static Item fireStaff, fireStaff_2;
    
    public static CreativeTabs magicaTab = new CreativeTabs("magica"){
		@Override
		public Item getTabIconItem() {
			return Items.nether_star;
		}
    };
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
    	fireStaff = new ItemFireStaff().setUnlocalizedName("fire_staff").setMaxStackSize(1).setCreativeTab(magicaTab);
    	GameRegistry.registerItem(fireStaff, "fire_staff");
    	
    	fireStaff_2 = new ItemFireStaff_2().setUnlocalizedName("fire_staff_2").setMaxStackSize(1).setCreativeTab(magicaTab);
    	GameRegistry.registerItem(fireStaff_2, "fire_staff_2");
    	
    }

    public static String[] TextOverlay(String s, int death){
    	String[] temp = new String[2];
    	temp[0] = s;
    	temp[1] = Integer.toString(death);
		return temp;
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
    	MinecraftForge.EVENT_BUS.register(new Overlay(Minecraft.getMinecraft()));
    	FMLCommonHandler.instance().bus().register(new OverlayHandle());
    }
    
    @EventHandler
    public void playerInteract(PlayerInteractEvent event){
    	event.entityPlayer.setFire(50);
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
	
    }
}
