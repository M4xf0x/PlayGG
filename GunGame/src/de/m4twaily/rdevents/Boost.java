package de.m4twaily.rdevents;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

import de.m4twaily.gg.Main;

public class Boost {

	static void all() {

		Bukkit.broadcastMessage(" ");
		Bukkit.broadcastMessage("§6§lRandomEvent §8» §eJumpBoost");
		Bukkit.broadcastMessage(" ");

		for (Player all : Bukkit.getOnlinePlayers()) {
			if (all.getWorld() == Bukkit.getWorld(Main.main.getConfig().getString("Config.world"))) {
				Vector v = new Vector(1, 5, 0);

				all.setVelocity(v);

			}
		}
	}
}
