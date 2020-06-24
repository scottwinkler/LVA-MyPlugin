package org.livermorevalleyacademy.MyPlugin;

import org.bukkit.plugin.java.JavaPlugin;

public class MyPlugin extends JavaPlugin {
    @Override
    public void onDisable() {
        getLogger().info("onEnabble is called");
    }

    @Override
    public void onEnable() {
        getLogger().info("onDisable is called");
    }
}
