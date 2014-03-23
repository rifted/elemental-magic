package com.gravirift.riftes.magica;

import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.gravirift.riftes.magica.blocks.ores.BlockFireEssenceOre;
import com.gravirift.riftes.magica.blocks.ores.BlockRuneOre;
import com.gravirift.riftes.magica.blocks.ores.BlockWaterEssenceOre;
import com.gravirift.riftes.magica.blocks.ores.CastingEssenceOre;
import com.gravirift.riftes.magica.entities.RenderWaterOrb;
import com.gravirift.riftes.magica.entities.WaterOrb;
import com.gravirift.riftes.magica.entities.WaterOrbItem;
import com.gravirift.riftes.magica.items.CastingEssence;
import com.gravirift.riftes.magica.items.FireEssence;
import com.gravirift.riftes.magica.items.FireRune;
import com.gravirift.riftes.magica.items.Rune;
import com.gravirift.riftes.magica.items.WaterEssence;
import com.gravirift.riftes.magica.items.WaterRune;
import com.gravirift.riftes.magica.items.staves.PlainStaff;
import com.gravirift.riftes.magica.items.staves.fire.ItemFireStaff;
import com.gravirift.riftes.magica.items.staves.fire.ItemFireStaff_2;
import com.gravirift.riftes.magica.items.staves.fire.ItemFireStaff_3;
import com.gravirift.riftes.magica.items.staves.water.ItemWaterStaff;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class assetRegister {
	public static Item staff, fireStaff, fireStaff_2, fireStaff_3;
	public static Item waterStaff;
	public static Item rune, fireEssence, fireRune, castingEssence, castingRune, waterEssence, waterRune;
	public static Item waterOrb;
	public static Block runeOre, fireEssenceOre, castingEssenceOre, waterEssenceOre;
	public static EventManager eventmanager = new EventManager();
	
	public static void registerStaffs(){
		
		staff = new PlainStaff().setUnlocalizedName("staff").setMaxStackSize(1).setCreativeTab(MagicaMain.magicaTab);
		GameRegistry.registerItem(staff, "staff");
		
		fireStaff = new ItemFireStaff().setUnlocalizedName("fire_staff").setMaxStackSize(1).setCreativeTab(MagicaMain.magicaTab);
    	GameRegistry.registerItem(fireStaff, "fire_staff");
    	
    	fireStaff_2 = new ItemFireStaff_2().setUnlocalizedName("fire_staff_2").setMaxStackSize(1).setCreativeTab(MagicaMain.magicaTab);
    	GameRegistry.registerItem(fireStaff_2, "fire_staff_2");
    	
    	fireStaff_3 = new ItemFireStaff_3().setUnlocalizedName("fire_staff_3").setMaxStackSize(1).setCreativeTab(MagicaMain.magicaTab);
    	GameRegistry.registerItem(fireStaff_3, "fire_staff_3");
    	
    	waterStaff = new ItemWaterStaff().setUnlocalizedName("water_staff").setMaxStackSize(1).setCreativeTab(MagicaMain.magicaTab);
    	GameRegistry.registerItem(waterStaff, "water_staff");
	}
	
	public static void registerBlocksTerrain(){
		runeOre = new BlockRuneOre().setBlockName("rune_ore").setCreativeTab(MagicaMain.magicaTab);
		runeOre.setHarvestLevel("pickaxe", 2);
    	GameRegistry.registerBlock(runeOre, "rune_ore");
    	
    	fireEssenceOre = new BlockFireEssenceOre().setBlockName("fire_essence_ore").setCreativeTab(MagicaMain.magicaTab);
    	fireEssenceOre.setHarvestLevel("pickaxe", 2);
    	GameRegistry.registerBlock(fireEssenceOre, "fire_essence_ore");
    	
    	waterEssenceOre = new BlockWaterEssenceOre().setBlockName("water_essence_ore").setCreativeTab(MagicaMain.magicaTab);
    	waterEssenceOre.setHarvestLevel("pickaxe", 2);
    	GameRegistry.registerBlock(waterEssenceOre, "water_essence_ore");
    	
    	castingEssenceOre = new CastingEssenceOre().setBlockName("casting_essence_ore").setCreativeTab(MagicaMain.magicaTab);
    	castingEssenceOre.setHarvestLevel("pickaxe", 2);
    	GameRegistry.registerBlock(castingEssenceOre, "casting_essence_ore");
    	
    	GameRegistry.registerWorldGenerator(eventmanager, 0);
	}
	
	public static void registerOtherItems(){
		rune = new Rune().setUnlocalizedName("rune").setMaxStackSize(64).setCreativeTab(MagicaMain.magicaTab);
    	GameRegistry.registerItem(rune, "rune");
    	
    	fireEssence = new FireEssence().setUnlocalizedName("fire_essence").setMaxStackSize(64).setCreativeTab(MagicaMain.magicaTab);
    	GameRegistry.registerItem(fireEssence, "fire_essence");
    	
    	fireRune = new FireRune().setUnlocalizedName("fire_rune").setMaxStackSize(64).setCreativeTab(MagicaMain.magicaTab);
    	GameRegistry.registerItem(fireRune, "fire_rune");
    	
    	castingEssence = new CastingEssence().setUnlocalizedName("casting_essence").setMaxStackSize(64).setCreativeTab(MagicaMain.magicaTab);
    	GameRegistry.registerItem(castingEssence, "casting_essence");
    	
    	waterEssence = new WaterEssence().setUnlocalizedName("water_essence").setMaxStackSize(64).setCreativeTab(MagicaMain.magicaTab);
    	GameRegistry.registerItem(waterEssence, "water_essence");
    	
    	waterRune = new WaterRune().setUnlocalizedName("water_rune").setMaxStackSize(64).setCreativeTab(MagicaMain.magicaTab);
    	GameRegistry.registerItem(waterRune, "water_rune");
    	
    	waterOrb = new WaterOrbItem().setUnlocalizedName("water_orb").setMaxStackSize(1);
    	GameRegistry.registerItem(waterOrb, "water_orb");
	}
	
	public static void registerRecipes(){
		GameRegistry.addShapelessRecipe(new ItemStack(fireRune, 2), new ItemStack(fireEssence, 1), new ItemStack(rune, 1));
		GameRegistry.addRecipe(new ItemStack(staff),
				" a ", " b ", " b ",
		        'a', new ItemStack(castingEssence), 'b', new ItemStack(Items.stick));
		
		GameRegistry.addRecipe(new ItemStack(fireStaff),
				"aaa", "aba", "aaa",
		        'a', new ItemStack(fireEssence), 'b', new ItemStack(staff));
		
		GameRegistry.addRecipe(new ItemStack(fireStaff_2),
				"aaa", "aba", "aaa",
		        'a', new ItemStack(fireEssence), 'b', new ItemStack(fireStaff));
		
		GameRegistry.addRecipe(new ItemStack(fireStaff_3),
				"aaa", "aba", "aaa",
		        'a', new ItemStack(fireEssence), 'b', new ItemStack(fireStaff_2));
	}
	
	public static void registerRenders(){
		RenderingRegistry.registerEntityRenderingHandler(WaterOrb.class, new RenderWaterOrb(waterOrb));
	}
}
