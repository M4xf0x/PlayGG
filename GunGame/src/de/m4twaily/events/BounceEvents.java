package de.m4twaily.events;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.util.Vector;

import de.m4twaily.gg.Main;

public class BounceEvents implements Listener {

	@EventHandler
	public void onMoveBounce(PlayerMoveEvent e) {
		Player p = e.getPlayer();
		Location loc = p.getLocation();

		if (p.getWorld() == Bukkit.getWorld(Main.main.getConfig().getString("Config.world")))
			if (!p.isSneaking()) {
				if (loc.add(0, -1, 0).getBlock().getType() == Material.WOOL) {
					if (loc.add(0, -1, 0).getBlock().getType() == Material.GOLD_BLOCK) {
						Vector v = p.getLocation().getDirection().multiply(0.1).setY(1);

						p.setVelocity(v);

					}
				}
			}

	}

	@EventHandler
	public void onFallDmg(EntityDamageEvent e) {
		if (e.getEntity().getWorld() == Bukkit.getWorld(Main.main.getConfig().getString("Config.world"))) {
			if (e.getCause() == DamageCause.FALL) {
				e.setCancelled(true);

			}
		}
	}
}
