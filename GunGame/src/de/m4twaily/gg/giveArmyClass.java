package de.m4twaily.gg;

import org.bukkit.entity.Player;

public class giveArmyClass {

	public static void giveArmor(Player p) {

		switch (p.getLevel()) {
		case 1:
			p.getInventory().setItem(0, Arms.WOODEN_AXE.getItem());
			break;
		case 2:
			p.getInventory().setItem(0, Arms.WOODEN_SWORD.getItem());
			break;
		case 3:
			p.getInventory().setItem(0, Arms.WOODEN_SWORD.getItem());
			p.getInventory().setChestplate(Arms.LEATHER_CHESTPLATE.getItem());
			break;
		case 4:
			p.getInventory().setItem(0, Arms.WOODEN_SWORD.getItem());
			p.getInventory().setChestplate(Arms.LEATHER_CHESTPLATE.getItem());
			p.getInventory().setHelmet(Arms.LEATHER_HELMET.getItem());
			break;
		case 5:
			p.getInventory().setItem(0, Arms.WOODEN_SWORD.getItem());
			p.getInventory().setChestplate(Arms.LEATHER_CHESTPLATE.getItem());
			p.getInventory().setHelmet(Arms.LEATHER_HELMET.getItem());
			p.getInventory().setBoots(Arms.LEATHER_LEGGINGS.getItem());
			break;
		case 6:
			p.getInventory().setItem(0, Arms.WOODEN_SWORD.getItem());
			p.getInventory().setChestplate(Arms.LEATHER_CHESTPLATE.getItem());
			p.getInventory().setHelmet(Arms.LEATHER_HELMET.getItem());
			p.getInventory().setBoots(Arms.LEATHER_BOOTS.getItem());
			p.getInventory().setLeggings(Arms.LEATHER_LEGGINGS.getItem());
			break;
		case 7:
			p.getInventory().setItem(0, Arms.WOODEN_AXE_1.getItem());
			p.getInventory().setChestplate(Arms.LEATHER_CHESTPLATE.getItem());
			p.getInventory().setHelmet(Arms.LEATHER_HELMET.getItem());
			p.getInventory().setBoots(Arms.LEATHER_BOOTS.getItem());
			p.getInventory().setLeggings(Arms.LEATHER_LEGGINGS.getItem());
			break;
		case 8:
			p.getInventory().setItem(0, Arms.WOODEN_SWORD_1.getItem());
			p.getInventory().setChestplate(Arms.LEATHER_CHESTPLATE_1.getItem());
			p.getInventory().setHelmet(Arms.LEATHER_HELMET.getItem());
			p.getInventory().setBoots(Arms.LEATHER_BOOTS.getItem());
			p.getInventory().setLeggings(Arms.LEATHER_LEGGINGS.getItem());
			break;
		case 9:
			p.getInventory().setItem(0, Arms.WOODEN_SWORD_1.getItem());
			p.getInventory().setChestplate(Arms.LEATHER_CHESTPLATE_1.getItem());
			p.getInventory().setHelmet(Arms.LEATHER_HELMET_1.getItem());
			p.getInventory().setBoots(Arms.LEATHER_BOOTS.getItem());
			p.getInventory().setLeggings(Arms.LEATHER_LEGGINGS.getItem());
			break;
		case 10:
			p.getInventory().setItem(0, Arms.WOODEN_SWORD_1.getItem());
			p.getInventory().setChestplate(Arms.LEATHER_CHESTPLATE_1.getItem());
			p.getInventory().setHelmet(Arms.LEATHER_HELMET_1.getItem());
			p.getInventory().setBoots(Arms.LEATHER_BOOTS_1.getItem());
			p.getInventory().setLeggings(Arms.LEATHER_LEGGINGS.getItem());
			break;
		case 11:
			p.getInventory().setItem(0, Arms.WOODEN_SWORD_1.getItem());
			p.getInventory().setChestplate(Arms.LEATHER_CHESTPLATE_1.getItem());
			p.getInventory().setHelmet(Arms.LEATHER_HELMET_1.getItem());
			p.getInventory().setBoots(Arms.LEATHER_BOOTS_1.getItem());
			p.getInventory().setLeggings(Arms.LEATHER_LEGGINGS_1.getItem());
			break;
		case 12:
			p.getInventory().setItem(0, Arms.GOLDEN_AXE_2.getItem());
			p.getInventory().setChestplate(Arms.LEATHER_CHESTPLATE_1.getItem());
			p.getInventory().setHelmet(Arms.LEATHER_HELMET_1.getItem());
			p.getInventory().setBoots(Arms.LEATHER_BOOTS_1.getItem());
			p.getInventory().setLeggings(Arms.LEATHER_LEGGINGS_1.getItem());
			break;
		case 13:
			p.getInventory().setItem(0, Arms.GOLDEN_SWORD_1.getItem());
			p.getInventory().setChestplate(Arms.LEATHER_CHESTPLATE_1.getItem());
			p.getInventory().setHelmet(Arms.LEATHER_HELMET_1.getItem());
			p.getInventory().setBoots(Arms.LEATHER_BOOTS_1.getItem());
			p.getInventory().setLeggings(Arms.LEATHER_LEGGINGS_1.getItem());
			break;
		case 14:
			p.getInventory().setItem(0, Arms.GOLDEN_SWORD_1.getItem());
			p.getInventory().setChestplate(Arms.GOLD_CHESTPLATE.getItem());
			p.getInventory().setHelmet(Arms.LEATHER_HELMET_1.getItem());
			p.getInventory().setBoots(Arms.LEATHER_BOOTS_1.getItem());
			p.getInventory().setLeggings(Arms.LEATHER_LEGGINGS_1.getItem());
			break;
		case 15:
			p.getInventory().setItem(0, Arms.GOLDEN_SWORD_1.getItem());
			p.getInventory().setChestplate(Arms.GOLD_CHESTPLATE.getItem());
			p.getInventory().setHelmet(Arms.GOLD_HELMET.getItem());
			p.getInventory().setBoots(Arms.LEATHER_BOOTS_1.getItem());
			p.getInventory().setLeggings(Arms.LEATHER_LEGGINGS_1.getItem());
			break;
		case 16:
			p.getInventory().setItem(0, Arms.GOLDEN_SWORD_1.getItem());
			p.getInventory().setChestplate(Arms.GOLD_CHESTPLATE.getItem());
			p.getInventory().setHelmet(Arms.GOLD_HELMET.getItem());
			p.getInventory().setBoots(Arms.GOLD_BOOTS.getItem());
			p.getInventory().setLeggings(Arms.LEATHER_LEGGINGS_1.getItem());
			break;
		case 17:
			p.getInventory().setItem(0, Arms.GOLDEN_SWORD_1.getItem());
			p.getInventory().setChestplate(Arms.GOLD_CHESTPLATE.getItem());
			p.getInventory().setHelmet(Arms.GOLD_HELMET.getItem());
			p.getInventory().setBoots(Arms.GOLD_BOOTS.getItem());
			p.getInventory().setLeggings(Arms.GOLD_LEGGINGS.getItem());
			break;
		case 18:
			p.getInventory().setItem(0, Arms.GOLDEN_SWORD_2.getItem());
			p.getInventory().setChestplate(Arms.GOLD_CHESTPLATE.getItem());
			p.getInventory().setHelmet(Arms.GOLD_HELMET.getItem());
			p.getInventory().setBoots(Arms.GOLD_BOOTS.getItem());
			p.getInventory().setLeggings(Arms.GOLD_LEGGINGS.getItem());
			break;
		case 19:
			p.getInventory().setItem(0, Arms.GOLDEN_SWORD_2.getItem());
			p.getInventory().setChestplate(Arms.GOLD_CHESTPLATE_1.getItem());
			p.getInventory().setHelmet(Arms.GOLD_HELMET.getItem());
			p.getInventory().setBoots(Arms.GOLD_BOOTS.getItem());
			p.getInventory().setLeggings(Arms.GOLD_LEGGINGS.getItem());
			break;
		case 20:
			p.getInventory().setItem(0, Arms.GOLDEN_SWORD_2.getItem());
			p.getInventory().setChestplate(Arms.GOLD_CHESTPLATE_1.getItem());
			p.getInventory().setHelmet(Arms.GOLD_HELMET_1.getItem());
			p.getInventory().setBoots(Arms.GOLD_BOOTS.getItem());
			p.getInventory().setLeggings(Arms.GOLD_LEGGINGS.getItem());
			break;
		case 21:
			p.getInventory().setItem(0, Arms.GOLDEN_SWORD_2.getItem());
			p.getInventory().setChestplate(Arms.GOLD_CHESTPLATE_1.getItem());
			p.getInventory().setHelmet(Arms.GOLD_HELMET_1.getItem());
			p.getInventory().setBoots(Arms.GOLD_BOOTS_1.getItem());
			p.getInventory().setLeggings(Arms.GOLD_LEGGINGS.getItem());
			break;
		case 22:
			p.getInventory().setItem(0, Arms.GOLDEN_SWORD_2.getItem());
			p.getInventory().setChestplate(Arms.GOLD_CHESTPLATE_1.getItem());
			p.getInventory().setHelmet(Arms.GOLD_HELMET_1.getItem());
			p.getInventory().setBoots(Arms.GOLD_BOOTS_1.getItem());
			p.getInventory().setLeggings(Arms.GOLD_LEGGINGS_1.getItem());
			break;
		case 23:
			p.getInventory().setItem(0, Arms.IRON_AXE_1.getItem());
			p.getInventory().setChestplate(Arms.GOLD_CHESTPLATE_1.getItem());
			p.getInventory().setHelmet(Arms.GOLD_HELMET_1.getItem());
			p.getInventory().setBoots(Arms.GOLD_BOOTS_1.getItem());
			p.getInventory().setLeggings(Arms.GOLD_LEGGINGS_1.getItem());
			break;
		case 24:
			p.getInventory().setItem(0, Arms.IRON_SWORD.getItem());
			p.getInventory().setChestplate(Arms.CHAIN_CHESTPLATE.getItem());
			p.getInventory().setHelmet(Arms.GOLD_HELMET_1.getItem());
			p.getInventory().setBoots(Arms.GOLD_BOOTS_1.getItem());
			p.getInventory().setLeggings(Arms.GOLD_LEGGINGS_1.getItem());
			break;
		case 25:
			p.getInventory().setItem(0, Arms.IRON_SWORD.getItem());
			p.getInventory().setChestplate(Arms.CHAIN_CHESTPLATE.getItem());
			p.getInventory().setHelmet(Arms.CHAIN_HELMET.getItem());
			p.getInventory().setBoots(Arms.GOLD_BOOTS_1.getItem());
			p.getInventory().setLeggings(Arms.GOLD_LEGGINGS_1.getItem());
			break;
		case 26:
			p.getInventory().setItem(0, Arms.IRON_SWORD.getItem());
			p.getInventory().setChestplate(Arms.CHAIN_CHESTPLATE.getItem());
			p.getInventory().setHelmet(Arms.CHAIN_HELMET.getItem());
			p.getInventory().setBoots(Arms.CHAINMAIL_BOOTS.getItem());
			p.getInventory().setLeggings(Arms.GOLD_LEGGINGS_1.getItem());
			break;
		case 27:
			p.getInventory().setItem(0, Arms.IRON_SWORD.getItem());
			p.getInventory().setChestplate(Arms.CHAIN_CHESTPLATE.getItem());
			p.getInventory().setHelmet(Arms.CHAIN_HELMET.getItem());
			p.getInventory().setBoots(Arms.CHAINMAIL_BOOTS.getItem());
			p.getInventory().setLeggings(Arms.CHAINMAIL_LEGGINGS.getItem());
			break;
		case 28:
			p.getInventory().setItem(0, Arms.IRON_SWORD.getItem());
			p.getInventory().setChestplate(Arms.CHAIN_CHESTPLATE_1.getItem());
			p.getInventory().setHelmet(Arms.CHAIN_HELMET.getItem());
			p.getInventory().setBoots(Arms.CHAINMAIL_BOOTS.getItem());
			p.getInventory().setLeggings(Arms.CHAINMAIL_LEGGINGS.getItem());
			break;
		case 29:
			p.getInventory().setItem(0, Arms.IRON_SWORD.getItem());
			p.getInventory().setChestplate(Arms.CHAIN_CHESTPLATE_1.getItem());
			p.getInventory().setHelmet(Arms.CHAIN_HELMET_1.getItem());
			p.getInventory().setBoots(Arms.CHAINMAIL_BOOTS.getItem());
			p.getInventory().setLeggings(Arms.CHAINMAIL_LEGGINGS.getItem());
			break;
		case 30:
			p.getInventory().setItem(0, Arms.IRON_SWORD.getItem());
			p.getInventory().setChestplate(Arms.CHAIN_CHESTPLATE_1.getItem());
			p.getInventory().setHelmet(Arms.CHAIN_HELMET_1.getItem());
			p.getInventory().setBoots(Arms.CHAINMAIL_BOOTS_1.getItem());
			p.getInventory().setLeggings(Arms.CHAINMAIL_LEGGINGS.getItem());
			break;
		case 31:
			p.getInventory().setItem(0, Arms.IRON_SWORD.getItem());
			p.getInventory().setChestplate(Arms.CHAIN_CHESTPLATE_1.getItem());
			p.getInventory().setHelmet(Arms.CHAIN_HELMET_1.getItem());
			p.getInventory().setBoots(Arms.CHAINMAIL_BOOTS_1.getItem());
			p.getInventory().setLeggings(Arms.CHAINMAIL_LEGGINGS_1.getItem());
			break;
		case 32:
			p.getInventory().setItem(0, Arms.IRON_AXE_2.getItem());
			p.getInventory().setChestplate(Arms.CHAIN_CHESTPLATE_1.getItem());
			p.getInventory().setHelmet(Arms.CHAIN_HELMET_1.getItem());
			p.getInventory().setBoots(Arms.CHAINMAIL_BOOTS_1.getItem());
			p.getInventory().setLeggings(Arms.CHAINMAIL_LEGGINGS_1.getItem());
			break;
		case 33:
			p.getInventory().setItem(0, Arms.IRON_SWORD_1.getItem());
			p.getInventory().setChestplate(Arms.IRON_CHESTPLATE.getItem());
			p.getInventory().setHelmet(Arms.CHAIN_HELMET_1.getItem());
			p.getInventory().setBoots(Arms.CHAINMAIL_BOOTS_1.getItem());
			p.getInventory().setLeggings(Arms.CHAINMAIL_LEGGINGS_1.getItem());
			break;
		case 34:
			p.getInventory().setItem(0, Arms.IRON_SWORD_1.getItem());
			p.getInventory().setChestplate(Arms.IRON_CHESTPLATE.getItem());
			p.getInventory().setHelmet(Arms.IRON_HELMET.getItem());
			p.getInventory().setBoots(Arms.CHAINMAIL_BOOTS_1.getItem());
			p.getInventory().setLeggings(Arms.CHAINMAIL_LEGGINGS_1.getItem());
			break;
		case 35:
			p.getInventory().setItem(0, Arms.IRON_SWORD_1.getItem());
			p.getInventory().setChestplate(Arms.IRON_CHESTPLATE.getItem());
			p.getInventory().setHelmet(Arms.IRON_HELMET.getItem());
			p.getInventory().setBoots(Arms.IRON_BOOTS.getItem());
			p.getInventory().setLeggings(Arms.CHAINMAIL_LEGGINGS_1.getItem());
			break;
		case 36:
			p.getInventory().setItem(0, Arms.IRON_SWORD_1.getItem());
			p.getInventory().setChestplate(Arms.IRON_CHESTPLATE.getItem());
			p.getInventory().setHelmet(Arms.IRON_HELMET.getItem());
			p.getInventory().setBoots(Arms.IRON_BOOTS.getItem());
			p.getInventory().setLeggings(Arms.IRON_LEGGINGS.getItem());
			break;
		case 37:
			p.getInventory().setItem(0, Arms.IRON_SWORD_1.getItem());
			p.getInventory().setChestplate(Arms.IRON_CHESTPLATE_1.getItem());
			p.getInventory().setHelmet(Arms.IRON_HELMET.getItem());
			p.getInventory().setBoots(Arms.IRON_BOOTS.getItem());
			p.getInventory().setLeggings(Arms.IRON_LEGGINGS.getItem());
			break;
		case 38:
			p.getInventory().setItem(0, Arms.IRON_SWORD_1.getItem());
			p.getInventory().setChestplate(Arms.IRON_CHESTPLATE_1.getItem());
			p.getInventory().setHelmet(Arms.IRON_HELMET_1.getItem());
			p.getInventory().setBoots(Arms.IRON_BOOTS.getItem());
			p.getInventory().setLeggings(Arms.IRON_LEGGINGS.getItem());
			break;
		case 39:
			p.getInventory().setItem(0, Arms.IRON_SWORD_1.getItem());
			p.getInventory().setChestplate(Arms.IRON_CHESTPLATE_1.getItem());
			p.getInventory().setHelmet(Arms.IRON_HELMET_1.getItem());
			p.getInventory().setBoots(Arms.IRON_BOOTS_1.getItem());
			p.getInventory().setLeggings(Arms.IRON_LEGGINGS.getItem());
			break;
		case 40:
			p.getInventory().setItem(0, Arms.IRON_SWORD_1.getItem());
			p.getInventory().setChestplate(Arms.IRON_CHESTPLATE_1.getItem());
			p.getInventory().setHelmet(Arms.IRON_HELMET_1.getItem());
			p.getInventory().setBoots(Arms.IRON_BOOTS_1.getItem());
			p.getInventory().setLeggings(Arms.IRON_LEGGINGS_1.getItem());
			break;
		case 41:
			p.getInventory().setItem(0, Arms.DIAMOND_AXE_1.getItem());
			p.getInventory().setChestplate(Arms.IRON_CHESTPLATE_1.getItem());
			p.getInventory().setHelmet(Arms.IRON_HELMET_1.getItem());
			p.getInventory().setBoots(Arms.IRON_BOOTS_1.getItem());
			p.getInventory().setLeggings(Arms.IRON_LEGGINGS_1.getItem());
			break;
		case 42:
			p.getInventory().setItem(0, Arms.DIAMOND_SWORD.getItem());
			p.getInventory().setChestplate(Arms.DIAMOND_CHESTPLATE.getItem());
			p.getInventory().setHelmet(Arms.IRON_HELMET_1.getItem());
			p.getInventory().setBoots(Arms.IRON_BOOTS_1.getItem());
			p.getInventory().setLeggings(Arms.IRON_LEGGINGS_1.getItem());
			break;
		case 43:
			p.getInventory().setItem(0, Arms.DIAMOND_SWORD.getItem());
			p.getInventory().setChestplate(Arms.DIAMOND_CHESTPLATE.getItem());
			p.getInventory().setHelmet(Arms.DIAMOND_HELMET.getItem());
			p.getInventory().setBoots(Arms.IRON_BOOTS_1.getItem());
			p.getInventory().setLeggings(Arms.IRON_LEGGINGS_1.getItem());
			break;
		case 44:
			p.getInventory().setItem(0, Arms.DIAMOND_SWORD.getItem());
			p.getInventory().setChestplate(Arms.DIAMOND_CHESTPLATE.getItem());
			p.getInventory().setHelmet(Arms.DIAMOND_HELMET.getItem());
			p.getInventory().setBoots(Arms.DIAMOND_BOOTS.getItem());
			p.getInventory().setLeggings(Arms.IRON_LEGGINGS_1.getItem());
			break;
		case 45:
			p.getInventory().setItem(0, Arms.DIAMOND_SWORD.getItem());
			p.getInventory().setChestplate(Arms.DIAMOND_CHESTPLATE.getItem());
			p.getInventory().setHelmet(Arms.DIAMOND_HELMET.getItem());
			p.getInventory().setBoots(Arms.DIAMOND_BOOTS.getItem());
			p.getInventory().setLeggings(Arms.DIAMOND_LEGGINGS.getItem());
			break;
		case 46:
			p.getInventory().setItem(0, Arms.DIAMOND_AXE_2.getItem());
			p.getInventory().setChestplate(Arms.DIAMOND_CHESTPLATE.getItem());
			p.getInventory().setHelmet(Arms.DIAMOND_HELMET.getItem());
			p.getInventory().setBoots(Arms.DIAMOND_BOOTS.getItem());
			p.getInventory().setLeggings(Arms.DIAMOND_LEGGINGS.getItem());
			break;
		case 47:
			p.getInventory().setItem(0, Arms.DIAMOND_SWORD_1.getItem());
			p.getInventory().setChestplate(Arms.DIAMOND_CHESTPLATE_1.getItem());
			p.getInventory().setHelmet(Arms.DIAMOND_HELMET.getItem());
			p.getInventory().setBoots(Arms.DIAMOND_BOOTS.getItem());
			p.getInventory().setLeggings(Arms.DIAMOND_LEGGINGS.getItem());
			break;
		case 48:
			p.getInventory().setItem(0, Arms.DIAMOND_SWORD_1.getItem());
			p.getInventory().setChestplate(Arms.DIAMOND_CHESTPLATE_1.getItem());
			p.getInventory().setHelmet(Arms.DIAMOND_HELMET_1.getItem());
			p.getInventory().setBoots(Arms.DIAMOND_BOOTS.getItem());
			p.getInventory().setLeggings(Arms.DIAMOND_LEGGINGS.getItem());
			break;
		case 49:
			p.getInventory().setItem(0, Arms.DIAMOND_SWORD_1.getItem());
			p.getInventory().setChestplate(Arms.DIAMOND_CHESTPLATE_1.getItem());
			p.getInventory().setHelmet(Arms.DIAMOND_HELMET_1.getItem());
			p.getInventory().setBoots(Arms.DIAMOND_BOOTS_1.getItem());
			p.getInventory().setLeggings(Arms.DIAMOND_LEGGINGS.getItem());
			break;
		case 50:
			p.getInventory().setItem(0, Arms.DIAMOND_SWORD_1.getItem());
			p.getInventory().setChestplate(Arms.DIAMOND_CHESTPLATE_1.getItem());
			p.getInventory().setHelmet(Arms.DIAMOND_HELMET_1.getItem());
			p.getInventory().setBoots(Arms.DIAMOND_BOOTS_1.getItem());
			p.getInventory().setLeggings(Arms.DIAMOND_LEGGINGS_1.getItem());
			break;
		case 51:
			p.getInventory().setItem(0, Arms.DIAMOND_SWORD_1.getItem());
			p.getInventory().setChestplate(Arms.DIAMOND_CHESTPLATE_1.getItem());
			p.getInventory().setHelmet(Arms.DIAMOND_HELMET_1.getItem());
			p.getInventory().setBoots(Arms.DIAMOND_BOOTS_1.getItem());
			p.getInventory().setLeggings(Arms.DIAMOND_LEGGINGS_1.getItem());
			break;
		case 52:
			p.getInventory().setItem(0, Arms.DIAMOND_SWORD_1.getItem());
			p.getInventory().setChestplate(Arms.DIAMOND_CHESTPLATE_1.getItem());
			p.getInventory().setHelmet(Arms.DIAMOND_HELMET_1.getItem());
			p.getInventory().setBoots(Arms.DIAMOND_BOOTS_1.getItem());
			p.getInventory().setLeggings(Arms.DIAMOND_LEGGINGS_1.getItem());
			break;
		case 53:
			p.getInventory().setItem(0, Arms.DIAMOND_SWORD_1.getItem());
			p.getInventory().setChestplate(Arms.DIAMOND_CHESTPLATE_1.getItem());
			p.getInventory().setHelmet(Arms.DIAMOND_HELMET_1.getItem());
			p.getInventory().setBoots(Arms.DIAMOND_BOOTS_1.getItem());
			p.getInventory().setLeggings(Arms.DIAMOND_LEGGINGS_1.getItem());
			break;
		case 54:
			p.getInventory().setItem(0, Arms.DIAMOND_SWORD_1.getItem());
			p.getInventory().setChestplate(Arms.DIAMOND_CHESTPLATE_1.getItem());
			p.getInventory().setHelmet(Arms.DIAMOND_HELMET_1.getItem());
			p.getInventory().setBoots(Arms.DIAMOND_BOOTS_1.getItem());
			p.getInventory().setLeggings(Arms.DIAMOND_LEGGINGS_1.getItem());
			break;
		case 55:
			p.getInventory().setItem(0, Arms.DIAMOND_SWORD_1.getItem());
			p.getInventory().setChestplate(Arms.DIAMOND_CHESTPLATE_1.getItem());
			p.getInventory().setHelmet(Arms.DIAMOND_HELMET_1.getItem());
			p.getInventory().setBoots(Arms.DIAMOND_BOOTS_1.getItem());
			p.getInventory().setLeggings(Arms.DIAMOND_LEGGINGS_1.getItem());
			break;
		case 56:
			p.getInventory().setItem(0, Arms.DIAMOND_SWORD_1.getItem());
			p.getInventory().setChestplate(Arms.DIAMOND_CHESTPLATE_1.getItem());
			p.getInventory().setHelmet(Arms.DIAMOND_HELMET_1.getItem());
			p.getInventory().setBoots(Arms.DIAMOND_BOOTS_1.getItem());
			p.getInventory().setLeggings(Arms.DIAMOND_LEGGINGS_1.getItem());
			break;
		case 57:
			p.getInventory().setItem(0, Arms.DIAMOND_SWORD_1.getItem());
			p.getInventory().setChestplate(Arms.DIAMOND_CHESTPLATE_1.getItem());
			p.getInventory().setHelmet(Arms.DIAMOND_HELMET_1.getItem());
			p.getInventory().setBoots(Arms.DIAMOND_BOOTS_1.getItem());
			p.getInventory().setLeggings(Arms.DIAMOND_LEGGINGS_1.getItem());
			break;
		case 58:
			p.getInventory().setItem(0, Arms.DIAMOND_SWORD_1.getItem());
			p.getInventory().setChestplate(Arms.DIAMOND_CHESTPLATE_1.getItem());
			p.getInventory().setHelmet(Arms.DIAMOND_HELMET_1.getItem());
			p.getInventory().setBoots(Arms.DIAMOND_BOOTS_1.getItem());
			p.getInventory().setLeggings(Arms.DIAMOND_LEGGINGS_1.getItem());
			break;
		case 59:
			p.getInventory().setItem(0, Arms.DIAMOND_SWORD_1.getItem());
			p.getInventory().setChestplate(Arms.DIAMOND_CHESTPLATE_1.getItem());
			p.getInventory().setHelmet(Arms.DIAMOND_HELMET_1.getItem());
			p.getInventory().setBoots(Arms.DIAMOND_BOOTS_1.getItem());
			p.getInventory().setLeggings(Arms.DIAMOND_LEGGINGS_1.getItem());
			break;
		case 60:
			p.getInventory().setItem(0, Arms.DIAMOND_SWORD_2.getItem());
			p.getInventory().setChestplate(Arms.DIAMOND_CHESTPLATE_1.getItem());
			p.getInventory().setHelmet(Arms.DIAMOND_HELMET_1.getItem());
			p.getInventory().setBoots(Arms.DIAMOND_BOOTS_1.getItem());
			p.getInventory().setLeggings(Arms.DIAMOND_LEGGINGS_1.getItem());
			break;
		case 61:
			p.getInventory().setItem(0, Arms.DIAMOND_SWORD_2.getItem());
			p.getInventory().setChestplate(Arms.DIAMOND_CHESTPLATE_1.getItem());
			p.getInventory().setHelmet(Arms.DIAMOND_HELMET_1.getItem());
			p.getInventory().setBoots(Arms.DIAMOND_BOOTS_1.getItem());
			p.getInventory().setLeggings(Arms.DIAMOND_LEGGINGS_1.getItem());
			break;
		case 62:
			p.getInventory().setItem(0, Arms.DIAMOND_SWORD_2.getItem());
			p.getInventory().setChestplate(Arms.DIAMOND_CHESTPLATE_1.getItem());
			p.getInventory().setHelmet(Arms.DIAMOND_HELMET_1.getItem());
			p.getInventory().setBoots(Arms.DIAMOND_BOOTS_1.getItem());
			p.getInventory().setLeggings(Arms.DIAMOND_LEGGINGS_1.getItem());
			break;
		case 63:
			p.getInventory().setItem(0, Arms.DIAMOND_SWORD_2.getItem());
			p.getInventory().setChestplate(Arms.DIAMOND_CHESTPLATE_1.getItem());
			p.getInventory().setHelmet(Arms.DIAMOND_HELMET_1.getItem());
			p.getInventory().setBoots(Arms.DIAMOND_BOOTS_1.getItem());
			p.getInventory().setLeggings(Arms.DIAMOND_LEGGINGS_1.getItem());
			break;
		case 64:
			p.getInventory().setItem(0, Arms.DIAMOND_SWORD_2.getItem());
			p.getInventory().setChestplate(Arms.DIAMOND_CHESTPLATE_1.getItem());
			p.getInventory().setHelmet(Arms.DIAMOND_HELMET_1.getItem());
			p.getInventory().setBoots(Arms.DIAMOND_BOOTS_1.getItem());
			p.getInventory().setLeggings(Arms.DIAMOND_LEGGINGS_1.getItem());
			break;
		case 65:
			p.getInventory().setItem(0, Arms.DIAMOND_SWORD_2.getItem());
			p.getInventory().setChestplate(Arms.DIAMOND_CHESTPLATE_1.getItem());
			p.getInventory().setHelmet(Arms.DIAMOND_HELMET_1.getItem());
			p.getInventory().setBoots(Arms.DIAMOND_BOOTS_1.getItem());
			p.getInventory().setLeggings(Arms.DIAMOND_LEGGINGS_1.getItem());
			break;
		case 66:
			p.getInventory().setItem(0, Arms.DIAMOND_SWORD_2.getItem());
			p.getInventory().setChestplate(Arms.DIAMOND_CHESTPLATE_1.getItem());
			p.getInventory().setHelmet(Arms.DIAMOND_HELMET_1.getItem());
			p.getInventory().setBoots(Arms.DIAMOND_BOOTS_1.getItem());
			p.getInventory().setLeggings(Arms.DIAMOND_LEGGINGS_1.getItem());
			break;
		case 67:
			p.getInventory().setItem(0, Arms.DIAMOND_SWORD_2.getItem());
			p.getInventory().setChestplate(Arms.DIAMOND_CHESTPLATE_1.getItem());
			p.getInventory().setHelmet(Arms.DIAMOND_HELMET_1.getItem());
			p.getInventory().setBoots(Arms.DIAMOND_BOOTS_1.getItem());
			p.getInventory().setLeggings(Arms.DIAMOND_LEGGINGS_1.getItem());
			break;
		case 68:
			p.getInventory().setItem(0, Arms.DIAMOND_SWORD_2.getItem());
			p.getInventory().setChestplate(Arms.DIAMOND_CHESTPLATE_1.getItem());
			p.getInventory().setHelmet(Arms.DIAMOND_HELMET_1.getItem());
			p.getInventory().setBoots(Arms.DIAMOND_BOOTS_1.getItem());
			p.getInventory().setLeggings(Arms.DIAMOND_LEGGINGS_1.getItem());
			break;
		case 69:
			p.getInventory().setItem(0, Arms.DIAMOND_SWORD_2.getItem());
			p.getInventory().setChestplate(Arms.DIAMOND_CHESTPLATE_1.getItem());
			p.getInventory().setHelmet(Arms.DIAMOND_HELMET_1.getItem());
			p.getInventory().setBoots(Arms.DIAMOND_BOOTS_1.getItem());
			p.getInventory().setLeggings(Arms.DIAMOND_LEGGINGS_1.getItem());
			break;
		case 70:
			p.getInventory().setItem(0, Arms.DIAMOND_SWORD_2.getItem());
			p.getInventory().setChestplate(Arms.DIAMOND_CHESTPLATE_2.getItem());
			p.getInventory().setHelmet(Arms.DIAMOND_HELMET_1.getItem());
			p.getInventory().setBoots(Arms.DIAMOND_BOOTS_1.getItem());
			p.getInventory().setLeggings(Arms.DIAMOND_LEGGINGS_1.getItem());
			break;
		case 71:
			p.getInventory().setItem(0, Arms.DIAMOND_SWORD_2.getItem());
			p.getInventory().setChestplate(Arms.DIAMOND_CHESTPLATE_2.getItem());
			p.getInventory().setHelmet(Arms.DIAMOND_HELMET_2.getItem());
			p.getInventory().setBoots(Arms.DIAMOND_BOOTS_1.getItem());
			p.getInventory().setLeggings(Arms.DIAMOND_LEGGINGS_1.getItem());
			break;
		case 72:
			p.getInventory().setItem(0, Arms.DIAMOND_SWORD_2.getItem());
			p.getInventory().setChestplate(Arms.DIAMOND_CHESTPLATE_2.getItem());
			p.getInventory().setHelmet(Arms.DIAMOND_HELMET_2.getItem());
			p.getInventory().setBoots(Arms.DIAMOND_BOOTS_1.getItem());
			p.getInventory().setLeggings(Arms.DIAMOND_LEGGINGS_1.getItem());
			break;
		case 73:
			p.getInventory().setItem(0, Arms.DIAMOND_SWORD_2.getItem());
			p.getInventory().setChestplate(Arms.DIAMOND_CHESTPLATE_2.getItem());
			p.getInventory().setHelmet(Arms.DIAMOND_HELMET_2.getItem());
			p.getInventory().setBoots(Arms.DIAMOND_BOOTS_1.getItem());
			p.getInventory().setLeggings(Arms.DIAMOND_LEGGINGS_1.getItem());
			break;
		case 74:
			p.getInventory().setItem(0, Arms.DIAMOND_SWORD_2.getItem());
			p.getInventory().setChestplate(Arms.DIAMOND_CHESTPLATE_2.getItem());
			p.getInventory().setHelmet(Arms.DIAMOND_HELMET_2.getItem());
			p.getInventory().setBoots(Arms.DIAMOND_BOOTS_1.getItem());
			p.getInventory().setLeggings(Arms.DIAMOND_LEGGINGS_1.getItem());
			break;
		case 75:
			p.getInventory().setItem(0, Arms.DIAMOND_SWORD_2.getItem());
			p.getInventory().setChestplate(Arms.DIAMOND_CHESTPLATE_2.getItem());
			p.getInventory().setHelmet(Arms.DIAMOND_HELMET_2.getItem());
			p.getInventory().setBoots(Arms.DIAMOND_BOOTS_2.getItem());
			p.getInventory().setLeggings(Arms.DIAMOND_LEGGINGS_1.getItem());
			break;
		case 76:
			p.getInventory().setItem(0, Arms.DIAMOND_SWORD_2.getItem());
			p.getInventory().setChestplate(Arms.DIAMOND_CHESTPLATE_2.getItem());
			p.getInventory().setHelmet(Arms.DIAMOND_HELMET_2.getItem());
			p.getInventory().setBoots(Arms.DIAMOND_BOOTS_2.getItem());
			p.getInventory().setLeggings(Arms.DIAMOND_LEGGINGS_1.getItem());
			break;
		case 77:
			p.getInventory().setItem(0, Arms.DIAMOND_SWORD_2.getItem());
			p.getInventory().setChestplate(Arms.DIAMOND_CHESTPLATE_2.getItem());
			p.getInventory().setHelmet(Arms.DIAMOND_HELMET_2.getItem());
			p.getInventory().setBoots(Arms.DIAMOND_BOOTS_2.getItem());
			p.getInventory().setLeggings(Arms.DIAMOND_LEGGINGS_1.getItem());
			break;
		case 78:
			p.getInventory().setItem(0, Arms.DIAMOND_SWORD_2.getItem());
			p.getInventory().setChestplate(Arms.DIAMOND_CHESTPLATE_2.getItem());
			p.getInventory().setHelmet(Arms.DIAMOND_HELMET_2.getItem());
			p.getInventory().setBoots(Arms.DIAMOND_BOOTS_2.getItem());
			p.getInventory().setLeggings(Arms.DIAMOND_LEGGINGS_1.getItem());
			break;
		case 79:
			p.getInventory().setItem(0, Arms.DIAMOND_SWORD_2.getItem());
			p.getInventory().setChestplate(Arms.DIAMOND_CHESTPLATE_2.getItem());
			p.getInventory().setHelmet(Arms.DIAMOND_HELMET_2.getItem());
			p.getInventory().setBoots(Arms.DIAMOND_BOOTS_2.getItem());
			p.getInventory().setLeggings(Arms.DIAMOND_LEGGINGS_1.getItem());
			break;
		case 80:
			p.getInventory().setItem(0, Arms.DIAMOND_SWORD_3.getItem());
			p.getInventory().setChestplate(Arms.DIAMOND_CHESTPLATE_2.getItem());
			p.getInventory().setHelmet(Arms.DIAMOND_HELMET_2.getItem());
			p.getInventory().setBoots(Arms.DIAMOND_BOOTS_2.getItem());
			p.getInventory().setLeggings(Arms.DIAMOND_LEGGINGS_2.getItem());
			break;
		case 81:
			p.getInventory().setItem(0, Arms.DIAMOND_SWORD_3.getItem());
			p.getInventory().setChestplate(Arms.DIAMOND_CHESTPLATE_2.getItem());
			p.getInventory().setHelmet(Arms.DIAMOND_HELMET_2.getItem());
			p.getInventory().setBoots(Arms.DIAMOND_BOOTS_2.getItem());
			p.getInventory().setLeggings(Arms.DIAMOND_LEGGINGS_2.getItem());
			break;
		case 82:
			p.getInventory().setItem(0, Arms.DIAMOND_SWORD_3.getItem());
			p.getInventory().setChestplate(Arms.DIAMOND_CHESTPLATE_2.getItem());
			p.getInventory().setHelmet(Arms.DIAMOND_HELMET_2.getItem());
			p.getInventory().setBoots(Arms.DIAMOND_BOOTS_2.getItem());
			p.getInventory().setLeggings(Arms.DIAMOND_LEGGINGS_2.getItem());
			break;
		case 83:
			p.getInventory().setItem(0, Arms.DIAMOND_SWORD_3.getItem());
			p.getInventory().setChestplate(Arms.DIAMOND_CHESTPLATE_2.getItem());
			p.getInventory().setHelmet(Arms.DIAMOND_HELMET_2.getItem());
			p.getInventory().setBoots(Arms.DIAMOND_BOOTS_2.getItem());
			p.getInventory().setLeggings(Arms.DIAMOND_LEGGINGS_2.getItem());
			break;
		case 84:
			p.getInventory().setItem(0, Arms.DIAMOND_SWORD_3.getItem());
			p.getInventory().setChestplate(Arms.DIAMOND_CHESTPLATE_2.getItem());
			p.getInventory().setHelmet(Arms.DIAMOND_HELMET_2.getItem());
			p.getInventory().setBoots(Arms.DIAMOND_BOOTS_2.getItem());
			p.getInventory().setLeggings(Arms.DIAMOND_LEGGINGS_2.getItem());
			break;
		case 85:
			p.getInventory().setItem(0, Arms.DIAMOND_SWORD_3.getItem());
			p.getInventory().setChestplate(Arms.DIAMOND_CHESTPLATE_2.getItem());
			p.getInventory().setHelmet(Arms.DIAMOND_HELMET_2.getItem());
			p.getInventory().setBoots(Arms.DIAMOND_BOOTS_2.getItem());
			p.getInventory().setLeggings(Arms.DIAMOND_LEGGINGS_2.getItem());
			break;
		case 86:
			p.getInventory().setItem(0, Arms.DIAMOND_SWORD_3.getItem());
			p.getInventory().setChestplate(Arms.DIAMOND_CHESTPLATE_2.getItem());
			p.getInventory().setHelmet(Arms.DIAMOND_HELMET_2.getItem());
			p.getInventory().setBoots(Arms.DIAMOND_BOOTS_2.getItem());
			p.getInventory().setLeggings(Arms.DIAMOND_LEGGINGS_2.getItem());
			break;
		case 87:
			p.getInventory().setItem(0, Arms.DIAMOND_SWORD_3.getItem());
			p.getInventory().setChestplate(Arms.DIAMOND_CHESTPLATE_2.getItem());
			p.getInventory().setHelmet(Arms.DIAMOND_HELMET_2.getItem());
			p.getInventory().setBoots(Arms.DIAMOND_BOOTS_2.getItem());
			p.getInventory().setLeggings(Arms.DIAMOND_LEGGINGS_2.getItem());
			break;
		case 88:
			p.getInventory().setItem(0, Arms.DIAMOND_SWORD_3.getItem());
			p.getInventory().setChestplate(Arms.DIAMOND_CHESTPLATE_2.getItem());
			p.getInventory().setHelmet(Arms.DIAMOND_HELMET_2.getItem());
			p.getInventory().setBoots(Arms.DIAMOND_BOOTS_2.getItem());
			p.getInventory().setLeggings(Arms.DIAMOND_LEGGINGS_2.getItem());
			break;
		case 89:
			p.getInventory().setItem(0, Arms.DIAMOND_SWORD_3.getItem());
			p.getInventory().setChestplate(Arms.DIAMOND_CHESTPLATE_2.getItem());
			p.getInventory().setHelmet(Arms.DIAMOND_HELMET_2.getItem());
			p.getInventory().setBoots(Arms.DIAMOND_BOOTS_2.getItem());
			p.getInventory().setLeggings(Arms.DIAMOND_LEGGINGS_2.getItem());
			break;
		case 90:
			p.getInventory().setItem(0, Arms.DIAMOND_SWORD_3.getItem());
			p.getInventory().setChestplate(Arms.DIAMOND_CHESTPLATE_3.getItem());
			p.getInventory().setHelmet(Arms.DIAMOND_HELMET_2.getItem());
			p.getInventory().setBoots(Arms.DIAMOND_BOOTS_2.getItem());
			p.getInventory().setLeggings(Arms.DIAMOND_LEGGINGS_2.getItem());
			break;
		case 91:
			p.getInventory().setItem(0, Arms.DIAMOND_SWORD_3.getItem());
			p.getInventory().setChestplate(Arms.DIAMOND_CHESTPLATE_3.getItem());
			p.getInventory().setHelmet(Arms.DIAMOND_HELMET_3.getItem());
			p.getInventory().setBoots(Arms.DIAMOND_BOOTS_2.getItem());
			p.getInventory().setLeggings(Arms.DIAMOND_LEGGINGS_2.getItem());
			break;
		case 92:
			p.getInventory().setItem(0, Arms.DIAMOND_SWORD_3.getItem());
			p.getInventory().setChestplate(Arms.DIAMOND_CHESTPLATE_3.getItem());
			p.getInventory().setHelmet(Arms.DIAMOND_HELMET_3.getItem());
			p.getInventory().setBoots(Arms.DIAMOND_BOOTS_2.getItem());
			p.getInventory().setLeggings(Arms.DIAMOND_LEGGINGS_2.getItem());
			break;
		case 93:
			p.getInventory().setItem(0, Arms.DIAMOND_SWORD_3.getItem());
			p.getInventory().setChestplate(Arms.DIAMOND_CHESTPLATE_3.getItem());
			p.getInventory().setHelmet(Arms.DIAMOND_HELMET_3.getItem());
			p.getInventory().setBoots(Arms.DIAMOND_BOOTS_2.getItem());
			p.getInventory().setLeggings(Arms.DIAMOND_LEGGINGS_2.getItem());
			break;
		case 94:
			p.getInventory().setItem(0, Arms.DIAMOND_SWORD_3.getItem());
			p.getInventory().setChestplate(Arms.DIAMOND_CHESTPLATE_3.getItem());
			p.getInventory().setHelmet(Arms.DIAMOND_HELMET_3.getItem());
			p.getInventory().setBoots(Arms.DIAMOND_BOOTS_2.getItem());
			p.getInventory().setLeggings(Arms.DIAMOND_LEGGINGS_2.getItem());
			break;
		case 95:
			p.getInventory().setItem(0, Arms.DIAMOND_SWORD_3.getItem());
			p.getInventory().setChestplate(Arms.DIAMOND_CHESTPLATE_3.getItem());
			p.getInventory().setHelmet(Arms.DIAMOND_HELMET_3.getItem());
			p.getInventory().setBoots(Arms.DIAMOND_BOOTS_3.getItem());
			p.getInventory().setLeggings(Arms.DIAMOND_LEGGINGS_2.getItem());
			break;
		case 96:
			p.getInventory().setItem(0, Arms.DIAMOND_SWORD_3.getItem());
			p.getInventory().setChestplate(Arms.DIAMOND_CHESTPLATE_3.getItem());
			p.getInventory().setHelmet(Arms.DIAMOND_HELMET_3.getItem());
			p.getInventory().setBoots(Arms.DIAMOND_BOOTS_3.getItem());
			p.getInventory().setLeggings(Arms.DIAMOND_LEGGINGS_2.getItem());
			break;
		case 97:
			p.getInventory().setItem(0, Arms.DIAMOND_SWORD_3.getItem());
			p.getInventory().setChestplate(Arms.DIAMOND_CHESTPLATE_3.getItem());
			p.getInventory().setHelmet(Arms.DIAMOND_HELMET_3.getItem());
			p.getInventory().setBoots(Arms.DIAMOND_BOOTS_3.getItem());
			p.getInventory().setLeggings(Arms.DIAMOND_LEGGINGS_2.getItem());
			break;
		case 98:
			p.getInventory().setItem(0, Arms.DIAMOND_SWORD_3.getItem());
			p.getInventory().setChestplate(Arms.DIAMOND_CHESTPLATE_3.getItem());
			p.getInventory().setHelmet(Arms.DIAMOND_HELMET_3.getItem());
			p.getInventory().setBoots(Arms.DIAMOND_BOOTS_3.getItem());
			p.getInventory().setLeggings(Arms.DIAMOND_LEGGINGS_2.getItem());
			break;
		case 99:
			p.getInventory().setItem(0, Arms.DIAMOND_SWORD_3.getItem());
			p.getInventory().setChestplate(Arms.DIAMOND_CHESTPLATE_3.getItem());
			p.getInventory().setHelmet(Arms.DIAMOND_HELMET_3.getItem());
			p.getInventory().setBoots(Arms.DIAMOND_BOOTS_3.getItem());
			p.getInventory().setLeggings(Arms.DIAMOND_LEGGINGS_2.getItem());
			break;
		case 100:
			p.getInventory().setItem(0, Arms.DIAMOND_SWORD_3.getItem());
			p.getInventory().setChestplate(Arms.DIAMOND_CHESTPLATE_3.getItem());
			p.getInventory().setHelmet(Arms.DIAMOND_HELMET_3.getItem());
			p.getInventory().setBoots(Arms.DIAMOND_BOOTS_3.getItem());
			p.getInventory().setLeggings(Arms.DIAMOND_LEGGINGS_3.getItem());
			break;
		default:
			p.getInventory().setItem(0, Arms.WOODEN_AXE.getItem());
		}
	}
}
