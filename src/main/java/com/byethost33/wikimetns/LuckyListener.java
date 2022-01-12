package com.byethost33.wikimetns;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class LuckyListener implements Listener{
	
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		event.setJoinMessage("Bienvenue à " + event.getPlayer().getName());
	}
	
	
	//Idée pour le bug : block break event est un objet et pas un evenement ;)
	
	@EventHandler
	public void onBlockBreak(BlockBreakEvent event) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		if (event.getBlock().getType() == Material.YELLOW_STAINED_GLASS) {
			//event.getPlayer().sendMessage("You break a lucky block");
			LuckyEvent.Play(event);
		}
	}
}
