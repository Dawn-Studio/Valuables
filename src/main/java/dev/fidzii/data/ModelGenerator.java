package dev.fidzii.data;

import dev.fidzii.registry.AllItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModelGenerator extends FabricModelProvider {

    public ModelGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(AllItems.AMBER, Models.GENERATED);
        itemModelGenerator.register(AllItems.BLACK_OPAL, Models.GENERATED);
        itemModelGenerator.register(AllItems.PEARL, Models.GENERATED);
        itemModelGenerator.register(AllItems.MOONSTONE, Models.GENERATED);
        itemModelGenerator.register(AllItems.GOLDEN_RING, Models.GENERATED);
        itemModelGenerator.register(AllItems.GOLDEN_BRACELET, Models.GENERATED);
        itemModelGenerator.register(AllItems.GOLDEN_NECKLACE, Models.GENERATED);
        itemModelGenerator.register(AllItems.GOLDEN_EARRINGS, Models.GENERATED);
        itemModelGenerator.register(AllItems.SILVER_RING, Models.GENERATED);
        itemModelGenerator.register(AllItems.SILVER_BRACELET, Models.GENERATED);
        itemModelGenerator.register(AllItems.SILVER_NECKLACE, Models.GENERATED);
        itemModelGenerator.register(AllItems.SILVER_EARRINGS, Models.GENERATED);
    }
}
