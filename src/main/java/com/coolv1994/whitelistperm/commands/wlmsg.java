package com.coolv1994.whitelistperm.commands;

import com.coolv1994.whitelistperm.Config;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

/**
 * Created by Vinnie on 7/8/2015.
 */
public class wlmsg implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (args == null)
			return false;

		int end = args.length - 1;
		if (end == -1)
			return false;

		StringBuilder msg = new StringBuilder();
		for (int i = 0; ; i++) {
			msg.append(args[i]);
			if (i == end)
				break;
			msg.append(" ");
		}

		Config.whiteListMessage = ChatColor.translateAlternateColorCodes('&', msg.toString());
		sender.sendMessage("Successfully changed white-list message to:");
		sender.sendMessage(Config.whiteListMessage);
		return true;
	}
}
