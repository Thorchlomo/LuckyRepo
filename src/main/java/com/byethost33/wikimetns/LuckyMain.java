package com.byethost33.wikimetns;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import com.byethost33.wikimetns.commands.Debug;
import com.byethost33.wikimetns.commands.FinishGame;
import com.byethost33.wikimetns.commands.StartGame;
import com.byethost33.wikimetns.commands.Startpos;
import com.byethost33.wikimetns.registers.RegistersLuckyBlockEvent;

public class LuckyMain extends JavaPlugin{
	
	// Object representant la configuration 
	FileConfiguration config = getConfig();
	
	@Override
	public void onEnable() {
		System.out.println("Enregistrement des events de lucky block");
		RegistersLuckyBlockEvent.register();
		
		System.out.println("Enregistrement du Listener");
		
		// Ecouteur d'event
		this.getServer().getPluginManager().registerEvents(new LuckyListener(), this);
		//Ecriture de la config.yml livré avec le plugin
		this.saveDefaultConfig();
		System.out.println("Hey, Merci d'utiliser ce plugin :) ");
		System.out.println("Version : " + config.get("version"));
		
		//TODO Enregister les commandes par groupe dans une classe à part
		//On enregistre la commande /debug
		this.getCommand("debug").setExecutor(new Debug());
		
		// La longeur est sur x afin de gagner du temps dans le developement
		this.getCommand("startpos").setExecutor(new Startpos());
		
		// La commande qui permet de dire qu'un joueur est gagnant
		this.getCommand("finishgame").setExecutor(new FinishGame());
		
		// La commande qui permet de lancer le jeu
		this.getCommand("startgame").setExecutor(new StartGame());
		
		
	}
	
	@Override
	public void onDisable () {
		
	}
	
	
}