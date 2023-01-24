package me.evasive.customitems;

import me.evasive.customitems.commands.AdminCommands;
import me.evasive.customitems.events.Events;
import me.evasive.customitems.item_creators.valentines_items.Valentines_Items;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class CustomItems extends JavaPlugin {

    @Override
    public void onEnable() {
        Valentines_Items.init();
        getServer().getPluginManager().registerEvents(new Events(this), this);
        new AdminCommands(this);
        getServer().getConsoleSender().sendMessage(ChatColor.AQUA + "Custom Items Loaded");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getServer().getConsoleSender().sendMessage(ChatColor.AQUA + "Custom Items Shutdown");
    }
}
