package io.github.sefiraat.networks.slimefun;

import io.github.sefiraat.networks.Networks;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.researches.Research;
import org.bukkit.NamespacedKey;

import javax.annotation.ParametersAreNonnullByDefault;

public class ResearchSetup {
    public ResearchSetup(){
        register("basic_materials", 0, "Basic Materials", 69, NetworkSlimefunItems.SYNTHETIC_EMERALD_SHARD, NetworkSlimefunItems.OPTIC_CABLE, NetworkSlimefunItems.OPTIC_GLASS, NetworkSlimefunItems.OPTIC_STAR, NetworkSlimefunItems.SHRINKING_BASE, NetworkSlimefunItems.AI_CORE, NetworkSlimefunItems.SIMPLE_NANOBOTS);
        register("advanced_materials", 1, "Advanced Materials", 69, NetworkSlimefunItems.RADIOACTIVE_OPTIC_STAR, NetworkSlimefunItems.ADVANCED_NANOBOTS, NetworkSlimefunItems.EMPOWERED_AI_CORE, NetworkSlimefunItems.PRISTINE_AI_CORE, NetworkSlimefunItems.INTERDIMENSIONAL_PRESENCE);
        register("basic_inventory", 2, "Basic Storage", 69, NetworkSlimefunItems.NETWORK_CONTROLLER, NetworkSlimefunItems.NETWORK_BRIDGE, NetworkSlimefunItems.NETWORK_CELL, NetworkSlimefunItems.NETWORK_GRID);
        register("more_for_network", 3, "More for Network", 69, NetworkSlimefunItems.NETWORK_VACUUM, NetworkSlimefunItems.NETWORK_GREEDY_BLOCK, NetworkSlimefunItems.NETWORK_TRASH);
        register("network_capacitors", 4, "Capacitors", 69, NetworkSlimefunItems.NETWORK_CAPACITOR_1, NetworkSlimefunItems.NETWORK_CAPACITOR_2, NetworkSlimefunItems.NETWORK_CAPACITOR_3, NetworkSlimefunItems.NETWORK_CAPACITOR_4, NetworkSlimefunItems.NETWORK_POWER_OUTLET_1, NetworkSlimefunItems.NETWORK_POWER_OUTLET_2, NetworkSlimefunItems.NETWORK_POWER_DISPLAY);
        register("basic_automation", 5, "Basic Automations", 69, NetworkSlimefunItems.NETWORK_MONITOR, NetworkSlimefunItems.NETWORK_IMPORT, NetworkSlimefunItems.NETWORK_EXPORT, NetworkSlimefunItems.NETWORK_PUSHER, NetworkSlimefunItems.NETWORK_VANILLA_GRABBER, NetworkSlimefunItems.NETWORK_VANILLA_PUSHER, NetworkSlimefunItems.NETWORK_GRABBER);
        register("auto_craft", 6, "Auto Crafters", 69, NetworkSlimefunItems.CRAFTING_BLUEPRINT, NetworkSlimefunItems.NETWORK_RECIPE_ENCODER, NetworkSlimefunItems.NETWORK_AUTO_CRAFTER, NetworkSlimefunItems.NETWORK_AUTO_CRAFTER_WITHHOLDING, NetworkSlimefunItems.NETWORK_CRAFTING_GRID);
        register("wireless", 7, "Wireless network", 69, NetworkSlimefunItems.NETWORK_WIRELESS_TRANSMITTER, NetworkSlimefunItems.NETWORK_WIRELESS_RECEIVER, NetworkSlimefunItems.NETWORK_REMOTE, NetworkSlimefunItems.NETWORK_REMOTE_EMPOWERED, NetworkSlimefunItems.NETWORK_REMOTE_PRISTINE, NetworkSlimefunItems.NETWORK_REMOTE_ULTIMATE, NetworkSlimefunItems.NETWORK_REMOTE_ULTIMATE_CRAFTING, NetworkSlimefunItems.NETWORK_CRAYON, NetworkSlimefunItems.NETWORK_CONFIGURATOR, NetworkSlimefunItems.NETWORK_RAKE_1, NetworkSlimefunItems.NETWORK_RAKE_2, NetworkSlimefunItems.NETWORK_RAKE_3, NetworkSlimefunItems.NETWORK_PROBE, NetworkSlimefunItems.NETWORK_WIRELESS_CONFIGURATOR);
        register("storages", 8, "Infinity Storages", 69, NetworkSlimefunItems.NETWORK_QUANTUM_WORKBENCH, NetworkSlimefunItems.NETWORK_QUANTUM_STORAGE_1, NetworkSlimefunItems.NETWORK_QUANTUM_STORAGE_2, NetworkSlimefunItems.NETWORK_QUANTUM_STORAGE_3, NetworkSlimefunItems.NETWORK_QUANTUM_STORAGE_4, NetworkSlimefunItems.NETWORK_QUANTUM_STORAGE_5, NetworkSlimefunItems.NETWORK_QUANTUM_STORAGE_6, NetworkSlimefunItems.NETWORK_QUANTUM_STORAGE_7, NetworkSlimefunItems.NETWORK_QUANTUM_STORAGE_8);
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