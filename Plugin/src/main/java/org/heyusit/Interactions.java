/*
Copyright (C) 2026 NickTheDev

This file is part of this project, released under the terms of
the GNU General Public License v3.0 or (at your option) any later version.
See the LICENSE file for details.
 */
package org.heyusit;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.BlockState;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.block.Action;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

public class Interactions implements Listener {
    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            Player player = event.getPlayer();
            Block block = event.getClickedBlock();

            if (
                    // STAIRS
                    block.getType() == Material.OAK_STAIRS ||
                            block.getType() == Material.SPRUCE_STAIRS ||
                            block.getType() == Material.BIRCH_STAIRS ||
                            block.getType() == Material.JUNGLE_STAIRS ||
                            block.getType() == Material.ACACIA_STAIRS ||
                            block.getType() == Material.DARK_OAK_STAIRS ||

                            block.getType() == Material.COBBLESTONE_STAIRS ||
                            block.getType() == Material.MOSSY_COBBLESTONE_STAIRS ||
                            block.getType() == Material.STONE_STAIRS ||

                            block.getType() == Material.STONE_BRICK_STAIRS ||
                            block.getType() == Material.MOSSY_STONE_BRICK_STAIRS ||

                            block.getType() == Material.BRICK_STAIRS ||
                            block.getType() == Material.SANDSTONE_STAIRS ||
                            block.getType() == Material.SMOOTH_SANDSTONE_STAIRS ||
                            block.getType() == Material.RED_SANDSTONE_STAIRS ||
                            block.getType() == Material.SMOOTH_RED_SANDSTONE_STAIRS ||

                            block.getType() == Material.QUARTZ_STAIRS ||
                            block.getType() == Material.PURPUR_STAIRS ||
                            block.getType() == Material.PRISMARINE_STAIRS ||
                            block.getType() == Material.PRISMARINE_BRICK_STAIRS ||
                            block.getType() == Material.DARK_PRISMARINE_STAIRS ||

                            block.getType() == Material.NETHER_BRICK_STAIRS ||
                            block.getType() == Material.RED_NETHER_BRICK_STAIRS ||
                            block.getType() == Material.BLACKSTONE_STAIRS ||
                            block.getType() == Material.POLISHED_BLACKSTONE_STAIRS ||
                            block.getType() == Material.POLISHED_BLACKSTONE_BRICK_STAIRS ||

                            block.getType() == Material.END_STONE_BRICK_STAIRS ||
                            block.getType() == Material.DEEPSLATE_BRICK_STAIRS ||
                            block.getType() == Material.DEEPSLATE_TILE_STAIRS ||
                            block.getType() == Material.POLISHED_DEEPSLATE_STAIRS ||
                            block.getType() == Material.COBBLED_DEEPSLATE_STAIRS ||

                    // SLABS
                            block.getType() == Material.OAK_SLAB ||
                            block.getType() == Material.SPRUCE_SLAB ||
                            block.getType() == Material.BIRCH_SLAB ||
                            block.getType() == Material.JUNGLE_SLAB ||
                            block.getType() == Material.ACACIA_SLAB ||
                            block.getType() == Material.DARK_OAK_SLAB ||

                            block.getType() == Material.STONE_SLAB ||
                            block.getType() == Material.SMOOTH_STONE_SLAB ||
                            block.getType() == Material.COBBLESTONE_SLAB ||
                            block.getType() == Material.MOSSY_COBBLESTONE_SLAB ||

                            block.getType() == Material.STONE_BRICK_SLAB ||
                            block.getType() == Material.MOSSY_STONE_BRICK_SLAB ||
                            block.getType() == Material.BRICK_SLAB ||

                            block.getType() == Material.SANDSTONE_SLAB ||
                            block.getType() == Material.SMOOTH_SANDSTONE_SLAB ||
                            block.getType() == Material.RED_SANDSTONE_SLAB ||
                            block.getType() == Material.SMOOTH_RED_SANDSTONE_SLAB ||

                            block.getType() == Material.QUARTZ_SLAB ||
                            block.getType() == Material.PURPUR_SLAB ||
                            block.getType() == Material.PRISMARINE_SLAB ||
                            block.getType() == Material.PRISMARINE_BRICK_SLAB ||
                            block.getType() == Material.DARK_PRISMARINE_SLAB ||

                            block.getType() == Material.NETHER_BRICK_SLAB ||
                            block.getType() == Material.RED_NETHER_BRICK_SLAB ||
                            block.getType() == Material.BLACKSTONE_SLAB ||
                            block.getType() == Material.POLISHED_BLACKSTONE_SLAB ||
                            block.getType() == Material.POLISHED_BLACKSTONE_BRICK_SLAB ||

                            block.getType() == Material.END_STONE_BRICK_SLAB ||
                            block.getType() == Material.DEEPSLATE_BRICK_SLAB ||
                            block.getType() == Material.DEEPSLATE_TILE_SLAB ||
                            block.getType() == Material.POLISHED_DEEPSLATE_SLAB ||
                            block.getType() == Material.COBBLED_DEEPSLATE_SLAB

            ) {
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
