package de.m4twaily.rdevents;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

public class Boost {

	static void all() {
		for (Player all : Bukkit.getOnlinePlayers()) {

			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage("§6§lRandomEvent §8» §eJumpBoost");
			Bukkit.broadcastMessage(" ");

			Vector v = new Vector(1, 5, 0);

			all.setVelocity(v);

		}
	}
}
