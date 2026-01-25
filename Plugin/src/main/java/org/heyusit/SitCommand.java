/*
Copyright (C) 2026 NickTheDev

This file is part of this project, released under the terms of
the GNU General Public License v3.0 or (at your option) any later version.
See the LICENSE file for details.
 */
package org.heyusit;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public class SitCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel,String[] args) {
        if (!(sender instanceof Player player)) return false;
        if (!player.isOnGround()) return false;

        Location loc = player.getLocation().clone();
        loc.setY(loc.getY());

        ArmorStand seat = (ArmorStand) player.getWorld().spawnEntity(loc, EntityType.ARMOR_STAND);

        seat.setVisible(false);
        seat.setGravity(false);
        seat.setMarker(true);
        seat.setSmall(true);
        seat.setInvulnerable(true);

        seat.addPassenger(player);

        return false;
    }
}
