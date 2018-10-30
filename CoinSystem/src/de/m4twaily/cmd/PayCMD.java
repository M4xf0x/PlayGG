package de.m4twaily.cmd;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PayCMD implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

		if (sender instanceof Player) {
			Player p = (Player) sender;

			payMoney pm = new payMoney();

			try {

				if (args.length == 2) {

					pm.payOtherCMD(p, args, Integer.parseInt(args[1]));

				} else {
					pm.help(p);
				}

			} catch (Exception e) {
				pm.help(p);
			}

		}

		return false;
	}
}