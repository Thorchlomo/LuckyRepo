package com.byethost33.wikimetns;

import java.util.ArrayList;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

public class LuckyEvent {
	
	
	public static ArrayList<String> eventList = new ArrayList<String>();
	
	// Fonction pour jouer un event
	public static int Play (Player player, Block block) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		// We create a new class loader
		ClassLoader cl = new ClassLoader() {};
		// On empeche des messages relous de s'afficher et un charge notre classe
		@SuppressWarnings("unchecked") // C'est quand meme relou java parfois
		Class<LuckyBlockObject> eventClass = (Class<LuckyBlockObject>) cl.loadClass(eventList.get(0));
		
		// On crée une nouvelle instace de notre class
		LuckyBlockObject Objet = eventClass.newInstance();
		
		// On travaille dessus
		//Objet.setSomeData(null);
		System.out.println(Objet.open(player, block));
		
		return 0;
		
	}
	
	public static ArrayList<String> getEvents() {
		return eventList;
	}
}
