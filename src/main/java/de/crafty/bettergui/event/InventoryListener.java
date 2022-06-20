package de.crafty.bettergui.event;

import de.crafty.bettergui.api.InventoryGUI;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.inventory.InventoryOpenEvent;

public class InventoryListener implements Listener {


    @EventHandler
    public void onOpen(InventoryOpenEvent event) {

        InventoryGUI inv = InventoryGUI.of((Player) event.getPlayer());

        if (inv != null)
            inv.onOpen((Player) event.getPlayer());

    }

    @EventHandler
    public void onClose(InventoryCloseEvent event) {

        InventoryGUI inv = InventoryGUI.of((Player) event.getPlayer());

        if (inv == null)
            return;

        inv.onClose((Player) event.getPlayer());
        inv.removeFromCache();
    }

    @EventHandler
    public void onClick(InventoryClickEvent event) {

        InventoryGUI inv = InventoryGUI.of((Player) event.getWhoClicked());
        if (inv == null)
            return;

        event.setCancelled(true);
        inv.onClick((Player) event.getWhoClicked(), event.getCurrentItem(), event.getSlot());

    }

}
