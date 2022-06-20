package de.crafty.bettergui.plugin.gui.state;

import de.crafty.bettergui.api.InventoryGUI;
import de.crafty.bettergui.api.InventoryState;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class TestState extends InventoryState {


    private TestState(String id, Player viewer) {
        super(9 * 5, "test." + id, viewer);
    }

    public static class Menu extends TestState {

        public Menu(Player viewer) {
            super("menu", viewer);
        }

        @Override
        public void init() {

            this.setItem(0, new ItemStack(Material.ACACIA_BOAT));
            this.setItem(1, new ItemStack(Material.OBSIDIAN));
            this.setItem(2, new ItemStack(Material.CRYING_OBSIDIAN));

        }
    }

    public static class AnotherState extends TestState {

        public AnotherState(Player viewer) {
            super("another", viewer);
        }

        @Override
        public void init() {

            this.setItem(5, new ItemStack(Material.LILY_PAD));
            this.setItem(6, new ItemStack(Material.BAMBOO));
            this.setItem(7, new ItemStack(Material.HAY_BLOCK));

        }
    }
}
