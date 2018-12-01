package CustomItems;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;

import me.aussiedean.plugin.Plugin;

public class CustomInventory implements Listener {
	
	private Plugin plugin = Plugin.getPlugin(Plugin.class);
	
	public void newInventory(Player player) {
		Inventory i = plugin.getServer().createInventory(null , 9, ChatColor.DARK_GREEN + "Custom Inventory");
		player.openInventory(i);
	}

}
