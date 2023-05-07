package dev.fidzii.registry;

import dev.fidzii.Valuables;
import dev.fidzii.entity.TravellingMerchantRenderer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class AllRenderers {

    protected AllRenderers() {}

    public static void registerAllRenderers() {
        Valuables.LOGGER.info("Registering all renderers...");
        EntityRendererRegistry.register(AllEntities.TRAVELLING_MERCHANT_ENTITY, TravellingMerchantRenderer::new);
    }

}
