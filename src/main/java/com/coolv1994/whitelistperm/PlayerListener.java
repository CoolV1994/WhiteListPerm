package com.coolv1994.whitelistperm;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

/**
 * Created by Vinnie on 7/8/2015.
 */
public class PlayerListener implements Listener {
	private boolean canJoin(Player player) {
		return player.hasPermission("whitelist.join") ||
				player.hasPermission("whitelist.admin") ||
				player.isOp();
	}

	@EventHandler
	public void onPlayerJoin(PlayerLoginEvent event) {
		if (Config.whiteList && !canJoin(event.getPlayer())) {
			event.disallow(PlayerLoginEvent.Result.KICK_WHITELIST, Config.whiteListMessage);
		}
	}
}
