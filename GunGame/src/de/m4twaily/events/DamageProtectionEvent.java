package de.m4twaily.events;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

import de.m4twaily.gg.Main;

public class DamageProtectionEvent implements Listener {

	@EventHandler
	public void onDamageSpawn(EntityDamageByEntityEvent e) {

		int x1 = Main.main.getConfig().getInt("Pos1.x");
		int y1 = Main.main.getConfig().getInt("Pos1.y");
		int z1 = Main.main.getConfig().getInt("Pos1.z");
		World w1 = Bukkit.getWorld(Main.main.getConfig().getString("Config.world"));
		Location loc1 = new Location(w1, x1, y1, z1);

		int x2 = Main.main.getConfig().getInt("Pos2.x");
		int y2 = Main.main.getConfig().getInt("Pos2.y");
		int z2 = Main.main.getConfig().getInt("Pos2.z");
		World w2 = Bukkit.getWorld(Main.main.getConfig().getString("Config.world"));
		Location loc2 = new Location(w2, x2, y2, z2);

		if (e.getDamager() instanceof Player && e.getEntity() instanceof Player) {
			Player p = (Player) e.getEntity();
			Player h = (Player) e.getDamager();

			if (p.getLocation().getBlockX() >= loc1.getBlockX() && p.getLocation().getBlockX() <= loc2.getBlockX()
					&& p.getLocation().getBlockZ() >= loc1.getBlockZ()
					&& p.getLocation().getBlockZ() <= loc2.getBlockZ()
					|| h.getLocation().getBlockX() >= loc1.getBlockX()
							&& h.getLocation().getBlockX() <= loc2.getBlockX()
							&& h.getLocation().getBlockZ() >= loc1.getBlockZ()
							&& h.getLocation().getBlockZ() <= loc2.getBlockZ()) {
				e.setCancelled(true);
			}
		}
	}

}
