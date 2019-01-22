package de.m4twaily.events;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import de.m4twaily.gg.Main;
import de.m4twaily.shop.ShopGUI;

public class SkullEvents implements Listener {

	@EventHandler
	public void onClickSkull(PlayerInteractEvent e) {

		if (e.getPlayer().getWorld() == Bukkit.getWorld(Main.main.getConfig().getString("Config.world"))) {

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

			if (e.getClickedBlock() != null && e.getClickedBlock().getType() != null) {
				if (e.getClickedBlock().getType() == Material.SKULL && e.getAction() == Action.RIGHT_CLICK_BLOCK) {
					Player p = e.getPlayer();
					Block b = e.getClickedBlock();

					if (b.getLocation().getBlockX() >= loc1.getBlockX()
							&& b.getLocation().getBlockX() <= loc2.getBlockX()
							&& b.getLocation().getBlockZ() >= loc1.getBlockZ()
							&& b.getLocation().getBlockZ() <= loc2.getBlockZ()) {

						ShopGUI.createGUI(p);
					}
				}
			}
		}
	}
}
