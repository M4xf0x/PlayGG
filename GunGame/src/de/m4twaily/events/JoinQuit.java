package de.m4twaily.events;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import de.m4twaily.gg.Main;
import de.m4twaily.gg.ScoreboardNew;
import de.m4twaily.gg.giveArmyClass;
import ru.tehkode.permissions.bukkit.PermissionsEx;

public class JoinQuit implements Listener {

	@SuppressWarnings("deprecation")
	@EventHandler
	public void onQuit(PlayerQuitEvent e) {
		Player p = e.getPlayer();

		for (Player a : Bukkit.getOnlinePlayers()) {
			ScoreboardNew.doScoreboard(a);
		}

		if (PermissionsEx.getUser(p).getGroups()[0].getName().equalsIgnoreCase("Owner")) {
			e.setQuitMessage(Main.prefix + "§4§lOwner §8| §4§l" + p.getName() + " §7ist §cgeleaved!");

			// Admin
		} else if (PermissionsEx.getUser(p).getGroups()[0].getName().equalsIgnoreCase("Admin")) {
			e.setQuitMessage(Main.prefix + "§4§lAdmin §8| §4§l" + p.getName() + " §7ist §cgeleaved!");

			// Dev
		} else if (PermissionsEx.getUser(p).getGroups()[0].getName().equalsIgnoreCase("SrDev")) {
			e.setQuitMessage(Main.prefix + "§b§lSrDeveloper §8| §b§l" + p.getName() + " §7ist §cgeleaved!");

		} else if (PermissionsEx.getUser(p).getGroups()[0].getName().equalsIgnoreCase("Dev")) {
			e.setQuitMessage(Main.prefix + "§b§lDeveloper §8| §b§l" + p.getName() + " §7ist §cgeleaved!");

		} else if (PermissionsEx.getUser(p).getGroups()[0].getName().equalsIgnoreCase("JrDev")) {
			e.setQuitMessage(Main.prefix + "§b§lJrDeveloper §8| §b§l" + p.getName() + " §7ist §cgeleaved!");

			// Mod
		} else if (PermissionsEx.getUser(p).getGroups()[0].getName().equalsIgnoreCase("SrMod")) {
			e.setQuitMessage(Main.prefix + "§c§lSrModerator §8| §c§l" + p.getName() + " §7ist §cgeleaved!");

		} else if (PermissionsEx.getUser(p).getGroups()[0].getName().equalsIgnoreCase("Mod")) {
			e.setQuitMessage(Main.prefix + "§c§lModerator §8| §c§l" + p.getName() + " §7ist §cgeleaved!");

			// Sup
		} else if (PermissionsEx.getUser(p).getGroups()[0].getName().equalsIgnoreCase("SrSup")) {
			e.setQuitMessage(Main.prefix + "§9§lSrSupporter §8| §9§l" + p.getName() + " §7ist §cgeleaved!");

		} else if (PermissionsEx.getUser(p).getGroups()[0].getName().equalsIgnoreCase("Sup")) {
			e.setQuitMessage(Main.prefix + "§9§lSupporter §8| §9§l" + p.getName() + " §7ist §cgeleaved!");

		} else if (PermissionsEx.getUser(p).getGroups()[0].getName().equalsIgnoreCase("JrSup")) {
			e.setQuitMessage(Main.prefix + "§9§lJrSupporter §8| §9§l" + p.getName() + " §7ist §cgeleaved!");

			// Builder
		} else if (PermissionsEx.getUser(p).getGroups()[0].getName().equalsIgnoreCase("SrBuilder")) {
			e.setQuitMessage(Main.prefix + "§2§lSrBuilder §8| §2§l" + p.getName() + " §7ist §cgeleaved!");

		} else if (PermissionsEx.getUser(p).getGroups()[0].getName().equalsIgnoreCase("Builder")) {
			e.setQuitMessage(Main.prefix + "§2§lBuilder §8| §2§l" + p.getName() + " §7ist §cgeleaved!");

		} else if (PermissionsEx.getUser(p).getGroups()[0].getName().equalsIgnoreCase("JrBuilder")) {
			e.setQuitMessage(Main.prefix + "§2§lJrBuilder §8| §2§l" + p.getName() + " §7ist §cgeleaved!");

			// players
		} else if (PermissionsEx.getUser(p).getGroups()[0].getName().equalsIgnoreCase("YT")) {
			e.setQuitMessage(Main.prefix + "§5YouTuber §8| §5" + p.getName() + " §7ist §cgeleaved!");

		} else if (PermissionsEx.getUser(p).getGroups()[0].getName().equalsIgnoreCase("Diamond")) {
			e.setQuitMessage(Main.prefix + "§bDiamond §8| §b" + p.getName() + " §7ist §cgeleaved!");

		} else if (PermissionsEx.getUser(p).getGroups()[0].getName().equalsIgnoreCase("Emerald")) {
			e.setQuitMessage(Main.prefix + "§aEmerald §8| §a" + p.getName() + " §7ist §cgeleaved!");

		} else if (PermissionsEx.getUser(p).getGroups()[0].getName().equalsIgnoreCase("Premium")) {
			e.setQuitMessage(Main.prefix + "§6Premium §8| §6" + p.getName() + " §7ist §cgeleaved!");

		} else {
			e.setQuitMessage(Main.prefix + "§7" + p.getName() + " §7ist §cgeleaved!");
		}
	}

	@SuppressWarnings("deprecation")
	@EventHandler
	public void onJoinSendChest(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		int x = Main.main.getConfig().getInt("Spawn.x");
		int y = Main.main.getConfig().getInt("Spawn.y");
		int z = Main.main.getConfig().getInt("Spawn.z");
		World w = Bukkit.getWorld(Main.main.getConfig().getString("Config.world"));
		Location loc = new Location(w, x, y, z);

		ItemStack ChestItemStack = new ItemStack(Material.CHEST, 1);
		ItemMeta ChestMeta = ChestItemStack.getItemMeta();

		ChestMeta.setDisplayName("§6§lSHOP");
		ChestItemStack.setItemMeta(ChestMeta);
		p.getInventory().setItem(8, ChestItemStack);

		for (Player a : Bukkit.getOnlinePlayers()) {
			ScoreboardNew.doScoreboard(a);
		}
		
		p.teleport(loc);

		giveArmyClass.giveArmor(p);

		if (PermissionsEx.getUser(p).getGroups()[0].getName().equalsIgnoreCase("Owner")) {
			e.setJoinMessage(Main.prefix + "§4§lOwner §8| §4§l" + p.getName() + " §7ist §agejoint!");

			// Admin
		} else if (PermissionsEx.getUser(p).getGroups()[0].getName().equalsIgnoreCase("Admin")) {
			e.setJoinMessage(Main.prefix + "§4§lAdmin §8| §4§l" + p.getName() + " §7ist §agejoint!");

			// Dev
		} else if (PermissionsEx.getUser(p).getGroups()[0].getName().equalsIgnoreCase("SrDev")) {
			e.setJoinMessage(Main.prefix + "§b§lSrDeveloper §8| §b§l" + p.getName() + " §7ist §agejoint!");

		} else if (PermissionsEx.getUser(p).getGroups()[0].getName().equalsIgnoreCase("Dev")) {
			e.setJoinMessage(Main.prefix + "§b§lDeveloper §8| §b§l" + p.getName() + " §7ist §agejoint!");

		} else if (PermissionsEx.getUser(p).getGroups()[0].getName().equalsIgnoreCase("JrDev")) {
			e.setJoinMessage(Main.prefix + "§b§lJrDeveloper §8| §b§l" + p.getName() + " §7ist §agejoint!");

			// Mod
		} else if (PermissionsEx.getUser(p).getGroups()[0].getName().equalsIgnoreCase("SrMod")) {
			e.setJoinMessage(Main.prefix + "§c§lSrModerator §8| §c§l" + p.getName() + " §7ist §agejoint!");

		} else if (PermissionsEx.getUser(p).getGroups()[0].getName().equalsIgnoreCase("Mod")) {
			e.setJoinMessage(Main.prefix + "§c§lModerator §8| §c§l" + p.getName() + " §7ist §agejoint!");

			// Sup
		} else if (PermissionsEx.getUser(p).getGroups()[0].getName().equalsIgnoreCase("SrSup")) {
			e.setJoinMessage(Main.prefix + "§9§lSrSupporter §8| §9§l" + p.getName() + " §7ist §agejoint!");

		} else if (PermissionsEx.getUser(p).getGroups()[0].getName().equalsIgnoreCase("Sup")) {
			e.setJoinMessage(Main.prefix + "§9§lSupporter §8| §9§l" + p.getName() + " §7ist §agejoint!");

		} else if (PermissionsEx.getUser(p).getGroups()[0].getName().equalsIgnoreCase("JrSup")) {
			e.setJoinMessage(Main.prefix + "§9§lJrSupporter §8| §9§l" + p.getName() + " §7ist §agejoint!");

			// Builder
		} else if (PermissionsEx.getUser(p).getGroups()[0].getName().equalsIgnoreCase("SrBuilder")) {
			e.setJoinMessage(Main.prefix + "§2§lSrBuilder §8| §2§l" + p.getName() + " §7ist §agejoint!");

		} else if (PermissionsEx.getUser(p).getGroups()[0].getName().equalsIgnoreCase("Builder")) {
			e.setJoinMessage(Main.prefix + "§2§lBuilder §8| §2§l" + p.getName() + " §7ist §agejoint!");

		} else if (PermissionsEx.getUser(p).getGroups()[0].getName().equalsIgnoreCase("JrBuilder")) {
			e.setJoinMessage(Main.prefix + "§2§lJrBuilder §8| §2§l" + p.getName() + " §7ist §agejoint!");

			// players
		} else if (PermissionsEx.getUser(p).getGroups()[0].getName().equalsIgnoreCase("YT")) {
			e.setJoinMessage(Main.prefix + "§5YouTuber §8| §5" + p.getName() + " §7ist §agejoint!");

		} else if (PermissionsEx.getUser(p).getGroups()[0].getName().equalsIgnoreCase("Diamond")) {
			e.setJoinMessage(Main.prefix + "§bDiamond §8| §b" + p.getName() + " §7ist §agejoint!");

		} else if (PermissionsEx.getUser(p).getGroups()[0].getName().equalsIgnoreCase("Emerald")) {
			e.setJoinMessage(Main.prefix + "§aEmerald §8| §a" + p.getName() + " §7ist §agejoint!");

		} else if (PermissionsEx.getUser(p).getGroups()[0].getName().equalsIgnoreCase("Premium")) {
			e.setJoinMessage(Main.prefix + "§6Premium §8| §6" + p.getName() + " §7ist §agejoint!");

		} else {
			e.setJoinMessage(Main.prefix + "§7" + p.getName() + " §7ist §agejoint!");
		}

		if (p.getLevel() == 0) {
			p.setLevel(1);
		}
	}
}
