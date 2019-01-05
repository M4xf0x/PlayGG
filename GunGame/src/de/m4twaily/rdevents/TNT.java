package de.m4twaily.rdevents;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.entity.TNTPrimed;
import org.bukkit.util.Vector;

public class TNT {

	static void all() {
		
		Bukkit.broadcastMessage(" ");
		Bukkit.broadcastMessage("§6§lRandomEvent §8» §eTNT");
		Bukkit.broadcastMessage(" ");
		
		for (Player all : Bukkit.getOnlinePlayers()) {	
			
			Location loc1 = all.getLocation().add(new Vector(3, 10, 0));
			Location loc2 = all.getLocation().add(new Vector(0, 10, 3));
			Location loc3 = all.getLocation().add(new Vector(-3, 10, 0));
			Location loc4 = all.getLocation().add(new Vector(0, 10, -3));
			Location loc5 = all.getLocation().add(new Vector(-2, 10, -2));
			Location loc6 = all.getLocation().add(new Vector(2, 10, 2));
			Location loc7 = all.getLocation().add(new Vector(-2, 10, 2));
			Location loc8 = all.getLocation().add(new Vector(2, 10, -2));

			TNTPrimed tnt = all.getWorld().spawn(loc1, TNTPrimed.class);
			TNTPrimed tnt2 = all.getWorld().spawn(loc2, TNTPrimed.class);
			TNTPrimed tnt3 = all.getWorld().spawn(loc3, TNTPrimed.class);
			TNTPrimed tnt4 = all.getWorld().spawn(loc4, TNTPrimed.class);
			TNTPrimed tnt5 = all.getWorld().spawn(loc5, TNTPrimed.class);
			TNTPrimed tnt6 = all.getWorld().spawn(loc6, TNTPrimed.class);
			TNTPrimed tnt7 = all.getWorld().spawn(loc7, TNTPrimed.class);
			TNTPrimed tnt8 = all.getWorld().spawn(loc8, TNTPrimed.class);
			
			tnt.setFuseTicks(40);
			tnt2.setFuseTicks(40);
			tnt3.setFuseTicks(40);
			tnt4.setFuseTicks(40);
			tnt5.setFuseTicks(40);
			tnt6.setFuseTicks(40);
			tnt7.setFuseTicks(40);
			tnt8.setFuseTicks(40);
		}
	}
}
