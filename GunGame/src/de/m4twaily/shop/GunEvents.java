package de.m4twaily.shop;

import org.bukkit.Bukkit;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Snowball;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.Vector;

import de.m4twaily.gg.Main;

public class GunEvents implements Listener {

	@EventHandler
	public void onInteract(PlayerInteractEvent e) {
		Player p = e.getPlayer();

		if (e.getAction() == Action.RIGHT_CLICK_AIR) {
			if (p.getItemInHand() != null && p.getItemInHand().getType() == Material.GOLD_HOE) {
				if (p.getItemInHand().getDurability() <= 32) {

					p.launchProjectile(Snowball.class);

				} else {
					p.setItemInHand(null);
				}
			}
		}
	}

	@EventHandler
	public void onEntityDamage(EntityDamageByEntityEvent e) {

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

		if (e.getDamager() instanceof Snowball && e.getEntity() instanceof Player) {
			Snowball sb = (Snowball) e.getDamager();
			Player shooter = (Player) sb.getShooter();
			Player et = (Player) e.getEntity();

			if (shooter.getLocation().getBlockX() >= loc1.getBlockX()
					&& shooter.getLocation().getBlockX() <= loc2.getBlockX()
					&& shooter.getLocation().getBlockZ() >= loc1.getBlockZ()
					&& shooter.getLocation().getBlockZ() <= loc2.getBlockZ()
					|| et.getLocation().getBlockX() >= loc1.getBlockX()
							&& et.getLocation().getBlockX() <= loc2.getBlockX()
							&& et.getLocation().getBlockZ() >= loc1.getBlockZ()
							&& et.getLocation().getBlockZ() <= loc2.getBlockZ()) {
				e.setCancelled(true);
			} else {
				gun(e);
			}
		}
	}

	public void gun(EntityDamageByEntityEvent e) {

		if (e.getDamager() instanceof Snowball) {
			Snowball b = (Snowball) e.getDamager();

			if (b.getShooter() instanceof Player) {
				Player shooter = (Player) b.getShooter();

				if (shooter.getItemInHand().getType() == Material.GOLD_HOE) {
					ItemStack is = shooter.getItemInHand();
					Entity p = e.getEntity();
					World w = p.getWorld();
					Vector v = new Vector(1, 5, 0);

					e.setDamage(0);

					Bukkit.getScheduler().scheduleSyncDelayedTask(Main.main, new Runnable() {

						@Override
						public void run() {
							p.setVelocity(v);
							w.createExplosion(p.getLocation().getX(), p.getLocation().getY(), p.getLocation().getZ(), 2,
									false, false);
							((LivingEntity) p).addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 20, 20));
							w.playEffect(p.getLocation(), Effect.EXPLOSION_HUGE, 50);

							is.setDurability((short) (is.getDurability() + 11));
							shooter.updateInventory();
						}
					}, 1);

				}
			}
		}
	}	
}
