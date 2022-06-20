package de.crafty.bettergui.api;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;

public class InventoryGUI {

    private static final ArrayList<InventoryGUI> INVENTORY_CACHE = new ArrayList<>();


    private final Player player;
    private final Inventory inventory;
    public InventoryState state;


    public InventoryGUI(Player player, int size, String title, InventoryState initialState) {

        INVENTORY_CACHE.add(this);

        this.player = player;
        this.inventory = Bukkit.createInventory(null, size, title);
        this.state = initialState;
        this.updateState();

        this.player.openInventory(this.inventory);
    }


    public void onClick(Player player, ItemStack clickedStack, int slot) {
    }

    public void onOpen(Player player) {

    }

    public void onClose(Player player) {

    }

    public void changeState(InventoryState newState) {
        this.state = newState;
        this.updateState();
    }

    public void updateState() {
        this.inventory.setContents(this.state.getContent());
    }

    public void removeFromCache() {
        INVENTORY_CACHE.remove(this);
    }


    public static InventoryGUI of(Player player) {
        for (InventoryGUI inv : INVENTORY_CACHE) {
            if (inv.player.equals(player))
                return inv;
        }
        return null;
    }

}
