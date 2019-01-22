package de.m4twaily.commands;

import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.m4twaily.gg.Main;
import de.m4twaily.mysql.Points;

public class StatsCMD implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

		if (sender instanceof Player) {
			Player p = (Player) sender;

			if (p.getWorld() == Bukkit.getWorld(Main.main.getConfig().getString("Config.world"))) {

				if (args.length == 0) {

					double kd = (double) Points.getPoints(p.getUniqueId()) / (double) Points.getDeaths(p.getUniqueId());
					kd = (double) Math.round(kd * 100) / 100;

					p.sendMessage(" ");
					p.sendMessage(" �8� �6�lStats:");
					p.sendMessage("   �8� �eKills: " + Points.getPoints(p.getUniqueId()));
					p.sendMessage("   �8� �eTode: " + Points.getDeaths(p.getUniqueId()));
					p.sendMessage("   �8� �eKD: " + kd);
					p.sendMessage(" ");

				} else if (args.length == 1) {
					try {
						@SuppressWarnings("deprecation")
						OfflinePlayer target = Bukkit.getOfflinePlayer(args[0]);

						if (Points.getDeaths(target.getUniqueId()) != -1) {

							double kd = (double) Points.getPoints(target.getUniqueId())
									/ (double) Points.getDeaths(target.getUniqueId());
							kd = (double) Math.round(kd * 100) / 100;

							p.sendMessage(" ");
							p.sendMessage(" �8� �6�lStats von " + target.getName() + ":");
							p.sendMessage("   �8� �eKills: " + Points.getPoints(target.getUniqueId()));
							p.sendMessage("   �8� �eTode: " + Points.getDeaths(target.getUniqueId()));
							p.sendMessage("   �8� �eKD: " + kd);
							p.sendMessage(" ");
						} else {
							p.sendMessage(" ");
							p.sendMessage(
									" �8� �c�lDer Spieler " + target.getName() + " war noch nicht auf dem Server!");
							p.sendMessage(" ");
						}
					} catch (Exception e) {
						help(p);
					}

				} else {
					help(p);
				}
			}
		}
		return false;
	}

	void help(Player p) {

		p.sendMessage(" ");
		p.sendMessage(" �8� �6�lTipp:");
		p.sendMessage("   �8� �e/stats [Name]");
		p.sendMessage(" ");

	}
}
