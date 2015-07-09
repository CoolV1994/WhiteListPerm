package com.coolv1994.whitelistperm;

import com.coolv1994.whitelistperm.commands.wlmsg;
import com.coolv1994.whitelistperm.commands.wloff;
import com.coolv1994.whitelistperm.commands.wlon;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Vinnie on 7/8/2015.
 */
public class WhiteListPerm extends JavaPlugin {
	@Override
	public void onEnable() {
		Config.whiteList = getConfig().getBoolean("whiteList");
		Config.whiteListMessage = getConfig().getString("whiteListMessage");

		getServer().getPluginManager().registerEvents(new PlayerListener(), this);
		getCommand("wlon").setExecutor(new wlon());
		getCommand("wloff").setExecutor(new wloff());
		getCommand("wlmsg").setExecutor(new wlmsg());
	}

	@Override
	public void onDisable() {
		getConfig().set("whiteList", Config.whiteList);
		getConfig().set("whiteListMessage", Config.whiteListMessage);
		saveConfig();
	}
}
