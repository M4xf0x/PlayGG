package de.m4twaily.events;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.util.Vector;

public class BounceEvents implements Listener {

	@EventHandler
	public void onMoveBounce(PlayerMoveEvent e) {
		Player p = e.getPlayer();
		Location loc = p.getLocation();
		Vector v = new Vector(0, 1, 0);

		if (!p.isSneaking()) {
			if (loc.add(0, -1, 0).getBlock().getType() == Material.WOOL) {
				if (loc.add(0, -1, 0).getBlock().getType() == Material.GOLD_BLOCK) {
					p.setVelocity(v);

				}
			}
		}

	}

	@EventHandler
	public void onFallDmg(EntityDamageEvent e) {
		if (e.getCause() == DamageCause.FALL) {
			e.setCancelled(true);

		}
	}
}
