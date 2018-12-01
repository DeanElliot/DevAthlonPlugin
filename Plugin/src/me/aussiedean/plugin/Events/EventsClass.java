package me.aussiedean.plugin.Events;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerJoinEvent;


import me.aussiedean.plugin.Plugin;
import net.minecraft.server.v1_12_R1.Material;

public class EventsClass implements Listener {
	private Plugin plugin = Plugin.getPlugin(Plugin.class);
	private int count;
	
	@EventHandler
	public void onBreak(BlockBreakEvent event) {
		Block block = event.getBlock();
		Player player = event.getPlayer();
		Location b_loc = block.getLocation();
		
		//block.getType().toString().toUpperCase())
		
		
		player.sendMessage(ChatColor.GOLD + "You broke: " + ChatColor.AQUA + block.getType().toString().toUpperCase() + ChatColor.GOLD);
		player.sendMessage(ChatColor.GOLD + "Location:");
		player.sendMessage(ChatColor.BLUE + "World: " + ChatColor.WHITE + b_loc.getWorld().getName());
		player.sendMessage(ChatColor.BLUE + "X: " + ChatColor.WHITE + b_loc.getBlockX());
		player.sendMessage(ChatColor.BLUE + "Y: " + ChatColor.WHITE + b_loc.getBlockY());
		player.sendMessage(ChatColor.BLUE + "Z: " + ChatColor.WHITE + b_loc.getBlockZ());
	}
	
	
	@SuppressWarnings("unlikely-arg-type")
	@EventHandler
	public void onPlace(BlockPlaceEvent event) {
		Block block = event.getBlock();
		Player player = event.getPlayer();
		Location b_loc = block.getLocation();
		
		//block.getType().toString().toUpperCase())
		
		
		player.sendMessage(ChatColor.GOLD + "You placed: " + ChatColor.LIGHT_PURPLE + block.getType().toString().toUpperCase() + ChatColor.GOLD);
		player.sendMessage(ChatColor.GOLD + "Location:");
		player.sendMessage(ChatColor.DARK_BLUE + "World: " + ChatColor.WHITE + b_loc.getWorld().getName());
		player.sendMessage(ChatColor.DARK_BLUE + "X: " + ChatColor.WHITE + b_loc.getBlockX());
		player.sendMessage(ChatColor.DARK_BLUE + "Y: " + ChatColor.WHITE + b_loc.getBlockY());
		player.sendMessage(ChatColor.DARK_BLUE + "Z: " + ChatColor.WHITE + b_loc.getBlockZ());
		
		if (block.getType().equals(Material.TNT)){
			plugin.getConfig().set("User: " + player.getUniqueId() + ".Block_" + count + ".World", block.getWorld().getName());
			plugin.getConfig().set("User: " + player.getUniqueId() + ".Block_ " + count + ".X", b_loc.getBlockX());
			plugin.getConfig().set("User: " + player.getUniqueId() + ".Block_" + count + ".Y", b_loc.getBlockY());
			plugin.getConfig().set("User: " + player.getUniqueId() + ".Block_" + count + ".Z", b_loc.getBlockZ());
			plugin.saveConfig();
			count++;
			
		}
		
	}
    //private CustomItems ci = new CustomItems();
	//@SuppressWarnings({ "static-access" })
	//@EventHandler
	//public void onPunch(PlayerInteractEvent event) {
		//Player player = event.getPlayer();
		//ci.giveItems(player);
	
	public String prefix = (ChatColor.BLUE + "TUTORIAL >>>");
	
	@EventHandler
	public void onJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		
		player.sendMessage(ChatColor.YELLOW + "Welcome back to the server, " + ChatColor.GOLD + player.getName() );
	}
	}
	
	
	

