package fr.skykits.lb;

import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import fr.skykits.lb.event.EventSponge;

public class Main extends JavaPlugin implements Listener{

	@Override
	public void onEnable() {
		PluginManager pm = (PluginManager) getServer().getPluginManager();
		pm.registerEvents(new EventSponge(), this);
	
	}
	
	@Override
	public void onDisable() {
		
	}

}
