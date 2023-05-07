package dev.fidzii.registry;

import dev.fidzii.Valuables;
import dev.fidzii.item.ValuableItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.EggItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static dev.fidzii.Valuables.MOD_ID;

public class AllItems {

    public static final Item GOLDEN_RING = registerItem("golden_ring", new ValuableItem());
    public static final Item GOLDEN_NECKLACE = registerItem("golden_necklace", new ValuableItem());
    public static final Item GOLDEN_BRACELET = registerItem("golden_bracelet", new ValuableItem());
    public static final Item GOLDEN_EARRINGS = registerItem("golden_earrings", new ValuableItem());
    public static final Item SILVER_RING = registerItem("silver_ring", new ValuableItem());
    public static final Item SILVER_NECKLACE = registerItem("silver_necklace", new ValuableItem());
    public static final Item SILVER_BRACELET = registerItem("silver_bracelet", new ValuableItem());
    public static final Item SILVER_EARRINGS = registerItem("silver_earrings", new ValuableItem());
    public static final Item AMBER = registerItem("amber", new ValuableItem(new FabricItemSettings().maxCount(16)));
    public static final Item PEARL = registerItem("pearl", new ValuableItem(new FabricItemSettings().maxCount(16)));
    public static final Item BLACK_OPAL = registerItem("black_opal", new ValuableItem(new FabricItemSettings().maxCount(16)));
    public static final Item MOONSTONE = registerItem("moonstone", new ValuableItem(new FabricItemSettings().maxCount(16)));

    public static final Item TRAVELLING_MERCHANT_SPAWN_EGG = registerItem("travelling_merchant_spawn_egg", new SpawnEggItem(AllEntities.TRAVELLING_MERCHANT_ENTITY, 0x1c1a1a, 0xffce0a, new FabricItemSettings()));


    public static final ItemGroup MAIN_ITEM_GROUP = FabricItemGroup.builder(new Identifier(MOD_ID, "main_group"))
        .icon(AMBER::getDefaultStack)
        .entries((displayContext, entries) -> {
            entries.add(GOLDEN_BRACELET);
            entries.add(GOLDEN_NECKLACE);
            entries.add(GOLDEN_EARRINGS);
            entries.add(GOLDEN_RING);

            entries.add(SILVER_BRACELET);
            entries.add(SILVER_NECKLACE);
            entries.add(SILVER_EARRINGS);
            entries.add(SILVER_RING);

            entries.add(AMBER);
            entries.add(MOONSTONE);
            entries.add(BLACK_OPAL);
            entries.add(PEARL);

            entries.add(TRAVELLING_MERCHANT_SPAWN_EGG);
        }).build();

    private AllItems() {}

    public static void registerItems() {
        Valuables.LOGGER.info("Registering items...");
    }

    private static <I extends Item> I registerItem(String path, I item) {
        return Registry.register(Registries.ITEM, new Identifier(MOD_ID, path), item);
    }


}
