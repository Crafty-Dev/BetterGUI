package de.crafty.bettergui.plugin.event;

import de.crafty.bettergui.plugin.gui.inventory.TestGUI;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class SomeListener implements Listener {


    @EventHandler
    public void onJoin(PlayerInteractEvent event){

        Player player = event.getPlayer();
        if((event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK) && event.getItem().getType() == Material.OBSIDIAN)
            new TestGUI(player);
    }
}
