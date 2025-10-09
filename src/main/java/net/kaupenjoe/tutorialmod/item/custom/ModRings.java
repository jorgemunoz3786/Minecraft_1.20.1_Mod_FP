package net.kaupenjoe.tutorialmod.item.custom;

import net.kaupenjoe.tutorialmod.TutorialMod;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRings {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    // ─────────────────────────────────────────────
    // GEMAS / ANILLOS - HIERRO Y ORO
    // ─────────────────────────────────────────────

    // 🧊 Gema Gélida
    public static final RegistryObject<Item> ANILLO_GELIDO_HIERRO = ITEMS.register("anillo_gelido_hierro",
            () -> new ModRingItem(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON),
                    ModRingItem.RingType.GELIDA, false));
    public static final RegistryObject<Item> ANILLO_GELIDO_ORO = ITEMS.register("anillo_gelido_oro",
            () -> new ModRingItem(new Item.Properties().stacksTo(1).rarity(Rarity.RARE),
                    ModRingItem.RingType.GELIDA, true));

    // 🌲 Gema Antigua
    public static final RegistryObject<Item> ANILLO_ANTIGUO_HIERRO = ITEMS.register("anillo_antiguo_hierro",
            () -> new ModRingItem(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON),
                    ModRingItem.RingType.ANTIGUA, false));
    public static final RegistryObject<Item> ANILLO_ANTIGUO_ORO = ITEMS.register("anillo_antiguo_oro",
            () -> new ModRingItem(new Item.Properties().stacksTo(1).rarity(Rarity.RARE),
                    ModRingItem.RingType.ANTIGUA, true));

    // 🌿 Gema Musgosa
    public static final RegistryObject<Item> ANILLO_MUSGOSO_HIERRO = ITEMS.register("anillo_musgoso_hierro",
            () -> new ModRingItem(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON),
                    ModRingItem.RingType.MUSGOSA, false));
    public static final RegistryObject<Item> ANILLO_MUSGOSO_ORO = ITEMS.register("anillo_musgoso_oro",
            () -> new ModRingItem(new Item.Properties().stacksTo(1).rarity(Rarity.RARE),
                    ModRingItem.RingType.MUSGOSA, true));

    // 🍄 Gema Fúngica
    public static final RegistryObject<Item> ANILLO_FUNGICO_HIERRO = ITEMS.register("anillo_fungico_hierro",
            () -> new ModRingItem(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON),
                    ModRingItem.RingType.FUNGICA, false));
    public static final RegistryObject<Item> ANILLO_FUNGICO_ORO = ITEMS.register("anillo_fungico_oro",
            () -> new ModRingItem(new Item.Properties().stacksTo(1).rarity(Rarity.RARE),
                    ModRingItem.RingType.FUNGICA, true));

    // 🏜️ Gema Cristalizada
    public static final RegistryObject<Item> ANILLO_CRISTAL_HIERRO = ITEMS.register("anillo_cristal_hierro",
            () -> new ModRingItem(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON),
                    ModRingItem.RingType.CRISTAL, false));
    public static final RegistryObject<Item> ANILLO_CRISTAL_ORO = ITEMS.register("anillo_cristal_oro",
            () -> new ModRingItem(new Item.Properties().stacksTo(1).rarity(Rarity.RARE),
                    ModRingItem.RingType.CRISTAL, true));

    // ⛰️ Gema Translúcida
    public static final RegistryObject<Item> ANILLO_TRANSLUCIDO_HIERRO = ITEMS.register("anillo_translucido_hierro",
            () -> new ModRingItem(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON),
                    ModRingItem.RingType.TRANSLUCIDA, false));
    public static final RegistryObject<Item> ANILLO_TRANSLUCIDO_ORO = ITEMS.register("anillo_translucido_oro",
            () -> new ModRingItem(new Item.Properties().stacksTo(1).rarity(Rarity.RARE),
                    ModRingItem.RingType.TRANSLUCIDA, true));

    // 🪸 Gema Coral
    public static final RegistryObject<Item> ANILLO_CORAL_HIERRO = ITEMS.register("anillo_coral_hierro",
            () -> new ModRingItem(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON),
                    ModRingItem.RingType.CORAL, false));
    public static final RegistryObject<Item> ANILLO_CORAL_ORO = ITEMS.register("anillo_coral_oro",
            () -> new ModRingItem(new Item.Properties().stacksTo(1).rarity(Rarity.RARE),
                    ModRingItem.RingType.CORAL, true));

    // 🌋 Gema Bruta
    public static final RegistryObject<Item> ANILLO_BRUTO_HIERRO = ITEMS.register("anillo_bruto_hierro",
            () -> new ModRingItem(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON),
                    ModRingItem.RingType.BRUTA, false));
    public static final RegistryObject<Item> ANILLO_BRUTO_ORO = ITEMS.register("anillo_bruto_oro",
            () -> new ModRingItem(new Item.Properties().stacksTo(1).rarity(Rarity.RARE),
                    ModRingItem.RingType.BRUTA, true));

    // 💗 Gema Dividida
    public static final RegistryObject<Item> ANILLO_DIVIDIDO_HIERRO = ITEMS.register("anillo_dividido_hierro",
            () -> new ModRingItem(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON),
                    ModRingItem.RingType.DIVIDIDA, false));
    public static final RegistryObject<Item> ANILLO_DIVIDIDO_ORO = ITEMS.register("anillo_dividido_oro",
            () -> new ModRingItem(new Item.Properties().stacksTo(1).rarity(Rarity.RARE),
                    ModRingItem.RingType.DIVIDIDA, true));

    // 💀 Gema de Almas
    public static final RegistryObject<Item> ANILLO_ALMAS_HIERRO = ITEMS.register("anillo_almas_hierro",
            () -> new ModRingItem(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON),
                    ModRingItem.RingType.ALMAS, false));
    public static final RegistryObject<Item> ANILLO_ALMAS_ORO = ITEMS.register("anillo_almas_oro",
            () -> new ModRingItem(new Item.Properties().stacksTo(1).rarity(Rarity.RARE),
                    ModRingItem.RingType.ALMAS, true));

    // 🟣 Gema Púrpura
    public static final RegistryObject<Item> ANILLO_PURPURA_HIERRO = ITEMS.register("anillo_purpura_hierro",
            () -> new ModRingItem(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON),
                    ModRingItem.RingType.PURPURA, false));
    public static final RegistryObject<Item> ANILLO_PURPURA_ORO = ITEMS.register("anillo_purpura_oro",
            () -> new ModRingItem(new Item.Properties().stacksTo(1).rarity(Rarity.RARE),
                    ModRingItem.RingType.PURPURA, true));

    // ─────────────────────────────────────────────
    // REGISTRO
    // ─────────────────────────────────────────────
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
