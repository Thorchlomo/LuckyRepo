package com.byethost33.wikimetns.events;

import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.event.block.BlockBreakEvent;

import com.byethost33.wikimetns.LuckyBlockObject;

public class StoneBlock extends LuckyBlockObject{
	
	public boolean open(BlockBreakEvent event ) {
		
		World monde = event.getPlayer().getWorld();
		
		int sourceX = event.getBlock().getLocation().getBlockX();
		int sourceY = event.getBlock().getLocation().getBlockY();
		int sourceZ = event.getBlock().getLocation().getBlockZ();
		
		// Oui je sait qu'on peut faire plus cour mais flemme pour ça, peut etre plus tard ?
		
		int X = sourceX - 2;
		int Y = sourceY;
		int Z = sourceZ - 2;
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				for (int k = 0; k <5; k++) {
					monde.getBlockAt(X + i, Y+j, Z+k).setType(Material.STONE);
				}
			}
		}
		
		event.getPlayer().sendTitle("C'est bon les cailloux", "dans 20/30 ans il n'y en aura plus", 0, 40, 5);
		
		
		return true;
		
	}
	
}
