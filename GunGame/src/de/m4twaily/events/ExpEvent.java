package de.m4twaily.events;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLevelChangeEvent;

import de.m4twaily.gg.Main;
import de.m4twaily.gg.ScoreboardNew;
import de.m4twaily.gg.giveArmyClass;

public class ExpEvent implements Listener {

	@EventHandler
	public void onLvlChange(PlayerLevelChangeEvent e) {
		Player p = e.getPlayer();

		ScoreboardNew.doScoreboard(p);
		giveArmyClass.giveArmor(p);
		
		p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);

		if (p.getLevel() == 100) {
			Bukkit.broadcastMessage(Main.prefix + "§9§l" + p.getName() + " §6§lhat Level 100 erreicht!");
		}
	}
}
