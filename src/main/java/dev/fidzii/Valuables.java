package dev.fidzii;

import dev.fidzii.registry.AllAttributes;
import dev.fidzii.registry.AllEntities;
import dev.fidzii.registry.AllItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Valuables implements ModInitializer {

    public static final String MOD_ID = "valuables";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {

        AllItems.registerItems();
        AllAttributes.registerAttributes();
        AllEntities.registerEntities();
    }
}