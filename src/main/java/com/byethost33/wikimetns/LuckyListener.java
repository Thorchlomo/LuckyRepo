package com.byethost33.wikimetns;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class LuckyListener implements Listener{
	
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		event.setJoinMessage("Bienvenue à " + event.getPlayer().getName());
	}
	
	@EventHandler
	public void BlockBreakEvent(Player player, Block block) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		if (block.getType() == Material.YELLOW_STAINED_GLASS) {
			player.sendMessage("You break a lucky block");
			LuckyEvent.Play(player, block);
		}
	}
}
