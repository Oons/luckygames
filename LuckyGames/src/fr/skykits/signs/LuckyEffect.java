package fr.skykits.signs;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class LuckyEffect implements Listener {
	
	public LuckyEffect(Signs luckySign) {
		
	}

	@EventHandler
	public void OnBreak(BlockBreakEvent e){
		
		Block b = e.getBlock();
		if(b.equals(Material.SPONGE)){
			Player p = e.getPlayer();
            PotionEffect pej = new PotionEffect(PotionEffectType.JUMP, 400, 4);
            PotionEffect pes = new PotionEffect(PotionEffectType.SPEED, 400, 5);
            PotionEffect pep = new PotionEffect(PotionEffectType.POISON, 400, 5);
            p.addPotionEffect(pep);
		}
	}

}