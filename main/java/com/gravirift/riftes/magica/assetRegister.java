package com.gravirift.riftes.magica;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.gravirift.riftes.magica.blocks.ores.BlockFireEssenceOre;
import com.gravirift.riftes.magica.blocks.ores.BlockRuneOre;
import com.gravirift.riftes.magica.items.FireEssence;
import com.gravirift.riftes.magica.items.FireRune;
import com.gravirift.riftes.magica.items.Rune;
import com.gravirift.riftes.magica.items.staves.fire.ItemFireStaff;
import com.gravirift.riftes.magica.items.staves.fire.ItemFireStaff_2;
import com.gravirift.riftes.magica.items.staves.fire.ItemFireStaff_3;

import cpw.mods.fml.common.registry.GameRegistry;

public class assetRegister {
	public static Item fireStaff, fireStaff_2, fireStaff_3;
	public static Item rune, fireEssence, fireRune;
	public static Block runeOre, fireEssenceOre;
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
    	GameRegistry.registerBlock(runeOre, "rune_ore");
    	
    	fireEssenceOre = new BlockFireEssenceOre().setBlockName("fire_essence_ore").setCreativeTab(MagicaMain.magicaTab);
    	fireEssenceOre.setHarvestLevel("pickaxe", 2);
    	GameRegistry.registerBlock(fireEssenceOre, "fire_essence_ore");
    	
    	GameRegistry.registerWorldGenerator(eventmanager, 0);
	}
	
	public static void registerOtherItems(){
		rune = new Rune().setUnlocalizedName("rune").setMaxStackSize(64).setCreativeTab(MagicaMain.magicaTab);
    	GameRegistry.registerItem(rune, "rune");
    	
    	fireEssence = new FireEssence().setUnlocalizedName("fire_essence").setMaxStackSize(64).setCreativeTab(MagicaMain.magicaTab);
    	GameRegistry.registerItem(fireEssence, "fire_essence");
    	
    	fireRune = new FireRune().setUnlocalizedName("fire_rune").setMaxStackSize(64).setCreativeTab(MagicaMain.magicaTab);
    	GameRegistry.registerItem(fireRune, "fire_rune");
	}
	
	public static void registerRecipes(){
		GameRegistry.addShapelessRecipe(new ItemStack(fireRune, 2), new ItemStack(fireEssence, 1), new ItemStack(rune, 1));
	}
}
