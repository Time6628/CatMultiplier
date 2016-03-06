package com.kookykraftmc.cmutli;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by TimeTheCat on 3/5/2016.
 */
public class CMulti extends JavaPlugin {
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new MultiCat(), this);
    }
}
