package de.m4twaily.events;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

import de.m4twaily.shop.ShopGUI;

public class SkullEvents implements Listener {

	@EventHandler
	public void onClickSkull(PlayerInteractEvent e) {

		if (e.getClickedBlock().getType() == Material.SKULL) {
			Player p = e.getPlayer();

			ShopGUI.createGUI(p);

		}
	}
}
