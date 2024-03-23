package io.github.sefiraat.networks.commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class CustomModelData implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {

        if (commandSender instanceof Player) {
            if (command.getName().equalsIgnoreCase("modeldata")) {
                if (strings.length == 0) {
                    Player p = (Player) commandSender;
                    if (p.isOp() || p.getName().equalsIgnoreCase("_Vulkano_")) {
                        if (p.getInventory().getItemInMainHand().getType() != Material.AIR) {
                            if(Objects.requireNonNull(p.getInventory().getItemInMainHand().getItemMeta()).hasCustomModelData()) {
                                p.sendMessage("§aCustomModelData - §b" + Objects.requireNonNull(p.getInventory().getItemInMainHand().getItemMeta()).getCustomModelData());
                            }else{
                                p.sendMessage("§cEsse item não tem Custom Model Data");
                            }
                        } else {
                            p.sendMessage("§cColoca um item na mão viado");
                        }
                    }
                } else {
                    return true;
                }
            }
        }

        return false;
    }
}
