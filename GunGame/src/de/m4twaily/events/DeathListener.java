package de.m4twaily.events;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import de.m4twaily.gg.Main;
import de.m4twaily.gg.ScoreboardNew;
import de.m4twaily.gg.giveArmyClass;
import de.m4twaily.shop.ShopEvents;

public class DeathListener implements Listener {

	@EventHandler(priority = EventPriority.HIGHEST)
	public void onDeathKnockit(PlayerDeathEvent e) {

		final Player p = e.getEntity();
		Player h = e.getEntity().getKiller();

		e.getDrops().clear();

		Bukkit.getScheduler().scheduleSyncDelayedTask(Main.main, new Runnable() {

			@Override
			public void run() {
				p.spigot().respawn();
			}
		}, 5);

		e.setDeathMessage(null);
		if (h != null) {
			if (p != h) {
				p.sendMessage(Main.prefix + "§7Du wurdest von§6 " + h.getName() + " §cgekillt!");
				h.sendMessage(Main.prefix + "§7Du hast §6" + p.getName() + " §agekillt!");
				h.giveExpLevels(1);
				h.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 20, 20));

			}
		}
	}

	@EventHandler
	public void onRespawnSendChest(PlayerRespawnEvent e) {
		final Player p = e.getPlayer();
		int x = Main.main.getConfig().getInt("Spawn.x");
		int y = Main.main.getConfig().getInt("Spawn.y");
		int z = Main.main.getConfig().getInt("Spawn.z");
		World w = Bukkit.getWorld(Main.main.getConfig().getString("Config.world"));
		final Location loc = new Location(w, x, y, z);

		e.setRespawnLocation(loc);

		Bukkit.getScheduler().scheduleSyncDelayedTask(Main.main, new Runnable() {

			@Override
			public void run() {
				ScoreboardNew.doScoreboard(p);
				giveArmyClass.giveArmor(p);

				ItemStack ChestItemStack = new ItemStack(Material.CHEST, 1);
				ItemMeta ChestMeta = ChestItemStack.getItemMeta();

				ChestMeta.setDisplayName("§6§lSHOP");
				ChestItemStack.setItemMeta(ChestMeta);
				p.getInventory().setItem(8, ChestItemStack);

				if (!ShopEvents.feather.contains(p.getName())) {
					p.setLevel(p.getLevel() / 2);

					if (p.getLevel() == 0) {
						p.setLevel(1);
					}

				} else {
					ShopEvents.feather.remove(p.getName());
				}
			}
		}, 5);

	}
}