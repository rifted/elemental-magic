package com.gravirift.riftes.magica;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

import com.gravirift.riftes.magica.blocks.ores.BlockRuneOre;
import com.gravirift.riftes.magica.items.*;
import com.gravirift.riftes.magica.items.staves.fire.ItemFireStaff;
import com.gravirift.riftes.magica.items.staves.fire.ItemFireStaff_2;
import com.gravirift.riftes.magica.items.staves.fire.ItemFireStaff_3;

import cpw.mods.fml.common.registry.GameRegistry;

public class assetRegister {
	public static Item fireStaff, fireStaff_2, fireStaff_3;
	public static Item rune;
	public static Block runeOre;
	public static EventManager eventmanager = new EventManager();
	
	public static void registerStaffs(){
		fireStaff = new ItemFireStaff().setUnlocalizedName("fire_staff").setMaxStackSize(1).setCreativeTab(MagicaMain.magicaTab);
    	GameRegistry.registerItem(fireStaff, "fire_staff");
    	
    	fireStaff_2 = new ItemFireStaff_2().setUnlocalizedName("fire_staff_2").setMaxStackSize(1).setCreativeTab(MagicaMain.magicaTab);
    	GameRegistry.registerItem(fireStaff_2, "fire_staff_2");
    	
    	fireStaff_3 = new ItemFireStaff_3().setUnlocalizedName("fire_staff_3").setMaxStackSize(1).setCreativeTab(MagicaMain.magicaTab);
    	GameRegistry.registerItem(fireStaff_3, "fire_staff_3");
	}
	
	public static void registerBlocksTerrain(){
		runeOre = new BlockRuneOre().setBlockName("rune_ore").setCreativeTab(MagicaMain.magicaTab);
		runeOre.setHarvestLevel("pickaxe", 2);
    	GameRegistry.registerBlock(runeOre, runeOre.getUnlocalizedName());
    	
    	GameRegistry.registerWorldGenerator(eventmanager, 0);
	}
	
	public static void registerOtherItems(){
		rune = new Rune().setUnlocalizedName("rune").setMaxStackSize(64).setCreativeTab(MagicaMain.magicaTab);
    	GameRegistry.registerItem(rune, "rune");
	}
}
