package de.m4twaily.gg;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import de.m4twaily.commands.GunGame;
import de.m4twaily.commands.StatsCMD;
import de.m4twaily.events.Anti;
import de.m4twaily.events.BounceEvents;
import de.m4twaily.events.DamageProtectionEvent;
import de.m4twaily.events.DeathListener;
import de.m4twaily.events.ExpEvent;
import de.m4twaily.events.JoinQuit;
import de.m4twaily.events.MoveProtection;
import de.m4twaily.events.SkullEvents;
import de.m4twaily.mysql.MySQL;
import de.m4twaily.rdevents.Timer;
import de.m4twaily.shop.AngelEvents;
import de.m4twaily.shop.GunEvents;
import de.m4twaily.shop.ShopEvents;

public class Main extends JavaPlugin {
	public static String prefix;
	public static Main main;

	public void onEnable() {
		main = this;
		loadConfig();
		doMySQL();

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
		pm.registerEvents(new SkullEvents(), this);
		this.getCommand("gungame").setExecutor(new GunGame());
		this.getCommand("stats").setExecutor(new StatsCMD());
		
//		new RestartClass().startTimer();
		new Timer();
		
	}

	public void loadConfig() {
		getConfig().options().copyDefaults(true);
		saveConfig();

		prefix = getConfig().getString("Config.prefix").replaceAll("&", "§")+ " §8» " ;
	}
	
	public void doMySQL() {
		try {
			MySQL.connect();

			PreparedStatement ps = MySQL.getConnection()
					.prepareStatement("CREATE TABLE IF NOT EXISTS points (UUID VARCHAR(100),Kills INT(100),Deaths INT(100))");

			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
