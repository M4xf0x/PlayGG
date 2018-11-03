package de.m4twaily.cs;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import de.m4twaily.mysql.CoinSystem;

public class Events implements Listener {

	@EventHandler
	public void onFirstJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		CoinSystem cs = new CoinSystem();
		
		
		if (!cs.isUserExisting(p.getUniqueId())) {
			cs.setFirstMoney(p.getUniqueId(), Main.main.getConfig().getInt("Config.startValue"));
		}

	}

}
