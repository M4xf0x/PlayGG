package de.m4twaily.events;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class MoveProtection implements Listener {

	@EventHandler
	public void onMove(PlayerMoveEvent e) {
		Player p = e.getPlayer();

		if (p.getLocation().getBlock().getType() == Material.WATER
				|| p.getLocation().getBlock().getType() == Material.STATIONARY_WATER) {
			p.damage(40);
		}

	}

}
