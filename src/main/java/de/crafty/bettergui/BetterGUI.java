package de.crafty.bettergui;

import de.crafty.bettergui.event.InventoryListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public class BetterGUI {

    private static final String PREFIX = "[BetterGUI] ";

    public static void init(JavaPlugin plugin) {

        Bukkit.getPluginManager().registerEvents(new InventoryListener(), plugin);
        plugin.getLogger().log(Level.INFO, PREFIX + "API initialized");
    }

}
