package io.th0rgal.issuedemo;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPhysicsEvent;

public class MushroomBlocksBehaviourListener implements Listener {

    @EventHandler // disable physics for mushroom stem blocks
    private void onBlockPhysic(BlockPhysicsEvent event) {
        if (event.getBlock().getType() == Material.MUSHROOM_STEM
                || event.getSourceBlock().getType() == Material.MUSHROOM_STEM
                || event.getChangedType() == Material.MUSHROOM_STEM)
            event.setCancelled(true);
    }

}
