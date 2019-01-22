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
	
	//Disabled
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onQuit(PlayerQuitEvent e) {
		Player p = e.getPlayer();
		String s = "§7[§c-§7] §8» ";

		for (Player a : Bukkit.getOnlinePlayers()) {
			ScoreboardNew.doScoreboard(a);
		}

		if (PermissionsEx.getUser(p).getGroups()[0].getName().equalsIgnoreCase("Owner")) {
			e.setQuitMessage(s + "§4§lOwner §8| §4§l" + p.getName());

			// Admin
		} else if (PermissionsEx.getUser(p).getGroups()[0].getName().equalsIgnoreCase("Admin")) {
			e.setQuitMessage(s + "§4§lAdmin §8| §4§l" + p.getName());

			// Dev
		} else if (PermissionsEx.getUser(p).getGroups()[0].getName().equalsIgnoreCase("SrDev")) {
			e.setQuitMessage(s + "§b§lSrDev §8| §b§l" + p.getName());

		} else if (PermissionsEx.getUser(p).getGroups()[0].getName().equalsIgnoreCase("Dev")) {
			e.setQuitMessage(s + "§b§lDev §8| §b§l" + p.getName());

		} else if (PermissionsEx.getUser(p).getGroups()[0].getName().equalsIgnoreCase("JrDev")) {
			e.setQuitMessage(s + "§b§lJrDev §8| §b§l" + p.getName());

			// Mod
		} else if (PermissionsEx.getUser(p).getGroups()[0].getName().equalsIgnoreCase("SrMod")) {
			e.setQuitMessage(s + "§c§lSrMod §8| §c§l" + p.getName());

		} else if (PermissionsEx.getUser(p).getGroups()[0].getName().equalsIgnoreCase("Mod")) {
			e.setQuitMessage(s + "§c§lMod §8| §c§l" + p.getName());

			// Sup
		} else if (PermissionsEx.getUser(p).getGroups()[0].getName().equalsIgnoreCase("SrSup")) {
			e.setQuitMessage(s + "§9§lSrSup §8| §9§l" + p.getName());

		} else if (PermissionsEx.getUser(p).getGroups()[0].getName().equalsIgnoreCase("Sup")) {
			e.setQuitMessage(s + "§9§lSup §8| §9§l" + p.getName());

		} else if (PermissionsEx.getUser(p).getGroups()[0].getName().equalsIgnoreCase("JrSup")) {
			e.setQuitMessage(s + "§9§lJrSup §8| §9§l" + p.getName());

			// Builder
		} else if (PermissionsEx.getUser(p).getGroups()[0].getName().equalsIgnoreCase("SrBuilder")) {
			e.setQuitMessage(s + "§2§lSrBuild §8| §2§l" + p.getName());

		} else if (PermissionsEx.getUser(p).getGroups()[0].getName().equalsIgnoreCase("Builder")) {
			e.setQuitMessage(s + "§2§lBuild §8| §2§l" + p.getName());

		} else if (PermissionsEx.getUser(p).getGroups()[0].getName().equalsIgnoreCase("JrBuilder")) {
			e.setQuitMessage(s + "§2§lJrBuild §8| §2§l" + p.getName());

			// players
		} else if (PermissionsEx.getUser(p).getGroups()[0].getName().equalsIgnoreCase("YT")) {
			e.setQuitMessage(s + "§5YouTuber §8| §5" + p.getName());

		} else if (PermissionsEx.getUser(p).getGroups()[0].getName().equalsIgnoreCase("Diamond")) {
			e.setQuitMessage(s + "§bDiamond §8| §b" + p.getName());

		} else if (PermissionsEx.getUser(p).getGroups()[0].getName().equalsIgnoreCase("Emerald")) {
			e.setQuitMessage(s + "§aEmerald §8| §a" + p.getName());

		} else if (PermissionsEx.getUser(p).getGroups()[0].getName().equalsIgnoreCase("Premium")) {
			e.setQuitMessage(s + "§6Premium §8| §6" + p.getName());

		} else {
			e.setQuitMessage(s + "§7" + p.getName());
		}
	}

	@SuppressWarnings("deprecation")
	@EventHandler
	public void onJoinSendChest(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		String s = "§7[§a+§7] §8» ";
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
		
		p.teleport(loc);

		for (Player a : Bukkit.getOnlinePlayers()) {
			ScoreboardNew.doScoreboard(a);
		}

		giveArmyClass.giveArmor(p);

		if (PermissionsEx.getUser(p).getGroups()[0].getName().equalsIgnoreCase("Owner")) {
			e.setJoinMessage(s + "§4§lOwner §8| §4§l" + p.getName());

			// Admin
		} else if (PermissionsEx.getUser(p).getGroups()[0].getName().equalsIgnoreCase("Admin")) {
			e.setJoinMessage(s + "§4§lAdmin §8| §4§l" + p.getName());

			// Dev
		} else if (PermissionsEx.getUser(p).getGroups()[0].getName().equalsIgnoreCase("SrDev")) {
			e.setJoinMessage(s + "§b§lSrDev §8| §b§l" + p.getName());

		} else if (PermissionsEx.getUser(p).getGroups()[0].getName().equalsIgnoreCase("Dev")) {
			e.setJoinMessage(s + "§b§lDev §8| §b§l" + p.getName());

		} else if (PermissionsEx.getUser(p).getGroups()[0].getName().equalsIgnoreCase("JrDev")) {
			e.setJoinMessage(s + "§b§lJrDev §8| §b§l" + p.getName());

			// Mod
		} else if (PermissionsEx.getUser(p).getGroups()[0].getName().equalsIgnoreCase("SrMod")) {
			e.setJoinMessage(s + "§c§lSrMod §8| §c§l" + p.getName());

		} else if (PermissionsEx.getUser(p).getGroups()[0].getName().equalsIgnoreCase("Mod")) {
			e.setJoinMessage(s + "§c§lMod §8| §c§l" + p.getName());

			// Sup
		} else if (PermissionsEx.getUser(p).getGroups()[0].getName().equalsIgnoreCase("SrSup")) {
			e.setJoinMessage(s + "§9§lSrSup §8| §9§l" + p.getName());

		} else if (PermissionsEx.getUser(p).getGroups()[0].getName().equalsIgnoreCase("Sup")) {
			e.setJoinMessage(s + "§9§lSup §8| §9§l" + p.getName());

		} else if (PermissionsEx.getUser(p).getGroups()[0].getName().equalsIgnoreCase("JrSup")) {
			e.setJoinMessage(s + "§9§lJrSup §8| §9§l" + p.getName());

			// Builder
		} else if (PermissionsEx.getUser(p).getGroups()[0].getName().equalsIgnoreCase("SrBuilder")) {
			e.setJoinMessage(s + "§2§lSrBuild §8| §2§l" + p.getName());

		} else if (PermissionsEx.getUser(p).getGroups()[0].getName().equalsIgnoreCase("Builder")) {
			e.setJoinMessage(s + "§2§lBuild §8| §2§l" + p.getName());

		} else if (PermissionsEx.getUser(p).getGroups()[0].getName().equalsIgnoreCase("JrBuilder")) {
			e.setJoinMessage(s + "§2§lJrBuil §8| §2§l" + p.getName());

			// players
		} else if (PermissionsEx.getUser(p).getGroups()[0].getName().equalsIgnoreCase("YT")) {
			e.setJoinMessage(s + "§5YouTuber §8| §5" + p.getName());

		} else if (PermissionsEx.getUser(p).getGroups()[0].getName().equalsIgnoreCase("Diamond")) {
			e.setJoinMessage(s + "§bDiamond §8| §b" + p.getName());

		} else if (PermissionsEx.getUser(p).getGroups()[0].getName().equalsIgnoreCase("Emerald")) {
			e.setJoinMessage(s + "§aEmerald §8| §a" + p.getName());

		} else if (PermissionsEx.getUser(p).getGroups()[0].getName().equalsIgnoreCase("Premium")) {
			e.setJoinMessage(s + "§6Premium §8| §6" + p.getName());

		} else {
			e.setJoinMessage(s + "§7" + p.getName());
		}

		if (p.getLevel() == 0) {
			p.setLevel(1);
		}
	}
}
