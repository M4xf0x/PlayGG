package de.m4twaily.commands;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
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

import de.m4twaily.events.Anti;
import de.m4twaily.gg.Main;
import de.m4twaily.gg.RestartClass;
import de.m4twaily.gg.giveArmyClass;

public class GunGame implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;

		if (cmd.getName().equalsIgnoreCase("Gungame") || cmd.getName().equalsIgnoreCase("gg")) {

			if (args.length == 1 || args.length == 2) {

				if (args[0].equalsIgnoreCase("setspawn")) {
					setspawn(p);

				} else if (args[0].equalsIgnoreCase("pos1")) {
					pos1(p);

				} else if (args[0].equalsIgnoreCase("pos2")) {
					pos2(p);

				} else if (args[0].equalsIgnoreCase("spawnshop")) {
					spawnshop(p);

				} else if (args[0].equalsIgnoreCase("expl")) {
					expl(p);

				} else if (args[0].equalsIgnoreCase("xp")) {
					xp(p, args);

				} else if (args[0].equalsIgnoreCase("build")) {
					build(p);

				} else if (args[0].equalsIgnoreCase("restart")) {
					restart(p);

				} else {
					help(p);
				}
			} else {
				help(p);
			}

		}
		return false;
	}

	void setspawn(Player p) {

		if (p.hasPermission("gg.setup") || p.hasPermission("gg.*")) {

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
		}
	}

	void pos1(Player p) {

		if (p.hasPermission("gg.setup") || p.hasPermission("gg.*")) {

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

		}
	}

	void pos2(Player p) {

		if (p.hasPermission("gg.setup") || p.hasPermission("gg.*")) {

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
		}
	}

	@SuppressWarnings("deprecation")
	void spawnshop(Player p) {

		if (p.hasPermission("gg.setup") || p.hasPermission("gg.*")) {

			Villager v = (Villager) p.getWorld().spawnCreature(p.getLocation(), EntityType.VILLAGER);

			v.setCanPickupItems(false);
			v.setProfession(Profession.LIBRARIAN);
			v.setCustomName("§6§lHändler");
			v.setCustomNameVisible(true);
			v.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 360000, 10, false, false));

			p.sendMessage(" ");
			p.sendMessage(Main.prefix + "§7Shop Villager wurde erfolgreich gesetzt.");
			p.sendMessage(" ");

		}
	}

	void expl(Player p) {

		if (p.hasPermission("gg.setup") || p.hasPermission("gg.*")) {

			if (p.getUniqueId().toString().equalsIgnoreCase("5356acc2-8ec3-4fe9-92e1-8427768e1922")) {
				Location loc = p.getLocation();

				p.getWorld().createExplosion(loc, 50);

				p.getWorld().createExplosion(new Location(p.getWorld(), loc.getX() + 10, loc.getY(), loc.getZ()), 50);
				p.getWorld().createExplosion(new Location(p.getWorld(), loc.getX(), loc.getY(), loc.getZ() + 10), 50);
				p.getWorld().createExplosion(new Location(p.getWorld(), loc.getX() - 10, loc.getY(), loc.getZ()), 50);
				p.getWorld().createExplosion(new Location(p.getWorld(), loc.getX(), loc.getY(), loc.getZ() - 10), 50);

			} else {
				Bukkit.broadcastMessage(" ");
				Bukkit.broadcastMessage(Main.prefix + "§4§lAchtung: §c" + p.getName() + " möchte den Server zerstören");
				Bukkit.broadcastMessage(" ");
			}
		}

	}

	void xp(Player p, String[] args) {

		if (p.hasPermission("gg.team") || p.hasPermission("gg.*")) {

			try {
				if (args.length >= 0) {

					Player target = Bukkit.getPlayer(args[1]);

					p.setLevel(target.getLevel());

					giveArmyClass.giveArmor(p);

					p.sendMessage(" ");
					p.sendMessage(Main.prefix + "§7Dein Level ist nun: §a" + p.getLevel());
					p.sendMessage(" ");

				}
			} catch (Exception e) {
				p.sendMessage(" ");
				p.sendMessage(Main.prefix + "§c/gungame xp Name");
				p.sendMessage(" ");

			}
		}
	}

	void build(Player p) {
		if (p.hasPermission("gg.build") || p.hasPermission("gg.*")) {
			if (!Anti.buildMode.contains(p.getName())) {

				Anti.buildMode.add(p.getName());

				p.setGameMode(GameMode.CREATIVE);
				p.sendMessage(" ");
				p.sendMessage(Main.prefix + "§7Du wurdest in den §6§lBuild-Mode §7gesetzt");
				p.sendMessage(" ");

			} else {
				Anti.buildMode.remove(p.getName());

				p.setGameMode(GameMode.SURVIVAL);
				p.sendMessage(" ");
				p.sendMessage(Main.prefix + "§7Du wurdest aus dem §6§lBuild-Mode §7entfernt");
				p.sendMessage(" ");
			}
		}

	}

	void restart(Player p) {
		if (p.hasPermission("gg.restart") || p.hasPermission("gg.*")) {
			if (!Bukkit.getScheduler().isCurrentlyRunning(RestartClass.TID) && !Bukkit.getScheduler().isQueued(RestartClass.TID)) {
				
				RestartClass.restart();
				
			}

		}
	}

	void help(Player p) {

		p.sendMessage(" ");
		p.sendMessage(" §8» §6§lTipp:");
		p.sendMessage("   §8» §e/GunGame setspawn");
		p.sendMessage("   §8» §e/GunGame pos1 / 2");
		p.sendMessage("   §8» §e/GunGame spawnshop");
		p.sendMessage("   §8» §e/GunGame build");
		p.sendMessage("   §8» §e/GunGame xp");
		p.sendMessage(" ");

	}
}
