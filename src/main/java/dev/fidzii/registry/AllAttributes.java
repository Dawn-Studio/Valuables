package dev.fidzii.registry;

import dev.fidzii.Valuables;
import dev.fidzii.entity.TravellingMerchantEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

public class AllAttributes {

    private AllAttributes() {}

    public static void registerAttributes() {
        Valuables.LOGGER.info("Registering attributes...");
        FabricDefaultAttributeRegistry.register(AllEntities.TRAVELLING_MERCHANT_ENTITY, TravellingMerchantEntity.createAttributes());
    }
}
