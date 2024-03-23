package io.github.sefiraat.networks.slimefun;

import io.github.sefiraat.networks.Networks;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.researches.Research;
import org.bukkit.NamespacedKey;

import javax.annotation.ParametersAreNonnullByDefault;

public class ResearchSetup {
    public ResearchSetup(){
        register("basic_materials", 0, "Network Items", 69, NetworkSlimefunItems.SYNTHETIC_EMERALD_SHARD, NetworkSlimefunItems.OPTIC_CABLE, NetworkSlimefunItems.OPTIC_GLASS, NetworkSlimefunItems.OPTIC_STAR, NetworkSlimefunItems.SHRINKING_BASE, NetworkSlimefunItems.AI_CORE);
    }

    @ParametersAreNonnullByDefault
    private static void register(String key, int id, String name, int defaultCost, SlimefunItem... items) {
        Research research = new Research(new NamespacedKey(Networks.getInstance(), key), id, name, defaultCost);

        for (SlimefunItem item : items) {

            research.addItems(item);
        }

        research.register();
    }
}