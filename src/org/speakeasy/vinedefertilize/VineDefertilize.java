package org.speakeasy.vinedefertilize;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockSpreadEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Material;

/**
 *
 * @author Kevin Burress <speakeasysky@me.com>
 */
public class VineDefertilize extends JavaPlugin implements Listener {

    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }
    
    @EventHandler
    public void onBlockSpreadEvent(BlockSpreadEvent event) {
        if(event.getBlock().getType().equals(Material.VINE)) {
            event.setCancelled(true);
        }
    }
}
