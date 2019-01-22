package de.m4twaily.events;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.event.player.PlayerAchievementAwardedEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.weather.ThunderChangeEvent;
import org.bukkit.event.weather.WeatherChangeEvent;

import de.m4twaily.gg.Main;

public class Anti implements Listener {

	public static ArrayList<String> buildMode = new ArrayList<>();

	@EventHandler
	public void onHunger(FoodLevelChangeEvent e) {
		if (e.getEntity().getLocation().getWorld() == Bukkit
				.getWorld(Main.main.getConfig().getString("Config.world"))) {
			e.setCancelled(true);
		}
	}

	@EventHandler
	public void onRain(WeatherChangeEvent e) {
		if (e.getWorld() == Bukkit.getWorld(Main.main.getConfig().getString("Config.world"))) {
			if (e.toWeatherState()) {
				e.setCancelled(true);
			}
		}
	}

	@EventHandler
	public void onThunder(ThunderChangeEvent e) {
		if (e.getWorld() == Bukkit.getWorld(Main.main.getConfig().getString("Config.world"))) {
			if (e.toThunderState()) {
				e.setCancelled(true);
			}
		}
	}

	@EventHandler
	public void onBuild(BlockPlaceEvent e) {
		if (e.getPlayer() != null) {
			Player p = e.getPlayer();

			if (p.getGameMode() == GameMode.CREATIVE && buildMode.contains(p.getName())) {

			} else {
				e.setCancelled(true);
			}
		}
	}

	@EventHandler
	public void onBreak(BlockBreakEvent e) {
		if (e.getPlayer() != null) {
			Player p = e.getPlayer();

			if (p.getGameMode() == GameMode.CREATIVE && buildMode.contains(p.getName())) {

			} else {
				e.setCancelled(true);
			}
		}
	}

	@EventHandler
	public void onPlayerDrop(PlayerDropItemEvent e) {
		Player p = e.getPlayer();

		if (p.getGameMode() == GameMode.CREATIVE && buildMode.contains(p.getName())) {

		} else {
			e.setCancelled(true);
		}
	}

	@EventHandler
	public void onInvDrag(InventoryDragEvent e) {
		if (e.getWhoClicked().getLocation().getWorld() == Bukkit
				.getWorld(Main.main.getConfig().getString("Config.world"))) {
			Player p = (Player) e.getWhoClicked();

			if (p.getGameMode() == GameMode.CREATIVE && buildMode.contains(p.getName())) {

			} else {
				e.setCancelled(true);
			}
		}
	}

	@EventHandler
	public void onAch(PlayerAchievementAwardedEvent e) {
		if (e.getPlayer().getLocation().getWorld() == Bukkit
				.getWorld(Main.main.getConfig().getString("Config.world"))) {
			e.setCancelled(true);
		}
	}

	@EventHandler
	public void onExpl(EntityExplodeEvent e) {
		if (e.getEntity().getLocation().getWorld() == Bukkit
				.getWorld(Main.main.getConfig().getString("Config.world"))) {
			if (e.getEntityType() == EntityType.PRIMED_TNT) {
				e.blockList().clear();
			}
		}
	}

	@EventHandler
	public void onEntSpawn(EntitySpawnEvent e) {
		if (e.getEntity().getLocation().getWorld() == Bukkit
				.getWorld(Main.main.getConfig().getString("Config.world"))) {
			if (e.getEntityType() == EntityType.ARMOR_STAND || e.getEntityType() == EntityType.VILLAGER
					|| e.getEntityType() == EntityType.PRIMED_TNT || e.getEntityType() == EntityType.PIG) {
				if (e.getEntityType() == EntityType.PIG) {
					if (e.getEntity().getName() != null) {

					} else {
						e.setCancelled(true);
					}
				}

			} else {
				e.setCancelled(true);
			}
		}
	}

}
