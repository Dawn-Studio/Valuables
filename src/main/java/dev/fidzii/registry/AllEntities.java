package dev.fidzii.registry;

import dev.fidzii.Valuables;
import dev.fidzii.entity.TravellingMerchantEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static dev.fidzii.Valuables.MOD_ID;

public class AllEntities {

    public static final EntityType<TravellingMerchantEntity> TRAVELLING_MERCHANT_ENTITY =
     Registry.register(Registries.ENTITY_TYPE, new Identifier(MOD_ID, "travelling_merchant"),
         FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, TravellingMerchantEntity::new)
             .dimensions(EntityDimensions.fixed(0.6f, 1.8f)).build());

    private AllEntities() {}

    public static void registerEntities() {
        Valuables.LOGGER.info("Registering entities...");
    }
}
