/*
Copyright (C) 2026 NickTheDev

This file is part of this project, released under the terms of
the GNU General Public License v3.0 or (at your option) any later version.
See the LICENSE file for details.
 */
package org.heyusit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        int pluginId = 29047;
        Metrics metrics = new Metrics(this, pluginId);

        getLogger().info("It works");
        getCommand("sit").setExecutor(new SitCommand());
        getServer().getPluginManager().registerEvents(new Interactions(), this);
    }

    @Override
    public void onDisable() {
        getLogger().info("Bye ;(");
    }
}
