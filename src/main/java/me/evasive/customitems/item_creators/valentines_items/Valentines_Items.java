package me.evasive.customitems.item_creators.valentines_items;


import net.md_5.bungee.api.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.awt.*;
import java.util.ArrayList;

public class Valentines_Items {

    public static ItemStack valentines_helmet_d;
    public static ItemStack valentines_chestplate_d;
    public static ItemStack valentines_leggings_d;
    public static ItemStack valentines_boots_d;
    public static ItemStack valentines_sword_d;

    public static void init(){
        Create_valentines_helmet_d();
        Create_valentines_chestplate_d();
        Create_valentines_leggings_d();
        Create_valentines_boots_d();
        Create_valentines_sword_d();
    }

    private static void Create_valentines_helmet_d(){
        ItemStack temp_helmet = new ItemStack(Material.DIAMOND_HELMET);
        ItemMeta temp_meta = temp_helmet.getItemMeta();
        temp_meta.setDisplayName(ChatColor.of(Color.PINK) + "" + ChatColor.BOLD + "Valentines Helmet");
        ArrayList temp_lore = new ArrayList();
        temp_lore.add(ChatColor.DARK_GRAY + "2022 Valentines");
        temp_lore.add("");
        temp_lore.add(ChatColor.of(Color.WHITE) + "" + ChatColor.BOLD + "Full Set Bonus:");
        temp_lore.add(ChatColor.of(Color.PINK) + "(Requires Full Set)");
        temp_lore.add(ChatColor.of(Color.PINK) + "- +4 HP");
        temp_lore.add(ChatColor.of(Color.PINK) + "- Beloved");
        temp_lore.add(ChatColor.GRAY + "(Chance when attacked to gain regeneration 1 for 5 seconds)");
        temp_meta.setLore(temp_lore);
        temp_meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
        temp_meta.addEnchant(Enchantment.DURABILITY, 4, true);
        temp_helmet.setItemMeta(temp_meta);
        ItemMeta model_meta = temp_helmet.getItemMeta();
        model_meta.setCustomModelData(55440);
        temp_helmet.setItemMeta(model_meta);
        valentines_helmet_d = temp_helmet;
    }

    private static void Create_valentines_chestplate_d(){
        ItemStack temp_chestplate = new ItemStack(Material.DIAMOND_CHESTPLATE);
        ItemMeta temp_meta = temp_chestplate.getItemMeta();
        temp_meta.setDisplayName(ChatColor.of(Color.PINK) + "" + ChatColor.BOLD + "Valentines Chestplate");
        ArrayList temp_lore = new ArrayList();
        temp_lore.add(ChatColor.DARK_GRAY + "2022 Valentines");
        temp_lore.add("");
        temp_lore.add(ChatColor.of(Color.WHITE) + "" + ChatColor.BOLD + "Full Set Bonus:");
        temp_lore.add(ChatColor.of(Color.PINK) + "(Requires Full Set)");
        temp_lore.add(ChatColor.of(Color.PINK) + "- +4 HP");
        temp_lore.add(ChatColor.of(Color.PINK) + "- Beloved");
        temp_lore.add(ChatColor.GRAY + "(Chance when attacked to gain regeneration 1 for 5 seconds)");
        temp_meta.setLore(temp_lore);
        temp_meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
        temp_meta.addEnchant(Enchantment.DURABILITY, 4, true);
        temp_chestplate.setItemMeta(temp_meta);
        ItemMeta model_meta = temp_chestplate.getItemMeta();
        model_meta.setCustomModelData(55440);
        temp_chestplate.setItemMeta(model_meta);
        valentines_chestplate_d = temp_chestplate;
    }

    private static void Create_valentines_leggings_d(){
        ItemStack temp_leggings = new ItemStack(Material.DIAMOND_LEGGINGS);
        ItemMeta temp_meta = temp_leggings.getItemMeta();
        temp_meta.setDisplayName(ChatColor.of(Color.PINK) + "" + ChatColor.BOLD + "Valentines Leggings");
        ArrayList temp_lore = new ArrayList();
        temp_lore.add(ChatColor.DARK_GRAY + "2022 Valentines");
        temp_lore.add("");
        temp_lore.add(ChatColor.of(Color.WHITE) + "" + ChatColor.BOLD + "Full Set Bonus:");
        temp_lore.add(ChatColor.of(Color.PINK) + "(Requires Full Set)");
        temp_lore.add(ChatColor.of(Color.PINK) + "- +4 HP");
        temp_lore.add(ChatColor.of(Color.PINK) + "- Beloved");
        temp_lore.add(ChatColor.GRAY + "(Chance when attacked to gain regeneration 1 for 5 seconds)");
        temp_meta.setLore(temp_lore);
        temp_meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
        temp_meta.addEnchant(Enchantment.DURABILITY, 4, true);
        temp_leggings.setItemMeta(temp_meta);
        ItemMeta model_meta = temp_leggings.getItemMeta();
        model_meta.setCustomModelData(55440);
        temp_leggings.setItemMeta(model_meta);
        valentines_leggings_d = temp_leggings;
    }

    private static void Create_valentines_boots_d(){
        ItemStack temp_boots = new ItemStack(Material.DIAMOND_BOOTS);
        ItemMeta temp_meta = temp_boots.getItemMeta();
        temp_meta.setDisplayName(ChatColor.of(Color.PINK) + "" + ChatColor.BOLD + "Valentines Boots");
        ArrayList temp_lore = new ArrayList();
        temp_lore.add(ChatColor.DARK_GRAY + "2022 Valentines");
        temp_lore.add("");
        temp_lore.add(ChatColor.of(Color.WHITE) + "" + ChatColor.BOLD + "Full Set Bonus:");
        temp_lore.add(ChatColor.of(Color.PINK) + "(Requires Full Set)");
        temp_lore.add(ChatColor.of(Color.PINK) + "- +4 HP");
        temp_lore.add(ChatColor.of(Color.PINK) + "- Beloved");
        temp_lore.add(ChatColor.GRAY + "(Chance when attacked to gain regeneration 1 for 5 seconds)");
        temp_meta.setLore(temp_lore);
        temp_meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
        temp_meta.addEnchant(Enchantment.DURABILITY, 4, true);
        temp_boots.setItemMeta(temp_meta);
        ItemMeta model_meta = temp_boots.getItemMeta();
        model_meta.setCustomModelData(55440);
        temp_boots.setItemMeta(model_meta);
        valentines_boots_d = temp_boots;
    }

    private static void Create_valentines_sword_d(){
        ItemStack temp_sword = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta temp_meta = temp_sword.getItemMeta();
        temp_meta.setDisplayName(ChatColor.of(Color.PINK) + "" + ChatColor.BOLD + "Valentines Sword");
        ArrayList temp_lore = new ArrayList();
        temp_lore.add(ChatColor.DARK_GRAY + "2022 Valentines");
        temp_lore.add("");
        temp_lore.add(ChatColor.of(Color.PINK) + "- HeartBreak");
        temp_lore.add(ChatColor.GRAY + "(Chance to give enemy player weakness)");
        temp_meta.setLore(temp_lore);
        temp_meta.addEnchant(Enchantment.DAMAGE_ALL, 6, true);
        temp_meta.addEnchant(Enchantment.DURABILITY, 4, true);
        temp_sword.setItemMeta(temp_meta);
        ItemMeta model_meta = temp_sword.getItemMeta();
        model_meta.setCustomModelData(55440);
        temp_sword.setItemMeta(model_meta);
        valentines_sword_d = temp_sword;
    }
}
