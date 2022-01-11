package com.byethost33.wikimetns;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import com.byethost33.wikimetns.commands.Debug;

public class LuckyMain extends JavaPlugin{
	
	// Object representant la configuration 
	FileConfiguration config = getConfig();
	
	@Override
	public void onEnable() {
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
		
		
	}
	
	@Override
	public void onDisable () {
		
	}
	
}