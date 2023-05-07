package dev.fidzii.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;

public class ValuableItem extends Item {

    public ValuableItem(Settings settings) {
        super(settings);
    }

    public ValuableItem() {
        super(new FabricItemSettings().maxCount(1));
    }

}
