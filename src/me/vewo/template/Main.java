package me.vewo.template;

import org.bukkit.plugin.java.JavaPlugin;

import me.vewo.template.commands.BasicCommand;

public class Main extends JavaPlugin {
	
	public void onEnable() {
		cmds(); // remember to call this otherwise the commands wont work!
	}	
	
	public void cmds() {
		getCommand("basic").setExecutor(new BasicCommand(this));
	}
}
