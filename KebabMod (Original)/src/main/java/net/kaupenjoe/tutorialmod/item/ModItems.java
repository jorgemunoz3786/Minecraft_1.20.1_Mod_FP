package net.kaupenjoe.tutorialmod.item;

import net.kaupenjoe.tutorialmod.TutorialMod;
import net.kaupenjoe.tutorialmod.item.custom.ModArmorItem;
import net.kaupenjoe.tutorialmod.item.custom.ModFoods;
import net.kaupenjoe.tutorialmod.item.custom.ModToolTiers;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Abilities;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    //BASIC ITEMS
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> KEBBAB = ITEMS.register("kebbab",
            () -> new Item(new Item.Properties().food(ModFoods.KEBBAB)));

    public static final RegistryObject<Item> DURUM = ITEMS.register("durum",
            () -> new Item(new Item.Properties().food(ModFoods.DURUM)));

    public static final RegistryObject<Item> PLASTIC = ITEMS.register("plastic",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MITHRIL = ITEMS.register("mithril",
            () -> new Item(new Item.Properties()));

    //TOOLS
    public static final RegistryObject<Item> FIRE_SWORD = ITEMS.register("fire_sword",
            () -> new SwordItem( ModToolTiers.FIRE,5,2,new Item.Properties().rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> MITHRIL_SWORD = ITEMS.register("mithril_sword",
            () -> new SwordItem( ModToolTiers.MITHRIL,3,1.5f,new Item.Properties()));

    public static final RegistryObject<Item> MITHRIL_PICKAXE = ITEMS.register("mithril_pickaxe",
            () -> new PickaxeItem( ModToolTiers.MITHRIL,1,1,new Item.Properties()));

    public static final RegistryObject<Item> MITHRIL_AXE = ITEMS.register("mithril_axe",
            () -> new AxeItem( ModToolTiers.MITHRIL,7,0.4f, new Item.Properties()));

    public static final RegistryObject<Item> MITHRIL_SHOVEL = ITEMS.register("mithril_shovel",
            () -> new ShovelItem( ModToolTiers.MITHRIL,1,1,new Item.Properties()));

    public static final RegistryObject<Item> MITHRIL_HOE = ITEMS.register("mithril_hoe",
            () -> new HoeItem( ModToolTiers.MITHRIL,1,1, new Item.Properties()));

    //ARMORS
        //SUPER
    public static final RegistryObject<Item> SUPER = ITEMS.register("super",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SUPER_HELMET = ITEMS.register("super_helmet",
            () -> new ArmorItem( ModArmourMaterials.SUPER, ArmorItem.Type.HELMET,new Item.Properties()
                    .rarity(Rarity.EPIC)
                    .fireResistant().durability(10000)));

    public static final RegistryObject<Item> SUPER_CHESTPLATE = ITEMS.register("super_chestplate",
            () -> new ArmorItem( ModArmourMaterials.SUPER, ArmorItem.Type.CHESTPLATE,new Item.Properties()
                    .rarity(Rarity.EPIC)
                    .fireResistant().durability(10000)));

    public static final RegistryObject<Item> SUPER_LEGGINGS = ITEMS.register("super_leggings",
            () -> new ArmorItem( ModArmourMaterials.SUPER, ArmorItem.Type.LEGGINGS,new Item.Properties()
                    .rarity(Rarity.EPIC)
                    .fireResistant().durability(10000)));

    public static final RegistryObject<Item> SUPER_BOOTS = ITEMS.register("super_boots",
            () -> new ArmorItem( ModArmourMaterials.SUPER, ArmorItem.Type.BOOTS,new Item.Properties()
                    .rarity(Rarity.EPIC)
                    .fireResistant().durability(10000)));



    public static final RegistryObject<Item> MITHRIL_HELMET = ITEMS.register("mithril_helmet",
            () -> new ArmorItem( ModArmourMaterials.MITHRIL, ArmorItem.Type.HELMET,new Item.Properties()));

    public static final RegistryObject<Item> MITHRIL_CHESTPLATE = ITEMS.register("mithril_chestplate",
            () -> new ModArmorItem( ModArmourMaterials.MITHRIL, ArmorItem.Type.CHESTPLATE,new Item.Properties()));

    public static final RegistryObject<Item> MITHRIL_LEGGINGS = ITEMS.register("mithril_leggings",
            () -> new ArmorItem( ModArmourMaterials.MITHRIL, ArmorItem.Type.LEGGINGS,new Item.Properties()));

    public static final RegistryObject<Item> MITHRIL_BOOTS = ITEMS.register("mithril_boots",
            () -> new ArmorItem( ModArmourMaterials.MITHRIL, ArmorItem.Type.BOOTS,new Item.Properties()));

    public static final RegistryObject<Item> DILDO = ITEMS.register("dildo",
            () -> new ArmorItem(ModArmourMaterials.PLASTIC,ArmorItem.Type.LEGGINGS,new Item.Properties().rarity(Rarity.EPIC)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
