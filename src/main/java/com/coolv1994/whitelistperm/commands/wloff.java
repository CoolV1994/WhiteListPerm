package com.coolv1994.whitelistperm.commands;

import com.coolv1994.whitelistperm.Config;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

/**
 * Created by Vinnie on 7/8/2015.
 */
public class wloff implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		Config.whiteList = false;
		sender.sendMessage("Disabled white-list mode.");
		return true;
	}
}
