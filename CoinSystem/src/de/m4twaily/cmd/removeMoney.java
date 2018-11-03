package de.m4twaily.cmd;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import de.m4twaily.cs.Main;
import de.m4twaily.mysql.CoinSystem;

public class removeMoney {

	void removeOwn(Player p, int amount) {
		try {
			CoinSystem cs = new CoinSystem();
			
			cs.removeMoney(p.getUniqueId(), amount);

			p.sendMessage(" ");
			p.sendMessage(Main.prefix + "§eDein Geld wurde auf " + cs.getMoney(p.getUniqueId()) + "$ gesetzt");
			p.sendMessage(" ");

		} catch (Exception e) {
			help(p);
		}
	}

	void removeOther(Player p, String[] args, int amount) {
		try {

			Player target = Bukkit.getPlayer(args[1]);
			CoinSystem cs = new CoinSystem();
			
			cs.removeMoney(target.getUniqueId(), amount);

			p.sendMessage(" ");
			p.sendMessage(Main.prefix + "§eGeld von " + target.getName() + " auf "
					+ cs.getMoney(target.getUniqueId()) + "$ gesetzt");
			p.sendMessage(" ");

			target.sendMessage(" ");
			target.sendMessage(
					Main.prefix + "§eDein Geld wurde auf " + cs.getMoney(target.getUniqueId()) + "$ gesetzt");
			target.sendMessage(" ");

		} catch (Exception e) {
			help(p);
		}
	}

	void help(Player p) {
		p.sendMessage(" ");
		p.sendMessage(Main.prefix + "§c§l/money remove [Name] [Wert]");
		p.sendMessage(" ");
	}
}
