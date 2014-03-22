package com.gravirift.riftes.magica;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = MagicaMain.MODID, version = MagicaMain.VERSION)
public class MagicaMain
{
    public static final String MODID = "magica";
    public static final String VERSION = "1.0";
    
    //May be removed in future.
    public static String overlayText1, overlayText2, overlayText3;
    //May be removed in future.
    
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
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
    	/*MinecraftForge.EVENT_BUS.register(new Overlay(Minecraft.getMinecraft()));
    	FMLCommonHandler.instance().bus().register(new OverlayHandle());*/
    	//when ran provides text overlay, causes some craaazy bugs in survival.
    }
}
