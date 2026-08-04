package org.lesinclair.tutorialmod.registries;

import net.fabricmc.fabric.api.registry.FuelValueEvents;
import org.lesinclair.tutorialmod.item.Moditems;

public class ModFuels {
    public static void registerFuels() {
        FuelValueEvents.BUILD.register((builder, context) -> {
            int baseunit = 200;
            builder.add(Moditems.DORITOS, baseunit * 8);
        });
    }
}
