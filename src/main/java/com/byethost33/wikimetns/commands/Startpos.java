package com.byethost33.wikimetns.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

import com.byethost33.wikimetns.LuckyMain;

public class Startpos implements CommandExecutor{
	
	
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		System.out.println(args.length);
		if (args.length == 6) {
			JavaPlugin.getPlugin(LuckyMain.class).getConfig().set("startpos.x.1", args[0]);
			for (int i = 0; i < 6; i++) {
				// Variable qui stocke le x, y ou z
				String coordVar = null;
				int coordNum = 0;
				switch (i) {
					case 0:
					case 3:
						coordVar = "x";
						break;
					case 1:
					case 4:
						coordVar = "y";
						break;
					case 2:
					case 5:
						coordVar = "z";
						break;
						
				}
				
				if (i-3 < 0) {
					coordNum = 1;
				}
				else {
					coordNum = 2;
				}
				
				JavaPlugin.getPlugin(LuckyMain.class).getConfig().set("startpos."+ coordVar + "." + coordNum, args[i]);
			}
			
			// On sauvegarde la config 
			JavaPlugin.getPlugin(LuckyMain.class).saveConfig();
			return true;
		}
		else {
			sender.sendMessage("Nombre incorrect d'argument : " + args.length);
			return false;
		}
	}
}
