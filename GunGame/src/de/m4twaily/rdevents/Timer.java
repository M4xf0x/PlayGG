package de.m4twaily.rdevents;

import org.bukkit.Bukkit;

import de.m4twaily.gg.Main;

public class Timer {

	public int TID;

	public Timer() {

		TID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.main, new Runnable() {

			@Override
			public void run() {
				if (Bukkit.getOnlinePlayers().size() >= 1) {

					System.out.println("15 Minutes over");

					int rd = (int) (Math.random() * 3);

					switch (rd) {

					case 0:
						LevelUp.all();
						break;
					case 1:
						Boost.all();
						break;
					case 2:
						TNT.all();
						break;

					}
				}
			}

		}, 0L, 18000L);

	}

}
