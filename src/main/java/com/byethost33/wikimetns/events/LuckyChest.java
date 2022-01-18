package com.byethost33.wikimetns.events;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import com.byethost33.wikimetns.LuckyBlockObject;

public class LuckyChest extends LuckyBlockObject{
	
	public boolean open(BlockBreakEvent event) {
		
		List<String> mineLore = new ArrayList<>();
		mineLore.add(" De l'argent qui vient de ");
		mineLore.add(" vous savez où ;) ");
		
		Inventory luckyInv = Bukkit.createInventory(null, 54, "Fait toi plaisir ;)");
		luckyInv.setMaxStackSize(127);
		
		ItemStack minecoin = new ItemStack(Material.GOLD_BLOCK,127);
		minecoin.getItemMeta().setDisplayName("Minecoin");
		minecoin.getItemMeta().setLore(mineLore);
		
		for (int i = 0; i < 54; i++) {
			luckyInv.setItem(i, minecoin);
		}
		
		event.getPlayer().openInventory(luckyInv);
		
		
		
		return true;
		
	}
	
}
