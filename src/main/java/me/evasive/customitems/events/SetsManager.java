package me.evasive.customitems.events;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.awt.*;
import java.util.*;

public class SetsManager {

    private final Map<UUID, PlayerBonus> playerAbilities;

    public SetsManager() {
        this.playerAbilities = new HashMap<>();
    }


    public void checkSet(Player player) {
        PlayerBonus playerBonus;
        if (!playerAbilities.containsKey(player.getUniqueId())) {
            playerBonus = new PlayerBonus();
            playerAbilities.put(player.getUniqueId(), playerBonus);
        }
        playerBonus = playerAbilities.get(player.getUniqueId());
        ItemStack helmet = player.getInventory().getHelmet();
        ItemStack chestplate = player.getInventory().getChestplate();
        ItemStack leggings = player.getInventory().getLeggings();
        ItemStack boots = player.getInventory().getBoots();
        if (helmet != null && helmet.hasItemMeta() && Objects.requireNonNull(helmet.getItemMeta()).hasCustomModelData() && chestplate != null && chestplate.hasItemMeta() && Objects.requireNonNull(chestplate.getItemMeta()).hasCustomModelData() && leggings != null && leggings.hasItemMeta() && Objects.requireNonNull(leggings.getItemMeta()).hasCustomModelData() && boots != null && boots.hasItemMeta() && Objects.requireNonNull(boots.getItemMeta()).hasCustomModelData()){
                if (!playerBonus.valentines) {
                    playerBonus.valentines = true;
                    player.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 9999999, 0, true));
                    player.sendMessage("Valentines Set Equipped");
                }
            } else {
                if (playerBonus.valentines) {
                    playerBonus.valentines = false;
                    player.removePotionEffect(PotionEffectType.HEALTH_BOOST);
                    player.sendMessage("Valentines Set Unequipped");
                }
            }
        playerAbilities.put(player.getUniqueId(), playerBonus);
    }

    public boolean checkValentines(Player player) {
        if (playerAbilities.get(player.getUniqueId()).valentines)
            return true;
        return false;
    }

    public void HeartBreakAbility(Player player) {
        Random rand = new Random();
        int chance = rand.nextInt(100) + 1;
        if (chance <= 5) {
            player.sendMessage(ChatColor.of(Color.PINK) + "Heart Break");
            player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 100, 0, true));
        }
    }

}
