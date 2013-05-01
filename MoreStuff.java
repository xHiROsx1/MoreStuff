package co.thelostrealms.me.morestuff;

//Created by HiROs from Thelostrealms.co
//Free to use and copy.

import org.bukkit.plugin.java.JavaPlugin;

public class MoreStuff extends JavaPlugin {
  String version = "1.0";
	int errors = 0;
	@Override
	public void onEnable() {
		this.getLogger().info("MoreStuff has been loaded. Version: " + version + ".");
	}
	@Override
	public void onDisable() {
		this.getLogger().info("MoreStuff has been disable. Errors Found: " + errors + ".");
	}
}
