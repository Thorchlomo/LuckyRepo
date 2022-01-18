package com.byethost33.wikimetns.commands;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

import com.byethost33.wikimetns.LuckyMain;

public class StartGame implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if (args.length == 2) {
			// TODO Auto-generated method stub
			
			System.out.println(JavaPlugin.getPlugin(LuckyMain.class).getConfig().get("startpos.x.1"));
			
			String x1 = JavaPlugin.getPlugin(LuckyMain.class).getConfig().get("startpos.x.1").toString().replace(" ", "");
			String y1 = JavaPlugin.getPlugin(LuckyMain.class).getConfig().get("startpos.y.1").toString().replace(" ", "");
			String z1 = JavaPlugin.getPlugin(LuckyMain.class).getConfig().get("startpos.z.1").toString().replace(" ", "");
			
			String x2 = JavaPlugin.getPlugin(LuckyMain.class).getConfig().get("startpos.x.2").toString().replace(" ", "");
			String y2 = JavaPlugin.getPlugin(LuckyMain.class).getConfig().get("startpos.y.2").toString().replace(" ", "");
			String z2 = JavaPlugin.getPlugin(LuckyMain.class).getConfig().get("startpos.z.2").toString().replace(" ", "");
			
			sender.sendMessage("Teleportation des joueurs et lancement du jeu...");
			
			// Probablement un probleme de compatibilité ici mais tant pis pas le time
			Location coordPlayer1 = new Location(sender.getServer().getWorlds().get(0), Integer.parseInt(x1), Integer.parseInt(y1), Integer.parseInt(z1));
			Location coordPlayer2 = new Location(sender.getServer().getWorlds().get(0), Integer.parseInt(x2), Integer.parseInt(y2), Integer.parseInt(z2));
			
			sender.getServer().getPlayer(args[0]).teleport(coordPlayer1);
			sender.getServer().getPlayer(args[1]).teleport(coordPlayer2);
			
			return true;
		}
		else {
			return false;
		}
	}
	
}
