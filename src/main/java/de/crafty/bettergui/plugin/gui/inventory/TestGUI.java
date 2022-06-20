package de.crafty.bettergui.plugin.gui.inventory;

import de.crafty.bettergui.api.InventoryGUI;
import de.crafty.bettergui.api.InventoryState;
import de.crafty.bettergui.plugin.gui.state.TestState;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class TestGUI extends InventoryGUI {


    public TestGUI(Player player) {
        super(player, 9 * 5, "Test", new TestState.Menu(player));
    }


    @Override
    public void onOpen(Player player) {
        player.sendMessage("\u00a76You opened me!");
    }

    @Override
    public void onClick(Player player, ItemStack clickedStack, int slot) {
        player.sendMessage("You clicked slot " + slot + " with item " + clickedStack);

        if(slot == 43 && "test.menu".equals(state.id))
            this.changeState(new TestState.AnotherState(player));

        this.state.setItem(slot, new ItemStack(Material.STONE_PICKAXE));

        this.updateState();
    }

    @Override
    public void onClose(Player player) {
        player.sendMessage("\u00a76You closed me!");
    }
}
