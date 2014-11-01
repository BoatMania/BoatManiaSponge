package me.boatmania.BoatManiaSponge;

import org.apache.logging.log4j.Logger;
import org.spongepowered.api.event.SpongeEventHandler;
import org.spongepowered.api.event.state.PreInitializationEvent;
import org.spongepowered.api.event.state.ServerStoppingEvent;
import org.spongepowered.api.plugin.Plugin;

@Plugin(id = "BoatManiaSponge", name = "BoatManiaSponge", version = "1.0")
public class BoatManiaSponge {
    private Logger log;

    @SpongeEventHandler
    public void onInit(PreInitializationEvent event) {
        log = event.getPluginLog();
        log.info("BoatManiaSponge enabled.");
    }

    @SpongeEventHandler
    public void onStop(ServerStoppingEvent event) {
        log.info("BoatManiaSponge disabled.");
    }
}
