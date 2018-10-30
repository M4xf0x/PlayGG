package de.m4twaily.cmd;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import de.m4twaily.cs.Main;
import de.m4twaily.mysql.Points;

public class setMoney {

	void setOwn(Player p, int amount) {
		try {

			Points.setMoney(p.getUniqueId(), amount);

			p.sendMessage(" ");
			p.sendMessage(Main.prefix + "§eDein Geld wurde auf " + amount + "$ gesetzt");
			p.sendMessage(" ");

		} catch (Exception e) {
			help(p);
		}
	}

	void setOther(Player p, String[] args, int amount) {
		try {

			Player target = Bukkit.getPlayer(args[1]);

			Points.setMoney(target.getUniqueId(), amount);

			p.sendMessage(" ");
			p.sendMessage(Main.prefix + "§eGeld von " + target.getName() + " auf " + amount + "$ gesetzt");
			p.sendMessage(" ");

			target.sendMessage(" ");
			target.sendMessage(Main.prefix + "§eDein Geld wurde auf " + amount + "$ gesetzt");
			target.sendMessage(" ");

		} catch (Exception e) {
			help(p);
		}
	}

	void help(Player p) {
		p.sendMessage(" ");
		p.sendMessage(Main.prefix + "§c§l/money set [Name] [Wert]");
		p.sendMessage(" ");
	}
}
