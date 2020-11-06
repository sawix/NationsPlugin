package tk.toasters.nations;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import tk.toasters.nations.commands.NationsCommand;
import tk.toasters.nations.listeners.EntityListener;

public class Nations extends JavaPlugin {
    private static Nations instance;

    public Nations() {
        instance = this;
    }

    @Override
    public void onEnable() {
        registerCommands();
        registerEvents();
    }

    @Override
    public void onDisable() {

    }

    private void registerCommands() {
        getCommand("nations").setExecutor(new NationsCommand(this));
    }

    private void registerEvents() {
        final PluginManager pluginManager = getServer().getPluginManager();

        pluginManager.registerEvents(new EntityListener(this), this);
    }

}
