package com.kookykraftmc.cmutli;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

/**
 * Created by TimeTheCat on 3/5/2016.
 */
public class MultiCat implements Listener {
    Integer x;
    @EventHandler
    public void onSpawn(CreatureSpawnEvent e) {
        LivingEntity le = e.getEntity();
        Location loc = le.getLocation();
        World w = loc.getWorld();
        if (le.getType() == EntityType.OCELOT) {
            for (x=0;x<=10;) {
                w.spawnEntity(loc, EntityType.OCELOT);
            }
        }
    }
}
