package fr.skykits.signs;


import java.util.ArrayList;
import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.BlockState;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class LuckyClick implements Listener {

	public LuckyClick(Signs luckySign) {
	}
	
	ArrayList<String> Rose = new ArrayList<String>();
	
	ArrayList<String> Bleu = new ArrayList<String>();
	//HashMap<String> Joueur = new HashMap<String>();
	
	@EventHandler
	public void onClick(PlayerInteractEvent e){
		Player p = e.getPlayer();
		if(e.getAction() == Action.RIGHT_CLICK_BLOCK){
			BlockState block = e.getClickedBlock().getState();
			//on vérifie que le block est un panneaux
			if(block instanceof Sign){
				Sign sign = (Sign) block;
				if(sign.getLine(0).equalsIgnoreCase("[LuckyGames]")){
					if(sign.getLine(1).equalsIgnoreCase("Rejoindre")){
						if(sign.getLine(2).equalsIgnoreCase("[MAP]")){
							if(sign.getLine(3).equalsIgnoreCase("Equipe Rose")){
								p.getInventory().clear();
								Location loc = new Location(Bukkit.getWorld("Faction"),  -1162,  4,  437);
								p.teleport(loc);
								p.sendMessage("§bVous avez rejoint l'équipe §drose. §c(En attente de Lancement...)")
								
							  ItemStack is = new ItemStack(Material.WOOL);
                              ItemMeta im = is.getItemMeta();
            				  im.setDisplayName("§dRejoindre l'équipe Rose");
            				  is.setItemMeta(im);
            				  p.getInventory().setItem(0, is);
            

            				  ItemStack is2 = new ItemStack(Material.WOOD);
            				  ItemMeta im2 = is2.getItemMeta();
            				  im2.setDisplayName("§bRejoindre l'équipe Bleue");
            			      is2.setItemMeta(im2);
            				  p.getInventory().setItem(1, is2);
								
								Block b = e.getClickedBlock();
								if(b.getType().equals(Material.WOOL){
								 Rose.add(p);
								 p.sendMessage("§dVous avez rejoint l'équipe Rose")
								} else {
									Block b = e.getClickedBlock();
								if(b.getType().equals(Material.WOOD)){
								 Bleu.add(p);
								 p.sendMessage("§bVous avez rejoint l'équipe Bleue")

								}
								}
}
	}
	

}
											}
										}
									}
								}
							
							
						}