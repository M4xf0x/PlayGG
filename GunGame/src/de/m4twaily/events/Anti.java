package de.m4twaily.events;

import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.event.player.PlayerAchievementAwardedEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.weather.ThunderChangeEvent;
import org.bukkit.event.weather.WeatherChangeEvent;

public class Anti implements Listener {

	@EventHandler
	public void onHunger(FoodLevelChangeEvent e) {
		e.setCancelled(true);
	}

	@EventHandler
	public void onRain(WeatherChangeEvent e) {
		if (e.toWeatherState()) {
			e.setCancelled(true);
		}
	}

	@EventHandler
	public void onThunder(ThunderChangeEvent e) {
		if (e.toThunderState()) {
			e.setCancelled(true);
		}
	}

	@EventHandler
	public void onBuild(BlockPlaceEvent e) {
		if (e.getPlayer() != null) {
			Player p = e.getPlayer();

			if (p.getGameMode() == GameMode.CREATIVE && p.hasPermission("eg.build")) {

			} else {
				e.setCancelled(true);
			}
		}
	}

	@EventHandler
	public void onBreak(BlockBreakEvent e) {
		if (e.getPlayer() != null) {
			Player p = e.getPlayer();

			if (p.getGameMode() == GameMode.CREATIVE && p.hasPermission("eg.build")) {

			} else {
				e.setCancelled(true);
			}
		}
	}

	@EventHandler
	public void onPlayerDrop(PlayerDropItemEvent e) {
		Player p = e.getPlayer();

		if (p.getGameMode() == GameMode.CREATIVE && p.hasPermission("eg.build")) {

		} else {
			e.setCancelled(true);
		}
	}

	@EventHandler
	public void onInvDrag(InventoryDragEvent e) {
		Player p = (Player) e.getWhoClicked();

		if (p.getGameMode() == GameMode.CREATIVE && p.hasPermission("eg.build")) {

		} else {
			e.setCancelled(true);
		}
	}

	@EventHandler
	public void onAch(PlayerAchievementAwardedEvent e) {
		e.setCancelled(true);
	}

}
