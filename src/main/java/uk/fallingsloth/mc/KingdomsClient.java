package uk.fallingsloth.mc;

import net.fabricmc.api.ClientModInitializer;
import uk.fallingsloth.mc.datagen.ModModelPredicateProvider;

public class KingdomsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModModelPredicateProvider.registerModModels();
    }
}
