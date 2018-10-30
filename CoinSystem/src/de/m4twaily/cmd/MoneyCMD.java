package de.m4twaily.cmd;

import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.m4twaily.cs.Main;
import de.m4twaily.mysql.Points;

public class MoneyCMD implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

		if (sender instanceof Player) {
			Player p = (Player) sender;

			if (args.length == 0) {

				get(p);

			} else if (args[0].equalsIgnoreCase("set")) {
				if (p.hasPermission("cs.admin")) {

					setMoney sm = new setMoney();

					try {

						if (args.length == 2) {

							sm.setOwn(p, Integer.parseInt(args[1]));

						} else if (args.length == 3) {

							sm.setOther(p, args, Integer.parseInt(args[2]));

						} else {
							sm.help(p);
						}
					} catch (Exception e) {
						sm.help(p);
					}
				}

			} else if (args[0].equalsIgnoreCase("add")) {
				if (p.hasPermission("cs.admin")) {

					addMoney am = new addMoney();

					try {

						if (args.length == 2) {

							am.addOwn(p, Integer.parseInt(args[1]));

						} else if (args.length == 3) {

							am.addOther(p, args, Integer.parseInt(args[2]));

						} else {
							am.help(p);
						}
					} catch (Exception e) {
						am.help(p);
					}
				}

			} else if (args[0].equalsIgnoreCase("remove")) {
				if (p.hasPermission("cs.admin")) {

					removeMoney rm = new removeMoney();

					try {

						if (args.length == 2) {

							rm.removeOwn(p, Integer.parseInt(args[1]));

						} else if (args.length == 3) {

							rm.removeOther(p, args, Integer.parseInt(args[2]));

						} else {
							rm.help(p);
						}
					} catch (Exception e) {
						rm.help(p);
					}
				}

			} else if (args[0].equalsIgnoreCase("pay")) {

				payMoney pm = new payMoney();

				try {

					if (args.length == 3) {

						pm.payOther(p, args, Integer.parseInt(args[2]));

					} else {
						pm.help(p);
					}
				} catch (Exception e) {
					pm.help(p);
				}

			} else if (args[0].equalsIgnoreCase("help") || args[0].equalsIgnoreCase("hilfe")) {
				if (p.hasPermission("cs.admin")) {
					helpAdmin(p);

				} else {
					help(p);
				}

			} else {
				try {
					@SuppressWarnings("deprecation")
					OfflinePlayer target = Bukkit.getOfflinePlayer(args[0]);

					if (Points.getMoney(target.getUniqueId()) != -1) {

						p.sendMessage(" ");
						p.sendMessage(Main.prefix + "§eGeld von " + target.getName() + ": "
								+ Points.getMoney(target.getUniqueId()) + "$");
						p.sendMessage(" ");

					} else {
						p.sendMessage(" ");
						p.sendMessage(" §8» §c§lDer Spieler " + target.getName() + " war noch nicht auf dem Server!");
						p.sendMessage(" ");
					}
				} catch (Exception e) {
					System.out.println(" ");
					System.out.println(" [Error] ");
					System.out.println(" ");
				}
			}

		}

		return false;
	}

	void get(Player p) {

		p.sendMessage(" ");
		p.sendMessage(Main.prefix + "§eDein Geld: " + Points.getMoney(p.getUniqueId()) + "$");
		p.sendMessage(" ");

	}

	void helpAdmin(Player p) {

		p.sendMessage(" ");
		p.sendMessage(" §8» §6§lTipp:");
		p.sendMessage("   §8» §e/money [Name]");
		p.sendMessage("   §8» §e/money pay [Name] [Wert]");
		p.sendMessage("   §8» §e/money set [Name] [Wert]");
		p.sendMessage("   §8» §e/money add [Name] [Wert]");
		p.sendMessage("   §8» §e/money remove [Name] [Wert]");
		p.sendMessage(" ");

	}

	void help(Player p) {

		p.sendMessage(" ");
		p.sendMessage(" §8» §6§lTipp:");
		p.sendMessage("   §8» §e/money [Name]");
		p.sendMessage("   §8» §e/money pay [Name] [Wert]");
		p.sendMessage(" ");

	}
}
