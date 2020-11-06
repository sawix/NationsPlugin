package tk.toasters.Nations;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {

    }

    @Override
    public void onDisable() {

    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (label.equalsIgnoreCase("ping")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;

                if (player.hasPermission("ping.use")) {
                    sender.sendMessage(ChatColor.YELLOW + "pong!");
                    return true;
                }

                player.sendMessage("You don't have permission to use this command!");
            } else {
                sender.sendMessage("pong!");
            }

            return true;
        }

        return false;
    }
}
