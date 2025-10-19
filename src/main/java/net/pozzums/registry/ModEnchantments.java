package net.pozzums.registry;

import com.mojang.serialization.MapCodec;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.effect.EnchantmentEntityEffect;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.pozzums.PozzumsEnchants;

public class ModEnchantments {
    private static final RegistryKey<Enchantment> of(String path) {
        Identifier id = Identifier.of(PozzumsEnchants.MOD_ID, path);
        return RegistryKey.of(RegistryKeys.ENCHANTMENT, id);
    }

    private static <T extends EnchantmentEntityEffect> MapCodec<T> register(String id, MapCodec<T> codec) {
        return Registry.register(Registries.ENCHANTMENT_ENTITY_EFFECT_TYPE, Identifier.of(PozzumsEnchants.MOD_ID, id), codec);
    }


    public static void register() {
        // No need to register the enchantment in code; it's data-driven
        System.out.println("Enchantment 'No Effect Leggings' is defined in data and does not require code registration.");
    }
}
