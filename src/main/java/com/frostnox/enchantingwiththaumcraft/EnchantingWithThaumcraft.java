package com.frostnox.enchantingwiththaumcraft;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

import com.frostnox.enchantingwiththaumcraft.recipes.Recipes;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.research.ResearchCategories;

@Mod(modid = EnchantingWithThaumcraft.MODID, name = EnchantingWithThaumcraft.NAME, version = EnchantingWithThaumcraft.VERSION, dependencies = EnchantingWithThaumcraft.DEPENDENCIES)
public class EnchantingWithThaumcraft {
	public static final String MODID = "enchantingwiththaumcraft";
	public static final String NAME = "Enchanting With Thaumcraft";
	public static final String VERSION = "1.1";
	public static final String DEPENDENCIES = "required-after:thaumcraft";
	
	public static Logger LOGGER;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		LOGGER = event.getModLog();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		Recipes.initRecipes();
		ResearchCategories.registerCategory("EWT", "INFUSION", new AspectList(), new ResourceLocation("enchantingwiththaumcraft", "textures/icons/enchant_book.png"), new ResourceLocation("thaumcraft", "textures/gui/gui_research_back_1.jpg"), new ResourceLocation("thaumcraft", "textures/gui/gui_research_back_over.png"));
		ThaumcraftApi.registerResearchLocation(new ResourceLocation("enchantingwiththaumcraft", "research/entries"));
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
}
