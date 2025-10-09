package net.kaupenjoe.tutorialmod.item;

import net.kaupenjoe.tutorialmod.TutorialMod;
import net.kaupenjoe.tutorialmod.item.custom.*;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    //BASIC ITEMS
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    // ALIMENTOS CON DURACION PERSONALIZADA
    public static final RegistryObject<Item> KEBBAB = ITEMS.register("kebbab",
            () -> new CustomFoodItem(new Item.Properties().food(ModFoods.KEBBAB)));

    public static final RegistryObject<Item> DURUM = ITEMS.register("durum",
            () -> new CustomFoodItem(new Item.Properties().food(ModFoods.DURUM)));

    public static final RegistryObject<Item> RAW_MITHRIL = ITEMS.register("mithril",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MITHRIL_INGOT = ITEMS.register("mithril_ingot",
            () -> new Item(new Item.Properties()));

    //TOOLS
    public static final RegistryObject<Item> FIRE_SWORD = ITEMS.register("fire_sword",
            () -> new SwordItem(ModToolTiers.FIRE, 5, 2, new Item.Properties().rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> MITHRIL_SWORD = ITEMS.register("mithril_sword",
            () -> new SwordItem(ModToolTiers.MITHRIL, 3, 1.5f, new Item.Properties()));

    public static final RegistryObject<Item> MITHRIL_PICKAXE = ITEMS.register("mithril_pickaxe",
            () -> new PickaxeItem(ModToolTiers.MITHRIL, 1, 1, new Item.Properties()));

    public static final RegistryObject<Item> MITHRIL_AXE = ITEMS.register("mithril_axe",
            () -> new AxeItem(ModToolTiers.MITHRIL, 7, 0.4f, new Item.Properties()));

    public static final RegistryObject<Item> MITHRIL_SHOVEL = ITEMS.register("mithril_shovel",
            () -> new ShovelItem(ModToolTiers.MITHRIL, 1, 1, new Item.Properties()));

    public static final RegistryObject<Item> MITHRIL_HOE = ITEMS.register("mithril_hoe",
            () -> new HoeItem(ModToolTiers.MITHRIL, 1, 1, new Item.Properties()));

    //ARMORS
    public static final RegistryObject<Item> MITHRIL_HELMET = ITEMS.register("mithril_helmet",
            () -> new ModArmorItem(ModArmourMaterials.MITHRIL, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> MITHRIL_CHESTPLATE = ITEMS.register("mithril_chestplate",
            () -> new ModArmorItem(ModArmourMaterials.MITHRIL, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> MITHRIL_LEGGINGS = ITEMS.register("mithril_leggings",
            () -> new ModArmorItem(ModArmourMaterials.MITHRIL, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> MITHRIL_BOOTS = ITEMS.register("mithril_boots",
            () -> new ModArmorItem(ModArmourMaterials.MITHRIL, ArmorItem.Type.BOOTS, new Item.Properties()));

    //RINGS
    public static final RegistryObject<Item> GELIDA_RING = ITEMS.register("gelida_ring",
            () -> new ModRingItem(new Item.Properties().stacksTo(1), ModRingItem.RingType.GELIDA, false));

    public static final RegistryObject<Item> GOLD_GELIDA_RING = ITEMS.register("gold_gelida_ring",
            () -> new ModRingItem(new Item.Properties().stacksTo(1).rarity(Rarity.RARE), ModRingItem.RingType.GELIDA, true));

    public static final RegistryObject<Item> ANTIGUA_RING = ITEMS.register("antigua_ring",
            () -> new ModRingItem(new Item.Properties().stacksTo(1), ModRingItem.RingType.ANTIGUA, false));

    public static final RegistryObject<Item> GOLD_ANTIGUA_RING = ITEMS.register("gold_antigua_ring",
            () -> new ModRingItem(new Item.Properties().stacksTo(1).rarity(Rarity.RARE), ModRingItem.RingType.ANTIGUA, true));

    public static final RegistryObject<Item> MUSGOSA_RING = ITEMS.register("musgosa_ring",
            () -> new ModRingItem(new Item.Properties().stacksTo(1), ModRingItem.RingType.MUSGOSA, false));

    public static final RegistryObject<Item> GOLD_MUSGOSA_RING = ITEMS.register("gold_musgosa_ring",
            () -> new ModRingItem(new Item.Properties().stacksTo(1).rarity(Rarity.RARE), ModRingItem.RingType.MUSGOSA, true));

    public static final RegistryObject<Item> FUNGICA_RING = ITEMS.register("fungica_ring",
            () -> new ModRingItem(new Item.Properties().stacksTo(1), ModRingItem.RingType.FUNGICA, false));

    public static final RegistryObject<Item> GOLD_FUNGICA_RING = ITEMS.register("gold_fungica_ring",
            () -> new ModRingItem(new Item.Properties().stacksTo(1).rarity(Rarity.RARE), ModRingItem.RingType.FUNGICA, true));

    public static final RegistryObject<Item> CRISTAL_RING = ITEMS.register("cristal_ring",
            () -> new ModRingItem(new Item.Properties().stacksTo(1), ModRingItem.RingType.CRISTAL, false));

    public static final RegistryObject<Item> GOLD_CRISTAL_RING = ITEMS.register("gold_cristal_ring",
            () -> new ModRingItem(new Item.Properties().stacksTo(1).rarity(Rarity.RARE), ModRingItem.RingType.CRISTAL, true));

    public static final RegistryObject<Item> TRANSLUCIDA_RING = ITEMS.register("translucida_ring",
            () -> new ModRingItem(new Item.Properties().stacksTo(1), ModRingItem.RingType.TRANSLUCIDA, false));

    public static final RegistryObject<Item> GOLD_TRANSLUCIDA_RING = ITEMS.register("gold_translucida_ring",
            () -> new ModRingItem(new Item.Properties().stacksTo(1).rarity(Rarity.RARE), ModRingItem.RingType.TRANSLUCIDA, true));

    public static final RegistryObject<Item> CORAL_RING = ITEMS.register("coral_ring",
            () -> new ModRingItem(new Item.Properties().stacksTo(1), ModRingItem.RingType.CORAL, false));

    public static final RegistryObject<Item> GOLD_CORAL_RING = ITEMS.register("gold_coral_ring",
            () -> new ModRingItem(new Item.Properties().stacksTo(1).rarity(Rarity.RARE), ModRingItem.RingType.CORAL, true));

    public static final RegistryObject<Item> BRUTA_RING = ITEMS.register("bruta_ring",
            () -> new ModRingItem(new Item.Properties().stacksTo(1), ModRingItem.RingType.BRUTA, false));

    public static final RegistryObject<Item> GOLD_BRUTA_RING = ITEMS.register("gold_bruta_ring",
            () -> new ModRingItem(new Item.Properties().stacksTo(1).rarity(Rarity.RARE), ModRingItem.RingType.BRUTA, true));

    public static final RegistryObject<Item> DIVIDIDA_RING = ITEMS.register("dividida_ring",
            () -> new ModRingItem(new Item.Properties().stacksTo(1), ModRingItem.RingType.DIVIDIDA, false));

    public static final RegistryObject<Item> GOLD_DIVIDIDA_RING = ITEMS.register("gold_dividida_ring",
            () -> new ModRingItem(new Item.Properties().stacksTo(1).rarity(Rarity.RARE), ModRingItem.RingType.DIVIDIDA, true));

    public static final RegistryObject<Item> ALMAS_RING = ITEMS.register("almas_ring",
            () -> new ModRingItem(new Item.Properties().stacksTo(1), ModRingItem.RingType.ALMAS, false));

    public static final RegistryObject<Item> GOLD_ALMAS_RING = ITEMS.register("gold_almas_ring",
            () -> new ModRingItem(new Item.Properties().stacksTo(1).rarity(Rarity.RARE), ModRingItem.RingType.ALMAS, true));

    public static final RegistryObject<Item> PURPURA_RING = ITEMS.register("purpura_ring",
            () -> new ModRingItem(new Item.Properties().stacksTo(1), ModRingItem.RingType.PURPURA, false));

    public static final RegistryObject<Item> GOLD_PURPURA_RING = ITEMS.register("gold_purpura_ring",
            () -> new ModRingItem(new Item.Properties().stacksTo(1).rarity(Rarity.RARE), ModRingItem.RingType.PURPURA, true));

    //REGISTER METHOD
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
