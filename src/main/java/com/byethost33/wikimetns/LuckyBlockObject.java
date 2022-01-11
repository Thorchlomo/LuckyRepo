package com.byethost33.wikimetns;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;

public class LuckyBlockObject {
	
	/*
	private String someData;

	public String getSomeData() {
		return someData;
	}

	public void setSomeData(String someData) {
		this.someData = someData;
	}
	*/
	
	/**
	 * Fonction utilisé pour l'ouverture des lucky blocks, chaque classe de lucky block doit la
	 * posséder, c'est elle qui est apellée depuis LuckyEvent
	 * 
	 * 
	 * @since 1.0
	 * @author Thorchlomo
	 * @param block 
	 * @param player 
	 * @return Si l'ouverture à été un succès
	 */
	public boolean open(Player player, Block block) {
		return false;
	}
	
	
}
