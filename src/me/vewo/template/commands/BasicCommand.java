package me.vewo.template.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.vewo.template.Main;

public class BasicCommand implements CommandExecutor {
	
	private Main plugin;

	public BasicCommand(Main main) {
		this.plugin = plugin;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		sender.sendMessage("Basic Command!");
		return true;
	}

}
