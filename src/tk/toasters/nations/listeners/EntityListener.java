package tk.toasters.nations.listeners;

import org.bukkit.entity.Villager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;
import tk.toasters.nations.Nations;

public class EntityListener implements Listener {
    private final Nations plugin;

    public EntityListener(Nations instance) {
        plugin = instance;
    }

    @EventHandler
    public void onEntitySpawn(EntitySpawnEvent event) {
        if (event.getEntity() instanceof Villager) {
            event.setCancelled(true);
        }
    }
}
