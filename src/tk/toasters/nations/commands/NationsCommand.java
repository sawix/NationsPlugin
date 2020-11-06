package tk.toasters.nations.commands;

import org.bukkit.Color;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import tk.toasters.nations.Nations;

public class NationsCommand implements CommandExecutor {
    private static Nations plugin;

    public NationsCommand(Nations instance) {
        plugin = instance;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (label.equalsIgnoreCase("ping")) {
            sender.sendMessage(Color.YELLOW + "pong!");
            return true;
        }

        return false;
    }
}
