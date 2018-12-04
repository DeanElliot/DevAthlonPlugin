package me.aussiedean.magicalitems;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import Events.Events;
import MagicalItems.MagicalItems;

public class Main extends JavaPlugin {
	
	public void onEnable() {
		getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Magical Items has been enabled");
		getServer().getPluginManager().registerEvents(new Events(), this);
		MagicalItems items = new MagicalItems();
		items.Shapeless();
		items.Shaped();
		items.Horcrux();
		
	    
	}
	
	public void onDisable() {
		getServer().getConsoleSender().sendMessage(ChatColor.RED + "Magical Items had been disabled");
	}

}
