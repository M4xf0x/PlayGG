package de.m4twaily.shop;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.event.player.PlayerFishEvent.State;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import de.m4twaily.gg.Main;

public class AngelEvents implements Listener {

	@EventHandler
	public void onPlayerFish(PlayerFishEvent e) {
		Player p = e.getPlayer();

		int r = (int) (Math.random() * 11);

		if (e.getState() == State.CAUGHT_FISH) {
			e.setCancelled(true);

			if (p.getItemInHand().getDurability() <= 65) {

				switch (r) {

				case 0:
				case 1:
				case 2:
				case 3:
				case 4:
					ItemStack ItemStack0 = new ItemStack(Material.RAW_FISH, 1);
					p.getInventory().addItem(ItemStack0);
					p.sendMessage(" ");
					p.sendMessage(Main.prefix
							+ "§7Du hast einen Fisch gefangen! Verkaufe ihn beim §6Händler§7, um Level zu erhalten.");

					break;
				case 5:
				case 6:
				case 7:
					ItemStack ItemStack2 = new ItemStack(Material.GOLD_BOOTS, 1);
					ItemMeta Meta2 = ItemStack2.getItemMeta();

					Meta2.setDisplayName("§6§lStufe I");
					ItemStack2.setItemMeta(Meta2);
					ItemStack2.setDurability((short) 90);
					p.getInventory().addItem(ItemStack2);
					p.sendMessage(" ");
					p.sendMessage(Main.prefix
							+ "§7Du hast §6§lGold-Schuhe der Stufe I §7geangelt! Verkaufe ihn beim §6Händler§7, um Level zu erhalten.");
					p.sendMessage(" ");
					break;
				case 8:
				case 9:
					ItemStack ItemStack3 = new ItemStack(Material.GOLD_BOOTS, 1);
					ItemMeta Meta3 = ItemStack3.getItemMeta();

					Meta3.setDisplayName("§6§lStufe II");
					ItemStack3.setItemMeta(Meta3);
					ItemStack3.setDurability((short) 60);
					p.sendMessage(" ");
					p.sendMessage(Main.prefix
							+ "§7Du hast §6§lGold-Schuhe der Stufe II §7geangelt! Verkaufe ihn beim §6Händler§7, um Level zu erhalten.");
					p.sendMessage(" ");
					p.getInventory().addItem(ItemStack3);
					break;
				case 10:
					ItemStack ItemStack4 = new ItemStack(Material.GOLD_BOOTS, 1);
					ItemMeta Meta4 = ItemStack4.getItemMeta();

					Meta4.setDisplayName("§6§lStufe III");
					ItemStack4.setItemMeta(Meta4);
					ItemStack4.setDurability((short) 30);
					p.sendMessage(" ");
					p.sendMessage(Main.prefix
							+ "§7Du hast §6§lGold-Schuhe der Stufe III §7geangelt! Verkaufe ihn beim §6Händler§7, um Level zu erhalten.");
					p.sendMessage(" ");
					p.getInventory().addItem(ItemStack4);
					break;

				}
				ItemStack is = p.getItemInHand();
				is.setDurability((short) (is.getDurability() + 22));
			} else {
				p.setItemInHand(null);
			}
		}
	}

	@EventHandler
	public void onVillagerHit(EntityDamageByEntityEvent e) {

		if (e.getEntityType() == EntityType.VILLAGER) {
			if (e.getEntity().getCustomName().equalsIgnoreCase("§6§lHändler")) {
				if (e.getDamager() instanceof Player) {
					Player h = (Player) e.getDamager();

					if (h.getGameMode() != GameMode.CREATIVE) {
						e.setCancelled(true);
					}
				}
			}
		}
	}

	@EventHandler
	public void onEntitySpasti(PlayerInteractEntityEvent e) {
		if (e.getRightClicked().getType() == EntityType.VILLAGER) {
			if (e.getRightClicked().getCustomName().equalsIgnoreCase("§6§lHändler")) {
				Player p = e.getPlayer();
				e.setCancelled(true);

				if (p.getItemInHand() != null && p.getItemInHand().getType() != null
						&& p.getItemInHand().getItemMeta() != null) {

					if (p.getItemInHand().getType() == Material.RAW_FISH) {
						p.setLevel(p.getLevel() + 1);
						p.sendMessage(" ");
						p.sendMessage(Main.prefix + "§7Danke für deinen Verkauf!");
						p.sendMessage("  §8» §a+1 §7Level");
						p.sendMessage(" ");

						if (p.getItemInHand().getAmount() > 1) {
							p.getItemInHand().setAmount(p.getItemInHand().getAmount() - 1);
							p.updateInventory();

						} else {
							p.setItemInHand(null);
							p.updateInventory();
						}

					} else if (p.getItemInHand().getItemMeta().getDisplayName() != null
							&& p.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase("§6§lStufe I")) {
						p.setLevel(p.getLevel() + 2);
						p.sendMessage(" ");
						p.sendMessage(Main.prefix + "§7Danke für deinen Verkauf!");
						p.sendMessage("  §8» §a+2 §7Level");
						p.sendMessage(" ");
						p.setItemInHand(null);

					} else if (p.getItemInHand().getItemMeta().getDisplayName() != null
							&& p.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase("§6§lStufe II")) {
						p.setLevel(p.getLevel() + 3);
						p.sendMessage(" ");
						p.sendMessage(Main.prefix + "§7Danke für deinen Verkauf!");
						p.sendMessage("  §8» §a+3 §7Level");
						p.sendMessage(" ");
						p.setItemInHand(null);

					} else if (p.getItemInHand().getItemMeta().getDisplayName() != null
							&& p.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase("§6§lStufe III")) {
						p.setLevel(p.getLevel() + 4);
						p.sendMessage(" ");
						p.sendMessage(Main.prefix + "§7Danke für deinen Verkauf!");
						p.sendMessage("  §8» §a+4 §7Level");
						p.sendMessage(" ");
						p.setItemInHand(null);
					} else {
						p.sendMessage(" ");
						p.sendMessage(Main.prefix + "§7Kaufe dir eine Angel, um zu angeln");
						p.sendMessage(" ");
						
					}
				} else {
					p.sendMessage(" ");
					p.sendMessage(Main.prefix + "§7Kaufe dir eine Angel, um zu angeln");
					p.sendMessage(" ");
					
				}
			}
		}
	}

}
