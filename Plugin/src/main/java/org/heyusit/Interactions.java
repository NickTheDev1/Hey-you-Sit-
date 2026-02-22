/*
Copyright (C) 2026 NickTheDev

This file is part of this project, released under the terms of
the GNU General Public License v3.0 or (at your option) any later version.
See the LICENSE file for details.
 */
package org.heyusit;

import org.bukkit.Location;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.block.Action;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.Tag;

public class Interactions implements Listener {
    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            Player player = event.getPlayer();
            Block block = event.getClickedBlock();

            if (Tag.STAIRS.isTagged(block.getType()) || Tag.SLABS.isTagged(block.getType())) {
                player.teleport(block.getLocation());

                Location loc = block.getLocation();
                loc.setY(loc.getY() + 0.5);
                loc.setZ(loc.getZ() + 0.5);
                loc.setX(loc.getX() + 0.5);

                ArmorStand seat = (ArmorStand) player.getWorld().spawnEntity(loc, EntityType.ARMOR_STAND);

                seat.setVisible(false);
                seat.setGravity(false);
                seat.setMarker(true);
                seat.setSmall(true);
                seat.setInvulnerable(true);

                seat.addPassenger(player);

            }
        }
    }
}
