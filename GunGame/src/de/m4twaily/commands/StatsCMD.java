package de.m4twaily.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.m4twaily.mysql.Points;

public class StatsCMD implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

		if (sender instanceof Player) {
			Player p = (Player) sender;

			if (args.length == 0) {

				double kd = (double) Points.getPoints(p.getUniqueId()) / (double) Points.getDeaths(p.getUniqueId());
				kd = (double) Math.round(kd * 100) / 100;

				p.sendMessage(" ");
				p.sendMessage(" §8» §6§lStats:");
				p.sendMessage("   §8» §eKills: " + Points.getPoints(p.getUniqueId()));
				p.sendMessage("   §8» §eTode: " + Points.getDeaths(p.getUniqueId()));
				p.sendMessage("   §8» §eKD: " + kd);
				p.sendMessage(" ");

			} else if (args.length == 1) {
				try {
					Player target = Bukkit.getPlayer(args[0]);

					double kd = (double) Points.getPoints(target.getUniqueId())
							/ (double) Points.getDeaths(target.getUniqueId());
					kd = (double) Math.round(kd * 100) / 100;

					p.sendMessage(" ");
					p.sendMessage(" §8» §6§lStats von " + target.getName() + ":");
					p.sendMessage("   §8» §eKills: " + Points.getPoints(target.getUniqueId()));
					p.sendMessage("   §8» §eTode: " + Points.getDeaths(target.getUniqueId()));
					p.sendMessage("   §8» §eKD: " + kd);
					p.sendMessage(" ");

				} catch (Exception e) {
					help(p);
				}

			} else {
				help(p);
			}

		}
		return false;
	}

	void help(Player p) {

		p.sendMessage(" ");
		p.sendMessage(" §8» §6§lTipp:");
		p.sendMessage("   §8» §e/stats [Name]");
		p.sendMessage(" ");

	}
}
