package de.crafty.bettergui.api;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class InventoryState {

    private final ItemStack[] content;
    private final Player viewer;
    public final String id;

    public InventoryState(int size, String id, Player viewer) {
        this.content = new ItemStack[size];
        this.id = id;
        this.viewer = viewer;
        this.init();
    }


    public void init() {

    }

    public void setItem(int i, ItemStack stack) {
        if (this.content.length <= i)
            throw new IllegalStateException("Inventory State does not support slot with id " + i);

        this.content[i] = stack;
    }

    public ItemStack[] getContent() {
        return this.content;
    }

    public Player getViewer() {
        return viewer;
    }

    public String getId() {
        return this.id;
    }

    public ItemStack getStack(int index) {
        if (this.content.length <= index)
            return null;

        return this.content[index];
    }
}
