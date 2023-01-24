package me.evasive.customitems.events;

import me.evasive.customitems.CustomItems;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class Events implements Listener {

    public CustomItems plugin;

    public Events(CustomItems plugin) {
        this.plugin = plugin;
    }
    SetsManager setsManager = new SetsManager();

    @EventHandler
    public void CheckForSet(InventoryClickEvent e) {
        Player player = (Player) e.getWhoClicked();
        Bukkit.getScheduler().runTaskLater(plugin, () -> setsManager.checkSet(player), 10L);
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        Player player = e.getPlayer();
        setsManager.checkSet(player);
    }

    @EventHandler
    public void onHit(EntityDamageByEntityEvent e){
        if (!(e.getEntity() instanceof Player)) return;
        Player player = (Player) e.getEntity();
        if (setsManager.checkValentines(player)) setsManager.HeartBreakAbility(player);
    }

}
