package com.frostnox.enchantingwiththaumcraft.recipes;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentData;
import net.minecraft.init.Items;
import net.minecraft.item.ItemEnchantedBook;
import net.minecraft.item.ItemStack;

public class Book {
	public static ItemStack EnchantBook(Enchantment type, int level)
	{
		ItemStack book = new ItemStack(Items.ENCHANTED_BOOK, 1);
		ItemEnchantedBook.addEnchantment(book, new EnchantmentData(type, level));
		return book;
	}
}
