package com.byethost33.wikimetns.commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;


public class FinishGame implements CommandExecutor{


	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if (args.length == 1) {
			sender.getServer().broadcastMessage(" Bravo à " + args[0] + " qui à gagné la partie !");
			sender.getServer().getPlayer(args[0]).setCustomName("Gagnant");
			// On crée l'item stack
			ItemStack itemDuGagnant = new ItemStack(Material.YELLOW_STAINED_GLASS, 64);
			// On crée l'item meta
			ItemMeta itemMeta = itemDuGagnant.getItemMeta();
			// On modifie la meta
			itemMeta.setDisplayName("Lucky Block du Gagnant ;)");
			// On l'applique
			itemDuGagnant.setItemMeta(itemMeta);
			sender.getServer().getPlayer(args[0]).getInventory().setItemInMainHand(itemDuGagnant);
			return true;
		}
		// TODO Auto-generated method stub
		return false;
	}
}
