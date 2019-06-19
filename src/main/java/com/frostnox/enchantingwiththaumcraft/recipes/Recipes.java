package com.frostnox.enchantingwiththaumcraft.recipes;

import net.minecraft.init.Blocks;
import net.minecraft.init.Enchantments;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.blocks.BlocksTC;
import thaumcraft.api.crafting.InfusionRecipe;
import thaumcraft.api.items.ItemsTC;

public class Recipes {
	public static void initRecipes() {
		initInfusion();
	}
	private static void initInfusion() {
		
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "blast_protection_1"),
				new InfusionRecipe("ARMOR_ENCH",
				Book.EnchantBook(Enchantments.BLAST_PROTECTION, 1),
				1,
				new AspectList().add(Aspect.PROTECT, 10).add(Aspect.ORDER, 10),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(Items.SLIME_BALL)
				}
				));
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "blast_protection_2"),
				new InfusionRecipe("ARMOR_ENCH",
				Book.EnchantBook(Enchantments.BLAST_PROTECTION, 2),
				2,
				new AspectList().add(Aspect.PROTECT, 15).add(Aspect.ORDER, 10).add(Aspect.ALCHEMY, 5),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(Items.SLIME_BALL),
						new ItemStack(Items.SLIME_BALL)
				}
				));
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "blast_protection_3"),
				new InfusionRecipe("ARMOR_ENCH",
				Book.EnchantBook(Enchantments.BLAST_PROTECTION, 3),
				3,
				new AspectList().add(Aspect.PROTECT, 20).add(Aspect.ORDER, 15).add(Aspect.ALCHEMY, 15),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(Items.SLIME_BALL),
						new ItemStack(Blocks.OBSIDIAN),
						new ItemStack(Items.SLIME_BALL)
				}
				));
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "blast_protection_4"),
				new InfusionRecipe("ARMOR_ENCH",
				Book.EnchantBook(Enchantments.BLAST_PROTECTION, 4),
				4,
				new AspectList().add(Aspect.PROTECT, 35).add(Aspect.ORDER, 20).add(Aspect.ALCHEMY, 20),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(Items.SLIME_BALL),
						new ItemStack(Items.SLIME_BALL),
						new ItemStack(Blocks.OBSIDIAN),
						new ItemStack(Blocks.OBSIDIAN)
				}
				));
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "projectile_protection_1"),
				new InfusionRecipe("ARMOR_ENCH",
				Book.EnchantBook(Enchantments.PROJECTILE_PROTECTION, 1),
				1,
				new AspectList().add(Aspect.PROTECT, 15).add(Aspect.TRAP, 5),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(ItemsTC.fabric)
				}
				));
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "projectile_protection_2"),
				new InfusionRecipe("ARMOR_ENCH",
				Book.EnchantBook(Enchantments.PROJECTILE_PROTECTION, 2),
				2,
				new AspectList().add(Aspect.PROTECT, 20).add(Aspect.TRAP, 10),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(ItemsTC.fabric),
						new ItemStack(ItemsTC.fabric)
				}
				));
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "projectile_protection_3"),
				new InfusionRecipe("ARMOR_ENCH",
				Book.EnchantBook(Enchantments.PROJECTILE_PROTECTION, 3),
				3,
				new AspectList().add(Aspect.PROTECT, 30).add(Aspect.TRAP, 20),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(ItemsTC.fabric),
						new ItemStack(Blocks.SLIME_BLOCK),
						new ItemStack(ItemsTC.fabric)
				}
				));
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "projectile_protection_4"),
				new InfusionRecipe("ARMOR_ENCH",
				Book.EnchantBook(Enchantments.PROJECTILE_PROTECTION, 4),
				4,
				new AspectList().add(Aspect.PROTECT, 50).add(Aspect.TRAP, 25),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(ItemsTC.fabric),
						new ItemStack(Blocks.SLIME_BLOCK),
						new ItemStack(Blocks.SLIME_BLOCK),
						new ItemStack(ItemsTC.fabric)
				}
				));
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "fire_protection_1"),
				new InfusionRecipe("ARMOR_ENCH",
				Book.EnchantBook(Enchantments.FIRE_PROTECTION, 1),
				1,
				new AspectList().add(Aspect.PROTECT, 10).add(Aspect.COLD, 10),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(Items.MAGMA_CREAM)
				}
				));
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "fire_protection_2"),
				new InfusionRecipe("ARMOR_ENCH",
				Book.EnchantBook(Enchantments.FIRE_PROTECTION, 2),
				2,
				new AspectList().add(Aspect.PROTECT, 10).add(Aspect.COLD, 20),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(Items.MAGMA_CREAM),
						new ItemStack(Items.MAGMA_CREAM)
				}
				));
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "fire_protection_3"),
				new InfusionRecipe("ARMOR_ENCH",
				Book.EnchantBook(Enchantments.FIRE_PROTECTION, 3),
				3,
				new AspectList().add(Aspect.PROTECT, 20).add(Aspect.COLD, 30),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(Items.MAGMA_CREAM),
						new ItemStack(Blocks.ICE),
						new ItemStack(Items.MAGMA_CREAM)
				}
				));
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "fire_protection_4"),
				new InfusionRecipe("ARMOR_ENCH",
				Book.EnchantBook(Enchantments.FIRE_PROTECTION, 4),
				4,
				new AspectList().add(Aspect.PROTECT, 25).add(Aspect.COLD, 50),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(Items.MAGMA_CREAM),
						new ItemStack(Blocks.ICE),
						new ItemStack(Blocks.ICE),
						new ItemStack(Items.MAGMA_CREAM)
				}
				));
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "thorns_1"),
				new InfusionRecipe("ADV_ARMOR_ENCH",
				Book.EnchantBook(Enchantments.THORNS, 1),
				1,
				new AspectList().add(Aspect.PROTECT, 10).add(Aspect.AVERSION, 20),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(Blocks.CACTUS)
				}
				));
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "thorns_2"),
				new InfusionRecipe("ADV_ARMOR_ENCH",
				Book.EnchantBook(Enchantments.THORNS, 2),
				3,
				new AspectList().add(Aspect.PROTECT, 20).add(Aspect.AVERSION, 30),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(Blocks.CACTUS),
						new ItemStack(Blocks.CACTUS)
				}
				));
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "thorns_3"),
				new InfusionRecipe("ADV_ARMOR_ENCH",
				Book.EnchantBook(Enchantments.THORNS, 3),
				5,
				new AspectList().add(Aspect.PROTECT, 25).add(Aspect.AVERSION, 50),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(Blocks.CACTUS),
						new ItemStack(Blocks.CACTUS),
						new ItemStack(Blocks.CACTUS)
				}
				));
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "feather_falling_1"),
				new InfusionRecipe("ADV_ARMOR_ENCH",
				Book.EnchantBook(Enchantments.FEATHER_FALLING, 1),
				1,
				new AspectList().add(Aspect.PROTECT, 5).add(Aspect.AIR, 15),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(Items.FEATHER)
				}
				));
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "feather_falling_2"),
				new InfusionRecipe("ADV_ARMOR_ENCH",
				Book.EnchantBook(Enchantments.FEATHER_FALLING, 2),
				2,
				new AspectList().add(Aspect.PROTECT, 10).add(Aspect.AIR, 20),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(Items.FEATHER),
						new ItemStack(Items.FEATHER)
				}
				));
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "feather_falling_3"),
				new InfusionRecipe("ADV_ARMOR_ENCH",
				Book.EnchantBook(Enchantments.FEATHER_FALLING, 3),
				3,
				new AspectList().add(Aspect.PROTECT, 25).add(Aspect.AIR, 15).add(Aspect.FLIGHT, 10),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(Items.FEATHER),
						new ItemStack(Items.FEATHER),
						new ItemStack(Items.FEATHER)
				}
				));
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "feather_falling_4"),
				new InfusionRecipe("ADV_ARMOR_ENCH",
				Book.EnchantBook(Enchantments.FEATHER_FALLING, 4),
				4,
				new AspectList().add(Aspect.PROTECT, 30).add(Aspect.AIR, 25).add(Aspect.FLIGHT, 20),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(Items.FEATHER),
						new ItemStack(Items.FEATHER),
						new ItemStack(Items.FEATHER),
						new ItemStack(Items.FEATHER)
				}
				));
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "protection_1"),
				new InfusionRecipe("BASIC_ENCH",
				Book.EnchantBook(Enchantments.PROTECTION, 1),
				1,
				new AspectList().add(Aspect.PROTECT, 15),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(ItemsTC.plate, 1, 2),
						new ItemStack(ItemsTC.plate, 1, 2)
				}
				));
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "protection_2"),
				new InfusionRecipe("BASIC_ENCH",
				Book.EnchantBook(Enchantments.PROTECTION, 2),
				2,
				new AspectList().add(Aspect.PROTECT, 30),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(ItemsTC.plate, 1, 2),
						new ItemStack(ItemsTC.plate, 1, 2),
						new ItemStack(ItemsTC.plate, 1, 2)
				}
				));
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "protection_3"),
				new InfusionRecipe("BASIC_ENCH",
				Book.EnchantBook(Enchantments.PROTECTION, 3),
				3,
				new AspectList().add(Aspect.PROTECT, 50),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(ItemsTC.plate, 1, 2),
						new ItemStack(Blocks.IRON_BLOCK),
						new ItemStack(ItemsTC.plate, 1, 2)
				}
				));
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "protection_4"),
				new InfusionRecipe("BASIC_ENCH",
				Book.EnchantBook(Enchantments.PROTECTION, 4),
				4,
				new AspectList().add(Aspect.PROTECT, 75),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(ItemsTC.plate, 1, 2),
						new ItemStack(ItemsTC.plate, 1, 2),
						new ItemStack(Blocks.IRON_BLOCK),
						new ItemStack(Blocks.IRON_BLOCK)
				}
				));
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "efficiency_1"),
				new InfusionRecipe("BASIC_ENCH",
				Book.EnchantBook(Enchantments.EFFICIENCY, 1),
				1,
				new AspectList().add(Aspect.TOOL, 15),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(Blocks.REDSTONE_BLOCK)
				}
				));
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "efficiency_2"),
				new InfusionRecipe("BASIC_ENCH",
				Book.EnchantBook(Enchantments.EFFICIENCY, 2),
				2,
				new AspectList().add(Aspect.TOOL, 30),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(Blocks.REDSTONE_BLOCK),
						new ItemStack(Blocks.REDSTONE_BLOCK)
				}
				));
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "efficiency_3"),
				new InfusionRecipe("BASIC_ENCH",
				Book.EnchantBook(Enchantments.EFFICIENCY, 3),
				3,
				new AspectList().add(Aspect.TOOL, 50),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(Blocks.REDSTONE_BLOCK),
						new ItemStack(Items.DIAMOND),
						new ItemStack(Blocks.REDSTONE_BLOCK)
				}
				));
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "efficiency_4"),
				new InfusionRecipe("BASIC_ENCH",
				Book.EnchantBook(Enchantments.EFFICIENCY, 4),
				4,
				new AspectList().add(Aspect.TOOL, 75),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(Blocks.REDSTONE_BLOCK),
						new ItemStack(Blocks.REDSTONE_BLOCK),
						new ItemStack(Items.DIAMOND),
						new ItemStack(Items.DIAMOND)
				}
				));
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "unbreaking_1"),
				new InfusionRecipe("BASIC_ENCH",
				Book.EnchantBook(Enchantments.UNBREAKING, 1),
				1,
				new AspectList().add(Aspect.METAL, 20).add(Aspect.PROTECT, 20),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(Items.DYE, 1, 4),
						new ItemStack(Blocks.LAPIS_BLOCK),
						new ItemStack(Items.DYE, 1, 4)
				}
				));
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "unbreaking_2"),
				new InfusionRecipe("BASIC_ENCH",
				Book.EnchantBook(Enchantments.UNBREAKING, 2),
				3,
				new AspectList().add(Aspect.METAL, 25).add(Aspect.PROTECT, 25),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(Items.DYE, 1, 4),
						new ItemStack(Items.DIAMOND),
						new ItemStack(Items.DYE, 1, 4)
				}
				));
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "unbreaking_3"),
				new InfusionRecipe("BASIC_ENCH",
				Book.EnchantBook(Enchantments.UNBREAKING, 3),
				5,
				new AspectList().add(Aspect.METAL, 35).add(Aspect.PROTECT, 35),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(Items.DYE, 1, 4),
						new ItemStack(Items.DYE, 1, 4),
						new ItemStack(Items.DIAMOND),
						new ItemStack(Items.DIAMOND)
				}
				));
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "silk_touch"),
				new InfusionRecipe("TOOL_ENCH",
				Book.EnchantBook(Enchantments.SILK_TOUCH, 1),
				5,
				new AspectList().add(Aspect.TOOL, 25).add(Aspect.TRAP, 75),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(Items.SLIME_BALL),
						new ItemStack(ItemsTC.nuggets, 1, 10),
						new ItemStack(Items.SLIME_BALL)
				}
				));
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "fortune_1"),
				new InfusionRecipe("TOOL_ENCH",
				Book.EnchantBook(Enchantments.FORTUNE, 1),
				2,
				new AspectList().add(Aspect.DESIRE, 30),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(Items.EMERALD),
						new ItemStack(Items.EMERALD)
				}
				));
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "fortune_2"),
				new InfusionRecipe("TOOL_ENCH",
				Book.EnchantBook(Enchantments.FORTUNE, 2),
				4,
				new AspectList().add(Aspect.DESIRE, 60),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(Items.EMERALD),
						new ItemStack(Items.EMERALD),
						new ItemStack(Items.EMERALD)
				}
				));
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "fortune_3"),
				new InfusionRecipe("TOOL_ENCH",
				Book.EnchantBook(Enchantments.FORTUNE, 3),
				6,
				new AspectList().add(Aspect.DESIRE, 100),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(Items.EMERALD),
						new ItemStack(Items.EMERALD),
						new ItemStack(Items.EMERALD),
						new ItemStack(Items.EMERALD),
						new ItemStack(Items.EMERALD)
				}
				));
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "sharpness_1"),
				new InfusionRecipe("WEAPON_ENCH",
				Book.EnchantBook(Enchantments.SHARPNESS, 1),
				2,
				new AspectList().add(Aspect.AVERSION, 25),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(Blocks.QUARTZ_BLOCK)
				}
				));
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "sharpness_2"),
				new InfusionRecipe("WEAPON_ENCH",
				Book.EnchantBook(Enchantments.SHARPNESS, 2),
				3,
				new AspectList().add(Aspect.AVERSION, 30),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(Blocks.QUARTZ_BLOCK),
						new ItemStack(Blocks.QUARTZ_BLOCK)
				}
				));
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "sharpness_3"),
				new InfusionRecipe("WEAPON_ENCH",
				Book.EnchantBook(Enchantments.SHARPNESS, 3),
				4,
				new AspectList().add(Aspect.AVERSION, 35),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(Blocks.QUARTZ_BLOCK),
						new ItemStack(Items.DIAMOND),
						new ItemStack(Blocks.QUARTZ_BLOCK)
				}
				));
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "sharpness_4"),
				new InfusionRecipe("WEAPON_ENCH",
				Book.EnchantBook(Enchantments.SHARPNESS, 4),
				5,
				new AspectList().add(Aspect.AVERSION, 40),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(Blocks.QUARTZ_BLOCK),
						new ItemStack(Items.DIAMOND),
						new ItemStack(Items.DIAMOND),
						new ItemStack(Blocks.QUARTZ_BLOCK)
				}
				));
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "knockback_1"),
				new InfusionRecipe("WEAPON_ENCH",
				Book.EnchantBook(Enchantments.KNOCKBACK, 1),
				2,
				new AspectList().add(Aspect.MOTION, 20),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(Blocks.PISTON)
				}
				));
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "knockback_2"),
				new InfusionRecipe("WEAPON_ENCH",
				Book.EnchantBook(Enchantments.KNOCKBACK, 2),
				3,
				new AspectList().add(Aspect.MOTION, 40),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(Blocks.PISTON),
						new ItemStack(Blocks.PISTON)
				}
				));
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "smite_1"),
				new InfusionRecipe("SPE_WEAPON_ENCH",
				Book.EnchantBook(Enchantments.SMITE, 1),
				3,
				new AspectList().add(Aspect.AVERSION, 5).add(Aspect.LIFE, 15),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(Items.SPECKLED_MELON)
				}
				));
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "smite_2"),
				new InfusionRecipe("SPE_WEAPON_ENCH",
				Book.EnchantBook(Enchantments.SMITE, 2),
				4,
				new AspectList().add(Aspect.AVERSION, 10).add(Aspect.LIFE, 20),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(Items.SPECKLED_MELON),
						new ItemStack(Items.SPECKLED_MELON)
				}
				));
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "smite_3"),
				new InfusionRecipe("SPE_WEAPON_ENCH",
				Book.EnchantBook(Enchantments.SMITE, 3),
				5,
				new AspectList().add(Aspect.AVERSION, 15).add(Aspect.LIFE, 35),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(Items.SPECKLED_MELON),
						new ItemStack(BlocksTC.saplingSilverwood),
						new ItemStack(Items.SPECKLED_MELON)
				}
				));
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "smite_4"),
				new InfusionRecipe("SPE_WEAPON_ENCH",
				Book.EnchantBook(Enchantments.SMITE, 4),
				6,
				new AspectList().add(Aspect.AVERSION, 25).add(Aspect.LIFE, 50),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(Items.SPECKLED_MELON),
						new ItemStack(BlocksTC.saplingSilverwood),
						new ItemStack(BlocksTC.saplingSilverwood),
						new ItemStack(Items.SPECKLED_MELON)
				}
				));
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "bane_of_arthropods_1"),
				new InfusionRecipe("SPE_WEAPON_ENCH",
				Book.EnchantBook(Enchantments.BANE_OF_ARTHROPODS, 1),
				1,
				new AspectList().add(Aspect.AVERSION, 5).add(Aspect.BEAST, 5),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(Items.FERMENTED_SPIDER_EYE)
				}
				));
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "bane_of_arthropods_2"),
				new InfusionRecipe("SPE_WEAPON_ENCH",
				Book.EnchantBook(Enchantments.BANE_OF_ARTHROPODS, 2),
				2,
				new AspectList().add(Aspect.AVERSION, 5).add(Aspect.BEAST, 15),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(Items.FERMENTED_SPIDER_EYE),
						new ItemStack(Items.FERMENTED_SPIDER_EYE)
				}
				));
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "bane_of_arthropods_3"),
				new InfusionRecipe("SPE_WEAPON_ENCH",
				Book.EnchantBook(Enchantments.BANE_OF_ARTHROPODS, 3),
				3,
				new AspectList().add(Aspect.AVERSION, 10).add(Aspect.BEAST, 20),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(Items.FERMENTED_SPIDER_EYE),
						new ItemStack(Items.FERMENTED_SPIDER_EYE),
						new ItemStack(Items.FERMENTED_SPIDER_EYE)
				}
				));
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "bane_of_arthropods_4"),
				new InfusionRecipe("SPE_WEAPON_ENCH",
				Book.EnchantBook(Enchantments.BANE_OF_ARTHROPODS, 4),
				4,
				new AspectList().add(Aspect.AVERSION, 15).add(Aspect.BEAST, 35),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(Items.FERMENTED_SPIDER_EYE),
						new ItemStack(Items.FERMENTED_SPIDER_EYE),
						new ItemStack(Items.FERMENTED_SPIDER_EYE),
						new ItemStack(Items.FERMENTED_SPIDER_EYE)
				}
				));
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "fire_aspect_1"),
				new InfusionRecipe("ADV_WEAPON_ENCH",
				Book.EnchantBook(Enchantments.FIRE_ASPECT, 1),
				4,
				new AspectList().add(Aspect.AVERSION, 10).add(Aspect.FIRE, 30),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(Items.BLAZE_ROD),
						new ItemStack(ItemsTC.alumentum)
				}
				));
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "fire_aspect_2"),
				new InfusionRecipe("ADV_WEAPON_ENCH",
				Book.EnchantBook(Enchantments.FIRE_ASPECT, 2),
				6,
				new AspectList().add(Aspect.AVERSION, 20).add(Aspect.FIRE, 60),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(Items.BLAZE_ROD),
						new ItemStack(Items.BLAZE_ROD),
						new ItemStack(ItemsTC.alumentum),
						new ItemStack(ItemsTC.alumentum)
				}
				));
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "looting_1"),
				new InfusionRecipe("ADV_WEAPON_ENCH",
				Book.EnchantBook(Enchantments.LOOTING, 1),
				2,
				new AspectList().add(Aspect.DESIRE, 30),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(Blocks.GOLD_BLOCK)
				}
				));
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "looting_2"),
				new InfusionRecipe("ADV_WEAPON_ENCH",
				Book.EnchantBook(Enchantments.LOOTING, 2),
				4,
				new AspectList().add(Aspect.DESIRE, 60),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(Blocks.GOLD_BLOCK),
						new ItemStack(Blocks.GOLD_BLOCK)
				}
				));
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "looting_3"),
				new InfusionRecipe("ADV_WEAPON_ENCH",
				Book.EnchantBook(Enchantments.LOOTING, 3),
				6,
				new AspectList().add(Aspect.DESIRE, 100),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(Blocks.GOLD_BLOCK),
						new ItemStack(Blocks.GOLD_BLOCK),
						new ItemStack(Blocks.GOLD_BLOCK)
				}
				));
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "power_1"),
				new InfusionRecipe("BOW_ENCH",
				Book.EnchantBook(Enchantments.POWER, 1),
				2,
				new AspectList().add(Aspect.AVERSION, 15),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(ItemsTC.quicksilver)
				}
				));
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "power_2"),
				new InfusionRecipe("BOW_ENCH",
				Book.EnchantBook(Enchantments.POWER, 2),
				3,
				new AspectList().add(Aspect.AVERSION, 30),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(ItemsTC.quicksilver),
						new ItemStack(ItemsTC.quicksilver)
				}
				));
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "power_3"),
				new InfusionRecipe("BOW_ENCH",
				Book.EnchantBook(Enchantments.POWER, 3),
				4,
				new AspectList().add(Aspect.AVERSION, 50),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(ItemsTC.quicksilver),
						new ItemStack(ItemsTC.quicksilver),
						new ItemStack(ItemsTC.quicksilver)
				}
				));
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "power_4"),
				new InfusionRecipe("BOW_ENCH",
				Book.EnchantBook(Enchantments.POWER, 4),
				5,
				new AspectList().add(Aspect.AVERSION, 75),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(ItemsTC.quicksilver),
						new ItemStack(ItemsTC.quicksilver),
						new ItemStack(ItemsTC.quicksilver),
						new ItemStack(ItemsTC.quicksilver)
				}
				));
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "punch_1"),
				new InfusionRecipe("BOW_ENCH",
				Book.EnchantBook(Enchantments.PUNCH, 1),
				2,
				new AspectList().add(Aspect.MOTION, 10).add(Aspect.FLIGHT, 10),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(Items.ENDER_PEARL)
				}
				));
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "punch_2"),
				new InfusionRecipe("BOW_ENCH",
				Book.EnchantBook(Enchantments.PUNCH, 2),
				4,
				new AspectList().add(Aspect.MOTION, 20).add(Aspect.FLIGHT, 20),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(Items.ENDER_PEARL),
						new ItemStack(Items.ENDER_PEARL)
				}
				));
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "flame"),
				new InfusionRecipe("ADV_BOW_ENCH",
				Book.EnchantBook(Enchantments.FLAME, 1),
				4,
				new AspectList().add(Aspect.MOTION, 10).add(Aspect.AVERSION, 10).add(Aspect.FIRE, 60),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(Items.FIRE_CHARGE),
						new ItemStack(Items.FIRE_CHARGE),
						new ItemStack(ItemsTC.alumentum),
						new ItemStack(ItemsTC.alumentum)
				}
				));
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "infinity"),
				new InfusionRecipe("ADV_BOW_ENCH",
				Book.EnchantBook(Enchantments.INFINITY, 1),
				6,
				new AspectList().add(Aspect.EXCHANGE, 40).add(Aspect.ELDRITCH, 30).add(Aspect.MAGIC, 30),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(Items.ENDER_EYE),
						new ItemStack(Items.ENDER_EYE),
						new ItemStack(Items.ENDER_EYE)
				}
				));
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "aqua_affinity"),
				new InfusionRecipe("AQUATIC_ENCH",
				Book.EnchantBook(Enchantments.AQUA_AFFINITY, 1),
				2,
				new AspectList().add(Aspect.WATER, 25).add(Aspect.SENSES, 25),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(Items.FISH, 1, 2)
				}
				));
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "respiration_1"),
				new InfusionRecipe("AQUATIC_ENCH",
				Book.EnchantBook(Enchantments.RESPIRATION, 1),
				1,
				new AspectList().add(Aspect.WATER, 10).add(Aspect.AIR, 10),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(Items.FISH, 1, 3)
				}
				));
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "respiration_2"),
				new InfusionRecipe("AQUATIC_ENCH",
				Book.EnchantBook(Enchantments.RESPIRATION, 2),
				3,
				new AspectList().add(Aspect.WATER, 15).add(Aspect.AIR, 15),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(Items.FISH, 1, 3),
						new ItemStack(Items.FISH, 1, 3)
				}
				));
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "respiration_3"),
				new InfusionRecipe("AQUATIC_ENCH",
				Book.EnchantBook(Enchantments.RESPIRATION, 3),
				5,
				new AspectList().add(Aspect.WATER, 20).add(Aspect.AIR, 20),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(Items.FISH, 1, 3),
						new ItemStack(Items.PRISMARINE_SHARD),
						new ItemStack(Items.FISH, 1, 3)
				}
				));
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "depth_strider_1"),
				new InfusionRecipe("AQUATIC_ENCH",
				Book.EnchantBook(Enchantments.DEPTH_STRIDER, 1),
				1,
				new AspectList().add(Aspect.WATER, 15).add(Aspect.MOTION, 5),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(Items.FISH, 1, 1)
				}
				));
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "depth_strider_2"),
				new InfusionRecipe("AQUATIC_ENCH",
				Book.EnchantBook(Enchantments.DEPTH_STRIDER, 2),
				3,
				new AspectList().add(Aspect.WATER, 30).add(Aspect.MOTION, 10),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(Items.FISH, 1, 1),
						new ItemStack(Items.FISH, 1, 1)
				}
				));
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "depth_strider_3"),
				new InfusionRecipe("AQUATIC_ENCH",
				Book.EnchantBook(Enchantments.DEPTH_STRIDER, 3),
				5,
				new AspectList().add(Aspect.WATER, 45).add(Aspect.MOTION, 15),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(Items.FISH, 1, 1),
						new ItemStack(Items.PRISMARINE_SHARD),
						new ItemStack(Items.FISH, 1, 1)
				}
				));
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "lure_1"),
				new InfusionRecipe("ROD_ENCH",
				Book.EnchantBook(Enchantments.LURE, 1),
				1,
				new AspectList().add(Aspect.LIFE, 5).add(Aspect.TRAP, 10),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(Items.WHEAT_SEEDS)
				}
				));
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "lure_2"),
				new InfusionRecipe("ROD_ENCH",
				Book.EnchantBook(Enchantments.LURE, 2),
				2,
				new AspectList().add(Aspect.LIFE, 10).add(Aspect.TRAP, 15),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(Items.WHEAT_SEEDS),
						new ItemStack(Items.MELON_SEEDS)
				}
				));
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "lure_3"),
				new InfusionRecipe("ROD_ENCH",
				Book.EnchantBook(Enchantments.LURE, 3),
				3,
				new AspectList().add(Aspect.LIFE, 15).add(Aspect.TRAP, 20),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(Items.WHEAT_SEEDS),
						new ItemStack(Items.MELON_SEEDS),
						new ItemStack(Items.PUMPKIN_SEEDS)
				}
				));
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "luck_of_the_sea_1"),
				new InfusionRecipe("ROD_ENCH",
				Book.EnchantBook(Enchantments.LUCK_OF_THE_SEA, 1),
				1,
				new AspectList().add(Aspect.WATER, 5).add(Aspect.DESIRE, 15),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(Items.GOLD_INGOT)
				}
				));
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "luck_of_the_sea_2"),
				new InfusionRecipe("ROD_ENCH",
				Book.EnchantBook(Enchantments.LUCK_OF_THE_SEA, 2),
				3,
				new AspectList().add(Aspect.WATER, 10).add(Aspect.DESIRE, 20),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(Items.GOLD_INGOT),
						new ItemStack(Items.GOLD_INGOT)
				}
				));
		ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("enchantingwiththaumcraft", "luck_of_the_sea_3"),
				new InfusionRecipe("ROD_ENCH",
				Book.EnchantBook(Enchantments.LUCK_OF_THE_SEA, 3),
				5,
				new AspectList().add(Aspect.WATER, 20).add(Aspect.DESIRE, 30),
				new ItemStack(Items.BOOK),
				new Object[] {
						new ItemStack(ItemsTC.amber),
						new ItemStack(Items.GOLD_INGOT),
						new ItemStack(Items.GOLD_INGOT),
						new ItemStack(Items.GOLD_INGOT)
				}
				));
	}
}
