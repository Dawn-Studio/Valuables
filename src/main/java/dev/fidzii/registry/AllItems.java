package dev.fidzii.registry;

import dev.fidzii.Valuables;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static dev.fidzii.Valuables.MOD_ID;

public class AllItems {

    private AllItems() {}

    public static void registerItems() {
        Valuables.LOGGER.info("Registering items...");
    }

    private static <I extends Item> I registerItem(String path, I item) {
        return Registry.register(Registries.ITEM, new Identifier(MOD_ID, path), item);
    }


}
