package de.m4twaily.gg;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import de.m4twaily.commands.GunGame;
import de.m4twaily.events.Anti;
import de.m4twaily.events.BounceEvents;
import de.m4twaily.events.DamageProtectionEvent;
import de.m4twaily.events.DeathListener;
import de.m4twaily.events.ExpEvent;
import de.m4twaily.events.JoinQuit;
import de.m4twaily.events.MoveProtection;
import de.m4twaily.shop.AngelEvents;
import de.m4twaily.shop.GunEvents;
import de.m4twaily.shop.ShopEvents;

public class Main extends JavaPlugin {
	public static String prefix;
	public static Main main;

	public void onEnable() {
		main = this;
		loadConfig();

		PluginManager pm = Bukkit.getPluginManager();

		pm.registerEvents(new DeathListener(), this);
		pm.registerEvents(new JoinQuit(), this);
		pm.registerEvents(new Anti(), this);
		pm.registerEvents(new ExpEvent(), this);
		pm.registerEvents(new MoveProtection(), this);
		pm.registerEvents(new ShopEvents(), this);
		pm.registerEvents(new BounceEvents(), this);
		pm.registerEvents(new DamageProtectionEvent(), this);
		pm.registerEvents(new GunEvents(), this);
		pm.registerEvents(new AngelEvents(), this);
		this.getCommand("gungame").setExecutor(new GunGame());
	}

	public void loadConfig() {
		getConfig().options().copyDefaults(true);
		saveConfig();

		prefix = getConfig().getString("Config.prefix").replaceAll("&", "§");
	}
}
