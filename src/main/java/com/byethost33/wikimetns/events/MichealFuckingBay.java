package com.byethost33.wikimetns.events;

import org.bukkit.entity.EntityType;
import org.bukkit.event.block.BlockBreakEvent;

import com.byethost33.wikimetns.LuckyBlockObject;

public class MichealFuckingBay extends LuckyBlockObject{
	
	public boolean open(BlockBreakEvent event) {
		
		
		for (int i= 0; i < 250; i++) {
			event.getPlayer().getWorld().spawnEntity(event.getBlock().getLocation(), EntityType.PRIMED_TNT);
		}
		
		return true;
		
	}
}
