package de.m4twaily.rdevents;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class LevelUp {

	static void all() {
		for (Player all : Bukkit.getOnlinePlayers()) {

			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage("§6§lRandomEvent §8» §eLevelUp");
			Bukkit.broadcastMessage(" ");

			all.setLevel(all.getLevel() + 1);

		}
	}
}
