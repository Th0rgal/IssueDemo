package io.th0rgal.issuedemo;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class IssueDemoPlugin extends JavaPlugin {

    public void onEnable() {
        Bukkit.getPluginManager().registerEvents
                (new MushroomBlocksBehaviourListener(), this);
    }

}
