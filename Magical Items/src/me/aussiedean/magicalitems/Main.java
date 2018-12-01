package me.aussiedean.magicalitems;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import MagicalItems.MagicalItems;

public class Main extends JavaPlugin {
	
	public void onEnable() {
		getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Magical Items has been enabled");
		MagicalItems items = new MagicalItems();
		items.customRecipe();
		
	    
	}
	
	public void onDisable() {
		getServer().getConsoleSender().sendMessage(ChatColor.RED + "Magical Items had been disabled");
	}

}
