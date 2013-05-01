package co.thelostrealms.me.morestuff;

//Created by HiROs from Thelostrealms.co
//Free to use and copy.

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class MoreStuff extends JavaPlugin {
	String version = "1.0.1";
	int errors = 0;
	@Override
	public void onEnable() {
		this.getLogger().info("MoreStuff has been loaded. Version: " + version + ".");
	}
	@Override
	public void onDisable() {
		this.getLogger().info("MoreStuff has been disable. Errors Found: " + errors + ".");
	}
	//Commands
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		String noperms = ChatColor.DARK_RED + "MoreStuff does not let you do that!";
		//Heal Command
		if(label.equalsIgnoreCase("heal") || label.equalsIgnoreCase("h")) {
			if(!player.hasPermission("morestuff.heal")) {
				player.sendMessage(noperms);
				return false;
			}
			player.setHealth(0);
			player.sendMessage(ChatColor.GREEN + "You have healed yourself!");
		}
		
		return true;
	}
}
