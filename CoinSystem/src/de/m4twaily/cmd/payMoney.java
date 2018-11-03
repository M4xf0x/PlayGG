package de.m4twaily.cmd;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import de.m4twaily.cs.Main;
import de.m4twaily.mysql.CoinSystem;

public class payMoney {

	void payOther(Player p, String[] args, int amount) {
		try {

			Player target = Bukkit.getPlayer(args[1]);
			CoinSystem cs = new CoinSystem();
			int i = cs.getMoney(p.getUniqueId());

			if (i - amount >= 0 && amount > 0) {

				cs.removeMoney(p.getUniqueId(), amount);
				cs.addMoney(target.getUniqueId(), amount);

				p.sendMessage(" ");
				p.sendMessage(Main.prefix + "§eDu hast " + target.getName() + " " + amount + "$ überwiesen");
				p.sendMessage(" ");

				target.sendMessage(" ");
				target.sendMessage(Main.prefix + "§e" + p.getName() + " hat dir " + amount + "$ überwiesen");
				target.sendMessage(" ");
			} else {
				help(p);
			}
		} catch (Exception e) {
			help(p);
		}
	}

	void payOtherCMD(Player p, String[] args, int amount) {
		try {

			Player target = Bukkit.getPlayer(args[0]);
			CoinSystem cs = new CoinSystem();
			int i = cs.getMoney(p.getUniqueId());

			if (i - amount >= 0 && amount > 0) {

				cs.removeMoney(p.getUniqueId(), amount);
				cs.addMoney(target.getUniqueId(), amount);

				p.sendMessage(" ");
				p.sendMessage(Main.prefix + "§eDu hast " + target.getName() + " " + amount + "$ überwiesen");
				p.sendMessage(" ");

				target.sendMessage(" ");
				target.sendMessage(Main.prefix + "§e" + p.getName() + " hat dir " + amount + "$ überwiesen");
				target.sendMessage(" ");
			} else {
				help(p);
			}
		} catch (Exception e) {
			help(p);
		}
	}

	void help(Player p) {
		p.sendMessage(" ");
		p.sendMessage(Main.prefix + "§c§l/money pay [Name] [Wert]");
		p.sendMessage(" ");
	}
}
