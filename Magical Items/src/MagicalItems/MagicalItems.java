package MagicalItems;

import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

import me.aussiedean.magicalitems.Main;

public class MagicalItems implements Listener {
	
	private Plugin plugin = Main.getPlugin(Main.class);
	

	
	
	public void Shapeless() {
		ItemStack item = new ItemStack(Material.TOTEM);
		ItemMeta meta = item.getItemMeta();
		
		
		

		
			meta.setDisplayName(ChatColor.AQUA + "Resurrection Stone");
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.WHITE + "Resurrects you when you die, once");
			meta.setLore(lore);
			item.setItemMeta(meta);
			meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);


		ShapelessRecipe rezstone = new ShapelessRecipe(new NamespacedKey(plugin, "resurrection-stone"), item);
		
	    rezstone.addIngredient(1,Material.GOLD_BLOCK);
	    rezstone.addIngredient(1,Material.DIAMOND_BLOCK);
	    rezstone.addIngredient(1,Material.EMERALD_BLOCK);
	    rezstone.addIngredient(1,Material.IRON_BLOCK);
	    rezstone.addIngredient(1,Material.FIREBALL);
	    rezstone.addIngredient(1,Material.STONE);
	    rezstone.addIngredient(1,Material.END_ROD);
	    rezstone.addIngredient(1,Material.ENDER_STONE);
	    rezstone.addIngredient(1,Material.ENDER_PEARL);
	    
	    plugin.getServer().addRecipe(rezstone);
	
	}
	public void Shaped() {
		ItemStack item = new ItemStack(Material.ELYTRA);
		ItemMeta meta = item.getItemMeta();
		
		
		

		
			meta.setDisplayName(ChatColor.AQUA + "Invisibility Cloak");
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.WHITE + "Will render you completely invisible for 5 minutes");
			meta.setLore(lore);
			item.setItemMeta(meta);
			meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);


		ShapedRecipe invcloak = new ShapedRecipe(new NamespacedKey(plugin, "invisibility-cloak"), item);
		
		invcloak.shape("xxx", "x#x", "xxx");
	    invcloak.setIngredient('#', Material.ELYTRA);
	    invcloak.setIngredient('x', Material.DIAMOND_BLOCK);
	    
	    plugin.getServer().addRecipe(invcloak);
		
	}
	public void Horcrux() {
		ItemStack item = new ItemStack(Material.TOTEM);
		ItemMeta meta = item.getItemMeta();
		
		
		

		
			meta.setDisplayName(ChatColor.AQUA + "Horcrux");
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.WHITE + "If you hold it, you will revive when dying. When you die, it will break");
			meta.setLore(lore);
			item.setItemMeta(meta);
			meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);


		ShapedRecipe horcrux = new ShapedRecipe(new NamespacedKey(plugin, "horcrux"), item);
		
		horcrux.shape("xzx", "z#z", "xzx");
	    horcrux.setIngredient('#', Material.SKULL_ITEM);
	    horcrux.setIngredient('x', Material.BONE);
	    horcrux.setIngredient('z', Material.DIAMOND);
	    
	    plugin.getServer().addRecipe(horcrux);
		
	}
}
