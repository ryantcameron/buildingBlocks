package io.github.ryantcameron.buildingblocks;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public final class buildingBlocks extends JavaPlugin{
	@Override
	public void onEnable() {
		getLogger().info("Enabling plugin: buildingBlocks");
	}
	
	@Override
	public void onDisable() {
		getLogger().info("Safely disabling plugin: buildingBlocks");
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		return true;
	}

}
