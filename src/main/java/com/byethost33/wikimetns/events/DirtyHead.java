package com.byethost33.wikimetns.events;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

import com.byethost33.wikimetns.LuckyBlockObject;

public class DirtyHead extends LuckyBlockObject{
	
	public boolean open(BlockBreakEvent event) {
		event.getPlayer().getInventory().setHelmet(new ItemStack(Material.DIRT));
		Bukkit.broadcastMessage(event.getPlayer().getName() + " s'est enfoncé la tete dans la boue");
		return true;
	}
	
}
