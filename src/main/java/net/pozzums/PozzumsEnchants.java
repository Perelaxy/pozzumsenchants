package net.pozzums;

import net.fabricmc.api.ModInitializer;
import net.pozzums.registry.ModEnchantments;

public class PozzumsEnchants implements ModInitializer {
    public static final String MOD_ID = "pozzumsenchants";

    @Override
    public void onInitialize() {
        ModEnchantments.register();
    }
}