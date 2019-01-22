package de.m4twaily.rdevents;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import de.m4twaily.gg.Main;

public class LevelUp {

	static void all() {

		Bukkit.broadcastMessage(" ");
		Bukkit.broadcastMessage("§6§lRandomEvent §8» §eLevelUp");
		Bukkit.broadcastMessage(" ");

		for (Player all : Bukkit.getOnlinePlayers()) {
			if (all.getWorld() == Bukkit.getWorld(Main.main.getConfig().getString("Config.world"))) {
				all.setLevel(all.getLevel() + 1);

			}
		}
	}
}
