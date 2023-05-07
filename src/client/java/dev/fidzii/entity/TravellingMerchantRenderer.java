package dev.fidzii.entity;

import net.minecraft.client.render.entity.EntityRendererFactory;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.DynamicGeoEntityRenderer;

public class TravellingMerchantRenderer extends DynamicGeoEntityRenderer<TravellingMerchantEntity> {
    public TravellingMerchantRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new TravellingMerchantModel());
    }
}
