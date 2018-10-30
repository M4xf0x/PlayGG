package de.m4twaily.cs;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import de.m4twaily.cmd.MoneyCMD;
import de.m4twaily.cmd.PayCMD;
import de.m4twaily.mysql.MySQL;

public class Main extends JavaPlugin {

	public static String prefix;
	public static Main main;

	public void onEnable() {
		main = this;
		loadConfig();
		doMySQL();

		PluginManager pm = Bukkit.getPluginManager();

		pm.registerEvents(new Events(), this);
		this.getCommand("money").setExecutor(new MoneyCMD());
		this.getCommand("pay").setExecutor(new PayCMD());
	}

	public void loadConfig() {
		getConfig().options().copyDefaults(true);
		saveConfig();

		prefix = getConfig().getString("Config.prefix").replaceAll("&", "§") + " §8» ";
	}

	public void doMySQL() {
		try {
			MySQL.connect();

			PreparedStatement ps = MySQL.getConnection()
					.prepareStatement("CREATE TABLE IF NOT EXISTS money (UUID VARCHAR(100),Money INT(100))");

			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}