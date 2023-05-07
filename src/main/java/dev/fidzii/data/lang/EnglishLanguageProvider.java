package dev.fidzii.data.lang;

import dev.fidzii.registry.AllEntities;
import dev.fidzii.registry.AllItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class EnglishLanguageProvider extends FabricLanguageProvider {


    public EnglishLanguageProvider(FabricDataOutput dataOutput) {
        super(dataOutput, "en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(AllItems.MAIN_ITEM_GROUP, "Valuables");

        translationBuilder.add(AllItems.GOLDEN_BRACELET, "Golden Bracelet");
        translationBuilder.add(AllItems.GOLDEN_EARRINGS, "Golden Earrings");
        translationBuilder.add(AllItems.GOLDEN_RING, "Golden Ring");
        translationBuilder.add(AllItems.GOLDEN_NECKLACE, "Golden Necklace");

        translationBuilder.add(AllItems.SILVER_BRACELET, "Silver Bracelet");
        translationBuilder.add(AllItems.SILVER_EARRINGS, "Silver Earrings");
        translationBuilder.add(AllItems.SILVER_RING, "Silver Ring");
        translationBuilder.add(AllItems.SILVER_NECKLACE, "Silver Necklace");

        translationBuilder.add(AllItems.MOONSTONE, "Moonstone");
        translationBuilder.add(AllItems.BLACK_OPAL, "Black Opal");
        translationBuilder.add(AllItems.PEARL, "Pearl");
        translationBuilder.add(AllItems.AMBER, "Amber");

        translationBuilder.add(AllEntities.TRAVELLING_MERCHANT_ENTITY, "Travelling Merchant");
        translationBuilder.add(AllItems.TRAVELLING_MERCHANT_SPAWN_EGG, "Travelling Merchant Spawn Egg");
    }
}
