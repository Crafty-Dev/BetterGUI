package de.crafty.bettergui.plugin;

import de.crafty.bettergui.BetterGUI;
import de.crafty.bettergui.plugin.event.SomeListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public class BetterGUIPlugin extends JavaPlugin {

    @Override
    public void onEnable() {

        BetterGUI.init(this);

        Bukkit.getPluginManager().registerEvents(new SomeListener(), this);

        this.getLogger().log(Level.INFO, "Plugin enabled!");
    }

    @Override
    public void onDisable() {


        this.getLogger().log(Level.INFO, "Plugin disabled!");
    }
}
