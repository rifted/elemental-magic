package com.gravirift.riftes.magica;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import com.gravirift.riftes.magica.blocks.ores.BlockRuneOre;
import com.gravirift.riftes.magica.items.staves.fire.ItemFireStaff;
import com.gravirift.riftes.magica.items.staves.fire.ItemFireStaff_2;
import com.gravirift.riftes.magica.items.staves.fire.ItemFireStaff_3;

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
    
    public static CreativeTabs magicaTab = new CreativeTabs("magica"){
		@Override
		public Item getTabIconItem() {
			return Items.nether_star;
		}
    };
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
    	assetRegister.registerStaffs();
    	assetRegister.registerBlocksTerrain();
    	assetRegister.registerOtherItems();
    }

    public static String[] TextOverlay(String s, int death){
    	String[] temp = new String[2];
    	temp[0] = s;
    	temp[1] = Integer.toString(death);
		return temp;
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
    	/*MinecraftForge.EVENT_BUS.register(new Overlay(Minecraft.getMinecraft()));
    	FMLCommonHandler.instance().bus().register(new OverlayHandle());*/
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
	
    }
}
