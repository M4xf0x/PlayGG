package de.m4twaily.shop;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ShopGUI {

	@SuppressWarnings("deprecation")
	public static void createGUI(Player p) {

		Inventory inv = Bukkit.createInventory(null, 9 * 3, "§6§lSHOP");

		ItemStack GrayPaneItemStack = new ItemStack(Material.STAINED_GLASS_PANE, 1, DyeColor.GRAY.getData());
		ItemMeta GrayPaneMeta = GrayPaneItemStack.getItemMeta();
		GrayPaneMeta.setDisplayName("§c ");

		GrayPaneItemStack.setItemMeta(GrayPaneMeta);
		inv.setItem(22, GrayPaneItemStack);
		for (int o = 0; o != 27; o++) {
			inv.setItem(o, GrayPaneItemStack);

			// Angel
			ItemStack i = new ItemStack(Material.FISHING_ROD, 1);
			ItemMeta met = i.getItemMeta();
			ArrayList<String> Angellore = new ArrayList<String>();

			met.setDisplayName("§c§lAngel");
			Angellore.add("§7§l5 Level");
			met.setLore(Angellore);
			i.setItemMeta(met);
			inv.setItem(16, i);

			// Feather
			ItemStack iiii = new ItemStack(Material.FEATHER, 1);
			ItemMeta FeatherMeta = iiii.getItemMeta();
			ArrayList<String> Featherlore = new ArrayList<String>();

			Featherlore.add("§7§l15 Level");
			FeatherMeta.setLore(Featherlore);
			FeatherMeta.setDisplayName("§9§lRettungs-Feder");
			iiii.setItemMeta(FeatherMeta);
			inv.setItem(10, iiii);

			// Hoe
			ItemStack HoeItemStack = new ItemStack(Material.GOLD_HOE, 1);
			ItemMeta HoeMeta = HoeItemStack.getItemMeta();
			ArrayList<String> Hoelore = new ArrayList<String>();

			HoeMeta.setDisplayName("§6§lBooster-GUN");
			Hoelore.add("§7§l10 Level");
			HoeMeta.setLore(Hoelore);
			HoeItemStack.setItemMeta(HoeMeta);
			inv.setItem(13, HoeItemStack);

			// by M4xf0x
			ItemStack item7 = new ItemStack(Material.STAINED_GLASS_PANE, 1, DyeColor.GRAY.getData());
			ItemMeta Meta7 = item7.getItemMeta();
			Meta7.setDisplayName("§8§lby M4xf0x");
			item7.setItemMeta(Meta7);
			inv.setItem(26, item7);

			p.openInventory(inv);

		}
	}
}
