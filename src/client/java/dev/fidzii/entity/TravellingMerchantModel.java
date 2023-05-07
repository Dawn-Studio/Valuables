package dev.fidzii.entity;

import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

import static dev.fidzii.Valuables.MOD_ID;

public class TravellingMerchantModel extends DefaultedEntityGeoModel<TravellingMerchantEntity> {
    public TravellingMerchantModel() {
        super(new Identifier(MOD_ID, "passive/travelling_merchant"), true);
    }
}
