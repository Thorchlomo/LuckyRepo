package com.byethost33.wikimetns.events;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;

import com.byethost33.wikimetns.LuckyBlockObject;

public class DirtyHead extends LuckyBlockObject{
	
	public boolean open(Player player, Block block) {
		player.setArrowsInBody(200);
		return true;
	}
	
}
