package com.byethost33.wikimetns.events;

import org.bukkit.Bukkit;
import org.bukkit.event.block.BlockBreakEvent;

import com.byethost33.wikimetns.LuckyBlockObject;

public class DemoScreen extends LuckyBlockObject{
	
	public boolean open(BlockBreakEvent event) {
		
		event.getPlayer().showDemoScreen();
		Bukkit.broadcastMessage(event.getPlayer().getName() + " est prié d'acheter le jeu ;)");
		
		return true;
	}
}
