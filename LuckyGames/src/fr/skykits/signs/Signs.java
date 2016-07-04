package fr.skykits.signs;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import fr.skykits.signs.LuckyClick;
import fr.skykits.signs.Gamestate;

public class Signs extends JavaPlugin implements Listener {
	
	public void onEnable(){
		System.out.println("[LuckySign] >> ON");
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(new LuckyClick(this), this);
		pm.registerEvents(new LuckyEffect(this), this);
	}
	
	public void onDisable(){
		System.out.println("[LuckySign] >> OFF");
	}
	
	public void onStart(){
		Gamestate.setState(Gamestate.LOBBY);
		Bukkit.getWorld("Faction").setPVP(false); // Faction = serveur test
			
		}
}

