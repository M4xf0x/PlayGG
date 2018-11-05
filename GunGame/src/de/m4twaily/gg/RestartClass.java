package de.m4twaily.gg;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class RestartClass {

	public static int TID;

	public void startTimer() {

		Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.main, new Runnable() {

			@SuppressWarnings("deprecation")
			@Override
			public void run() {
				Calendar c = GregorianCalendar.getInstance();

				System.out.println(" ");
				System.out.println("Asking if its 0");
				System.out.println(" ");

				if (c.getTime().getHours() == 18) {

					restart();
					System.out.println(" ");
					System.out.println("Server restart by PlayGunGame");
					System.out.println(" ");
				}

			}
		}, 0L, 72000L);

	}

	public static void restart() {

		TID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.main, new Runnable() {
			int idx = 10;

			public void run() {
				if (idx > 0) {

					Bukkit.broadcastMessage(Main.prefix + "§c§lDer Server restartet in " + idx + " Sekunden");

				} else if (idx == 0) {

					Bukkit.getScheduler().cancelTask(TID);

					for (Player all : Bukkit.getOnlinePlayers()) {
						all.kickPlayer(
								"\n  §8» §c§lDer Server restartet \n §8» §7Er sollte in wenigen Minuten wieder erreichbar sein \n ");
					}

					Bukkit.shutdown();

				}
				idx--;

			}
		}, 0L, 20L);
	}
}
