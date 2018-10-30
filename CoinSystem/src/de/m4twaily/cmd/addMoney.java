package de.m4twaily.cmd;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import de.m4twaily.cs.Main;
import de.m4twaily.mysql.Points;

public class addMoney {

	void addOwn(Player p, int amount) {
		try {

			Points.addMoney(p.getUniqueId(), amount);

			p.sendMessage(" ");
			p.sendMessage(Main.prefix + "§eDein Geld wurde auf " + Points.getMoney(p.getUniqueId()) + "$ gesetzt");
			p.sendMessage(" ");

		} catch (Exception e) {
			help(p);
		}
	}

	void addOther(Player p, String[] args, int amount) {
		try {

			Player target = Bukkit.getPlayer(args[1]);

			Points.addMoney(target.getUniqueId(), amount);

			p.sendMessage(" ");
			p.sendMessage(Main.prefix + "§eGeld von " + target.getName() + " auf "
					+ Points.getMoney(target.getUniqueId()) + "$ gesetzt");
			p.sendMessage(" ");

			target.sendMessage(" ");
			target.sendMessage(
					Main.prefix + "§eDein Geld wurde auf " + Points.getMoney(target.getUniqueId()) + "$ gesetzt");
			target.sendMessage(" ");

		} catch (Exception e) {
			help(p);
		}
	}

	void help(Player p) {
		p.sendMessage(" ");
		p.sendMessage(Main.prefix + "§c§l/money add [Name] [Wert]");
		p.sendMessage(" ");
	}
}
