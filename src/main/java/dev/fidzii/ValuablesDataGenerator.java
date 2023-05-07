package dev.fidzii;

import dev.fidzii.data.ModelGenerator;
import dev.fidzii.data.lang.EnglishLanguageProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class ValuablesDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(ModelGenerator::new);
        pack.addProvider((output, registriesFuture) -> new EnglishLanguageProvider(output));
    }
}
