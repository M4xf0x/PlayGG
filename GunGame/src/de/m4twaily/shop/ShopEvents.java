package de.m4twaily.shop;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import de.m4twaily.gg.Main;
import de.m4twaily.gg.giveArmyClass;

public class ShopEvents implements Listener {
	public static ArrayList<String> feather = new ArrayList<>();

	@EventHandler
	public void onPlayerInteract(PlayerInteractEvent e) {
		Player p = e.getPlayer();

		if (p.getWorld() == Bukkit.getWorld(Main.main.getConfig().getString("Config.world"))) {

			if (p.getItemInHand().getType() == Material.CHEST) {

				ShopGUI.createGUI(p);

			}
		}
	}

	@EventHandler
	public void onShopClick(InventoryClickEvent e) {
		Player p = (Player) e.getWhoClicked();

		if (p.getWorld() == Bukkit.getWorld(Main.main.getConfig().getString("Config.world"))) {

			if (e.getClickedInventory() != null) {
				if (e.getClickedInventory().getName() != null) {
					if (e.getClickedInventory().getName().equalsIgnoreCase("�6�lSHOP")) {

						if (e.getCurrentItem().getType() == Material.FISHING_ROD) {

							if (p.getLevel() >= 5) {

								p.setLevel(p.getLevel() - 5);

								ItemStack FeatherItemStack = new ItemStack(Material.FISHING_ROD, 1);
								ItemMeta FeatherMeta = FeatherItemStack.getItemMeta();
								ItemStack ChestItemStack = new ItemStack(Material.CHEST, 1);
								ItemMeta ChestMeta = ChestItemStack.getItemMeta();

								ChestMeta.setDisplayName("�6�lSHOP");
								ChestItemStack.setItemMeta(ChestMeta);

								FeatherMeta.setDisplayName("�c�lAngel");
								FeatherItemStack.setItemMeta(FeatherMeta);

								p.getInventory().setBoots(null);
								p.getInventory().setLeggings(null);
								p.getInventory().setChestplate(null);
								p.getInventory().setHelmet(null);

								p.getInventory().setItem(8, ChestItemStack);
								giveArmyClass.giveArmor(p);
								p.getInventory().addItem(FeatherItemStack);

								p.sendMessage(" ");
								p.sendMessage(Main.prefix + "�7Du hast die �c�lAngel �7ausgew�hlt");
								p.sendMessage(" ");

								e.setCancelled(true);
								p.closeInventory();
							} else {

								p.sendMessage(" ");
								p.sendMessage(Main.prefix + "�7Du ben�tigst mindestens 5 Level");
								p.sendMessage(" ");

								e.setCancelled(true);
							}

						} else if (e.getCurrentItem().getType() == Material.FEATHER) {

							if (p.getLevel() >= 15) {

								p.setLevel(p.getLevel() - 15);

								feather.add(p.getName());

								ItemStack FeatherItemStack = new ItemStack(Material.FEATHER, 1);
								ItemMeta FeatherMeta = FeatherItemStack.getItemMeta();
								ItemStack ChestItemStack = new ItemStack(Material.CHEST, 1);
								ItemMeta ChestMeta = ChestItemStack.getItemMeta();

								ChestMeta.setDisplayName("�6�lSHOP");
								ChestItemStack.setItemMeta(ChestMeta);

								FeatherMeta.setDisplayName("�9�lRettungs-Feder");
								FeatherItemStack.setItemMeta(FeatherMeta);

								p.getInventory().setBoots(null);
								p.getInventory().setLeggings(null);
								p.getInventory().setChestplate(null);
								p.getInventory().setHelmet(null);

								p.getInventory().setItem(8, ChestItemStack);
								giveArmyClass.giveArmor(p);
								p.getInventory().addItem(FeatherItemStack);

								p.sendMessage(" ");
								p.sendMessage(Main.prefix + "�7Du hast die �9�lRettungs-Feder �7ausgew�hlt");
								p.sendMessage(" ");

								e.setCancelled(true);
								p.closeInventory();
							} else {
								p.sendMessage(" ");
								p.sendMessage(Main.prefix + "�7Du ben�tigst mindestens 15 Level");
								p.sendMessage(" ");

								e.setCancelled(true);
							}

						} else if (e.getCurrentItem().getType() == Material.GOLD_HOE) {

							if (p.getLevel() >= 10) {

								p.setLevel(p.getLevel() - 10);

								ItemStack HoeItemStack = new ItemStack(Material.GOLD_HOE, 1);
								ItemMeta HoeMeta = HoeItemStack.getItemMeta();
								ItemStack ChestItemStack = new ItemStack(Material.CHEST, 1);
								ItemMeta ChestMeta = ChestItemStack.getItemMeta();

								ChestMeta.setDisplayName("�6�lSHOP");
								ChestItemStack.setItemMeta(ChestMeta);

								HoeMeta.setDisplayName("�6�lBooster-GUN");
								HoeItemStack.setItemMeta(HoeMeta);

								p.getInventory().setBoots(null);
								p.getInventory().setLeggings(null);
								p.getInventory().setChestplate(null);
								p.getInventory().setHelmet(null);

								p.getInventory().setItem(8, ChestItemStack);
								giveArmyClass.giveArmor(p);
								p.getInventory().addItem(HoeItemStack);

								p.sendMessage(" ");
								p.sendMessage(Main.prefix + "�7Du hast die �6�lBooster-GUN �7ausgew�hlt");
								p.sendMessage(" ");

								e.setCancelled(true);
								p.closeInventory();
							} else {
								p.sendMessage(" ");
								p.sendMessage(Main.prefix + "�7Du ben�tigst mindestens 10 Level");
								p.sendMessage(" ");

								e.setCancelled(true);
							}
						} else {
							e.setCancelled(true);
						}

					} else if (p.getGameMode() == GameMode.CREATIVE && p.hasPermission("gg.build")) {

					} else {
						e.setCancelled(true);
					}
				}
			}
		}
	}
}
