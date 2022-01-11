package com.byethost33.wikimetns.commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Debug implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		// TODO Auto-generated method stub
		
		// Si l'envoyeur est un sous-type de l'objet Player
		if (sender instanceof Player) {
			
			//Création d'un objet player à partir de sende
			Player player = (Player) sender;
			
			// Création d'un stack de batton fort sympathiques
			ItemStack Batton = new ItemStack(Material.STICK, 65);
			
			// Mise dans l'inventaire du joueur de l'item stack
			player.getInventory().addItem(Batton);
			
		}
		
		// La commande à réussie
		return true;
	}

}
