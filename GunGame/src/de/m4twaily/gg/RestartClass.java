package de.m4twaily.gg;

import org.bukkit.Bukkit;

public class RestartClass {

	public static int TID;

	public static void restart() {

		TID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.main, new Runnable() {
			int idx = 10;

			public void run() {
				if (idx > 0) {

					Bukkit.broadcastMessage(Main.prefix + "§c§lDer Server restartet in " + idx + " Sekunden");

				} else if (idx == 0) {

					Bukkit.getScheduler().cancelTask(TID);
					Bukkit.shutdown();

				}
				idx--;

			}
		}, 0L, 20L);
	}
}
