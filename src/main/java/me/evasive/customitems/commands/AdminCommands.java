package me.evasive.customitems.commands;

import me.evasive.customitems.CustomItems;
import me.evasive.customitems.item_creators.valentines_items.Valentines_Items;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class AdminCommands implements CommandExecutor {

    public CustomItems plugin;

    public AdminCommands(CustomItems plugin){
        this.plugin = plugin;
        plugin.getCommand("items").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){
            Player player = (Player) sender;
            if (sender.hasPermission("CustomItems.admin")){
                if (args.length == 2){
                    if(args[0].equals("give")){
                        if (args[1].equals("valentines_helmet")){
                            player.getInventory().addItem(Valentines_Items.valentines_helmet_d);
                            return true;
                        }else if (args[1].equals("valentines_chestplate")){
                            player.getInventory().addItem(Valentines_Items.valentines_chestplate_d);
                            return true;
                        }else if (args[1].equals("valentines_leggings")){
                            player.getInventory().addItem(Valentines_Items.valentines_leggings_d);
                            return true;
                        }else if (args[1].equals("valentines_boots")){
                            player.getInventory().addItem(Valentines_Items.valentines_boots_d);
                            return true;
                        }else if (args[1].equals("valentines_sword")){
                            player.getInventory().addItem(Valentines_Items.valentines_sword_d);
                            return true;
                        }
                    }
                }
            }else{
                player.sendMessage(ChatColor.RED + "You do not have permission to use this command");
                return true;
            }
        }else{
            sender.sendMessage("Must be type player");
            return true;
        }
        return false;
    }
}
