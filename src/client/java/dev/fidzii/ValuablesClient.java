package dev.fidzii;

import dev.fidzii.registry.AllRenderers;
import net.fabricmc.api.ClientModInitializer;

public class ValuablesClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        AllRenderers.registerAllRenderers();
    }
}